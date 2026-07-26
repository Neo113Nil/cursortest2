package android.content.Context;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterEliteSpectraSolar8984 extends FrostHunterGroupNebulaPhoenix4270 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater FrostHunterCameraXPixelTurboCosmos9814 = AtomicReferenceFieldUpdater.newUpdater(FrostHunterAdapterEliteSpectraSolar8984.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public FrostHunterAdapterEliteSpectraSolar8984() {
        super(1);
        this.owner$volatile = FrostHunterExecutorSolarPhoenix3849.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterGroupNebulaPhoenix4270.FrostHunterRemoteConfigSpeedSpeed8566;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    FrostHunterCameraXPixelTurboCosmos9814.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.FrostHunterLooperHyperionForce4133(r1, r4.FrostHunterConstraintSetCloneMasterUltraRogue2633);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterLifecycleBlazeGammaElite2889(FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        boolean FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterSQLiteUltraElite7894 FrostHunterViewPhantomNeo1634 = FrostHunterCardViewHyperionAurora3829.FrostHunterViewPhantomNeo1634(FrostHunterPaintCyberPulse5979.FrostHunterMeteringPointMegaCyber7955(frostHunterViewBindingCelestialVortex7351));
            try {
                FrostHunterOnTouchListenerAlphaOmega6209 frostHunterOnTouchListenerAlphaOmega6209 = new FrostHunterOnTouchListenerAlphaOmega6209(this, FrostHunterViewPhantomNeo1634);
                while (true) {
                    int andDecrement = FrostHunterGroupNebulaPhoenix4270.FrostHunterRemoteConfigSpeedSpeed8566.getAndDecrement(this);
                    if (andDecrement <= this.FrostHunterAlphaAnimationNeoCosmos5761) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnTouchListenerAlphaOmega6209)) {
                            break;
                        }
                    }
                }
                Object FrostHunterLintTitanVortexQuantum9911 = FrostHunterViewPhantomNeo1634.FrostHunterLintTitanVortexQuantum9911();
                FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                if (FrostHunterLintTitanVortexQuantum9911 != frostHunterAuthMasterNovaXMax8430) {
                    FrostHunterLintTitanVortexQuantum9911 = frostHunterLinearLayoutSolarHero7990;
                }
                if (FrostHunterLintTitanVortexQuantum9911 == frostHunterAuthMasterNovaXMax8430) {
                    return FrostHunterLintTitanVortexQuantum9911;
                }
            } catch (Throwable th) {
                FrostHunterViewPhantomNeo1634.FrostHunterEditTextPulseHyperion1262();
                throw th;
            }
        }
        return frostHunterLinearLayoutSolarHero7990;
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(Object obj) {
        while (FrostHunterServiceEliteCelestialThunder1757()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterCameraXPixelTurboCosmos9814;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterExecutorSolarPhoenix3849.FrostHunterLifecycleBlazeGammaElite2889;
            if (obj2 != frostHunterWorkManagerMaxTurbo1858) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, frostHunterWorkManagerMaxTurbo1858)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    FrostHunterBundlePulseFusionHero2475();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This mutex is not locked");
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757() {
        return Math.max(FrostHunterGroupNebulaPhoenix4270.FrostHunterRemoteConfigSpeedSpeed8566.get(this), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + FrostHunterBannerAdTitanVisionDragon3523.FrostHunterDatabaseEliteShadowUltra2452(this) + "[isLocked=" + FrostHunterServiceEliteCelestialThunder1757() + ",owner=" + FrostHunterCameraXPixelTurboCosmos9814.get(this) + ']';
    }
}
