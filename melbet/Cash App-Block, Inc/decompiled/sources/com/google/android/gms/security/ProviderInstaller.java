package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class ProviderInstaller {
    public static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.zza;
    public static final Object zzb = new Object();
    public static Method zzc = null;
    public static boolean zzd = false;

    public static void installIfNeeded(Context context) {
        Context context2;
        Context context3;
        zzae.checkNotNull(context, "Context must not be null");
        zza.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.zza;
        int isGooglePlayServicesAvailable = googleApiAvailabilityLight.isGooglePlayServicesAvailable(context, 11925000);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(isGooglePlayServicesAvailable).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(isGooglePlayServicesAvailable);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (zzb) {
            Context context4 = null;
            if (!zzd) {
                try {
                    context3 = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").zzk;
                } catch (DynamiteModule.LoadingException e) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                    context3 = null;
                }
                if (context3 != null) {
                    zzb(context3, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z = zzd;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                zzd = true;
                if (!z) {
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = context2.getClassLoader();
                        zbc zbcVar = new zbc((Object) Context.class, (Object) context, false, 9);
                        Class cls = Long.TYPE;
                        zzj.zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zbcVar, new zzh(cls, Long.valueOf(uptimeMillis), false, 9), new zzh(cls, Long.valueOf(uptimeMillis2), false, 9));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context4 = context2;
            }
            if (context4 != null) {
                zzb(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void zzb(Context context, String str) {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
