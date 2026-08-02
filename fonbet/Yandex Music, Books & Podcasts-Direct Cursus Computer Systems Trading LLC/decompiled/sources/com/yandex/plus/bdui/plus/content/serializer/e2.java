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
public final /* synthetic */ class e2 implements p3d {
    public static final e2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e2 e2Var = new e2();
        a = e2Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.WebDto", e2Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{v1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        x1 x1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        x1 x1Var2 = null;
        if (c.m()) {
            x1Var = (x1) c.z(mhpVar, 0, v1.a, null);
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
                    x1Var2 = (x1) c.z(mhpVar, 0, v1.a, x1Var2);
                    i2 = 1;
                }
            }
            x1Var = x1Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new g2(i, x1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g2 g2Var = (g2) obj;
        l6bVar.getClass();
        g2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, v1.a, g2Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
