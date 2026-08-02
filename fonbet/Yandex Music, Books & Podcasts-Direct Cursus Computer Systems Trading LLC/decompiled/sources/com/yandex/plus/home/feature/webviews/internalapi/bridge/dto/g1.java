package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final /* synthetic */ class g1 implements p3d {
    public static final g1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g1 g1Var = new g1();
        a = g1Var;
        j5m j5mVar = new j5m("BANK_STATE_RESPONSE", g1Var, 4);
        j5mVar.k("trackId", false);
        j5mVar.k("traceId", false);
        j5mVar.k("state", false);
        j5mVar.k("exceptions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i1.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C((t9f) arfVarArr[3].getValue())};
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
        arf[] arfVarArr = i1.e;
        String str4 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str6 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 2, tkrVar, null);
            list = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str3 = str7;
            i = 15;
            str2 = str6;
            str = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            String str8 = null;
            String str9 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str8 = (String) c.n(mhpVar, 1, tkr.a, str8);
                    i2 |= 2;
                } else if (w == 2) {
                    str9 = (String) c.n(mhpVar, 2, tkr.a, str9);
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
            str2 = str8;
            str3 = str9;
            list = list2;
        }
        c.b(mhpVar);
        return new i1(i, str, str2, str3, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i1 i1Var = (i1) obj;
        l6bVar.getClass();
        i1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i1.e;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, i1Var.a);
        c.q(mhpVar, 1, tkrVar, i1Var.b);
        c.q(mhpVar, 2, tkrVar, i1Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), i1Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
