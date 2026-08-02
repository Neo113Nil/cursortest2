package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class peg implements p3d {
    public static final peg a;

    @NotNull
    private static final mhp descriptor;

    static {
        peg pegVar = new peg();
        a = pegVar;
        j5m j5mVar = new j5m("flex.actions.action.LoadDocumentAction", pegVar, 3);
        j5mVar.k("query", false);
        j5mVar.k("updateContentOnly", true);
        j5mVar.k("preview", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = reg.d;
        return new t9f[]{arfVarArr[0].getValue(), oc3.a, ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        boolean z;
        t5a t5aVar;
        q2a q2aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = reg.d;
        if (c.m()) {
            t5aVar = (t5a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            z = c.D(mhpVar, 1);
            q2aVar = (q2a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z2 = true;
            int i2 = 0;
            t5a t5aVar2 = null;
            q2a q2aVar2 = null;
            boolean z3 = false;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    t5aVar2 = (t5a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), t5aVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    z3 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    q2aVar2 = (q2a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), q2aVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            z = z3;
            t5aVar = t5aVar2;
            q2aVar = q2aVar2;
        }
        c.b(mhpVar);
        return new reg(i, t5aVar, z, q2aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        reg regVar = (reg) obj;
        l6bVar.getClass();
        regVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = reg.d;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        t5a t5aVar = regVar.a;
        q2a q2aVar = regVar.c;
        boolean z = regVar.b;
        c.k(mhpVar, 0, t9fVar, t5aVar);
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 1, z);
        }
        if (c.e(mhpVar) || q2aVar != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), q2aVar);
        }
        c.b(mhpVar);
    }
}
