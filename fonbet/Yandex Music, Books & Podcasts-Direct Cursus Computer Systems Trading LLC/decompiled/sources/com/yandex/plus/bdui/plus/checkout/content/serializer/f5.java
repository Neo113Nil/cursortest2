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
public final /* synthetic */ class f5 implements p3d {
    public static final f5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f5 f5Var = new f5();
        a = f5Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPollingContentSerializer.PollingDto", f5Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{c5.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        e5 e5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        e5 e5Var2 = null;
        if (c.m()) {
            e5Var = (e5) c.z(mhpVar, 0, c5.a, null);
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
                    e5Var2 = (e5) c.z(mhpVar, 0, c5.a, e5Var2);
                    i2 = 1;
                }
            }
            e5Var = e5Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new h5(i, e5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h5 h5Var = (h5) obj;
        l6bVar.getClass();
        h5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, c5.a, h5Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
