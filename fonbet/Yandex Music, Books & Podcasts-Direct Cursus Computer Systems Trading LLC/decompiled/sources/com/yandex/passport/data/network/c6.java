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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements p3d {
    public static final c6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c6 c6Var = new c6();
        a = c6Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.UrlTemplateConfigDTO", c6Var, 2);
        j5mVar.k("update_token_with_master", true);
        j5mVar.k("switch_member", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        z5 z5Var = z5.a;
        return new t9f[]{ff7.C(z5Var), ff7.C(z5Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b6 b6Var;
        b6 b6Var2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b6 b6Var3 = null;
        if (c.m()) {
            z5 z5Var = z5.a;
            b6Var = (b6) c.n(mhpVar, 0, z5Var, null);
            b6Var2 = (b6) c.n(mhpVar, 1, z5Var, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            b6 b6Var4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b6Var3 = (b6) c.n(mhpVar, 0, z5.a, b6Var3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    b6Var4 = (b6) c.n(mhpVar, 1, z5.a, b6Var4);
                    i2 |= 2;
                }
            }
            i = i2;
            b6Var = b6Var3;
            b6Var2 = b6Var4;
        }
        c.b(mhpVar);
        return new e6(i, b6Var, b6Var2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e6 e6Var = (e6) obj;
        l6bVar.getClass();
        e6Var.getClass();
        b6 b6Var = e6Var.b;
        b6 b6Var2 = e6Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || b6Var2 != null) {
            c.q(mhpVar, 0, z5.a, b6Var2);
        }
        if (c.e(mhpVar) || b6Var != null) {
            c.q(mhpVar, 1, z5.a, b6Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
