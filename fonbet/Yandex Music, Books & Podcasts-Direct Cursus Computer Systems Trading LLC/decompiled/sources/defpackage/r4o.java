package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class r4o implements p3d {
    public static final r4o a;

    @NotNull
    private static final mhp descriptor;

    static {
        r4o r4oVar = new r4o();
        a = r4oVar;
        j5m j5mVar = new j5m("promocode_available", r4oVar, 4);
        j5mVar.k(ConnectableDevice.KEY_ID, true);
        j5mVar.k(Constants.KEY_ACTION, true);
        j5mVar.k("title", true);
        j5mVar.k("metricContext", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t4o.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C(tkrVar), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        f4o f4oVar;
        String str2;
        upi upiVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t4o.e;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            f4o f4oVar2 = (f4o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String str5 = (String) c.n(mhpVar, 2, tkrVar, null);
            upiVar = (upi) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str2 = str5;
            i = 15;
            f4oVar = f4oVar2;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            f4o f4oVar3 = null;
            String str6 = null;
            upi upiVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    f4oVar3 = (f4o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), f4oVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    upiVar2 = (upi) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), upiVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            f4oVar = f4oVar3;
            str2 = str6;
            upiVar = upiVar2;
        }
        c.b(mhpVar);
        return new t4o(i, str, f4oVar, str2, upiVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t4o t4oVar = (t4o) obj;
        l6bVar.getClass();
        t4oVar.getClass();
        upi upiVar = t4oVar.d;
        String str = t4oVar.c;
        f4o f4oVar = t4oVar.b;
        String str2 = t4oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t4o.e;
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 0, tkr.a, str2);
        }
        if (c.e(mhpVar) || f4oVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), f4oVar);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        if (c.e(mhpVar) || upiVar != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), upiVar);
        }
        c.b(mhpVar);
    }
}
