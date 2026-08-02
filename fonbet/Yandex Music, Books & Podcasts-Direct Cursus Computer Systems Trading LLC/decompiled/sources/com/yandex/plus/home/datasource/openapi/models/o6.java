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
public final /* synthetic */ class o6 implements p3d {
    public static final o6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o6 o6Var = new o6();
        a = o6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkRadialGradientModel", o6Var, 3);
        j5mVar.k("type", false);
        j5mVar.k("colors", false);
        j5mVar.k("centralPoint", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, q6.d[1].getValue(), f3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        h3 h3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q6.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            list = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            h3Var = (h3) c.z(mhpVar, 2, f3.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            h3 h3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    h3Var2 = (h3) c.z(mhpVar, 2, f3.a, h3Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            list = list2;
            h3Var = h3Var2;
        }
        c.b(mhpVar);
        return new q6(i, str, list, h3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q6 q6Var = (q6) obj;
        l6bVar.getClass();
        q6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = q6.d;
        c.p(mhpVar, 0, q6Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), q6Var.b);
        c.k(mhpVar, 2, f3.a, q6Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
