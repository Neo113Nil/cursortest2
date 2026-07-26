package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintHyperDelta7076 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761 = 1;
    public long[] FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterPaintHyperDelta7076(int i) {
        this.FrostHunterBundlePulseFusionHero2475 = new long[i];
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                long[] jArr = this.FrostHunterBundlePulseFusionHero2475;
                if (i == jArr.length) {
                    this.FrostHunterBundlePulseFusionHero2475 = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.FrostHunterBundlePulseFusionHero2475;
                int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!FrostHunterBundlePulseFusionHero2475(j)) {
                    int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    long[] jArr3 = this.FrostHunterBundlePulseFusionHero2475;
                    if (i3 >= jArr3.length) {
                        jArr3 = Arrays.copyOf(jArr3, Math.max(i3 + 1, jArr3.length * 2));
                        this.FrostHunterBundlePulseFusionHero2475 = jArr3;
                    }
                    jArr3[i3] = j;
                    if (i3 >= this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i3 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public boolean FrostHunterBundlePulseFusionHero2475(long j) {
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.FrostHunterBundlePulseFusionHero2475[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(long[] jArr) {
        int length = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + jArr.length;
        long[] jArr2 = this.FrostHunterBundlePulseFusionHero2475;
        if (length > jArr2.length) {
            this.FrostHunterBundlePulseFusionHero2475 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, jArr.length);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = length;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(long j) {
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.FrostHunterBundlePulseFusionHero2475[i2]) {
                int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1;
                while (i2 < i3) {
                    long[] jArr = this.FrostHunterBundlePulseFusionHero2475;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633--;
                return;
            }
            i2++;
        }
    }

    public long FrostHunterServiceEliteCelestialThunder1757(int i) {
        if (i >= 0 && i < this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return this.FrostHunterBundlePulseFusionHero2475[i];
        }
        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Invalid index ", i, ", size is ");
        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
    }

    public /* synthetic */ FrostHunterPaintHyperDelta7076() {
    }
}
