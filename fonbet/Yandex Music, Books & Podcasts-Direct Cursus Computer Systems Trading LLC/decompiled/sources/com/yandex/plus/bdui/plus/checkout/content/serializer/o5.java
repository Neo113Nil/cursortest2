package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements p3d {
    public static final o5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o5 o5Var = new o5();
        a = o5Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPresaleContentSerializer.DataDto", o5Var, 11);
        j5mVar.k("loadingDelayMillis", false);
        j5mVar.k("loadingTitle", false);
        j5mVar.k("benefitTitle", false);
        j5mVar.k("periodTitle", false);
        j5mVar.k("price", false);
        j5mVar.k("presaleAdditionalTitle", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("acceptAdditionalButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("legalText", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        return new t9f[]{mvg.a, k1Var, ff7.C(k1Var), k1Var, k1Var, k1Var, k1Var, ff7.C(k1Var), k1Var, ff7.C(k1Var), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        c cVar;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var9;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 10;
        char c2 = '\b';
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var10 = null;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var11 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var12 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 2, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var13 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 3, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var14 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 4, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var15 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 5, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var16 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 6, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var17 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 7, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var18 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 8, k1Var, null);
            m1Var = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 9, k1Var, null);
            cVar = (c) c.n(mhpVar, 10, a.a, null);
            i = 2047;
            m1Var4 = m1Var17;
            m1Var3 = m1Var16;
            m1Var5 = m1Var15;
            m1Var7 = m1Var13;
            m1Var2 = m1Var18;
            m1Var6 = m1Var14;
            m1Var9 = m1Var12;
            m1Var8 = m1Var11;
            j = q;
        } else {
            boolean z = true;
            int i3 = 0;
            c cVar2 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var19 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var20 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var21 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var22 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var23 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var24 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var25 = null;
            long j2 = 0;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var26 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = '\b';
                    case 0:
                        j2 = c.q(mhpVar, 0);
                        i3 |= 1;
                        i2 = 10;
                        c2 = '\b';
                    case 1:
                        m1Var10 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var10);
                        i3 |= 2;
                        i2 = 10;
                        c2 = '\b';
                    case 2:
                        m1Var26 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var26);
                        i3 |= 4;
                        i2 = 10;
                        c2 = '\b';
                    case 3:
                        m1Var25 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var25);
                        i3 |= 8;
                        i2 = 10;
                        c2 = '\b';
                    case 4:
                        m1Var24 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var24);
                        i3 |= 16;
                        i2 = 10;
                        c2 = '\b';
                    case 5:
                        m1Var23 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 5, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var23);
                        i3 |= 32;
                        i2 = 10;
                        c2 = '\b';
                    case 6:
                        m1Var21 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 6, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var21);
                        i3 |= 64;
                        i2 = 10;
                        c2 = '\b';
                    case 7:
                        m1Var22 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 7, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var22);
                        i3 |= 128;
                        i2 = 10;
                        c2 = '\b';
                    case 8:
                        m1Var20 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 8, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var20);
                        i3 |= 256;
                        c2 = '\b';
                        i2 = 10;
                    case 9:
                        m1Var19 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 9, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var19);
                        i3 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = '\b';
                    case 10:
                        cVar2 = (c) c.n(mhpVar, i2, a.a, cVar2);
                        i3 |= 1024;
                        c2 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            cVar = cVar2;
            m1Var = m1Var19;
            m1Var2 = m1Var20;
            m1Var3 = m1Var21;
            m1Var4 = m1Var22;
            m1Var5 = m1Var23;
            m1Var6 = m1Var24;
            m1Var7 = m1Var25;
            m1Var8 = m1Var10;
            m1Var9 = m1Var26;
            j = j2;
        }
        c.b(mhpVar);
        return new q5(i, j, m1Var8, m1Var9, m1Var7, m1Var6, m1Var5, m1Var3, m1Var4, m1Var2, m1Var, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q5 q5Var = (q5) obj;
        l6bVar.getClass();
        q5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, q5Var.a);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        c.k(mhpVar, 1, k1Var, q5Var.b);
        c.q(mhpVar, 2, k1Var, q5Var.c);
        c.k(mhpVar, 3, k1Var, q5Var.d);
        c.k(mhpVar, 4, k1Var, q5Var.e);
        c.k(mhpVar, 5, k1Var, q5Var.f);
        c.k(mhpVar, 6, k1Var, q5Var.g);
        c.q(mhpVar, 7, k1Var, q5Var.h);
        c.k(mhpVar, 8, k1Var, q5Var.i);
        c.q(mhpVar, 9, k1Var, q5Var.j);
        c.q(mhpVar, 10, a.a, q5Var.k);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
