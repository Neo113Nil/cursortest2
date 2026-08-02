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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class h5 implements p3d {
    public static final h5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h5 h5Var = new h5();
        a = h5Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkPlaqueDefinitionsModel", h5Var, 5);
        j5mVar.k("defaultPlaque", false);
        j5mVar.k("widgets", false);
        j5mVar.k("prefetchPlaque", true);
        j5mVar.k("fallbackPlaque", true);
        j5mVar.k("conditionalPlaques", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j5.f;
        e7 e7Var = e7.a;
        return new t9f[]{e7Var, arfVarArr[1].getValue(), ff7.C(e7Var), ff7.C(e7Var), ff7.C((t9f) arfVarArr[4].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        g7 g7Var;
        List list;
        g7 g7Var2;
        g7 g7Var3;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j5.f;
        g7 g7Var4 = null;
        if (c.m()) {
            e7 e7Var = e7.a;
            g7 g7Var5 = (g7) c.z(mhpVar, 0, e7Var, null);
            List list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            g7 g7Var6 = (g7) c.n(mhpVar, 2, e7Var, null);
            g7 g7Var7 = (g7) c.n(mhpVar, 3, e7Var, null);
            list2 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            g7Var3 = g7Var7;
            i = 31;
            g7Var2 = g7Var6;
            list = list3;
            g7Var = g7Var5;
        } else {
            boolean z = true;
            int i2 = 0;
            List list4 = null;
            g7 g7Var8 = null;
            g7 g7Var9 = null;
            List list5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    g7Var4 = (g7) c.z(mhpVar, 0, e7.a, g7Var4);
                    i2 |= 1;
                } else if (w == 1) {
                    list4 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list4);
                    i2 |= 2;
                } else if (w == 2) {
                    g7Var8 = (g7) c.n(mhpVar, 2, e7.a, g7Var8);
                    i2 |= 4;
                } else if (w == 3) {
                    g7Var9 = (g7) c.n(mhpVar, 3, e7.a, g7Var9);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    list5 = (List) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list5);
                    i2 |= 16;
                }
            }
            i = i2;
            g7Var = g7Var4;
            list = list4;
            g7Var2 = g7Var8;
            g7Var3 = g7Var9;
            list2 = list5;
        }
        c.b(mhpVar);
        return new j5(i, g7Var, list, g7Var2, g7Var3, list2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j5 j5Var = (j5) obj;
        l6bVar.getClass();
        j5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j5.f;
        e7 e7Var = e7.a;
        g7 g7Var = j5Var.a;
        List list = j5Var.e;
        g7 g7Var2 = j5Var.d;
        g7 g7Var3 = j5Var.c;
        c.k(mhpVar, 0, e7Var, g7Var);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j5Var.b);
        if (c.e(mhpVar) || g7Var3 != null) {
            c.q(mhpVar, 2, e7Var, g7Var3);
        }
        if (c.e(mhpVar) || g7Var2 != null) {
            c.q(mhpVar, 3, e7Var, g7Var2);
        }
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
