package O2;

import D.C0285o;
import D.s;
import D.u;
import D.x;
import Q2.InterfaceC0360e;
import R2.q;
import R2.w;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.AbstractActivityC0484x;
import androidx.fragment.app.C0462a;
import androidx.fragment.app.N;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2267c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f2268d = new e();

    public static AlertDialog e(Activity activity, int i, q qVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(R2.p.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(C5248R.string.common_google_play_services_enable_button) : resources.getString(C5248R.string.common_google_play_services_update_button) : resources.getString(C5248R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String c9 = R2.p.c(activity, i);
        if (c9 != null) {
            builder.setTitle(c9);
        }
        Log.w("GoogleApiAvailability", Wv.f(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0484x) {
                N supportFragmentManager = ((AbstractActivityC0484x) activity).getSupportFragmentManager();
                j jVar = new j();
                w.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f2276I0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f2277J0 = onCancelListener;
                }
                jVar.f4973F0 = false;
                jVar.f4974G0 = true;
                supportFragmentManager.getClass();
                C0462a c0462a = new C0462a(supportFragmentManager);
                c0462a.f4910o = true;
                c0462a.e(0, jVar, str, 1);
                c0462a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        w.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f2260n = alertDialog;
        if (onCancelListener != null) {
            cVar.f2261u = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e9 = e(googleApiActivity, i, new q(super.b(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (e9 == null) {
            return;
        }
        f(googleApiActivity, e9, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i4;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", x.j(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e9 = i == 6 ? R2.p.e(context, "common_google_play_services_resolution_required_title") : R2.p.c(context, i);
        if (e9 == null) {
            e9 = context.getResources().getString(C5248R.string.common_google_play_services_notification_ticker);
        }
        String d9 = (i == 6 || i == 19) ? R2.p.d(context, "common_google_play_services_resolution_required_text", R2.p.a(context)) : R2.p.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        u uVar = new u(context, null);
        uVar.f402o = true;
        uVar.d(16, true);
        uVar.f393e = u.b(e9);
        s sVar = new s(0);
        sVar.f388f = u.b(d9);
        uVar.g(sVar);
        PackageManager packageManager = context.getPackageManager();
        if (V2.b.f3396c == null) {
            V2.b.f3396c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (V2.b.f3396c.booleanValue()) {
            uVar.f409v.icon = context.getApplicationInfo().icon;
            uVar.f397j = 2;
            if (V2.b.i(context)) {
                uVar.f390b.add(new C0285o(2131231108, pendingIntent, resources.getString(C5248R.string.common_open_on_phone)));
            } else {
                uVar.f395g = pendingIntent;
            }
        } else {
            uVar.f409v.icon = R.drawable.stat_sys_warning;
            uVar.f409v.tickerText = u.b(resources.getString(C5248R.string.common_google_play_services_notification_ticker));
            uVar.f409v.when = System.currentTimeMillis();
            uVar.f395g = pendingIntent;
            uVar.f394f = u.b(d9);
        }
        if (V2.b.f()) {
            w.k(V2.b.f());
            synchronized (f2267c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(C5248R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(C1.b.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            uVar.f406s = "com.google.android.gms.availability";
        }
        Notification a9 = uVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f2271a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, a9);
    }

    public final void h(Activity activity, InterfaceC0360e interfaceC0360e, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e9 = e(activity, i, new q(super.b(activity, "d", i), interfaceC0360e, 1), onCancelListener);
        if (e9 == null) {
            return;
        }
        f(activity, e9, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
