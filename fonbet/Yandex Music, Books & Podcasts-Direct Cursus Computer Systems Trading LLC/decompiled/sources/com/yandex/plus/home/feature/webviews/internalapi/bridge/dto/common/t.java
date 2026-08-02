package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.connectsdk.device.ConnectableDevice;
import defpackage.arf;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto.Details", tVar, 8);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("productType", false);
        j5mVar.k("offerText", false);
        j5mVar.k("offerSubText", false);
        j5mVar.k("commonPeriod", false);
        j5mVar.k("trialPeriod", false);
        j5mVar.k("introPeriod", false);
        j5mVar.k("family", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = d0.i;
        tkr tkrVar = tkr.a;
        v vVar = v.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), vVar, ff7.C(vVar), ff7.C(vVar), oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        x xVar;
        x xVar2;
        x xVar3;
        String str;
        int i;
        String str2;
        c0 c0Var;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = d0.i;
        int i2 = 7;
        int i3 = 6;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            c0 c0Var2 = (c0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 3, tkrVar, null);
            v vVar = v.a;
            x xVar4 = (x) c.z(mhpVar, 4, vVar, null);
            x xVar5 = (x) c.n(mhpVar, 5, vVar, null);
            x xVar6 = (x) c.n(mhpVar, 6, vVar, null);
            c0Var = c0Var2;
            str2 = g;
            z = c.D(mhpVar, 7);
            xVar = xVar6;
            xVar2 = xVar5;
            str = str5;
            xVar3 = xVar4;
            str3 = str4;
            i = 255;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            x xVar7 = null;
            x xVar8 = null;
            x xVar9 = null;
            String str6 = null;
            c0 c0Var3 = null;
            String str7 = null;
            int i4 = 0;
            String str8 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                    case 0:
                        str6 = c.g(mhpVar, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        c0Var3 = (c0) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), c0Var3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        str7 = (String) c.n(mhpVar, 2, tkr.a, str7);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        str8 = (String) c.n(mhpVar, 3, tkr.a, str8);
                        i4 |= 8;
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        xVar9 = (x) c.z(mhpVar, 4, v.a, xVar9);
                        i4 |= 16;
                        i2 = 7;
                    case 5:
                        xVar8 = (x) c.n(mhpVar, 5, v.a, xVar8);
                        i4 |= 32;
                        i2 = 7;
                    case 6:
                        xVar7 = (x) c.n(mhpVar, i3, v.a, xVar7);
                        i4 |= 64;
                        i2 = 7;
                    case 7:
                        z3 = c.D(mhpVar, i2);
                        i4 |= 128;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z3;
            xVar = xVar7;
            xVar2 = xVar8;
            xVar3 = xVar9;
            str = str8;
            i = i4;
            str2 = str6;
            c0Var = c0Var3;
            str3 = str7;
        }
        c.b(mhpVar);
        return new d0(i, str2, c0Var, str3, str, xVar3, xVar2, xVar, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = d0.i;
        c.p(mhpVar, 0, d0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), d0Var.b);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 2, tkrVar, d0Var.c);
        c.q(mhpVar, 3, tkrVar, d0Var.d);
        v vVar = v.a;
        c.k(mhpVar, 4, vVar, d0Var.e);
        c.q(mhpVar, 5, vVar, d0Var.f);
        c.q(mhpVar, 6, vVar, d0Var.g);
        c.j(mhpVar, 7, d0Var.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
