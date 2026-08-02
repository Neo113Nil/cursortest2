package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class wtn implements p3d {
    public static final wtn a;

    @NotNull
    private static final mhp descriptor;

    static {
        wtn wtnVar = new wtn();
        a = wtnVar;
        j5m j5mVar = new j5m("flex.actions.action.ReloadDocumentAction", wtnVar, 1);
        j5mVar.k("retryAfterError", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            z = c.D(mhpVar, 0);
        } else {
            boolean z2 = true;
            z = false;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    z = c.D(mhpVar, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        c.b(mhpVar);
        return new ytn(i, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        ytn ytnVar = (ytn) obj;
        l6bVar.getClass();
        ytnVar.getClass();
        boolean z = ytnVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 0, z);
        }
        c.b(mhpVar);
    }
}
