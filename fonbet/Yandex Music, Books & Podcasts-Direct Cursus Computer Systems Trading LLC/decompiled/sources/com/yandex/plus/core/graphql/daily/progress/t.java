package com.yandex.plus.core.graphql.daily.progress;

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
import defpackage.zic;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("LinearGradient", tVar, 2);
        j5mVar.k("colors", false);
        j5mVar.k("angle", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{v.d[0].getValue(), zic.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        float f;
        int i;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v.d;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            f = c.v(mhpVar, 1);
            i = 3;
        } else {
            f = 0.0f;
            boolean z = true;
            List list2 = null;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    f = c.v(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
        }
        c.b(mhpVar);
        return new v(f, i, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v vVar = (v) obj;
        l6bVar.getClass();
        vVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) v.d[0].getValue(), vVar.b);
        c.F(mhpVar, 1, vVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
