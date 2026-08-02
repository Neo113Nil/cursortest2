package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.eg7;
import defpackage.ff7;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements p3d {
    public static final s1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s1 s1Var = new s1();
        a = s1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.PromoBadgeDto", s1Var, 5);
        j5mVar.k("additionalTitle", false);
        j5mVar.k("backgroundColor", false);
        j5mVar.k("benefitTitle", false);
        j5mVar.k("iconImage", false);
        j5mVar.k("paymentMethodId", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        return new t9f[]{ff7.C(k1Var), com.yandex.plus.bdui.plus.checkout.content.serializer.dto.o1.a, k1Var, ff7.C(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a), ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 q1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = null;
        if (c.m()) {
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 0, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 q1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.o1.a, null);
            m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 2, k1Var, null);
            tVar = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.n(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, null);
            str = (String) c.n(mhpVar, 4, tkr.a, null);
            i = 31;
            q1Var = q1Var2;
            m1Var = m1Var4;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 q1Var3 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar2 = null;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    m1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var3);
                    i2 |= 1;
                } else if (w == 1) {
                    q1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.o1.a, q1Var3);
                    i2 |= 2;
                } else if (w == 2) {
                    m1Var5 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var5);
                    i2 |= 4;
                } else if (w == 3) {
                    tVar2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.n(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tVar2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = (String) c.n(mhpVar, 4, tkr.a, str2);
                    i2 |= 16;
                }
            }
            i = i2;
            m1Var = m1Var3;
            q1Var = q1Var3;
            m1Var2 = m1Var5;
            tVar = tVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new u1(i, m1Var, q1Var, m1Var2, tVar, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u1 u1Var = (u1) obj;
        l6bVar.getClass();
        u1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        c.q(mhpVar, 0, k1Var, u1Var.a);
        c.k(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.o1.a, u1Var.b);
        c.k(mhpVar, 2, k1Var, u1Var.c);
        c.q(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, u1Var.d);
        c.q(mhpVar, 4, tkr.a, u1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
