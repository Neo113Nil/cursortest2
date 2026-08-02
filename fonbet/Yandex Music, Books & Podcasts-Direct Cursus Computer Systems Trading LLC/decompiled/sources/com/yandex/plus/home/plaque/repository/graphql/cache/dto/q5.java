package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import com.connectsdk.device.ConnectableDevice;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class q5 implements p3d {
    public static final q5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q5 q5Var = new q5();
        a = q5Var;
        j5m j5mVar = new j5m("Icon", q5Var, 5);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("contentDescription", false);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("displayRules", false);
        j5mVar.k("text", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = s5.f;
        t9f C = ff7.C(b0.a);
        t9f C2 = ff7.C((t9f) arfVarArr[2].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, C, C2, i0.a, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        d0 d0Var;
        i iVar;
        t0 t0Var;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s5.f;
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            d0 d0Var2 = (d0) c.n(mhpVar, 1, b0.a, null);
            iVar = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            str = g;
            t0Var = (t0) c.z(mhpVar, 3, i0.a, null);
            str2 = c.g(mhpVar, 4);
            i = 31;
            d0Var = d0Var2;
        } else {
            boolean z = true;
            int i2 = 0;
            d0 d0Var3 = null;
            i iVar2 = null;
            t0 t0Var2 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    d0Var3 = (d0) c.n(mhpVar, 1, b0.a, d0Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    iVar2 = (i) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), iVar2);
                    i2 |= 4;
                } else if (w == 3) {
                    t0Var2 = (t0) c.z(mhpVar, 3, i0.a, t0Var2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            d0Var = d0Var3;
            iVar = iVar2;
            t0Var = t0Var2;
            str2 = str4;
        }
        c.b(mhpVar);
        return new s5(i, str, d0Var, iVar, t0Var, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s5 s5Var = (s5) obj;
        l6bVar.getClass();
        s5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = s5.f;
        c.p(mhpVar, 0, s5Var.a);
        c.q(mhpVar, 1, b0.a, s5Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), s5Var.c);
        c.k(mhpVar, 3, i0.a, s5Var.d);
        c.p(mhpVar, 4, s5Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
