package com.squareup.cash.card.onboarding.core.instancing;

import android.opengl.GLES20;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class BackgroundPlaneMaterial implements Material {
    public final SharedFlowImpl _dirty;
    public final StateFlowImpl _ready;
    public float currentAspect;
    public int currentTextureId;
    public final SharedFlowImpl dirty;
    public float previousAspect;
    public int previousTextureId;
    public final Material.ProgramSource programSource;
    public final ReadonlyStateFlow ready;
    public float transitionT;

    public BackgroundPlaneMaterial() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.TRUE);
        this._ready = MutableStateFlow;
        this.ready = FlowKt.asStateFlow(MutableStateFlow);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        this._dirty = MutableSharedFlow$default;
        this.dirty = MutableSharedFlow$default;
        this.previousAspect = 1.0f;
        this.currentAspect = 1.0f;
        this.transitionT = 1.0f;
        this.programSource = new Material.ProgramSource("attribute vec2 aBackgroundPosition;\nattribute vec2 aBackgroundUV;\nvarying vec2 vUV;\nvoid main() {\n  // Bypass projection/view/model matrices — quad is already in clip space.\n  gl_Position = vec4(aBackgroundPosition, 0.0, 1.0);\n  vUV = aBackgroundUV;\n}", "precision mediump float;\nvarying vec2 vUV;\nuniform sampler2D uPreviousTexture;\nuniform sampler2D uCurrentTexture;\nuniform float uHasPrevious;\nuniform float uHasCurrent;\nuniform float uTransitionT;\nuniform float uViewportAspect;\nuniform float uPreviousImageAspect;\nuniform float uCurrentImageAspect;\nuniform vec3 uClearColor;\n\n// Center-crop the texture onto the viewport: keep one axis spanning [0,1] and sample only\n// the centered sub-range of the other axis. This is the GL equivalent of ContentScale.Crop.\nvec2 cropUV(vec2 uv, float imageAspect) {\n  if (uViewportAspect > imageAspect) {\n    // Viewport wider than image — fit width, crop top/bottom.\n    float scale = imageAspect / uViewportAspect;\n    return vec2(uv.x, 0.5 + (uv.y - 0.5) * scale);\n  }\n  // Viewport taller than image — fit height, crop left/right.\n  float scale = uViewportAspect / imageAspect;\n  return vec2(0.5 + (uv.x - 0.5) * scale, uv.y);\n}\n\nvoid main() {\n  // The \"no image\" slot resolves to the clear color so a transition fades directly between\n  // image and the underlying app background instead of fading to alpha 0, which would\n  // alpha-blend through the surface mid-transition and look like a gray flash.\n  vec3 prev = uClearColor;\n  vec3 curr = uClearColor;\n  if (uHasPrevious > 0.5) {\n    prev = texture2D(uPreviousTexture, cropUV(vUV, uPreviousImageAspect)).rgb;\n  }\n  if (uHasCurrent > 0.5) {\n    curr = texture2D(uCurrentTexture, cropUV(vUV, uCurrentImageAspect)).rgb;\n  }\n  gl_FragColor = vec4(mix(prev, curr, uTransitionT), 1.0);\n}");
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public final void bind(RealUniformBinder realUniformBinder) {
        realUniformBinder.setFloat("uTransitionT", this.transitionT);
        realUniformBinder.setFloat("uHasPrevious", this.previousTextureId != 0 ? 1.0f : 0.0f);
        realUniformBinder.setFloat("uHasCurrent", this.currentTextureId != 0 ? 1.0f : 0.0f);
        realUniformBinder.setFloat("uPreviousImageAspect", this.previousAspect);
        realUniformBinder.setFloat("uCurrentImageAspect", this.currentAspect);
        int[] iArr = new int[4];
        GLES20.glGetIntegerv(2978, iArr, 0);
        float f = iArr[2];
        float f2 = iArr[3];
        realUniformBinder.setFloat("uViewportAspect", f2 > RecyclerView.DECELERATION_RATE ? f / f2 : 1.0f);
        float[] fArr = new float[4];
        GLES20.glGetFloatv(3106, fArr, 0);
        realUniformBinder.setFloat3("uClearColor", fArr[0], fArr[1], fArr[2]);
        int i = this.previousTextureId;
        if (i != 0) {
            realUniformBinder.bindTexture(i, "uPreviousTexture");
        }
        int i2 = this.currentTextureId;
        if (i2 != 0) {
            realUniformBinder.bindTexture(i2, "uCurrentTexture");
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
