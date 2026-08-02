package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzac;
import com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList;
import com.google.common.collect.AbstractMapBasedMultimap$WrappedList$WrappedListIterator;
import com.google.common.collect.Multimaps$CustomListMultimap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class zzao extends AbstractCollection implements List {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object zza;
    public Collection zzb;
    public final AbstractCollection zzc;
    public final Collection zzd;
    public final /* synthetic */ Serializable zze;
    public final /* synthetic */ Serializable zzf;

    public zzao(zzbw zzbwVar, Object obj, List list, zzao zzaoVar) {
        this.zzf = zzbwVar;
        this.zze = zzbwVar;
        this.zza = obj;
        this.zzb = list;
        this.zzc = zzaoVar;
        this.zzd = zzaoVar == null ? null : zzaoVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        switch (i) {
            case 0:
                zzb();
                boolean isEmpty = this.zzb.isEmpty();
                boolean add = this.zzb.add(obj);
                if (add) {
                    ((zzas) serializable).zzb++;
                    if (isEmpty) {
                        zza();
                        return true;
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.zzb.isEmpty();
                boolean add2 = this.zzb.add(obj);
                if (add2) {
                    ((zzbw) serializable).zzb++;
                    if (isEmpty2) {
                        zza();
                        return true;
                    }
                }
                return add2;
            case 2:
                zzb();
                boolean isEmpty3 = this.zzb.isEmpty();
                boolean add3 = this.zzb.add(obj);
                if (!add3 || !isEmpty3) {
                    return add3;
                }
                zza();
                return true;
            default:
                refreshIfEmpty();
                boolean isEmpty4 = this.zzb.isEmpty();
                boolean add4 = this.zzb.add(obj);
                if (add4) {
                    ((Multimaps$CustomListMultimap) serializable).totalSize++;
                    if (isEmpty4) {
                        addToMap();
                    }
                }
                return add4;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.$r8$classId;
        Serializable serializable = this.zzf;
        boolean z = false;
        switch (i2) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.zzb).addAll(i, collection);
                if (addAll) {
                    ((zzas) serializable).zzb += this.zzb.size() - size;
                    if (size == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = ((List) this.zzb).addAll(i, collection);
                if (addAll2) {
                    ((zzbw) serializable).zzb += this.zzb.size() - size2;
                    if (size2 == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll2;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll3 = ((List) this.zzb).addAll(i, collection);
                if (addAll3) {
                    this.zzb.size();
                    if (size3 == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll3;
            default:
                if (!collection.isEmpty()) {
                    int size4 = size();
                    z = ((List) this.zzb).addAll(i, collection);
                    if (z) {
                        ((Multimaps$CustomListMultimap) serializable).totalSize += this.zzb.size() - size4;
                        if (size4 == 0) {
                            addToMap();
                        }
                    }
                }
                return z;
        }
    }

    public void addToMap() {
        zzao zzaoVar = (zzao) this.zzc;
        if (zzaoVar != null) {
            zzaoVar.addToMap();
        } else {
            ((Multimaps$CustomListMultimap) this.zze).map.put(this.zza, this.zzb);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        switch (i) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.zzb.clear();
                    ((zzas) serializable).zzb -= size;
                    zzc();
                    break;
                }
                break;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.zzb.clear();
                    ((zzbw) serializable).zzb -= size2;
                    zzc();
                    break;
                }
                break;
            case 2:
                if (size() != 0) {
                    this.zzb.clear();
                    zzc();
                    break;
                }
                break;
            default:
                int size3 = size();
                if (size3 != 0) {
                    this.zzb.clear();
                    ((Multimaps$CustomListMultimap) serializable).totalSize -= size3;
                    removeIfEmpty();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.zzb.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.zzb.equals(obj);
            case 2:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.zzb.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                refreshIfEmpty();
                return this.zzb.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                return this.zzb.hashCode();
            case 1:
                zzb();
                return this.zzb.hashCode();
            case 2:
                zzb();
                return this.zzb.hashCode();
            default:
                refreshIfEmpty();
                return this.zzb.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                return new zzag(this);
            case 1:
                zzb();
                return new zzbh(this);
            case 2:
                zzb();
                return new zzac(this);
            default:
                refreshIfEmpty();
                return new zzag(this, (byte) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                return new zzan(this);
            case 1:
                zzb();
                return new zzbp(this);
            case 2:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzaj(this);
            default:
                refreshIfEmpty();
                return new AbstractMapBasedMultimap$WrappedList$WrappedListIterator(this);
        }
    }

    public void refreshIfEmpty() {
        Collection collection;
        zzao zzaoVar = (zzao) this.zzc;
        if (zzaoVar != null) {
            zzaoVar.refreshIfEmpty();
            if (zzaoVar.zzb == this.zzd) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        if (!this.zzb.isEmpty() || (collection = (Collection) ((Multimaps$CustomListMultimap) this.zze).map.get(this.zza)) == null) {
            return;
        }
        this.zzb = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        switch (i) {
            case 0:
                zzb();
                boolean remove = this.zzb.remove(obj);
                if (remove) {
                    zzas zzasVar = (zzas) serializable;
                    zzasVar.zzb--;
                    zzc();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.zzb.remove(obj);
                if (remove2) {
                    zzbw zzbwVar = (zzbw) serializable;
                    zzbwVar.zzb--;
                    zzc();
                }
                return remove2;
            case 2:
                zzb();
                boolean remove3 = this.zzb.remove(obj);
                if (remove3) {
                    zzc();
                }
                return remove3;
            default:
                refreshIfEmpty();
                boolean remove4 = this.zzb.remove(obj);
                if (remove4) {
                    Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                    multimaps$CustomListMultimap.totalSize--;
                    removeIfEmpty();
                }
                return remove4;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        boolean z = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.zzb.removeAll(collection);
                    if (z) {
                        ((zzas) serializable).zzb += this.zzb.size() - size;
                        zzc();
                        break;
                    }
                }
                break;
            case 1:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.zzb.removeAll(collection);
                    if (z) {
                        ((zzbw) serializable).zzb += this.zzb.size() - size2;
                        zzc();
                        break;
                    }
                }
                break;
            case 2:
                if (!collection.isEmpty()) {
                    size();
                    z = this.zzb.removeAll(collection);
                    if (z) {
                        this.zzb.size();
                        zzc();
                        break;
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    int size3 = size();
                    z = this.zzb.removeAll(collection);
                    if (z) {
                        ((Multimaps$CustomListMultimap) serializable).totalSize += this.zzb.size() - size3;
                        removeIfEmpty();
                        break;
                    }
                }
                break;
        }
        return z;
    }

    public void removeIfEmpty() {
        zzao zzaoVar = (zzao) this.zzc;
        if (zzaoVar != null) {
            zzaoVar.removeIfEmpty();
        } else if (this.zzb.isEmpty()) {
            ((Multimaps$CustomListMultimap) this.zze).map.remove(this.zza);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        switch (i) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.zzb.retainAll(collection);
                if (retainAll) {
                    ((zzas) serializable).zzb += this.zzb.size() - size;
                    zzc();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size2 = size();
                boolean retainAll2 = this.zzb.retainAll(collection);
                if (retainAll2) {
                    ((zzbw) serializable).zzb += this.zzb.size() - size2;
                    zzc();
                }
                return retainAll2;
            case 2:
                collection.getClass();
                size();
                boolean retainAll3 = this.zzb.retainAll(collection);
                if (retainAll3) {
                    this.zzb.size();
                    zzc();
                }
                return retainAll3;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll4 = this.zzb.retainAll(collection);
                if (retainAll4) {
                    ((Multimaps$CustomListMultimap) serializable).totalSize += this.zzb.size() - size3;
                    removeIfEmpty();
                }
                return retainAll4;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return this.zzb.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.$r8$classId;
        AbstractCollection abstractCollection = this.zzc;
        Object obj = this.zza;
        Serializable serializable = this.zzf;
        switch (i3) {
            case 0:
                zzb();
                zzas zzasVar = (zzas) serializable;
                List subList = ((List) this.zzb).subList(i, i2);
                zzao zzaoVar = (zzao) abstractCollection;
                if (zzaoVar != null) {
                    this = zzaoVar;
                }
                return subList instanceof RandomAccess ? new zzak(zzasVar, obj, subList, this) : new zzao(zzasVar, obj, subList, this);
            case 1:
                zzb();
                List subList2 = ((List) this.zzb).subList(i, i2);
                zzao zzaoVar2 = (zzao) abstractCollection;
                if (zzaoVar2 != null) {
                    this = zzaoVar2;
                }
                zzbw zzbwVar = (zzbw) serializable;
                return subList2 instanceof RandomAccess ? new com.google.android.gms.internal.mlkit_vision_barcode.zzbm(zzbwVar, obj, subList2, this) : new zzao(zzbwVar, obj, subList2, this);
            case 2:
                zzb();
                List subList3 = ((List) this.zzb).subList(i, i2);
                zzao zzaoVar3 = (zzao) abstractCollection;
                if (zzaoVar3 != null) {
                    this = zzaoVar3;
                }
                com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar4 = (com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable;
                return subList3 instanceof RandomAccess ? new com.google.android.gms.internal.mlkit_vision_text_common.zzag(zzaoVar4, obj, subList3, this) : new zzao(zzaoVar4, obj, subList3, this);
            default:
                refreshIfEmpty();
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                List subList4 = ((List) this.zzb).subList(i, i2);
                zzao zzaoVar5 = (zzao) abstractCollection;
                if (zzaoVar5 != null) {
                    this = zzaoVar5;
                }
                return subList4 instanceof RandomAccess ? new AbstractMapBasedMultimap$RandomAccessWrappedList(multimaps$CustomListMultimap, obj, subList4, this) : new zzao(multimaps$CustomListMultimap, obj, subList4, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            case 2:
                zzb();
                break;
            default:
                refreshIfEmpty();
                break;
        }
        return this.zzb.toString();
    }

    public void zza() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        Serializable serializable = this.zze;
        AbstractCollection abstractCollection = this.zzc;
        switch (i) {
            case 0:
                zzao zzaoVar = (zzao) abstractCollection;
                if (zzaoVar == null) {
                    ((zzas) serializable).zza.put(obj, this.zzb);
                    break;
                } else {
                    zzaoVar.zza();
                    break;
                }
            case 1:
                zzao zzaoVar2 = (zzao) abstractCollection;
                if (zzaoVar2 == null) {
                    ((zzbw) serializable).zza.put(obj, this.zzb);
                    break;
                } else {
                    zzaoVar2.zza();
                    break;
                }
            default:
                zzao zzaoVar3 = (zzao) abstractCollection;
                if (zzaoVar3 == null) {
                    ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable).zza.put(obj, this.zzb);
                    break;
                } else {
                    zzaoVar3.zza();
                    break;
                }
        }
    }

    public void zzb() {
        Collection collection;
        Collection collection2;
        Collection collection3;
        int i = this.$r8$classId;
        Object obj = this.zza;
        Serializable serializable = this.zze;
        Collection collection4 = this.zzd;
        AbstractCollection abstractCollection = this.zzc;
        switch (i) {
            case 0:
                zzao zzaoVar = (zzao) abstractCollection;
                if (zzaoVar == null) {
                    if (this.zzb.isEmpty() && (collection = (Collection) ((zzas) serializable).zza.get(obj)) != null) {
                        this.zzb = collection;
                        break;
                    }
                } else {
                    zzaoVar.zzb();
                    if (zzaoVar.zzb != collection4) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    }
                }
                break;
            case 1:
                zzao zzaoVar2 = (zzao) abstractCollection;
                if (zzaoVar2 == null) {
                    if (this.zzb.isEmpty() && (collection2 = (Collection) ((zzbw) serializable).zza.get(obj)) != null) {
                        this.zzb = collection2;
                        break;
                    }
                } else {
                    zzaoVar2.zzb();
                    if (zzaoVar2.zzb != collection4) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    }
                }
                break;
            default:
                zzao zzaoVar3 = (zzao) abstractCollection;
                if (zzaoVar3 == null) {
                    if (this.zzb.isEmpty() && (collection3 = (Collection) ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable).zza.get(obj)) != null) {
                        this.zzb = collection3;
                        break;
                    }
                } else {
                    zzaoVar3.zzb();
                    if (zzaoVar3.zzb != collection4) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    }
                }
                break;
        }
    }

    public void zzc() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        Serializable serializable = this.zze;
        AbstractCollection abstractCollection = this.zzc;
        switch (i) {
            case 0:
                zzao zzaoVar = (zzao) abstractCollection;
                if (zzaoVar == null) {
                    if (this.zzb.isEmpty()) {
                        ((zzas) serializable).zza.remove(obj);
                        break;
                    }
                } else {
                    zzaoVar.zzc();
                    break;
                }
                break;
            case 1:
                zzao zzaoVar2 = (zzao) abstractCollection;
                if (zzaoVar2 == null) {
                    if (this.zzb.isEmpty()) {
                        ((zzbw) serializable).zza.remove(obj);
                        break;
                    }
                } else {
                    zzaoVar2.zzc();
                    break;
                }
                break;
            default:
                zzao zzaoVar3 = (zzao) abstractCollection;
                if (zzaoVar3 == null) {
                    if (this.zzb.isEmpty()) {
                        ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) serializable).zza.remove(obj);
                        break;
                    }
                } else {
                    zzaoVar3.zzc();
                    break;
                }
                break;
        }
    }

    public zzao(zzas zzasVar, Object obj, List list, zzao zzaoVar) {
        this.zzf = zzasVar;
        this.zze = zzasVar;
        this.zza = obj;
        this.zzb = list;
        this.zzc = zzaoVar;
        this.zzd = zzaoVar == null ? null : zzaoVar.zzb;
    }

    public zzao(com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar, Object obj, List list, zzao zzaoVar2) {
        this.zzf = zzaoVar;
        this.zze = zzaoVar;
        this.zza = obj;
        this.zzb = list;
        this.zzc = zzaoVar2;
        this.zzd = zzaoVar2 == null ? null : zzaoVar2.zzb;
    }

    public zzao(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Object obj, List list, zzao zzaoVar) {
        this.zzf = multimaps$CustomListMultimap;
        this.zze = multimaps$CustomListMultimap;
        this.zza = obj;
        this.zzb = list;
        this.zzc = zzaoVar;
        this.zzd = zzaoVar == null ? null : zzaoVar.zzb;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.$r8$classId) {
            case 0:
                zzb();
                return new zzan(this, i);
            case 1:
                zzb();
                return new zzbp(this, i);
            case 2:
                zzb();
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzaj(this, i);
            default:
                refreshIfEmpty();
                return new AbstractMapBasedMultimap$WrappedList$WrappedListIterator(this, i);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.$r8$classId;
        Serializable serializable = this.zzf;
        switch (i2) {
            case 0:
                zzb();
                Object remove = ((List) this.zzb).remove(i);
                zzas zzasVar = (zzas) serializable;
                zzasVar.zzb--;
                zzc();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.zzb).remove(i);
                zzbw zzbwVar = (zzbw) serializable;
                zzbwVar.zzb--;
                zzc();
                return remove2;
            case 2:
                zzb();
                Object remove3 = ((List) this.zzb).remove(i);
                zzc();
                return remove3;
            default:
                refreshIfEmpty();
                Object remove4 = ((List) this.zzb).remove(i);
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                multimaps$CustomListMultimap.totalSize--;
                removeIfEmpty();
                return remove4;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.$r8$classId;
        Serializable serializable = this.zzf;
        switch (i2) {
            case 0:
                zzb();
                boolean isEmpty = this.zzb.isEmpty();
                ((List) this.zzb).add(i, obj);
                ((zzas) serializable).zzb++;
                if (isEmpty) {
                    zza();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.zzb.isEmpty();
                ((List) this.zzb).add(i, obj);
                ((zzbw) serializable).zzb++;
                if (isEmpty2) {
                    zza();
                    break;
                }
                break;
            case 2:
                zzb();
                boolean isEmpty3 = this.zzb.isEmpty();
                ((List) this.zzb).add(i, obj);
                if (isEmpty3) {
                    zza();
                    break;
                }
                break;
            default:
                refreshIfEmpty();
                boolean isEmpty4 = this.zzb.isEmpty();
                ((List) this.zzb).add(i, obj);
                ((Multimaps$CustomListMultimap) serializable).totalSize++;
                if (isEmpty4) {
                    addToMap();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int i = this.$r8$classId;
        Serializable serializable = this.zze;
        boolean z = false;
        switch (i) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.zzb.addAll(collection);
                if (addAll) {
                    ((zzas) serializable).zzb += this.zzb.size() - size;
                    if (size == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = this.zzb.addAll(collection);
                if (addAll2) {
                    ((zzbw) serializable).zzb += this.zzb.size() - size2;
                    if (size2 == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll2;
            case 2:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll3 = this.zzb.addAll(collection);
                if (addAll3) {
                    this.zzb.size();
                    if (size3 == 0) {
                        zza();
                        return true;
                    }
                }
                return addAll3;
            default:
                if (!collection.isEmpty()) {
                    int size4 = size();
                    z = this.zzb.addAll(collection);
                    if (z) {
                        ((Multimaps$CustomListMultimap) serializable).totalSize += this.zzb.size() - size4;
                        if (size4 == 0) {
                            addToMap();
                        }
                    }
                }
                return z;
        }
    }
}
