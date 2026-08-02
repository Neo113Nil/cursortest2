package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements p3d {
    public static final k1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k1 k1Var = new k1();
        a = k1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.dto.TextDto", k1Var, 2);
        j5mVar.k("text", false);
        j5mVar.k("components", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, ff7.C((t9f) m1.c[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m1.c;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            list = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
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
                    list2 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            list = list2;
        }
        c.b(mhpVar);
        return new m1(str, list, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m1 m1Var = (m1) obj;
        l6bVar.getClass();
        m1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = m1.c;
        c.p(mhpVar, 0, m1Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), m1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
