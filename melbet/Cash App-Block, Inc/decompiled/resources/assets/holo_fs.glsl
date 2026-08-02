precision mediump float;
// Based on https://learnopengl.com/PBR/Theory with holo effect additions
varying vec2 TexCoords;
varying vec3 WorldPos;
varying mat3 TBN;

uniform float roughness;
uniform float metallic;
uniform float ao;
uniform float roughnessScale;
uniform sampler2D holoBase;
uniform sampler2D holoReflect;

uniform vec3 lightPositions[5];
uniform vec3 lightColors[5];
uniform vec3 cameraPosition;
uniform vec3 forwardDirection;
uniform float holoOffsetScale;
uniform float holoOffsetX;
uniform float holoOffsetY;
uniform float vibrance;

const float PI = 3.14159265359;

// ----------------------------------------------------------------------------
// RGB to HSV conversion
vec3 rgb2hsv(vec3 c)
{
  vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
  vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));
  vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));

  float d = q.x - min(q.w, q.y);
  float e = 1.0e-10;
  return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);
}

// ----------------------------------------------------------------------------
// HSV to RGB conversion
vec3 hsv2rgb(vec3 c)
{
  vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);
  vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);
  return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);
}

// ----------------------------------------------------------------------------
// sRGB to Linear conversion
vec3 sRGBToLinear(vec3 color)
{
  vec3 a = color / 12.92;
  vec3 b = pow((color + 0.055) / 1.055, vec3(2.4));
  vec3 c = step(vec3(0.04045), color);
  return mix(a, b, c);
}

vec3 getNormalFromMap()
{
    // Use a simple normal pointing up since we're not using a normal map
    return normalize(TBN * vec3(0.0, 0.0, 1.0));
}

//https://github.com/google/filament/blob/b62991d967dcabeb78baf896d26955bd5dc05ebb/shaders/src/brdf.fs#L54
float DistributionGGX(vec3 N, vec3 H, float roughness)
{
    float NoH = dot(N, H);
    vec3 NxH = cross(N, H);
    float oneMinusNoHSquared = dot(NxH, NxH);

    float a = NoH * roughness;
    float k = roughness / (oneMinusNoHSquared + a * a);
    return k * k * (1.0 / PI);
}

// ----------------------------------------------------------------------------
float GeometrySchlickGGX(float NdotV, float roughness)
{
    float r = (roughness + 1.0);
    float k = (r*r) / 8.0;

    float nom   = NdotV;
    float denom = NdotV * (1.0 - k) + k;

    return nom / denom;
}

// ----------------------------------------------------------------------------
float GeometrySmith(vec3 N, vec3 V, vec3 L, float roughness)
{
    float NdotV = max(dot(N, V), 0.0);
    float NdotL = max(dot(N, L), 0.0);
    float ggx2 = GeometrySchlickGGX(NdotV, roughness);
    float ggx1 = GeometrySchlickGGX(NdotL, roughness);

    return ggx1 * ggx2;
}

// ----------------------------------------------------------------------------
vec3 fresnelSchlick(float cosTheta, vec3 F0)
{
    return F0 + (1.0 - F0) * pow(1.0 - cosTheta, 5.0);
}

// ----------------------------------------------------------------------------
vec2 EnvMapUV(vec3 R)
{
    // make sure R is normalized:
    R = normalize(R);

    // longitude  = φ = atan2(z, x)          ∈ [ -π .. +π ]
    // latitude   = θ = asin( y )            ∈ [ -π/2 .. +π/2 ]
    float phi   = atan(R.z, R.x);
    float theta = asin(R.y);

    // map φ from [ -π .. +π ] to u in [ 0 .. 1 ]
    float u = (phi   + PI)  / (2.0 * PI);

    // map θ from [ -π/2 .. +π/2 ] to v in [ 0 .. 1 ]
    float v = (theta + PI*0.5) / PI;

    return vec2(u, v);
}

// ----------------------------------------------------------------------------
vec4 blendAlpha(vec4 dst, vec4 src) {
    float outA = src.a + dst.a * (1.0 - src.a);
    if (outA < 1e-6) return vec4(0.0);
    vec3 outRGB = (src.rgb * src.a + dst.rgb * dst.a * (1.0 - src.a)) / outA;
    return vec4(outRGB, outA);
}

