package com.yandex.plus.bdui.flex.action;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.q5f;
import defpackage.s5f;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.flex.action.FlexActionSerializer.PayloadDto", gVar, 1);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(s5f.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        q5f q5fVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        q5f q5fVar2 = null;
        if (c.m()) {
            q5fVar = (q5f) c.n(mhpVar, 0, s5f.a, null);
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
                    q5fVar2 = (q5f) c.n(mhpVar, 0, s5f.a, q5fVar2);
                    i2 = 1;
                }
            }
            q5fVar = q5fVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new i(i, q5fVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i iVar = (i) obj;
        l6bVar.getClass();
        iVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, s5f.a, iVar.a);
        c.b(mhpVar);
    }
}
