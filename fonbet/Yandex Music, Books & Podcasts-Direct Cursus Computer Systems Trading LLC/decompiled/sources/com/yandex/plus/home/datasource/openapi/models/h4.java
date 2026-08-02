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
public final /* synthetic */ class h4 implements p3d {
    public static final h4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h4 h4Var = new h4();
        a = h4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkLinearGradientModel", h4Var, 4);
        j5mVar.k("type", false);
        j5mVar.k("colors", false);
        j5mVar.k("startPoint", false);
        j5mVar.k("endPoint", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j4.e;
        f3 f3Var = f3.a;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), f3Var, f3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        h3 h3Var;
        h3 h3Var2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j4.e;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            f3 f3Var = f3.a;
            h3 h3Var3 = (h3) c.z(mhpVar, 2, f3Var, null);
            list = list2;
            str = g;
            h3Var2 = (h3) c.z(mhpVar, 3, f3Var, null);
            h3Var = h3Var3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            h3 h3Var4 = null;
            h3 h3Var5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else if (w == 2) {
                    h3Var4 = (h3) c.z(mhpVar, 2, f3.a, h3Var4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    h3Var5 = (h3) c.z(mhpVar, 3, f3.a, h3Var5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            list = list3;
            h3Var = h3Var4;
            h3Var2 = h3Var5;
        }
        c.b(mhpVar);
        return new j4(i, str, list, h3Var, h3Var2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j4 j4Var = (j4) obj;
        l6bVar.getClass();
        j4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j4.e;
        c.p(mhpVar, 0, j4Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j4Var.b);
        f3 f3Var = f3.a;
        c.k(mhpVar, 2, f3Var, j4Var.c);
        c.k(mhpVar, 3, f3Var, j4Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
