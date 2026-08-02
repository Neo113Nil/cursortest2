package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzag;
import com.google.android.gms.internal.mlkit_vision_face.zzao;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AbstractMapBasedMultimap$WrappedList$WrappedListIterator extends zzag implements ListIterator {
    public final /* synthetic */ zzao this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$WrappedList$WrappedListIterator(zzao zzaoVar, int i) {
        super(zzaoVar, ((List) zzaoVar.zzb).listIterator(i), (byte) 0);
        this.this$1 = zzaoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzao zzaoVar = this.this$1;
        boolean isEmpty = zzaoVar.isEmpty();
        getDelegateListIterator().add(obj);
        ((Multimaps$CustomListMultimap) zzaoVar.zzf).totalSize++;
        if (isEmpty) {
            zzaoVar.addToMap();
        }
    }

    public final ListIterator getDelegateListIterator() {
        validateIterator();
        return (ListIterator) this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getDelegateListIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getDelegateListIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return getDelegateListIterator().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getDelegateListIterator().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        getDelegateListIterator().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$WrappedList$WrappedListIterator(zzao zzaoVar) {
        super(zzaoVar, (byte) 0);
        this.this$1 = zzaoVar;
    }
}
