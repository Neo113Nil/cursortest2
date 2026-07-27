package android.content.Context;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterWorkManagerSpectraMax9975 implements Runnable {
    public final /* synthetic */ boolean FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterWorkManagerSpectraMax9975(int i, Object obj, Object obj2, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterKeyframeGammaGamma1197 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterKeyframeGammaGamma1197;
        boolean z = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj2).lambda$setPushToken$33(z, (String) obj);
                return;
            case 1:
                ((ActivityHandler) obj2).lambda$setPushToken$32(z, (String) obj);
                return;
            default:
                Context context = (Context) obj2;
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = (FrostHunterIntentBetaElite8730) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterBillingClientFusionVortex9008(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    frostHunterIntentBetaElite8730.FrostHunterBundlePulseFusionHero2475(null);
                }
        }
    }
}
