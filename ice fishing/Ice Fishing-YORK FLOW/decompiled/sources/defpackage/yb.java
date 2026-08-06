package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yb extends defpackage.VFeft99leXEK {
    public final java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ int QiMR8OkAhezm = 1;

    public yb(java.lang.Object[] objArr, int i, int i2) {
        super(i, i2);
        this.P05cfTpS5W5L = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.QiMR8OkAhezm;
        java.lang.Object obj = this.P05cfTpS5W5L;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    int i2 = this.WDYagTQQm9ns;
                    this.WDYagTQQm9ns = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    this.WDYagTQQm9ns++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.QiMR8OkAhezm;
        java.lang.Object obj = this.P05cfTpS5W5L;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    int i2 = this.WDYagTQQm9ns - 1;
                    this.WDYagTQQm9ns = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    defpackage.h7.BHfvd2J71qpO();
                    break;
                } else {
                    this.WDYagTQQm9ns--;
                    break;
                }
        }
        return null;
    }

    public yb(int i, java.lang.Object obj) {
        super(i, 1);
        this.P05cfTpS5W5L = obj;
    }
}
