package android.content.Context;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowCollectorMegaTitaniumFusion9321 {
    public static final Pattern FrostHunterAlertDialogAuroraDelta3200 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static int FrostHunterCameraXPixelTurboCosmos9814;
    public static PendingIntent FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterTimerCosmosCyberLegend3595 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterTimerCosmosCyberLegend3595(0);
    public final FrostHunterGradlePulseOlympianTurbo1196 FrostHunterBundlePulseFusionHero2475;
    public final Context FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Messenger FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Messenger FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterAnalyticsCelestialBeta2989 FrostHunterRemoteConfigSpeedSpeed8566;
    public final ScheduledThreadPoolExecutor FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFlowCollectorMegaTitaniumFusion9321(Context context) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context;
        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo1196 = new FrostHunterGradlePulseOlympianTurbo1196();
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterFlowMaxDragonHero5809 = 0;
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200 = context;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterGradlePulseOlympianTurbo1196;
        this.FrostHunterLifecycleBlazeGammaElite2889 = new Messenger(new FrostHunterAsyncPrimeUltra7903(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.FrostHunterServiceEliteCelestialThunder1757 = scheduledThreadPoolExecutor;
    }

    public final FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterAlphaAnimationNeoCosmos5761(Bundle bundle) {
        String num;
        synchronized (FrostHunterFlowCollectorMegaTitaniumFusion9321.class) {
            int i = FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterCameraXPixelTurboCosmos9814 = i + 1;
            num = Integer.toString(i);
        }
        FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = new FrostHunterIntentBetaElite8730();
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterAlphaAnimationNeoCosmos5761.put(num, frostHunterIntentBetaElite8730);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.FrostHunterBundlePulseFusionHero2475.FrostHunterLooperHyperionForce4133() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        synchronized (FrostHunterFlowCollectorMegaTitaniumFusion9321.class) {
            try {
                if (FrostHunterFlowMaxDragonHero5809 == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    FrostHunterFlowMaxDragonHero5809 = PendingIntent.getBroadcast(context, 0, intent2, FrostHunterRoomDatabasePixelHeroStorm6144.FrostHunterAlphaAnimationNeoCosmos5761);
                }
                intent.putExtra("app", FrostHunterFlowMaxDragonHero5809);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.FrostHunterLifecycleBlazeGammaElite2889);
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232 != null || this.FrostHunterRemoteConfigSpeedSpeed8566 != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterCameraXPixelTurboCosmos9814;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTextInputEditTextBetaTitanDelta2402.FrostHunterAlertDialogAuroraDelta3200, new FrostHunterServicePhantomGammaTitan7103(this, num, this.FrostHunterServiceEliteCelestialThunder1757.schedule(new FrostHunterPlaceholderInfernoSparkTurbo6992(15, frostHunterIntentBetaElite8730), 30L, TimeUnit.SECONDS), 11));
            return frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        int FrostHunterLooperHyperionForce4133 = this.FrostHunterBundlePulseFusionHero2475.FrostHunterLooperHyperionForce4133();
        Context context2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (FrostHunterLooperHyperionForce4133 == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTextInputEditTextBetaTitanDelta2402.FrostHunterAlertDialogAuroraDelta3200, new FrostHunterServicePhantomGammaTitan7103(this, num, this.FrostHunterServiceEliteCelestialThunder1757.schedule(new FrostHunterPlaceholderInfernoSparkTurbo6992(15, frostHunterIntentBetaElite8730), 30L, TimeUnit.SECONDS), 11));
        return frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Bundle bundle, String str) {
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = (FrostHunterIntentBetaElite8730) this.FrostHunterAlphaAnimationNeoCosmos5761.remove(str);
                if (frostHunterIntentBetaElite8730 == null) {
                    return;
                }
                frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
