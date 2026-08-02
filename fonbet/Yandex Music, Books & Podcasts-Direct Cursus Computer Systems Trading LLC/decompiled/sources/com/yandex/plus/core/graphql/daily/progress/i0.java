package com.yandex.plus.core.graphql.daily.progress;

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
public final /* synthetic */ class i0 implements p3d {
    public static final i0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        j5m j5mVar = new j5m("com.yandex.plus.core.graphql.daily.progress.ProgressResponse", i0Var, 1);
        j5mVar.k("progress", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        n nVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        n nVar2 = null;
        if (c.m()) {
            nVar = (n) c.z(mhpVar, 0, l.a, null);
        } else {
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
                    nVar2 = (n) c.z(mhpVar, 0, l.a, nVar2);
                    i2 = 1;
                }
            }
            nVar = nVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new k0(i, nVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k0 k0Var = (k0) obj;
        l6bVar.getClass();
        k0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, l.a, k0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
