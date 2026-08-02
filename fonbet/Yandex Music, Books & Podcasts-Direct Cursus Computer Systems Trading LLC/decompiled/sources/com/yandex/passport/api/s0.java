package com.yandex.passport.api;

import defpackage.eg7;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements p3d {
    public static final s0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s0 s0Var = new s0();
        a = s0Var;
        j5m j5mVar = new j5m("com.yandex.passport.api.PassportLocation", s0Var, 1);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{mvg.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            j = c.q(mhpVar, 0);
        } else {
            long j2 = 0;
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
                    j2 = c.q(mhpVar, 0);
                    i2 = 1;
                }
            }
            j = j2;
            i = i2;
        }
        c.b(mhpVar);
        return new u0(i, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u0 u0Var = (u0) obj;
        l6bVar.getClass();
        u0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, u0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
