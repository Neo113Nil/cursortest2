package com.yandex.plus.home.dailyquests.repository.rest.prefs;

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

/* loaded from: classes5.dex */
public final /* synthetic */ class m implements p3d {
    public static final m a;

    @NotNull
    private static final mhp descriptor;

    static {
        m mVar = new m();
        a = mVar;
        j5m j5mVar = new j5m("in_progress_daily_quest", mVar, 7);
        j5mVar.k("created_at", false);
        j5mVar.k("shortcut_id", false);
        j5mVar.k("popup_id", false);
        j5mVar.k("deeplink", false);
        j5mVar.k("is_activated", false);
        j5mVar.k("toolbar_part", false);
        j5mVar.k("main_part", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{mvg.a, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), oc3.a, ff7.C(u.a), o.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        w wVar;
        q qVar;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 0;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str5 = (String) c.n(mhpVar, 3, tkrVar, null);
            boolean D = c.D(mhpVar, 4);
            w wVar2 = (w) c.n(mhpVar, 5, u.a, null);
            str = g;
            qVar = (q) c.z(mhpVar, 6, o.a, null);
            wVar = wVar2;
            str3 = str5;
            z = D;
            str2 = str4;
            i = 127;
            j = q;
        } else {
            int i3 = 1;
            boolean z2 = false;
            String str6 = null;
            w wVar3 = null;
            q qVar2 = null;
            long j2 = 0;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        j2 = c.q(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        str7 = c.g(mhpVar, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str8 = (String) c.n(mhpVar, 2, tkr.a, str8);
                        i4 |= 4;
                        break;
                    case 3:
                        str6 = (String) c.n(mhpVar, 3, tkr.a, str6);
                        i4 |= 8;
                        break;
                    case 4:
                        z2 = c.D(mhpVar, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        wVar3 = (w) c.n(mhpVar, 5, u.a, wVar3);
                        i4 |= 32;
                        break;
                    case 6:
                        qVar2 = (q) c.z(mhpVar, 6, o.a, qVar2);
                        i4 |= 64;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            z = z2;
            i = i4;
            str = str7;
            str2 = str8;
            str3 = str6;
            wVar = wVar3;
            qVar = qVar2;
            j = j2;
        }
        c.b(mhpVar);
        return new x(i, j, str, str2, str3, z, wVar, qVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x xVar = (x) obj;
        l6bVar.getClass();
        xVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, xVar.a);
        c.p(mhpVar, 1, xVar.b);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 2, tkrVar, xVar.c);
        c.q(mhpVar, 3, tkrVar, xVar.d);
        c.j(mhpVar, 4, xVar.e);
        c.q(mhpVar, 5, u.a, xVar.f);
        c.k(mhpVar, 6, o.a, xVar.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
