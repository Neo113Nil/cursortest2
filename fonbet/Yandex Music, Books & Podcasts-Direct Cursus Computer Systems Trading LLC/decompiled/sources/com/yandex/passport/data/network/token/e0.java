package com.yandex.passport.data.network.token;

import defpackage.eg7;
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
public final /* synthetic */ class e0 implements p3d {
    public static final e0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.token.GetMasterTokenByTrackIdRequest.Result", e0Var, 2);
        j5mVar.k("status", false);
        j5mVar.k("oauth", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, z.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        b0 b0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            b0Var = (b0) c.z(mhpVar, 1, z.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            b0 b0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    b0Var2 = (b0) c.z(mhpVar, 1, z.a, b0Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            b0Var = b0Var2;
        }
        c.b(mhpVar);
        return new g0(i, str, b0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g0 g0Var = (g0) obj;
        l6bVar.getClass();
        g0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, g0Var.a);
        c.k(mhpVar, 1, z.a, g0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
