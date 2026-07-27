package t2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.C2486Bh;
import com.google.android.gms.internal.ads.C2588Hh;
import com.google.android.gms.internal.ads.C2605Ih;
import com.google.android.gms.internal.ads.C2914a9;

/* loaded from: classes.dex */
public class H extends W3.e {
    @Override // W3.e
    public final void A(Context context) {
        com.anythink.basead.exoplayer.k.A.v();
        NotificationChannel b9 = AbstractC5065A.b(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.H9)).intValue());
        b9.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(b9);
    }

    @Override // W3.e
    public final boolean B(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // W3.e
    public final Intent C(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // W3.e
    public final C2588Hh y(C2486Bh c2486Bh, C2914a9 c2914a9, boolean z8, BinderC2949aq binderC2949aq) {
        return new C2605Ih(c2486Bh, c2914a9, z8, binderC2949aq);
    }

    @Override // W3.e
    public final int z(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        G g9 = p2.j.f39798C.f39803c;
        if (!G.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 1;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? 2 : 1;
    }
}
