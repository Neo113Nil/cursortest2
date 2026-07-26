package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterStrictModeOmegaCyberSpark3751 implements FrostHunterRippleDrawableTitanTurbo7823 {
    public final FrostHunterCameraViewMegaThunderEclipse3850 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterCameraViewMegaThunderEclipse3850(0);

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        return (this.FrostHunterCameraXPixelTurboCosmos9814.get() & i) != 0;
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        FrostHunterCameraViewMegaThunderEclipse3850 frostHunterCameraViewMegaThunderEclipse3850;
        int i2;
        do {
            frostHunterCameraViewMegaThunderEclipse3850 = this.FrostHunterCameraXPixelTurboCosmos9814;
            i2 = frostHunterCameraViewMegaThunderEclipse3850.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!frostHunterCameraViewMegaThunderEclipse3850.compareAndSet(i2, i2 | i));
    }
}
