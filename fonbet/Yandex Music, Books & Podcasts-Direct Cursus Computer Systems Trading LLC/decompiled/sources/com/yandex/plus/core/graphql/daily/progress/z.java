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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class z implements p3d {
    public static final z a;

    @NotNull
    private static final mhp descriptor;

    static {
        z zVar = new z();
        a = zVar;
        j5m j5mVar = new j5m("RadialGradient", zVar, 3);
        j5mVar.k("colors", false);
        j5mVar.k("relativeCenter", false);
        j5mVar.k("relativeRadius", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        w wVar = w.a;
        return new t9f[]{b0.e[0].getValue(), wVar, wVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        y yVar;
        y yVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = b0.e;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            w wVar = w.a;
            yVar = (y) c.z(mhpVar, 1, wVar, null);
            yVar2 = (y) c.z(mhpVar, 2, wVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            y yVar3 = null;
            y yVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                    i2 |= 1;
                } else if (w == 1) {
                    yVar3 = (y) c.z(mhpVar, 1, w.a, yVar3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    yVar4 = (y) c.z(mhpVar, 2, w.a, yVar4);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            yVar = yVar3;
            yVar2 = yVar4;
        }
        c.b(mhpVar);
        return new b0(i, list, yVar, yVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b0 b0Var = (b0) obj;
        l6bVar.getClass();
        b0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) b0.e[0].getValue(), b0Var.b);
        w wVar = w.a;
        c.k(mhpVar, 1, wVar, b0Var.c);
        c.k(mhpVar, 2, wVar, b0Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
