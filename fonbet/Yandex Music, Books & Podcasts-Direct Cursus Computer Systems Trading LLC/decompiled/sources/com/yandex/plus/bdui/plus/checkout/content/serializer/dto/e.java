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
public final /* synthetic */ class e implements p3d {
    public static final e a;

    @NotNull
    private static final mhp descriptor;

    static {
        e eVar = new e();
        a = eVar;
        j5m j5mVar = new j5m("DESIGN", eVar, 2);
        j5mVar.k("fallback", false);
        j5mVar.k("name", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{n.a, tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        p pVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        p pVar2 = null;
        if (c.m()) {
            pVar = (p) c.z(mhpVar, 0, n.a, null);
            str = c.g(mhpVar, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    pVar2 = (p) c.z(mhpVar, 0, n.a, pVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            pVar = pVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new g(i, pVar, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g gVar = (g) obj;
        l6bVar.getClass();
        gVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, n.a, gVar.a);
        c.p(mhpVar, 1, gVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
