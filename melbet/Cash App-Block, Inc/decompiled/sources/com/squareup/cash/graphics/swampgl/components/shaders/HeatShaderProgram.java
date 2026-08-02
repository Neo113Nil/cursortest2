package com.squareup.cash.graphics.swampgl.components.shaders;

import android.opengl.GLES20;
import androidx.media3.decoder.Buffer;

/* loaded from: classes4.dex */
public final class HeatShaderProgram extends Buffer {
    public final /* synthetic */ int $r8$classId;
    public int centerLoc;
    public int intensityLoc;
    public int radiusLoc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatShaderProgram(int i) {
        super((byte) 0, 2);
        this.$r8$classId = i;
    }

    @Override // androidx.media3.decoder.Buffer
    public final String getFragmentSource() {
        switch (this.$r8$classId) {
            case 0:
                return "precision mediump float;\n\nvarying vec2 vTexCoord;\nuniform vec2 uCenter;\nuniform float uRadius;\nuniform float uIntensity;\n\nvoid main() {\n  vec2 diff = (vTexCoord - uCenter);\n  float dist = length(diff);\n  \n  float heat = smoothstep(uRadius, 0.0, dist) * uIntensity;\n  heat = clamp(heat, 0.0, 1.0);\n  \n  gl_FragColor = vec4(0.0, 0.0, 0.0, heat);\n}";
            default:
                return "precision mediump float;\n\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\nuniform vec2 uUVScale;\nuniform vec2 uUVOffset;\n\nvoid main() {\n  float maxY = uUVScale.y;\n  \n  if (vTexCoord.y >= maxY) {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n    return;\n  }\n  \n  vec2 bitmapUV = vec2(vTexCoord.x, vTexCoord.y / maxY);\n  vec4 color = texture2D(uTexture, bitmapUV);\n  \n  float luminance = (color.r + color.g + color.b) / 3.0;\n  gl_FragColor = vec4(0.0, 0.0, 0.0, luminance);\n}";
        }
    }

    @Override // androidx.media3.decoder.Buffer
    public final void onProgramCompiled() {
        switch (this.$r8$classId) {
            case 0:
                this.centerLoc = GLES20.glGetUniformLocation(this.flags, "uCenter");
                this.radiusLoc = GLES20.glGetUniformLocation(this.flags, "uRadius");
                this.intensityLoc = GLES20.glGetUniformLocation(this.flags, "uIntensity");
                break;
            default:
                this.centerLoc = GLES20.glGetUniformLocation(this.flags, "uTexture");
                this.radiusLoc = GLES20.glGetUniformLocation(this.flags, "uUVScale");
                this.intensityLoc = GLES20.glGetUniformLocation(this.flags, "uUVOffset");
                break;
        }
    }
}
