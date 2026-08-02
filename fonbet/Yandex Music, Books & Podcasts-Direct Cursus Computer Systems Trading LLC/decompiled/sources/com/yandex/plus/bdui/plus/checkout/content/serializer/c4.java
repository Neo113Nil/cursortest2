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
public final /* synthetic */ class c4 implements p3d {
    public static final c4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c4 c4Var = new c4();
        a = c4Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayErrorContentSerializer.PayloadDto", c4Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{t3.a, q3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        v3 v3Var;
        s3 s3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        v3 v3Var2 = null;
        if (c.m()) {
            v3Var = (v3) c.z(mhpVar, 0, t3.a, null);
            s3Var = (s3) c.z(mhpVar, 1, q3.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            s3 s3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    v3Var2 = (v3) c.z(mhpVar, 0, t3.a, v3Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    s3Var2 = (s3) c.z(mhpVar, 1, q3.a, s3Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            v3Var = v3Var2;
            s3Var = s3Var2;
        }
        c.b(mhpVar);
        return new e4(i, v3Var, s3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e4 e4Var = (e4) obj;
        l6bVar.getClass();
        e4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, t3.a, e4Var.a);
        c.k(mhpVar, 1, q3.a, e4Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
