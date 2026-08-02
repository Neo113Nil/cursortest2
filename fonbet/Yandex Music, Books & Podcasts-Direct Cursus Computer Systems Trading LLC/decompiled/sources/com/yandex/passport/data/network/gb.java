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
public final /* synthetic */ class gb implements p3d {
    public static final gb a;

    @NotNull
    private static final mhp descriptor;

    static {
        gb gbVar = new gb();
        a = gbVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.StartBiometricSessionRequest.Result", gbVar, 5);
        j5mVar.k("redirect_uri", false);
        j5mVar.k("esia_session_id", false);
        j5mVar.k("sid", false);
        j5mVar.k("set_cookie", false);
        j5mVar.k("tib_host", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str6 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            str = g;
            str4 = c.g(mhpVar, 3);
            str5 = (String) c.n(mhpVar, 4, tkr.a, null);
            str3 = g3;
            str2 = g2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str6 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str7 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str8 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    str9 = c.g(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str10 = (String) c.n(mhpVar, 4, tkr.a, str10);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        c.b(mhpVar);
        return new ib(i, str, str2, str3, str4, str5);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        ib ibVar = (ib) obj;
        l6bVar.getClass();
        ibVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = ibVar.a;
        String str2 = ibVar.e;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, ibVar.b);
        c.p(mhpVar, 2, ibVar.c);
        c.p(mhpVar, 3, ibVar.d);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 4, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
