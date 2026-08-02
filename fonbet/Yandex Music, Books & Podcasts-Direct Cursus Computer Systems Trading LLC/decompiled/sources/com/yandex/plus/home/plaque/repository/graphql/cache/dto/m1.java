package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class m1 implements p3d {
    public static final m1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m1 m1Var = new m1();
        a = m1Var;
        j5m j5mVar = new j5m("Count", m1Var, 2);
        j5mVar.k("position", false);
        j5mVar.k("count", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) o1.c[0].getValue()), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        s1 s1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o1.c;
        if (c.m()) {
            s1Var = (s1) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            i = c.k(mhpVar, 1);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            s1 s1Var2 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    s1Var2 = (s1) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), s1Var2);
                    i3 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    i = c.k(mhpVar, 1);
                    i3 |= 2;
                }
            }
            i2 = i3;
            s1Var = s1Var2;
        }
        c.b(mhpVar);
        return new o1(i2, s1Var, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o1 o1Var = (o1) obj;
        l6bVar.getClass();
        o1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, (t9f) o1.c[0].getValue(), o1Var.a);
        c.A(1, o1Var.b, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
