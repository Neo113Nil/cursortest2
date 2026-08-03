package bc;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 implements ListIterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1050g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1052i;

    public b0(c0 c0Var, int i10) {
        this.f1052i = c0Var;
        List list = c0Var.f1054g;
        if (i10 >= 0 && i10 <= c0Var.a()) {
            this.f1051h = list.listIterator(c0Var.a() - i10);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new uc.d(0, c0Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1050g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1050g) {
            case 0:
                return ((ListIterator) this.f1051h).hasPrevious();
            default:
                return ((pc.q) this.f1051h).f5681g < ((w0.y) this.f1052i).f7625j - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1050g) {
            case 0:
                return ((ListIterator) this.f1051h).hasNext();
            default:
                return ((pc.q) this.f1051h).f5681g >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1050g) {
            case 0:
                return ((ListIterator) this.f1051h).previous();
            default:
                pc.q qVar = (pc.q) this.f1051h;
                int i10 = qVar.f5681g + 1;
                w0.y yVar = (w0.y) this.f1052i;
                w0.r.a(i10, yVar.f7625j);
                qVar.f5681g = i10;
                return yVar.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1050g) {
            case 0:
                c0 c0Var = (c0) this.f1052i;
                return n.K(c0Var) - ((ListIterator) this.f1051h).previousIndex();
            default:
                return ((pc.q) this.f1051h).f5681g + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1050g) {
            case 0:
                return ((ListIterator) this.f1051h).next();
            default:
                pc.q qVar = (pc.q) this.f1051h;
                int i10 = qVar.f5681g;
                w0.y yVar = (w0.y) this.f1052i;
                w0.r.a(i10, yVar.f7625j);
                qVar.f5681g = i10 - 1;
                return yVar.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1050g) {
            case 0:
                c0 c0Var = (c0) this.f1052i;
                return n.K(c0Var) - ((ListIterator) this.f1051h).nextIndex();
            default:
                return ((pc.q) this.f1051h).f5681g;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1050g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1050g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public b0(pc.q qVar, w0.y yVar) {
        this.f1051h = qVar;
        this.f1052i = yVar;
    }
}
