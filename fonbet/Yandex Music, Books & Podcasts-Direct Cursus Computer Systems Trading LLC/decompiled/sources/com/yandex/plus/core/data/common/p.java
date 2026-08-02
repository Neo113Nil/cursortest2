package com.yandex.plus.core.data.common;

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
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements p3d {
    public static final p a;

    @NotNull
    private static final mhp descriptor;

    static {
        p pVar = new p();
        a = pVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.data.common.PlusGradient.Radial", pVar, 4);
        j5mVar.k("colors", false);
        j5mVar.k("positions", false);
        j5mVar.k("radius", false);
        j5mVar.k("center", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = r.f;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), arfVarArr[2].getValue(), arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        List list2;
        Pair pair;
        Pair pair2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r.f;
        List list3 = null;
        if (c.m()) {
            List list4 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list5 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            Pair pair3 = (Pair) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            pair2 = (Pair) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            list = list4;
            i = 15;
            pair = pair3;
            list2 = list5;
        } else {
            boolean z = true;
            int i2 = 0;
            List list6 = null;
            Pair pair4 = null;
            Pair pair5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list3);
                    i2 |= 1;
                } else if (w == 1) {
                    list6 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list6);
                    i2 |= 2;
                } else if (w == 2) {
                    pair4 = (Pair) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), pair4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    pair5 = (Pair) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), pair5);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            list2 = list6;
            pair = pair4;
            pair2 = pair5;
        }
        c.b(mhpVar);
        return new r(i, list, list2, pair, pair2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r rVar = (r) obj;
        l6bVar.getClass();
        rVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = r.f;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), rVar.b);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), rVar.c);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), rVar.d);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), rVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
