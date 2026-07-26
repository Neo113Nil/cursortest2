package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPermissionInfoTurboCelestial3934 {
    public int[] FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterPermissionInfoTurboCelestial3934() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new int[10];
    }

    public int FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1;
        return i2 >= 0 ? this.FrostHunterAlphaAnimationNeoCosmos5761[i2] : i;
    }

    public void FrostHunterBundlePulseFusionHero2475(int i) {
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.FrostHunterAlphaAnimationNeoCosmos5761 = iArr;
        }
        int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 1;
        iArr[i2] = i;
    }

    public int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        return iArr[i];
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    FrostHunterRemoteConfigSpeedSpeed8566(i3, i4);
                }
            }
            FrostHunterRemoteConfigSpeedSpeed8566(i3 + 3, i2);
            FrostHunterLevelListDrawableFusionDragonHero2232(i, i3);
            FrostHunterLevelListDrawableFusionDragonHero2232(i3 + 6, i2);
        }
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(int i, int i2, int i3, int i4) {
        int i5 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.FrostHunterAlphaAnimationNeoCosmos5761 = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i6;
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2) {
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void FrostHunterServiceEliteCelestialThunder1757(int i, int i2, int i3) {
        int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.FrostHunterAlphaAnimationNeoCosmos5761 = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i5;
    }

    public FrostHunterPermissionInfoTurboCelestial3934(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new int[i];
    }
}
