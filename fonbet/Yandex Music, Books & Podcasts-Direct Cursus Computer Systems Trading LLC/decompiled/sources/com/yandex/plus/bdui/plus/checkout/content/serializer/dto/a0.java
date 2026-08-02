package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements p3d {
    public static final a0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.dto.TextComponentDto.ColorComponent.Data", a0Var, 2);
        j5mVar.k("text", false);
        j5mVar.k("color", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, o1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        q1 q1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            q1Var = (q1) c.z(mhpVar, 1, o1.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            q1 q1Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    q1Var2 = (q1) c.z(mhpVar, 1, o1.a, q1Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            q1Var = q1Var2;
        }
        c.b(mhpVar);
        return new c0(i, str, q1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c0 c0Var = (c0) obj;
        l6bVar.getClass();
        c0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, c0Var.a);
        c.k(mhpVar, 1, o1.a, c0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
