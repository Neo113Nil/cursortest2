package com.yandex.plus.core.graphql.gradient;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.n9a;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.core.graphql.gradient.GradientColorResponse", aVar, 3);
        j5mVar.k("hex", false);
        j5mVar.k("a", false);
        j5mVar.k(SSDPDeviceDescriptionParser.TAG_LOCATION, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        n9a n9aVar = n9a.a;
        return new t9f[]{tkr.a, n9aVar, n9aVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        double d;
        double d2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            i = 7;
            d = c.F(mhpVar, 1);
            d2 = c.F(mhpVar, 2);
        } else {
            str = null;
            boolean z = true;
            double d3 = 0.0d;
            int i2 = 0;
            double d4 = 0.0d;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    d4 = c.F(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    d3 = c.F(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            d = d4;
            d2 = d3;
        }
        String str2 = str;
        c.b(mhpVar);
        return new c(i, str2, d, d2);
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
        c.p(mhpVar, 0, cVar.a);
        c.l(mhpVar, 1, cVar.b);
        c.l(mhpVar, 2, cVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
