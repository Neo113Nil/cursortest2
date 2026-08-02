package com.yandex.plus.pay.repository.api.model.widget;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.repository.api.model.widget.WebPaymentWidgetTimeoutParams", aVar, 2);
        j5mVar.k("loadMessageTimeoutMillis", false);
        j5mVar.k("startMessageTimeoutMillis", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        mvg mvgVar = mvg.a;
        return new t9f[]{ff7.C(mvgVar), ff7.C(mvgVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Long l;
        Long l2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Long l3 = null;
        if (c.m()) {
            mvg mvgVar = mvg.a;
            l = (Long) c.n(mhpVar, 0, mvgVar, null);
            l2 = (Long) c.n(mhpVar, 1, mvgVar, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Long l4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    l3 = (Long) c.n(mhpVar, 0, mvg.a, l3);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    l4 = (Long) c.n(mhpVar, 1, mvg.a, l4);
                    i2 |= 2;
                }
            }
            i = i2;
            l = l3;
            l2 = l4;
        }
        c.b(mhpVar);
        return new c(i, l, l2);
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
        mvg mvgVar = mvg.a;
        c.q(mhpVar, 0, mvgVar, cVar.a);
        c.q(mhpVar, 1, mvgVar, cVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
