package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.zzae;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgn {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    public final zzx zzd;

    public zzgn(zzx zzxVar) {
        this.zzd = zzxVar;
    }

    public static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        zzae.checkNotNull(atomicReference);
        zzae.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzf, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzb$1, zzjm.zza$1, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("experiment_id(", str, ")") : zzg(str, zzjm.zzb$2, zzjm.zza$2, zzc);
    }

    public final String zzd(zzbh zzbhVar) {
        zzx zzxVar = this.zzd;
        if (!zzxVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbhVar.zza));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.zzb;
        sb.append(zzbfVar == null ? null : !zzxVar.zza() ? zzbfVar.toString() : zze(zzbfVar.zzf()));
        return sb.toString();
    }

    public final String zze(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (m.length() != 8) {
                m.append(", ");
            }
            m.append(zzb(str));
            m.append("=");
            Object obj = bundle.get(str);
            m.append(obj instanceof Bundle ? zzf(new Object[]{obj}) : obj instanceof Object[] ? zzf((Object[]) obj) : obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        m.append("}]");
        return m.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("[");
        for (Object obj : objArr) {
            String zze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (zze != null) {
                if (m.length() != 1) {
                    m.append(", ");
                }
                m.append(zze);
            }
        }
        m.append("]");
        return m.toString();
    }
}
