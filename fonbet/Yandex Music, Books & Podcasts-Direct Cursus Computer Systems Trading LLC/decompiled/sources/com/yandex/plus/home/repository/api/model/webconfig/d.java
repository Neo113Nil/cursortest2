package com.yandex.plus.home.repository.api.model.webconfig;

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
public final /* synthetic */ class d implements p3d {
    public static final d a;

    @NotNull
    private static final mhp descriptor;

    static {
        d dVar = new d();
        a = dVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.PayButton", dVar, 4);
        j5mVar.k("trialText", false);
        j5mVar.k("noTrialText", false);
        j5mVar.k("textColor", false);
        j5mVar.k("backgroundColor", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = f.e;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), arfVarArr[2].getValue(), ff7.C((t9f) arfVarArr[3].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        com.yandex.plus.core.data.common.v vVar;
        com.yandex.plus.core.data.common.v vVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = f.e;
        String str3 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 1, tkrVar, null);
            com.yandex.plus.core.data.common.v vVar3 = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            vVar2 = (com.yandex.plus.core.data.common.v) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str2 = str5;
            i = 15;
            vVar = vVar3;
            str = str4;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            com.yandex.plus.core.data.common.v vVar4 = null;
            com.yandex.plus.core.data.common.v vVar5 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    str6 = (String) c.n(mhpVar, 1, tkr.a, str6);
                    i2 |= 2;
                } else if (w == 2) {
                    vVar4 = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), vVar4);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    vVar5 = (com.yandex.plus.core.data.common.v) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), vVar5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str6;
            vVar = vVar4;
            vVar2 = vVar5;
        }
        c.b(mhpVar);
        return new f(i, str, str2, vVar, vVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f fVar = (f) obj;
        l6bVar.getClass();
        fVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = f.e;
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, fVar.a);
        c.q(mhpVar, 1, tkrVar, fVar.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), fVar.c);
        c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), fVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
