package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class jdo implements ListIterator, j9f {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public jdo(fb9 fb9Var, int i) {
        this.c = fb9Var;
        List list = (List) fb9Var.c;
        if (i >= 0 && i <= fb9Var.f()) {
            this.b = list.listIterator(fb9Var.f() - i);
            return;
        }
        StringBuilder q = k5r.q(i, "Position index ", " must be in range [");
        q.append(new IntRange(0, fb9Var.f(), 1));
        q.append("].");
        throw new IndexOutOfBoundsException(q.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).hasPrevious();
            default:
                return ((vqn) this.b).a < ((smr) this.c).d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).hasNext();
            default:
                return ((vqn) this.b).a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).previous();
            default:
                vqn vqnVar = (vqn) this.b;
                int i = vqnVar.a + 1;
                smr smrVar = (smr) this.c;
                fgq.r(i, smrVar.d);
                vqnVar.a = i;
                return smrVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                fb9 fb9Var = (fb9) this.c;
                return (fb9Var.size() - 1) - ((ListIterator) this.b).previousIndex();
            default:
                return ((vqn) this.b).a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                return ((ListIterator) this.b).next();
            default:
                vqn vqnVar = (vqn) this.b;
                int i = vqnVar.a;
                smr smrVar = (smr) this.c;
                fgq.r(i, smrVar.d);
                vqnVar.a = i - 1;
                return smrVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                fb9 fb9Var = (fb9) this.c;
                return (fb9Var.size() - 1) - ((ListIterator) this.b).nextIndex();
            default:
                return ((vqn) this.b).a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public jdo(vqn vqnVar, smr smrVar) {
        this.b = vqnVar;
        this.c = smrVar;
    }
}
