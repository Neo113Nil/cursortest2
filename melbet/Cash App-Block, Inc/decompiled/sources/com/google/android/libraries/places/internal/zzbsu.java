package com.google.android.libraries.places.internal;

import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class zzbsu {
    public static zzbsu zza;
    public final Object zzb = new Object();
    public final HashSet zzc = new HashSet();
    public zzbsb[] zzd = new zzbsb[5];
    public int zze;

    public static synchronized zzbsu zza() {
        zzbsu zzbsuVar;
        synchronized (zzbsu.class) {
            try {
                if (zza == null) {
                    zza = new zzbsu();
                }
                zzbsuVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbsuVar;
    }

    public final zzbsb zzc(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        zzbsb zzbsbVar;
        Trace.checkArgument("missing metric name", !TransactorKt.stringIsNullOrEmpty(str));
        synchronized (this.zzb) {
            try {
                HashSet hashSet = this.zzc;
                if (hashSet.contains(str)) {
                    StringBuilder sb = new StringBuilder(str.length() + 32);
                    sb.append("Metric with name ");
                    sb.append(str);
                    sb.append(" already exists");
                    throw new IllegalStateException(sb.toString());
                }
                int i = this.zze;
                int i2 = i + 1;
                zzbsb[] zzbsbVarArr = this.zzd;
                if (i2 == zzbsbVarArr.length) {
                    this.zzd = (zzbsb[]) Arrays.copyOf(zzbsbVarArr, zzbsbVarArr.length + 5);
                }
                zzbsbVar = new zzbsb(i, str, arrayList, arrayList2);
                this.zzd[i] = zzbsbVar;
                hashSet.add(str);
                this.zze++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbsbVar;
    }
}
