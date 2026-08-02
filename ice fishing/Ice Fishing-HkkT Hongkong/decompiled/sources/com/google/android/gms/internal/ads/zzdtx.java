package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzdtx {
    private final Map zza = new HashMap();

    zzdtx() {
    }

    @Nullable
    public final synchronized zzdtw zza(String str) {
        return (zzdtw) this.zza.get(str);
    }

    @Nullable
    public final zzdtw zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdtw zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbvg zzbvgVar;
        zzdtw zza = zza(str);
        return (zza == null || (zzbvgVar = zza.zzb) == null) ? "" : zzbvgVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzd(String str, @Nullable zzfif zzfifVar) {
        zzbvg zze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbvg zzbvgVar = null;
        if (zzfifVar != null) {
            try {
                zze = zzfifVar.zze();
            } catch (zzfho unused) {
            }
            if (zzfifVar != null) {
                try {
                    zzbvgVar = zzfifVar.zzf();
                } catch (zzfho unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjk)).booleanValue()) {
                if (zzfifVar != null) {
                    try {
                        zzfifVar.zzC();
                    } catch (zzfho unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdtw(str, zze, zzbvgVar, z));
        }
        zze = null;
        if (zzfifVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjk)).booleanValue()) {
        }
        this.zza.put(str, new zzdtw(str, zze, zzbvgVar, z2));
    }

    final synchronized void zze(String str, zzbus zzbusVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtw(str, zzbusVar.zzf(), zzbusVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
