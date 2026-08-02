package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class c3k extends dgu {
    public int a = -1;
    public final zx0 b = new zx0();
    public final /* synthetic */ d3k c;

    public c3k(d3k d3kVar) {
        this.c = d3kVar;
    }

    @Override // defpackage.dgu
    public final void a(int i) {
        if (i == 0) {
            d();
        }
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        int i2 = i9f.a;
        if (this.a == i) {
            return;
        }
        if (i != -1) {
            this.b.add(Integer.valueOf(i));
        }
        if (this.a == -1) {
            d();
        }
        this.a = i;
    }

    public final void d() {
        while (true) {
            zx0 zx0Var = this.b;
            if (zx0Var.isEmpty()) {
                return;
            }
            int intValue = ((Number) zx0Var.removeFirst()).intValue();
            int i = i9f.a;
            d3k d3kVar = this.c;
            k79 k79Var = (k79) d3kVar.b.get(intValue);
            List t = k79Var.a.d().t();
            if (t != null) {
                d3kVar.a.v(new t03(19, d3kVar, k79Var, t));
            }
        }
    }
}
