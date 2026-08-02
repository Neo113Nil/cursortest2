package com.yandex.passport.sloth.command.data;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import defpackage.zic;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements p3d {
    public static final x0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        x0 x0Var = new x0();
        a = x0Var;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.SetPopupSizeData", x0Var, 6);
        j5mVar.k("mode", false);
        j5mVar.k("corner_radius", false);
        j5mVar.k("horizontal_margins", false);
        j5mVar.k("vertical_margins", false);
        j5mVar.k(CameraProperty.HEIGHT, false);
        j5mVar.k("animate", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(tkr.a);
        zic zicVar = zic.a;
        return new t9f[]{C, ff7.C(zicVar), ff7.C(zicVar), ff7.C(zicVar), ff7.C(zicVar), oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 5;
        if (c.m()) {
            String str2 = (String) c.n(mhpVar, 0, tkr.a, null);
            zic zicVar = zic.a;
            Float f5 = (Float) c.n(mhpVar, 1, zicVar, null);
            Float f6 = (Float) c.n(mhpVar, 2, zicVar, null);
            Float f7 = (Float) c.n(mhpVar, 3, zicVar, null);
            Float f8 = (Float) c.n(mhpVar, 4, zicVar, null);
            str = str2;
            z = c.D(mhpVar, 5);
            f3 = f7;
            f4 = f8;
            f2 = f6;
            f = f5;
            i = 63;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str3 = null;
            Float f9 = null;
            Float f10 = null;
            Float f11 = null;
            Float f12 = null;
            int i3 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                        i3 |= 1;
                        break;
                    case 1:
                        f9 = (Float) c.n(mhpVar, 1, zic.a, f9);
                        i3 |= 2;
                        break;
                    case 2:
                        f10 = (Float) c.n(mhpVar, 2, zic.a, f10);
                        i3 |= 4;
                        break;
                    case 3:
                        f11 = (Float) c.n(mhpVar, 3, zic.a, f11);
                        i3 |= 8;
                        break;
                    case 4:
                        f12 = (Float) c.n(mhpVar, 4, zic.a, f12);
                        i3 |= 16;
                        break;
                    case 5:
                        z3 = c.D(mhpVar, i2);
                        i3 |= 32;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 5;
            }
            z = z3;
            i = i3;
            str = str3;
            f = f9;
            f2 = f10;
            f3 = f11;
            f4 = f12;
        }
        c.b(mhpVar);
        return new z0(i, str, f, f2, f3, f4, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z0 z0Var = (z0) obj;
        l6bVar.getClass();
        z0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        String str = z0Var.a;
        boolean z = z0Var.f;
        c.q(mhpVar, 0, tkrVar, str);
        zic zicVar = zic.a;
        c.q(mhpVar, 1, zicVar, z0Var.b);
        c.q(mhpVar, 2, zicVar, z0Var.c);
        c.q(mhpVar, 3, zicVar, z0Var.d);
        c.q(mhpVar, 4, zicVar, z0Var.e);
        if (c.e(mhpVar) || !z) {
            c.j(mhpVar, 5, z);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
