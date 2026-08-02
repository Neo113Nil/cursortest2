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
public final /* synthetic */ class w3 implements p3d {
    public static final w3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w3 w3Var = new w3();
        a = w3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayErrorContentSerializer.ErrorDto", w3Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{c4.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        e4 e4Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        e4 e4Var2 = null;
        if (c.m()) {
            e4Var = (e4) c.z(mhpVar, 0, c4.a, null);
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
                    e4Var2 = (e4) c.z(mhpVar, 0, c4.a, e4Var2);
                    i2 = 1;
                }
            }
            e4Var = e4Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new y3(i, e4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y3 y3Var = (y3) obj;
        l6bVar.getClass();
        y3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, c4.a, y3Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
