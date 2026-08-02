package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.connectsdk.device.ConnectableDevice;
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
public final /* synthetic */ class v3 implements p3d {
    public static final v3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v3 v3Var = new v3();
        a = v3Var;
        j5m j5mVar = new j5m("OPEN_STORIES", v3Var, 4);
        j5mVar.k("trackId", true);
        j5mVar.k("url", false);
        j5mVar.k(ConnectableDevice.KEY_ID, true);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String g = c.g(mhpVar, 1);
            String str7 = (String) c.n(mhpVar, 2, tkrVar, null);
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            i = 15;
            str3 = str7;
            str2 = g;
            str = str6;
        } else {
            boolean z = true;
            int i2 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                    i2 |= 1;
                } else if (w == 1) {
                    str8 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str9 = (String) c.n(mhpVar, 2, tkr.a, str9);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str10 = (String) c.n(mhpVar, 3, tkr.a, str10);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str5;
            str2 = str8;
            str3 = str9;
            str4 = str10;
        }
        c.b(mhpVar);
        return new x3(i, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x3 x3Var = (x3) obj;
        l6bVar.getClass();
        x3Var.getClass();
        String str = x3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = x3Var.b;
        String str3 = x3Var.d;
        String str4 = x3Var.c;
        c.p(mhpVar, 1, str2);
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 2, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 3, tkr.a, str3);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
