package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzcla extends zzbrt {
    public final ArrayList zza;
    public final AtomicInteger zzb;
    public final int zzc;

    public zzcla(ArrayList arrayList, AtomicInteger atomicInteger) {
        Trace.checkArgument("empty list", !arrayList.isEmpty());
        this.zza = arrayList;
        Trace.checkNotNull(atomicInteger, "index");
        this.zzb = atomicInteger;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzbrt) it.next()).hashCode();
        }
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcla)) {
            return false;
        }
        zzcla zzclaVar = (zzcla) obj;
        if (zzclaVar == this) {
            return true;
        }
        if (this.zzc != zzclaVar.zzc || this.zzb != zzclaVar.zzb) {
            return false;
        }
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        ArrayList arrayList2 = zzclaVar.zza;
        return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
    }

    public final int hashCode() {
        return this.zzc;
    }

    public final String toString() {
        Response response = new Response("zzcla");
        response.add(this.zza, "subchannelPickers");
        return response.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbrt
    public final zzbro zza(zzbrp zzbrpVar) {
        int andIncrement = this.zzb.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.zza;
        return ((zzbrt) arrayList.get(andIncrement % arrayList.size())).zza(zzbrpVar);
    }
}
