package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

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
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.dto.ColorDto.ColorGradientStop", aVar, 2);
        j5mVar.k("color", false);
        j5mVar.k(SSDPDeviceDescriptionParser.TAG_LOCATION, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{n.a, n9a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        p pVar;
        int i;
        double d;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            pVar = (p) c.z(mhpVar, 0, n.a, null);
            d = c.F(mhpVar, 1);
            i = 3;
        } else {
            double d2 = 0.0d;
            boolean z = true;
            pVar = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    pVar = (p) c.z(mhpVar, 0, n.a, pVar);
                    i |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    d2 = c.F(mhpVar, 1);
                    i |= 2;
                }
            }
            d = d2;
        }
        c.b(mhpVar);
        return new c(i, pVar, d);
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
        c.k(mhpVar, 0, n.a, cVar.a);
        c.l(mhpVar, 1, cVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
