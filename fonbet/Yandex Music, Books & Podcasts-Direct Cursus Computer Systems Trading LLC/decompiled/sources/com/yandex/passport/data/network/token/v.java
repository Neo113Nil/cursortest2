package com.yandex.passport.data.network.token;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.q5f;
import defpackage.s5f;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements p3d {
    public static final v a;

    @NotNull
    private static final mhp descriptor;

    static {
        v vVar = new v();
        a = vVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.token.GetMasterTokenByMailishSocialTaskIdRequest.Result", vVar, 2);
        j5mVar.k("status", false);
        j5mVar.k("xtoken", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{s5f.a, tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q5f q5fVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        q5f q5fVar2 = null;
        if (c.m()) {
            q5fVar = (q5f) c.z(mhpVar, 0, s5f.a, null);
            str = c.g(mhpVar, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q5fVar2 = (q5f) c.z(mhpVar, 0, s5f.a, q5fVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            q5fVar = q5fVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new x(i, q5fVar, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x xVar = (x) obj;
        l6bVar.getClass();
        xVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, s5f.a, xVar.a);
        c.p(mhpVar, 1, xVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
