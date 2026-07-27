package kotlin.text;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGlideCoroutine implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ boolean CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGlideCoroutine(int i, Object obj, Object obj2, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = z;
        this.CatchingFishViewModelScope = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.CatchingFishDaggerWebsocket).lambda$setPushToken$33(this.CatchingFishWorkManager, (String) this.CatchingFishViewModelScope);
                return;
            case 1:
                ((ActivityHandler) this.CatchingFishDaggerWebsocket).lambda$setPushToken$32(this.CatchingFishWorkManager, (String) this.CatchingFishViewModelScope);
                return;
            default:
                Context context = (Context) this.CatchingFishDaggerWebsocket;
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) this.CatchingFishViewModelScope;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = CatchingFishLayoutRoom.CatchingFishRoomDatabase(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.CatchingFishWorkManager) {
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
                    catchingFishAndroidXPayPal.CatchingFishCoroutine(null);
                }
        }
    }
}
