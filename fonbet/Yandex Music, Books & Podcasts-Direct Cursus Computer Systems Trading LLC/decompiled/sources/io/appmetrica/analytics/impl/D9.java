package io.appmetrica.analytics.impl;

import defpackage.fb9;
import defpackage.hrg;
import defpackage.jch;
import defpackage.mlr;
import defpackage.u75;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class D9 implements Y2 {
    public final int a = 5;
    public final int b = 100;
    public final int c = KotlinVersion.MAX_COMPONENT_VALUE;
    public final int d = 2;
    public final int e = 63;
    public final int f = 1;
    public final int g = 2;
    public final int h = 1;
    public final int i = 64;
    public final Regex j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");
    public final Regex k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");
    public final List l = u75.h("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");
    public final String m = "yandex.ru";
    public final String n = "gmail.com";
    public final String o = "googlemail.com";

    @Override // io.appmetrica.analytics.impl.Y2
    public final String a(@NotNull String str) {
        String str2;
        List split$default;
        String lowerCase = new Regex("^\\++").replace(StringsKt.t0(str).toString(), "").toLowerCase(Locale.ROOT);
        int W = StringsKt.W(lowerCase, '@', 0, 6);
        if (W != -1) {
            String substring = lowerCase.substring(0, W);
            String substring2 = lowerCase.substring(W + 1);
            int length = substring.length();
            if (length >= this.h && length <= this.i) {
                List e0 = StringsKt.e0(substring, new char[]{'.'}, 6);
                if (!(e0 instanceof Collection) || !e0.isEmpty()) {
                    Iterator it = e0.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            int length2 = str2.length();
                            if (length2 >= this.h) {
                                Character H = mlr.H(str2);
                                if (H != null && H.charValue() == '\"') {
                                    Character valueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                                    if (valueOf != null && valueOf.charValue() == '\"' && length2 > 2) {
                                        int i = 1;
                                        while (true) {
                                            int i2 = i + 2;
                                            if (i2 >= str2.length()) {
                                                break;
                                            }
                                            char charAt = str2.charAt(i);
                                            if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                                return null;
                                            }
                                            if (charAt == '\\') {
                                                if (i2 == str2.length()) {
                                                    return null;
                                                }
                                                i++;
                                                if (str2.charAt(i) < ' ') {
                                                    return null;
                                                }
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    } while (this.j.e(str2));
                    return null;
                }
                if (substring2.length() > this.c) {
                    return null;
                }
                split$default = StringsKt__StringsKt.split$default(substring2, new String[]{"."}, false, 0, 6, null);
                if (split$default.size() < this.d) {
                    return null;
                }
                List M = CollectionsKt.M(split$default);
                if (!(M instanceof Collection) || !M.isEmpty()) {
                    Iterator it2 = M.iterator();
                    while (it2.hasNext()) {
                        if (!b((String) it2.next())) {
                            return null;
                        }
                    }
                }
                String str3 = (String) CollectionsKt.Y(split$default);
                if (str3.length() < this.g || !b(str3)) {
                    return null;
                }
                for (int i3 = 0; i3 < str3.length(); i3++) {
                    if (!Character.isDigit(str3.charAt(i3))) {
                        String r = kotlin.text.c.r(substring2, this.o, this.n, false);
                        jch b = this.k.b(r);
                        if (b != null) {
                            fb9 fb9Var = (fb9) b.a();
                            String str4 = (String) fb9Var.get(1);
                            String str5 = (String) fb9Var.get(2);
                            if (str5.length() <= 0 ? str4.length() > 0 : this.l.contains(str5)) {
                                r = this.m;
                            }
                        }
                        if (Intrinsics.d(r, this.m)) {
                            substring = kotlin.text.c.r(substring, ".", "-", false);
                        } else if (Intrinsics.d(r, this.n)) {
                            substring = kotlin.text.c.r(substring, ".", "", false);
                        }
                        int length3 = substring.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (substring.charAt(i4) == '+') {
                                substring = substring.substring(0, i4);
                                break;
                            }
                            i4++;
                        }
                        String l = hrg.l('@', substring, r);
                        if (l.length() < this.a || l.length() > this.b) {
                            return null;
                        }
                        return l;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.e || str.length() < this.f || !Character.isLetterOrDigit(mlr.G(str)) || !Character.isLetterOrDigit(mlr.I(str))) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-') {
                return false;
            }
        }
        return true;
    }
}
