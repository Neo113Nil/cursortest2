package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzcfa {
    public final boolean zza;
    public final List zzb;
    public final Collection zzc;
    public final Collection zzd;
    public final int zze;
    public final zzcfj zzf;
    public final boolean zzg;
    public final boolean zzh;

    public zzcfa(List list, Collection collection, Collection collection2, zzcfj zzcfjVar, boolean z, boolean z2, boolean z3, int i) {
        this.zzb = list;
        Trace.checkNotNull(collection, "drainedSubstreams");
        this.zzc = collection;
        this.zzf = zzcfjVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        Trace.checkState("passThrough should imply buffer is null", !z2 || list == null);
        Trace.checkState("passThrough should imply winningSubstream != null", (z2 && zzcfjVar == null) ? false : true);
        Trace.checkState("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(zzcfjVar)) || (collection.size() == 0 && zzcfjVar.zzb));
        Trace.checkState("cancelled should imply committed", (z && zzcfjVar == null) ? false : true);
    }

    public final zzcfa zza(zzcfj zzcfjVar) {
        List list;
        Trace.checkState("Already passThrough", !this.zza);
        boolean z = zzcfjVar.zzb;
        Collection collection = this.zzc;
        if (!z) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(zzcfjVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(zzcfjVar);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        zzcfj zzcfjVar2 = this.zzf;
        boolean z2 = zzcfjVar2 != null;
        if (z2) {
            Trace.checkState("Another RPC attempt has already committed", zzcfjVar2 == zzcfjVar);
            list = null;
        } else {
            list = this.zzb;
        }
        return new zzcfa(list, collection2, this.zzd, zzcfjVar2, this.zzg, z2, this.zzh, this.zze);
    }

    public final zzcfa zzc(zzcfj zzcfjVar) {
        Collection unmodifiableCollection;
        boolean z = this.zzh;
        Trace.checkState("hedging frozen", !z);
        zzcfj zzcfjVar2 = this.zzf;
        Trace.checkState("already committed", zzcfjVar2 == null);
        Collection collection = this.zzd;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(zzcfjVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzcfjVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzcfa(this.zzb, this.zzc, unmodifiableCollection, zzcfjVar2, this.zzg, this.zza, z, this.zze + 1);
    }
}
