package com.yandex.passport.data.network.token;

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
public final /* synthetic */ class c implements p3d {
    public static final c a;

    @NotNull
    private static final mhp descriptor;

    static {
        c cVar = new c();
        a = cVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.token.GetMasterTokenByCodeRequest.Result", cVar, 4);
        j5mVar.k("access_token", false);
        j5mVar.k("expires_in", true);
        j5mVar.k("refresh_token", true);
        j5mVar.k("token_type", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, mvg.a, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        long j;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            long q = c.q(mhpVar, 1);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 2, tkrVar, null);
            i = 15;
            str3 = (String) c.n(mhpVar, 3, tkrVar, null);
            str2 = str4;
            j = q;
        } else {
            long j2 = 0;
            boolean z = true;
            str = null;
            String str5 = null;
            String str6 = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i |= 1;
                } else if (w == 1) {
                    j2 = c.q(mhpVar, 1);
                    i |= 2;
                } else if (w == 2) {
                    str5 = (String) c.n(mhpVar, 2, tkr.a, str5);
                    i |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 3, tkr.a, str6);
                    i |= 8;
                }
            }
            j = j2;
            str2 = str5;
            str3 = str6;
        }
        String str7 = str;
        int i2 = i;
        c.b(mhpVar);
        return new e(i2, j, str7, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e eVar = (e) obj;
        l6bVar.getClass();
        eVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = eVar.a;
        String str2 = eVar.d;
        String str3 = eVar.c;
        long j = eVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || j != 0) {
            c.g(mhpVar, 1, j);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 2, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
