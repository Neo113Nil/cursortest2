package com.yandex.plus.home.dailyquests.repository.rest.prefs;

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
public final /* synthetic */ class r implements p3d {
    public static final r a;

    @NotNull
    private static final mhp descriptor;

    static {
        r rVar = new r();
        a = rVar;
        j5m j5mVar = new j5m("in_progress_daily_quest_reward", rVar, 5);
        j5mVar.k("in_progress_light_reward_icon_url", false);
        j5mVar.k("in_progress_dark_reward_icon_url", false);
        j5mVar.k("in_progress_reward_icon_placeholder", false);
        j5mVar.k("in_progress_reward_text", false);
        j5mVar.k("in_progress_reward_content_description", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str6 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str7 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 1, tkrVar, null);
            String g = c.g(mhpVar, 2);
            str2 = str8;
            str4 = c.g(mhpVar, 3);
            str5 = c.g(mhpVar, 4);
            str3 = g;
            i = 31;
            str = str7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str6 = (String) c.n(mhpVar, 0, tkr.a, str6);
                    i2 |= 1;
                } else if (w == 1) {
                    str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                    i2 |= 2;
                } else if (w == 2) {
                    str10 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    str11 = c.g(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str12 = c.g(mhpVar, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str6;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
        }
        c.b(mhpVar);
        return new t(i, str, str2, str3, str4, str5);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t tVar = (t) obj;
        l6bVar.getClass();
        tVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, tVar.a);
        c.q(mhpVar, 1, tkrVar, tVar.b);
        c.p(mhpVar, 2, tVar.c);
        c.p(mhpVar, 3, tVar.d);
        c.p(mhpVar, 4, tVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
