package com.squareup.cash.graphics.swampgl.components.shaders;

import android.opengl.GLES20;
import androidx.media3.decoder.Buffer;

/* loaded from: classes4.dex */
public final class DecayShaderProgram extends Buffer {
    public int decayFactorLoc;
    public int textureLoc;

    @Override // androidx.media3.decoder.Buffer
    public final String getFragmentSource() {
        return "precision mediump float;\n\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\nuniform float uDecayFactor;\n\nvoid main() {\n  vec4 prevColor = texture2D(uTexture, vTexCoord);\n  float decayedHeat = max(0.0, prevColor.a - uDecayFactor);\n  gl_FragColor = vec4(0.0, 0.0, 0.0, decayedHeat);\n}";
    }

    @Override // androidx.media3.decoder.Buffer
    public final void onProgramCompiled() {
        this.textureLoc = GLES20.glGetUniformLocation(this.flags, "uTexture");
        this.decayFactorLoc = GLES20.glGetUniformLocation(this.flags, "uDecayFactor");
    }
}
