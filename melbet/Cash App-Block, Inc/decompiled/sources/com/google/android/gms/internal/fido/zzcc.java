package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzcc extends zzby implements List, RandomAccess {
    public static final zzbz zza = new zzbz(zzct.zza, 0);

    public static zzct zzh(int i, Object[] objArr) {
        return i == 0 ? zzct.zza : new zzct(i, objArr);
    }

    public static zzct zzi(Object[] objArr) {
        if (objArr.length == 0) {
            return zzct.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        return zzh(length, objArr2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzh.m2007zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                zzbz listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !zzh.m2007zza(listIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public int zza(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final zzdc zzd() {
        return listIterator(0);
    }

    public zzcc zzf() {
        return size() <= 1 ? this : new zzca(this);
    }

    @Override // java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public zzcc subList(int i, int i2) {
        zzh.zze(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzct.zza : new zzcb(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzbz listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? zza : new zzbz(this, i);
        }
        Path$$ExternalSyntheticBUOutline0.m(zzh.zzg(i, size, "index"));
        return null;
    }
}
