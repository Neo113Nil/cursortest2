package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzay extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbd zza;

    public /* synthetic */ zzay(zzbd zzbdVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.$r8$classId;
        zzbd zzbdVar = this.zza;
        switch (i) {
            case 0:
                zzbdVar.clear();
                break;
            default:
                zzbdVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        zzbd zzbdVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbdVar.zzl();
                if (zzl != null) {
                    return zzl.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int zzv = zzbdVar.zzv(entry.getKey());
                    if (zzv != -1) {
                        Object[] objArr = zzbdVar.zzc;
                        objArr.getClass();
                        if (ScanningStarPulseKt.zza(objArr[zzv], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return zzbdVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        zzbd zzbdVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbdVar.zzl();
                return zzl != null ? zzl.entrySet().iterator() : new zzav(zzbdVar, 1);
            default:
                Map zzl2 = zzbdVar.zzl();
                return zzl2 != null ? zzl2.keySet().iterator() : new zzav(zzbdVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        zzbd zzbdVar = this.zza;
        switch (i) {
            case 0:
                Map zzl = zzbdVar.zzl();
                if (zzl == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!zzbdVar.zzq()) {
                            int zzu = zzbdVar.zzu();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = zzbdVar.zze;
                            obj2.getClass();
                            int[] iArr = zzbdVar.zza;
                            iArr.getClass();
                            Object[] objArr = zzbdVar.zzb;
                            objArr.getClass();
                            Object[] objArr2 = zzbdVar.zzc;
                            objArr2.getClass();
                            int zzb = SectionUIKt.zzb(key, value, zzu, obj2, iArr, objArr, objArr2);
                            if (zzb != -1) {
                                zzbdVar.zzp(zzb, zzu);
                                zzbdVar.zzg--;
                                zzbdVar.zzf += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map zzl2 = zzbdVar.zzl();
                if (zzl2 == null) {
                    if (zzbdVar.zzx(obj) == zzbd.zzd) {
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
        zzbd zzbdVar = this.zza;
        switch (i) {
        }
        return zzbdVar.size();
    }
}
