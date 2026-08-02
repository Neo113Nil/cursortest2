package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaqt {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzaqt(String str, zzapj zzapjVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzapjVar.zzb;
        long j = zzapjVar.zzc;
        long j2 = zzapjVar.zzd;
        long j3 = zzapjVar.zze;
        long j4 = zzapjVar.zzf;
        List list = zzapjVar.zzh;
        if (list == null) {
            Map map = zzapjVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzaps((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    static zzaqt zza(zzaqu zzaquVar) throws IOException {
        if (zzaqw.zze(zzaquVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzaqw.zzh(zzaquVar);
        String zzh2 = zzaqw.zzh(zzaquVar);
        long zzf = zzaqw.zzf(zzaquVar);
        long zzf2 = zzaqw.zzf(zzaquVar);
        long zzf3 = zzaqw.zzf(zzaquVar);
        long zzf4 = zzaqw.zzf(zzaquVar);
        int zze = zzaqw.zze(zzaquVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzaps(zzaqw.zzh(zzaquVar).intern(), zzaqw.zzh(zzaquVar).intern()));
        }
        return new zzaqt(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzaqt(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
