package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import com.google.common.collect.TransformedIterator;
import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class zzbq extends TransformedIterator implements ListIterator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractList zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzbq(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.$r8$classId = i;
        this.zza = abstractList;
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
        return zza(((ListIterator) this.backingIterator).previous());
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
    public final Object zza(Object obj) {
        int i = this.$r8$classId;
        AbstractList abstractList = this.zza;
        switch (i) {
            case 0:
                return ((zzu) ((Lists$TransformingRandomAccessList) abstractList).function).zza(obj);
            default:
                return ((zzu) ((Lists$TransformingSequentialList) abstractList).function).zza(obj);
        }
    }
}
