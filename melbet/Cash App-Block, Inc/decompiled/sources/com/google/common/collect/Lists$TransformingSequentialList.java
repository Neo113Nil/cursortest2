package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class Lists$TransformingSequentialList extends AbstractSequentialList implements Serializable {
    public final /* synthetic */ int $r8$classId = 1;
    public final List fromList;
    public final Object function;

    /* renamed from: com.google.common.collect.Lists$TransformingSequentialList$1, reason: invalid class name */
    public final class AnonymousClass1 extends TransformedIterator implements ListIterator {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ AbstractList this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(AbstractList abstractList, ListIterator listIterator, int i) {
            super(listIterator, 0);
            this.$r8$classId = i;
            this.this$0 = abstractList;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return ((ListIterator) this.backingIterator).hasPrevious();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return ((ListIterator) this.backingIterator).nextIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return transform(((ListIterator) this.backingIterator).previous());
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return ((ListIterator) this.backingIterator).previousIndex();
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object transform(Object obj) {
            int i = this.$r8$classId;
            AbstractList abstractList = this.this$0;
            switch (i) {
                case 0:
                    return ((Function) ((Lists$TransformingSequentialList) abstractList).function).apply(obj);
                default:
                    return ((Function) ((Lists$TransformingRandomAccessList) abstractList).function).apply(obj);
            }
        }
    }

    public Lists$TransformingSequentialList(List list, Function function) {
        list.getClass();
        this.fromList = list;
        function.getClass();
        this.function = function;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.$r8$classId) {
        }
        return this.fromList.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new AnonymousClass1(this, this.fromList.listIterator(i), 0);
            default:
                return new zzbq(this, this.fromList.listIterator(i), 1);
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

    public Lists$TransformingSequentialList(List list, zzu zzuVar) {
        list.getClass();
        this.fromList = list;
        this.function = zzuVar;
    }
}
