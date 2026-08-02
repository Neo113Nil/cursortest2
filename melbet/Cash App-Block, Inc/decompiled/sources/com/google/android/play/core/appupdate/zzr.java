package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzx;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzr {
    public static final Obfuscator zzb = new Obfuscator("AppUpdateService", 1);
    public static final Intent zzc = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final zzx zza;
    public final String zzd;
    public final Context zze;
    public final zzt zzf;

    public zzr(Context context, zzt zztVar) {
        String str;
        this.zzd = context.getPackageName();
        this.zze = context;
        this.zzf = zztVar;
        Obfuscator obfuscator = zzab.zza;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Obfuscator obfuscator2 = zzab.zza;
                    Object[] objArr = new Object[0];
                    obfuscator2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", Obfuscator.zzf(obfuscator2.salt, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.zza = new zzx(applicationContext != null ? applicationContext : context, zzb, zzc);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle zzb(zzr zzrVar, String str) {
        Map map;
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap hashMap = com.google.android.play.core.appupdate.internal.zzi.zzc;
        synchronized (com.google.android.play.core.appupdate.internal.zzi.class) {
            try {
                HashMap hashMap2 = com.google.android.play.core.appupdate.internal.zzi.zzc;
                if (!hashMap2.containsKey("app_update")) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("java", 11004);
                    hashMap2.put("app_update", hashMap3);
                }
                map = (Map) hashMap2.get("app_update");
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(zzrVar.zze.getPackageManager().getPackageInfo(zzrVar.zze.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Obfuscator obfuscator = zzb;
            Object[] objArr = new Object[0];
            obfuscator.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", Obfuscator.zzf(obfuscator.salt, "The current version of the app could not be retrieved", objArr));
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
