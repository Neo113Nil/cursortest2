package com.yandex.passport.internal.config.template;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.passport.internal.config.template.UrlTemplateConfigCacheV1", aVar, 2);
        j5mVar.k("updateTokenWithMasterUrl", false);
        j5mVar.k("switchMemberUrl", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        d dVar = d.a;
        return new t9f[]{ff7.C(dVar), ff7.C(dVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        f fVar;
        f fVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        f fVar3 = null;
        if (c.m()) {
            d dVar = d.a;
            fVar = (f) c.n(mhpVar, 0, dVar, null);
            fVar2 = (f) c.n(mhpVar, 1, dVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            f fVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    fVar3 = (f) c.n(mhpVar, 0, d.a, fVar3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    fVar4 = (f) c.n(mhpVar, 1, d.a, fVar4);
                    i2 |= 2;
                }
            }
            i = i2;
            fVar = fVar3;
            fVar2 = fVar4;
        }
        c.b(mhpVar);
        return new c(i, fVar, fVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c cVar = (c) obj;
        l6bVar.getClass();
        cVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        d dVar = d.a;
        c.q(mhpVar, 0, dVar, cVar.a);
        c.q(mhpVar, 1, dVar, cVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
