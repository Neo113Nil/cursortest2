package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.collection.ArrayMap;
import app.cash.trifle.Trifle;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzk;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zza extends zzc {
    public final zzic zza;
    public final zzlj zzb;

    public zza(zzic zzicVar) {
        zzae.checkNotNull(zzicVar);
        this.zza = zzicVar;
        zzlj zzljVar = zzicVar.zzp;
        zzic.zzO(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        this.zzb.zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzhzVar);
        if (zzhzVar.zze()) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (Trifle.zza()) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.zzj;
        zzic.zzP(zzhzVar2);
        zzhzVar2.zzk(atomicReference, 5000L, "get user properties", new zzk(zzljVar, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zzb(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzpl zzplVar : list) {
            Object zza = zzplVar.zza();
            if (zza != null) {
                arrayMap.put(zzplVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzmb zzmbVar = ((zzic) this.zzb.$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        zzlu zzluVar = zzmbVar.zzb;
        if (zzluVar != null) {
            return zzluVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzmb zzmbVar = ((zzic) this.zzb.$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        zzlu zzluVar = zzmbVar.zzb;
        if (zzluVar != null) {
            return zzluVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return (String) this.zzb.zzg.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        zzpp zzppVar = this.zza.zzl;
        zzic.zzN(zzppVar);
        return zzppVar.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        zzic zzicVar = this.zza;
        zzd zzdVar = zzicVar.zzq;
        zzic.zzM(zzdVar);
        zzicVar.zzn.getClass();
        zzdVar.zza(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        zzic zzicVar = this.zza;
        zzd zzdVar = zzicVar.zzq;
        zzic.zzM(zzdVar);
        zzicVar.zzn.getClass();
        zzdVar.zzb(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        zzlj zzljVar = this.zzb;
        ((zzic) zzljVar.$$delegate_0).zzn.getClass();
        zzljVar.zzZ(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        zzlj zzljVar = this.zza.zzp;
        zzic.zzO(zzljVar);
        zzljVar.zzaa(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzhzVar);
        if (zzhzVar.zze()) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (Trifle.zza()) {
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.zzj;
        zzic.zzP(zzhzVar2);
        zzhzVar2.zzk(atomicReference, 5000L, "get conditional user properties", new ProfileAdapter.AnonymousClass8(zzljVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzav(list);
        }
        zzic.zzP(zzguVar);
        zzguVar.zzd.zzb(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        zzlj zzljVar = this.zzb;
        zzljVar.getClass();
        zzae.checkNotEmpty(str);
        ((zzic) zzljVar.$$delegate_0).getClass();
        return 25;
    }
}
