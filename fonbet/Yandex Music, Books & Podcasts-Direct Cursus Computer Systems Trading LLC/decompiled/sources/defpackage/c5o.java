package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class c5o implements p3d {
    public static final c5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        c5o c5oVar = new c5o();
        a = c5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestExperimentsResponseBody", c5oVar, 1);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(i5o.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        k5o k5oVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        k5o k5oVar2 = null;
        if (c.m()) {
            k5oVar = (k5o) c.n(mhpVar, 0, i5o.a, null);
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
                    k5oVar2 = (k5o) c.n(mhpVar, 0, i5o.a, k5oVar2);
                    i2 = 1;
                }
            }
            k5oVar = k5oVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new l5o(i, k5oVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l5o l5oVar = (l5o) obj;
        l6bVar.getClass();
        l5oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, i5o.a, l5oVar.a);
        c.b(mhpVar);
    }
}
