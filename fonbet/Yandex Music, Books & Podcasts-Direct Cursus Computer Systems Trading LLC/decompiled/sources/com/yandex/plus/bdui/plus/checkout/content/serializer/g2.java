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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements p3d {
    public static final g2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g2 g2Var = new g2();
        a = g2Var;
        descriptor = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCloseContentSerializer.CloseDto", g2Var, 0);
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[0];
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int w;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m() || (w = c.w(mhpVar)) == -1) {
            c.b(mhpVar);
            return new i2();
        }
        l1j.g(w);
        return null;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        ((i2) obj).getClass();
        mhp mhpVar = descriptor;
        l6bVar.c(mhpVar).b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
