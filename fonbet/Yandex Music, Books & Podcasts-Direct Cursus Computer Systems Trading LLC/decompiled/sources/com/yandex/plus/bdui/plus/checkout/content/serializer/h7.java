package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
public final /* synthetic */ class h7 implements p3d {
    public static final h7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        h7 h7Var = new h7();
        a = h7Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUpsaleContentSerializer.ActionsDto", h7Var, 4);
        j5mVar.k("accept", false);
        j5mVar.k("reject", false);
        j5mVar.k("onLegalTextShown", false);
        j5mVar.k("back", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = j7.e;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.action.a aVar2;
        com.yandex.plus.bdui.action.a aVar3;
        com.yandex.plus.bdui.action.a aVar4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = j7.e;
        com.yandex.plus.bdui.action.a aVar5 = null;
        if (c.m()) {
            com.yandex.plus.bdui.action.a aVar6 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            com.yandex.plus.bdui.action.a aVar7 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.bdui.action.a aVar8 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            aVar4 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            aVar = aVar6;
            i = 15;
            aVar3 = aVar8;
            aVar2 = aVar7;
        } else {
            boolean z = true;
            int i2 = 0;
            com.yandex.plus.bdui.action.a aVar9 = null;
            com.yandex.plus.bdui.action.a aVar10 = null;
            com.yandex.plus.bdui.action.a aVar11 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    aVar5 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), aVar5);
                    i2 |= 1;
                } else if (w == 1) {
                    aVar9 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), aVar9);
                    i2 |= 2;
                } else if (w == 2) {
                    aVar10 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), aVar10);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    aVar11 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), aVar11);
                    i2 |= 8;
                }
            }
            i = i2;
            aVar = aVar5;
            aVar2 = aVar9;
            aVar3 = aVar10;
            aVar4 = aVar11;
        }
        c.b(mhpVar);
        return new j7(i, aVar, aVar2, aVar3, aVar4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j7 j7Var = (j7) obj;
        l6bVar.getClass();
        j7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = j7.e;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), j7Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), j7Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), j7Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), j7Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
