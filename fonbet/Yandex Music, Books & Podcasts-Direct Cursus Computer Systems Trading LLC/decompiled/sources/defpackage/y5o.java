package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class y5o implements p3d {
    public static final y5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        y5o y5oVar = new y5o();
        a = y5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateResponseBody.PlusState", y5oVar, 2);
        j5mVar.k("balance", true);
        j5mVar.k("plusSubscriptionStatus", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(t5o.a), ff7.C((t9f) b6o.c[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        w5o w5oVar;
        a6o a6oVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = b6o.c;
        w5o w5oVar2 = null;
        if (c.m()) {
            w5oVar = (w5o) c.n(mhpVar, 0, t5o.a, null);
            a6oVar = (a6o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            a6o a6oVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    w5oVar2 = (w5o) c.n(mhpVar, 0, t5o.a, w5oVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    a6oVar2 = (a6o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), a6oVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            w5oVar = w5oVar2;
            a6oVar = a6oVar2;
        }
        c.b(mhpVar);
        return new b6o(i, w5oVar, a6oVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b6o b6oVar = (b6o) obj;
        l6bVar.getClass();
        b6oVar.getClass();
        a6o a6oVar = b6oVar.b;
        w5o w5oVar = b6oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = b6o.c;
        if (c.e(mhpVar) || w5oVar != null) {
            c.q(mhpVar, 0, t5o.a, w5oVar);
        }
        if (c.e(mhpVar) || a6oVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), a6oVar);
        }
        c.b(mhpVar);
    }
}
