package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final /* synthetic */ class n implements p3d {
    public static final n a;

    @NotNull
    private static final mhp descriptor;

    static {
        n nVar = new n();
        a = nVar;
        j5m j5mVar = new j5m("GET_PRODUCTS_RESPONSE", nVar, 3);
        j5mVar.k("trackId", false);
        j5mVar.k("products", false);
        j5mVar.k("error", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), ff7.C((t9f) p.d[1].getValue()), oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = p.d;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            list = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            z = c.D(mhpVar, 2);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str2 = null;
            List list2 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else if (w == 1) {
                    list2 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    z3 = c.D(mhpVar, 2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            str = str2;
            list = list2;
        }
        c.b(mhpVar);
        return new p(i, str, list, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p pVar = (p) obj;
        l6bVar.getClass();
        pVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = p.d;
        c.q(mhpVar, 0, tkr.a, pVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), pVar.b);
        c.j(mhpVar, 2, pVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
