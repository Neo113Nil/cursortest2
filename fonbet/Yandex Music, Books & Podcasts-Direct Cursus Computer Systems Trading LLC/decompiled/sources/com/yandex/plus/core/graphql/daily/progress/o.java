package com.yandex.plus.core.graphql.daily.progress;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
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
import defpackage.zic;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.graphql.daily.progress.ProgressGradient.ColorStop", oVar, 2);
        j5mVar.k(SSDPDeviceDescriptionParser.TAG_LOCATION, false);
        j5mVar.k("hexColor", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{zic.a, e.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        float f;
        int i;
        g gVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            f = c.v(mhpVar, 0);
            gVar = (g) c.z(mhpVar, 1, e.a, null);
            i = 3;
        } else {
            f = 0.0f;
            boolean z = true;
            g gVar2 = null;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    f = c.v(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    gVar2 = (g) c.z(mhpVar, 1, e.a, gVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            gVar = gVar2;
        }
        c.b(mhpVar);
        return new q(i, f, gVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.F(mhpVar, 0, qVar.a);
        c.k(mhpVar, 1, e.a, qVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
