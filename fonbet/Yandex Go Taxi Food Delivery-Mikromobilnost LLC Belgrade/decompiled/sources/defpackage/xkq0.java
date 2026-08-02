package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.foundation.text.selection.j;

/* loaded from: classes10.dex */
public final class xkq0 implements yly0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public xkq0(j jVar, boolean z) {
        this.c = jVar;
        this.b = z;
    }

    private final void e() {
    }

    private final void f(long j, dkq0 dkq0Var) {
    }

    @Override // defpackage.yly0
    public final void a() {
        ckq0 g;
        rzx c;
        ery0 d;
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                i iVar = (i) obj;
                if ((z ? (wu60) iVar.p.getValue() : (wu60) iVar.q.getValue()) != null && (g = iVar.g()) != null) {
                    ho40 c2 = iVar.c(z ? g.a : g.b);
                    if (c2 != null && (c = c2.c()) != null) {
                        long a = c2.a(g, z);
                        if ((9223372034707292159L & a) != 9205357640488583168L) {
                            iVar.s.setValue(new wu60(iVar.k().T(c, qkq0.a(a))));
                            iVar.r.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
                            iVar.x = false;
                            iVar.o();
                            break;
                        }
                    }
                }
                break;
            default:
                j jVar = (j) obj;
                jVar.r.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
                long a2 = qkq0.a(jVar.m(z));
                oay oayVar = jVar.d;
                if (oayVar != null && (d = oayVar.d()) != null) {
                    long e = d.e(a2);
                    jVar.o = e;
                    jVar.s.setValue(new wu60(e));
                    jVar.q = 0L;
                    jVar.t = -1;
                    oay oayVar2 = jVar.d;
                    if (oayVar2 != null) {
                        oayVar2.q.setValue(Boolean.TRUE);
                    }
                    jVar.u(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yly0
    public final void b(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                i iVar = (i) obj;
                oz40 oz40Var = iVar.n;
                oz40 oz40Var2 = iVar.o;
                if (iVar.f() != null) {
                    oz40Var2.setValue(new wu60(wu60.f(((wu60) oz40Var2.getValue()).a, j)));
                    long f = wu60.f(((wu60) oz40Var.getValue()).a, ((wu60) oz40Var2.getValue()).a);
                    if (iVar.n(f, ((wu60) iVar.n.getValue()).a, this.b, wfz.T)) {
                        oz40Var.setValue(new wu60(f));
                        oz40Var2.setValue(new wu60(0L));
                        break;
                    }
                }
                break;
            default:
                j jVar = (j) obj;
                long f2 = wu60.f(jVar.q, j);
                jVar.q = f2;
                jVar.s.setValue(new wu60(wu60.f(jVar.o, f2)));
                j.c(jVar, jVar.o(), jVar.j().a, false, this.b, wfz.T, true, new z6u(9));
                jVar.u(false);
                break;
        }
    }

    @Override // defpackage.yly0
    public final void c(long j, dkq0 dkq0Var) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.c;
                if (iVar.f() != null) {
                    ckq0 g = iVar.g();
                    boolean z = this.b;
                    Object e = iVar.a.c.e((z ? g.a : g.b).c);
                    if (e == null) {
                        lxv.d("SelectionRegistrar should contain the current selection's selectableIds");
                        ny61.A();
                        break;
                    } else {
                        ho40 ho40Var = (ho40) e;
                        rzx c = ho40Var.c();
                        if (c == null) {
                            lxv.d("Current selectable should have layout coordinates.");
                            ny61.A();
                            break;
                        } else {
                            long a = ho40Var.a(g, z);
                            if ((9223372034707292159L & a) != 9205357640488583168L) {
                                nzs.i(iVar.k().T(c, qkq0.a(a)), iVar.n);
                                nzs.i(0L, iVar.o);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.yly0
    public final void d() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                i iVar = (i) obj;
                iVar.x = true;
                iVar.o();
                iVar.r.setValue(null);
                iVar.s.setValue(null);
                break;
            default:
                j jVar = (j) obj;
                jVar.r.setValue(null);
                jVar.s.setValue(null);
                jVar.u(true);
                break;
        }
    }

    @Override // defpackage.yly0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                i iVar = (i) this.c;
                iVar.x = true;
                iVar.o();
                iVar.r.setValue(null);
                iVar.s.setValue(null);
                break;
        }
    }

    @Override // defpackage.yly0
    public final void onStop() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                i iVar = (i) obj;
                iVar.x = true;
                iVar.o();
                iVar.r.setValue(null);
                iVar.s.setValue(null);
                break;
            default:
                j jVar = (j) obj;
                jVar.r.setValue(null);
                jVar.s.setValue(null);
                jVar.u(true);
                break;
        }
    }

    public xkq0(boolean z, i iVar) {
        this.b = z;
        this.c = iVar;
    }
}
