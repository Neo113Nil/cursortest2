package com.squareup.cash.graphics.swampgl.components.shaders;

import android.opengl.GLES20;
import androidx.media3.decoder.Buffer;

/* loaded from: classes4.dex */
public final class MaxAlphaShaderProgram extends Buffer {
    public int textureLoc;

    @Override // androidx.media3.decoder.Buffer
    public final String getFragmentSource() {
        return "precision mediump float;\n\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\n\nvoid main() {\n  const int gridSize = 64;\n  float maxAlpha = 0.0;\n  \n  for (int gy = 0; gy < gridSize; gy++) {\n    for (int gx = 0; gx < gridSize; gx++) {\n      vec2 uv = vec2(\n        (float(gx) + 0.5) / float(gridSize),\n        (float(gy) + 0.5) / float(gridSize)\n      );\n      \n      vec4 color = texture2D(uTexture, uv);\n      maxAlpha = max(maxAlpha, color.a);\n      \n      if (maxAlpha > 0.0) {\n        gl_FragColor = vec4(1.0);\n        return;\n      }\n    }\n  }\n  \n  gl_FragColor = vec4(0.0);\n}";
    }

    @Override // androidx.media3.decoder.Buffer
    public final void onProgramCompiled() {
        this.textureLoc = GLES20.glGetUniformLocation(this.flags, "uTexture");
    }
}
