package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzcv extends zzck {
    public static final zzcv zzc;
    public final transient zzcc zzd;

    static {
        zzbz zzbzVar = zzcc.zza;
        zzc = new zzcv(zzct.zza, zzcq.zza);
    }

    public zzcv(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzccVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int zzv = zzv(obj, true);
        zzcc zzccVar = this.zzd;
        if (zzv == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(zzv);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzck) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        Comparator comparator = ((zzck) this).zza;
        if (!zzh.zza(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzbz listIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.zzd.zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzcc zzccVar = this.zzd;
            if (zzccVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = ((zzck) this).zza;
                if (!zzh.zza(comparator, (Collection) set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    zzbz listIterator = zzccVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int zzv = zzv(obj, false);
        zzcc zzccVar = this.zzd;
        if (zzv == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(zzv);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return this.zzd.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr) {
        return this.zzd.zza(objArr);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final zzdc zzd() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return this.zzd;
    }

    public final int zzu(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int zzv(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, ((zzck) this).zza);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final zzcv zzw(int i, int i2) {
        zzcc zzccVar = this.zzd;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = ((zzck) this).zza;
        return i < i2 ? new zzcv(zzccVar.subList(i, i2), comparator) : zzck.zzs(comparator);
    }
}
