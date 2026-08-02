package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.android.filament.Box;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzcbw extends zzbuv {
    public final com.google.android.gms.maps.zzah zza;
    public final zzbra zzb;
    public final zzbvi zzc;
    public final zzbvj zzd;
    public List zze;
    public zzcah zzf;
    public boolean zzg;
    public boolean zzh;
    public Box zzi;
    public final /* synthetic */ zzcby zzj;

    public zzcbw(zzcby zzcbyVar, com.google.android.gms.maps.zzah zzahVar) {
        Objects.requireNonNull(zzcbyVar);
        this.zzj = zzcbyVar;
        List list = (List) zzahVar.f68zza;
        this.zze = list;
        this.zza = zzahVar;
        zzbra zzbraVar = new zzbra("Subchannel", zzcbyVar.zzA.zzb(), zzbra.zza.incrementAndGet());
        this.zzb = zzbraVar;
        zzcgm zzcgmVar = zzcbyVar.zzv;
        zzbvj zzbvjVar = new zzbvj(zzbraVar, zzcgmVar.zza(), "Subchannel for ".concat(String.valueOf(list)));
        this.zzd = zzbvjVar;
        this.zzc = new zzbvi(zzbvjVar, zzcgmVar);
    }

    public final String toString() {
        return this.zzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbrs
    public final void zza(zzbru zzbruVar) {
        zzcby zzcbyVar = this.zzj;
        zzbuf zzbufVar = zzcbyVar.zze;
        zzbufVar.zzc();
        Trace.checkState("already started", !this.zzg);
        Trace.checkState("already shutdown", !this.zzh);
        Trace.checkState("Channel is being terminated", !zzcbyVar.zzO);
        this.zzg = true;
        String zzb = zzcbyVar.zzA.zzb();
        zzbvf zzbvfVar = zzcbyVar.zzp;
        ScheduledExecutorService scheduledExecutorService = zzbvfVar.zza.zzb;
        zzcbu zzcbuVar = new zzcbu(this, zzbruVar);
        zzfv zzfvVar = zzcbyVar.zzF.zzb.zzah;
        zzbqr zzbqrVar = zzcbyVar.zzV;
        zzyr zzyrVar = new zzyr(zzcbyVar.zzR.zza);
        zzcah zzcahVar = new zzcah(this.zza, zzb, zzcbyVar.zzC, zzbvfVar, scheduledExecutorService, zzcbyVar.zzx, zzbufVar, zzcbuVar, zzbqrVar, zzyrVar, this.zzd, this.zzb, this.zzc, zzcbyVar.zzB, zzcbyVar.zzk, zzfvVar);
        zzbqn zzbqnVar = new zzbqn();
        zzbqnVar.zza = "Child Subchannel started";
        zzbqnVar.zzb = zzbqo.zzb;
        zzbqnVar.zzc = Long.valueOf(zzcbyVar.zzv.zza());
        zzbqnVar.zzd = zzcahVar;
        zzcbyVar.zzT.zza(zzbqnVar.zze());
        this.zzf = zzcahVar;
        zzcbyVar.zzH.add(zzcahVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrs
    public final void zzb() {
        Box box;
        zzcby zzcbyVar = this.zzj;
        zzbuf zzbufVar = zzcbyVar.zze;
        zzbufVar.zzc();
        if (this.zzf == null) {
            this.zzh = true;
            return;
        }
        if (!this.zzh) {
            this.zzh = true;
        } else {
            if (!zzcbyVar.zzO || (box = this.zzi) == null) {
                return;
            }
            box.zza();
            this.zzi = null;
        }
        if (!zzcbyVar.zzO) {
            this.zzi = zzbufVar.zzd(zzcbyVar.zzp.zza.zzb, new zzcam(new zzmu(this, 11)), 5L, TimeUnit.SECONDS);
            return;
        }
        zzcah zzcahVar = this.zzf;
        zzbtx zzbtxVar = zzcby.zzc;
        zzcahVar.getClass();
        zzbzt zzbztVar = new zzbzt(zzcahVar, zzbtxVar, 0);
        zzbuf zzbufVar2 = zzcahVar.zzl;
        zzbufVar2.zzb(zzbztVar);
        zzbufVar2.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbrs
    public final void zzc() {
        this.zzj.zze.zzc();
        Trace.checkState("not started", this.zzg);
        if (this.zzh) {
            return;
        }
        zzcah zzcahVar = this.zzf;
        if (zzcahVar.zzv != null) {
            return;
        }
        zzbuf zzbufVar = zzcahVar.zzl;
        zzbufVar.zzb(new zzbzp(zzcahVar, 1));
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbrs
    public final void zzd(List list) {
        this.zzj.zze.zzc();
        this.zze = list;
        zzcah zzcahVar = this.zzf;
        zzcahVar.getClass();
        Trace.checkNotNull(list, "newAddressGroups");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Trace.checkNotNull(it.next(), "newAddressGroups contains null entry");
        }
        Trace.checkArgument("newAddressGroups is empty", !list.isEmpty());
        zzb zzbVar = new zzb(zzcahVar, Collections.unmodifiableList(new ArrayList(list)));
        zzbuf zzbufVar = zzcahVar.zzl;
        zzbufVar.zzb(zzbVar);
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbrs
    public final Object zze() {
        Trace.checkState("Subchannel is not started", this.zzg);
        return this.zzf;
    }
}
