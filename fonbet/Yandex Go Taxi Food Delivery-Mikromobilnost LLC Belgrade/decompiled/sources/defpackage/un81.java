package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes7.dex */
public final class un81 extends po71 implements ListIterator {
    public final /* synthetic */ er81 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un81(er81 er81Var, int i) {
        super(er81Var, ((List) er81Var.b).listIterator(i));
        this.x = er81Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        er81 er81Var = this.x;
        boolean isEmpty = er81Var.isEmpty();
        b().add(obj);
        er81Var.y.x++;
        if (isEmpty) {
            er81Var.a();
        }
    }

    public final ListIterator b() {
        er81 er81Var = (er81) this.w;
        er81Var.b();
        if (er81Var.b == ((Collection) this.c)) {
            return (ListIterator) this.b;
        }
        ny61.y();
        return null;
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
    public un81(er81 er81Var) {
        super(er81Var);
        this.x = er81Var;
    }
}
