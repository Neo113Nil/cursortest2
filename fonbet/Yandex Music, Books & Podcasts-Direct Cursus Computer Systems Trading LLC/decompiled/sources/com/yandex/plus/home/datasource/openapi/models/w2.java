package com.yandex.plus.home.datasource.openapi.models;

import defpackage.cqe;
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
public final /* synthetic */ class w2 implements p3d {
    public static final w2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w2 w2Var = new w2();
        a = w2Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkFixWidthTypeModel", w2Var, 2);
        j5mVar.k("type", false);
        j5mVar.k("widthFix", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            i = c.k(mhpVar, 1);
            i2 = 3;
        } else {
            str = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i4 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 1);
                    i4 |= 2;
                }
            }
            i = i3;
            i2 = i4;
        }
        c.b(mhpVar);
        return new y2(i2, str, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y2 y2Var = (y2) obj;
        l6bVar.getClass();
        y2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, y2Var.a);
        c.A(1, y2Var.b, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
