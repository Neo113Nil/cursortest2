package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class s5o implements p3d {
    public static final s5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        s5o s5oVar = new s5o();
        a = s5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateResponseBody", s5oVar, 1);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(y5o.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        b6o b6oVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        b6o b6oVar2 = null;
        if (c.m()) {
            b6oVar = (b6o) c.n(mhpVar, 0, y5o.a, null);
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
                    b6oVar2 = (b6o) c.n(mhpVar, 0, y5o.a, b6oVar2);
                    i2 = 1;
                }
            }
            b6oVar = b6oVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new c6o(i, b6oVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c6o c6oVar = (c6o) obj;
        l6bVar.getClass();
        c6oVar.getClass();
        b6o b6oVar = c6oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || b6oVar != null) {
            c.q(mhpVar, 0, y5o.a, b6oVar);
        }
        c.b(mhpVar);
    }
}
