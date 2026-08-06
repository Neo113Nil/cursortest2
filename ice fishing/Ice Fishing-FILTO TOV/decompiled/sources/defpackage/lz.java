package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lz implements ListIterator, q40 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public int encWxUiV2;
    public final Object mOu10nynGul;

    public lz(p41 p41Var, int i) {
        this.OOA6hdeuvCS = 3;
        this.mOu10nynGul = p41Var;
        this.EljAMC1QTz = i - 1;
        this.AvO7iQsrTN = -1;
        this.encWxUiV2 = qj.EXrPz3p7hFb(p41Var);
    }

    public void GWasM1elztuh() {
        int i;
        i = ((AbstractList) ((sa0) this.mOu10nynGul).mOu10nynGul).modCount;
        if (i != this.encWxUiV2) {
            throw new ConcurrentModificationException();
        }
    }

    public void X1lG3V04pd() {
        if (qj.EXrPz3p7hFb((p41) this.mOu10nynGul) != this.encWxUiV2) {
            throw new ConcurrentModificationException();
        }
    }

    public void Yi7zF1RB1() {
        int i;
        i = ((AbstractList) ((ta0) this.mOu10nynGul)).modCount;
        if (i != this.encWxUiV2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.OOA6hdeuvCS;
        Object obj2 = this.mOu10nynGul;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                GWasM1elztuh();
                sa0 sa0Var = (sa0) obj2;
                int i4 = this.EljAMC1QTz;
                this.EljAMC1QTz = i4 + 1;
                sa0Var.add(i4, obj);
                this.AvO7iQsrTN = -1;
                i = ((AbstractList) sa0Var).modCount;
                this.encWxUiV2 = i;
                return;
            case 2:
                Yi7zF1RB1();
                ta0 ta0Var = (ta0) obj2;
                int i5 = this.EljAMC1QTz;
                this.EljAMC1QTz = i5 + 1;
                ta0Var.add(i5, obj);
                this.AvO7iQsrTN = -1;
                i2 = ((AbstractList) ta0Var).modCount;
                this.encWxUiV2 = i2;
                return;
            default:
                X1lG3V04pd();
                p41 p41Var = (p41) obj2;
                p41Var.add(this.EljAMC1QTz + 1, obj);
                this.AvO7iQsrTN = -1;
                this.EljAMC1QTz++;
                this.encWxUiV2 = qj.EXrPz3p7hFb(p41Var);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.mOu10nynGul;
        switch (i) {
            case 0:
                if (this.EljAMC1QTz < this.encWxUiV2) {
                    break;
                }
                break;
            case 1:
                if (this.EljAMC1QTz < ((sa0) obj).AvO7iQsrTN) {
                    break;
                }
                break;
            case 2:
                if (this.EljAMC1QTz < ((ta0) obj).EljAMC1QTz) {
                    break;
                }
                break;
            default:
                if (this.EljAMC1QTz < ((p41) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.EljAMC1QTz > this.AvO7iQsrTN) {
                }
                break;
            case 1:
                if (this.EljAMC1QTz > 0) {
                }
                break;
            case 2:
                if (this.EljAMC1QTz > 0) {
                }
                break;
            default:
                if (this.EljAMC1QTz >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.mOu10nynGul;
        switch (i) {
            case 0:
                ag0 ag0Var = ((nz) obj).OOA6hdeuvCS;
                int i2 = this.EljAMC1QTz;
                this.EljAMC1QTz = i2 + 1;
                Object EljAMC1QTz = ag0Var.EljAMC1QTz(i2);
                EljAMC1QTz.getClass();
                return (he0) EljAMC1QTz;
            case 1:
                GWasM1elztuh();
                int i3 = this.EljAMC1QTz;
                sa0 sa0Var = (sa0) obj;
                if (i3 >= sa0Var.AvO7iQsrTN) {
                    o4.E7jCp8Ls();
                    return null;
                }
                this.EljAMC1QTz = i3 + 1;
                this.AvO7iQsrTN = i3;
                return sa0Var.OOA6hdeuvCS[sa0Var.EljAMC1QTz + i3];
            case 2:
                Yi7zF1RB1();
                int i4 = this.EljAMC1QTz;
                ta0 ta0Var = (ta0) obj;
                if (i4 >= ta0Var.EljAMC1QTz) {
                    o4.E7jCp8Ls();
                    return null;
                }
                this.EljAMC1QTz = i4 + 1;
                this.AvO7iQsrTN = i4;
                return ta0Var.OOA6hdeuvCS[i4];
            default:
                X1lG3V04pd();
                int i5 = this.EljAMC1QTz + 1;
                this.AvO7iQsrTN = i5;
                p41 p41Var = (p41) obj;
                qj.EljAMC1QTz(i5, p41Var.size());
                Object obj2 = p41Var.get(i5);
                this.EljAMC1QTz = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return this.EljAMC1QTz - this.AvO7iQsrTN;
            case 1:
                return this.EljAMC1QTz;
            case 2:
                return this.EljAMC1QTz;
            default:
                return this.EljAMC1QTz + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.mOu10nynGul;
        switch (i) {
            case 0:
                ag0 ag0Var = ((nz) obj).OOA6hdeuvCS;
                int i2 = this.EljAMC1QTz - 1;
                this.EljAMC1QTz = i2;
                Object EljAMC1QTz = ag0Var.EljAMC1QTz(i2);
                EljAMC1QTz.getClass();
                return (he0) EljAMC1QTz;
            case 1:
                GWasM1elztuh();
                int i3 = this.EljAMC1QTz;
                if (i3 <= 0) {
                    o4.E7jCp8Ls();
                    return null;
                }
                int i4 = i3 - 1;
                this.EljAMC1QTz = i4;
                this.AvO7iQsrTN = i4;
                sa0 sa0Var = (sa0) obj;
                return sa0Var.OOA6hdeuvCS[sa0Var.EljAMC1QTz + i4];
            case 2:
                Yi7zF1RB1();
                int i5 = this.EljAMC1QTz;
                if (i5 <= 0) {
                    o4.E7jCp8Ls();
                    return null;
                }
                int i6 = i5 - 1;
                this.EljAMC1QTz = i6;
                this.AvO7iQsrTN = i6;
                return ((ta0) obj).OOA6hdeuvCS[i6];
            default:
                X1lG3V04pd();
                p41 p41Var = (p41) obj;
                qj.EljAMC1QTz(this.EljAMC1QTz, p41Var.size());
                int i7 = this.EljAMC1QTz;
                this.AvO7iQsrTN = i7;
                this.EljAMC1QTz--;
                return p41Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.OOA6hdeuvCS) {
            case 0:
                return (this.EljAMC1QTz - this.AvO7iQsrTN) - 1;
            case 1:
                i = this.EljAMC1QTz;
                break;
            case 2:
                i = this.EljAMC1QTz;
                break;
            default:
                return this.EljAMC1QTz;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.OOA6hdeuvCS;
        Object obj = this.mOu10nynGul;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                sa0 sa0Var = (sa0) obj;
                GWasM1elztuh();
                int i4 = this.AvO7iQsrTN;
                if (i4 == -1) {
                    o4.jivtDDk9H("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                sa0Var.Yi7zF1RB1(i4);
                this.EljAMC1QTz = this.AvO7iQsrTN;
                this.AvO7iQsrTN = -1;
                i = ((AbstractList) sa0Var).modCount;
                this.encWxUiV2 = i;
                return;
            case 2:
                ta0 ta0Var = (ta0) obj;
                Yi7zF1RB1();
                int i5 = this.AvO7iQsrTN;
                if (i5 == -1) {
                    o4.jivtDDk9H("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ta0Var.Yi7zF1RB1(i5);
                this.EljAMC1QTz = this.AvO7iQsrTN;
                this.AvO7iQsrTN = -1;
                i2 = ((AbstractList) ta0Var).modCount;
                this.encWxUiV2 = i2;
                return;
            default:
                X1lG3V04pd();
                p41 p41Var = (p41) obj;
                p41Var.remove(this.AvO7iQsrTN);
                this.EljAMC1QTz--;
                this.AvO7iQsrTN = -1;
                this.encWxUiV2 = qj.EXrPz3p7hFb(p41Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.OOA6hdeuvCS;
        Object obj2 = this.mOu10nynGul;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                GWasM1elztuh();
                int i2 = this.AvO7iQsrTN;
                if (i2 != -1) {
                    ((sa0) obj2).set(i2, obj);
                    return;
                } else {
                    o4.jivtDDk9H("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                Yi7zF1RB1();
                int i3 = this.AvO7iQsrTN;
                if (i3 != -1) {
                    ((ta0) obj2).set(i3, obj);
                    return;
                } else {
                    o4.jivtDDk9H("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                p41 p41Var = (p41) obj2;
                X1lG3V04pd();
                int i4 = this.AvO7iQsrTN;
                if (i4 < 0) {
                    o4.jivtDDk9H("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    p41Var.set(i4, obj);
                    this.encWxUiV2 = qj.EXrPz3p7hFb(p41Var);
                    return;
                }
        }
    }

    public lz(ta0 ta0Var, int i) {
        int i2;
        this.OOA6hdeuvCS = 2;
        this.mOu10nynGul = ta0Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = -1;
        i2 = ((AbstractList) ta0Var).modCount;
        this.encWxUiV2 = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lz(nz nzVar, int i, int i2) {
        this(nzVar, (i2 & 1) != 0 ? 0 : i, 0, nzVar.OOA6hdeuvCS.Yi7zF1RB1);
        this.OOA6hdeuvCS = 0;
    }

    public lz(nz nzVar, int i, int i2, int i3) {
        this.OOA6hdeuvCS = 0;
        this.mOu10nynGul = nzVar;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
        this.encWxUiV2 = i3;
    }

    public lz(sa0 sa0Var, int i) {
        int i2;
        this.OOA6hdeuvCS = 1;
        this.mOu10nynGul = sa0Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = -1;
        i2 = ((AbstractList) sa0Var).modCount;
        this.encWxUiV2 = i2;
    }
}
