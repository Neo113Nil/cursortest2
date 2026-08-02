package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.NetcastTVService;
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
public final /* synthetic */ class b5 implements p3d {
    public static final b5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b5 b5Var = new b5();
        a = b5Var;
        j5m j5mVar = new j5m("SEND_BROADCAST_EVENT", b5Var, 4);
        j5mVar.k("trackId", true);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k(NetcastTVService.UDAP_API_EVENT, false);
        j5mVar.k("params", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, tkrVar, ff7.C(tkrVar)};
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
            String g2 = c.g(mhpVar, 2);
            str4 = (String) c.n(mhpVar, 3, tkrVar, null);
            i = 15;
            str3 = g2;
            str2 = g;
            str = str6;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                    i2 |= 1;
                } else if (w == 1) {
                    str7 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str8 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str9 = (String) c.n(mhpVar, 3, tkr.a, str9);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str5;
            str2 = str7;
            str3 = str8;
            str4 = str9;
        }
        c.b(mhpVar);
        return new d5(i, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d5 d5Var = (d5) obj;
        l6bVar.getClass();
        d5Var.getClass();
        String str = d5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = d5Var.b;
        String str3 = d5Var.d;
        c.p(mhpVar, 1, str2);
        c.p(mhpVar, 2, d5Var.c);
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
