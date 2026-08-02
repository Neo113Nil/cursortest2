package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class cv7 implements p3d {
    public static final cv7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        cv7 cv7Var = new cv7();
        a = cv7Var;
        j5m j5mVar = new j5m("flex.actions.action.DelayedAction", cv7Var, 2);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("millis", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ev7.c[0].getValue(), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        md mdVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = ev7.c;
        if (c.m()) {
            mdVar = (md) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            i = c.k(mhpVar, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            md mdVar2 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    mdVar2 = (md) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), mdVar2);
                    i3 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i = c.k(mhpVar, 1);
                    i3 |= 2;
                }
            }
            i2 = i3;
            mdVar = mdVar2;
        }
        c.b(mhpVar);
        return new ev7(i2, mdVar, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        ev7 ev7Var = (ev7) obj;
        l6bVar.getClass();
        ev7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) ev7.c[0].getValue(), ev7Var.a);
        c.A(1, ev7Var.b, mhpVar);
        c.b(mhpVar);
    }
}
