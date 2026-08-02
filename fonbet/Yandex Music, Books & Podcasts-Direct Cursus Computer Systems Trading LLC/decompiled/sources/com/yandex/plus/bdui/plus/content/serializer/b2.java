package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements p3d {
    public static final b2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b2 b2Var = new b2();
        a = b2Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.RetryDelayDto", b2Var, 2);
        j5mVar.k("startMillis", false);
        j5mVar.k("millis", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        mvg mvgVar = mvg.a;
        return new t9f[]{mvgVar, mvgVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        long j;
        long j2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            j = c.q(mhpVar, 1);
            j2 = q;
            i = 3;
        } else {
            long j3 = 0;
            boolean z = true;
            int i2 = 0;
            long j4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j4 = c.q(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    j3 = c.q(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
        c.b(mhpVar);
        return new d2(i, j2, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d2 d2Var = (d2) obj;
        l6bVar.getClass();
        d2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, d2Var.a);
        c.g(mhpVar, 1, d2Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
