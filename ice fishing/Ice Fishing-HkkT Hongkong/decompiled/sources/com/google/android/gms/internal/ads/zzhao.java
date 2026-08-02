package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzhao extends zzhas {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhao() {
        super(null);
    }

    /* synthetic */ zzhao(zzhan zzhanVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzhal zzhalVar;
        List list = (List) zzhcz.zzh(obj, j);
        if (list.isEmpty()) {
            List zzhalVar2 = list instanceof zzham ? new zzhal(i) : ((list instanceof zzhbm) && (list instanceof zzhad)) ? ((zzhad) list).zzd(i) : new ArrayList(i);
            zzhcz.zzv(obj, j, zzhalVar2);
            return zzhalVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzhcz.zzv(obj, j, arrayList);
            zzhalVar = arrayList;
        } else {
            if (!(list instanceof zzhcu)) {
                if (!(list instanceof zzhbm) || !(list instanceof zzhad)) {
                    return list;
                }
                zzhad zzhadVar = (zzhad) list;
                if (zzhadVar.zzc()) {
                    return list;
                }
                zzhad zzd = zzhadVar.zzd(list.size() + i);
                zzhcz.zzv(obj, j, zzd);
                return zzd;
            }
            zzhal zzhalVar3 = new zzhal(list.size() + i);
            zzhalVar3.addAll(zzhalVar3.size(), (zzhcu) list);
            zzhcz.zzv(obj, j, zzhalVar3);
            zzhalVar = zzhalVar3;
        }
        return zzhalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzhcz.zzh(obj, j);
        if (list instanceof zzham) {
            unmodifiableList = ((zzham) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzhbm) && (list instanceof zzhad)) {
                zzhad zzhadVar = (zzhad) list;
                if (zzhadVar.zzc()) {
                    zzhadVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhcz.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzhcz.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzhcz.zzv(obj, j, list);
    }
}
