package com.gamericefishpro.space.s8;

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
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u8.t0;
import com.gamericefishpro.space.v8.c0;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e extends f {
    public static final Object c = new Object();
    public static final e d = new e();

    public static AlertDialog d(Activity activity, int i, com.gamericefishpro.space.v8.s sVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(com.gamericefishpro.space.v8.p.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.gamericefishpro.space.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.gamericefishpro.space.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.gamericefishpro.space.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            if (sVar == null) {
                sVar = null;
            }
            builder.setPositiveButton(string, sVar);
        }
        String strC = com.gamericefishpro.space.v8.p.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", com.gamericefishpro.space.m5.a.g(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        c0.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.d = alertDialog;
        cVar.e = onCancelListener;
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i, com.gamericefishpro.space.v8.s.b(googleApiActivity, super.a(i, googleApiActivity, "d"), 2), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", y0.f(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? com.gamericefishpro.space.v8.p.e(context, "common_google_play_services_resolution_required_title") : com.gamericefishpro.space.v8.p.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.gamericefishpro.space.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? com.gamericefishpro.space.v8.p.d(context, "common_google_play_services_resolution_required_text", com.gamericefishpro.space.v8.p.a(context)) : com.gamericefishpro.space.v8.p.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        c0.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        com.gamericefishpro.space.r3.i iVar = new com.gamericefishpro.space.r3.i(context, null);
        iVar.o = true;
        iVar.d(16, true);
        iVar.e = com.gamericefishpro.space.r3.i.b(strE);
        com.gamericefishpro.space.r3.g gVar = new com.gamericefishpro.space.r3.g(0);
        gVar.f = com.gamericefishpro.space.r3.i.b(strD);
        iVar.g(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (com.gamericefishpro.space.z8.b.c == null) {
            com.gamericefishpro.space.z8.b.c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (com.gamericefishpro.space.z8.b.c.booleanValue()) {
            iVar.v.icon = context.getApplicationInfo().icon;
            iVar.j = 2;
            if (com.gamericefishpro.space.z8.b.c(context)) {
                iVar.b.add(new com.gamericefishpro.space.r3.c(2131165315, resources.getString(com.gamericefishpro.space.R.string.common_open_on_phone), pendingIntent));
            } else {
                iVar.g = pendingIntent;
            }
        } else {
            iVar.v.icon = R.drawable.stat_sys_warning;
            iVar.v.tickerText = com.gamericefishpro.space.r3.i.b(resources.getString(com.gamericefishpro.space.R.string.common_google_play_services_notification_ticker));
            iVar.v.when = System.currentTimeMillis();
            iVar.g = pendingIntent;
            iVar.f = com.gamericefishpro.space.r3.i.b(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.gamericefishpro.space.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        iVar.s = "com.google.android.gms.availability";
        Notification notificationA = iVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void g(Activity activity, t0 t0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, com.gamericefishpro.space.v8.s.c(t0Var, super.a(i, activity, "d"), 2), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
