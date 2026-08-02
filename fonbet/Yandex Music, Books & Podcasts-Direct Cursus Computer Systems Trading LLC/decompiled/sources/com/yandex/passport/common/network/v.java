package com.yandex.passport.common.network;

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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements p3d {
    public static final v a;

    @NotNull
    private static final mhp descriptor;

    static {
        v vVar = new v();
        a = vVar;
        j5m j5mVar = new j5m("com.yandex.passport.common.network.ResponseError.MultipleErrorResponse", vVar, 4);
        j5mVar.k("error", true);
        j5mVar.k("errors", true);
        j5mVar.k("error_description", true);
        j5mVar.k(CommonUrlParts.REQUEST_ID, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = x.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C((t9f) arfVarArr[0].getValue()), arfVarArr[1].getValue(), ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        BackendError backendError;
        List list;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x.e;
        BackendError backendError2 = null;
        if (c.m()) {
            BackendError backendError3 = (BackendError) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            tkr tkrVar = tkr.a;
            String str3 = (String) c.n(mhpVar, 2, tkrVar, null);
            list = list2;
            backendError = backendError3;
            str2 = (String) c.n(mhpVar, 3, tkrVar, null);
            str = str3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            String str4 = null;
            String str5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    backendError2 = (BackendError) c.n(mhpVar, 0, (t9f) arfVarArr[0].getValue(), backendError2);
                    i2 |= 1;
                } else if (w == 1) {
                    list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                    i2 |= 2;
                } else if (w == 2) {
                    str4 = (String) c.n(mhpVar, 2, tkr.a, str4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str5 = (String) c.n(mhpVar, 3, tkr.a, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            backendError = backendError2;
            list = list3;
            str = str4;
            str2 = str5;
        }
        c.b(mhpVar);
        return new x(i, backendError, list, str, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x xVar = (x) obj;
        l6bVar.getClass();
        xVar.getClass();
        String str = xVar.d;
        String str2 = xVar.c;
        List list = xVar.b;
        BackendError backendError = xVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x.e;
        if (c.e(mhpVar) || backendError != null) {
            c.q(mhpVar, 0, (t9f) arfVarArr[0].getValue(), backendError);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 3, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
