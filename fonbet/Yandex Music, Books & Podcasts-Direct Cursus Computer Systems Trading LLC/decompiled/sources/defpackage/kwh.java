package defpackage;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class kwh implements bwh, dra {
    public final mwh a;
    public final /* synthetic */ nwh b;

    public kwh(nwh nwhVar, mwh mwhVar) {
        this.b = nwhVar;
        this.a = mwhVar;
    }

    @Override // defpackage.bwh
    public final void A(int i, uvh uvhVar, cfg cfgVar, boh bohVar, int i2) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new ylh(i2, 2, this, a, cfgVar, bohVar));
        }
    }

    @Override // defpackage.bwh
    public final void C(int i, uvh uvhVar, boh bohVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new gwh(this, a, bohVar, 1));
        }
    }

    @Override // defpackage.bwh
    public final void J(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new iwh(this, a, cfgVar, bohVar, 0));
        }
    }

    @Override // defpackage.bwh
    public final void K(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new iwh(this, a, cfgVar, bohVar, 1));
        }
    }

    @Override // defpackage.dra
    public final void T(int i, uvh uvhVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new hwh(this, a, 2));
        }
    }

    public final Pair a(int i, uvh uvhVar) {
        uvh uvhVar2;
        mwh mwhVar = this.a;
        uvh uvhVar3 = null;
        if (uvhVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= mwhVar.c.size()) {
                    uvhVar2 = null;
                    break;
                }
                if (((uvh) mwhVar.c.get(i2)).d == uvhVar.d) {
                    Object obj = uvhVar.a;
                    Object obj2 = mwhVar.b;
                    int i3 = h1m.n;
                    uvhVar2 = uvhVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (uvhVar2 == null) {
                return null;
            }
            uvhVar3 = uvhVar2;
        }
        return Pair.create(Integer.valueOf(i + mwhVar.d), uvhVar3);
    }

    @Override // defpackage.dra
    public final void d(int i, uvh uvhVar, Exception exc) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new cy1(23, this, a, exc));
        }
    }

    @Override // defpackage.bwh
    public final void f(int i, uvh uvhVar, boh bohVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new gwh(this, a, bohVar, 0));
        }
    }

    @Override // defpackage.dra
    public final void g(int i, uvh uvhVar, int i2) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new e02(this, a, i2, 8));
        }
    }

    @Override // defpackage.bwh
    public final void i(int i, uvh uvhVar, final cfg cfgVar, final boh bohVar, final IOException iOException, final boolean z) {
        final Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new Runnable() { // from class: jwh
                @Override // java.lang.Runnable
                public final void run() {
                    uj7 uj7Var = (uj7) kwh.this.b.i;
                    Pair pair = a;
                    uj7Var.i(((Integer) pair.first).intValue(), (uvh) pair.second, cfgVar, bohVar, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.dra
    public final void r(int i, uvh uvhVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new hwh(this, a, 0));
        }
    }

    @Override // defpackage.dra
    public final void w(int i, uvh uvhVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new hwh(this, a, 3));
        }
    }

    @Override // defpackage.dra
    public final void x(int i, uvh uvhVar) {
        Pair a = a(i, uvhVar);
        if (a != null) {
            ((hzr) this.b.j).e(new hwh(this, a, 1));
        }
    }
}
