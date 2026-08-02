package com.yandex.passport.internal.rotation;

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
public final /* synthetic */ class e implements p3d {
    public static final e a;

    @NotNull
    private static final mhp descriptor;

    static {
        e eVar = new e();
        a = eVar;
        j5m j5mVar = new j5m("com.yandex.passport.internal.rotation.QuarantineMasterTokenStorage.QuarantineMasterToken", eVar, 3);
        j5mVar.k("masterToken", false);
        j5mVar.k("uid", false);
        j5mVar.k("clientId", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, com.yandex.passport.internal.serialization.a.a, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        com.yandex.passport.common.core.f fVar;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            fVar = (com.yandex.passport.common.core.f) c.z(mhpVar, 1, com.yandex.passport.internal.serialization.a.a, null);
            str2 = c.g(mhpVar, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.passport.common.core.f fVar2 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    fVar2 = (com.yandex.passport.common.core.f) c.z(mhpVar, 1, com.yandex.passport.internal.serialization.a.a, fVar2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            fVar = fVar2;
            str2 = str4;
        }
        c.b(mhpVar);
        return new g(i, fVar, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g gVar = (g) obj;
        l6bVar.getClass();
        gVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, gVar.a);
        c.k(mhpVar, 1, com.yandex.passport.internal.serialization.a.a, gVar.b);
        c.p(mhpVar, 2, gVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
