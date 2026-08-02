package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdu;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzd implements zzlk {
    public final /* synthetic */ zzez zza;

    public zzd(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdz(zzezVar, str, str2, bundle, true));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdz(zzezVar, str, str2, z, zzcmVar));
        Bundle zze = zzcmVar.zze(5000L);
        if (zze == null || zze.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(zze.size());
        for (String str3 : zze.keySet()) {
            Object obj = zze.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 3, false));
        return zzcmVar.zzc(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 4, false));
        return zzcmVar.zzc(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 1));
        return zzcmVar.zzc(50L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 0));
        return zzcmVar.zzc(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.zza.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdq(zzezVar, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdq(zzezVar, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdf(zzezVar, bundle, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdh(zzezVar, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdh(zzezVar, str, str2, zzcmVar, 1));
        List list = (List) zzcm.zzf(zzcmVar.zze(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzed(zzezVar, str, zzcmVar));
        Integer num = (Integer) zzcm.zzf(zzcmVar.zze(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }
}
