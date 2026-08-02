package com.squareup.cash.card.onboarding.graphics;

import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class FresnelPBRMaterial extends WandPBRMaterial {
    public static final List DEFAULT_RAMP_STOPS;
    public static final Pair DEFAULT_STOP;
    public static final String MATERIAL_FUNCTION;
    public static final String MATERIAL_UNIFORMS;
    public volatile float fresnelExponent;
    public final boolean instanced;
    public volatile float metallic;
    public volatile float noiseScale;
    public volatile float noiseStrength;
    public volatile float opacity;
    public volatile List rampStops;
    public volatile float roughness;
    public volatile float strength;

    static {
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        DEFAULT_STOP = new Pair(valueOf, new float[]{1.0f, 1.0f, 1.0f});
        DEFAULT_RAMP_STOPS = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(valueOf, new float[]{1.0f, 0.722f, 0.715f}), new Pair(Float.valueOf(0.155f), new float[]{0.433f, 1.0f, 0.657f}), new Pair(Float.valueOf(0.455f), new float[]{1.0f, 0.497f, 0.765f}), new Pair(Float.valueOf(0.709f), new float[]{1.0f, 1.0f, 1.0f})});
        MATERIAL_UNIFORMS = "uniform vec3 uC0;\nuniform vec3 uC1;\nuniform vec3 uC2;\nuniform vec3 uC3;\nuniform float uP0;\nuniform float uP1;\nuniform float uP2;\nuniform float uP3;\nuniform float uFresnelExp;\nuniform float uFresnelStrength;\nuniform float uNoiseScale;\nuniform float uNoiseStrength;";
        MATERIAL_FUNCTION = "void material(inout MaterialInputs inputs) {\n  prepareMaterial(inputs);\n\n  vec3 _np = vPosition * uNoiseScale;\n  vec3 _nf = floor(_np);\n  vec3 _nd = _np - _nf;\n  _nd = _nd * _nd * (3.0 - 2.0 * _nd);\n  float _n = _nf.x + _nf.y * 157.0 + _nf.z * 113.0;\n  vec4 _ns = fract(sin(vec4(_n, _n + 1.0, _n + 157.0, _n + 158.0)) * 43758.5453);\n  vec4 _ns2 = fract(sin(vec4(_n + 113.0, _n + 114.0, _n + 270.0, _n + 271.0)) * 43758.5453);\n  float _nx0 = mix(mix(_ns.x, _ns.y, _nd.x), mix(_ns.z, _ns.w, _nd.x), _nd.y);\n  float _nx1 = mix(mix(_ns2.x, _ns2.y, _nd.x), mix(_ns2.z, _ns2.w, _nd.x), _nd.y);\n  float noise = mix(_nx0, _nx1, _nd.z);\n\n  vec3 viewDir = normalize(uCameraPosition - vPosition);\n  vec3 nrm = normalize(vNormal);\n  float facing = 1.0 - pow(clamp(dot(viewDir, nrm), 0.0, 1.0), uFresnelExp);\n  facing = clamp(facing + (noise - 0.5) * uNoiseStrength, 0.0, 1.0);\n\n  vec3 rampColor = uC3;\n  if (facing >= uP0 && facing < uP1) {\n    float t = (facing - uP0) / max(uP1 - uP0, 0.001);\n    rampColor = mix(uC0, uC1, t);\n  }\n  if (facing >= uP1 && facing < uP2) {\n    float t = (facing - uP1) / max(uP2 - uP1, 0.001);\n    rampColor = mix(uC1, uC2, t);\n  }\n  if (facing >= uP2 && facing < uP3) {\n    float t = (facing - uP2) / max(uP3 - uP2, 0.001);\n    rampColor = mix(uC2, uC3, t);\n  }\n\n  vec3 white = uBaseColor;\n  inputs.baseColor = mix(white, rampColor, uFresnelStrength);\n}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FresnelPBRMaterial(Engine engine, float f, float f2, boolean z) {
        super(engine);
        engine.getClass();
        this.instanced = z;
        this.roughness = f;
        this.metallic = f2;
        this.opacity = 1.0f;
        this.rampStops = DEFAULT_RAMP_STOPS;
        this.fresnelExponent = 3.112f;
        this.strength = 0.125f;
        this.noiseScale = 3.178f;
        this.noiseStrength = 0.169f;
        engine.launch(new Pager$pageFetcher$2(this, null, 10));
    }

    @Override // com.squareup.cash.graphics.swampgl.components.PBRMaterial
    public final MaterialPlugin createPlugin() {
        zzb zzbVar = new zzb();
        zzbVar.zza = this;
        markReady();
        return zzbVar;
    }

    @Override // com.squareup.cash.card.onboarding.graphics.WandPBRMaterial
    public final void setOpacity(float f) {
        this.opacity = f;
        markDirty$1();
    }
}
