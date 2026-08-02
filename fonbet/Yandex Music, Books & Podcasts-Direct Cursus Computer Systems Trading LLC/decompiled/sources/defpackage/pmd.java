package defpackage;

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
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.d0;
import androidx.core.app.f0;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public class pmd extends qmd {
    public static final Object d = new Object();
    public static final pmd e = new pmd();
    public static final int c = qmd.a;

    public static AlertDialog e(Activity activity, int i, eyw eywVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(ixw.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(ru.yandex.music.R.string.common_google_play_services_enable_button) : resources.getString(ru.yandex.music.R.string.common_google_play_services_update_button) : resources.getString(ru.yandex.music.R.string.common_google_play_services_install_button);
        if (string != null) {
            if (eywVar == null) {
                eywVar = null;
            }
            builder.setPositiveButton(string, eywVar);
        }
        String c2 = ixw.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", k5r.i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static fxw f(Context context, exw exwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        fxw fxwVar = new fxw(exwVar);
        ryw.p0(context, fxwVar, intentFilter);
        fxwVar.a(context);
        if (rnd.a(context)) {
            return fxwVar;
        }
        exwVar.a();
        fxwVar.b();
        return null;
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof t) {
                y supportFragmentManager = ((t) activity).getSupportFragmentManager();
                isr isrVar = new isr();
                y1g.H(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                isrVar.g = alertDialog;
                isrVar.h = onCancelListener;
                isrVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ifb ifbVar = new ifb();
        y1g.H(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        ifbVar.a = alertDialog;
        ifbVar.b = onCancelListener;
        ifbVar.show(fragmentManager, str);
    }

    public final onx c(Activity activity) {
        y1g.B("makeGooglePlayServicesAvailable must be called from the main thread");
        int b = super.b(activity, c);
        if (b == 0) {
            return ywf.w(null);
        }
        vyf c2 = LifecycleCallback.c(new oyf(activity));
        nxw nxwVar = (nxw) c2.b("GmsAvailabilityHelper", nxw.class);
        if (nxwVar == null) {
            nxwVar = new nxw(c2);
            nxwVar.f = new i8s();
            c2.a("GmsAvailabilityHelper", nxwVar);
        } else if (nxwVar.f.a.k()) {
            nxwVar.f = new i8s();
        }
        nxwVar.m(new h66(b, null), 0);
        return nxwVar.f.a;
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e2 = e(googleApiActivity, i, eyw.b(googleApiActivity, super.a(googleApiActivity, "d", i), 2), googleApiActivity2);
        if (e2 == null) {
            return;
        }
        g(googleApiActivity, e2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", dfi.c(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new xxw(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = i == 6 ? ixw.e(context, "common_google_play_services_resolution_required_title") : ixw.c(context, i);
        if (e2 == null) {
            e2 = context.getResources().getString(ru.yandex.music.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? ixw.d(context, "common_google_play_services_resolution_required_text", ixw.a(context)) : ixw.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y1g.G(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        f0 f0Var = new f0(context, null);
        f0Var.v = true;
        f0Var.g(16, true);
        f0Var.e = f0.c(e2);
        d0 d0Var = new d0();
        d0Var.b = f0.c(d2);
        f0Var.k(d0Var);
        PackageManager packageManager = context.getPackageManager();
        if (sj2.l == null) {
            sj2.l = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (sj2.l.booleanValue()) {
            f0Var.K.icon = context.getApplicationInfo().icon;
            f0Var.k = 2;
            if (sj2.x(context)) {
                f0Var.a(2131231110, resources.getString(ru.yandex.music.R.string.common_open_on_phone), pendingIntent);
            } else {
                f0Var.g = pendingIntent;
            }
        } else {
            f0Var.K.icon = R.drawable.stat_sys_warning;
            f0Var.K.tickerText = f0.c(resources.getString(ru.yandex.music.R.string.common_google_play_services_notification_ticker));
            f0Var.K.when = System.currentTimeMillis();
            f0Var.g = pendingIntent;
            f0Var.d(d2);
        }
        if (fxf.F()) {
            if (!fxf.F()) {
                e7o.n();
                return;
            }
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(ru.yandex.music.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            f0Var.E = "com.google.android.gms.availability";
        }
        Notification b = f0Var.b();
        if (i == 1 || i == 2 || i == 3) {
            rnd.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b);
    }

    public final void i(Activity activity, vyf vyfVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e2 = e(activity, i, eyw.c(vyfVar, super.a(activity, "d", i), 2), onCancelListener);
        if (e2 == null) {
            return;
        }
        g(activity, e2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
