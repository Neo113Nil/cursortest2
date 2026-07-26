package android.content.Context;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTextRecognitionNebulaUltraHero1792 {
    public static FrostHunterTextRecognitionNebulaUltraHero1792 FrostHunterCameraXPixelTurboCosmos9814;
    public static HandlerThread FrostHunterFlowMaxDragonHero5809;
    public static final Object FrostHunterRemoteConfigSpeedSpeed8566 = new Object();
    public final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();
    public volatile FrostHunterValueAnimatorHyperNebulaUltra9912 FrostHunterBundlePulseFusionHero2475;
    public final Context FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final long FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterTextRecognitionNebulaUltraHero1792(Context context, Looper looper) {
        FrostHunterLaunchVortexStrike8895 frostHunterLaunchVortexStrike8895 = new FrostHunterLaunchVortexStrike8895(1, this);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context.getApplicationContext();
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = new FrostHunterValueAnimatorHyperNebulaUltra9912(looper, frostHunterLaunchVortexStrike8895);
        Looper.getMainLooper();
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterValueAnimatorHyperNebulaUltra9912;
        this.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterCameraXPixelTurboCosmos9814();
        this.FrostHunterLifecycleBlazeGammaElite2889 = 5000L;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = 300000L;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(String str, ServiceConnection serviceConnection, boolean z) {
        FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega2950 = new FrostHunterDebugHyperionMega2950(str, z);
        FrostHunterCardViewHyperionAurora3829.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                FrostHunterContentResolverForceVortex3863 frostHunterContentResolverForceVortex3863 = (FrostHunterContentResolverForceVortex3863) this.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterDebugHyperionMega2950);
                if (frostHunterContentResolverForceVortex3863 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(frostHunterDebugHyperionMega2950.toString()));
                }
                if (!frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(frostHunterDebugHyperionMega2950.toString()));
                }
                frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.remove(serviceConnection);
                if (frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                    this.FrostHunterBundlePulseFusionHero2475.sendMessageDelayed(this.FrostHunterBundlePulseFusionHero2475.obtainMessage(0, frostHunterDebugHyperionMega2950), this.FrostHunterLifecycleBlazeGammaElite2889);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega2950, FrostHunterRunnableMaxNovaDragon2334 frostHunterRunnableMaxNovaDragon2334, String str) {
        boolean z;
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                FrostHunterContentResolverForceVortex3863 frostHunterContentResolverForceVortex3863 = (FrostHunterContentResolverForceVortex3863) this.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterDebugHyperionMega2950);
                if (frostHunterContentResolverForceVortex3863 == null) {
                    frostHunterContentResolverForceVortex3863 = new FrostHunterContentResolverForceVortex3863(this, frostHunterDebugHyperionMega2950);
                    frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.put(frostHunterRunnableMaxNovaDragon2334, frostHunterRunnableMaxNovaDragon2334);
                    frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761(str, null);
                    this.FrostHunterAlphaAnimationNeoCosmos5761.put(frostHunterDebugHyperionMega2950, frostHunterContentResolverForceVortex3863);
                } else {
                    this.FrostHunterBundlePulseFusionHero2475.removeMessages(0, frostHunterDebugHyperionMega2950);
                    if (frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.containsKey(frostHunterRunnableMaxNovaDragon2334)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(frostHunterDebugHyperionMega2950.toString()));
                    }
                    frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.put(frostHunterRunnableMaxNovaDragon2334, frostHunterRunnableMaxNovaDragon2334);
                    int i = frostHunterContentResolverForceVortex3863.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (i == 1) {
                        frostHunterRunnableMaxNovaDragon2334.onServiceConnected(frostHunterContentResolverForceVortex3863.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterContentResolverForceVortex3863.FrostHunterServiceEliteCelestialThunder1757);
                    } else if (i == 2) {
                        frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761(str, null);
                    }
                }
                z = frostHunterContentResolverForceVortex3863.FrostHunterBundlePulseFusionHero2475;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
