package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class z4o implements p3d {
    public static final z4o a;

    @NotNull
    private static final mhp descriptor;

    static {
        z4o z4oVar = new z4o();
        a = z4oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestExperimentsRequestBody", z4oVar, 1);
        j5mVar.k("params", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) b5o.b[0].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        tpi tpiVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = b5o.b;
        int i = 1;
        tpi tpiVar2 = null;
        if (c.m()) {
            tpiVar = (tpi) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    tpiVar2 = (tpi) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), tpiVar2);
                    i2 = 1;
                }
            }
            tpiVar = tpiVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new b5o(i, tpiVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b5o b5oVar = (b5o) obj;
        l6bVar.getClass();
        b5oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, (t9f) b5o.b[0].getValue(), b5oVar.a);
        c.b(mhpVar);
    }
}
