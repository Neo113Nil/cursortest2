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
public final /* synthetic */ class u implements p3d {
    public static final u a;

    @NotNull
    private static final mhp descriptor;

    static {
        u uVar = new u();
        a = uVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusAuthorizeContentSerializer.AuthorizeDto", uVar, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{a0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        c0 c0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        c0 c0Var2 = null;
        if (c.m()) {
            c0Var = (c0) c.z(mhpVar, 0, a0.a, null);
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
                    c0Var2 = (c0) c.z(mhpVar, 0, a0.a, c0Var2);
                    i2 = 1;
                }
            }
            c0Var = c0Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new w(i, c0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w wVar = (w) obj;
        l6bVar.getClass();
        wVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, a0.a, wVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
