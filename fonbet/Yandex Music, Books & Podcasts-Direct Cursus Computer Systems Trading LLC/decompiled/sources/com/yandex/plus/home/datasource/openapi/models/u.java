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
import defpackage.tq5;
import defpackage.wq5;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class u implements p3d {
    public static final u a;

    @NotNull
    private static final mhp descriptor;

    static {
        u uVar = new u();
        a = uVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel", uVar, 2);
        j5mVar.k("amount", false);
        j5mVar.k("currency", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{a.a, x.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        BigDecimal bigDecimal;
        w wVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x.c;
        BigDecimal bigDecimal2 = null;
        if (c.m()) {
            bigDecimal = (BigDecimal) c.z(mhpVar, 0, a.a, null);
            wVar = (w) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            w wVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bigDecimal2 = (BigDecimal) c.z(mhpVar, 0, a.a, bigDecimal2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    wVar2 = (w) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), wVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            bigDecimal = bigDecimal2;
            wVar = wVar2;
        }
        c.b(mhpVar);
        return new x(i, bigDecimal, wVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x xVar = (x) obj;
        l6bVar.getClass();
        xVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x.c;
        c.k(mhpVar, 0, a.a, xVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), xVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
