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
public final /* synthetic */ class r8 implements p3d {
    public static final r8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r8 r8Var = new r8();
        a = r8Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUserAddNewSbpContentSerializer.UserAddNewSbpDto", r8Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{o8.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        q8 q8Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        q8 q8Var2 = null;
        if (c.m()) {
            q8Var = (q8) c.z(mhpVar, 0, o8.a, null);
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
                    q8Var2 = (q8) c.z(mhpVar, 0, o8.a, q8Var2);
                    i2 = 1;
                }
            }
            q8Var = q8Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new t8(i, q8Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t8 t8Var = (t8) obj;
        l6bVar.getClass();
        t8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, o8.a, t8Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
