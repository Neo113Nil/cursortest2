package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class i5o implements p3d {
    public static final i5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        i5o i5oVar = new i5o();
        a = i5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestExperimentsResponseBody.Experiments", i5oVar, 4);
        j5mVar.k("experiments", false);
        j5mVar.k("triggeredExperiments", false);
        j5mVar.k("testIds", false);
        j5mVar.k("triggeredTestIds", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = k5o.e;
        t9f C = ff7.C((t9f) arfVarArr[0].getValue());
        t9f C2 = ff7.C((t9f) arfVarArr[1].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{C, C2, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        upi upiVar;
        upi upiVar2;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = k5o.e;
        upi upiVar3 = null;
        if (c.m()) {
            upi upiVar4 = (upi) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            upi upiVar5 = (upi) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            tkr tkrVar = tkr.a;
            String str3 = (String) c.n(mhpVar, 2, tkrVar, null);
            upiVar2 = upiVar5;
            upiVar = upiVar4;
            str2 = (String) c.n(mhpVar, 3, tkrVar, null);
            str = str3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            upi upiVar6 = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    upiVar3 = (upi) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), upiVar3);
                    i2 |= 1;
                } else if (w == 1) {
                    upiVar6 = (upi) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), upiVar6);
                    i2 |= 2;
                } else if (w == 2) {
                    str4 = (String) c.n(mhpVar, 2, tkr.a, str4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str5 = (String) c.n(mhpVar, 3, tkr.a, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            upiVar = upiVar3;
            upiVar2 = upiVar6;
            str = str4;
            str2 = str5;
        }
        c.b(mhpVar);
        return new k5o(i, upiVar, upiVar2, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k5o k5oVar = (k5o) obj;
        l6bVar.getClass();
        k5oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = k5o.e;
        c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), k5oVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), k5oVar.b);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 2, tkrVar, k5oVar.c);
        c.q(mhpVar, 3, tkrVar, k5oVar.d);
        c.b(mhpVar);
    }
}
