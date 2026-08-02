package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements p3d {
    public static final h5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h5 h5Var = new h5();
        a = h5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.BlockVpnEntryDTO", h5Var, 2);
        j5mVar.k(CommonUrlParts.APP_ID, false);
        j5mVar.k("version", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, mvg.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        long j;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            j = c.q(mhpVar, 1);
            i = 3;
        } else {
            str = null;
            long j2 = 0;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    j2 = c.q(mhpVar, 1);
                    i2 |= 2;
                }
            }
            j = j2;
            i = i2;
        }
        c.b(mhpVar);
        return new j5(str, i, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j5 j5Var = (j5) obj;
        l6bVar.getClass();
        j5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, j5Var.a);
        c.g(mhpVar, 1, j5Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
