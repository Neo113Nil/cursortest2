package android.content.Context;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGyroscopeNovaMaxPhantom9923 implements FrostHunterTraceCelestialVortexSpark6705, FrostHunterSQLiteNovaXCelestial9743 {
    public static final AtomicReferenceFieldUpdater FrostHunterFlowMaxDragonHero5809 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterGyroscopeNovaMaxPhantom9923.class, Object.class, "result");
    public final FrostHunterTraceCelestialVortexSpark6705 FrostHunterCameraXPixelTurboCosmos9814;
    private volatile Object result;

    public FrostHunterGyroscopeNovaMaxPhantom9923(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterTraceCelestialVortexSpark6705;
        this.result = frostHunterAuthMasterNovaXMax8430;
    }

    @Override // android.content.Context.FrostHunterSQLiteNovaXCelestial9743
    public final FrostHunterSQLiteNovaXCelestial9743 FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterSQLiteNovaXCelestial9743) {
            return (FrostHunterSQLiteNovaXCelestial9743) frostHunterTraceCelestialVortexSpark6705;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final void FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        while (true) {
            Object obj2 = this.result;
            FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterFlowMaxDragonHero5809;
            if (obj2 == frostHunterAuthMasterNovaXMax8430) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterFlowMaxDragonHero5809;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, frostHunterAuthMasterNovaXMax8430, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != frostHunterAuthMasterNovaXMax8430) {
                        break;
                    }
                }
                return;
            }
            FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax84302 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
            if (obj2 != frostHunterAuthMasterNovaXMax84302) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = FrostHunterFlowMaxDragonHero5809;
            FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax84303 = FrostHunterAuthMasterNovaXMax8430.FrostHunterAlertDialogAuroraDelta3200;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, frostHunterAuthMasterNovaXMax84302, frostHunterAuthMasterNovaXMax84303)) {
                if (atomicReferenceFieldUpdater2.get(this) != frostHunterAuthMasterNovaXMax84302) {
                    break;
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(obj);
            return;
        }
    }

    @Override // android.content.Context.FrostHunterTraceCelestialVortexSpark6705
    public final FrostHunterCountDownTimerRogueTitan5615 getContext() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.getContext();
    }

    public final String toString() {
        return "SafeContinuation for " + this.FrostHunterCameraXPixelTurboCosmos9814;
    }
}
