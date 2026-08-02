package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class ymt implements p3d {
    public static final ymt a;

    @NotNull
    private static final mhp descriptor;

    static {
        ymt ymtVar = new ymt();
        a = ymtVar;
        j5m j5mVar = new j5m("flex.actions.action.UpdateContentAction", ymtVar, 1);
        j5mVar.k("content", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ant.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        kb6 kb6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = ant.b;
        int i = 1;
        kb6 kb6Var2 = null;
        if (c.m()) {
            kb6Var = (kb6) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    kb6Var2 = (kb6) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), kb6Var2);
                    i2 = 1;
                }
            }
            kb6Var = kb6Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new ant(i, kb6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        ant antVar = (ant) obj;
        l6bVar.getClass();
        antVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) ant.b[0].getValue(), antVar.a);
        c.b(mhpVar);
    }
}
