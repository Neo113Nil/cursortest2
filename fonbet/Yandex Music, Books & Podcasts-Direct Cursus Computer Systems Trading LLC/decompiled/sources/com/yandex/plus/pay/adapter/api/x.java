package com.yandex.plus.pay.adapter.api;

import defpackage.eg7;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class x implements p3d {
    public static final x a;

    @NotNull
    private static final mhp descriptor;

    static {
        x xVar = new x();
        a = xVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.PaymentFlowErrorReason.PaymentMethodSelection", xVar, 1);
        j5mVar.k("errorState", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{com.yandex.plus.core.data.pay.i.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.plus.core.data.pay.k kVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        com.yandex.plus.core.data.pay.k kVar2 = null;
        if (c.m()) {
            kVar = (com.yandex.plus.core.data.pay.k) c.z(mhpVar, 0, com.yandex.plus.core.data.pay.i.a, null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    kVar2 = (com.yandex.plus.core.data.pay.k) c.z(mhpVar, 0, com.yandex.plus.core.data.pay.i.a, kVar2);
                    i2 = 1;
                }
            }
            kVar = kVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new z(i, kVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z zVar = (z) obj;
        l6bVar.getClass();
        zVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, com.yandex.plus.core.data.pay.i.a, zVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
