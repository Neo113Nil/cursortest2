package com.yandex.plus.pay.data.mb.dto;

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
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class x0 implements p3d {
    public static final x0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        x0 x0Var = new x0();
        a = x0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.Price", x0Var, 2);
        j5mVar.k("amount", false);
        j5mVar.k("currency", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{z0.c[0].getValue(), tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        BigDecimal bigDecimal;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = z0.c;
        BigDecimal bigDecimal2 = null;
        if (c.m()) {
            bigDecimal = (BigDecimal) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = c.g(mhpVar, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    bigDecimal2 = (BigDecimal) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), bigDecimal2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            bigDecimal = bigDecimal2;
            str = str2;
        }
        c.b(mhpVar);
        return new z0(i, bigDecimal, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z0 z0Var = (z0) obj;
        l6bVar.getClass();
        z0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) z0.c[0].getValue(), z0Var.a);
        c.p(mhpVar, 1, z0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
