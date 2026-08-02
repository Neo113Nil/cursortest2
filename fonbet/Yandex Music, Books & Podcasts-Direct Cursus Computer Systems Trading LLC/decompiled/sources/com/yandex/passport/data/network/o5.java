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
public final /* synthetic */ class o5 implements p3d {
    public static final o5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o5 o5Var = new o5();
        a = o5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.EbsConfig", o5Var, 4);
        j5mVar.k("bio_collection_type", true);
        j5mVar.k("tib_uri", true);
        j5mVar.k("backend_uri_template", true);
        j5mVar.k("ebs_uri_template", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            i = 15;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                    i2 |= 1;
                } else if (w == 1) {
                    str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                    i2 |= 2;
                } else if (w == 2) {
                    str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str11 = (String) c.n(mhpVar, 3, tkr.a, str11);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        c.b(mhpVar);
        return new q5(i, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q5 q5Var = (q5) obj;
        l6bVar.getClass();
        q5Var.getClass();
        String str = q5Var.d;
        String str2 = q5Var.c;
        String str3 = q5Var.b;
        String str4 = q5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 0, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 1, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 3, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
