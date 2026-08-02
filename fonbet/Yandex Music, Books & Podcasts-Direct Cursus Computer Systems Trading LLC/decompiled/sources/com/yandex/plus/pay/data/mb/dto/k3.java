package com.yandex.plus.pay.data.mb.dto;

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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class k3 implements p3d {
    public static final k3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k3 k3Var = new k3();
        a = k3Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto", k3Var, 4);
        j5mVar.k("status", true);
        j5mVar.k("statusCode", true);
        j5mVar.k("synchronizationState", true);
        j5mVar.k("trust3dsInfo", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{u3.e[0].getValue(), ff7.C(tkr.a), ff7.C(o3.a), ff7.C(r3.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        n3 n3Var;
        String str;
        q3 q3Var;
        t3 t3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u3.e;
        n3 n3Var2 = null;
        if (c.m()) {
            n3 n3Var3 = (n3) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            String str2 = (String) c.n(mhpVar, 1, tkr.a, null);
            q3 q3Var2 = (q3) c.n(mhpVar, 2, o3.a, null);
            n3Var = n3Var3;
            str = str2;
            t3Var = (t3) c.n(mhpVar, 3, r3.a, null);
            q3Var = q3Var2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str3 = null;
            q3 q3Var3 = null;
            t3 t3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    n3Var2 = (n3) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), n3Var2);
                    i2 |= 1;
                } else if (w == 1) {
                    str3 = (String) c.n(mhpVar, 1, tkr.a, str3);
                    i2 |= 2;
                } else if (w == 2) {
                    q3Var3 = (q3) c.n(mhpVar, 2, o3.a, q3Var3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    t3Var2 = (t3) c.n(mhpVar, 3, r3.a, t3Var2);
                    i2 |= 8;
                }
            }
            i = i2;
            n3Var = n3Var2;
            str = str3;
            q3Var = q3Var3;
            t3Var = t3Var2;
        }
        c.b(mhpVar);
        return new u3(i, n3Var, str, q3Var, t3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u3 u3Var = (u3) obj;
        l6bVar.getClass();
        u3Var.getClass();
        t3 t3Var = u3Var.d;
        q3 q3Var = u3Var.c;
        String str = u3Var.b;
        n3 n3Var = u3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = u3.e;
        if (c.e(mhpVar) || n3Var != n3.d) {
            c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), n3Var);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 1, tkr.a, str);
        }
        if (c.e(mhpVar) || q3Var != null) {
            c.q(mhpVar, 2, o3.a, q3Var);
        }
        if (c.e(mhpVar) || t3Var != null) {
            c.q(mhpVar, 3, r3.a, t3Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
