package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import defpackage.arf;
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
public final /* synthetic */ class k implements p3d {
    public static final k a;

    @NotNull
    private static final mhp descriptor;

    static {
        k kVar = new k();
        a = kVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionProduct", kVar, 1);
        j5mVar.k("offer", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{m.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        com.yandex.plus.pay.adapter.api.j jVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m.b;
        int i = 1;
        com.yandex.plus.pay.adapter.api.j jVar2 = null;
        if (c.m()) {
            jVar = (com.yandex.plus.pay.adapter.api.j) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
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
                    jVar2 = (com.yandex.plus.pay.adapter.api.j) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), jVar2);
                    i2 = 1;
                }
            }
            jVar = jVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new m(i, jVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m mVar = (m) obj;
        l6bVar.getClass();
        mVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) m.b[0].getValue(), mVar.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
