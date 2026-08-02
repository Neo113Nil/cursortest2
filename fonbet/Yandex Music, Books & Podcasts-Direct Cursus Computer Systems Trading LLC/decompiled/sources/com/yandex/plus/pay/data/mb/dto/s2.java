package com.yandex.plus.pay.data.mb.dto;

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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class s2 implements p3d {
    public static final s2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s2 s2Var = new s2();
        a = s2Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.PaymentSubmitResultDto", s2Var, 3);
        j5mVar.k("invoiceId", true);
        j5mVar.k("status", true);
        j5mVar.k("statusCode", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = v2.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        u2 u2Var;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v2.d;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            str = (String) c.n(mhpVar, 0, tkrVar, null);
            u2Var = (u2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            str2 = (String) c.n(mhpVar, 2, tkrVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            u2 u2Var2 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    u2Var2 = (u2) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), u2Var2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str4 = (String) c.n(mhpVar, 2, tkr.a, str4);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            u2Var = u2Var2;
            str2 = str4;
        }
        c.b(mhpVar);
        return new v2(i, str, u2Var, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v2 v2Var = (v2) obj;
        l6bVar.getClass();
        v2Var.getClass();
        String str = v2Var.c;
        u2 u2Var = v2Var.b;
        String str2 = v2Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v2.d;
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 0, tkr.a, str2);
        }
        if (c.e(mhpVar) || u2Var != u2.a) {
            c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), u2Var);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
