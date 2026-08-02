package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class msf {
    public final int a;
    public final lsf[] b;
    public final jtc c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public msf(int i, lsf[] lsfVarArr, jtc jtcVar, List list, int i2) {
        this.a = i;
        this.b = lsfVarArr;
        this.c = jtcVar;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (lsf lsfVar : lsfVarArr) {
            i3 = Math.max(i3, lsfVar.n);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final lsf[] a(int i, int i2, int i3) {
        lsf[] lsfVarArr = this.b;
        int length = lsfVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            lsf lsfVar = lsfVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((ypd) this.d.get(i5)).a;
            lsfVar.l(i, ((int[]) this.c.b)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return lsfVarArr;
    }
}
