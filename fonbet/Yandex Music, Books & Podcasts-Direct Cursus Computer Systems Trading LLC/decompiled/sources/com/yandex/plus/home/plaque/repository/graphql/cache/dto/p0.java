package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.cqe;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class p0 implements p3d {
    public static final p0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p0 p0Var = new p0();
        a = p0Var;
        j5m j5mVar = new j5m("Fix", p0Var, 1);
        j5mVar.k("widthFix", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 1;
        if (c.m()) {
            i = c.k(mhpVar, 0);
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    i = c.k(mhpVar, 0);
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        c.b(mhpVar);
        return new r0(i2, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r0 r0Var = (r0) obj;
        l6bVar.getClass();
        r0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.A(0, r0Var.a, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
