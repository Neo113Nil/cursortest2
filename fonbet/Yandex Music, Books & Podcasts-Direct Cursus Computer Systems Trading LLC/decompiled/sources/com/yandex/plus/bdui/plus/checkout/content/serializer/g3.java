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
public final /* synthetic */ class g3 implements p3d {
    public static final g3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g3 g3Var = new g3();
        a = g3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCounterOffersContentSerializer.CounterOffersDto", g3Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{m3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        o3 o3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        o3 o3Var2 = null;
        if (c.m()) {
            o3Var = (o3) c.z(mhpVar, 0, m3.a, null);
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
                    o3Var2 = (o3) c.z(mhpVar, 0, m3.a, o3Var2);
                    i2 = 1;
                }
            }
            o3Var = o3Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new i3(i, o3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i3 i3Var = (i3) obj;
        l6bVar.getClass();
        i3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, m3.a, i3Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
