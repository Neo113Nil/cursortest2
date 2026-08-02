package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0 implements p3d {
    public static final b0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ContentDescriptionDto", b0Var, 4);
        j5mVar.k("text", false);
        j5mVar.k("templates", false);
        j5mVar.k("actionText", false);
        j5mVar.k("accessibilityEnabled", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d0.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C(tkrVar), ff7.C(oc3.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        String str2;
        Boolean bool;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d0.e;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            list = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            str2 = (String) c.n(mhpVar, 2, tkrVar, null);
            bool = (Boolean) c.n(mhpVar, 3, oc3.a, null);
            i = 15;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            String str5 = null;
            Boolean bool2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    list2 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i2 |= 2;
                } else if (w == 2) {
                    str5 = (String) c.n(mhpVar, 2, tkr.a, str5);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    bool2 = (Boolean) c.n(mhpVar, 3, oc3.a, bool2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            list = list2;
            str2 = str5;
            bool = bool2;
        }
        c.b(mhpVar);
        return new d0(i, str, list, str2, bool);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d0.e;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, d0Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), d0Var.b);
        c.q(mhpVar, 2, tkrVar, d0Var.c);
        c.q(mhpVar, 3, oc3.a, d0Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
