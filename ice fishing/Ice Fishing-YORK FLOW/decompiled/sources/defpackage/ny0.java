package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ny0 extends defpackage.VFeft99leXEK {
    public int GE9mJIPrb8gP;
    public int P05cfTpS5W5L;
    public final defpackage.ly0 QiMR8OkAhezm;
    public defpackage.up1 e6mdH7fiFuta;

    public ny0(defpackage.ly0 ly0Var, int i) {
        super(i, ly0Var.fNwYGHIYeJcR);
        this.QiMR8OkAhezm = ly0Var;
        this.P05cfTpS5W5L = ly0Var.WDYagTQQm9ns();
        this.GE9mJIPrb8gP = -1;
        giKS3J6vZuNy();
    }

    public final void ZpBGe2uQfcn8() {
        if (this.P05cfTpS5W5L != this.QiMR8OkAhezm.WDYagTQQm9ns()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // defpackage.VFeft99leXEK, java.util.ListIterator
    public final void add(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i = this.WDYagTQQm9ns;
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        ly0Var.add(i, obj);
        this.WDYagTQQm9ns++;
        this.oh71FJcDz6S2 = ly0Var.ZpBGe2uQfcn8();
        this.P05cfTpS5W5L = ly0Var.WDYagTQQm9ns();
        this.GE9mJIPrb8gP = -1;
        giKS3J6vZuNy();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void giKS3J6vZuNy() {
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        java.lang.Object[] objArr = ly0Var.GE9mJIPrb8gP;
        if (objArr == null) {
            this.e6mdH7fiFuta = null;
            return;
        }
        int i = (ly0Var.fNwYGHIYeJcR - 1) & (-32);
        int i2 = this.WDYagTQQm9ns;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ly0Var.P05cfTpS5W5L / 5) + 1;
        defpackage.up1 up1Var = this.e6mdH7fiFuta;
        if (up1Var == null) {
            this.e6mdH7fiFuta = new defpackage.up1(objArr, i2, i, i3);
            return;
        }
        up1Var.WDYagTQQm9ns = i2;
        up1Var.oh71FJcDz6S2 = i;
        up1Var.QiMR8OkAhezm = i3;
        if (up1Var.P05cfTpS5W5L.length < i3) {
            up1Var.P05cfTpS5W5L = new java.lang.Object[i3];
        }
        up1Var.P05cfTpS5W5L[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        up1Var.e6mdH7fiFuta = r0;
        up1Var.giKS3J6vZuNy(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        ZpBGe2uQfcn8();
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        int i = this.WDYagTQQm9ns;
        this.GE9mJIPrb8gP = i;
        defpackage.up1 up1Var = this.e6mdH7fiFuta;
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        if (up1Var == null) {
            java.lang.Object[] objArr = ly0Var.Ns0WNyEWdPsk;
            this.WDYagTQQm9ns = i + 1;
            return objArr[i];
        }
        if (up1Var.hasNext()) {
            this.WDYagTQQm9ns++;
            return up1Var.next();
        }
        java.lang.Object[] objArr2 = ly0Var.Ns0WNyEWdPsk;
        int i2 = this.WDYagTQQm9ns;
        this.WDYagTQQm9ns = i2 + 1;
        return objArr2[i2 - up1Var.oh71FJcDz6S2];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        ZpBGe2uQfcn8();
        if (!hasPrevious()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        int i = this.WDYagTQQm9ns;
        this.GE9mJIPrb8gP = i - 1;
        defpackage.up1 up1Var = this.e6mdH7fiFuta;
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        if (up1Var == null) {
            java.lang.Object[] objArr = ly0Var.Ns0WNyEWdPsk;
            int i2 = i - 1;
            this.WDYagTQQm9ns = i2;
            return objArr[i2];
        }
        int i3 = up1Var.oh71FJcDz6S2;
        if (i <= i3) {
            this.WDYagTQQm9ns = i - 1;
            return up1Var.previous();
        }
        java.lang.Object[] objArr2 = ly0Var.Ns0WNyEWdPsk;
        int i4 = i - 1;
        this.WDYagTQQm9ns = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.VFeft99leXEK, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ZpBGe2uQfcn8();
        int i = this.GE9mJIPrb8gP;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        ly0Var.giKS3J6vZuNy(i);
        int i2 = this.GE9mJIPrb8gP;
        if (i2 < this.WDYagTQQm9ns) {
            this.WDYagTQQm9ns = i2;
        }
        this.oh71FJcDz6S2 = ly0Var.ZpBGe2uQfcn8();
        this.P05cfTpS5W5L = ly0Var.WDYagTQQm9ns();
        this.GE9mJIPrb8gP = -1;
        giKS3J6vZuNy();
    }

    @Override // defpackage.VFeft99leXEK, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        ZpBGe2uQfcn8();
        int i = this.GE9mJIPrb8gP;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.ly0 ly0Var = this.QiMR8OkAhezm;
        ly0Var.set(i, obj);
        this.P05cfTpS5W5L = ly0Var.WDYagTQQm9ns();
        giKS3J6vZuNy();
    }
}
