package defpackage;

/* loaded from: classes5.dex */
public abstract class b1 {
    public final /* synthetic */ int a;
    public final Class b;

    public /* synthetic */ b1(int i, Class cls) {
        this.a = i;
        this.b = cls;
    }

    public void a(s0 s0Var) {
        if (this.b.isInstance(s0Var)) {
            return;
        }
        xq0.q("unexpected object: ".concat(s0Var.getClass().getName()));
    }

    public abstract Object b(d8 d8Var);

    public s0 c(byte[] bArr) {
        s0 y = s0.y(bArr);
        a(y);
        return y;
    }

    public s0 d(v0 v0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public s0 e(a07 a07Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public s0 f(z0 z0Var, boolean z) {
        s0 d;
        if (128 != z0Var.b) {
            xq0.q("this method only valid for CONTEXT_SPECIFIC tags");
            return null;
        }
        int i = z0Var.a;
        d0 d0Var = z0Var.d;
        if (z) {
            if (!z0Var.D()) {
                xq0.q("object explicit - implicit expected.");
                return null;
            }
            d = d0Var.n();
            a(d);
        } else {
            if (1 == i) {
                xq0.q("object explicit - implicit expected.");
                return null;
            }
            s0 n = d0Var.n();
            if (i == 3) {
                d = d(z0Var.E(n));
            } else if (i != 4) {
                a(n);
                d = n;
            } else {
                d = n instanceof v0 ? d((v0) n) : e((a07) n);
            }
        }
        a(d);
        return d;
    }

    public abstract d8 g(mn3 mn3Var);

    public abstract void h(d8 d8Var);
}
