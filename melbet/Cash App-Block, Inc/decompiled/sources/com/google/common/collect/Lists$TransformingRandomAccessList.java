package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.common.base.Function;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class Lists$TransformingRandomAccessList extends AbstractList implements RandomAccess, Serializable {
    public final /* synthetic */ int $r8$classId = 1;
    public final List fromList;
    public final Object function;

    public Lists$TransformingRandomAccessList(List list, Function function) {
        list.getClass();
        this.fromList = list;
        function.getClass();
        this.function = function;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.function;
        List list = this.fromList;
        switch (i2) {
            case 0:
                return ((Function) obj).apply(list.get(i));
            default:
                return ((zzu) obj).zza(list.get(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.$r8$classId) {
        }
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.$r8$classId) {
        }
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new Lists$TransformingSequentialList.AnonymousClass1(this, this.fromList.listIterator(i), 1);
            default:
                return new zzbq(this, this.fromList.listIterator(i), 0);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.function;
        List list = this.fromList;
        switch (i2) {
            case 0:
                return ((Function) obj).apply(list.remove(i));
            default:
                return ((zzu) obj).zza(list.remove(i));
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                this.fromList.subList(i, i2).clear();
                break;
            default:
                this.fromList.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.$r8$classId) {
        }
        return this.fromList.size();
    }

    public Lists$TransformingRandomAccessList(List list, zzu zzuVar) {
        list.getClass();
        this.fromList = list;
        this.function = zzuVar;
    }
}
