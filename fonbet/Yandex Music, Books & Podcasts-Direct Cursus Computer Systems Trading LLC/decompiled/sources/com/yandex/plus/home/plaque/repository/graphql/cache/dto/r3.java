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
public final /* synthetic */ class r3 implements p3d {
    public static final r3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r3 r3Var = new r3();
        a = r3Var;
        j5m j5mVar = new j5m("InSet", r3Var, 2);
        j5mVar.k("argName", false);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, t3.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        y2 y2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t3.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            y2Var = (y2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            y2 y2Var2 = null;
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
                    y2Var2 = (y2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), y2Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            y2Var = y2Var2;
        }
        c.b(mhpVar);
        return new t3(i, str, y2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t3 t3Var = (t3) obj;
        l6bVar.getClass();
        t3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t3.c;
        c.p(mhpVar, 0, t3Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
