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
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class k2 implements p3d {
    public static final k2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k2 k2Var = new k2();
        a = k2Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkExperimentsRequestModel", k2Var, 3);
        j5mVar.k("testIds", true);
        j5mVar.k("excludeTestIds", true);
        j5mVar.k("params", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = m2.d;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m2.d;
        List list3 = null;
        if (c.m()) {
            list = (List) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            list2 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            map = (Map) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list4 = null;
            Map map2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list3 = (List) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (w == 1) {
                    list4 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list4);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), map2);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list3;
            list2 = list4;
            map = map2;
        }
        c.b(mhpVar);
        return new m2(i, list, list2, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m2 m2Var = (m2) obj;
        l6bVar.getClass();
        m2Var.getClass();
        Map map = m2Var.c;
        List list = m2Var.b;
        List list2 = m2Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = m2.d;
        if (c.e(mhpVar) || list2 != null) {
            c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list);
        }
        if (c.e(mhpVar) || map != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), map);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
