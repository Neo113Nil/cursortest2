package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class xgo implements yr2, lb6 {
    public final czg a;
    public final cs2 b;
    public hup c;

    public xgo(czg czgVar, ds2 ds2Var, wgo wgoVar) {
        this.a = czgVar;
        cs2 a = wgoVar.a.a();
        this.b = a;
        ds2Var.e(a);
        a.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.yr2
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.lb6
    public final void b(List list, List list2) {
    }
}
