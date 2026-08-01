package u2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.C2555Fh;
import com.google.android.gms.internal.ads.C2657Lh;
import com.google.android.gms.internal.ads.C2674Mh;
import com.google.android.gms.internal.ads.C3068d9;
import p2.C4835j;

/* loaded from: classes.dex */
public class E extends a4.e {
    @Override // a4.e
    public final C2657Lh p(C2555Fh c2555Fh, C3068d9 c3068d9, boolean z3, BinderC2880Yp binderC2880Yp) {
        return new C2674Mh(c2555Fh, c3068d9, z3, binderC2880Yp);
    }

    @Override // a4.e
    public final int r(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        D d2 = C4835j.f39733C.f39738c;
        if (!D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 1;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? 2 : 1;
    }

    @Override // a4.e
    public final void s(Context context) {
        S3.i.u();
        NotificationChannel b9 = x.b(((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.H9)).intValue());
        b9.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(b9);
    }

    @Override // a4.e
    public final boolean t(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // a4.e
    public final Intent u(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
