package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ec1 implements java.util.Iterator, defpackage.kl, defpackage.nb0 {
    public defpackage.kl QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public java.lang.Object oh71FJcDz6S2;

    public final java.lang.RuntimeException ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns;
        if (i == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.WDYagTQQm9ns);
    }

    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        defpackage.b80.KrtOTfE6jiS2(obj);
        this.WDYagTQQm9ns = 4;
    }

    public final void giKS3J6vZuNy(java.lang.Object obj, defpackage.f51 f51Var) {
        this.oh71FJcDz6S2 = obj;
        this.WDYagTQQm9ns = 3;
        this.QiMR8OkAhezm = f51Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.WDYagTQQm9ns;
            if (i != 0) {
                break;
            }
            this.WDYagTQQm9ns = 5;
            defpackage.kl klVar = this.QiMR8OkAhezm;
            klVar.getClass();
            this.QiMR8OkAhezm = null;
            klVar.e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw ZpBGe2uQfcn8();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.WDYagTQQm9ns;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        if (i == 2) {
            this.WDYagTQQm9ns = 1;
            throw null;
        }
        if (i != 3) {
            throw ZpBGe2uQfcn8();
        }
        this.WDYagTQQm9ns = 0;
        java.lang.Object obj = this.oh71FJcDz6S2;
        this.oh71FJcDz6S2 = null;
        return obj;
    }

    @Override // defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        return defpackage.xu.WDYagTQQm9ns;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
