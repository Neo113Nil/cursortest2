package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKeyEventMasterFusionNovaX5645 implements FrostHunterNotificationManagerPulsePulseNeo9042 {
    public final String FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterCoroutineScopePrimeSpark1417 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterRemoteModelManagerPrimeStrikePrime5960 FrostHunterFlowMaxDragonHero5809;
    public final Object FrostHunterFragmentBetaMegaVortex6025 = new Object();
    public final AutoCloseable FrostHunterKeyframeGammaGamma1197;
    public FrostHunterConstraintLayoutBetaAlphaNebula8582 FrostHunterLightSensorForceFusion4241;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterKeyEventMasterFusionNovaX5645(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960, String str, AutoCloseable autoCloseable) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterCoroutineScopePrimeSpark1417;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterRemoteModelManagerPrimeStrikePrime5960;
        this.FrostHunterAlertDialogAuroraDelta3200 = str;
        this.FrostHunterKeyframeGammaGamma1197 = autoCloseable;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterDiffUtilQuantumNebulaTurbo2317 FrostHunterCameraXTurboCelestialHero5430() {
        return null;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterCoroutineScopePrimeSpark1417 FrostHunterLintTitanVortexQuantum9911() {
        FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417;
        synchronized (this.FrostHunterFragmentBetaMegaVortex6025) {
            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                throw new IllegalStateException("closed");
            }
            frostHunterCoroutineScopePrimeSpark1417 = this.FrostHunterCameraXPixelTurboCosmos9814;
        }
        return frostHunterCoroutineScopePrimeSpark1417;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterLooperHyperionForce4133() {
        synchronized (this.FrostHunterFragmentBetaMegaVortex6025) {
            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                throw new IllegalStateException("closed");
            }
            FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = this.FrostHunterLightSensorForceFusion4241;
            if (frostHunterConstraintLayoutBetaAlphaNebula8582 != null) {
                return frostHunterConstraintLayoutBetaAlphaNebula8582;
            }
            FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterDialogFragmentTurboPhoenixDragon7627 = this.FrostHunterFlowMaxDragonHero5809.FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterDialogFragmentTurboPhoenixDragon7627.getClass();
            FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula85822 = new FrostHunterConstraintLayoutBetaAlphaNebula8582(FrostHunterDialogFragmentTurboPhoenixDragon7627);
            this.FrostHunterLightSensorForceFusion4241 = frostHunterConstraintLayoutBetaAlphaNebula85822;
            return frostHunterConstraintLayoutBetaAlphaNebula85822;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.FrostHunterFragmentBetaMegaVortex6025) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
            FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = this.FrostHunterLightSensorForceFusion4241;
            if (frostHunterConstraintLayoutBetaAlphaNebula8582 != null) {
                try {
                    frostHunterConstraintLayoutBetaAlphaNebula8582.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.FrostHunterKeyframeGammaGamma1197;
            if (autoCloseable != null) {
                try {
                    FrostHunterImageCaptureShadowGammaMax6416.FrostHunterBundlePulseFusionHero2475(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterRemoteModelManagerPrimeStrikePrime5960 getFileSystem() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }
}
