package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
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
public final /* synthetic */ class k1 implements p3d {
    public static final k1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k1 k1Var = new k1();
        a = k1Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkCounterNotificationModel", k1Var, 3);
        j5mVar.k("position", false);
        j5mVar.k("type", false);
        j5mVar.k("count", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{m1.d[0].getValue(), tkr.a, cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        b5 b5Var;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m1.d;
        if (c.m()) {
            b5Var = (b5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = c.g(mhpVar, 1);
            i = c.k(mhpVar, 2);
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            b5 b5Var2 = null;
            String str2 = null;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b5Var2 = (b5) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), b5Var2);
                    i4 |= 1;
                } else if (w == 1) {
                    str2 = c.g(mhpVar, 1);
                    i4 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            b5Var = b5Var2;
            str = str2;
        }
        c.b(mhpVar);
        return new m1(i2, b5Var, str, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m1 m1Var = (m1) obj;
        l6bVar.getClass();
        m1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) m1.d[0].getValue(), m1Var.a);
        c.p(mhpVar, 1, m1Var.b);
        c.A(2, m1Var.c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
