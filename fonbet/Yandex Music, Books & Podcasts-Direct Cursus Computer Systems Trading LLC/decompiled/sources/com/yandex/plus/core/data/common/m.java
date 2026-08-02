package com.yandex.plus.core.data.common;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.n9a;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements p3d {
    public static final m a;

    @NotNull
    private static final mhp descriptor;

    static {
        m mVar = new m();
        a = mVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.data.common.PlusGradient.Linear", mVar, 3);
        j5mVar.k("colors", false);
        j5mVar.k("positions", false);
        j5mVar.k("angle", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o.e;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), n9a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        double d;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o.e;
        List list3 = null;
        if (c.m()) {
            List list4 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            list = list4;
            d = c.F(mhpVar, 2);
            i = 7;
        } else {
            double d2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            List list5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (w == 1) {
                    list5 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list5);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    d2 = c.F(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list3;
            d = d2;
            list2 = list5;
        }
        c.b(mhpVar);
        return new o(i, list, list2, d);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o oVar = (o) obj;
        l6bVar.getClass();
        oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o.e;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), oVar.b);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), oVar.c);
        c.l(mhpVar, 2, oVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
