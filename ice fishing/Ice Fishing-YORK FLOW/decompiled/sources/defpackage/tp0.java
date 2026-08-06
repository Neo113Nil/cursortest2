package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tp0 implements java.util.Iterator, defpackage.nb0 {
    public final /* synthetic */ defpackage.up0 QiMR8OkAhezm;
    public int WDYagTQQm9ns = -1;
    public boolean oh71FJcDz6S2;

    public tp0(defpackage.up0 up0Var) {
        this.QiMR8OkAhezm = up0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WDYagTQQm9ns + 1 < ((defpackage.rf1) this.QiMR8OkAhezm.fWTAfUmVKrZq).WDYagTQQm9ns();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        this.oh71FJcDz6S2 = true;
        defpackage.rf1 rf1Var = (defpackage.rf1) this.QiMR8OkAhezm.fWTAfUmVKrZq;
        int i = this.WDYagTQQm9ns + 1;
        this.WDYagTQQm9ns = i;
        return (defpackage.np0) rf1Var.oh71FJcDz6S2(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.oh71FJcDz6S2) {
            defpackage.h7.P05cfTpS5W5L("You must call next() before you can remove an element");
            return;
        }
        defpackage.rf1 rf1Var = (defpackage.rf1) this.QiMR8OkAhezm.fWTAfUmVKrZq;
        ((defpackage.np0) rf1Var.oh71FJcDz6S2(this.WDYagTQQm9ns)).QiMR8OkAhezm = null;
        int i = this.WDYagTQQm9ns;
        java.lang.Object[] objArr = rf1Var.QiMR8OkAhezm;
        java.lang.Object obj = objArr[i];
        java.lang.Object obj2 = defpackage.i61.Ns0WNyEWdPsk;
        if (obj != obj2) {
            objArr[i] = obj2;
            rf1Var.WDYagTQQm9ns = true;
        }
        this.WDYagTQQm9ns = i - 1;
        this.oh71FJcDz6S2 = false;
    }
}
