package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
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
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.common.internal.zaj;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public zaq zad;
    public static final Object zaa = new Object();
    public static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static AlertDialog zaa(Activity activity, int i, zaj zajVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zaf.zac(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zae = zaf.zae(activity, i);
        if (zae != null) {
            builder.setPositiveButton(zae, zajVar);
        }
        String zaa2 = zaf.zaa(activity, i);
        if (zaa2 != null) {
            builder.setTitle(zaa2);
        }
        Log.w("GoogleApiAvailability", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static zabs zag(Context context, zabr zabrVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabs zabsVar = new zabs(zabrVar);
        Strings.registerReceiver(context, zabsVar, intentFilter, null, 2);
        zabsVar.zaa(context);
        if (GooglePlayServicesUtilLight.zza(context)) {
            return zabsVar;
        }
        zabrVar.zaa();
        zabsVar.zab();
        return null;
    }

    public static void zah(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(alertDialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final void showErrorDialogFragment(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog zaa2 = zaa(googleApiActivity, i, zaj.zab(super.getErrorResolutionIntent(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (zaa2 == null) {
            return;
        }
        zah(googleApiActivity, zaa2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void zab(Activity activity, LifecycleFragment lifecycleFragment, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog zaa2 = zaa(activity, i, zaj.zad(super.getErrorResolutionIntent(activity, i, "d"), lifecycleFragment), onCancelListener);
        if (zaa2 == null) {
            return;
        }
        zah(activity, zaa2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void zac(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String zab2 = zaf.zab(context, i);
        String zad = zaf.zad(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.zzae.checkNotNull(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setLocalOnly();
        builder.setAutoCancel(true);
        builder.setContentTitle(zab2);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText(zad);
        builder.setStyle(bigTextStyle);
        PackageManager packageManager = context.getPackageManager();
        if (BundleKt.zzf == null) {
            BundleKt.zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = BundleKt.zzf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            builder.setSmallIcon(i3);
            builder.setPriority();
            if (BundleKt.isWearableWithoutPlayStore(context)) {
                builder.addAction(2131231277, pendingIntent, resources.getString(com.squareup.cash.R.string.common_open_on_phone));
            } else {
                builder.setContentIntent(pendingIntent);
            }
        } else {
            builder.setSmallIcon(R.drawable.stat_sys_warning);
            builder.setTicker(resources.getString(com.squareup.cash.R.string.common_google_play_services_notification_ticker));
            builder.setWhen(System.currentTimeMillis());
            builder.setContentIntent(pendingIntent);
            builder.setContentText(zad);
        }
        synchronized (zaa) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(com.squareup.cash.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        builder.setChannelId();
        Notification build = builder.build();
        if (i == 1 || i == 2 || i == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, build);
    }

    public final void zae(Context context, ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.zze;
        int intValue = num == null ? -1 : num.intValue();
        zab zabVar = new zab(intValue, connectionResult.zzb, System.currentTimeMillis(), context.getPackageName(), z);
        if (this.zad == null) {
            this.zad = new zaq(context);
        }
        this.zad.zaa(zabVar);
    }
}
