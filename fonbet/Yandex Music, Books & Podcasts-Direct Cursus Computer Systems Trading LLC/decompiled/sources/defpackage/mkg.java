package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class mkg implements p3d {
    public static final mkg a;

    @NotNull
    private static final mhp descriptor;

    static {
        mkg mkgVar = new mkg();
        a = mkgVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.local.LocalExperiments", mkgVar, 3);
        j5mVar.k("testIds", false);
        j5mVar.k("triggeredTestIds", false);
        j5mVar.k("flags", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = okg.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        upi upiVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = okg.d;
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            upiVar = (upi) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            upi upiVar2 = null;
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
                    upiVar2 = (upi) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), upiVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            upiVar = upiVar2;
        }
        c.b(mhpVar);
        return new okg(i, str, str2, upiVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        okg okgVar = (okg) obj;
        l6bVar.getClass();
        okgVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = okg.d;
        c.p(mhpVar, 0, okgVar.a);
        c.p(mhpVar, 1, okgVar.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), okgVar.c);
        c.b(mhpVar);
    }
}
