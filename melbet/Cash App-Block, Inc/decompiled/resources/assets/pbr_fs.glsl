precision mediump float;
// Based on https://learnopengl.com/PBR/Theory
varying vec2 TexCoords;
varying vec3 WorldPos;
varying mat3 TBN;

uniform sampler2D albedoMap;
uniform sampler2D normalMap;
uniform float normalScale;
uniform sampler2D metalRoughnessAoMap;
uniform float roughnessScale;

uniform vec3 lightPositions[5];
uniform vec3 lightColors[5];
uniform float exposure;
uniform vec3 cameraPosition;

const float PI = 3.14159265359;
vec3 getNormalFromMap()
{
    vec3 norm = texture2D(normalMap, TexCoords).xyz;
    vec3 tangentNormal = norm * 2.0 - 1.0;

    return normalize(TBN * tangentNormal);
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
void main()
{
    vec3 albedo             = pow(texture2D(albedoMap, TexCoords / normalScale).rgb, vec3(exposure));
    vec3 metalRoughnessAo   = texture2D(metalRoughnessAoMap, TexCoords).rgb;
    float metallic          = metalRoughnessAo.r;
    float roughness         = metalRoughnessAo.g * roughnessScale;
    float ao                = metalRoughnessAo.b;

    vec3 N = getNormalFromMap();
    vec3 V = normalize(cameraPosition - WorldPos);

    // calculate reflectance at normal incidence; if dia-electric (like plastic) use F0
    // of 0.04 and if it's a metal, use the albedo color as F0 (metallic workflow)
    vec3 F0 = vec3(0.04);
    F0 = mix(F0, albedo, metallic);

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
        float attenuation = (1.0 / (distance * distance));
        vec3 radiance = lightColor * attenuation;

        // Cook-Torrance BRDF
        float NDF = DistributionGGX(N, H, roughness);
        float G   = GeometrySmith(N, V, L, roughness);
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
        kD *= 1.0 - metallic;

        // scale light by NdotL
        float NdotL = max(dot(N, L), 0.0);

        vec3 diffuse = (kD * albedo / PI);
        vec3 diffuseSpecular = max(diffuse, diffuse + specular);

        // add to outgoing radiance Lo
        // note that we already multiplied the BRDF by the Fresnel (kS) so we won't multiply by kS again
        directLighting += diffuseSpecular * radiance * NdotL;
    }

    vec3 ambient = vec3(0.03) * albedo * ao;

    vec3 color = ambient + directLighting;

    // HDR tonemapping
    color = color / (color + vec3(1.0));
    // gamma correct
    color = pow(color, vec3(1.0/exposure));

    gl_FragColor = vec4(color, 1.0);
}
