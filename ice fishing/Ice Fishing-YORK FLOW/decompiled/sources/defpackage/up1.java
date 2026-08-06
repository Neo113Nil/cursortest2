package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class up1 extends defpackage.VFeft99leXEK {
    public java.lang.Object[] P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public boolean e6mdH7fiFuta;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public up1(java.lang.Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.QiMR8OkAhezm = i3;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.P05cfTpS5W5L = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e6mdH7fiFuta = r5;
        objArr2[0] = objArr;
        giKS3J6vZuNy(i - r5, 1);
    }

    public final java.lang.Object ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns & 31;
        java.lang.Object obj = this.P05cfTpS5W5L[this.QiMR8OkAhezm - 1];
        obj.getClass();
        return ((java.lang.Object[]) obj)[i];
    }

    public final void fWTAfUmVKrZq(int i) {
        int i2 = 0;
        while (defpackage.m90.OcTWLQzke1i2(this.WDYagTQQm9ns, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            giKS3J6vZuNy(this.WDYagTQQm9ns, ((this.QiMR8OkAhezm - 1) - (i2 / 5)) + 1);
        }
    }

    public final void giKS3J6vZuNy(int i, int i2) {
        int i3 = (this.QiMR8OkAhezm - i2) * 5;
        while (i2 < this.QiMR8OkAhezm) {
            java.lang.Object[] objArr = this.P05cfTpS5W5L;
            java.lang.Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((java.lang.Object[]) obj)[defpackage.m90.OcTWLQzke1i2(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        java.lang.Object ZpBGe2uQfcn8 = ZpBGe2uQfcn8();
        int i = this.WDYagTQQm9ns + 1;
        this.WDYagTQQm9ns = i;
        if (i == this.oh71FJcDz6S2) {
            this.e6mdH7fiFuta = true;
            return ZpBGe2uQfcn8;
        }
        fWTAfUmVKrZq(0);
        return ZpBGe2uQfcn8;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        this.WDYagTQQm9ns--;
        if (this.e6mdH7fiFuta) {
            this.e6mdH7fiFuta = false;
            return ZpBGe2uQfcn8();
        }
        fWTAfUmVKrZq(31);
        return ZpBGe2uQfcn8();
    }
}
