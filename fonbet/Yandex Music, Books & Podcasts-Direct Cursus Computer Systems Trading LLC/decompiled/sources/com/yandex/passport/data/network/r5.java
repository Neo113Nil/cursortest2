package com.yandex.passport.data.network;

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
import defpackage.tq5;
import defpackage.wq5;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements p3d {
    public static final r5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r5 r5Var = new r5();
        a = r5Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.ParameterRuleDTO", r5Var, 2);
        j5mVar.k("eq", true);
        j5mVar.k("ne", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t5.c;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), ff7.C((t9f) arfVarArr[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Set set;
        Set set2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t5.c;
        Set set3 = null;
        if (c.m()) {
            set = (Set) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            set2 = (Set) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Set set4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    set3 = (Set) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), set3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    set4 = (Set) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), set4);
                    i2 |= 2;
                }
            }
            i = i2;
            set = set3;
            set2 = set4;
        }
        c.b(mhpVar);
        return new t5(i, set, set2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t5 t5Var = (t5) obj;
        l6bVar.getClass();
        t5Var.getClass();
        Set set = t5Var.b;
        Set set2 = t5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t5.c;
        if (c.e(mhpVar) || set2 != null) {
            c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), set2);
        }
        if (c.e(mhpVar) || set != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), set);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
