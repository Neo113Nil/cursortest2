package com.yandex.plus.home.datasource.openapi.models;

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
public final /* synthetic */ class r6 implements p3d {
    public static final r6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r6 r6Var = new r6();
        a = r6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkRewardDtoModel", r6Var, 7);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("darkIconUrl", false);
        j5mVar.k("lightIconUrl", false);
        j5mVar.k("iconUrlPlaceholder", false);
        j5mVar.k("contentDescription", false);
        j5mVar.k("toolbarTitle", true);
        j5mVar.k("subtitle", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 1;
        String str8 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            String g4 = c.g(mhpVar, 3);
            String g5 = c.g(mhpVar, 4);
            tkr tkrVar = tkr.a;
            String str9 = (String) c.n(mhpVar, 5, tkrVar, null);
            str2 = g;
            str = (String) c.n(mhpVar, 6, tkrVar, null);
            str7 = str9;
            str5 = g4;
            str6 = g5;
            str4 = g3;
            str3 = g2;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
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
                        continue;
                    case 0:
                        i3 |= 1;
                        str8 = c.g(mhpVar, 0);
                        continue;
                    case 1:
                        str11 = c.g(mhpVar, i2);
                        i3 |= 2;
                        continue;
                    case 2:
                        str12 = c.g(mhpVar, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        str13 = c.g(mhpVar, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str14 = c.g(mhpVar, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        str15 = (String) c.n(mhpVar, 5, tkr.a, str15);
                        i3 |= 32;
                        break;
                    case 6:
                        str10 = (String) c.n(mhpVar, 6, tkr.a, str10);
                        i3 |= 64;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 1;
            }
            i = i3;
            str = str10;
            str2 = str8;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
        }
        c.b(mhpVar);
        return new t6(i, str2, str3, str4, str5, str6, str7, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t6 t6Var = (t6) obj;
        l6bVar.getClass();
        t6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = t6Var.a;
        String str2 = t6Var.g;
        String str3 = t6Var.f;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, t6Var.b);
        c.p(mhpVar, 2, t6Var.c);
        c.p(mhpVar, 3, t6Var.d);
        c.p(mhpVar, 4, t6Var.e);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 5, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 6, tkr.a, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
