package com.yandex.passport.internal;

import com.yandex.passport.api.w1;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.f9h;
import defpackage.n7w;
import defpackage.uah;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class y {
    public static a0 a(w1 w1Var) {
        w1Var.getClass();
        switch (w1Var.ordinal()) {
            case 0:
                return new a0(w1.a, z.a, (String) null, (f9h) null, 20);
            case 1:
                return new a0(w1.b, z.a, (String) null, (f9h) null, 20);
            case 2:
                return new a0(w1.c, z.a, (String) null, (f9h) null, 20);
            case 3:
                return new a0(w1.d, z.a, (String) null, (f9h) null, 20);
            case 4:
                return new a0(w1.e, z.a, (String) null, (f9h) null, 20);
            case 5:
                return new a0(w1.f, z.a, (String) null, (f9h) null, 20);
            case 6:
                return new a0(w1.g, z.a, (String) null, (f9h) null, 20);
            case 7:
                return new a0(w1.h, z.a, (String) null, (f9h) null, 20);
            case 8:
                return new a0(w1.i, z.b, "https://mail.google.com/", true, dfi.n("force_prompt", "1"));
            case 9:
                return c(null);
            case 10:
                return b(null);
            case 11:
                return d(null);
            case 12:
                return new a0(w1.m, z.c, (String) null, (f9h) null, 28);
            case 13:
                return new a0(w1.n, z.c, (String) null, (f9h) null, 28);
            default:
                b6e.s();
                return null;
        }
    }

    public static a0 b(String str) {
        return new a0(w1.k, z.b, "userinfo mail.imap", n7w.G(uah.e(new Pair("application", "mailru-o2-mail"), new Pair("login_hint", str))), 8);
    }

    public static a0 c(String str) {
        return new a0(w1.j, z.b, "wl.imap wl.offline_access", n7w.G(uah.e(new Pair("application", "microsoft"), new Pair("login_hint", str))), 8);
    }

    public static a0 d(String str) {
        return new a0(w1.l, z.b, "", n7w.G(uah.e(new Pair("application", "yahoo-mail-ru"), new Pair("login_hint", str))), 8);
    }
}
