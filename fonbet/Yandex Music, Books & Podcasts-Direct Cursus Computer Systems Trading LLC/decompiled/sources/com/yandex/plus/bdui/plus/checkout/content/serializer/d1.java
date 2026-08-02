package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.connectsdk.device.ConnectableDevice;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements p3d {
    public static final d1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d1 d1Var = new d1();
        a = d1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.PaymentButtonDto", d1Var, 7);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("title", false);
        j5mVar.k("lightTheme", false);
        j5mVar.k("darkTheme", false);
        j5mVar.k("isBound", false);
        j5mVar.k("hasArrowIcon", false);
        j5mVar.k("asset", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(e1.a);
        tkr tkrVar = tkr.a;
        i1 i1Var = i1.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkrVar, tkrVar, i1Var, i1Var, oc3Var, oc3Var, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        g1 g1Var;
        boolean z2;
        int i;
        String str;
        String str2;
        k1 k1Var;
        k1 k1Var2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 1;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            i1 i1Var = i1.a;
            k1 k1Var3 = (k1) c.z(mhpVar, 2, i1Var, null);
            k1 k1Var4 = (k1) c.z(mhpVar, 3, i1Var, null);
            boolean D = c.D(mhpVar, 4);
            boolean D2 = c.D(mhpVar, 5);
            str = g;
            g1Var = (g1) c.n(mhpVar, 6, e1.a, null);
            z = D2;
            k1Var2 = k1Var4;
            z2 = D;
            k1Var = k1Var3;
            str2 = g2;
            i = 127;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            k1 k1Var5 = null;
            k1 k1Var6 = null;
            boolean z5 = false;
            g1 g1Var2 = null;
            while (z3) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        i3 |= 1;
                        str3 = c.g(mhpVar, 0);
                        continue;
                    case 1:
                        str4 = c.g(mhpVar, i2);
                        i3 |= 2;
                        continue;
                    case 2:
                        k1Var5 = (k1) c.z(mhpVar, 2, i1.a, k1Var5);
                        i3 |= 4;
                        break;
                    case 3:
                        k1Var6 = (k1) c.z(mhpVar, 3, i1.a, k1Var6);
                        i3 |= 8;
                        break;
                    case 4:
                        z5 = c.D(mhpVar, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        z4 = c.D(mhpVar, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        g1Var2 = (g1) c.n(mhpVar, 6, e1.a, g1Var2);
                        i3 |= 64;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 1;
            }
            z = z4;
            g1Var = g1Var2;
            z2 = z5;
            i = i3;
            str = str3;
            str2 = str4;
            k1Var = k1Var5;
            k1Var2 = k1Var6;
        }
        c.b(mhpVar);
        return new l1(i, str, str2, k1Var, k1Var2, z2, z, g1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l1 l1Var = (l1) obj;
        l6bVar.getClass();
        l1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, l1Var.a);
        c.p(mhpVar, 1, l1Var.b);
        i1 i1Var = i1.a;
        c.k(mhpVar, 2, i1Var, l1Var.c);
        c.k(mhpVar, 3, i1Var, l1Var.d);
        c.j(mhpVar, 4, l1Var.e);
        c.j(mhpVar, 5, l1Var.f);
        c.q(mhpVar, 6, e1.a, l1Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
