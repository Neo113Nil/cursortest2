package com.yandex.plus.home.datasource.openapi.models;

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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class n4 implements p3d {
    public static final n4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n4 n4Var = new n4();
        a = n4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkMissionCommonRequestModel", n4Var, 3);
        j5mVar.k("place", true);
        j5mVar.k(Constants.KEY_MESSAGE, true);
        j5mVar.k("consumer", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
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
            tkr tkrVar = tkr.a;
            str = (String) c.n(mhpVar, 0, tkrVar, null);
            str2 = (String) c.n(mhpVar, 1, tkrVar, null);
            str3 = (String) c.n(mhpVar, 2, tkrVar, null);
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
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = (String) c.n(mhpVar, 1, tkr.a, str5);
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
        return new p4(str, i, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p4 p4Var = (p4) obj;
        l6bVar.getClass();
        p4Var.getClass();
        String str = p4Var.c;
        String str2 = p4Var.b;
        String str3 = p4Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 0, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
