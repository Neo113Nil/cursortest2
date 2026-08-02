package com.google.android.gms.internal.mlkit_vision_text_common;

import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.withpersona.sdk2.camera.BitmapUtils;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzau extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzba zza;

    public /* synthetic */ zzau(zzba zzbaVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.$r8$classId;
        zzba zzbaVar = this.zza;
        switch (i) {
            case 0:
                zzbaVar.clear();
                break;
            default:
                zzbaVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        zzba zzbaVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbaVar.zzl();
                if (zzl != null) {
                    return zzl.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int zzw = zzbaVar.zzw(entry.getKey());
                    if (zzw != -1 && BitmapUtils.zza(zzbaVar.zzC()[zzw], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return zzbaVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        zzba zzbaVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbaVar.zzl();
                return zzl != null ? zzl.entrySet().iterator() : new zzar(zzbaVar, 1);
            default:
                Map zzl2 = zzbaVar.zzl();
                return zzl2 != null ? zzl2.keySet().iterator() : new zzar(zzbaVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        zzba zzbaVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbaVar.zzl();
                if (zzl == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzbaVar.zzr()) {
                            int zzv = zzbaVar.zzv();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzbaVar.zze;
                            Objects.requireNonNull(obj2);
                            int zzb = StateFlowsComposeKt.zzb(key, value, zzv, obj2, zzbaVar.zzA(), zzbaVar.zzB(), zzbaVar.zzC());
                            if (zzb != -1) {
                                zzbaVar.zzq(zzb, zzv);
                                zzbaVar.zzg--;
                                zzbaVar.zzf += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map zzl2 = zzbaVar.zzl();
                if (zzl2 == null) {
                    if (zzbaVar.zzy(obj) == zzba.zzd) {
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
        zzba zzbaVar = this.zza;
        switch (i) {
        }
        return zzbaVar.size();
    }
}
