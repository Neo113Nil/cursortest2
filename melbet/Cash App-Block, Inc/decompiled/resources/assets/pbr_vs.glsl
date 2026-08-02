precision mediump float;

uniform mat4 modelMatrix;
uniform mat4 normalMatrix;
uniform mat4 mvpMatrix;
uniform float normalScale;

attribute vec3 position;
attribute vec3 normal;
attribute vec3 tangent;
attribute vec3 bitangent;
attribute vec2 uv;

varying vec2 TexCoords;
varying vec3 WorldPos;
varying mat3 TBN;

void main()
{
    WorldPos    = vec3(modelMatrix * vec4(position, 1.0));
    TexCoords   = uv * normalScale;
    TBN         = mat3(
        normalize(vec3(normalMatrix * vec4(tangent, 0.0))),
        normalize(vec3(normalMatrix * vec4(bitangent, 0.0))),
        normalize(vec3(normalMatrix * vec4(normal, 0.0)))
    );
    gl_Position = mvpMatrix * vec4(position, 1.0);
}

