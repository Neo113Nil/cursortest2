package com.yandex.plus.pay.data.acquisition.dto;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class o0 implements p3d {
    public static final o0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o0 o0Var = new o0();
        a = o0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto.SmartOffer.Legals", o0Var, 3);
        j5mVar.k("oneClickDisclaimer", true);
        j5mVar.k("text", false);
        j5mVar.k("items", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = w0.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = w0.d;
        String str3 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            str2 = c.g(mhpVar, 1);
            list = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            list = list2;
        }
        c.b(mhpVar);
        return new w0(i, str, str2, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w0 w0Var = (w0) obj;
        l6bVar.getClass();
        w0Var.getClass();
        String str = w0Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = w0.d;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = w0Var.b;
        List list = w0Var.c;
        c.p(mhpVar, 1, str2);
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
