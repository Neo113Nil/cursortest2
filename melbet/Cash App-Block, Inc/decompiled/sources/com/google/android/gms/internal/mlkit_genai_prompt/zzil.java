package com.google.android.gms.internal.mlkit_genai_prompt;

import com.stripe.android.model.parsers.WalletJsonParser;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class zzil extends zzih implements List, RandomAccess {
    public static final zzij zza = new zzij(zzir.zza, 0);

    public static zzir zzi(int i, Object[] objArr) {
        return i == 0 ? zzir.zza : new zzir(i, objArr);
    }

    public static zzil zzj(Collection collection) {
        if (!(collection instanceof zzih)) {
            Object[] array2 = collection.toArray();
            int length = array2.length;
            WalletJsonParser.zza(length, array2);
            return zzi(length, array2);
        }
        zzil zzd = ((zzih) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        Object[] array3 = zzd.toArray(zzih.zza);
        return zzi(array3.length, array3);
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
    public final boolean contains(Object obj) {
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
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                zzij listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(listIterator.next(), it.next())) {
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

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public int zza(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final zzil zzd() {
        return this;
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzil subList(int i, int i2) {
        zzhw.zzf(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzir.zza : new zzik(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzij listIterator(int i) {
        zzhw.zzb(i, size());
        return isEmpty() ? zza : new zzij(this, i);
    }
}
