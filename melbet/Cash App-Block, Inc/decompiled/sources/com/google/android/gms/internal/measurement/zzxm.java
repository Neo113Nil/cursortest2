package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.SystemClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzxm {
    public static final zzzk zza;
    public static final zzzl zzb;

    static {
        int i = 1;
        zza = new zzzk(i);
        zzb = new zzzl(i);
    }

    public static zzzm zza(Set set) {
        zzzm zzzmVar = new zzzm();
        zzzmVar.zzf = zzb;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzyl zzylVar = (zzyl) it.next();
            HashMap hashMap = (HashMap) zzzmVar.zzd;
            HashMap hashMap2 = (HashMap) zzzmVar.zzc;
            zzky.zza(zzylVar, "key");
            boolean z = zzylVar.zzc;
            if (!z) {
                hashMap.remove(zzylVar);
                hashMap2.put(zzylVar, zzzm.zza);
            } else {
                if (!z) {
                    a$$ExternalSyntheticBUOutline0.m$3("key must be repeating");
                    return null;
                }
                hashMap2.remove(zzylVar);
                hashMap.put(zzylVar, zzzm.zzb);
            }
        }
        return zzzmVar;
    }

    public static File zza(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        a$$ExternalSyntheticBUOutline0.m$1("getFilesDir returned null twice.");
        return null;
    }

    public static /* synthetic */ boolean zza(int i, zzyc zzycVar, StringBuilder sb) {
        if (i - 1 != 0 || zzycVar == zzyc.zza) {
            return false;
        }
        sb.append(zzycVar.zza());
        sb.append('.');
        sb.append(zzycVar.zzb());
        sb.append(':');
        sb.append(zzycVar.zzc());
        return true;
    }
}
