package com.yandex.passport.common.network;

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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements p3d {
    public static final b0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        j5m j5mVar = new j5m("com.yandex.passport.common.network.ResponseError.SingleErrorResponse", b0Var, 3);
        j5mVar.k("error", false);
        j5mVar.k("error_description", true);
        j5mVar.k(CommonUrlParts.REQUEST_ID, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{d0.d[0].getValue(), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        BackendError backendError;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d0.d;
        BackendError backendError2 = null;
        if (c.m()) {
            backendError = (BackendError) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            tkr tkrVar = tkr.a;
            str = (String) c.n(mhpVar, 1, tkrVar, null);
            str2 = (String) c.n(mhpVar, 2, tkrVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    backendError2 = (BackendError) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), backendError2);
                    i2 |= 1;
                } else if (w == 1) {
                    str3 = (String) c.n(mhpVar, 1, tkr.a, str3);
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
            backendError = backendError2;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new d0(i, backendError, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) d0.d[0].getValue();
        BackendError backendError = d0Var.a;
        String str = d0Var.c;
        String str2 = d0Var.b;
        c.k(mhpVar, 0, t9fVar, backendError);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
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
