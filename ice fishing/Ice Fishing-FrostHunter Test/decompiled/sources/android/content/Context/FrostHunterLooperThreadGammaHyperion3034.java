package android.content.Context;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperThreadGammaHyperion3034 {
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public Rect FrostHunterFlowMaxDragonHero5809;
    public int[] FrostHunterLevelListDrawableFusionDragonHero2232;
    public boolean FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public boolean FrostHunterServiceEliteCelestialThunder1757;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633 = -9223372036854775807L;
    public long FrostHunterBundlePulseFusionHero2475 = -9223372036854775807L;
    public final int[] FrostHunterAlphaAnimationNeoCosmos5761 = new int[4];
    public int FrostHunterAlertDialogAuroraDelta3200 = -1;
    public int FrostHunterKeyframeGammaGamma1197 = -1;

    public static int FrostHunterAlphaAnimationNeoCosmos5761(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public static int FrostHunterBundlePulseFusionHero2475(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int width = rect.width();
        int height = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * width;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterConstraintSetCloneMasterUltraRogue2633() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.FrostHunterAlphaAnimationNeoCosmos5761[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            frostHunterCountDownTimerStormPulseFusion5949.FrostHunterBundlePulseFusionHero2475();
        }
    }
}
