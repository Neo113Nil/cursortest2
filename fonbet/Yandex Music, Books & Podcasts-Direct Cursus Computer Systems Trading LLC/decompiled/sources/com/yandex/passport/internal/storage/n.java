package com.yandex.passport.internal.storage;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements p3d {
    public static final n a;

    @NotNull
    private static final mhp descriptor;

    static {
        n nVar = new n();
        a = nVar;
        j5m j5mVar = new j5m("com.yandex.passport.internal.storage.UidWithTtl", nVar, 2);
        j5mVar.k("uid", false);
        j5mVar.k("ttl", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{com.yandex.passport.internal.serialization.a.a, mvg.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.passport.common.core.f fVar;
        int i;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            fVar = (com.yandex.passport.common.core.f) c.z(mhpVar, 0, com.yandex.passport.internal.serialization.a.a, null);
            j = c.q(mhpVar, 1);
            i = 3;
        } else {
            long j2 = 0;
            boolean z = true;
            fVar = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    fVar = (com.yandex.passport.common.core.f) c.z(mhpVar, 0, com.yandex.passport.internal.serialization.a.a, fVar);
                    i |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    j2 = c.q(mhpVar, 1);
                    i |= 2;
                }
            }
            j = j2;
        }
        c.b(mhpVar);
        return new p(i, fVar, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p pVar = (p) obj;
        l6bVar.getClass();
        pVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, com.yandex.passport.internal.serialization.a.a, pVar.a);
        c.g(mhpVar, 1, pVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
