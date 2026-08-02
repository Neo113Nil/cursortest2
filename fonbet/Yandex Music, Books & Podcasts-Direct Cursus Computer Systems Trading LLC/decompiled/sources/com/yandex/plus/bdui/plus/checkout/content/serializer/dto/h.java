package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("LINEAR_GRADIENT", hVar, 2);
        j5mVar.k("angle", false);
        j5mVar.k("colors", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{n9a.a, j.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        double d;
        int i;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j.c;
        List list2 = null;
        if (c.m()) {
            d = c.F(mhpVar, 0);
            list = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            d = 0.0d;
            boolean z = true;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    d = c.F(mhpVar, 0);
                    i |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i |= 2;
                }
            }
            list = list2;
        }
        c.b(mhpVar);
        return new j(d, i, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j jVar = (j) obj;
        l6bVar.getClass();
        jVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j.c;
        c.l(mhpVar, 0, jVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), jVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
