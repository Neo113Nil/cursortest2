package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class my0 extends defpackage.VFeft99leXEK {
    public final defpackage.up1 P05cfTpS5W5L;
    public final java.lang.Object[] QiMR8OkAhezm;

    public my0(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.QiMR8OkAhezm = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.P05cfTpS5W5L = new defpackage.up1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        defpackage.up1 up1Var = this.P05cfTpS5W5L;
        if (up1Var.hasNext()) {
            this.WDYagTQQm9ns++;
            return up1Var.next();
        }
        int i = this.WDYagTQQm9ns;
        this.WDYagTQQm9ns = i + 1;
        return this.QiMR8OkAhezm[i - up1Var.oh71FJcDz6S2];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        int i = this.WDYagTQQm9ns;
        defpackage.up1 up1Var = this.P05cfTpS5W5L;
        int i2 = up1Var.oh71FJcDz6S2;
        if (i <= i2) {
            this.WDYagTQQm9ns = i - 1;
            return up1Var.previous();
        }
        int i3 = i - 1;
        this.WDYagTQQm9ns = i3;
        return this.QiMR8OkAhezm[i3 - i2];
    }
}
