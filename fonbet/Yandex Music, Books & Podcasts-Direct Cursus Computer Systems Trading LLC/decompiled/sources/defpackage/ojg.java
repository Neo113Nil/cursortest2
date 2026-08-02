package defpackage;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class ojg implements p3d {
    public static final ojg a;

    @NotNull
    private static final mhp descriptor;

    static {
        ojg ojgVar = new ojg();
        a = ojgVar;
        j5m j5mVar = new j5m("Missions", ojgVar, 4);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("title", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("metricContext", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = qjg.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C((t9f) arfVarArr[2].getValue()), arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        fjg fjgVar;
        tpi tpiVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = qjg.e;
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            fjg fjgVar2 = (fjg) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            tpiVar = (tpi) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            i = 15;
            fjgVar = fjgVar2;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            fjg fjgVar3 = null;
            tpi tpiVar2 = null;
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
                } else if (w == 2) {
                    fjgVar3 = (fjg) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), fjgVar3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    tpiVar2 = (tpi) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), tpiVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            fjgVar = fjgVar3;
            tpiVar = tpiVar2;
        }
        c.b(mhpVar);
        return new qjg(i, str, str2, fjgVar, tpiVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        qjg qjgVar = (qjg) obj;
        l6bVar.getClass();
        qjgVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = qjg.e;
        c.p(mhpVar, 0, qjgVar.a);
        c.p(mhpVar, 1, qjgVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), qjgVar.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), qjgVar.d);
        c.b(mhpVar);
    }
}
