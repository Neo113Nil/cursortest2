package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzahn;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzy {
    public final /* synthetic */ zzad zza;
    public final String zzb;
    public final boolean zzc;
    public final zzii zzd;
    public final BitSet zze;
    public final BitSet zzf;
    public final ArrayMap zzg;
    public final ArrayMap zzh;

    public zzy(zzad zzadVar, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, ArrayMap arrayMap, ArrayMap arrayMap2) {
        this.zza = zzadVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = arrayMap;
        this.zzh = new ArrayMap(0);
        Iterator it = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) arrayMap2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zziiVar;
    }

    public final void zza(zzaa zzaaVar) {
        int zzb;
        switch (zzaaVar.$r8$classId) {
            case 0:
                zzb = ((zzff) zzaaVar.zzh).zzb();
                break;
            default:
                zzb = ((zzfn) zzaaVar.zzh).zzb();
                break;
        }
        boolean z = true;
        if (zzaaVar.zzd != null) {
            this.zzf.set(zzb, true);
        }
        Boolean bool = zzaaVar.zze;
        if (bool != null) {
            this.zze.set(zzb, bool.booleanValue());
        }
        if (zzaaVar.zzf != null) {
            Integer valueOf = Integer.valueOf(zzb);
            ArrayMap arrayMap = this.zzg;
            Long l = (Long) arrayMap.get(valueOf);
            long longValue = zzaaVar.zzf.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                arrayMap.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzaaVar.zzg != null) {
            Integer valueOf2 = Integer.valueOf(zzb);
            ArrayMap arrayMap2 = this.zzh;
            List list = (List) arrayMap2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                arrayMap2.put(valueOf2, list);
            }
            boolean z2 = false;
            switch (zzaaVar.$r8$classId) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                list.clear();
            }
            zzahn.zza();
            zzic zzicVar = (zzic) this.zza.$$delegate_0;
            zzal zzalVar = zzicVar.zzg;
            zzfx zzfxVar = zzfy.zzaF;
            String str = this.zzb;
            if (zzalVar.zzp(str, zzfxVar)) {
                switch (zzaaVar.$r8$classId) {
                    case 0:
                        z2 = ((zzff) zzaaVar.zzh).zzh();
                        break;
                }
                if (z2) {
                    list.clear();
                }
            }
            zzahn.zza();
            boolean zzp = zzicVar.zzg.zzp(str, zzfxVar);
            Long l2 = zzaaVar.zzg;
            if (!zzp) {
                list.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final zzhg zzb(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzhf zzi = zzhg.zzi();
        zzi.zzaY();
        ((zzhg) zzi.zza).zzj(i);
        zzi.zzaY();
        ((zzhg) zzi.zza).zzm(this.zzc);
        zzii zziiVar = this.zzd;
        if (zziiVar != null) {
            zzi.zzaY();
            ((zzhg) zzi.zza).zzl(zziiVar);
        }
        zzih zzj = zzii.zzj();
        zzj.zzc(zzpk.zzp(this.zze));
        zzj.zza(zzpk.zzp(this.zzf));
        ArrayMap arrayMap = this.zzg;
        if (arrayMap == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayMap.size);
            Iterator it = ((ArrayMap.KeySet) arrayMap.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) arrayMap.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.zzhp zze = zzhq.zze();
                    zze.zzaY();
                    ((zzhq) zze.zza).zzf(intValue);
                    long longValue = l.longValue();
                    zze.zzaY();
                    ((zzhq) zze.zza).zzh$1(longValue);
                    arrayList2.add((zzhq) zze.zzbd());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzj.zze(arrayList);
        }
        ArrayMap arrayMap2 = this.zzh;
        if (arrayMap2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayMap2.size);
            Iterator it2 = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.zzij zzf = zzik.zzf();
                int intValue2 = num2.intValue();
                zzf.zzaY();
                ((zzik) zzf.zza).zzh(intValue2);
                List list2 = (List) arrayMap2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf.zzaY();
                    ((zzik) zzf.zza).zzi(list2);
                }
                arrayList3.add((zzik) zzf.zzbd());
            }
            list = arrayList3;
        }
        zzj.zzg(list);
        zzi.zzaY();
        ((zzhg) zzi.zza).zzk((zzii) zzj.zzbd());
        return (zzhg) zzi.zzbd();
    }

    public final /* synthetic */ BitSet zzc() {
        return this.zze;
    }

    public zzy(zzad zzadVar, String str) {
        this.zza = zzadVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new ArrayMap(0);
        this.zzh = new ArrayMap(0);
    }
}
