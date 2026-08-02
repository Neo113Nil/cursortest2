package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class w7 extends o7 implements ListIterator {
    public final /* synthetic */ x7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x7 x7Var, int i) {
        super(x7Var, ((List) x7Var.b).listIterator(i));
        this.e = x7Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        x7 x7Var = this.e;
        boolean isEmpty = x7Var.isEmpty();
        b().add(obj);
        x7Var.f.e++;
        if (isEmpty) {
            x7Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x7 x7Var) {
        super(x7Var);
        this.e = x7Var;
    }
}
