package com.yandex.plus.home.datasource.openapi.models;

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
public final /* synthetic */ class s0 implements p3d {
    public static final s0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s0 s0Var = new s0();
        a = s0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkContainsPredicateModel", s0Var, 3);
        j5mVar.k("type", false);
        j5mVar.k("argName", false);
        j5mVar.k("primitiveArg", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f serializer = j6.Companion.serializer();
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, serializer};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        j6 j6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            j6Var = (j6) c.z(mhpVar, 2, j6.Companion.serializer(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            j6 j6Var2 = null;
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
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    j6Var2 = (j6) c.z(mhpVar, 2, j6.Companion.serializer(), j6Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            j6Var = j6Var2;
        }
        c.b(mhpVar);
        return new u0(i, str, str2, j6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u0 u0Var = (u0) obj;
        l6bVar.getClass();
        u0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, u0Var.a);
        c.p(mhpVar, 1, u0Var.b);
        c.k(mhpVar, 2, j6.Companion.serializer(), u0Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
