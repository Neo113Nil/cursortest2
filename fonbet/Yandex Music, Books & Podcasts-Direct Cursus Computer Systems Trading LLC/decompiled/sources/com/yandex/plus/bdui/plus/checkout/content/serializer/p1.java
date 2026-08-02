package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements p3d {
    public static final p1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.PaymentPromoLegalInfoDto", p1Var, 1);
        j5mVar.k("legalText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = null;
        if (c.m()) {
            m1Var = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var2);
                    i2 = 1;
                }
            }
            m1Var = m1Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new r1(i, m1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r1 r1Var = (r1) obj;
        l6bVar.getClass();
        r1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, r1Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
