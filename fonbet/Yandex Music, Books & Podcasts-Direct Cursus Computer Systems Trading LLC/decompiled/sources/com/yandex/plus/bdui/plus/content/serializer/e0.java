package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
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
public final /* synthetic */ class e0 implements p3d {
    public static final e0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusDivContentSerializer.ActionsDto", e0Var, 1);
        j5mVar.k("back", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) g0.b[0].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.plus.bdui.action.a aVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g0.b;
        int i = 1;
        com.yandex.plus.bdui.action.a aVar2 = null;
        if (c.m()) {
            aVar = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    aVar2 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), aVar2);
                    i2 = 1;
                }
            }
            aVar = aVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new g0(i, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g0 g0Var = (g0) obj;
        l6bVar.getClass();
        g0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, (t9f) g0.b[0].getValue(), g0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
