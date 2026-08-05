package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kp implements ListIterator, xn {
    public int MdtA4re8;
    public final sjUBp5pO P7K7Inc8;
    public int VgvYg0wo;
    public final /* synthetic */ int NCTxEWno = 0;
    public int wxUZMvaN = -1;

    public kp(mp mpVar, int i) {
        int i2;
        this.P7K7Inc8 = mpVar;
        this.MdtA4re8 = i;
        i2 = ((AbstractList) mpVar).modCount;
        this.VgvYg0wo = i2;
    }

    public void NCTxEWno() {
        int i;
        i = ((AbstractList) ((mp) this.P7K7Inc8)).modCount;
        if (i != this.VgvYg0wo) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i3) {
            case 0:
                qoPGr6Ce();
                lp lpVar = (lp) sjubp5po;
                int i4 = this.MdtA4re8;
                this.MdtA4re8 = i4 + 1;
                lpVar.add(i4, obj);
                this.wxUZMvaN = -1;
                i = ((AbstractList) lpVar).modCount;
                this.VgvYg0wo = i;
                break;
            default:
                NCTxEWno();
                mp mpVar = (mp) sjubp5po;
                int i5 = this.MdtA4re8;
                this.MdtA4re8 = i5 + 1;
                mpVar.add(i5, obj);
                this.wxUZMvaN = -1;
                i2 = ((AbstractList) mpVar).modCount;
                this.VgvYg0wo = i2;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i) {
            case 0:
                if (this.MdtA4re8 < ((lp) sjubp5po).wxUZMvaN) {
                    break;
                }
                break;
            default:
                if (this.MdtA4re8 < ((mp) sjubp5po).MdtA4re8) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.NCTxEWno) {
            case 0:
                if (this.MdtA4re8 > 0) {
                }
                break;
            default:
                if (this.MdtA4re8 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i) {
            case 0:
                qoPGr6Ce();
                int i2 = this.MdtA4re8;
                lp lpVar = (lp) sjubp5po;
                if (i2 >= lpVar.wxUZMvaN) {
                    throw new NoSuchElementException();
                }
                this.MdtA4re8 = i2 + 1;
                this.wxUZMvaN = i2;
                return lpVar.NCTxEWno[lpVar.MdtA4re8 + i2];
            default:
                NCTxEWno();
                int i3 = this.MdtA4re8;
                mp mpVar = (mp) sjubp5po;
                if (i3 >= mpVar.MdtA4re8) {
                    throw new NoSuchElementException();
                }
                this.MdtA4re8 = i3 + 1;
                this.wxUZMvaN = i3;
                return mpVar.NCTxEWno[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.NCTxEWno) {
        }
        return this.MdtA4re8;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i) {
            case 0:
                qoPGr6Ce();
                int i2 = this.MdtA4re8;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.MdtA4re8 = i3;
                this.wxUZMvaN = i3;
                lp lpVar = (lp) sjubp5po;
                return lpVar.NCTxEWno[lpVar.MdtA4re8 + i3];
            default:
                NCTxEWno();
                int i4 = this.MdtA4re8;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.MdtA4re8 = i5;
                this.wxUZMvaN = i5;
                return ((mp) sjubp5po).NCTxEWno[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.NCTxEWno) {
            case 0:
                i = this.MdtA4re8;
                break;
            default:
                i = this.MdtA4re8;
                break;
        }
        return i - 1;
    }

    public void qoPGr6Ce() {
        int i;
        i = ((AbstractList) ((lp) this.P7K7Inc8).P7K7Inc8).modCount;
        if (i != this.VgvYg0wo) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i3) {
            case 0:
                lp lpVar = (lp) sjubp5po;
                qoPGr6Ce();
                int i4 = this.wxUZMvaN;
                if (i4 == -1) {
                    m1.Ey6iv0m0("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    lpVar.NCTxEWno(i4);
                    this.MdtA4re8 = this.wxUZMvaN;
                    this.wxUZMvaN = -1;
                    i = ((AbstractList) lpVar).modCount;
                    this.VgvYg0wo = i;
                    break;
                }
            default:
                mp mpVar = (mp) sjubp5po;
                NCTxEWno();
                int i5 = this.wxUZMvaN;
                if (i5 == -1) {
                    m1.Ey6iv0m0("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    mpVar.NCTxEWno(i5);
                    this.MdtA4re8 = this.wxUZMvaN;
                    this.wxUZMvaN = -1;
                    i2 = ((AbstractList) mpVar).modCount;
                    this.VgvYg0wo = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.NCTxEWno;
        sjUBp5pO sjubp5po = this.P7K7Inc8;
        switch (i) {
            case 0:
                qoPGr6Ce();
                int i2 = this.wxUZMvaN;
                if (i2 == -1) {
                    m1.Ey6iv0m0("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((lp) sjubp5po).set(i2, obj);
                    break;
                }
            default:
                NCTxEWno();
                int i3 = this.wxUZMvaN;
                if (i3 == -1) {
                    m1.Ey6iv0m0("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((mp) sjubp5po).set(i3, obj);
                    break;
                }
        }
    }

    public kp(lp lpVar, int i) {
        int i2;
        this.P7K7Inc8 = lpVar;
        this.MdtA4re8 = i;
        i2 = ((AbstractList) lpVar).modCount;
        this.VgvYg0wo = i2;
    }
}
