package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
public final /* synthetic */ class n0 implements p3d {
    public static final n0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n0 n0Var = new n0();
        a = n0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.dto.TextComponentDto.IconComponent.Data", n0Var, 1);
        j5mVar.k("image", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{r.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        t tVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        t tVar2 = null;
        if (c.m()) {
            tVar = (t) c.z(mhpVar, 0, r.a, null);
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
                    tVar2 = (t) c.z(mhpVar, 0, r.a, tVar2);
                    i2 = 1;
                }
            }
            tVar = tVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new p0(i, tVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p0 p0Var = (p0) obj;
        l6bVar.getClass();
        p0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, r.a, p0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
