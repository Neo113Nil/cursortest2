package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.os.BundleKt;
import coil3.request.ViewTargetDisposable;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.wrappers.Wrappers;
import com.squareup.cash.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class GooglePlayServicesUtilLight {
    public static boolean zza = false;
    public static boolean zzb = false;
    public static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    public static final AtomicBoolean zzc = new AtomicBoolean();

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zzb) {
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(134217792, "com.google.android.gms");
                    ViewTargetDisposable.getInstance(context);
                    if (packageInfo == null || ViewTargetDisposable.zza(packageInfo, false) || !ViewTargetDisposable.zza(packageInfo, true)) {
                        zza = false;
                    } else {
                        zza = true;
                    }
                    zzb = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    zzb = true;
                }
            }
            return zza || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            zzb = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        boolean z;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            synchronized (com.google.android.gms.common.internal.zzae.zza) {
                try {
                    if (!com.google.android.gms.common.internal.zzae.zzb) {
                        com.google.android.gms.common.internal.zzae.zzb = true;
                        try {
                            bundle = Wrappers.packageManager(context).getApplicationInfo(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            com.google.android.gms.common.internal.zzae.zzd = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = com.google.android.gms.common.internal.zzae.zzd;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        try {
            if (!BundleKt.isWearableWithoutPlayStore(context)) {
                if (BundleKt.zzj == null) {
                    BundleKt.zzj = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!BundleKt.zzj.booleanValue()) {
                    z = true;
                    com.google.android.gms.common.internal.zzae.checkArgument(i < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
                    ViewTargetDisposable.getInstance(context);
                    if (ViewTargetDisposable.zza(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z) {
                            com.google.android.gms.common.internal.zzae.checkNotNull(packageInfo);
                            if (!ViewTargetDisposable.zza(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            if (Hex.zza(packageInfo2.versionCode) >= Hex.zza(i)) {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        return 1;
                                    }
                                }
                                return !applicationInfo.enabled ? 3 : 0;
                            }
                            int i3 = packageInfo2.versionCode;
                            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
                            sb.append("Google Play services out of date for ");
                            sb.append(packageName);
                            sb.append(".  Requires ");
                            sb.append(i);
                            sb.append(" but found ");
                            sb.append(i3);
                            Log.w("GooglePlayServicesUtil", sb.toString());
                            return 2;
                        }
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            ViewTargetDisposable.getInstance(context);
            if (ViewTargetDisposable.zza(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z = false;
        com.google.android.gms.common.internal.zzae.checkArgument(i < 0);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z) {
        }
    }

    public static boolean zza(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", PKIFailureInfo.certRevoked).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
