package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class ylg implements p3d {
    public static final ylg a;

    @NotNull
    private static final mhp descriptor;

    static {
        ylg ylgVar = new ylg();
        a = ylgVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.local.LocalPlusState", ylgVar, 3);
        j5mVar.k("balance", false);
        j5mVar.k("currency", false);
        j5mVar.k("status", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = bmg.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        amg amgVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = bmg.d;
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            amgVar = (amg) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            amg amgVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    amgVar2 = (amg) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), amgVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            amgVar = amgVar2;
        }
        c.b(mhpVar);
        return new bmg(i, str, str2, amgVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        bmg bmgVar = (bmg) obj;
        l6bVar.getClass();
        bmgVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = bmg.d;
        c.p(mhpVar, 0, bmgVar.a);
        c.p(mhpVar, 1, bmgVar.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), bmgVar.c);
        c.b(mhpVar);
    }
}
