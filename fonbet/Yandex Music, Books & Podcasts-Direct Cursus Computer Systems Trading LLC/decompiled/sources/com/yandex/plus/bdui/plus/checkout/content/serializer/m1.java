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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements p3d {
    public static final m1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m1 m1Var = new m1();
        a = m1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.PaymentButtonGroupDto", m1Var, 3);
        j5mVar.k("title", false);
        j5mVar.k("paymentButtons", false);
        j5mVar.k("paymentPromoBadges", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o1.d;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        List list;
        List list2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o1.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            list = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            list2 = (List) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            List list4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    list4 = (List) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list4);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            list = list3;
            list2 = list4;
        }
        c.b(mhpVar);
        return new o1(i, str, list, list2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o1 o1Var = (o1) obj;
        l6bVar.getClass();
        o1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o1.d;
        c.p(mhpVar, 0, o1Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), o1Var.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), o1Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
