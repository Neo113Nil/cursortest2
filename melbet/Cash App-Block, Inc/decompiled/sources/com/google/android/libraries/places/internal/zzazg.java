package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzazg extends zzbqj {
    public final ImmutableList zza;
    public final zzboz zza$1;
    public final LinkedHashMap zzb = new LinkedHashMap();
    public final ArrayDeque zzc = new ArrayDeque();
    public final LinkedHashMap zzd = new LinkedHashMap();
    public final Set zze;
    public int zzf;
    public boolean zzg;
    public boolean zzh;
    public zzbsn zzi;
    public zzbtx zzj;
    public zzbsn zzk;

    public zzazg(zzboz zzbozVar, ImmutableList immutableList, Set set) {
        this.zza$1 = zzbozVar;
        this.zza = immutableList;
        this.zzf = immutableList.size();
        this.zze = set;
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zza(zzbsn zzbsnVar) {
        this.zzi = zzbsnVar;
        zzbsnVar.getClass();
        Iterator it = Maps.reverse(this.zza.subList(0, this.zzf)).iterator();
        while (it.hasNext()) {
            this.zzf--;
            Iterator it2 = Maps.reverse((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.zze.contains((zzfr) it2.next());
            }
            if (!this.zzb.isEmpty()) {
                return;
            }
        }
        this.zza$1.zza(this.zzi);
        this.zzg = true;
        zzg$1();
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzb(Object obj) {
        this.zzc.add(new zzazf(this, obj, this.zza.size()));
        zzg$1();
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzc(zzbtx zzbtxVar, zzbsn zzbsnVar) {
        this.zzj = zzbtxVar;
        this.zzk = zzbsnVar;
        this.zzh = true;
        zzh$1();
    }

    @Override // com.google.android.libraries.places.internal.zzbtm
    public final zzboz zze() {
        return this.zza$1;
    }

    public final void zzg$1() {
        if (this.zzg) {
            ArrayDeque arrayDeque = this.zzc;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                zzazf zzazfVar = (zzazf) it.next();
                Iterator it2 = Maps.reverse(this.zza.subList(0, zzazfVar.zzc)).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = Maps.reverse((List) it2.next()).iterator();
                    while (it3.hasNext()) {
                        if (this.zze.contains((zzfr) it3.next())) {
                            Trace.checkNotNull(zzazfVar.zza, "Response message cannot be null");
                        }
                    }
                    if (!zzazfVar.zzb.isEmpty()) {
                        return;
                    } else {
                        zzazfVar.zzc--;
                    }
                }
            }
            while (!arrayDeque.isEmpty()) {
                zzazf zzazfVar2 = (zzazf) arrayDeque.peek();
                if (!zzazfVar2.zzb.isEmpty() || zzazfVar2.zzc != 0) {
                    break;
                }
                this.zza$1.zzb(((zzazf) arrayDeque.poll()).zza);
            }
            zzh$1();
        }
    }

    public final void zzh$1() {
        if (this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzh) {
            Iterator it = Maps.reverse(this.zza).iterator();
            while (it.hasNext()) {
                for (zzfr zzfrVar : Maps.reverse((List) it.next())) {
                    zzbtx zzbtxVar = this.zzj;
                    zzbsn zzbsnVar = this.zzk;
                    zzbtxVar.getClass();
                    zzbsnVar.getClass();
                    this.zze.contains(zzfrVar);
                }
            }
            if (this.zzd.isEmpty()) {
                this.zza$1.zzc(this.zzj, this.zzk);
            }
        }
    }
}
