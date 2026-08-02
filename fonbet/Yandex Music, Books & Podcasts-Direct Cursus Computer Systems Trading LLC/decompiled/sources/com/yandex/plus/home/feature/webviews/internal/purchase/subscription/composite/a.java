package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.connectsdk.service.DeviceService;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo.Home", aVar, 3);
        j5mVar.k(DeviceService.KEY_CONFIG, false);
        j5mVar.k("products", false);
        j5mVar.k("error", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = c.d;
        return new t9f[]{ff7.C(com.yandex.plus.home.repository.api.model.webconfig.b.a), arfVarArr[1].getValue(), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        a0 a0Var;
        List list;
        p pVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = c.d;
        a0 a0Var2 = null;
        if (c.m()) {
            a0Var = (a0) c.n(mhpVar, 0, com.yandex.plus.home.repository.api.model.webconfig.b.a, null);
            list = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            pVar = (p) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            p pVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    a0Var2 = (a0) c.n(mhpVar, 0, com.yandex.plus.home.repository.api.model.webconfig.b.a, a0Var2);
                    i2 |= 1;
                } else if (w == 1) {
                    list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    pVar2 = (p) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), pVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            a0Var = a0Var2;
            list = list2;
            pVar = pVar2;
        }
        c.b(mhpVar);
        return new c(i, a0Var, list, pVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c cVar = (c) obj;
        l6bVar.getClass();
        cVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = c.d;
        c.q(mhpVar, 0, com.yandex.plus.home.repository.api.model.webconfig.b.a, cVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), cVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), cVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
