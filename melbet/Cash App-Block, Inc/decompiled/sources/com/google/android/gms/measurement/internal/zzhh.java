package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import androidx.compose.runtime.Latch;
import androidx.datastore.core.SimpleActor;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes.dex */
public final class zzhh extends zzjf {
    public static final Pair zza = new Pair("", 0L);
    public zzhf zzb;
    public final zzhe zzc;
    public final Latch zze;
    public final zzhe zzf;
    public final zzhc zzg;
    public final Latch zzh;
    public final SimpleActor zzi;
    public final zzhc zzj;
    public final zzhe zzk;
    public final zzhe zzl;
    public boolean zzm;
    public final zzhc zzn;
    public final zzhc zzo;
    public final zzhe zzp;
    public final Latch zzq;
    public final Latch zzr;
    public final zzhe zzs;
    public final SimpleActor zzt;
    public SharedPreferences zzv;
    public SharedPreferences zzw;
    public String zzx;
    public boolean zzy;
    public long zzz;

    public zzhh(zzic zzicVar) {
        super(zzicVar);
        this.zzf = new zzhe(this, "session_timeout", 1800000L);
        this.zzg = new zzhc(this, "start_new_session", true);
        this.zzk = new zzhe(this, "last_pause_time", 0L);
        this.zzl = new zzhe(this, "session_id", 0L);
        this.zzh = new Latch(this, "non_personalized_ads");
        this.zzi = new SimpleActor(this, "last_received_uri_timestamps_by_source");
        this.zzj = new zzhc(this, "allow_remote_dynamite", false);
        this.zzc = new zzhe(this, "first_open_time", 0L);
        zzae.checkNotEmpty("app_install_time");
        this.zze = new Latch(this, "app_instance_id");
        this.zzn = new zzhc(this, "app_backgrounded", false);
        this.zzo = new zzhc(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhe(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new Latch(this, "firebase_feature_rollouts");
        this.zzr = new Latch(this, "deferred_attribution_cache");
        this.zzs = new zzhe(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new SimpleActor(this, "default_event_parameters");
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return true;
    }

    public final SharedPreferences zzd() {
        zzg();
        zzw();
        zzae.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final SharedPreferences zze() {
        zzg();
        zzw();
        if (this.zzw == null) {
            zzic zzicVar = (zzic) this.$$delegate_0;
            String valueOf = String.valueOf(zzicVar.zzd.getPackageName());
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzgs zzgsVar = zzguVar.zzl;
            String concat = valueOf.concat("_preferences");
            zzgsVar.zzb(concat, "Default prefs file");
            this.zzw = zzicVar.zzd.getSharedPreferences(concat, 0);
        }
        return this.zzw;
    }

    public final SparseArray zzf() {
        Bundle zza2 = this.zzi.zza();
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final zzjl zzl() {
        zzg();
        return zzjl.zzf(zzd().getInt("consent_source", 100), zzd().getString("consent_settings", "G1"));
    }

    public final void zzm(boolean z) {
        zzg();
        zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzb(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = zzd().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean zzo(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }
}
