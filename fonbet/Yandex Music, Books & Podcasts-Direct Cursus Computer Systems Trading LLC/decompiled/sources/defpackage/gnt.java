package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class gnt implements p3d {
    public static final gnt a;

    @NotNull
    private static final mhp descriptor;

    static {
        gnt gntVar = new gnt();
        a = gntVar;
        j5m j5mVar = new j5m("flex.actions.action.UpdateDocumentAction", gntVar, 2);
        j5mVar.k("document", false);
        j5mVar.k("callbacksConfig", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = lnt.c;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q2a q2aVar;
        r2a r2aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = lnt.c;
        q2a q2aVar2 = null;
        if (c.m()) {
            q2aVar = (q2a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            r2aVar = (r2a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            r2a r2aVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q2aVar2 = (q2a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), q2aVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    r2aVar2 = (r2a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), r2aVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            q2aVar = q2aVar2;
            r2aVar = r2aVar2;
        }
        c.b(mhpVar);
        return new lnt(i, q2aVar, r2aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        lnt lntVar = (lnt) obj;
        l6bVar.getClass();
        lntVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = lnt.c;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), lntVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), lntVar.b);
        c.b(mhpVar);
    }
}
