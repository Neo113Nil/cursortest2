package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverForceVortex3863 implements ServiceConnection {
    public boolean FrostHunterBundlePulseFusionHero2475;
    public ComponentName FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterDebugHyperionMega2950 FrostHunterLifecycleBlazeGammaElite2889;
    public final /* synthetic */ FrostHunterTextRecognitionNebulaUltraHero1792 FrostHunterRemoteConfigSpeedSpeed8566;
    public IBinder FrostHunterServiceEliteCelestialThunder1757;
    public final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;

    public FrostHunterContentResolverForceVortex3863(FrostHunterTextRecognitionNebulaUltraHero1792 frostHunterTextRecognitionNebulaUltraHero1792, FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega2950) {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterTextRecognitionNebulaUltraHero1792;
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterDebugHyperionMega2950;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            FrostHunterTextRecognitionNebulaUltraHero1792 frostHunterTextRecognitionNebulaUltraHero1792 = this.FrostHunterRemoteConfigSpeedSpeed8566;
            FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832 = frostHunterTextRecognitionNebulaUltraHero1792.FrostHunterServiceEliteCelestialThunder1757;
            Context context = frostHunterTextRecognitionNebulaUltraHero1792.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            boolean FrostHunterLintTitanVortexQuantum9911 = frostHunterLayoutInflaterTurboHyperion3832.FrostHunterLintTitanVortexQuantum9911(context, str, this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761(context), this, 4225, executor);
            this.FrostHunterBundlePulseFusionHero2475 = FrostHunterLintTitanVortexQuantum9911;
            if (FrostHunterLintTitanVortexQuantum9911) {
                this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475.sendMessageDelayed(this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475.obtainMessage(1, this.FrostHunterLifecycleBlazeGammaElite2889), this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232);
            } else {
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;
                try {
                    FrostHunterTextRecognitionNebulaUltraHero1792 frostHunterTextRecognitionNebulaUltraHero17922 = this.FrostHunterRemoteConfigSpeedSpeed8566;
                    frostHunterTextRecognitionNebulaUltraHero17922.FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059(frostHunterTextRecognitionNebulaUltraHero17922.FrostHunterConstraintSetCloneMasterUltraRogue2633, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475.removeMessages(1, this.FrostHunterLifecycleBlazeGammaElite2889);
                this.FrostHunterServiceEliteCelestialThunder1757 = iBinder;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = componentName;
                Iterator it = this.FrostHunterAlphaAnimationNeoCosmos5761.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475.removeMessages(1, this.FrostHunterLifecycleBlazeGammaElite2889);
                this.FrostHunterServiceEliteCelestialThunder1757 = null;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = componentName;
                Iterator it = this.FrostHunterAlphaAnimationNeoCosmos5761.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
