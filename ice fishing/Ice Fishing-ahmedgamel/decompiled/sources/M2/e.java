package M2;

import D.C0297p;
import D.t;
import D.v;
import D.y;
import O2.InterfaceC0355e;
import P2.q;
import P2.w;
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
import androidx.fragment.app.AbstractActivityC0480x;
import androidx.fragment.app.C0458a;
import androidx.fragment.app.N;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import com.icefishing.icefishingbigwin.C5275R;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1841c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f1842d = new e();

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
        builder.setMessage(P2.p.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(C5275R.string.common_google_play_services_enable_button) : resources.getString(C5275R.string.common_google_play_services_update_button) : resources.getString(C5275R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String c9 = P2.p.c(activity, i);
        if (c9 != null) {
            builder.setTitle(c9);
        }
        Log.w("GoogleApiAvailability", AbstractC4404f.e(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0480x) {
                N supportFragmentManager = ((AbstractActivityC0480x) activity).getSupportFragmentManager();
                j jVar = new j();
                w.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f1850N0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f1851O0 = onCancelListener;
                }
                jVar.f5010K0 = false;
                jVar.f5011L0 = true;
                supportFragmentManager.getClass();
                C0458a c0458a = new C0458a(supportFragmentManager);
                c0458a.f4942o = true;
                c0458a.e(0, jVar, str, 1);
                c0458a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        w.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f1834n = alertDialog;
        if (onCancelListener != null) {
            cVar.f1835u = onCancelListener;
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
        int i6;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", y.k(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
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
        String e9 = i == 6 ? P2.p.e(context, "common_google_play_services_resolution_required_title") : P2.p.c(context, i);
        if (e9 == null) {
            e9 = context.getResources().getString(C5275R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? P2.p.d(context, "common_google_play_services_resolution_required_text", P2.p.a(context)) : P2.p.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        v vVar = new v(context, null);
        vVar.f507o = true;
        vVar.d(16, true);
        vVar.f498e = v.b(e9);
        t tVar = new t(0);
        tVar.f493f = v.b(d2);
        vVar.g(tVar);
        PackageManager packageManager = context.getPackageManager();
        if (T2.b.f3080c == null) {
            T2.b.f3080c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (T2.b.f3080c.booleanValue()) {
            vVar.f514v.icon = context.getApplicationInfo().icon;
            vVar.f502j = 2;
            if (T2.b.i(context)) {
                vVar.f495b.add(new C0297p(2131231108, pendingIntent, resources.getString(C5275R.string.common_open_on_phone)));
            } else {
                vVar.f500g = pendingIntent;
            }
        } else {
            vVar.f514v.icon = R.drawable.stat_sys_warning;
            vVar.f514v.tickerText = v.b(resources.getString(C5275R.string.common_google_play_services_notification_ticker));
            vVar.f514v.when = System.currentTimeMillis();
            vVar.f500g = pendingIntent;
            vVar.f499f = v.b(d2);
        }
        if (T2.b.f()) {
            w.k(T2.b.f());
            synchronized (f1841c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(C5275R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(A1.b.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            vVar.f511s = "com.google.android.gms.availability";
        }
        Notification a9 = vVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f1845a.set(false);
            i6 = 10436;
        } else {
            i6 = 39789;
        }
        notificationManager.notify(i6, a9);
    }

    public final void h(Activity activity, InterfaceC0355e interfaceC0355e, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e9 = e(activity, i, new q(super.b(activity, "d", i), interfaceC0355e, 1), onCancelListener);
        if (e9 == null) {
            return;
        }
        f(activity, e9, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
