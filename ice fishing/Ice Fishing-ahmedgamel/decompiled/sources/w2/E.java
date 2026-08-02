package w2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.C2575Fh;
import com.google.android.gms.internal.ads.C2677Lh;
import com.google.android.gms.internal.ads.C2694Mh;
import com.google.android.gms.internal.ads.C3091d9;
import r2.C4906k;

/* loaded from: classes.dex */
public class E extends O2.i {
    @Override // O2.i
    public final C2677Lh s(C2575Fh c2575Fh, C3091d9 c3091d9, boolean z6, BinderC2903Yp binderC2903Yp) {
        return new C2694Mh(c2575Fh, c3091d9, z6, binderC2903Yp);
    }

    @Override // O2.i
    public final int u(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        D d9 = C4906k.f40186C.f40191c;
        if (!D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 1;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? 2 : 1;
    }

    @Override // O2.i
    public final void v(Context context) {
        S6.a.u();
        NotificationChannel b9 = x.b(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.H9)).intValue());
        b9.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(b9);
    }

    @Override // O2.i
    public final boolean w(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // O2.i
    public final Intent x(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
