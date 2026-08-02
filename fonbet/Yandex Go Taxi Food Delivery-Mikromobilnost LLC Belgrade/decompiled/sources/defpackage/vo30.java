package defpackage;

import ru.yandex.taxi.masstransit.main.ui.overlay.a;

/* loaded from: classes6.dex */
public final class vo30 implements wo30 {
    public final /* synthetic */ a a;

    public vo30(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if ((r6 != null ? r6.c : null) == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if ((r6 != null ? r6.b : null) == null) goto L25;
     */
    @Override // defpackage.wo30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e5(qfu0 qfu0Var) {
        a aVar = this.a;
        ah00 ah00Var = aVar.c;
        f4c0 f4c0Var = aVar.e;
        if (f4c0Var == null) {
        }
        if ((qfu0Var != null ? qfu0Var.b : null) == null) {
            if (f4c0Var != null) {
                f4c0Var.d();
            }
            f4c0 f4c0Var2 = aVar.e;
            if (f4c0Var2 != null) {
                f4c0Var2.g(null);
            }
        } else {
            if (f4c0Var == null) {
                xm00 xm00Var = aVar.d;
                if (xm00Var != null) {
                    aVar.e = xm00Var.r(cwa1.d(qfu0Var.a.b));
                }
            }
            f4c0 f4c0Var3 = aVar.e;
            if (f4c0Var3 != null) {
                f4c0Var3.o(cwa1.d(qfu0Var.a.b));
                bl00 bl00Var = qfu0Var.b;
                f4c0Var3.z(bl00Var.a, bl00Var.b);
                f4c0Var3.g(new uj0(2, aVar, qfu0Var));
            }
        }
        f4c0 f4c0Var4 = aVar.f;
        if (f4c0Var4 == null) {
        }
        if ((qfu0Var != null ? qfu0Var.c : null) != null) {
            if (f4c0Var4 == null) {
                xm00 xm00Var2 = aVar.d;
                if (xm00Var2 != null) {
                    aVar.f = xm00Var2.r(cwa1.d(qfu0Var.a.b));
                }
            }
            f4c0 f4c0Var5 = aVar.f;
            if (f4c0Var5 != null) {
                f4c0Var5.o(cwa1.d(qfu0Var.a.b));
            }
            f4c0 f4c0Var6 = aVar.f;
            if (f4c0Var6 != null) {
                bl00 bl00Var2 = qfu0Var.c;
                f4c0Var6.z(bl00Var2.a, bl00Var2.b);
            }
        } else if (f4c0Var4 != null) {
            f4c0Var4.d();
        }
        l30 l30Var = aVar.g;
        if (l30Var != null) {
            l30Var.cancel();
        }
        if (qfu0Var == null) {
            return;
        }
        a.a(aVar, qfu0Var, ((gh00) ah00Var).j());
        yh00 yh00Var = new yh00(1, aVar, qfu0Var);
        ((gh00) ah00Var).e(yh00Var);
        aVar.g = new l30(10, aVar, yh00Var);
    }
}
