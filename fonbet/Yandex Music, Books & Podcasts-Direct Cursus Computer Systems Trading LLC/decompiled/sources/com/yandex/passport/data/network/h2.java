package com.yandex.passport.data.network;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements p3d {
    public static final h2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h2 h2Var = new h2();
        a = h2Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.ExperimentsRequest.Experiment", h2Var, 2);
        j5mVar.k("handler", false);
        j5mVar.k("PASSPORT", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, l2.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        n2 n2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            n2Var = (n2) c.z(mhpVar, 1, l2.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            n2 n2Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    n2Var2 = (n2) c.z(mhpVar, 1, l2.a, n2Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            n2Var = n2Var2;
        }
        c.b(mhpVar);
        return new j2(i, str, n2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j2 j2Var = (j2) obj;
        l6bVar.getClass();
        j2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, j2Var.a);
        c.k(mhpVar, 1, l2.a, j2Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
