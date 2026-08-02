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
public final /* synthetic */ class h implements p3d {
    public static final h a;

    @NotNull
    private static final mhp descriptor;

    static {
        h hVar = new h();
        a = hVar;
        j5m j5mVar = new j5m("done_daily_quest_reward", hVar, 6);
        j5mVar.k("light_reward_icon_url", false);
        j5mVar.k("dark_reward_icon_url", false);
        j5mVar.k("reward_icon_placeholder", false);
        j5mVar.k("reward_text", false);
        j5mVar.k("reward_fallback_text", false);
        j5mVar.k("reward_content_description", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, tkrVar, tkrVar, tkrVar};
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
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 5;
        String str7 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 1, tkrVar, null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            String g3 = c.g(mhpVar, 4);
            str2 = str9;
            str6 = c.g(mhpVar, 5);
            str4 = g2;
            str5 = g3;
            str3 = g;
            i = 63;
            str = str8;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i3 |= 1;
                        break;
                    case 1:
                        str10 = (String) c.n(mhpVar, 1, tkr.a, str10);
                        i3 |= 2;
                        break;
                    case 2:
                        str11 = c.g(mhpVar, 2);
                        i3 |= 4;
                        continue;
                    case 3:
                        str12 = c.g(mhpVar, 3);
                        i3 |= 8;
                        continue;
                    case 4:
                        str13 = c.g(mhpVar, 4);
                        i3 |= 16;
                        continue;
                    case 5:
                        str14 = c.g(mhpVar, i2);
                        i3 |= 32;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 5;
            }
            i = i3;
            str = str7;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
        }
        c.b(mhpVar);
        return new j(i, str, str2, str3, str4, str5, str6);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        j jVar = (j) obj;
        l6bVar.getClass();
        jVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 0, tkrVar, jVar.a);
        c.q(mhpVar, 1, tkrVar, jVar.b);
        c.p(mhpVar, 2, jVar.c);
        c.p(mhpVar, 3, jVar.d);
        c.p(mhpVar, 4, jVar.e);
        c.p(mhpVar, 5, jVar.f);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
