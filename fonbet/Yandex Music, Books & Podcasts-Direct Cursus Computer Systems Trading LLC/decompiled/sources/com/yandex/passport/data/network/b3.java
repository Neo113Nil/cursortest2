package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements p3d {
    public static final b3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b3 b3Var = new b3();
        a = b3Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetBadgesSpecificationRequest.Result", b3Var, 2);
        j5mVar.k("badges_specification", false);
        j5mVar.k("apps_configuration", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d3.c;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d3.c;
        List list3 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    list4 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list4);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list3;
            list2 = list4;
        }
        c.b(mhpVar);
        return new d3(i, list, list2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d3 d3Var = (d3) obj;
        l6bVar.getClass();
        d3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d3.c;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), d3Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), d3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
