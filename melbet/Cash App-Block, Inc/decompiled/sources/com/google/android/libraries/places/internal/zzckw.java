package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzckw {
    public final Collection zza;
    public final int zzb;

    public zzckw(zzbqd zzbqdVar) {
        Trace.checkNotNull(zzbqdVar, "eag");
        List list = zzbqdVar.zzd;
        if (list.size() < 10) {
            this.zza = list;
        } else {
            this.zza = new HashSet(list);
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((SocketAddress) it.next()).hashCode();
        }
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzckw)) {
            return false;
        }
        zzckw zzckwVar = (zzckw) obj;
        if (zzckwVar.zzb == this.zzb) {
            Collection collection = zzckwVar.zza;
            int size = collection.size();
            Collection<?> collection2 = this.zza;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final String toString() {
        return this.zza.toString();
    }
}
