package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b1 implements p3d {
    public static final b1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b1 b1Var = new b1();
        a = b1Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.plaque.repository.graphql.cache.dto.ItemDto.Image", b1Var, 6);
        j5mVar.k("color", false);
        j5mVar.k("metaColor", false);
        j5mVar.k("verticalAlignment", false);
        j5mVar.k("imageTag", false);
        j5mVar.k(CameraProperty.WIDTH, false);
        j5mVar.k(CameraProperty.HEIGHT, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        t9f C2 = ff7.C(tkrVar);
        t9f C3 = ff7.C(tkrVar);
        cqe cqeVar = cqe.a;
        return new t9f[]{C, C2, C3, tkrVar, ff7.C(cqeVar), ff7.C(cqeVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 5;
        boolean z = false;
        String str5 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            String g = c.g(mhpVar, 3);
            cqe cqeVar = cqe.a;
            Integer num3 = (Integer) c.n(mhpVar, 4, cqeVar, null);
            str3 = str8;
            num2 = (Integer) c.n(mhpVar, 5, cqeVar, null);
            str4 = g;
            num = num3;
            i = 63;
            str2 = str7;
            str = str6;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Integer num4 = null;
            Integer num5 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = z;
                        i2 = 5;
                    case 0:
                        str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                        i3 |= 1;
                        z = false;
                        i2 = 5;
                    case 1:
                        str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                        i3 |= 2;
                        z = false;
                    case 2:
                        str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                        i3 |= 4;
                        z = false;
                    case 3:
                        str11 = c.g(mhpVar, 3);
                        i3 |= 8;
                        z = false;
                    case 4:
                        num4 = (Integer) c.n(mhpVar, 4, cqe.a, num4);
                        i3 |= 16;
                        z = false;
                    case 5:
                        num5 = (Integer) c.n(mhpVar, i2, cqe.a, num5);
                        i3 |= 32;
                        z = false;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            num = num4;
            num2 = num5;
        }
        c.b(mhpVar);
        return new d1(i, str, str2, str3, str4, num, num2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d1 d1Var = (d1) obj;
        l6bVar.getClass();
        d1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, d1Var.a);
        c.q(mhpVar, 1, tkrVar, d1Var.b);
        c.q(mhpVar, 2, tkrVar, d1Var.c);
        c.p(mhpVar, 3, d1Var.d);
        cqe cqeVar = cqe.a;
        c.q(mhpVar, 4, cqeVar, d1Var.e);
        c.q(mhpVar, 5, cqeVar, d1Var.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
