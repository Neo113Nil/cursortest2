package O;

import a.AbstractC0078a;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f787a;

    /* renamed from: b, reason: collision with root package name */
    public G.c[] f788b;

    public b0() {
        this(new j0());
    }

    public final void a() {
        G.c[] cVarArr = this.f788b;
        if (cVarArr != null) {
            G.c cVar = cVarArr[0];
            G.c cVar2 = cVarArr[1];
            j0 j0Var = this.f787a;
            if (cVar2 == null) {
                cVar2 = j0Var.f819a.f(2);
            }
            if (cVar == null) {
                cVar = j0Var.f819a.f(1);
            }
            g(G.c.a(cVar, cVar2));
            G.c cVar3 = this.f788b[AbstractC0078a.J(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            G.c cVar4 = this.f788b[AbstractC0078a.J(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            G.c cVar5 = this.f788b[AbstractC0078a.J(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract j0 b();

    public void c(int i, G.c cVar) {
        if (this.f788b == null) {
            this.f788b = new G.c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f788b[AbstractC0078a.J(i2)] = cVar;
            }
        }
    }

    public void d(G.c cVar) {
    }

    public abstract void e(G.c cVar);

    public void f(G.c cVar) {
    }

    public abstract void g(G.c cVar);

    public void h(G.c cVar) {
    }

    public b0(j0 j0Var) {
        this.f787a = j0Var;
    }
}
