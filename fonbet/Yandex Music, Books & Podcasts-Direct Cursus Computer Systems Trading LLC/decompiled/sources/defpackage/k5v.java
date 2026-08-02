package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.yandex.music.shared.wave.shader.api.ShaderCompilationException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes4.dex */
public final class k5v implements GLSurfaceView.Renderer {
    public final p4r a;
    public volatile boolean b;
    public volatile jhs c;
    public long f;
    public boolean i;
    public final FloatBuffer d = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f});
    public long e = System.currentTimeMillis();
    public float[] g = {0.0f, 0.0f, 0.0f};
    public int h = -1;

    public k5v(p4r p4rVar) {
        this.a = p4rVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        jhs jhsVar;
        if (!this.b || this.i) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.e;
        long j2 = this.f;
        long j3 = j - j2;
        if (j2 > 0 && j3 > 0 && (jhsVar = this.c) != null) {
            jhsVar.b((int) j3);
        }
        this.f = currentTimeMillis - this.e;
        p4r p4rVar = this.a;
        ktp ktpVar = p4rVar.k;
        long j4 = p4rVar.l;
        float f = ktpVar.a;
        float f2 = p4rVar.k.b;
        float f3 = p4rVar.m;
        if (f != f2) {
            f2 = wxf.C(f, f2, p4rVar.c0.getInterpolation(j4 / f3));
        }
        ktpVar.c = f2;
        long j5 = p4rVar.l + j3;
        long j6 = p4rVar.m;
        if (j5 > j6) {
            j5 = j6;
        }
        p4rVar.l = j5;
        float f4 = ((j3 * p4rVar.k.c) / 1000.0f) + p4rVar.b0;
        p4rVar.b0 = f4;
        GLES20.glUniform1f(p4rVar.D, f4);
        ktp ktpVar2 = p4rVar.h;
        long j7 = p4rVar.o;
        float f5 = ktpVar2.a;
        float f6 = p4rVar.h.b;
        if (f5 != f6) {
            f6 = wxf.C(f5, f6, p4rVar.c0.getInterpolation(j7 / 100.0f));
        }
        ktpVar2.c = f6;
        ktp ktpVar3 = p4rVar.i;
        long j8 = p4rVar.o;
        float f7 = ktpVar3.a;
        float f8 = p4rVar.i.b;
        if (f7 != f8) {
            f8 = wxf.C(f7, f8, p4rVar.c0.getInterpolation(j8 / 100.0f));
        }
        ktpVar3.c = f8;
        ktp ktpVar4 = p4rVar.j;
        long j9 = p4rVar.o;
        float f9 = ktpVar4.a;
        float f10 = p4rVar.j.b;
        if (f9 != f10) {
            f10 = wxf.C(f9, f10, p4rVar.c0.getInterpolation(j9 / 100.0f));
        }
        ktpVar4.c = f10;
        long j10 = p4rVar.o + j3;
        if (j10 > 100) {
            j10 = 100;
        }
        p4rVar.o = j10;
        p4rVar.g[0] = p4rVar.h.c;
        p4rVar.g[1] = p4rVar.i.c;
        p4rVar.g[2] = p4rVar.j.c;
        GLES20.glUniform1fv(p4rVar.K, 3, p4rVar.g, 0);
        GLES20.glClear(16384);
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 0, (Buffer) this.d);
        GLES20.glEnableVertexAttribArray(this.h);
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        ssg.a(3, null, f1d.e(i, i2, "onSurfaceChanged, size: ", " x "), null);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUniform2f(this.a.G, i, i2);
        v3g.O("onSurfaceChanged");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.e = System.currentTimeMillis();
        this.f = 0L;
        this.i = false;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        v3g.O("glBlendFunc");
        float[] fArr = this.g;
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
        try {
            int N = v3g.N(35633, "\n        precision highp float;\n        attribute vec4 a_position;\n        void main() {\n            gl_Position = a_position;\n        }    \n        ");
            try {
                int N2 = v3g.N(35632, this.a.b ? "\n    precision highp float;\n\n    uniform float vAlpha;\n    uniform float vBlobsAlpha;\n\n    uniform vec2 vScreenSize;\n    uniform float vSceneOffsetY;\n    uniform float vSceneOffsetX;\n    uniform float vSceneScale;\n    uniform float vTime;\n    uniform vec3 vRotation[3];\n    uniform float vAudio[3];\n\n    uniform vec3 vColorBackground;\n    uniform vec3 vColorBackgroundGradient;\n    uniform vec3 vColor[6];\n\n    uniform float vReact[3];\n    uniform vec2 vInteractionPoint;\n    uniform float vInteraction;\n    uniform float vGradientHorizontal;\n\n    //uniform int vPassCount; // Performance impact\n\n    // -----------------------------------------\n\n    #define CIRCLE_WIDTH_BASE 0.8\n    #define CIRCLE_WIDTH_STEP 0.2\n\n    #define SPARK_STRENGTH_BASE 1.0\n    #define SPARK_STRENGTH_STEP 0.3\n\n    #define CIRCLE_RADIUS_BASE 0.95\n    #define CIRCLE_RADIUS_STEP 0.15\n\n    #define CIRCLE_OFFSET_BASE 0.0\n    #define CIRCLE_OFFSET_STEP 1.57\n\n    vec4 permute(vec4 x){return mod(((x*34.0)+1.0)*x, 289.0);}\n    vec4 taylorInvSqrt(vec4 r){return 1.79284291400159 - 0.85373472095314 * r;}\n\n    float snoise3(vec3 v) {\n      const vec2 C = vec2(0.1666667, 0.3333333); // vec2(1.0/6.0, 1.0/3.0)\n      const vec4 D = vec4(0.0, 0.5, 1.0, 2.0);\n\n      // First corner\n      vec3 i = floor(v + dot(v, C.yyy));\n      vec3 x0 = v - i + dot(i, C.xxx);\n\n      // Other corners\n      vec3 g = step(x0.yzx, x0.xyz);\n      vec3 l = 1.0 - g;\n      vec3 i1 = min(g.xyz, l.zxy);\n      vec3 i2 = max(g.xyz, l.zxy);\n\n      // x0 = x0 - 0. + 0.0 * C\n      vec3 x1 = x0 - i1 + 1.0 * C.xxx;\n      vec3 x2 = x0 - i2 + 2.0 * C.xxx;\n      vec3 x3 = x0 - 1. + 3.0 * C.xxx;\n\n      // Permutations\n      i = mod(i, 289.0);\n      vec4 p = permute( permute( permute(\n                 i.z + vec4(0.0, i1.z, i2.z, 1.0 ))\n               + i.y + vec4(0.0, i1.y, i2.y, 1.0 ))\n               + i.x + vec4(0.0, i1.x, i2.x, 1.0 ));\n\n      // Gradients ( N*N points uniformly over a square, mapped onto an octahedron.)\n      // The ring size 17*17 = 289 is close to a multiple of 49 (49*6 = 294)\n      float n_ = 0.142857142857; // 1.0/7.0\n      vec3 ns = n_ * D.wyz - D.xzx;\n\n      vec4 j = p - 49.0 * floor(p * ns.z *ns.z); //  mod(p,N*N), N=7\n\n      vec4 x_ = floor(j * ns.z);\n      vec4 y_ = floor(j - 7.0 * x_); // mod(j,N)\n\n      vec4 x = x_ *ns.x + ns.yyyy;\n      vec4 y = y_ *ns.x + ns.yyyy;\n      vec4 h = 1.0 - abs(x) - abs(y);\n\n      vec4 b0 = vec4( x.xy, y.xy );\n      vec4 b1 = vec4( x.zw, y.zw );\n\n      vec4 s0 = floor(b0)*2.0 + 1.0;\n      vec4 s1 = floor(b1)*2.0 + 1.0;\n      vec4 sh = -step(h, vec4(0.0));\n\n      vec4 a0 = b0.xzyw + s0.xzyw*sh.xxyy;\n      vec4 a1 = b1.xzyw + s1.xzyw*sh.zzww;\n\n      vec3 p0 = vec3(a0.xy,h.x);\n      vec3 p1 = vec3(a0.zw,h.y);\n      vec3 p2 = vec3(a1.xy,h.z);\n      vec3 p3 = vec3(a1.zw,h.w);\n\n      //Normalise gradients\n      vec4 norm = taylorInvSqrt(vec4(dot(p0,p0), dot(p1,p1), dot(p2, p2), dot(p3,p3)));\n      p0 *= norm.x;\n      p1 *= norm.y;\n      p2 *= norm.z;\n      p3 *= norm.w;\n\n      // Mix final noise value\n      vec4 m = max(0.6 - vec4(dot(x0,x0), dot(x1,x1), dot(x2,x2), dot(x3,x3)), 0.0);\n      m = m * m;\n      return 42.0 * dot(m*m, vec4(dot(p0,x0), dot(p1,x1), dot(p2,x2), dot(p3,x3)));\n    }\n\n    float tri(in float x){return abs(fract(x)-.5);}\n    vec3 tri3(in vec3 p){return vec3( tri(p.z+tri(p.y*20.)), tri(p.z+tri(p.x*1.)), tri(p.y+tri(p.x*1.)));}\n\n    float triNoise3D(in vec3 p, in float spd)\n    {\n      float z=0.4;\n      float rz = 0.1;\n      vec3 bp = p;\n      for (float i=0.; i<=4.; i++ )\n      {\n        vec3 dg = tri3(bp*0.01); // Increase the scale factor to make noise less frequent\n        p += (dg+vTime*.1*spd);\n\n        bp *= 4.; // Increase the scale factor\n        z *= 0.9;\n        p *= 1.6; // Increase the scale factor\n\n        rz+= (tri(p.z+tri(0.6*p.x+0.1*tri(p.y))))/z;\n      }\n      return smoothstep(0.0, 8., rz + sin(rz + sin(z) * 2.8) * 2.2);\n    }\n\n    // Easing gradient matching figma-easing-gradients plugin.\n    float easingGradientBrightness(float p, float p1x, float p1y, float p2x, float p2y) {\n      p = clamp(p, 0.0, 1.0);\n      float prevX = 0.0, prevY = 0.0;\n      for (int i = 1; i <= 5; i++) {\n        float t = float(i) / 5.0;\n        float omt = 1.0 - t;\n        float omt2 = omt * omt;\n        float t2 = t * t;\n        float curX = 3.0 * omt2 * t * p1x + 3.0 * omt * t2 * p2x + t2 * t;\n        float curY = 3.0 * omt2 * t * p1y + 3.0 * omt * t2 * p2y + t2 * t;\n        if (p <= curX || i == 5) {\n          float f = (curX - prevX) > 0.001 ? clamp((p - prevX) / (curX - prevX), 0.0, 1.0) : 0.0;\n          return 1.0 - mix(prevY, curY, f);\n        }\n        prevX = curX;\n        prevY = curY;\n      }\n      return 0.0;\n    }\n\n    vec2 rotate(vec2 p, float a) {\n      float s = sin(a);\n      float c = cos(a);\n      return vec2(p.x * c - p.y * s, p.x * s + p.y * c);\n    }\n\n    float light(float intensity, float attenuation, float dist) {\n      return intensity / (1.0 + dist + dist * attenuation);\n    }\n\n    vec4 makeNoiseBlob2(vec2 uv, vec3 color1, vec3 color2, float strength, float offset) {\n      float len = length(uv);\n      float v0, v1, cl;\n      float r0, d0, n0;\n      float r, d;\n\n      n0 = snoise3( vec3(uv * 1.2 + offset, vTime * 0.5 + offset) ) * 0.5 + 0.5;\n      r0 = mix(0.0, 1.0, n0);\n      d0 = distance(uv, r0 / len * uv);\n      v0 = smoothstep(r0 + 0.1 + (sin(vTime + offset) + 1.0), r0, len);\n\n      v1 = light(0.15 * (1.0 + 1.5 * (-sin(vTime * 2. + offset * 0.5) * 0.5)) + 0.3 * strength, 10.0 , d0);\n\n      vec3 col = mix(color1, color2, uv.y * 2.);\n      col = col + v1;\n      col.rgb = clamp(col.rgb, 0.0, 1.0);\n      return vec4(col, v0);\n    }\n\n    vec4 makeBlob(vec2 uv,\n                  float blob,\n                  vec3 color1,\n                  vec3 color2,\n                  float width,\n                  float baseReaction,\n                  float likeReaction,\n                  float audioStrength,\n                  float offset,\n                  vec2 noiseOffset) {\n      float len = length(uv);\n\n      float outerRadius = blob + width * 0.5 + baseReaction * (1.0 + max(likeReaction, audioStrength * 0.6) * 50. * baseReaction);\n\n      float interactionCircle = smoothstep(0.5, 0.0, abs(distance(vInteractionPoint, uv))) * vInteraction;\n      float strength = max(likeReaction, audioStrength) + 10. * interactionCircle;\n\n      vec4 noise = makeNoiseBlob2(uv * (1.0 - likeReaction * 0.5) + noiseOffset, color1, color2, strength, offset);\n      noise.a = mix(0.0, noise.a, smoothstep(outerRadius, 0.5, len));\n      noise.rgb += 0.6 * likeReaction * (1.0 - smoothstep(0.2, outerRadius * 0.8, len));\n\n      return noise;\n    }\n\n    void main() {\n      vec2 uv = gl_FragCoord.xy / vScreenSize.xy;\n      float gradientCoord = mix(uv.y, 1.0 - uv.x, vGradientHorizontal);\n      // endPoint y=0.75: line position 0=top, 1=75% from top; below is black.\n      const float gradientEndFromTop = 0.75;\n      float gradientLinePos = clamp((1.0 - gradientCoord) / gradientEndFromTop, 0.0, 1.0);\n      float easedCoord = easingGradientBrightness(gradientLinePos, 0.76, 0.82, 0.35, 0.76);\n      vec3 color = vColorBackgroundGradient * easedCoord;\n      uv.y += vSceneOffsetY;\n      uv.x += vSceneOffsetX;\n\n      uv = uv * 2.0 - 1.0;\n      uv.y *= vScreenSize.y / min(vScreenSize.x, vScreenSize.y);\n      uv.x *= vScreenSize.x / min(vScreenSize.x, vScreenSize.y);\n\n      uv *= 1.0 / vSceneScale;\n\n      vec2 ruv = uv * 2.0;\n      float pr = length(ruv);\n      float pa = atan(ruv.y, ruv.x);\n\n      float idx = (pa/3.1415) / 2.0;   // 0 to 1\n\n      vec2 ruv1 = rotate(uv * 2.0, 3.1415);\n      float pa1 = atan(ruv1.y, ruv1.x);\n      float idx1 = (pa1/3.1415) / 2.0;   // 0 to 1\n      float idx21 = (pa1/3.1415 + 1.0) / 2.0 * 3.1415; // 0 to PI\n\n      float spark = triNoise3D(vec3(idx, 0.0, 0.0), 0.1);\n      spark = mix(spark, triNoise3D(vec3(idx1, 0.0, idx1), 0.1), smoothstep(0.9, 1.0, sin(idx21)));\n      spark = spark * 0.2 + pow(spark, 10.);\n      spark = smoothstep(0.0, spark, 0.3) * spark;\n\n      vec4 blobColor;\n      float floatIndex;\n      float radius;\n\n      float n0 = snoise3(vec3(uv * 1.2 * 1.2, vTime * 0.5));\n\n      // Can't use for-loop condition with uniform vPassCount because of dynamic indexing restrictions on old devices (MUSICANDROID-29071)\n      \n      for (int i = 0; i < 3; i++) {\n        floatIndex = float(i);\n        radius = CIRCLE_RADIUS_BASE - CIRCLE_RADIUS_STEP * floatIndex;\n        blobColor = makeBlob(uv,\n                             mix(radius, radius + 0.3, n0),\n                             vColor[i],\n                             vColor[i+3],\n                             CIRCLE_WIDTH_BASE - CIRCLE_WIDTH_STEP * floatIndex,\n                             (SPARK_STRENGTH_BASE - SPARK_STRENGTH_STEP * floatIndex) * spark,\n                             vReact[i],\n                             vAudio[i],\n                             CIRCLE_OFFSET_BASE + CIRCLE_OFFSET_STEP * floatIndex,\n                             rotate(vRotation[i].xy, vTime * vRotation[i].z));\n        color = mix(color, blobColor.rgb, (blobColor.a * vBlobsAlpha));\n      }\n\n      gl_FragColor = vec4(color, 1.0) * vAlpha;\n    }\n" : "\n    precision highp float;\n\n    uniform float vAlpha;\n\n    uniform vec2 vScreenSize;\n    uniform float vSceneOffsetY;\n    uniform float vSceneOffsetX;\n    uniform float vSceneScale;\n    uniform float vTime;\n    uniform vec3 vRotation[3];\n    uniform float vAudio[3];\n\n    uniform vec3 vColorBackground;\n    uniform vec3 vColor[6];\n\n    uniform float vReact[3];\n    uniform vec2 vInteractionPoint;\n    uniform float vInteraction;\n\n    //uniform int vPassCount; // Performance impact\n\n    // -----------------------------------------\n\n    #define CIRCLE_WIDTH_BASE 0.8\n    #define CIRCLE_WIDTH_STEP 0.2\n    \n    #define SPARK_STRENGTH_BASE 1.0\n    #define SPARK_STRENGTH_STEP 0.3\n    \n    #define CIRCLE_RADIUS_BASE 0.95\n    #define CIRCLE_RADIUS_STEP 0.15\n    \n    #define CIRCLE_OFFSET_BASE 0.0\n    #define CIRCLE_OFFSET_STEP 1.57\n    \n    vec4 permute(vec4 x){return mod(((x*34.0)+1.0)*x, 289.0);}\n    vec4 taylorInvSqrt(vec4 r){return 1.79284291400159 - 0.85373472095314 * r;}\n    \n    float snoise3(vec3 v) { \n      const vec2 C = vec2(0.1666667, 0.3333333); // vec2(1.0/6.0, 1.0/3.0)\n      const vec4 D = vec4(0.0, 0.5, 1.0, 2.0);\n    \n      // First corner\n      vec3 i = floor(v + dot(v, C.yyy));\n      vec3 x0 = v - i + dot(i, C.xxx);\n    \n      // Other corners\n      vec3 g = step(x0.yzx, x0.xyz);\n      vec3 l = 1.0 - g;\n      vec3 i1 = min(g.xyz, l.zxy);\n      vec3 i2 = max(g.xyz, l.zxy);\n    \n      // x0 = x0 - 0. + 0.0 * C \n      vec3 x1 = x0 - i1 + 1.0 * C.xxx;\n      vec3 x2 = x0 - i2 + 2.0 * C.xxx;\n      vec3 x3 = x0 - 1. + 3.0 * C.xxx;\n    \n      // Permutations\n      i = mod(i, 289.0); \n      vec4 p = permute( permute( permute( \n                 i.z + vec4(0.0, i1.z, i2.z, 1.0 ))\n               + i.y + vec4(0.0, i1.y, i2.y, 1.0 )) \n               + i.x + vec4(0.0, i1.x, i2.x, 1.0 ));\n    \n      // Gradients ( N*N points uniformly over a square, mapped onto an octahedron.)\n      // The ring size 17*17 = 289 is close to a multiple of 49 (49*6 = 294)\n      float n_ = 0.142857142857; // 1.0/7.0\n      vec3 ns = n_ * D.wyz - D.xzx;\n    \n      vec4 j = p - 49.0 * floor(p * ns.z *ns.z); //  mod(p,N*N), N=7\n    \n      vec4 x_ = floor(j * ns.z);\n      vec4 y_ = floor(j - 7.0 * x_); // mod(j,N)\n    \n      vec4 x = x_ *ns.x + ns.yyyy;\n      vec4 y = y_ *ns.x + ns.yyyy;\n      vec4 h = 1.0 - abs(x) - abs(y);\n    \n      vec4 b0 = vec4( x.xy, y.xy );\n      vec4 b1 = vec4( x.zw, y.zw );\n    \n      vec4 s0 = floor(b0)*2.0 + 1.0;\n      vec4 s1 = floor(b1)*2.0 + 1.0;\n      vec4 sh = -step(h, vec4(0.0));\n    \n      vec4 a0 = b0.xzyw + s0.xzyw*sh.xxyy;\n      vec4 a1 = b1.xzyw + s1.xzyw*sh.zzww;\n    \n      vec3 p0 = vec3(a0.xy,h.x);\n      vec3 p1 = vec3(a0.zw,h.y);\n      vec3 p2 = vec3(a1.xy,h.z);\n      vec3 p3 = vec3(a1.zw,h.w);\n    \n      //Normalise gradients\n      vec4 norm = taylorInvSqrt(vec4(dot(p0,p0), dot(p1,p1), dot(p2, p2), dot(p3,p3)));\n      p0 *= norm.x;\n      p1 *= norm.y;\n      p2 *= norm.z;\n      p3 *= norm.w;\n    \n      // Mix final noise value\n      vec4 m = max(0.6 - vec4(dot(x0,x0), dot(x1,x1), dot(x2,x2), dot(x3,x3)), 0.0);\n      m = m * m;\n      return 42.0 * dot(m*m, vec4(dot(p0,x0), dot(p1,x1), dot(p2,x2), dot(p3,x3)));\n    }\n    \n    float tri(in float x){return abs(fract(x)-.5);}\n    vec3 tri3(in vec3 p){return vec3( tri(p.z+tri(p.y*20.)), tri(p.z+tri(p.x*1.)), tri(p.y+tri(p.x*1.)));}\n    \n    float triNoise3D(in vec3 p, in float spd)\n    {\n      float z=0.4;\n      float rz = 0.1;\n      vec3 bp = p;\n      for (float i=0.; i<=4.; i++ )\n      {\n        vec3 dg = tri3(bp*0.01); // Increase the scale factor to make noise less frequent\n        p += (dg+vTime*.1*spd);\n    \n        bp *= 4.; // Increase the scale factor\n        z *= 0.9;\n        p *= 1.6; // Increase the scale factor\n    \n        rz+= (tri(p.z+tri(0.6*p.x+0.1*tri(p.y))))/z;\n      }\n      return smoothstep(0.0, 8., rz + sin(rz + sin(z) * 2.8) * 2.2);\n    }\n    \n    vec2 rotate(vec2 p, float a) {\n      float s = sin(a);\n      float c = cos(a);\n      return vec2(p.x * c - p.y * s, p.x * s + p.y * c);\n    }\n    \n    float light(float intensity, float attenuation, float dist) {\n      return intensity / (1.0 + dist + dist * attenuation);\n    }\n    \n    vec4 makeNoiseBlob2(vec2 uv, vec3 color1, vec3 color2, float strength, float offset) {\n      float len = length(uv);\n      float v0, v1, cl;\n      float r0, d0, n0;\n      float r, d;\n    \n      n0 = snoise3( vec3(uv * 1.2 + offset, vTime * 0.5 + offset) ) * 0.5 + 0.5;\n      r0 = mix(0.0, 1.0, n0);\n      d0 = distance(uv, r0 / len * uv);\n      v0 = smoothstep(r0 + 0.1 + (sin(vTime + offset) + 1.0), r0, len);\n    \n      v1 = light(0.15 * (1.0 + 1.5 * (-sin(vTime * 2. + offset * 0.5) * 0.5)) + 0.3 * strength, 10.0 , d0);\n    \n      vec3 col = mix(color1, color2, uv.y * 2.);\n      col = col + v1;\n      col.rgb = clamp(col.rgb, 0.0, 1.0);\n      return vec4(col, v0);\n    }\n    \n    vec4 makeBlob(vec2 uv,\n                  float blob,\n                  vec3 color1,\n                  vec3 color2,\n                  float width,\n                  float baseReaction,\n                  float likeReaction,\n                  float audioStrength,\n                  float offset,\n                  vec2 noiseOffset) {\n      float len = length(uv);\n    \n      float outerRadius = blob + width * 0.5 + baseReaction * (1.0 + max(likeReaction, audioStrength * 0.6) * 50. * baseReaction);\n    \n      float interactionCircle = smoothstep(0.5, 0.0, abs(distance(vInteractionPoint, uv))) * vInteraction;\n      float strength = max(likeReaction, audioStrength) + 10. * interactionCircle;\n    \n      vec4 noise = makeNoiseBlob2(uv * (1.0 - likeReaction * 0.5) + noiseOffset, color1, color2, strength, offset);\n      noise.a = mix(0.0, noise.a, smoothstep(outerRadius, 0.5, len));\n      noise.rgb += 0.6 * likeReaction * (1.0 - smoothstep(0.2, outerRadius * 0.8, len));\n    \n      return noise;\n    }\n    \n    void main() {\n      vec2 uv = gl_FragCoord.xy / vScreenSize.xy;\n    \n      uv.y += vSceneOffsetY;\n      uv.x += vSceneOffsetX;\n\n      uv = uv * 2.0 - 1.0;\n      uv.y *= vScreenSize.y / min(vScreenSize.x, vScreenSize.y);\n      uv.x *= vScreenSize.x / min(vScreenSize.x, vScreenSize.y);\n\n      uv *= 1.0 / vSceneScale;\n    \n      vec2 ruv = uv * 2.0;\n      float pr = length(ruv);\n      float pa = atan(ruv.y, ruv.x);\n    \n      float idx = (pa/3.1415) / 2.0;   // 0 to 1\n    \n      vec2 ruv1 = rotate(uv * 2.0, 3.1415);\n      float pa1 = atan(ruv1.y, ruv1.x);\n      float idx1 = (pa1/3.1415) / 2.0;   // 0 to 1\n      float idx21 = (pa1/3.1415 + 1.0) / 2.0 * 3.1415; // 0 to PI\n    \n      float spark = triNoise3D(vec3(idx, 0.0, 0.0), 0.1);\n      spark = mix(spark, triNoise3D(vec3(idx1, 0.0, idx1), 0.1), smoothstep(0.9, 1.0, sin(idx21)));\n      spark = spark * 0.2 + pow(spark, 10.);\n      spark = smoothstep(0.0, spark, 0.3) * spark;\n    \n      vec3 color = vColorBackground;\n      vec4 blobColor;\n      float floatIndex;\n      float radius;\n    \n      float n0 = snoise3(vec3(uv * 1.2 * 1.2, vTime * 0.5));\n    \n      // Can't use for-loop condition with uniform vPassCount because of dynamic indexing restrictions on old devices (MUSICANDROID-29071)\n      for (int i = 0; i < 3; i++) {\n        floatIndex = float(i);\n        radius = CIRCLE_RADIUS_BASE - CIRCLE_RADIUS_STEP * floatIndex;\n        blobColor = makeBlob(uv,\n                             mix(radius, radius + 0.3, n0),\n                             vColor[i],\n                             vColor[i+3],\n                             CIRCLE_WIDTH_BASE - CIRCLE_WIDTH_STEP * floatIndex,\n                             (SPARK_STRENGTH_BASE - SPARK_STRENGTH_STEP * floatIndex) * spark,\n                             vReact[i],\n                             vAudio[i],\n                             CIRCLE_OFFSET_BASE + CIRCLE_OFFSET_STEP * floatIndex,\n                             rotate(vRotation[i].xy, vTime * vRotation[i].z));\n        color = mix(color, blobColor.rgb, blobColor.a);\n      }\n    \n      gl_FragColor = vec4(color, 1.0) * vAlpha;\n    }\n");
                int glCreateProgram = GLES20.glCreateProgram();
                if (glCreateProgram == 0) {
                    this.i = true;
                    ssg.a(6, null, "Error while creating program", null);
                    return;
                }
                GLES20.glAttachShader(glCreateProgram, N);
                GLES20.glAttachShader(glCreateProgram, N2);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] <= 0) {
                    GLES20.glDeleteProgram(glCreateProgram);
                    this.i = true;
                    v3w.l("Error while linking program: ", GLES20.glGetProgramInfoLog(glCreateProgram), 6, null, null);
                    return;
                }
                GLES20.glDetachShader(glCreateProgram, N);
                GLES20.glDetachShader(glCreateProgram, N2);
                GLES20.glDeleteShader(N);
                GLES20.glDeleteShader(N2);
                GLES20.glUseProgram(glCreateProgram);
                this.h = GLES20.glGetAttribLocation(glCreateProgram, "a_position");
                this.d.position(0);
                p4r p4rVar = this.a;
                p4rVar.D = GLES20.glGetUniformLocation(glCreateProgram, "vTime");
                p4rVar.E = GLES20.glGetUniformLocation(glCreateProgram, "vAlpha");
                if (p4rVar.b) {
                    p4rVar.F = GLES20.glGetUniformLocation(glCreateProgram, "vBlobsAlpha");
                }
                p4rVar.G = GLES20.glGetUniformLocation(glCreateProgram, "vScreenSize");
                p4rVar.H = GLES20.glGetUniformLocation(glCreateProgram, "vSceneOffsetY");
                p4rVar.I = GLES20.glGetUniformLocation(glCreateProgram, "vSceneOffsetX");
                p4rVar.J = GLES20.glGetUniformLocation(glCreateProgram, "vSceneScale");
                p4rVar.K = GLES20.glGetUniformLocation(glCreateProgram, "vAudio");
                p4rVar.L = GLES20.glGetUniformLocation(glCreateProgram, "vColorBackground");
                p4rVar.M = GLES20.glGetUniformLocation(glCreateProgram, "vColorBackgroundGradient");
                p4rVar.N = GLES20.glGetUniformLocation(glCreateProgram, "vColor");
                p4rVar.O = GLES20.glGetUniformLocation(glCreateProgram, "vReact");
                p4rVar.P = GLES20.glGetUniformLocation(glCreateProgram, "vRotation");
                p4rVar.Q = GLES20.glGetUniformLocation(glCreateProgram, "vInteraction");
                p4rVar.R = GLES20.glGetUniformLocation(glCreateProgram, "vInteractionPoint");
                p4rVar.S = GLES20.glGetUniformLocation(glCreateProgram, "vGradientHorizontal");
                p4rVar.T = GLES20.glGetUniformLocation(glCreateProgram, "vPassCount");
                p4rVar.p = 0.01f;
                GLES20.glUniform1f(p4rVar.E, p4rVar.p);
                GLES20.glUniform1f(p4rVar.H, p4rVar.y);
                GLES20.glUniform1f(p4rVar.I, p4rVar.z);
                GLES20.glUniform1f(p4rVar.J, 1.0f);
                GLES20.glUniform1f(p4rVar.S, p4rVar.Z);
                int i = p4rVar.L;
                float[] fArr2 = p4rVar.d;
                GLES20.glUniform3f(i, fArr2[0], fArr2[1], fArr2[2]);
                p4rVar.h();
                GLES20.glUniform1fv(p4rVar.O, 3, p4rVar.B, 0);
                GLES20.glUniform3fv(p4rVar.P, 3, p4rVar.C, 0);
                GLES20.glUniform2f(p4rVar.R, 0.0f, 0.0f);
                p4rVar.x = 0.0f;
                GLES20.glUniform1f(p4rVar.Q, 0.0f);
                GLES20.glUniform1i(p4rVar.T, 3);
                v3g.O("onSurfaceCreated");
            } catch (ShaderCompilationException e) {
                this.i = true;
                ssg.a(6, null, "Error while creating fragment shader", e);
            }
        } catch (ShaderCompilationException e2) {
            this.i = true;
            ssg.a(6, null, "Error while creating vertex shader", e2);
        }
    }
}
