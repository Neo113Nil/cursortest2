package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.MetadataRepo;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzc {
    public final MetadataRepo zza;
    public UnleashContext zzb;
    public final com.google.android.gms.maps.zzah zzc;
    public final zzz zzd;

    public zzc() {
        MetadataRepo metadataRepo = new MetadataRepo(12);
        this.zza = metadataRepo;
        this.zzb = ((UnleashContext) metadataRepo.mEmojiCharArray).zzc();
        this.zzc = new com.google.android.gms.maps.zzah(2);
        this.zzd = new zzz(0);
        zza zzaVar = new zza(this, 1);
        zzj zzjVar = (zzj) metadataRepo.mTypeface;
        ((HashMap) zzjVar.f64zza).put("internal.registerCallback", zzaVar);
        ((HashMap) zzjVar.f64zza).put("internal.eventLogger", new zza(this, 0));
    }

    public final void zza(String str, Callable callable) {
        ((HashMap) ((zzj) this.zza.mTypeface).f64zza).put(str, callable);
    }

    public final boolean zzb(zzaa zzaaVar) {
        try {
            com.google.android.gms.maps.zzah zzahVar = this.zzc;
            zzahVar.f68zza = zzaaVar;
            zzahVar.zzb = zzaaVar.clone();
            ((ArrayList) zzahVar.zzc).clear();
            ((UnleashContext) this.zza.mRootNode).zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zzc(), zzahVar);
            if (zzc()) {
                return true;
            }
            return zzd();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzc() {
        com.google.android.gms.maps.zzah zzahVar = this.zzc;
        return !((zzaa) zzahVar.zzb).equals((zzaa) zzahVar.f68zza);
    }

    public final boolean zzd() {
        return !((ArrayList) this.zzc.zzc).isEmpty();
    }

    public final void zzf(zzja zzjaVar) {
        zzai zzaiVar;
        try {
            MetadataRepo metadataRepo = this.zza;
            this.zzb = ((UnleashContext) metadataRepo.mEmojiCharArray).zzc();
            if (metadataRepo.zza(this.zzb, (zzje[]) zzjaVar.zza().toArray(new zzje[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zziy zziyVar : zzjaVar.zzb().zza()) {
                List zzb = zziyVar.zzb();
                String zza = zziyVar.zza();
                Iterator it = zzb.iterator();
                while (it.hasNext()) {
                    zzao zza2 = metadataRepo.zza(this.zzb, (zzje) it.next());
                    if (!(zza2 instanceof zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    UnleashContext unleashContext = this.zzb;
                    if (unleashContext.zzd(zza)) {
                        zzao zzh = unleashContext.zzh(zza);
                        if (!(zzh instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(zza)));
                        }
                        zzaiVar = (zzai) zzh;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(zza)));
                    }
                    zzaiVar.zza(this.zzb, Collections.singletonList(zza2));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
