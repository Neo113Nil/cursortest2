package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.eg7;
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
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayAppBarContentSerializer.PayloadDto", oVar, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l.a, f.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        n nVar;
        h hVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        n nVar2 = null;
        if (c.m()) {
            nVar = (n) c.z(mhpVar, 0, l.a, null);
            hVar = (h) c.z(mhpVar, 1, f.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            h hVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    nVar2 = (n) c.z(mhpVar, 0, l.a, nVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    hVar2 = (h) c.z(mhpVar, 1, f.a, hVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            nVar = nVar2;
            hVar = hVar2;
        }
        c.b(mhpVar);
        return new q(i, nVar, hVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, l.a, qVar.a);
        c.k(mhpVar, 1, f.a, qVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
