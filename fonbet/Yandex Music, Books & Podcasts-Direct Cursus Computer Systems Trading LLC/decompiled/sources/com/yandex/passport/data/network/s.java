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
public final /* synthetic */ class s implements p3d {
    public static final s a;

    @NotNull
    private static final mhp descriptor;

    static {
        s sVar = new s();
        a = sVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.AuthorizeByXTokenRequest.Result", sVar, 3);
        j5mVar.k("status", false);
        j5mVar.k("track_id", false);
        j5mVar.k("passport_host", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            str3 = (String) c.n(mhpVar, 2, tkr.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new u(str, i, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u uVar = (u) obj;
        l6bVar.getClass();
        uVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = uVar.a;
        String str2 = uVar.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, uVar.b);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
