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
public final /* synthetic */ class f8 implements p3d {
    public static final f8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f8 f8Var = new f8();
        a = f8Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUserAddNewCardContentSerializer.UserAddNewCardDto", f8Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{c8.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        e8 e8Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        e8 e8Var2 = null;
        if (c.m()) {
            e8Var = (e8) c.z(mhpVar, 0, c8.a, null);
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
                    e8Var2 = (e8) c.z(mhpVar, 0, c8.a, e8Var2);
                    i2 = 1;
                }
            }
            e8Var = e8Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new h8(i, e8Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h8 h8Var = (h8) obj;
        l6bVar.getClass();
        h8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, c8.a, h8Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
