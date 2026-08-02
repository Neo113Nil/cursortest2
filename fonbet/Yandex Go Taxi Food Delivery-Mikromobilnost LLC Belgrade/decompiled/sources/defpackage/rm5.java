package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class rm5 implements yt11 {
    public final /* synthetic */ int a;
    public final Object b;
    public final tpr c;
    public final Object d;

    public rm5(zuj0 zuj0Var, int i) {
        this.a = i;
        String str = null;
        switch (i) {
            case 2:
                this.d = zuj0Var;
                r0 c = bvf0.c(null);
                this.b = c;
                this.c = new mth(c, 6);
                break;
            default:
                this.d = zuj0Var;
                r0 c2 = bvf0.c(new qm5(str, str, str, 63));
                this.b = c2;
                this.c = e.d(c2);
                break;
        }
    }

    @Override // defpackage.yt11
    public final tpr a() {
        switch (this.a) {
            case 0:
                return (gci0) this.c;
            case 1:
                return (gci0) this.c;
            case 2:
                return (mth) this.c;
            default:
                return (gci0) this.c;
        }
    }

    public void b(tls tlsVar, String str) {
        Object value;
        c4z0 c4z0Var = (c4z0) this.b;
        z3z0 z3z0Var = new z3z0(str, tlsVar);
        r0 r0Var = c4z0Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, (x3z0) z3z0Var.invoke((x3z0) value)));
    }

    public rm5(bn9 bn9Var) {
        this.a = 1;
        this.d = bn9Var;
        r0 c = bvf0.c(new an9(null, null, null));
        this.b = c;
        this.c = e.d(c);
    }

    public rm5(zuj0 zuj0Var, c4z0 c4z0Var) {
        this.a = 3;
        this.d = zuj0Var;
        this.b = c4z0Var;
        this.c = c4z0Var.b;
    }
}
