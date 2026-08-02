package com.yandex.passport.data.network;

import com.yandex.passport.common.network.BackendError;
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
public final /* synthetic */ class p6 implements p3d {
    public static final p6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p6 p6Var = new p6();
        a = p6Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetDeviceCodeRequest.ErrorResult", p6Var, 2);
        j5mVar.k("error", false);
        j5mVar.k(CommonUrlParts.REQUEST_ID, true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{r6.c[0].getValue(), ff7.C(tkr.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        BackendError backendError;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r6.c;
        BackendError backendError2 = null;
        if (c.m()) {
            backendError = (BackendError) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            str = (String) c.n(mhpVar, 1, tkr.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    backendError2 = (BackendError) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), backendError2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = (String) c.n(mhpVar, 1, tkr.a, str2);
                    i2 |= 2;
                }
            }
            i = i2;
            backendError = backendError2;
            str = str2;
        }
        c.b(mhpVar);
        return new r6(i, backendError, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r6 r6Var = (r6) obj;
        l6bVar.getClass();
        r6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) r6.c[0].getValue();
        BackendError backendError = r6Var.a;
        String str = r6Var.b;
        c.k(mhpVar, 0, t9fVar, backendError);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 1, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
