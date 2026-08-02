package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
public final /* synthetic */ class k implements p3d {
    public static final k a;

    @NotNull
    private static final mhp descriptor;

    static {
        k kVar = new k();
        a = kVar;
        j5m j5mVar = new j5m("RADIAL_GRADIENT", kVar, 4);
        j5mVar.k("angle", false);
        j5mVar.k("colors", false);
        j5mVar.k("relativeCenter", false);
        j5mVar.k("relativeRadius", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = m.e;
        v vVar = v.a;
        return new t9f[]{zic.a, arfVarArr[1].getValue(), vVar, vVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        float f;
        int i;
        List list;
        x xVar;
        x xVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m.e;
        if (c.m()) {
            f = c.v(mhpVar, 0);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            v vVar = v.a;
            x xVar3 = (x) c.z(mhpVar, 2, vVar, null);
            list = list2;
            xVar2 = (x) c.z(mhpVar, 3, vVar, null);
            xVar = xVar3;
            i = 15;
        } else {
            f = 0.0f;
            boolean z = true;
            List list3 = null;
            x xVar4 = null;
            x xVar5 = null;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    f = c.v(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else if (w == 2) {
                    xVar4 = (x) c.z(mhpVar, 2, v.a, xVar4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    xVar5 = (x) c.z(mhpVar, 3, v.a, xVar5);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            xVar = xVar4;
            xVar2 = xVar5;
        }
        float f2 = f;
        c.b(mhpVar);
        return new m(i, f2, list, xVar, xVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m mVar = (m) obj;
        l6bVar.getClass();
        mVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = m.e;
        c.F(mhpVar, 0, mVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), mVar.b);
        v vVar = v.a;
        c.k(mhpVar, 2, vVar, mVar.c);
        c.k(mhpVar, 3, vVar, mVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
