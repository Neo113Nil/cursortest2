package com.yandex.plus.home.datasource.openapi.models;

import com.connectsdk.device.ConnectableDevice;
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
public final /* synthetic */ class l6 implements p3d {
    public static final l6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        l6 l6Var = new l6();
        a = l6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkProgressDtoModel", l6Var, 4);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("percent", false);
        j5mVar.k("hint", false);
        j5mVar.k("fallbackText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, cqe.a, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            int k = c.k(mhpVar, 1);
            String g = c.g(mhpVar, 2);
            str2 = c.g(mhpVar, 3);
            str3 = g;
            i = k;
            i2 = 15;
        } else {
            str = null;
            String str4 = null;
            String str5 = null;
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
                } else if (w == 1) {
                    i3 = c.k(mhpVar, 1);
                    i4 |= 2;
                } else if (w == 2) {
                    str5 = c.g(mhpVar, 2);
                    i4 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 3);
                    i4 |= 8;
                }
            }
            str2 = str4;
            str3 = str5;
            i = i3;
            i2 = i4;
        }
        String str6 = str;
        c.b(mhpVar);
        return new n6(str6, i2, i, str3, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        n6 n6Var = (n6) obj;
        l6bVar.getClass();
        n6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, n6Var.a);
        c.A(1, n6Var.b, mhpVar);
        c.p(mhpVar, 2, n6Var.c);
        c.p(mhpVar, 3, n6Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
