package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class i3 implements p3d {
    public static final i3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i3 i3Var = new i3();
        a = i3Var;
        j5m j5mVar = new j5m("Equal", i3Var, 2);
        j5mVar.k("argName", false);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, k3.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        i2 i2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = k3.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            i2Var = (i2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            i2 i2Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i2Var2 = (i2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), i2Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            i2Var = i2Var2;
        }
        c.b(mhpVar);
        return new k3(i, str, i2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k3 k3Var = (k3) obj;
        l6bVar.getClass();
        k3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = k3.c;
        c.p(mhpVar, 0, k3Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), k3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
