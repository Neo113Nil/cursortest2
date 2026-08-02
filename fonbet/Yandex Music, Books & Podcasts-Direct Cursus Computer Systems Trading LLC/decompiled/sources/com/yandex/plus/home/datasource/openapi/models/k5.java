package com.yandex.plus.home.datasource.openapi.models;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class k5 implements p3d {
    public static final k5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k5 k5Var = new k5();
        a = k5Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkPlaquePayloadRequestModel", k5Var, 3);
        j5mVar.k("theme", false);
        j5mVar.k(SSDPDeviceDescriptionParser.TAG_LOCATION, true);
        j5mVar.k("restrictionMode", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o5.d;
        return new t9f[]{arfVarArr[0].getValue(), ff7.C(k4.a), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        n5 n5Var;
        m4 m4Var;
        m5 m5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o5.d;
        n5 n5Var2 = null;
        if (c.m()) {
            n5Var = (n5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            m4Var = (m4) c.n(mhpVar, 1, k4.a, null);
            m5Var = (m5) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            m4 m4Var2 = null;
            m5 m5Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    n5Var2 = (n5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), n5Var2);
                    i2 |= 1;
                } else if (w == 1) {
                    m4Var2 = (m4) c.n(mhpVar, 1, k4.a, m4Var2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    m5Var2 = (m5) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), m5Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            n5Var = n5Var2;
            m4Var = m4Var2;
            m5Var = m5Var2;
        }
        c.b(mhpVar);
        return new o5(i, n5Var, m4Var, m5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o5 o5Var = (o5) obj;
        l6bVar.getClass();
        o5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o5.d;
        t9f t9fVar = (t9f) arfVarArr[0].getValue();
        n5 n5Var = o5Var.a;
        m5 m5Var = o5Var.c;
        m4 m4Var = o5Var.b;
        c.k(mhpVar, 0, t9fVar, n5Var);
        if (c.e(mhpVar) || m4Var != null) {
            c.q(mhpVar, 1, k4.a, m4Var);
        }
        if (c.e(mhpVar) || m5Var != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), m5Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
