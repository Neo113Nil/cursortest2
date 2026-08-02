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
public final /* synthetic */ class e0 implements p3d {
    public static final e0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.ActionsDto", e0Var, 7);
        j5mVar.k("next", false);
        j5mVar.k("close", false);
        j5mVar.k("onLegalTextShown", false);
        j5mVar.k("onPaymentMethodClick", false);
        j5mVar.k("onOfferSwitchClick", false);
        j5mVar.k("onAdditionalOfferSelectedChange", false);
        j5mVar.k("back", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g0.h;
        return new t9f[]{arfVarArr[0].getValue(), arfVarArr[1].getValue(), ff7.C((t9f) arfVarArr[2].getValue()), ff7.C((t9f) arfVarArr[3].getValue()), ff7.C((t9f) arfVarArr[4].getValue()), ff7.C((t9f) arfVarArr[5].getValue()), ff7.C((t9f) arfVarArr[6].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        com.yandex.plus.bdui.action.a aVar;
        com.yandex.plus.bdui.action.a aVar2;
        com.yandex.plus.bdui.action.a aVar3;
        com.yandex.plus.bdui.action.a aVar4;
        com.yandex.plus.bdui.action.a aVar5;
        com.yandex.plus.bdui.action.a aVar6;
        com.yandex.plus.bdui.action.a aVar7;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g0.h;
        int i3 = 6;
        int i4 = 2;
        com.yandex.plus.bdui.action.a aVar8 = null;
        if (c.m()) {
            com.yandex.plus.bdui.action.a aVar9 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            com.yandex.plus.bdui.action.a aVar10 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            com.yandex.plus.bdui.action.a aVar11 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            com.yandex.plus.bdui.action.a aVar12 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            com.yandex.plus.bdui.action.a aVar13 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            com.yandex.plus.bdui.action.a aVar14 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            aVar = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            aVar3 = aVar9;
            i = 127;
            aVar2 = aVar14;
            aVar6 = aVar12;
            aVar7 = aVar13;
            aVar5 = aVar11;
            aVar4 = aVar10;
        } else {
            int i5 = 1;
            boolean z = true;
            int i6 = 0;
            com.yandex.plus.bdui.action.a aVar15 = null;
            com.yandex.plus.bdui.action.a aVar16 = null;
            com.yandex.plus.bdui.action.a aVar17 = null;
            com.yandex.plus.bdui.action.a aVar18 = null;
            com.yandex.plus.bdui.action.a aVar19 = null;
            com.yandex.plus.bdui.action.a aVar20 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i5 = 1;
                    case 0:
                        aVar8 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), aVar8);
                        i6 |= 1;
                        i3 = 6;
                        i4 = 2;
                        i5 = 1;
                    case 1:
                        aVar17 = (com.yandex.plus.bdui.action.a) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), aVar17);
                        i6 |= 2;
                        i3 = 6;
                        i4 = 2;
                    case 2:
                        int i7 = i4;
                        aVar18 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, i7, (t9f) arfVarArr[i7].getValue(), aVar18);
                        i6 |= 4;
                        i4 = i7;
                        i3 = 6;
                    case 3:
                        i2 = i4;
                        aVar19 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), aVar19);
                        i6 |= 8;
                        i4 = i2;
                    case 4:
                        i2 = i4;
                        aVar20 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), aVar20);
                        i6 |= 16;
                        i4 = i2;
                    case 5:
                        i2 = i4;
                        aVar16 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), aVar16);
                        i6 |= 32;
                        i4 = i2;
                    case 6:
                        i2 = i4;
                        aVar15 = (com.yandex.plus.bdui.action.a) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), aVar15);
                        i6 |= 64;
                        i4 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i6;
            aVar = aVar15;
            aVar2 = aVar16;
            aVar3 = aVar8;
            aVar4 = aVar17;
            aVar5 = aVar18;
            aVar6 = aVar19;
            aVar7 = aVar20;
        }
        c.b(mhpVar);
        return new g0(i, aVar3, aVar4, aVar5, aVar6, aVar7, aVar2, aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g0 g0Var = (g0) obj;
        l6bVar.getClass();
        g0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g0.h;
        c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), g0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), g0Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), g0Var.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), g0Var.d);
        c.q(mhpVar, 4, (t9f) arfVarArr[4].getValue(), g0Var.e);
        c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), g0Var.f);
        c.q(mhpVar, 6, (t9f) arfVarArr[6].getValue(), g0Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
