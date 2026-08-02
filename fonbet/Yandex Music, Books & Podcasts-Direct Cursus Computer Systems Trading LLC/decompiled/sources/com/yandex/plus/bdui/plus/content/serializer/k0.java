package com.yandex.plus.bdui.plus.content.serializer;

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
import defpackage.w4f;
import defpackage.wq5;
import defpackage.z4f;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements p3d {
    public static final k0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusDivContentSerializer.LayoutParamDto", k0Var, 2);
        j5mVar.k("type", false);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, z4f.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        w4f w4fVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            w4fVar = (w4f) c.z(mhpVar, 1, z4f.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            w4f w4fVar2 = null;
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
                    w4fVar2 = (w4f) c.z(mhpVar, 1, z4f.a, w4fVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            w4fVar = w4fVar2;
        }
        c.b(mhpVar);
        return new m0(i, str, w4fVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m0 m0Var = (m0) obj;
        l6bVar.getClass();
        m0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, m0Var.a);
        c.k(mhpVar, 1, z4f.a, m0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
