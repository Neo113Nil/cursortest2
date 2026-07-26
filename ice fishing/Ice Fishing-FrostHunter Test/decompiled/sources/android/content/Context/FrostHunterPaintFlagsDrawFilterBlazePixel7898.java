package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFlagsDrawFilterBlazePixel7898 implements ServiceConnection {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final ScheduledThreadPoolExecutor FrostHunterBundlePulseFusionHero2475;
    public final Intent FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public FrostHunterBillingClientBetaStormPhoenix2303 FrostHunterLifecycleBlazeGammaElite2889;
    public final ArrayDeque FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPaintFlagsDrawFilterBlazePixel7898(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new FrostHunterJobSchedulerPhoenixRogue9514("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.FrostHunterServiceEliteCelestialThunder1757 = new ArrayDeque();
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = false;
        Context applicationContext = context.getApplicationContext();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = applicationContext;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.FrostHunterBundlePulseFusionHero2475 = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r1.FrostHunterLintTitanVortexQuantum9911(r2, r2.getClass().getName(), r8.FrostHunterConstraintSetCloneMasterUltraRogue2633, r5, 65, null) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterPaintFlagsDrawFilterBlazePixel7898 frostHunterPaintFlagsDrawFilterBlazePixel7898;
        while (!this.FrostHunterServiceEliteCelestialThunder1757.isEmpty()) {
            try {
                FrostHunterBillingClientBetaStormPhoenix2303 frostHunterBillingClientBetaStormPhoenix2303 = this.FrostHunterLifecycleBlazeGammaElite2889;
                if (frostHunterBillingClientBetaStormPhoenix2303 == null || !frostHunterBillingClientBetaStormPhoenix2303.isBinderAlive()) {
                    try {
                        if (this.FrostHunterLevelListDrawableFusionDragonHero2232) {
                            frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
                        } else {
                            try {
                                this.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
                                try {
                                    FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterCameraXPixelTurboCosmos9814();
                                    Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
                                    frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            th = th;
                                            while (true) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        }
                                    } catch (SecurityException unused) {
                                    }
                                } catch (SecurityException unused2) {
                                    frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
                    }
                } else {
                    this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterObjectAnimatorBetaOlympian2287) this.FrostHunterServiceEliteCelestialThunder1757.poll());
                }
            } catch (Throwable th5) {
                th = th5;
                frostHunterPaintFlagsDrawFilterBlazePixel7898 = this;
            }
        }
        return;
        frostHunterPaintFlagsDrawFilterBlazePixel7898.FrostHunterLevelListDrawableFusionDragonHero2232 = false;
        ArrayDeque arrayDeque = frostHunterPaintFlagsDrawFilterBlazePixel7898.FrostHunterServiceEliteCelestialThunder1757;
        while (!arrayDeque.isEmpty()) {
            ((FrostHunterObjectAnimatorBetaOlympian2287) arrayDeque.poll()).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475(null);
        }
    }

    public final synchronized FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterConstraintSetCloneMasterUltraRogue2633(Intent intent) {
        FrostHunterObjectAnimatorBetaOlympian2287 frostHunterObjectAnimatorBetaOlympian2287;
        frostHunterObjectAnimatorBetaOlympian2287 = new FrostHunterObjectAnimatorBetaOlympian2287(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.FrostHunterBundlePulseFusionHero2475;
        frostHunterObjectAnimatorBetaOlympian2287.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(scheduledThreadPoolExecutor, new FrostHunterRippleDrawableMaxElite5227(26, scheduledThreadPoolExecutor.schedule(new FrostHunterFilterAlphaSparkSpeed9857(26, frostHunterObjectAnimatorBetaOlympian2287), 20L, TimeUnit.SECONDS)));
        this.FrostHunterServiceEliteCelestialThunder1757.add(frostHunterObjectAnimatorBetaOlympian2287);
        FrostHunterAlphaAnimationNeoCosmos5761();
        return frostHunterObjectAnimatorBetaOlympian2287.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = false;
            if (iBinder instanceof FrostHunterBillingClientBetaStormPhoenix2303) {
                this.FrostHunterLifecycleBlazeGammaElite2889 = (FrostHunterBillingClientBetaStormPhoenix2303) iBinder;
                FrostHunterAlphaAnimationNeoCosmos5761();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.FrostHunterServiceEliteCelestialThunder1757;
                while (!arrayDeque.isEmpty()) {
                    ((FrostHunterObjectAnimatorBetaOlympian2287) arrayDeque.poll()).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
    }
}
