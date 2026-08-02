package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.n9a;
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
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGeoLocationDto", aVar, 3);
        j5mVar.k("latitude", false);
        j5mVar.k("longitude", false);
        j5mVar.k("accuracy", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        n9a n9aVar = n9a.a;
        return new t9f[]{n9aVar, n9aVar, ff7.C(n9aVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Double d;
        double d2;
        double d3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Double d4 = null;
        if (c.m()) {
            double F = c.F(mhpVar, 0);
            double F2 = c.F(mhpVar, 1);
            d = (Double) c.n(mhpVar, 2, n9a.a, null);
            i = 7;
            d2 = F2;
            d3 = F;
        } else {
            double d5 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d6 = 0.0d;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    d6 = c.F(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    d5 = c.F(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    d4 = (Double) c.n(mhpVar, 2, n9a.a, d4);
                    i2 |= 4;
                }
            }
            i = i2;
            d = d4;
            d2 = d5;
            d3 = d6;
        }
        c.b(mhpVar);
        return new c(i, d3, d2, d);
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
        c.l(mhpVar, 0, cVar.a);
        c.l(mhpVar, 1, cVar.b);
        c.q(mhpVar, 2, n9a.a, cVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
