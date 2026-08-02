package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import net.oneformapp.schema.Schema;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public abstract class zzkf {

    /* renamed from: zza, reason: collision with other field name */
    public static volatile Schema f78zza;

    /* renamed from: zzb, reason: collision with other field name */
    public static volatile Schema f79zzb;

    /* renamed from: zzb, reason: collision with other field name */
    public static final char[] f80zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final zzez zza = new zzez(5);

    /* renamed from: zza, reason: collision with other field name */
    public static final zzmg f77zza = new zzmg();
    public static final zzmg zzb = new zzmg();

    public static final void zza(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            int length = String.valueOf(j).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(j2).length() + 11 + String.valueOf(j3).length());
            Boxes$$ExternalSyntheticOutline1.m1151m(j, "size=", " offset=", sb);
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                try {
                    return BaseEncoding$StandardBaseEncoding.BASE16.encode(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(signature.toByteArray()));
                } catch (NoSuchAlgorithmException e) {
                    Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e2);
            return null;
        }
    }

    public static zzyr zza(Set set) {
        zzyr zzyrVar = new zzyr();
        zzyrVar.zzf = zzb;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzxq zzxqVar = (zzxq) it.next();
            HashMap hashMap = (HashMap) zzyrVar.zzd;
            HashMap hashMap2 = (HashMap) zzyrVar.zzc;
            if (zzxqVar != null) {
                boolean z = zzxqVar.zzc;
                if (!z) {
                    hashMap.remove(zzxqVar);
                    hashMap2.put(zzxqVar, zzyr.zza);
                } else if (z) {
                    hashMap2.remove(zzxqVar);
                    hashMap.put(zzxqVar, zzyr.zzb);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("key must be repeating");
                    return null;
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$2("key".concat(" must not be null"));
                return null;
            }
        }
        return zzyrVar;
    }

    public static void zza(Object obj) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Cannot return null from a non-@Nullable @Provides method");
    }
}
