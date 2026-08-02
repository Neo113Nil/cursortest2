package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.connectsdk.device.ConnectableDevice;
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
public final /* synthetic */ class a4 implements p3d {
    public static final a4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a4 a4Var = new a4();
        a = a4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage.OpenStoriesList.StoryUrl", a4Var, 4);
        j5mVar.k("url", false);
        j5mVar.k("active", false);
        j5mVar.k("data", true);
        j5mVar.k(ConnectableDevice.KEY_ID, true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, oc3.a, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 2, tkrVar, null);
            str = g;
            str3 = (String) c.n(mhpVar, 3, tkrVar, null);
            str2 = str4;
            z = D;
            i = 15;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    z3 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str7 = (String) c.n(mhpVar, 3, tkr.a, str7);
                    i2 |= 8;
                }
            }
            z = z3;
            i = i2;
            str = str5;
            str2 = str6;
            str3 = str7;
        }
        c.b(mhpVar);
        return new c4(i, str, str2, str3, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c4 c4Var = (c4) obj;
        l6bVar.getClass();
        c4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = c4Var.a;
        String str2 = c4Var.d;
        String str3 = c4Var.c;
        c.p(mhpVar, 0, str);
        c.j(mhpVar, 1, c4Var.b);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 2, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 3, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
