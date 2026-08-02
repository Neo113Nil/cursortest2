package defpackage;

import java.util.Set;

/* loaded from: classes5.dex */
public final class zva implements yva, txa {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final oi5 d;
    public final nnk e;

    public zva(String str, String str2, oi5 oi5Var, nnk nnkVar, int i) {
        this.a = i;
        str.getClass();
        str2.getClass();
        oi5Var.getClass();
        switch (i) {
            case 1:
                this.b = str;
                this.c = str2;
                this.d = oi5Var;
                this.e = nnkVar;
                break;
            default:
                this.b = str;
                this.c = str2;
                this.d = oi5Var;
                this.e = nnkVar;
                break;
        }
    }

    @Override // defpackage.yva
    public final void b(String str) {
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                this.d.g(this.b, this.c, str);
                break;
            default:
                this.d.g(this.b, this.c, str);
                break;
        }
    }

    @Override // defpackage.txa
    public void e() {
        nnk nnkVar = this.e;
        ((ug5) ((wg5) nnkVar.a).a.getValue()).a(new vg5((xh5) nnkVar.b, 1));
    }

    @Override // defpackage.yva
    public final void g() {
        switch (this.a) {
            case 0:
                this.e.d();
                break;
            default:
                this.e.d();
                break;
        }
    }

    @Override // defpackage.yva
    public final void h() {
        switch (this.a) {
            case 0:
                this.d.i(this.b, this.c);
                this.e.F();
                break;
            default:
                this.d.i(this.b, this.c);
                this.e.F();
                break;
        }
    }

    @Override // defpackage.txa
    public void k() {
        Object value;
        Set set;
        rg5 rg5Var;
        nnk nnkVar = this.e;
        ug5 ug5Var = (ug5) ((wg5) nnkVar.a).a.getValue();
        xh5 xh5Var = (xh5) nnkVar.b;
        xdr xdrVar = ug5Var.a;
        do {
            value = xdrVar.getValue();
            tg5 tg5Var = (tg5) value;
            tg5Var.getClass();
            boolean z = tg5Var instanceof rg5;
            rg5 rg5Var2 = z ? (rg5) tg5Var : null;
            if (rg5Var2 == null || (set = rg5Var2.a) == null) {
                set = q5b.a;
            }
            rg5Var = z ? (rg5) tg5Var : null;
        } while (!xdrVar.k(value, new rg5(set, wop.j(rg5Var != null ? rg5Var.b : q5b.a, xh5Var))));
    }
}
