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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements p3d {
    public static final l0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel", l0Var, 4);
        j5mVar.k("type", false);
        j5mVar.k("argName", false);
        j5mVar.k("primitiveArg", false);
        j5mVar.k("compareType", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o0.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, j6.Companion.serializer(), arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        j6 j6Var;
        n0 n0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o0.e;
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            j6 j6Var2 = (j6) c.z(mhpVar, 2, j6.Companion.serializer(), null);
            n0Var = (n0) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            j6Var = j6Var2;
            i = 15;
            str2 = g2;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            j6 j6Var3 = null;
            n0 n0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    j6Var3 = (j6) c.z(mhpVar, 2, j6.Companion.serializer(), j6Var3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    n0Var2 = (n0) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), n0Var2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            j6Var = j6Var3;
            n0Var = n0Var2;
        }
        c.b(mhpVar);
        return new o0(i, str, str2, j6Var, n0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o0 o0Var = (o0) obj;
        l6bVar.getClass();
        o0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o0.e;
        c.p(mhpVar, 0, o0Var.a);
        c.p(mhpVar, 1, o0Var.b);
        c.k(mhpVar, 2, j6.Companion.serializer(), o0Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), o0Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
