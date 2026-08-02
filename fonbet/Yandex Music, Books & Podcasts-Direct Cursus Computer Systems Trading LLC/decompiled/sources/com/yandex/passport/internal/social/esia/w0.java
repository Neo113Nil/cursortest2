package com.yandex.passport.internal.social.esia;

import defpackage.cg6;
import defpackage.e7o;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.s7e;
import defpackage.xq0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class w0 {
    public final com.yandex.passport.data.network.core.l a;

    public w0(com.yandex.passport.data.network.core.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (('A' > charAt || charAt >= '[') && (('a' > charAt || charAt >= '{') && !(('0' <= charAt && charAt < ':') || charAt == '-' || charAt == '.' || charAt == '_' || charAt == '~' || charAt == '%' || charAt == '+'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s7e s7eVar, cg6 cg6Var) {
        t0 t0Var;
        int i;
        if (cg6Var instanceof t0) {
            t0Var = (t0) cg6Var;
            int i2 = t0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t0Var.k;
                nm6 nm6Var = nm6.a;
                i = t0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    t0Var.j = s7eVar;
                    t0Var.m = 1;
                    return this.a.c(s7eVar, t0Var) == nm6Var ? nm6Var : s7eVar;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s7e s7eVar2 = t0Var.j;
                qgg.h0(obj);
                return s7eVar2;
            }
        }
        t0Var = new t0(this, cg6Var);
        Object obj2 = t0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t0Var.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, com.yandex.passport.common.core.b bVar, s0 s0Var, cg6 cg6Var) {
        u0 u0Var;
        int i;
        if (cg6Var instanceof u0) {
            u0Var = (u0) cg6Var;
            int i2 = u0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = u0Var.k;
                Object obj2 = nm6.a;
                i = u0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    s7e s7eVar = new s7e();
                    s7eVar.n("https");
                    s7eVar.g(bVar == com.yandex.passport.common.core.b.c ? "social.yandex.ru" : "social-test.yandex.ru");
                    s7eVar.j(0, 6, "broker", false, true);
                    s7eVar.j(0, 8, "redirect", false, true);
                    s7eVar.a("code", str);
                    s7eVar.a("state", str2);
                    u0Var.j = s0Var;
                    u0Var.m = 1;
                    obj = a(s7eVar, u0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0Var = u0Var.j;
                    qgg.h0(obj);
                }
                s7e s7eVar2 = (s7e) obj;
                String lowerCase = s0Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                s7eVar2.d("theme", lowerCase);
                return s7eVar2.e().i;
            }
        }
        u0Var = new u0(this, cg6Var);
        Object obj3 = u0Var.k;
        Object obj22 = nm6.a;
        i = u0Var.m;
        if (i != 0) {
        }
        s7e s7eVar22 = (s7e) obj3;
        String lowerCase2 = s0Var.name().toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        s7eVar22.d("theme", lowerCase2);
        return s7eVar22.e().i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.passport.common.core.b bVar, String str, String str2, String str3, s0 s0Var, String str4, cg6 cg6Var) {
        v0 v0Var;
        int i;
        if (cg6Var instanceof v0) {
            v0Var = (v0) cg6Var;
            int i2 = v0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.k;
                Object obj2 = nm6.a;
                i = v0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str5 = b(str) ? str : null;
                    if (str5 == null) {
                        e7o.f("Invalid parameter value for 'application': ".concat(str));
                        return null;
                    }
                    String str6 = b(str2) ? str2 : null;
                    if (str6 == null) {
                        e7o.f("Invalid parameter value for 'consumer': ".concat(str2));
                        return null;
                    }
                    String str7 = b(str3) ? str3 : null;
                    if (str7 == null) {
                        e7o.f("Invalid parameter value for 'scope': ".concat(str3));
                        return null;
                    }
                    String str8 = bVar == com.yandex.passport.common.core.b.c ? "social.yandex.ru" : "social-test.yandex.ru";
                    s7e s7eVar = new s7e();
                    s7eVar.n("https");
                    s7eVar.g(str8);
                    s7eVar.b("broker2");
                    s7eVar.b("start");
                    s7eVar.d("provider", "esia");
                    s7eVar.a("application", str5);
                    s7eVar.a("consumer", str6);
                    s7eVar.d("bind", "1");
                    s7eVar.a("scope", str7);
                    if (str4 != null) {
                        s7eVar.d("app_to_app_return_url", str4);
                    }
                    s7eVar.d("retpath", "https://passport.yandex.ru/closewebview");
                    v0Var.j = s0Var;
                    v0Var.m = 1;
                    obj = a(s7eVar, v0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0Var = v0Var.j;
                    qgg.h0(obj);
                }
                s7e s7eVar2 = (s7e) obj;
                String lowerCase = s0Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                s7eVar2.d("theme", lowerCase);
                String str9 = s7eVar2.e().i;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Socialism binding flow start url: ".concat(str9), 8);
                }
                return str9;
            }
        }
        v0Var = new v0(this, cg6Var);
        Object obj3 = v0Var.k;
        Object obj22 = nm6.a;
        i = v0Var.m;
        if (i != 0) {
        }
        s7e s7eVar22 = (s7e) obj3;
        String lowerCase2 = s0Var.name().toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        s7eVar22.d("theme", lowerCase2);
        String str92 = s7eVar22.e().i;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        return str92;
    }
}
