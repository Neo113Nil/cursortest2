package android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBundleThunderLegendNeo8467 implements FrostHunterCoroutineScopeSolarTitan6330 {
    public static final FrostHunterFlipAnimationOlympianInfernoHyper5815 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterFlipAnimationOlympianInfernoHyper5815(new FrostHunterAdapterDelegateDragonVision1098(1), FrostHunterLayoutStormAlphaPhantom1645.FrostHunterFlowMaxDragonHero5809);
    public final FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterCameraXPixelTurboCosmos9814;
    public final long[] FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterBundleThunderLegendNeo8467(FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205) {
        int i = frostHunterBitmapNeoCosmos7205.FrostHunterKeyframeGammaGamma1197;
        int i2 = 0;
        if (i == 1) {
            FrostHunterAnimatorOlympianPhantomElite2405 listIterator = frostHunterBitmapNeoCosmos7205.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            FrostHunterWindowManagerInfernoOlympianVortex6395 frostHunterWindowManagerInfernoOlympianVortex6395 = (FrostHunterWindowManagerInfernoOlympianVortex6395) next;
            long j = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j2 = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterBundlePulseFusionHero2475;
            long j3 = j == -9223372036854775807L ? 0L : j;
            FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterAlphaAnimationNeoCosmos5761;
            if (j2 == -9223372036854775807L) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(frostHunterAlarmManagerHeroTitaniumFusion5758);
                this.FrostHunterFlowMaxDragonHero5809 = new long[]{j3};
                return;
            } else {
                FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterAlarmManagerHeroTitaniumFusion5758, FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
                this.FrostHunterFlowMaxDragonHero5809 = new long[]{j3, j2 + j3};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.FrostHunterFlowMaxDragonHero5809 = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        FrostHunterBitmapNeoCosmos7205 FrostHunterLintTitanVortexQuantum9911 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterLintTitanVortexQuantum9911(FrostHunterAlertDialogAuroraDelta3200, frostHunterBitmapNeoCosmos7205);
        int i3 = 0;
        while (i2 < FrostHunterLintTitanVortexQuantum9911.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterWindowManagerInfernoOlympianVortex6395 frostHunterWindowManagerInfernoOlympianVortex63952 = (FrostHunterWindowManagerInfernoOlympianVortex6395) FrostHunterLintTitanVortexQuantum9911.get(i2);
            long j4 = frostHunterWindowManagerInfernoOlympianVortex63952.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j5 = frostHunterWindowManagerInfernoOlympianVortex63952.FrostHunterBundlePulseFusionHero2475;
            FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion57582 = frostHunterWindowManagerInfernoOlympianVortex63952.FrostHunterAlphaAnimationNeoCosmos5761;
            j4 = j4 == -9223372036854775807L ? 0L : j4;
            long j6 = j4 + j5;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j7 = this.FrostHunterFlowMaxDragonHero5809[i4];
                if (j7 >= j4) {
                    if (j7 == j4 && ((FrostHunterAlarmManagerHeroTitaniumFusion5758) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, frostHunterAlarmManagerHeroTitaniumFusion57582);
                    } else {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Truncating unsupported overlapping cues.");
                        this.FrostHunterFlowMaxDragonHero5809[i4] = j4;
                        arrayList.set(i4, frostHunterAlarmManagerHeroTitaniumFusion57582);
                    }
                    if (j5 == -9223372036854775807L) {
                        this.FrostHunterFlowMaxDragonHero5809[i3] = j6;
                        arrayList.add(FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
                        i3++;
                    }
                    i2++;
                }
            }
            this.FrostHunterFlowMaxDragonHero5809[i3] = j4;
            arrayList.add(frostHunterAlarmManagerHeroTitaniumFusion57582);
            i3++;
            if (j5 == -9223372036854775807L) {
            }
            i2++;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(arrayList);
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFlowMaxDragonHero5809, j, false);
        if (FrostHunterAlphaAnimationNeoCosmos5761 < this.FrostHunterCameraXPixelTurboCosmos9814.size()) {
            return FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public final long FrostHunterFlowMaxDragonHero5809(int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i < this.FrostHunterCameraXPixelTurboCosmos9814.size());
        return this.FrostHunterFlowMaxDragonHero5809[i];
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public final int FrostHunterScaleAnimationStrikeSpark5059() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.size();
    }

    @Override // android.content.Context.FrostHunterCoroutineScopeSolarTitan6330
    public final List FrostHunterServiceConnectionTurboPhoenixOmega6719(long j) {
        int FrostHunterServiceEliteCelestialThunder1757 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterFlowMaxDragonHero5809, j, false);
        if (FrostHunterServiceEliteCelestialThunder1757 != -1) {
            return (FrostHunterAlarmManagerHeroTitaniumFusion5758) this.FrostHunterCameraXPixelTurboCosmos9814.get(FrostHunterServiceEliteCelestialThunder1757);
        }
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        return FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
    }
}
