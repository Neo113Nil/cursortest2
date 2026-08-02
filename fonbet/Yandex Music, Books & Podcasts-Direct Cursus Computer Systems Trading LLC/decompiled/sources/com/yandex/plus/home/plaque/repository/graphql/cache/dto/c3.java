package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class c3 implements p3d {
    public static final c3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c3 c3Var = new c3();
        a = c3Var;
        j5m j5mVar = new j5m("BooleanLiteral", c3Var, 1);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            z = c.D(mhpVar, 0);
        } else {
            boolean z2 = true;
            z = false;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    z = c.D(mhpVar, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        c.b(mhpVar);
        return new e3(i, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e3 e3Var = (e3) obj;
        l6bVar.getClass();
        e3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.j(mhpVar, 0, e3Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
