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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b7 implements p3d {
    public static final b7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b7 b7Var = new b7();
        a = b7Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkServiceSpecificActionModel", b7Var, 4);
        j5mVar.k("actionContext", false);
        j5mVar.k("type", false);
        j5mVar.k("specificType", false);
        j5mVar.k("params", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C((t9f) d7.e[3].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d7.e;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            map = (Map) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            str3 = g3;
            i = 15;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            Map map2 = null;
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
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), map2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            map = map2;
        }
        c.b(mhpVar);
        return new d7(i, str, str2, str3, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d7 d7Var = (d7) obj;
        l6bVar.getClass();
        d7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d7.e;
        String str = d7Var.a;
        Map map = d7Var.d;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, d7Var.b);
        c.p(mhpVar, 2, d7Var.c);
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), map);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
