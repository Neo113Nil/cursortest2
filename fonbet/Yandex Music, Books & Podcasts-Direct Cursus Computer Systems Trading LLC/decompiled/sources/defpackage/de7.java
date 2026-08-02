package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class de7 implements p3d {
    public static final de7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        de7 de7Var = new de7();
        a = de7Var;
        j5m j5mVar = new j5m("flex.actions.action.DebounceAction", de7Var, 3);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("debounceId", false);
        j5mVar.k("debounceMillis", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{fe7.d[0].getValue(), ff7.C(tkr.a), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        md mdVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = fe7.d;
        if (c.m()) {
            mdVar = (md) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = (String) c.n(mhpVar, 1, tkr.a, null);
            i = c.k(mhpVar, 2);
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            md mdVar2 = null;
            String str2 = null;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    mdVar2 = (md) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), mdVar2);
                    i4 |= 1;
                } else if (w == 1) {
                    str2 = (String) c.n(mhpVar, 1, tkr.a, str2);
                    i4 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            mdVar = mdVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new fe7(i2, mdVar, str, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        fe7 fe7Var = (fe7) obj;
        l6bVar.getClass();
        fe7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) fe7.d[0].getValue(), fe7Var.a);
        c.q(mhpVar, 1, tkr.a, fe7Var.b);
        c.A(2, fe7Var.c, mhpVar);
        c.b(mhpVar);
    }
}
