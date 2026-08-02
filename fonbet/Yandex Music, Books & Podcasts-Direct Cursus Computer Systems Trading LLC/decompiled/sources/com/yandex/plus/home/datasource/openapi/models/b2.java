package com.yandex.plus.home.datasource.openapi.models;

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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b2 implements p3d {
    public static final b2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b2 b2Var = new b2();
        a = b2Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkEnabledContentDescriptionModel", b2Var, 4);
        j5mVar.k("type", false);
        j5mVar.k("text", false);
        j5mVar.k("actionText", true);
        j5mVar.k("templates", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d2.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, ff7.C(tkrVar), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d2.e;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String str5 = (String) c.n(mhpVar, 2, tkr.a, null);
            list = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            str3 = str5;
            i = 15;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
            list = list2;
        }
        c.b(mhpVar);
        return new d2(i, str, str2, str3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d2 d2Var = (d2) obj;
        l6bVar.getClass();
        d2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d2.e;
        String str = d2Var.a;
        List list = d2Var.d;
        String str2 = d2Var.c;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, d2Var.b);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
