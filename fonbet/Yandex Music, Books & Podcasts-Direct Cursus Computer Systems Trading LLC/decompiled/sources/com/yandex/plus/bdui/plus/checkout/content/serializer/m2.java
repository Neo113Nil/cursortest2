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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements p3d {
    public static final m2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m2 m2Var = new m2();
        a = m2Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayClosingOfferContentSerializer.AssetDto", m2Var, 4);
        j5mVar.k("title", false);
        j5mVar.k("icon", false);
        j5mVar.k("price", false);
        j5mVar.k("buttonAdditionalText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        return new t9f[]{k1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, k1Var, ff7.C(k1Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4 = null;
        if (c.m()) {
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 2, k1Var, null);
            m1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 3, k1Var, null);
            i = 15;
            m1Var2 = m1Var6;
            tVar = tVar2;
            m1Var = m1Var5;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar3 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    m1Var4 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var4);
                    i2 |= 1;
                } else if (w == 1) {
                    tVar3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    m1Var7 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var7);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    m1Var8 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var8);
                    i2 |= 8;
                }
            }
            i = i2;
            m1Var = m1Var4;
            tVar = tVar3;
            m1Var2 = m1Var7;
            m1Var3 = m1Var8;
        }
        c.b(mhpVar);
        return new o2(i, m1Var, tVar, m1Var2, m1Var3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o2 o2Var = (o2) obj;
        l6bVar.getClass();
        o2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        c.k(mhpVar, 0, k1Var, o2Var.a);
        c.k(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, o2Var.b);
        c.k(mhpVar, 2, k1Var, o2Var.c);
        c.q(mhpVar, 3, k1Var, o2Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
