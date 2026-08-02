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
public final /* synthetic */ class p1 implements p3d {
    public static final p1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.DeviceAuthorizationCommitRequest.Result", p1Var, 1);
        j5mVar.k("status", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            str = c.g(mhpVar, 0);
        } else {
            str = null;
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
                    str = c.g(mhpVar, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        c.b(mhpVar);
        return new r1(i, str);
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
        c.p(mhpVar, 0, r1Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
