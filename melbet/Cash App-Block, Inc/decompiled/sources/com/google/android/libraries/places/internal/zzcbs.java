package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcbs extends zzbow {
    public final /* synthetic */ zzcby zza;
    public final String zzc;
    public final AtomicReference zzb = new AtomicReference(zzcby.zzh);
    public final zzcbj zzd = new zzcbj(this);

    public /* synthetic */ zzcbs(zzcby zzcbyVar, String str) {
        this.zza = zzcbyVar;
        Trace.checkNotNull(str, "authority");
        this.zzc = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final zzbpa zza(Schema schema, zzbov zzbovVar) {
        AtomicReference atomicReference = this.zzb;
        Object obj = atomicReference.get();
        zzcap zzcapVar = zzcby.zzh;
        if (obj != zzcapVar) {
            return zzh(schema, zzbovVar);
        }
        zzmu zzmuVar = new zzmu(this, 10);
        zzcby zzcbyVar = this.zza;
        zzbuf zzbufVar = zzcbyVar.zze;
        zzbufVar.zzb(zzmuVar);
        zzbufVar.zza();
        if (atomicReference.get() != zzcapVar) {
            return zzh(schema, zzbovVar);
        }
        if (zzcbyVar.zzM.get()) {
            return new zzcbn();
        }
        Logger logger = zzbpv.zza;
        zzbpv zzc = zzbpt.zza.zzc();
        if (zzc == null) {
            zzc = zzbpv.zzb;
        }
        zzcbr zzcbrVar = new zzcbr(this, zzc, schema, zzbovVar);
        zzbufVar.zzb(new zzb(4, this, zzcbrVar));
        zzbufVar.zza();
        return zzcbrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final String zzb() {
        return this.zzc;
    }

    public final void zzc(zzbqu zzbquVar) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.zzb;
        zzbqu zzbquVar2 = (zzbqu) atomicReference.get();
        atomicReference.set(zzbquVar);
        if (zzbquVar2 != zzcby.zzh || (linkedHashSet = this.zza.zzI) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((zzcbr) it.next()).zzm$1();
        }
    }

    public final zzbpa zzh(Schema schema, zzbov zzbovVar) {
        zzbqu zzbquVar = (zzbqu) this.zzb.get();
        zzcbj zzcbjVar = this.zzd;
        if (zzbquVar == null) {
            return zzcbjVar.zza(schema, zzbovVar);
        }
        if (!(zzbquVar instanceof zzcch)) {
            return new zzcba(zzbquVar, zzcbjVar, this.zza.zzr, schema, zzbovVar);
        }
        zzcci zzcciVar = ((zzcch) zzbquVar).zzb;
        zzccg zzccgVar = (zzccg) zzcciVar.zzb.get((String) schema.mVersion);
        if (zzccgVar == null) {
            zzccgVar = (zzccg) zzcciVar.zzc.get((String) schema.elementTypes);
        }
        if (zzccgVar == null) {
            zzccgVar = zzcciVar.zza;
        }
        if (zzccgVar != null) {
            zzbovVar = zzbovVar.zzh(zzccg.zza, zzccgVar);
        }
        return zzcbjVar.zza(schema, zzbovVar);
    }
}
