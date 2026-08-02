package com.yandex.plus.bdui.plus.content.serializer;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements p3d {
    public static final n0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n0 n0Var = new n0();
        a = n0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusDivContentSerializer.LogActionsDto", n0Var, 5);
        j5mVar.k("logClick", false);
        j5mVar.k("logViewShown", false);
        j5mVar.k("logViewDisappeared", false);
        j5mVar.k("logFocusAcquired", false);
        j5mVar.k("logFocusLost", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = p0.f;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), ff7.C((t9f) arfVarArr[1].getValue()), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue()), ff7.C((t9f) arfVarArr[4].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.action.a aVar2;
        com.yandex.plus.bdui.action.a aVar3;
        com.yandex.plus.bdui.action.a aVar4;
        com.yandex.plus.bdui.action.a aVar5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = p0.f;
        int i2 = 0;
        com.yandex.plus.bdui.action.a aVar6 = null;
        if (c.m()) {
            com.yandex.plus.bdui.action.a aVar7 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            com.yandex.plus.bdui.action.a aVar8 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.bdui.action.a aVar9 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            com.yandex.plus.bdui.action.a aVar10 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            aVar5 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            aVar = aVar7;
            aVar4 = aVar10;
            i = 31;
            aVar3 = aVar9;
            aVar2 = aVar8;
        } else {
            int i3 = 1;
            int i4 = 0;
            com.yandex.plus.bdui.action.a aVar11 = null;
            com.yandex.plus.bdui.action.a aVar12 = null;
            com.yandex.plus.bdui.action.a aVar13 = null;
            com.yandex.plus.bdui.action.a aVar14 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        aVar11 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar11);
                        i4 |= 2;
                    } else if (w == 2) {
                        aVar12 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), aVar12);
                        i4 |= 4;
                    } else if (w == 3) {
                        aVar13 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), aVar13);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        aVar14 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), aVar14);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    aVar6 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), aVar6);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            aVar = aVar6;
            aVar2 = aVar11;
            aVar3 = aVar12;
            aVar4 = aVar13;
            aVar5 = aVar14;
        }
        c.b(mhpVar);
        return new p0(i, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p0 p0Var = (p0) obj;
        l6bVar.getClass();
        p0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = p0.f;
        c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), p0Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), p0Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), p0Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), p0Var.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), p0Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
