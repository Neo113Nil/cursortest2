package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a4o implements p3d {
    public static final a4o a;

    @NotNull
    private static final mhp descriptor;

    static {
        a4o a4oVar = new a4o();
        a = a4oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestDailyWidgetResponseBody", a4oVar, 1);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) y4o.b[0].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        u4o u4oVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = y4o.b;
        int i = 1;
        u4o u4oVar2 = null;
        if (c.m()) {
            u4oVar = (u4o) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    u4oVar2 = (u4o) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), u4oVar2);
                    i2 = 1;
                }
            }
            u4oVar = u4oVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new y4o(i, u4oVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y4o y4oVar = (y4o) obj;
        l6bVar.getClass();
        y4oVar.getClass();
        u4o u4oVar = y4oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = y4o.b;
        if (c.e(mhpVar) || u4oVar != null) {
            c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), u4oVar);
        }
        c.b(mhpVar);
    }
}
