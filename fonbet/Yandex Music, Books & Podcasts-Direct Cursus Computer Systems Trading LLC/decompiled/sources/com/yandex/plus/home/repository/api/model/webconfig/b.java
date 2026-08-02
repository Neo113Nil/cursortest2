package com.yandex.plus.home.repository.api.model.webconfig;

import com.connectsdk.device.ConnectableDevice;
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
public final /* synthetic */ class b implements p3d {
    public static final b a;

    @NotNull
    private static final mhp descriptor;

    static {
        b bVar = new b();
        a = bVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration", bVar, 5);
        j5mVar.k("name", false);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("subscription", false);
        j5mVar.k("payInfo", false);
        j5mVar.k("payButton", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, r.a, g.a, d.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        z zVar;
        p pVar;
        f fVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            z zVar2 = (z) c.z(mhpVar, 2, r.a, null);
            str = g;
            pVar = (p) c.z(mhpVar, 3, g.a, null);
            fVar = (f) c.z(mhpVar, 4, d.a, null);
            zVar = zVar2;
            str2 = g2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            z zVar3 = null;
            p pVar2 = null;
            f fVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    zVar3 = (z) c.z(mhpVar, 2, r.a, zVar3);
                    i2 |= 4;
                } else if (w == 3) {
                    pVar2 = (p) c.z(mhpVar, 3, g.a, pVar2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    fVar2 = (f) c.z(mhpVar, 4, d.a, fVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            zVar = zVar3;
            pVar = pVar2;
            fVar = fVar2;
        }
        c.b(mhpVar);
        return new a0(i, str, str2, zVar, pVar, fVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a0 a0Var = (a0) obj;
        l6bVar.getClass();
        a0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, a0Var.a);
        c.p(mhpVar, 1, a0Var.b);
        c.k(mhpVar, 2, r.a, a0Var.c);
        c.k(mhpVar, 3, g.a, a0Var.d);
        c.k(mhpVar, 4, d.a, a0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
