package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
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
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements p3d {
    public static final q0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusDivContentSerializer.PayloadDto", q0Var, 5);
        j5mVar.k("layout", false);
        j5mVar.k("layoutParams", false);
        j5mVar.k("layoutActions", false);
        j5mVar.k("logActions", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = s0.f;
        return new t9f[]{s5f.a, ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C(n0.a), ff7.C(e0.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q5f q5fVar;
        Map map;
        Map map2;
        p0 p0Var;
        g0 g0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = s0.f;
        q5f q5fVar2 = null;
        if (c.m()) {
            q5f q5fVar3 = (q5f) c.z(mhpVar, 0, s5f.a, null);
            Map map3 = (Map) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            map2 = (Map) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            q5fVar = q5fVar3;
            p0Var = (p0) c.n(mhpVar, 3, n0.a, null);
            g0Var = (g0) c.n(mhpVar, 4, e0.a, null);
            i = 31;
            map = map3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map4 = null;
            Map map5 = null;
            p0 p0Var2 = null;
            g0 g0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q5fVar2 = (q5f) c.z(mhpVar, 0, s5f.a, q5fVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    map4 = (Map) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), map4);
                    i2 |= 2;
                } else if (w == 2) {
                    map5 = (Map) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), map5);
                    i2 |= 4;
                } else if (w == 3) {
                    p0Var2 = (p0) c.n(mhpVar, 3, n0.a, p0Var2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    g0Var2 = (g0) c.n(mhpVar, 4, e0.a, g0Var2);
                    i2 |= 16;
                }
            }
            i = i2;
            q5fVar = q5fVar2;
            map = map4;
            map2 = map5;
            p0Var = p0Var2;
            g0Var = g0Var2;
        }
        c.b(mhpVar);
        return new s0(i, q5fVar, map, map2, p0Var, g0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        s0 s0Var = (s0) obj;
        l6bVar.getClass();
        s0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = s0.f;
        c.k(mhpVar, 0, s5f.a, s0Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), s0Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), s0Var.c);
        c.q(mhpVar, 3, n0.a, s0Var.d);
        c.q(mhpVar, 4, e0.a, s0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
