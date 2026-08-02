package com.yandex.plus.core.data.common;

import defpackage.cqe;
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
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.data.common.ColorPair", aVar, 2);
        j5mVar.k("light", true);
        j5mVar.k("dark", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        cqe cqeVar = cqe.a;
        return new t9f[]{ff7.C(cqeVar), ff7.C(cqeVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        Integer num2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Integer num3 = null;
        if (c.m()) {
            cqe cqeVar = cqe.a;
            num = (Integer) c.n(mhpVar, 0, cqeVar, null);
            num2 = (Integer) c.n(mhpVar, 1, cqeVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Integer num4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    num3 = (Integer) c.n(mhpVar, 0, cqe.a, num3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    num4 = (Integer) c.n(mhpVar, 1, cqe.a, num4);
                    i2 |= 2;
                }
            }
            i = i2;
            num = num3;
            num2 = num4;
        }
        c.b(mhpVar);
        return new c(i, num, num2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c cVar = (c) obj;
        l6bVar.getClass();
        cVar.getClass();
        Integer num = cVar.b;
        Integer num2 = cVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || num2 != null) {
            c.q(mhpVar, 0, cqe.a, num2);
        }
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 1, cqe.a, num);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
