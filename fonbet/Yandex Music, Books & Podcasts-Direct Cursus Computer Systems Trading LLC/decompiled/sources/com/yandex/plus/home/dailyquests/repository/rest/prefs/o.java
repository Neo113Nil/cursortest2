package com.yandex.plus.home.dailyquests.repository.rest.prefs;

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
public final /* synthetic */ class o implements p3d {
    public static final o a;

    @NotNull
    private static final mhp descriptor;

    static {
        o oVar = new o();
        a = oVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.dailyquests.repository.rest.prefs.DailyQuestDao.InProgressDailyQuestDao.MainPart", oVar, 7);
        j5mVar.k("light_image_url", false);
        j5mVar.k("dark_image_url", false);
        j5mVar.k("title", false);
        j5mVar.k("progress_percent", false);
        j5mVar.k("progress_fallback_text", false);
        j5mVar.k("progress_hint", false);
        j5mVar.k("days_left_until_deadline", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        t9f C = ff7.C(tkrVar);
        t9f C2 = ff7.C(tkrVar);
        cqe cqeVar = cqe.a;
        return new t9f[]{C, C2, tkrVar, cqeVar, tkrVar, ff7.C(tkrVar), ff7.C(cqeVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i3 = 6;
        boolean z = true;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String g = c.g(mhpVar, 2);
            int k = c.k(mhpVar, 3);
            String g2 = c.g(mhpVar, 4);
            str5 = (String) c.n(mhpVar, 5, tkrVar, null);
            num = (Integer) c.n(mhpVar, 6, cqe.a, null);
            i = 127;
            i2 = k;
            str4 = g2;
            str3 = g;
            str2 = str7;
            str = str6;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            int i5 = 0;
            Integer num2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                    case 0:
                        str8 = (String) c.n(mhpVar, 0, tkr.a, str8);
                        i4 |= 1;
                        i3 = 6;
                        z = true;
                    case 1:
                        str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                        i4 |= 2;
                        z = true;
                        i3 = 6;
                    case 2:
                        str10 = c.g(mhpVar, 2);
                        i4 |= 4;
                        z = true;
                    case 3:
                        i5 = c.k(mhpVar, 3);
                        i4 |= 8;
                        z = true;
                    case 4:
                        str11 = c.g(mhpVar, 4);
                        i4 |= 16;
                        z = true;
                    case 5:
                        str12 = (String) c.n(mhpVar, 5, tkr.a, str12);
                        i4 |= 32;
                        z = true;
                    case 6:
                        num2 = (Integer) c.n(mhpVar, i3, cqe.a, num2);
                        i4 |= 64;
                        z = true;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            num = num2;
            i2 = i5;
            str = str8;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
        }
        c.b(mhpVar);
        return new q(i, str, str2, str3, i2, str4, str5, num);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, qVar.a);
        c.q(mhpVar, 1, tkrVar, qVar.b);
        c.p(mhpVar, 2, qVar.c);
        c.A(3, qVar.d, mhpVar);
        c.p(mhpVar, 4, qVar.e);
        c.q(mhpVar, 5, tkrVar, qVar.f);
        c.q(mhpVar, 6, cqe.a, qVar.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
