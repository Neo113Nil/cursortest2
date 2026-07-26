package android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActivityMasterSolarElite3307 implements Iterable, FrostHunterContextBlazePrimeMax4967 {
    public FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterCameraXTurboCelestialHero5430;
    public int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLightSensorForceFusion4241;
    public HashMap FrostHunterLintTitanVortexQuantum9911;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public int[] FrostHunterCameraXPixelTurboCosmos9814 = new int[0];
    public Object[] FrostHunterAlertDialogAuroraDelta3200 = new Object[0];
    public final Object FrostHunterServiceConnectionTurboPhoenixOmega6719 = new Object();
    public ArrayList FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new ArrayList();

    public final int FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLinearLayoutForceDragonHyper4990 frostHunterLinearLayoutForceDragonHyper4990) {
        if (this.FrostHunterLightSensorForceFusion4241) {
            FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475("Use active SlotWriter to determine anchor location instead");
        }
        if (!frostHunterLinearLayoutForceDragonHyper4990.FrostHunterAlphaAnimationNeoCosmos5761()) {
            FrostHunterDialogMegaAuroraSpark4718.FrostHunterAlphaAnimationNeoCosmos5761("Anchor refers to a group that was removed");
        }
        return frostHunterLinearLayoutForceDragonHyper4990.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        this.FrostHunterLintTitanVortexQuantum9911 = new HashMap();
    }

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterLinearLayoutForceDragonHyper4990 frostHunterLinearLayoutForceDragonHyper4990) {
        int FrostHunterServiceEliteCelestialThunder1757;
        return frostHunterLinearLayoutForceDragonHyper4990.FrostHunterAlphaAnimationNeoCosmos5761() && (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterChipGroupSpeedNeo5611.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterLinearLayoutForceDragonHyper4990.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterFlowMaxDragonHero5809)) >= 0 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(FrostHunterServiceEliteCelestialThunder1757), frostHunterLinearLayoutForceDragonHyper4990);
    }

    public final FrostHunterOnClickListenerNebulaStorm6760 FrostHunterLifecycleBlazeGammaElite2889() {
        if (this.FrostHunterLightSensorForceFusion4241) {
            FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475("Cannot start a writer when another writer is pending");
        }
        if (this.FrostHunterFragmentBetaMegaVortex6025 > 0) {
            FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475("Cannot start a writer when a reader is pending");
        }
        this.FrostHunterLightSensorForceFusion4241 = true;
        this.FrostHunterScaleAnimationStrikeSpark5059++;
        return new FrostHunterOnClickListenerNebulaStorm6760(this);
    }

    public final FrostHunterMagnetometerMasterBlaze9480 FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        int i2;
        ArrayList arrayList;
        int FrostHunterServiceEliteCelestialThunder1757;
        HashMap hashMap = this.FrostHunterLintTitanVortexQuantum9911;
        if (hashMap != null) {
            if (this.FrostHunterLightSensorForceFusion4241) {
                FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475("use active SlotWriter to crate an anchor for location instead");
            }
            FrostHunterLinearLayoutForceDragonHyper4990 frostHunterLinearLayoutForceDragonHyper4990 = (i < 0 || i >= (i2 = this.FrostHunterFlowMaxDragonHero5809) || (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterChipGroupSpeedNeo5611.FrostHunterServiceEliteCelestialThunder1757((arrayList = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223), i, i2)) < 0) ? null : (FrostHunterLinearLayoutForceDragonHyper4990) arrayList.get(FrostHunterServiceEliteCelestialThunder1757);
            if (frostHunterLinearLayoutForceDragonHyper4990 != null) {
                return (FrostHunterMagnetometerMasterBlaze9480) hashMap.get(frostHunterLinearLayoutForceDragonHyper4990);
            }
        }
        return null;
    }

    public final FrostHunterKeyEventForceSparkSpeed5603 FrostHunterServiceEliteCelestialThunder1757() {
        if (this.FrostHunterLightSensorForceFusion4241) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Cannot read while a writer is pending");
            return null;
        }
        this.FrostHunterFragmentBetaMegaVortex6025++;
        return new FrostHunterKeyEventForceSparkSpeed5603(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new FrostHunterRoomDaoBlazeTurbo3939(this, 0, this.FrostHunterFlowMaxDragonHero5809);
    }
}
