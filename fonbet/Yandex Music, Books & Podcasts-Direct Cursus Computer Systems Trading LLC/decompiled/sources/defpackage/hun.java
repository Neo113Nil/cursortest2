package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class hun implements p3d {
    public static final hun a;

    @NotNull
    private static final mhp descriptor;

    static {
        hun hunVar = new hun();
        a = hunVar;
        j5m j5mVar = new j5m("flex.core.action.remote.RemoteAction", hunVar, 2);
        j5mVar.k("query", false);
        j5mVar.k("fallback", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = jun.c;
        return new t9f[]{arfVarArr[0].getValue(), ff7.C((t9f) arfVarArr[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        pg pgVar;
        md mdVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = jun.c;
        pg pgVar2 = null;
        if (c.m()) {
            pgVar = (pg) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            mdVar = (md) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            md mdVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    pgVar2 = (pg) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), pgVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    mdVar2 = (md) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), mdVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            pgVar = pgVar2;
            mdVar = mdVar2;
        }
        c.b(mhpVar);
        return new jun(i, pgVar, mdVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        jun junVar = (jun) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = jun.c;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), junVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), junVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
