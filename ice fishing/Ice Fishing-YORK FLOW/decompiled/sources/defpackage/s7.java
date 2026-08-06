package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s7 implements java.util.Iterator, defpackage.nb0 {
    public final /* synthetic */ int P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public int oh71FJcDz6S2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s7(defpackage.w7 w7Var, int i) {
        this(w7Var.QiMR8OkAhezm);
        this.P05cfTpS5W5L = i;
        switch (i) {
            case 1:
                this.e6mdH7fiFuta = w7Var;
                this(w7Var.QiMR8OkAhezm);
                break;
            default:
                this.e6mdH7fiFuta = w7Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.oh71FJcDz6S2 < this.WDYagTQQm9ns;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object WDYagTQQm9ns;
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        int i = this.oh71FJcDz6S2;
        int i2 = this.P05cfTpS5W5L;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i2) {
            case 0:
                WDYagTQQm9ns = ((defpackage.w7) obj).WDYagTQQm9ns(i);
                break;
            case 1:
                WDYagTQQm9ns = ((defpackage.w7) obj).P05cfTpS5W5L(i);
                break;
            default:
                WDYagTQQm9ns = ((defpackage.x7) obj).oh71FJcDz6S2[i];
                break;
        }
        this.oh71FJcDz6S2++;
        this.QiMR8OkAhezm = true;
        return WDYagTQQm9ns;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.QiMR8OkAhezm) {
            defpackage.h7.P05cfTpS5W5L("Call next() before removing an element.");
            return;
        }
        int i = this.oh71FJcDz6S2 - 1;
        this.oh71FJcDz6S2 = i;
        int i2 = this.P05cfTpS5W5L;
        java.lang.Object obj = this.e6mdH7fiFuta;
        switch (i2) {
            case 0:
                ((defpackage.w7) obj).oh71FJcDz6S2(i);
                break;
            case 1:
                ((defpackage.w7) obj).oh71FJcDz6S2(i);
                break;
            default:
                ((defpackage.x7) obj).ZpBGe2uQfcn8(i);
                break;
        }
        this.WDYagTQQm9ns--;
        this.QiMR8OkAhezm = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s7(defpackage.x7 x7Var) {
        this(x7Var.QiMR8OkAhezm);
        this.P05cfTpS5W5L = 2;
        this.e6mdH7fiFuta = x7Var;
    }

    public s7(int i) {
        this.WDYagTQQm9ns = i;
    }
}
