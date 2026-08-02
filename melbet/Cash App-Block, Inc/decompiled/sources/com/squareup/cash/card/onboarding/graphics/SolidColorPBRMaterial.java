package com.squareup.cash.card.onboarding.graphics;

import androidx.paging.Pager$pageFetcher$2;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;

/* loaded from: classes4.dex */
public class SolidColorPBRMaterial extends WandPBRMaterial {
    public volatile int baseColor;
    public final boolean instanced;
    public volatile float metallic;
    public volatile float opacity;
    public volatile float roughness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidColorPBRMaterial(GLLauncher gLLauncher, int i, float f, float f2, boolean z) {
        super(gLLauncher);
        gLLauncher.getClass();
        this.instanced = z;
        this.baseColor = i;
        this.roughness = f;
        this.metallic = f2;
        this.opacity = 1.0f;
        gLLauncher.launch(new Pager$pageFetcher$2(this, null, 10));
    }

    @Override // com.squareup.cash.graphics.swampgl.components.PBRMaterial
    public MaterialPlugin createPlugin() {
        return new JCAContext(this);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.WandPBRMaterial
    public final void setOpacity(float f) {
        this.opacity = f;
        markDirty$1();
    }

    public /* synthetic */ SolidColorPBRMaterial(GLLauncher gLLauncher, int i, float f, float f2, boolean z, int i2) {
        this(gLLauncher, i, f, f2, (i2 & 32) != 0 ? false : z);
    }
}
