package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class c4o implements p3d {
    public static final c4o a;

    @NotNull
    private static final mhp descriptor;

    static {
        c4o c4oVar = new c4o();
        a = c4oVar;
        j5m j5mVar = new j5m("deeplink", c4oVar, 1);
        j5mVar.k("link", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
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
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 = 1;
                }
            }
            str = str2;
            i = i2;
        }
        c.b(mhpVar);
        return new e4o(i, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e4o e4oVar = (e4o) obj;
        l6bVar.getClass();
        e4oVar.getClass();
        String str = e4oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        c.b(mhpVar);
    }
}
