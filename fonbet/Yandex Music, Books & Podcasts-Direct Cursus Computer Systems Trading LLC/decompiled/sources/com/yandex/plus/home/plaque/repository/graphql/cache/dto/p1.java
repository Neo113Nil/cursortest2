package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
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
public final /* synthetic */ class p1 implements p3d {
    public static final p1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        j5m j5mVar = new j5m("Icon", p1Var, 2);
        j5mVar.k("position", false);
        j5mVar.k("url", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C((t9f) r1.c[0].getValue()), tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        s1 s1Var;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r1.c;
        s1 s1Var2 = null;
        if (c.m()) {
            s1Var = (s1) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    s1Var2 = (s1) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), s1Var2);
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
            s1Var = s1Var2;
            str = str2;
        }
        c.b(mhpVar);
        return new r1(i, s1Var, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r1 r1Var = (r1) obj;
        l6bVar.getClass();
        r1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, (t9f) r1.c[0].getValue(), r1Var.a);
        c.p(mhpVar, 1, r1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
