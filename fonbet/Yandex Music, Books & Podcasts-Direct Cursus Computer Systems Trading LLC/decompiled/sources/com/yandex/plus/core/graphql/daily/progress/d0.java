package com.yandex.plus.core.graphql.daily.progress;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements p3d {
    public static final d0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        j5m j5mVar = new j5m("com.yandex.plus.core.graphql.daily.progress.ProgressReplacer", d0Var, 8);
        j5mVar.k("type", false);
        j5mVar.k(ConnectableDevice.KEY_ID, true);
        j5mVar.k("url", true);
        j5mVar.k("fallbackText", true);
        j5mVar.k("text", true);
        j5mVar.k("textColor", true);
        j5mVar.k("isBold", true);
        j5mVar.k("isItalic", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{h0.i[0].getValue(), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(oc3Var), ff7.C(oc3Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        g0 g0Var;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = h0.i;
        int i2 = 7;
        char c2 = 4;
        g0 g0Var2 = null;
        if (c.m()) {
            g0 g0Var3 = (g0) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 3, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 4, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 5, tkrVar, null);
            oc3 oc3Var = oc3.a;
            Boolean bool3 = (Boolean) c.n(mhpVar, 6, oc3Var, null);
            g0Var = g0Var3;
            str = str10;
            bool = (Boolean) c.n(mhpVar, 7, oc3Var, null);
            bool2 = bool3;
            i = 255;
            str5 = str8;
            str2 = str9;
            str4 = str7;
            str3 = str6;
        } else {
            boolean z = true;
            int i3 = 0;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        g0Var2 = (g0) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), g0Var2);
                        i3 |= 1;
                        i2 = 7;
                        c2 = 4;
                    case 1:
                        str13 = (String) c.n(mhpVar, 1, tkr.a, str13);
                        i3 |= 2;
                        i2 = 7;
                        c2 = 4;
                    case 2:
                        str14 = (String) c.n(mhpVar, 2, tkr.a, str14);
                        i3 |= 4;
                        i2 = 7;
                        c2 = 4;
                    case 3:
                        str15 = (String) c.n(mhpVar, 3, tkr.a, str15);
                        i3 |= 8;
                        i2 = 7;
                        c2 = 4;
                    case 4:
                        str12 = (String) c.n(mhpVar, 4, tkr.a, str12);
                        i3 |= 16;
                        c2 = 4;
                        i2 = 7;
                    case 5:
                        str11 = (String) c.n(mhpVar, 5, tkr.a, str11);
                        i3 |= 32;
                        c2 = 4;
                    case 6:
                        bool5 = (Boolean) c.n(mhpVar, 6, oc3.a, bool5);
                        i3 |= 64;
                        c2 = 4;
                    case 7:
                        bool4 = (Boolean) c.n(mhpVar, i2, oc3.a, bool4);
                        i3 |= 128;
                        c2 = 4;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            bool = bool4;
            bool2 = bool5;
            str = str11;
            str2 = str12;
            g0Var = g0Var2;
            str3 = str13;
            str4 = str14;
            str5 = str15;
        }
        c.b(mhpVar);
        return new h0(i, g0Var, str3, str4, str5, str2, str, bool2, bool);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h0 h0Var = (h0) obj;
        l6bVar.getClass();
        h0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) h0.i[0].getValue();
        g0 g0Var = h0Var.a;
        Boolean bool = h0Var.h;
        Boolean bool2 = h0Var.g;
        String str = h0Var.f;
        String str2 = h0Var.e;
        String str3 = h0Var.d;
        String str4 = h0Var.c;
        String str5 = h0Var.b;
        c.k(mhpVar, 0, t9fVar, g0Var);
        if (c.e(mhpVar) || str5 != null) {
            c.q(mhpVar, 1, tkr.a, str5);
        }
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 2, tkr.a, str4);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 3, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 4, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 5, tkr.a, str);
        }
        if (c.e(mhpVar) || bool2 != null) {
            c.q(mhpVar, 6, oc3.a, bool2);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 7, oc3.a, bool);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
