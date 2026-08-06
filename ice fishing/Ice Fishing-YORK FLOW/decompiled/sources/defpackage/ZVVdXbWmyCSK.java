package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class ZVVdXbWmyCSK implements java.util.Iterator, defpackage.nb0 {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public ZVVdXbWmyCSK(defpackage.rv rvVar) {
        this.WDYagTQQm9ns = 3;
        this.QiMR8OkAhezm = rvVar;
        this.oh71FJcDz6S2 = rvVar.fWTAfUmVKrZq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                if (this.oh71FJcDz6S2 < ((defpackage.IJ0hOnjhPOri) obj).ZpBGe2uQfcn8()) {
                    break;
                }
                break;
            case 1:
                if (this.oh71FJcDz6S2 < ((java.lang.Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (this.oh71FJcDz6S2 > 0) {
                    break;
                }
                break;
            default:
                if (this.oh71FJcDz6S2 < ((defpackage.rf1) obj).WDYagTQQm9ns()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    defpackage.h7.BHfvd2J71qpO();
                    return null;
                }
                int i2 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i2 + 1;
                return ((defpackage.IJ0hOnjhPOri) obj).get(i2);
            case 1:
                try {
                    int i3 = this.oh71FJcDz6S2;
                    this.oh71FJcDz6S2 = i3 + 1;
                    return ((java.lang.Object[]) obj)[i3];
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    this.oh71FJcDz6S2--;
                    throw new java.util.NoSuchElementException(e.getMessage());
                }
            case 2:
                int i4 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i4 + 1;
                if (i4 >= 0) {
                    return new defpackage.x60(i4, ((java.util.Iterator) obj).next());
                }
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            case 3:
                defpackage.rv rvVar = (defpackage.rv) obj;
                int i5 = rvVar.fWTAfUmVKrZq;
                int i6 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i6 - 1;
                return rvVar.WDYagTQQm9ns[i5 - i6];
            default:
                int i7 = this.oh71FJcDz6S2;
                this.oh71FJcDz6S2 = i7 + 1;
                return ((defpackage.rf1) obj).oh71FJcDz6S2(i7);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ZVVdXbWmyCSK(java.lang.Object[] objArr) {
        this.WDYagTQQm9ns = 1;
        objArr.getClass();
        this.QiMR8OkAhezm = objArr;
    }

    public ZVVdXbWmyCSK(java.util.Iterator it) {
        this.WDYagTQQm9ns = 2;
        it.getClass();
        this.QiMR8OkAhezm = it;
    }

    public /* synthetic */ ZVVdXbWmyCSK(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.QiMR8OkAhezm = obj;
    }
}
