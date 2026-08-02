package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements p3d {
    public static final n a;

    @NotNull
    private static final mhp descriptor;

    static {
        n nVar = new n();
        a = nVar;
        j5m j5mVar = new j5m("LinearGradient", nVar, 3);
        j5mVar.k("colors", false);
        j5mVar.k("startPoint", false);
        j5mVar.k("endPoint", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        q qVar = q.a;
        return new t9f[]{p.d[0].getValue(), qVar, qVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        s sVar;
        s sVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = p.d;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            q qVar = q.a;
            sVar = (s) c.z(mhpVar, 1, qVar, null);
            sVar2 = (s) c.z(mhpVar, 2, qVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            s sVar3 = null;
            s sVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (w == 1) {
                    sVar3 = (s) c.z(mhpVar, 1, q.a, sVar3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    sVar4 = (s) c.z(mhpVar, 2, q.a, sVar4);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            sVar = sVar3;
            sVar2 = sVar4;
        }
        c.b(mhpVar);
        return new p(i, list, sVar, sVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p pVar = (p) obj;
        l6bVar.getClass();
        pVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) p.d[0].getValue(), pVar.a);
        q qVar = q.a;
        c.k(mhpVar, 1, qVar, pVar.b);
        c.k(mhpVar, 2, qVar, pVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
