package defpackage;

/* loaded from: classes.dex */
public final class b40 implements java.util.ListIterator, defpackage.g90 {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object riuEU0zW4;
    public int xiZrDbcSW0;

    public b40(defpackage.gb1 gb1Var, int i) {
        this.adDC3e2L = 3;
        this.riuEU0zW4 = gb1Var;
        this.xiZrDbcSW0 = i - 1;
        this.AARZUJiTa = -1;
        this.EXtogiMhuM = defpackage.ci0.D2vUnMij(gb1Var);
    }

    public void IHQe1A4L2xu() {
        int i;
        i = ((java.util.AbstractList) ((defpackage.se0) this.riuEU0zW4).riuEU0zW4).modCount;
        if (i != this.EXtogiMhuM) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = this.adDC3e2L;
        java.lang.Object obj2 = this.riuEU0zW4;
        switch (i3) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                IHQe1A4L2xu();
                defpackage.se0 se0Var = (defpackage.se0) obj2;
                int i4 = this.xiZrDbcSW0;
                this.xiZrDbcSW0 = i4 + 1;
                se0Var.add(i4, obj);
                this.AARZUJiTa = -1;
                i = ((java.util.AbstractList) se0Var).modCount;
                this.EXtogiMhuM = i;
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                oh6vYeIP();
                defpackage.te0 te0Var = (defpackage.te0) obj2;
                int i5 = this.xiZrDbcSW0;
                this.xiZrDbcSW0 = i5 + 1;
                te0Var.add(i5, obj);
                this.AARZUJiTa = -1;
                i2 = ((java.util.AbstractList) te0Var).modCount;
                this.EXtogiMhuM = i2;
                return;
            default:
                r1MBDhnF();
                defpackage.gb1 gb1Var = (defpackage.gb1) obj2;
                gb1Var.add(this.xiZrDbcSW0 + 1, obj);
                this.AARZUJiTa = -1;
                this.xiZrDbcSW0++;
                this.EXtogiMhuM = defpackage.ci0.D2vUnMij(gb1Var);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                if (this.xiZrDbcSW0 < this.EXtogiMhuM) {
                    break;
                }
                break;
            case 1:
                if (this.xiZrDbcSW0 < ((defpackage.se0) obj).AARZUJiTa) {
                    break;
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.xiZrDbcSW0 < ((defpackage.te0) obj).xiZrDbcSW0) {
                    break;
                }
                break;
            default:
                if (this.xiZrDbcSW0 < ((defpackage.gb1) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.adDC3e2L) {
            case 0:
                if (this.xiZrDbcSW0 > this.AARZUJiTa) {
                }
                break;
            case 1:
                if (this.xiZrDbcSW0 > 0) {
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.xiZrDbcSW0 > 0) {
                }
                break;
            default:
                if (this.xiZrDbcSW0 >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                defpackage.gl0 gl0Var = ((defpackage.d40) obj).adDC3e2L;
                int i2 = this.xiZrDbcSW0;
                this.xiZrDbcSW0 = i2 + 1;
                java.lang.Object xiZrDbcSW0 = gl0Var.xiZrDbcSW0(i2);
                xiZrDbcSW0.getClass();
                return (defpackage.lj0) xiZrDbcSW0;
            case 1:
                IHQe1A4L2xu();
                int i3 = this.xiZrDbcSW0;
                defpackage.se0 se0Var = (defpackage.se0) obj;
                if (i3 >= se0Var.AARZUJiTa) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                this.xiZrDbcSW0 = i3 + 1;
                this.AARZUJiTa = i3;
                return se0Var.adDC3e2L[se0Var.xiZrDbcSW0 + i3];
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                oh6vYeIP();
                int i4 = this.xiZrDbcSW0;
                defpackage.te0 te0Var = (defpackage.te0) obj;
                if (i4 >= te0Var.xiZrDbcSW0) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                this.xiZrDbcSW0 = i4 + 1;
                this.AARZUJiTa = i4;
                return te0Var.adDC3e2L[i4];
            default:
                r1MBDhnF();
                int i5 = this.xiZrDbcSW0 + 1;
                this.AARZUJiTa = i5;
                defpackage.gb1 gb1Var = (defpackage.gb1) obj;
                defpackage.ci0.riuEU0zW4(i5, gb1Var.size());
                java.lang.Object obj2 = gb1Var.get(i5);
                this.xiZrDbcSW0 = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.adDC3e2L) {
            case 0:
                return this.xiZrDbcSW0 - this.AARZUJiTa;
            case 1:
                return this.xiZrDbcSW0;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return this.xiZrDbcSW0;
            default:
                return this.xiZrDbcSW0 + 1;
        }
    }

    public void oh6vYeIP() {
        int i;
        i = ((java.util.AbstractList) ((defpackage.te0) this.riuEU0zW4)).modCount;
        if (i != this.EXtogiMhuM) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i) {
            case 0:
                defpackage.gl0 gl0Var = ((defpackage.d40) obj).adDC3e2L;
                int i2 = this.xiZrDbcSW0 - 1;
                this.xiZrDbcSW0 = i2;
                java.lang.Object xiZrDbcSW0 = gl0Var.xiZrDbcSW0(i2);
                xiZrDbcSW0.getClass();
                return (defpackage.lj0) xiZrDbcSW0;
            case 1:
                IHQe1A4L2xu();
                int i3 = this.xiZrDbcSW0;
                if (i3 <= 0) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                int i4 = i3 - 1;
                this.xiZrDbcSW0 = i4;
                this.AARZUJiTa = i4;
                defpackage.se0 se0Var = (defpackage.se0) obj;
                return se0Var.adDC3e2L[se0Var.xiZrDbcSW0 + i4];
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                oh6vYeIP();
                int i5 = this.xiZrDbcSW0;
                if (i5 <= 0) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                int i6 = i5 - 1;
                this.xiZrDbcSW0 = i6;
                this.AARZUJiTa = i6;
                return ((defpackage.te0) obj).adDC3e2L[i6];
            default:
                r1MBDhnF();
                defpackage.gb1 gb1Var = (defpackage.gb1) obj;
                defpackage.ci0.riuEU0zW4(this.xiZrDbcSW0, gb1Var.size());
                int i7 = this.xiZrDbcSW0;
                this.AARZUJiTa = i7;
                this.xiZrDbcSW0--;
                return gb1Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.adDC3e2L) {
            case 0:
                return (this.xiZrDbcSW0 - this.AARZUJiTa) - 1;
            case 1:
                i = this.xiZrDbcSW0;
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                i = this.xiZrDbcSW0;
                break;
            default:
                return this.xiZrDbcSW0;
        }
        return i - 1;
    }

    public void r1MBDhnF() {
        if (defpackage.ci0.D2vUnMij((defpackage.gb1) this.riuEU0zW4) != this.EXtogiMhuM) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.adDC3e2L;
        java.lang.Object obj = this.riuEU0zW4;
        switch (i3) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                defpackage.se0 se0Var = (defpackage.se0) obj;
                IHQe1A4L2xu();
                int i4 = this.AARZUJiTa;
                if (i4 == -1) {
                    defpackage.db.AARZUJiTa("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                se0Var.oh6vYeIP(i4);
                this.xiZrDbcSW0 = this.AARZUJiTa;
                this.AARZUJiTa = -1;
                i = ((java.util.AbstractList) se0Var).modCount;
                this.EXtogiMhuM = i;
                return;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.te0 te0Var = (defpackage.te0) obj;
                oh6vYeIP();
                int i5 = this.AARZUJiTa;
                if (i5 == -1) {
                    defpackage.db.AARZUJiTa("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                te0Var.oh6vYeIP(i5);
                this.xiZrDbcSW0 = this.AARZUJiTa;
                this.AARZUJiTa = -1;
                i2 = ((java.util.AbstractList) te0Var).modCount;
                this.EXtogiMhuM = i2;
                return;
            default:
                r1MBDhnF();
                defpackage.gb1 gb1Var = (defpackage.gb1) obj;
                gb1Var.remove(this.AARZUJiTa);
                this.xiZrDbcSW0--;
                this.AARZUJiTa = -1;
                this.EXtogiMhuM = defpackage.ci0.D2vUnMij(gb1Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        int i = this.adDC3e2L;
        java.lang.Object obj2 = this.riuEU0zW4;
        switch (i) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                IHQe1A4L2xu();
                int i2 = this.AARZUJiTa;
                if (i2 != -1) {
                    ((defpackage.se0) obj2).set(i2, obj);
                    return;
                } else {
                    defpackage.db.AARZUJiTa("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                oh6vYeIP();
                int i3 = this.AARZUJiTa;
                if (i3 != -1) {
                    ((defpackage.te0) obj2).set(i3, obj);
                    return;
                } else {
                    defpackage.db.AARZUJiTa("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                defpackage.gb1 gb1Var = (defpackage.gb1) obj2;
                r1MBDhnF();
                int i4 = this.AARZUJiTa;
                if (i4 < 0) {
                    defpackage.db.AARZUJiTa("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    gb1Var.set(i4, obj);
                    this.EXtogiMhuM = defpackage.ci0.D2vUnMij(gb1Var);
                    return;
                }
        }
    }

    public b40(defpackage.te0 te0Var, int i) {
        int i2;
        this.adDC3e2L = 2;
        this.riuEU0zW4 = te0Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = -1;
        i2 = ((java.util.AbstractList) te0Var).modCount;
        this.EXtogiMhuM = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b40(defpackage.d40 d40Var, int i, int i2) {
        this(d40Var, (i2 & 1) != 0 ? 0 : i, 0, d40Var.adDC3e2L.oh6vYeIP);
        this.adDC3e2L = 0;
    }

    public b40(defpackage.d40 d40Var, int i, int i2, int i3) {
        this.adDC3e2L = 0;
        this.riuEU0zW4 = d40Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
        this.EXtogiMhuM = i3;
    }

    public b40(defpackage.se0 se0Var, int i) {
        int i2;
        this.adDC3e2L = 1;
        this.riuEU0zW4 = se0Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = -1;
        i2 = ((java.util.AbstractList) se0Var).modCount;
        this.EXtogiMhuM = i2;
    }
}
