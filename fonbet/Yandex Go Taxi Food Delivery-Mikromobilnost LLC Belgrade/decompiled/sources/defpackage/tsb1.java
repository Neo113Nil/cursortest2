package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.l;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class tsb1 extends po71 implements ListIterator {
    public final /* synthetic */ l x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsb1(l lVar, int i) {
        super(lVar, ((List) lVar.b).listIterator(i));
        this.x = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l lVar = this.x;
        boolean isEmpty = lVar.isEmpty();
        a();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            lVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsb1(l lVar) {
        super(lVar);
        this.x = lVar;
    }
}
