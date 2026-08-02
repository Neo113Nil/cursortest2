package com.yandex.plus.core.graphql.gradient;

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
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("radial", hVar, 3);
        j5mVar.k("colors", false);
        j5mVar.k("radius", false);
        j5mVar.k("center", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        l lVar = l.a;
        return new t9f[]{j.e[0].getValue(), lVar, lVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        n nVar;
        n nVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j.e;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            l lVar = l.a;
            nVar = (n) c.z(mhpVar, 1, lVar, null);
            nVar2 = (n) c.z(mhpVar, 2, lVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            n nVar3 = null;
            n nVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (w == 1) {
                    nVar3 = (n) c.z(mhpVar, 1, l.a, nVar3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    nVar4 = (n) c.z(mhpVar, 2, l.a, nVar4);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            nVar = nVar3;
            nVar2 = nVar4;
        }
        c.b(mhpVar);
        return new j(i, list, nVar, nVar2);
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
        c.k(mhpVar, 0, (t9f) j.e[0].getValue(), jVar.b);
        l lVar = l.a;
        c.k(mhpVar, 1, lVar, jVar.c);
        c.k(mhpVar, 2, lVar, jVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
