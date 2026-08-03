package m6;

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
import com.google.android.gms.common.api.GoogleApiActivity;
import o6.s0;
import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4912c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f4913d = new e();

    public static AlertDialog d(Activity activity, int i10, p6.n nVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(p6.m.b(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(org.fortheloss.st.R.string.common_google_play_services_enable_button) : resources.getString(org.fortheloss.st.R.string.common_google_play_services_update_button) : resources.getString(org.fortheloss.st.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, nVar);
        }
        String c3 = p6.m.c(activity, i10);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", a4.d.g("Creating dialog for Google Play services availability issue. ConnectionResult=", i10), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        u.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f4906g = alertDialog;
        cVar.f4907h = onCancelListener;
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog d10 = d(googleApiActivity, i10, new p6.n(super.a(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d10 == null) {
            return;
        }
        e(googleApiActivity, d10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", a4.d.h("GMS core API Availability. ConnectionResult=", i10, ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e10 = i10 == 6 ? p6.m.e(context, "common_google_play_services_resolution_required_title") : p6.m.c(context, i10);
        if (e10 == null) {
            e10 = context.getResources().getString(org.fortheloss.st.R.string.common_google_play_services_notification_ticker);
        }
        String d10 = (i10 == 6 || i10 == 19) ? p6.m.d(context, "common_google_play_services_resolution_required_text", p6.m.a(context)) : p6.m.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        u.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        x2.i iVar = new x2.i(context, null);
        iVar.f8250o = true;
        iVar.d(16, true);
        iVar.f8240e = x2.i.b(e10);
        x2.g gVar = new x2.g(0);
        gVar.f8235f = x2.i.b(d10);
        iVar.g(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (t6.b.f6533b == null) {
            t6.b.f6533b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (t6.b.f6533b.booleanValue()) {
            iVar.f8257v.icon = context.getApplicationInfo().icon;
            iVar.f8245j = 2;
            if (t6.b.b(context)) {
                iVar.f8237b.add(new x2.c(2131165288, resources.getString(org.fortheloss.st.R.string.common_open_on_phone), pendingIntent));
            } else {
                iVar.f8242g = pendingIntent;
            }
        } else {
            iVar.f8257v.icon = R.drawable.stat_sys_warning;
            iVar.f8257v.tickerText = x2.i.b(resources.getString(org.fortheloss.st.R.string.common_google_play_services_notification_ticker));
            iVar.f8257v.when = System.currentTimeMillis();
            iVar.f8242g = pendingIntent;
            iVar.f8241f = x2.i.b(d10);
        }
        synchronized (f4912c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(org.fortheloss.st.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        iVar.f8254s = "com.google.android.gms.availability";
        Notification a6 = iVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            h.f4916a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, a6);
    }

    public final void g(Activity activity, s0 s0Var, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d10 = d(activity, i10, new p6.n(super.a(i10, activity, "d"), s0Var, 1), onCancelListener);
        if (d10 == null) {
            return;
        }
        e(activity, d10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
