package com.squareup.cash.card.onboarding.graphics;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.PBRMaterial;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;

/* loaded from: classes4.dex */
public abstract class WandPBRMaterial extends PBRMaterial {
    public volatile float accentLightIntensity;
    public volatile float ambientLightIntensity;
    public volatile float dimmer;
    public volatile float fillLightIntensity;
    public volatile Float iblIntensityOverride;
    public volatile boolean keyCastsShadow;
    public volatile float keyLightIntensity;
    public volatile float lightIntensityMultiplier;
    public volatile float rimLightIntensity;
    public volatile float saturation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WandPBRMaterial(GLLauncher gLLauncher) {
        super(gLLauncher);
        gLLauncher.getClass();
        this.keyLightIntensity = 2.513f;
        this.fillLightIntensity = 0.942f;
        this.rimLightIntensity = 1.564f;
        this.accentLightIntensity = 0.858f;
        this.ambientLightIntensity = 0.3f;
        this.lightIntensityMultiplier = 1.0f;
        this.saturation = 1.0f;
    }

    public final void bindWandLightingUniforms(RealUniformBinder realUniformBinder) {
        float f = this.lightIntensityMultiplier;
        realUniformBinder.setFloat("uKeyIntensity", this.keyLightIntensity * f);
        realUniformBinder.setFloat("uFillIntensity", this.fillLightIntensity * f);
        realUniformBinder.setFloat("uRimIntensity", this.rimLightIntensity * f);
        realUniformBinder.setFloat("uAccentIntensity", this.accentLightIntensity * f);
        realUniformBinder.setFloat("uAmbientIntensity", this.ambientLightIntensity * f);
        realUniformBinder.setFloat("uKeyCastsShadow", this.keyCastsShadow ? 1.0f : RecyclerView.DECELERATION_RATE);
        Float f2 = this.iblIntensityOverride;
        if (f2 != null) {
            realUniformBinder.setFloat("uIblIntensity", f2.floatValue());
        }
    }

    public final void setDimmer(float f) {
        this.dimmer = f;
        markDirty$1();
    }

    public final void setLightIntensityMultiplier(float f) {
        this.lightIntensityMultiplier = f;
        markDirty$1();
    }

    public abstract void setOpacity(float f);

    public final void setSaturation(float f) {
        this.saturation = f;
        markDirty$1();
    }
}
