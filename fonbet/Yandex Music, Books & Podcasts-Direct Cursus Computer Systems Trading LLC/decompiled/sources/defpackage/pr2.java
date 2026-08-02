package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class pr2 implements xfu {
    public final WeakReference a;
    public int b;
    public int c;

    public pr2(qr2 qr2Var) {
        this.a = new WeakReference(qr2Var);
    }

    @Override // defpackage.xfu
    public final void a(int i, float f, int i2) {
        qr2 qr2Var = (qr2) this.a.get();
        if (qr2Var != null) {
            if (this.c != 2 || this.b == 1) {
                k5c k5cVar = qr2.G;
                qr2Var.m(i, f);
            }
        }
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        qr2 qr2Var = (qr2) this.a.get();
        if (qr2Var == null || qr2Var.getSelectedTabPosition() == i) {
            return;
        }
        int i2 = this.c;
        qr2Var.k((or2) qr2Var.a.get(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    @Override // defpackage.xfu
    public final void c(int i) {
        this.b = this.c;
        this.c = i;
    }
}
