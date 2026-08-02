package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
        j5m j5mVar = new j5m("NEED_AUTHORIZATION", k3Var, 3);
        j5mVar.k("trackId", true);
        j5mVar.k("reason", false);
        j5mVar.k("callbackUrl", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o3.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        n3 n3Var;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o3.d;
        String str3 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            n3Var = (n3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            str2 = c.g(mhpVar, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            n3 n3Var2 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    n3Var2 = (n3) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), n3Var2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            n3Var = n3Var2;
            str2 = str4;
        }
        c.b(mhpVar);
        return new o3(i, str, n3Var, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o3 o3Var = (o3) obj;
        l6bVar.getClass();
        o3Var.getClass();
        String str = o3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o3.d;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), o3Var.b);
        c.p(mhpVar, 2, o3Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
