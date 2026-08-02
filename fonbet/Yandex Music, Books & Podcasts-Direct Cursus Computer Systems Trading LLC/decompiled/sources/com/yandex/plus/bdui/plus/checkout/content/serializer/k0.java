package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.c5b;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements p3d {
    public static final k0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.AdditionalOffersDto", k0Var, 5);
        j5mVar.k("offers", true);
        j5mVar.k("eventSessionId", true);
        j5mVar.k("title", true);
        j5mVar.k("passedUpsaleSteps", true);
        j5mVar.k("offerSwitchToggle", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = m0.f;
        tkr tkrVar = tkr.a;
        return new t9f[]{arfVarArr[0].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), arfVarArr[3].getValue(), ff7.C(x0.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        String str;
        String str2;
        List list2;
        z0 z0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m0.f;
        int i2 = 0;
        List list3 = null;
        if (c.m()) {
            List list4 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            tkr tkrVar = tkr.a;
            String str3 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str4 = (String) c.n(mhpVar, 2, tkrVar, null);
            list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            list = list4;
            z0Var = (z0) c.n(mhpVar, 4, x0.a, null);
            str2 = str4;
            i = 31;
            str = str3;
        } else {
            int i3 = 1;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            List list5 = null;
            z0 z0Var2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        str5 = (String) c.n(mhpVar, 1, tkr.a, str5);
                        i4 |= 2;
                    } else if (w == 2) {
                        str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                        i4 |= 4;
                    } else if (w == 3) {
                        list5 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list5);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        z0Var2 = (z0) c.n(mhpVar, 4, x0.a, z0Var2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list3 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list3);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list3;
            str = str5;
            str2 = str6;
            list2 = list5;
            z0Var = z0Var2;
        }
        c.b(mhpVar);
        return new m0(i, list, str, str2, list2, z0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m0 m0Var = (m0) obj;
        l6bVar.getClass();
        m0Var.getClass();
        z0 z0Var = m0Var.e;
        List list = m0Var.d;
        String str = m0Var.c;
        String str2 = m0Var.b;
        List list2 = m0Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = m0.f;
        if (c.e(mhpVar) || !Intrinsics.d(list2, c5b.a)) {
            c.k(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        if (c.e(mhpVar) || z0Var != null) {
            c.q(mhpVar, 4, x0.a, z0Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
