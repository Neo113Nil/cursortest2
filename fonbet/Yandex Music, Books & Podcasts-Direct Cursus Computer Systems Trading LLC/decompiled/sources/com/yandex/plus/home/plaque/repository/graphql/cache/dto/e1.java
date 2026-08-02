package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import com.connectsdk.service.DeviceService;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class e1 implements p3d {
    public static final e1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ItemDto.Link", e1Var, 2);
        j5mVar.k("link", false);
        j5mVar.k(DeviceService.KEY_DESC, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, h1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        j1 j1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            j1Var = (j1) c.z(mhpVar, 1, h1.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            j1 j1Var2 = null;
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
                    j1Var2 = (j1) c.z(mhpVar, 1, h1.a, j1Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            j1Var = j1Var2;
        }
        c.b(mhpVar);
        return new g1(i, str, j1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g1 g1Var = (g1) obj;
        l6bVar.getClass();
        g1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, g1Var.a);
        c.k(mhpVar, 1, h1.a, g1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
