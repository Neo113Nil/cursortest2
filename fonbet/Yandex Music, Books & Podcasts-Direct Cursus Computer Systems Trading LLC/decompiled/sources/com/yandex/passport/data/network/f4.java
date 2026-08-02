package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements p3d {
    public static final f4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f4 f4Var = new f4();
        a = f4Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetClientOrMasterTokenByMasterTokenRequest.Result", f4Var, 4);
        j5mVar.k("access_token", false);
        j5mVar.k("expires_in", true);
        j5mVar.k("token_type", false);
        j5mVar.k("uid", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        mvg mvgVar = mvg.a;
        t9f C = ff7.C(mvgVar);
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, C, tkrVar, mvgVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        long j;
        Long l;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            Long l2 = (Long) c.n(mhpVar, 1, mvg.a, null);
            str = g;
            i = 15;
            str2 = c.g(mhpVar, 2);
            l = l2;
            j = c.q(mhpVar, 3);
        } else {
            long j2 = 0;
            boolean z = true;
            int i2 = 0;
            Long l3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    l3 = (Long) c.n(mhpVar, 1, mvg.a, l3);
                    i2 |= 2;
                } else if (w == 2) {
                    str4 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    j2 = c.q(mhpVar, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            j = j2;
            l = l3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new h4(i, str, l, str2, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h4 h4Var = (h4) obj;
        l6bVar.getClass();
        h4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = h4Var.a;
        Long l = h4Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || l != null) {
            c.q(mhpVar, 1, mvg.a, l);
        }
        c.p(mhpVar, 2, h4Var.c);
        c.g(mhpVar, 3, h4Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
