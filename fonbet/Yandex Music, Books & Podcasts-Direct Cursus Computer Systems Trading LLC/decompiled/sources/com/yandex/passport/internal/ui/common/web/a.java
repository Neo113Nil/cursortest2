package com.yandex.passport.internal.ui.common.web;

import android.content.SharedPreferences;
import android.net.Uri;
import com.yandex.passport.internal.config.p;
import com.yandex.passport.internal.sloth.m;
import defpackage.ouj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class a {
    public static final Regex d = new Regex("^(?:sso\\.|)?(?:passport(?:-rc|-test|)?|id(?:-rc|-test|)|oauth(?:-rc|-test|)|social)\\.(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$");
    public static final Regex e = new Regex("sso(?:\\.rc|\\.test|)?\\.ya\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)");
    public final p a;
    public final m b;
    public final com.yandex.passport.internal.network.d c;

    public a(p pVar, m mVar, com.yandex.passport.internal.network.d dVar) {
        pVar.getClass();
        mVar.getClass();
        dVar.getClass();
        this.a = pVar;
        this.b = mVar;
        this.c = dVar;
    }

    public final boolean a(String str) {
        str.getClass();
        if (d.a(str) || e.a(str)) {
            return true;
        }
        String string = ((SharedPreferences) this.a.b.getValue()).getString("white_list_key", null);
        return string != null ? new Regex(string).a(str) : false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final boolean b(String str) {
        str.getClass();
        String k = com.yandex.passport.common.url.b.k(str);
        Locale locale = Locale.US;
        String s = ouj.s(locale, k, locale);
        if (s.equals("https") || s.equals("http")) {
            String lowerCase = com.yandex.passport.common.url.b.h(str).toLowerCase(locale);
            lowerCase.getClass();
            if (new Regex("^(?:[a-z0-9]\\.)*youtube\\.[a-z]+$").a(lowerCase)) {
                return true;
            }
            String i = com.yandex.passport.common.url.b.i(str);
            if (i != null) {
                String lowerCase2 = i.toLowerCase(locale);
                lowerCase2.getClass();
                if (new Regex("^(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$").a(lowerCase) && (kotlin.text.c.v(lowerCase2, "/legal/", false) || kotlin.text.c.v(lowerCase2, "/support/", false))) {
                    return true;
                }
                if (new Regex("^id.(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$").a(lowerCase) && kotlin.text.c.v(lowerCase2, "/about", false)) {
                    return true;
                }
                m mVar = this.b;
                mVar.getClass();
                Uri a = m.a(Uri.parse(str));
                ArrayList g0 = CollectionsKt.g0(mVar.d.values(), mVar.c);
                if (!g0.isEmpty()) {
                    Iterator it = g0.iterator();
                    while (it.hasNext()) {
                        Uri a2 = m.a(Uri.parse((String) it.next()));
                        if (Intrinsics.d(a2.getScheme(), a.getScheme()) && Intrinsics.d(a2.getAuthority(), a.getAuthority()) && Intrinsics.d(a2.getPath(), a.getPath()) && (Intrinsics.d(a2.getQuery(), a.getQuery()) || Intrinsics.d(a2.getEncodedQuery(), a.getEncodedQuery()))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(String str) {
        str.getClass();
        String k = com.yandex.passport.common.url.b.k(str);
        Locale locale = Locale.US;
        String s = ouj.s(locale, k, locale);
        if (s.equals("http") || s.equals("https")) {
            String lowerCase = com.yandex.passport.common.url.b.h(str).toLowerCase(locale);
            lowerCase.getClass();
            String i = com.yandex.passport.common.url.b.i(str);
            if (i != null) {
                String lowerCase2 = i.toLowerCase(locale);
                lowerCase2.getClass();
                if (a(lowerCase) && (kotlin.text.c.v(lowerCase2, "/restoration/semi_auto", false) || kotlin.text.c.v(lowerCase2, "/restoration/twofa ", false))) {
                    return true;
                }
            }
        }
        return false;
    }
}
