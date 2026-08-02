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
public final /* synthetic */ class u0 implements p3d {
    public static final u0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.IndentDto", u0Var, 4);
        j5mVar.k("indentLeft", false);
        j5mVar.k("indentRight", false);
        j5mVar.k("indentTop", false);
        j5mVar.k("indentBottom", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        cqe cqeVar = cqe.a;
        return new t9f[]{cqeVar, cqeVar, cqeVar, cqeVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            i = c.k(mhpVar, 0);
            int k = c.k(mhpVar, 1);
            int k2 = c.k(mhpVar, 2);
            i2 = c.k(mhpVar, 3);
            i3 = k2;
            i4 = k;
            i5 = 15;
        } else {
            boolean z = true;
            i = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(mhpVar, 0);
                    i9 |= 1;
                } else if (w == 1) {
                    i8 = c.k(mhpVar, 1);
                    i9 |= 2;
                } else if (w == 2) {
                    i7 = c.k(mhpVar, 2);
                    i9 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    i6 = c.k(mhpVar, 3);
                    i9 |= 8;
                }
            }
            i2 = i6;
            i3 = i7;
            i4 = i8;
            i5 = i9;
        }
        int i10 = i;
        c.b(mhpVar);
        return new w0(i5, i10, i4, i3, i2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w0 w0Var = (w0) obj;
        l6bVar.getClass();
        w0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.A(0, w0Var.a, mhpVar);
        c.A(1, w0Var.b, mhpVar);
        c.A(2, w0Var.c, mhpVar);
        c.A(3, w0Var.d, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
