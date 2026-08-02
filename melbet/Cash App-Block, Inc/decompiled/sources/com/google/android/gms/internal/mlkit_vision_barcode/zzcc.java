package com.google.android.gms.internal.mlkit_vision_barcode;

import com.stripe.android.stripe3ds2.transaction.Logger;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcc extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzci zza;

    public /* synthetic */ zzcc(zzci zzciVar, int i) {
        this.$r8$classId = i;
        this.zza = zzciVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i) {
            case 0:
                zzciVar.clear();
                break;
            default:
                zzciVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzciVar.zzl();
                if (zzl != null) {
                    return zzl.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int zzw = zzciVar.zzw(entry.getKey());
                    if (zzw != -1 && Logger.zza(zzciVar.zzC()[zzw], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return zzciVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzciVar.zzl();
                return zzl != null ? zzl.entrySet().iterator() : new zzbz(zzciVar, 1);
            default:
                Map zzl2 = zzciVar.zzl();
                return zzl2 != null ? zzl2.keySet().iterator() : new zzbz(zzciVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzciVar.zzl();
                if (zzl == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzciVar.zzr()) {
                            int zzv = zzciVar.zzv();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzciVar.zze;
                            Objects.requireNonNull(obj2);
                            int zzb = zzcj.zzb(key, value, zzv, obj2, zzciVar.zzA(), zzciVar.zzB(), zzciVar.zzC());
                            if (zzb != -1) {
                                zzciVar.zzq(zzb, zzv);
                                zzciVar.zzg--;
                                zzciVar.zzf += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map zzl2 = zzciVar.zzl();
                if (zzl2 == null) {
                    if (zzciVar.zzy(obj) == zzci.zzd) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i) {
        }
        return zzciVar.size();
    }
}
