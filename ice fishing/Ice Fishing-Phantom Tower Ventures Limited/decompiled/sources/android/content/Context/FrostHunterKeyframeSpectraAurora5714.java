package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyframeSpectraAurora5714 extends FrostHunterOnAttachStateChangeListenerDragonNovaXPhoenix3883 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterKeyframeSpectraAurora5714(int i, long j, long j2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        switch (i) {
            case 2:
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
                this.FrostHunterBundlePulseFusionHero2475 = j2;
                break;
            default:
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
                this.FrostHunterBundlePulseFusionHero2475 = j;
                break;
        }
    }

    public static long FrostHunterServiceEliteCelestialThunder1757(long j, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        long FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        if ((128 & FrostHunterMeteringPointBetaCyber9571) != 0) {
            return 8589934591L & ((((FrostHunterMeteringPointBetaCyber9571 & 1) << 32) | frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.content.Context.FrostHunterOnAttachStateChangeListenerDragonNovaXPhoenix3883
    public final String toString() {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = this.FrostHunterBundlePulseFusionHero2475;
        long j2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SCTE-35 PrivateCommand { ptsAdjustment=" + j2 + ", identifier= " + j + " }";
            case 1:
                return "SCTE-35 SpliceInsertCommand { programSplicePts=" + j2 + ", programSplicePlaybackPositionUs= " + j + " }";
            default:
                return "SCTE-35 TimeSignalCommand { ptsTime=" + j2 + ", playbackPositionUs= " + j + " }";
        }
    }

    public FrostHunterKeyframeSpectraAurora5714(long j, long j2, List list) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        this.FrostHunterBundlePulseFusionHero2475 = j2;
        Collections.unmodifiableList(list);
    }
}
