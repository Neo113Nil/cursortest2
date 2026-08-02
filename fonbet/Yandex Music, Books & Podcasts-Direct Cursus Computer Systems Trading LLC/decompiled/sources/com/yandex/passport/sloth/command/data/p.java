package com.yandex.passport.sloth.command.data;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements p3d {
    public static final p a;

    @NotNull
    private static final mhp descriptor;

    static {
        p pVar = new p();
        a = pVar;
        j5m j5mVar = new j5m("com.yandex.passport.sloth.command.data.GetOtpData", pVar, 7);
        j5mVar.k("kind", false);
        j5mVar.k("uid", true);
        j5mVar.k("machineReadableLogin", true);
        j5mVar.k("isTeam", true);
        j5mVar.k("pin", true);
        j5mVar.k("secret", true);
        j5mVar.k("timestamp", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(oc3.a), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(mvg.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Long l;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        boolean z;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 6;
        boolean z2 = true;
        String str6 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 3, oc3.a, null);
            String str9 = (String) c.n(mhpVar, 4, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 5, tkrVar, null);
            str = g;
            l = (Long) c.n(mhpVar, 6, mvg.a, null);
            str5 = str10;
            bool = bool2;
            str4 = str9;
            str3 = str8;
            str2 = str7;
            i = 127;
        } else {
            boolean z3 = true;
            int i3 = 0;
            Long l2 = null;
            String str11 = null;
            String str12 = null;
            Boolean bool3 = null;
            String str13 = null;
            String str14 = null;
            while (z3) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = z2;
                        z3 = false;
                        z2 = z;
                        i2 = 6;
                    case 0:
                        z = z2;
                        str6 = c.g(mhpVar, 0);
                        i3 |= 1;
                        z2 = z;
                        i2 = 6;
                    case 1:
                        z = true;
                        str11 = (String) c.n(mhpVar, 1, tkr.a, str11);
                        i3 |= 2;
                        z2 = z;
                        i2 = 6;
                    case 2:
                        str12 = (String) c.n(mhpVar, 2, tkr.a, str12);
                        i3 |= 4;
                        z2 = true;
                    case 3:
                        bool3 = (Boolean) c.n(mhpVar, 3, oc3.a, bool3);
                        i3 |= 8;
                        z2 = true;
                    case 4:
                        str13 = (String) c.n(mhpVar, 4, tkr.a, str13);
                        i3 |= 16;
                        z2 = true;
                    case 5:
                        str14 = (String) c.n(mhpVar, 5, tkr.a, str14);
                        i3 |= 32;
                        z2 = true;
                    case 6:
                        l2 = (Long) c.n(mhpVar, i2, mvg.a, l2);
                        i3 |= 64;
                        z2 = true;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            l = l2;
            str = str6;
            str2 = str11;
            str3 = str12;
            bool = bool3;
            str4 = str13;
            str5 = str14;
        }
        c.b(mhpVar);
        return new r(i, str, str2, str3, bool, str4, str5, l);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r rVar = (r) obj;
        l6bVar.getClass();
        rVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = rVar.a;
        Long l = rVar.g;
        String str2 = rVar.f;
        String str3 = rVar.e;
        Boolean bool = rVar.d;
        String str4 = rVar.c;
        String str5 = rVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || str5 != null) {
            c.q(mhpVar, 1, tkr.a, str5);
        }
        if (c.e(mhpVar) || str4 != null) {
            c.q(mhpVar, 2, tkr.a, str4);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 3, oc3.a, bool);
        }
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 4, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 5, tkr.a, str2);
        }
        if (c.e(mhpVar) || l != null) {
            c.q(mhpVar, 6, mvg.a, l);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
