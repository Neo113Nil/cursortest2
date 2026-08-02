package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzd extends zzf {
    public final ArrayMap zza;
    public final ArrayMap zzb;
    public long zzc;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.zzb = new ArrayMap(0);
        this.zza = new ArrayMap(0);
    }

    public final void zza(long j, String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new zza(this, str, j, 0));
        }
    }

    public final void zzb(long j, String str) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new zza(this, str, j, 1));
        }
    }

    public final void zzc(long j) {
        zzmb zzmbVar = ((zzic) this.$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        zzlu zzh = zzmbVar.zzh(false);
        ArrayMap arrayMap = this.zza;
        Iterator it = ((ArrayMap.KeySet) arrayMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzi(str, j - ((Long) arrayMap.get(str)).longValue(), zzh);
        }
        if (!arrayMap.isEmpty()) {
            zzh(j - this.zzc, zzh);
        }
        zzj(j);
    }

    public final void zzh(long j, zzlu zzluVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzl.zzb(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzpp.zzay(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.zzp;
            zzic.zzO(zzljVar);
            zzljVar.zzE("am", "_xa", bundle);
        }
    }

    public final void zzi(String str, long j, zzlu zzluVar) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                zzgu zzguVar2 = zzicVar.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzl.zzb(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzpp.zzay(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.zzp;
            zzic.zzO(zzljVar);
            zzljVar.zzE("am", "_xu", bundle);
        }
    }

    public final void zzj(long j) {
        ArrayMap arrayMap = this.zza;
        Iterator it = ((ArrayMap.KeySet) arrayMap.keySet()).iterator();
        while (it.hasNext()) {
            arrayMap.put((String) it.next(), Long.valueOf(j));
        }
        if (arrayMap.isEmpty()) {
            return;
        }
        this.zzc = j;
    }
}
