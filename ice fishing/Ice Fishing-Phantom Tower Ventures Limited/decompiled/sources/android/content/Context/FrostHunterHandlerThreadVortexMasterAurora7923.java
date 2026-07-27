package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterHandlerThreadVortexMasterAurora7923 implements FrostHunterNotificationManagerPulsePulseNeo9042 {
    public final Object FrostHunterAlertDialogAuroraDelta3200 = new Object();
    public final FrostHunterRemoteModelManagerPrimeStrikePrime5960 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterDiffUtilQuantumNebulaTurbo2317 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterFragmentBetaMegaVortex6025;
    public boolean FrostHunterKeyframeGammaGamma1197;

    public FrostHunterHandlerThreadVortexMasterAurora7923(FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616, FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960, FrostHunterDiffUtilQuantumNebulaTurbo2317 frostHunterDiffUtilQuantumNebulaTurbo2317) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterRemoteModelManagerPrimeStrikePrime5960;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDiffUtilQuantumNebulaTurbo2317;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterJobSchedulerEpicAuroraNebula9616;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterDiffUtilQuantumNebulaTurbo2317 FrostHunterCameraXTurboCelestialHero5430() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterCoroutineScopePrimeSpark1417 FrostHunterLintTitanVortexQuantum9911() {
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterLooperHyperionForce4133() {
        FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616;
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            try {
                if (this.FrostHunterKeyframeGammaGamma1197) {
                    throw new IllegalStateException("closed");
                }
                frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterFragmentBetaMegaVortex6025;
                if (frostHunterJobSchedulerEpicAuroraNebula9616 == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterJobSchedulerEpicAuroraNebula9616;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.FrostHunterAlertDialogAuroraDelta3200) {
            this.FrostHunterKeyframeGammaGamma1197 = true;
            FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterFragmentBetaMegaVortex6025;
            if (frostHunterJobSchedulerEpicAuroraNebula9616 != null) {
                try {
                    frostHunterJobSchedulerEpicAuroraNebula9616.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.content.Context.FrostHunterNotificationManagerPulsePulseNeo9042
    public final FrostHunterRemoteModelManagerPrimeStrikePrime5960 getFileSystem() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }
}
