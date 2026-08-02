package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class rpn implements p3d {
    public static final rpn a;

    @NotNull
    private static final mhp descriptor;

    static {
        rpn rpnVar = new rpn();
        a = rpnVar;
        j5m j5mVar = new j5m("flex.feature.document.action.RedirectAction", rpnVar, 2);
        j5mVar.k("query", false);
        j5mVar.k("document", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = tpn.c;
        return new t9f[]{arfVarArr[0].getValue(), ff7.C((t9f) arfVarArr[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t5a t5aVar;
        q2a q2aVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = tpn.c;
        t5a t5aVar2 = null;
        if (c.m()) {
            t5aVar = (t5a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            q2aVar = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            q2a q2aVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    t5aVar2 = (t5a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), t5aVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    q2aVar2 = (q2a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q2aVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            t5aVar = t5aVar2;
            q2aVar = q2aVar2;
        }
        c.b(mhpVar);
        return new tpn(i, t5aVar, q2aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        tpn tpnVar = (tpn) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = tpn.c;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        t5a t5aVar = tpnVar.a;
        q2a q2aVar = tpnVar.b;
        c.k(mhpVar, 0, t9fVar, t5aVar);
        if (c.e(mhpVar) || q2aVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q2aVar);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
