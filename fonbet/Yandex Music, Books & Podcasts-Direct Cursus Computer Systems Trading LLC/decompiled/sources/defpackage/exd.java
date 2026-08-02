package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class exd extends ynv {
    @Override // defpackage.px7
    public final void a(px7 px7Var) {
        ap2 ap2Var = (ap2) this.b;
        int i = ap2Var.w0;
        sx7 sx7Var = this.h;
        Iterator it = sx7Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((sx7) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            sx7Var.d(i3 + ap2Var.y0);
        } else {
            sx7Var.d(i2 + ap2Var.y0);
        }
    }

    @Override // defpackage.ynv
    public final void d() {
        aa6 aa6Var = this.b;
        if (aa6Var instanceof ap2) {
            sx7 sx7Var = this.h;
            sx7Var.b = true;
            ArrayList arrayList = sx7Var.l;
            ap2 ap2Var = (ap2) aa6Var;
            int i = ap2Var.w0;
            boolean z = ap2Var.x0;
            int i2 = 0;
            if (i == 0) {
                sx7Var.e = 4;
                while (i2 < ap2Var.v0) {
                    aa6 aa6Var2 = ap2Var.u0[i2];
                    if (z || aa6Var2.i0 != 8) {
                        sx7 sx7Var2 = aa6Var2.d.h;
                        sx7Var2.k.add(sx7Var);
                        arrayList.add(sx7Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                sx7Var.e = 5;
                while (i2 < ap2Var.v0) {
                    aa6 aa6Var3 = ap2Var.u0[i2];
                    if (z || aa6Var3.i0 != 8) {
                        sx7 sx7Var3 = aa6Var3.d.i;
                        sx7Var3.k.add(sx7Var);
                        arrayList.add(sx7Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                sx7Var.e = 6;
                while (i2 < ap2Var.v0) {
                    aa6 aa6Var4 = ap2Var.u0[i2];
                    if (z || aa6Var4.i0 != 8) {
                        sx7 sx7Var4 = aa6Var4.e.h;
                        sx7Var4.k.add(sx7Var);
                        arrayList.add(sx7Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            sx7Var.e = 7;
            while (i2 < ap2Var.v0) {
                aa6 aa6Var5 = ap2Var.u0[i2];
                if (z || aa6Var5.i0 != 8) {
                    sx7 sx7Var5 = aa6Var5.e.i;
                    sx7Var5.k.add(sx7Var);
                    arrayList.add(sx7Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.ynv
    public final void e() {
        aa6 aa6Var = this.b;
        if (aa6Var instanceof ap2) {
            int i = ((ap2) aa6Var).w0;
            sx7 sx7Var = this.h;
            if (i == 0 || i == 1) {
                aa6Var.a0 = sx7Var.g;
            } else {
                aa6Var.b0 = sx7Var.g;
            }
        }
    }

    @Override // defpackage.ynv
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ynv
    public final boolean k() {
        return false;
    }

    public final void m(sx7 sx7Var) {
        sx7 sx7Var2 = this.h;
        sx7Var2.k.add(sx7Var);
        sx7Var.l.add(sx7Var2);
    }
}
