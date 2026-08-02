package com.yandex.plus.bdui.plus.content.serializer;

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
public final /* synthetic */ class a0 implements p3d {
    public static final a0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusAuthorizeContentSerializer.PayloadDto", a0Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{x.a, r.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        z zVar;
        t tVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        z zVar2 = null;
        if (c.m()) {
            zVar = (z) c.z(mhpVar, 0, x.a, null);
            tVar = (t) c.z(mhpVar, 1, r.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            t tVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    zVar2 = (z) c.z(mhpVar, 0, x.a, zVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    tVar2 = (t) c.z(mhpVar, 1, r.a, tVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            zVar = zVar2;
            tVar = tVar2;
        }
        c.b(mhpVar);
        return new c0(i, zVar, tVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c0 c0Var = (c0) obj;
        l6bVar.getClass();
        c0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, x.a, c0Var.a);
        c.k(mhpVar, 1, r.a, c0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
