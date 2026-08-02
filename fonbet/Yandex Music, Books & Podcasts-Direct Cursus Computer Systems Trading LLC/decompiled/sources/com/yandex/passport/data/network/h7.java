package com.yandex.passport.data.network;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements p3d {
    public static final h7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h7 h7Var = new h7();
        a = h7Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetPush2faCodeRequest.Result", h7Var, 2);
        j5mVar.k("status", false);
        j5mVar.k("otp", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = (String) c.n(mhpVar, 1, tkr.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = (String) c.n(mhpVar, 1, tkr.a, str4);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new j7(i, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j7 j7Var = (j7) obj;
        l6bVar.getClass();
        j7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = j7Var.a;
        String str2 = j7Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
