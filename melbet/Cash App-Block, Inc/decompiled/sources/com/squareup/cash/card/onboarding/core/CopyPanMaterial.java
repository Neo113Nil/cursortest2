package com.squareup.cash.card.onboarding.core;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class CopyPanMaterial implements Material {
    public final SharedFlowImpl _dirty;
    public final SharedFlowImpl dirty;
    public float panOpacity;
    public final Material.ProgramSource programSource;
    public final ReadonlyStateFlow ready = FlowKt.asStateFlow(FlowKt.MutableStateFlow(Boolean.TRUE));
    public int textureId;

    public CopyPanMaterial() {
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        this._dirty = MutableSharedFlow$default;
        this.dirty = MutableSharedFlow$default;
        this.programSource = new Material.ProgramSource("\n    precision highp float;\n    \n    // Attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Uniforms\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n    uniform mat4 uModelMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;  // pre-transform aPosition; used by procedural noise materials\n                                   // that need a stable, model-space sample point\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n\n    void main() {\n      // Transform position to world space\n      vec4 worldPos = uModelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      // Transform normal, tangent, bitangent to world space\n      mat3 normalMatrix = mat3(uModelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      // Pass through UV\n      vUV = aUV;\n\n      // Calculate final position\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", "\n      precision mediump float;\n\n      varying vec2 vUV;\n\n      uniform sampler2D uCopyPanAlbedo;\n      uniform float uPanOpacity;\n\n      void main() {\n        vec4 texel = texture2D(uCopyPanAlbedo, vUV);\n        // Un-premultiply to get the true color, then output straight alpha.\n        vec3 color = texel.a > 0.001 ? texel.rgb / texel.a : vec3(0.0);\n        float alpha = texel.a * uPanOpacity;\n        gl_FragColor = vec4(color, alpha);\n      }\n      ");
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final void bind(RealUniformBinder realUniformBinder) {
        int i = this.textureId;
        if (i <= 0) {
            realUniformBinder.setFloat("uPanOpacity", RecyclerView.DECELERATION_RATE);
        } else {
            realUniformBinder.bindTexture(i, "uCopyPanAlbedo");
            realUniformBinder.setFloat("uPanOpacity", this.panOpacity);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final Flow getDirty() {
        return this.dirty;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final Material.ProgramSource getProgramSource() {
        return this.programSource;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final StateFlow getReady() {
        return this.ready;
    }
}
