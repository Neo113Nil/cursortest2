package com.yandex.plus.core.data.pay;

import defpackage.cqe;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p3d {
    public static final i a;

    @NotNull
    private static final mhp descriptor;

    static {
        i iVar = new i();
        a = iVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState.Error", iVar, 5);
        j5mVar.k(Constants.KEY_MESSAGE, false);
        j5mVar.k("code", false);
        j5mVar.k("status", false);
        j5mVar.k("kind", false);
        j5mVar.k("trigger", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(cqe.a), ff7.C(tkrVar), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            Integer num2 = (Integer) c.n(mhpVar, 1, cqe.a, null);
            String str6 = (String) c.n(mhpVar, 2, tkr.a, null);
            str = g;
            str3 = c.g(mhpVar, 3);
            str4 = c.g(mhpVar, 4);
            str2 = str6;
            num = num2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Integer num3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    num3 = (Integer) c.n(mhpVar, 1, cqe.a, num3);
                    i2 |= 2;
                } else if (w == 2) {
                    str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                    i2 |= 4;
                } else if (w == 3) {
                    str8 = c.g(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str9 = c.g(mhpVar, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            num = num3;
            str2 = str7;
            str3 = str8;
            str4 = str9;
        }
        c.b(mhpVar);
        return new k(i, num, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        k kVar = (k) obj;
        l6bVar.getClass();
        kVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, kVar.a);
        c.q(mhpVar, 1, cqe.a, kVar.b);
        c.q(mhpVar, 2, tkr.a, kVar.c);
        c.p(mhpVar, 3, kVar.d);
        c.p(mhpVar, 4, kVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
