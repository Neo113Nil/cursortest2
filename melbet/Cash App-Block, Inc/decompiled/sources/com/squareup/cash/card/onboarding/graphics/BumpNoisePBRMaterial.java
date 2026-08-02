package com.squareup.cash.card.onboarding.graphics;

import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.scannerview.SizeMap;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes4.dex */
public final class BumpNoisePBRMaterial extends SolidColorPBRMaterial {
    public volatile int bumpOctaves;
    public volatile float bumpScale;
    public volatile float bumpStrength;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BumpNoisePBRMaterial(GLLauncher gLLauncher, int i, float f, float f2, boolean z, int i2) {
        super(gLLauncher, i, f, f2, z);
        float f3 = (i2 & 32) != 0 ? 12000.0f : 11808.7f;
        float f4 = (i2 & 64) != 0 ? 0.3f : 0.452f;
        z = (i2 & 256) != 0 ? false : z;
        gLLauncher.getClass();
        this.bumpScale = f3;
        this.bumpStrength = f4;
        this.bumpOctaves = RangesKt___RangesKt.coerceIn(2, 1, 4);
    }

    @Override // com.squareup.cash.card.onboarding.graphics.SolidColorPBRMaterial, com.squareup.cash.graphics.swampgl.components.PBRMaterial
    public final MaterialPlugin createPlugin() {
        return new SizeMap(this);
    }
}
