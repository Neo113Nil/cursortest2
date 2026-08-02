package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_common.e;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class x591 extends po71 implements ListIterator {
    public final /* synthetic */ e x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x591(e eVar, int i) {
        super(eVar, ((List) eVar.b).listIterator(i));
        this.x = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e eVar = this.x;
        boolean isEmpty = eVar.isEmpty();
        a();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            eVar.a();
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
    public x591(e eVar) {
        super(eVar);
        this.x = eVar;
    }
}