// ----------------------------------------------------------------------------
void main()
{
    vec3 N = getNormalFromMap();
    vec3 V = normalize(cameraPosition - WorldPos);
    vec3 normalizedForwardDirection = normalize(forwardDirection);

    // Transform forward direction from world space to tangent space using TBN
    vec3 tangentSpaceForwardDirection = normalize(TBN * normalizedForwardDirection);

    // Use uniform values directly
    float finalRoughness = roughness * roughnessScale;
    // Sample holo textures based on tangent space forward direction
    vec2 uvGradientOffset = ((tangentSpaceForwardDirection.xy + 1.0) * 0.5);
    float samplePoint = uvGradientOffset.x;
    if (abs(tangentSpaceForwardDirection.x) < abs(tangentSpaceForwardDirection.y)) {
        samplePoint = uvGradientOffset.y;
    }

    vec3 baseSample = texture2D(holoBase, vec2(samplePoint, 0.0)).rgb;

    // Calculate reflection direction using UV position to create parallax offset
    vec2 rOffset = (TexCoords - vec2(0.5, 0.5));

    // Account for aspect ratio (credit card is ~1.586:1)
    rOffset.x = rOffset.x * 1.586;
    rOffset *= holoOffsetScale;

    // Convert to 3D direction: treat card as XY plane facing +Z
    // Add the tangent space normal to perturb based on surface geometry
    vec3 R = normalize(vec3(rOffset.x, rOffset.y, 0.0) + tangentSpaceForwardDirection);

    vec2 environmentUv = EnvMapUV(R);
    vec4 environment = texture2D(holoReflect, environmentUv + vec2((holoOffsetX * 1.56), holoOffsetY));
    environment.rgb = environment.rgb;

    float finalMetallic = mix(metallic, 1.0, environment.a);
    // Blend holo effect to create final color
    vec3 baseColor = blendAlpha(
      vec4(sRGBToLinear(baseSample), 1.0),
      vec4(environment.rgb, environment.a * 0.8)
    ).rgb;

    // Apply color grading to base holo color before lighting
    vec3 hsv = rgb2hsv(baseColor);

    // Apply vibrance (affects less saturated colors more)
    float mask = 1.0 - hsv.y;
    hsv.y = mix(hsv.y, hsv.y * vibrance, mask * mask);

    // Convert back to RGB
    baseColor = hsv2rgb(hsv);

    // calculate reflectance at normal incidence; if dia-electric (like plastic) use F0
    // of 0.04 and if it's a metal, use the albedo color as F0 (metallic workflow)
    vec3 F0 = vec3(0.04);
    F0 = mix(F0, baseColor, finalMetallic);

    // reflectance equation
    vec3 directLighting = vec3(0.0);
    for(int i = 0; i < 5; ++i)
    {
        vec3 lightPosition = lightPositions[i];
        vec3 lightColor = lightColors[i];

        // calculate per-light radiance
        vec3 L = normalize(lightPosition - WorldPos);
        vec3 H = normalize(V + L);
        float distance = length(lightPosition - WorldPos);
        float attenuation = 1.0 / (1.0 + distance * distance * 0.1); // Softer attenuation
        vec3 radiance = lightColor * attenuation;

        // Cook-Torrance BRDF
        float NDF = DistributionGGX(N, H, finalRoughness);
        float G   = GeometrySmith(N, V, L, finalRoughness);
        vec3 F    = fresnelSchlick(max(dot(H, V), 0.0), F0);

        vec3 nominator    = NDF * G * F;
        float denominator = max(0.0001, 4.0 * max(dot(N, V), 0.0) * max(dot(N, L), 0.0)); // 0.001 to prevent divide by zero.
        vec3 specular = nominator / denominator;

        // kS is equal to Fresnel
        vec3 kS = F;
        // for energy conservation, the diffuse and specular light can't
        // be above 1.0 (unless the surface emits light); to preserve this
        // relationship the diffuse component (kD) should equal 1.0 - kS.
        vec3 kD = vec3(1.0) - kS;
        // multiply kD by the inverse metalness such that only non-metals
        // have diffuse lighting, or a linear blend if partly metal (pure metals
        // have no diffuse light).
        kD *= 1.0 - finalMetallic;

        // scale light by NdotL
        float NdotL = max(dot(N, L), 0.0);

        vec3 diffuse = (kD * baseColor / PI);
        vec3 diffuseSpecular = max(diffuse, diffuse + specular);

        // add to outgoing radiance Lo
        // note that we already multiplied the BRDF by the Fresnel (kS) so we won't multiply by kS again
        directLighting += diffuseSpecular * radiance * NdotL;
    }

    vec3 ambient = baseColor * ao; // Reasonable ambient lighting
    vec3 color = ambient + directLighting;

    // Clamp to prevent oversaturation while preserving detail
    color = clamp(color, 0.0, 1.0);

    gl_FragColor = vec4(color, 1.0);
} 
