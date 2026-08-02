package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.eg7;
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
public final /* synthetic */ class h2 implements p3d {
    public static final h2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h2 h2Var = new h2();
        a = h2Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkExperimentsModel", h2Var, 4);
        j5mVar.k("experiments", false);
        j5mVar.k("triggeredExperiments", false);
        j5mVar.k("testIds", false);
        j5mVar.k("triggeredTestIds", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j2.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j2.e;
        List list3 = null;
        if (c.m()) {
            List list4 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list5 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g = c.g(mhpVar, 2);
            list2 = list5;
            list = list4;
            str2 = c.g(mhpVar, 3);
            str = g;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list6 = null;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (w == 1) {
                    list6 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list6);
                    i2 |= 2;
                } else if (w == 2) {
                    str3 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            list2 = list6;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new j2(i, str, str2, list, list2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j2 j2Var = (j2) obj;
        l6bVar.getClass();
        j2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j2.e;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), j2Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j2Var.b);
        c.p(mhpVar, 2, j2Var.c);
        c.p(mhpVar, 3, j2Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
