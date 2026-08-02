package com.yandex.passport.data.network;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.AuthorizeByPasswordRequest.Response", hVar, 4);
        j5mVar.k("status", false);
        j5mVar.k("x_token", true);
        j5mVar.k("access_token", true);
        j5mVar.k("userInfo", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        com.yandex.passport.data.models.w wVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j.e;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str6 = (String) c.n(mhpVar, 2, tkrVar, null);
            wVar = (com.yandex.passport.data.models.w) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            str3 = str6;
            i = 15;
            str2 = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            com.yandex.passport.data.models.w wVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str7 = (String) c.n(mhpVar, 1, tkr.a, str7);
                    i2 |= 2;
                } else if (w == 2) {
                    str8 = (String) c.n(mhpVar, 2, tkr.a, str8);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    wVar2 = (com.yandex.passport.data.models.w) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), wVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str7;
            str3 = str8;
            wVar = wVar2;
        }
        c.b(mhpVar);
        return new j(i, str, str2, str3, wVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j jVar = (j) obj;
        l6bVar.getClass();
        jVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j.e;
        String str = jVar.a;
        String str2 = jVar.c;
        String str3 = jVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 1, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), jVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
