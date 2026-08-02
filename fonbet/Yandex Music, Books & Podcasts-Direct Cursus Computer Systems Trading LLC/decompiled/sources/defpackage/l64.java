package defpackage;

/* loaded from: classes5.dex */
public final class l64 extends wun {
    public final /* synthetic */ m64 a;
    public final /* synthetic */ xun b;

    public l64(m64 m64Var, xun xunVar) {
        this.a = m64Var;
        this.b = xunVar;
    }

    @Override // defpackage.wun
    public final void e() {
        this.a.g = false;
    }

    @Override // defpackage.wun
    public final void f() {
        m64 m64Var = this.a;
        bnd bndVar = m64Var.c;
        m64Var.g = true;
        xun xunVar = this.b;
        Integer valueOf = xunVar != null ? Integer.valueOf(xunVar.f()) : null;
        if ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 5)) {
            m64.a(m64Var, tnl.c);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            m64.a(m64Var, tnl.d);
            h84 h84Var = (h84) bndVar.b;
            h84Var.B(h84Var.f, true);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            m64.a(m64Var, tnl.d);
            h84 h84Var2 = (h84) bndVar.b;
            h84Var2.B(h84Var2.f, false);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            int b = xunVar.b();
            if (b != 0) {
                if (b == 1) {
                    m64.a(m64Var, tnl.e);
                    return;
                }
                if (b != 2) {
                    if (b == 3) {
                        m64.a(m64Var, tnl.c);
                        return;
                    } else {
                        if (b != 4) {
                            return;
                        }
                        m64.a(m64Var, tnl.f);
                        return;
                    }
                }
            }
            m64.a(m64Var, tnl.a);
        }
    }
}
