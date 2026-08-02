package com.yandex.passport.internal;

import android.accounts.Account;
import android.text.TextUtils;
import defpackage.e5b;
import defpackage.ouj;
import defpackage.u75;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {
    public static final JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("val", str);
        return jSONObject;
    }

    public static final b b(List list, Account account, com.yandex.passport.common.core.f fVar, String str, com.yandex.passport.internal.network.mappers.d dVar) {
        String str2;
        b bVar = null;
        if (str != null) {
            String replace = str.replace('.', '-');
            replace.getClass();
            Locale locale = Locale.US;
            str2 = ouj.s(locale, replace, locale);
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (account != null && Intrinsics.d(account.name, bVar2.a)) {
                return bVar2;
            }
            String str3 = bVar2.a;
            str3.getClass();
            String replace2 = str3.replace('.', '-');
            replace2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase = replace2.toLowerCase(locale2);
            lowerCase.getClass();
            if (TextUtils.equals(str2, lowerCase)) {
                bVar = bVar2;
            }
            l b = dVar.b(bVar2);
            if (b != null && fVar != null && fVar.equals(b.b)) {
                return bVar2;
            }
        }
        return bVar;
    }

    public static final l c(List list, com.yandex.passport.common.core.f fVar, String str, com.yandex.passport.internal.network.mappers.d dVar) {
        String str2;
        if (str != null) {
            String replace = str.replace('.', '-');
            replace.getClass();
            Locale locale = Locale.US;
            str2 = ouj.s(locale, replace, locale);
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        l lVar = null;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            l b = dVar.b(bVar);
            String str3 = bVar.a;
            if (b != null) {
                if (fVar != null && fVar.equals(b.b)) {
                    return b;
                }
                str3.getClass();
                String replace2 = str3.replace('.', '-');
                replace2.getClass();
                Locale locale2 = Locale.US;
                locale2.getClass();
                String lowerCase = replace2.toLowerCase(locale2);
                lowerCase.getClass();
                if (TextUtils.equals(str2, lowerCase)) {
                    lVar = b;
                }
            }
        }
        if (lVar == null && com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "ModernAccount not found for uid = " + fVar, 8);
        }
        return lVar;
    }

    public static l d(com.yandex.passport.common.core.b bVar, com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.g gVar, com.yandex.passport.internal.stash.a aVar2, String str) {
        bVar.getClass();
        aVar.getClass();
        gVar.getClass();
        long j = gVar.d;
        com.yandex.passport.common.core.f fVar = new com.yandex.passport.common.core.f(bVar, j);
        int i = gVar.h;
        String str2 = gVar.e;
        String str3 = gVar.g;
        if (com.yandex.plus.pay.ui.core.b.B(bVar)) {
            str3.getClass();
            str3 = str3.concat("@yandex-team.ru");
        } else if (i != 1) {
            if (i == 10) {
                str3 = str;
            } else if (i != 12 && i != 5) {
                if (i == 6) {
                    str3 = str2 + " #" + j;
                } else if (i != 7) {
                    str3 = null;
                }
            }
        }
        if (str3 == null || str3.length() == 0) {
            str3 = str2 + " #" + j;
        }
        if (i == 5) {
            str3 = str3.concat(" ﹫");
        } else if (i == 12) {
            str3 = str3.concat(" ✉");
        }
        if (bVar == com.yandex.passport.common.core.b.e || bVar == com.yandex.passport.common.core.b.f) {
            str3 = "[TS] ".concat(str3);
        } else if (bVar == com.yandex.passport.common.core.b.g) {
            str3 = "[RC] ".concat(str3);
        }
        String str4 = str3;
        Long l = gVar.Y;
        return new l(str4, fVar, l != null ? new com.yandex.passport.common.core.f(bVar, l.longValue()) : null, aVar, gVar, aVar2);
    }

    public static l e(com.yandex.passport.common.core.b bVar, com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.g gVar, String str) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return d(bVar, aVar, gVar, new com.yandex.passport.internal.stash.a(e5bVar), str);
    }

    public static JSONObject f(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static long g(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("time");
        }
        return 0L;
    }

    public static String h(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString("val", null)) == null) {
            return null;
        }
        return com.yandex.plus.core.network.api.utils.a.z(optString);
    }

    public static g i(String str) {
        String str2 = str;
        str2.getClass();
        if (kotlin.text.c.v(str2, "@jsn", false)) {
            str2 = str2.substring(4);
        }
        JSONObject optJSONObject = new JSONObject(str2).optJSONObject("extra_data");
        JSONObject f = f("_uid", optJSONObject);
        JSONObject f2 = f("_display_name", optJSONObject);
        JSONObject f3 = f("_default_avatar", optJSONObject);
        JSONObject f4 = f("_is_avatar_empty", optJSONObject);
        JSONObject f5 = f("_is_staff", optJSONObject);
        JSONObject f6 = f("_is_beta_tester", optJSONObject);
        JSONObject f7 = f("disk.pincode", optJSONObject);
        JSONObject f8 = f("mail.pincode", optJSONObject);
        String h = h(f);
        String h2 = h(f2);
        String h3 = h(f3);
        String h4 = h(f4);
        String h5 = h(f5);
        String h6 = h(f6);
        String h7 = h(f7);
        String h8 = h(f8);
        Long valueOf = h != null ? Long.valueOf(h) : null;
        Boolean valueOf2 = h4 != null ? Boolean.valueOf(h4) : null;
        Boolean valueOf3 = h5 != null ? Boolean.valueOf(h5) : null;
        Boolean valueOf4 = h6 != null ? Boolean.valueOf(h6) : null;
        Long l = (Long) Collections.max(u75.h(Long.valueOf(g(f)), Long.valueOf(g(f2)), Long.valueOf(g(f3)), Long.valueOf(g(f4)), Long.valueOf(g(f5)), Long.valueOf(g(f6)), Long.valueOf(g(f7)), Long.valueOf(g(f8))));
        Boolean bool = valueOf2;
        l.getClass();
        return new g(valueOf, h2, h3, bool, valueOf3, valueOf4, h7, h8, l.longValue());
    }

    public static g j(String str) {
        if (str != null) {
            try {
                return i(str);
            } catch (JSONException e) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "invalid string", e);
                }
            }
        }
        return null;
    }
}
