package com.yandex.plus.home.repository.api.model.webconfig;

import defpackage.arf;
import defpackage.eg7;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class s implements p3d {
    public static final s a;

    @NotNull
    private static final mhp descriptor;

    static {
        s sVar = new s();
        a = sVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.Subscription.AcquisitionParams", sVar, 3);
        j5mVar.k(Constants.KEY_PAGE, false);
        j5mVar.k("places", false);
        j5mVar.k("restrictions", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = u.d;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Set set;
        Map map;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            set = (Set) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            map = (Map) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Set set2 = null;
            Map map2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    set2 = (Set) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), set2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    map2 = (Map) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), map2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            set = set2;
            map = map2;
        }
        c.b(mhpVar);
        return new u(i, str, set, map);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u uVar = (u) obj;
        l6bVar.getClass();
        uVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = u.d;
        c.p(mhpVar, 0, uVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), uVar.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), uVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
