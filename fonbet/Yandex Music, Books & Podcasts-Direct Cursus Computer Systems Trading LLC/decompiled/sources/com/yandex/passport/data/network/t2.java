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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements p3d {
    public static final t2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t2 t2Var = new t2();
        a = t2Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetBadgesSpecificationRequest.AppConfigurations", t2Var, 3);
        j5mVar.k("package", false);
        j5mVar.k("platform", false);
        j5mVar.k("badges", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = v2.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v2.d;
        String str3 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            str2 = c.g(mhpVar, 1);
            list = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            list = list2;
        }
        c.b(mhpVar);
        return new v2(i, str, str2, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v2 v2Var = (v2) obj;
        l6bVar.getClass();
        v2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v2.d;
        c.p(mhpVar, 0, v2Var.a);
        c.p(mhpVar, 1, v2Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), v2Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
