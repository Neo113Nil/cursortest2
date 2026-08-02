package io.appmetrica.analytics.impl;

import defpackage.b64;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gvu0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.scc;
import defpackage.u1l;
import defpackage.w610;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class J9 implements Y2 {
    public final int a = 5;
    public final int b = 100;
    public final int c = 255;
    public final int d = 2;
    public final int e = 63;
    public final int f = 1;
    public final int g = 2;
    public final int h = 1;
    public final int i = 64;
    public final Regex j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");
    public final Regex k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");
    public final List l = scc.g(ClearCryptoProPrefs.COUNTRY, "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");
    public final String m = "yandex.ru";
    public final String n = "gmail.com";
    public final String o = "googlemail.com";

    @Override // io.appmetrica.analytics.impl.Y2
    public final String a(String str) {
        String str2;
        Character y0;
        List W;
        String lowerCase = b64.k("^\\++", evu0.k0(str).toString(), "").toLowerCase(Locale.ROOT);
        int K = evu0.K(lowerCase, '@', 0, 6);
        if (K == -1) {
            return null;
        }
        String substring = lowerCase.substring(0, K);
        String substring2 = lowerCase.substring(K + 1);
        int length = substring.length();
        if (length < this.h || length > this.i) {
            return null;
        }
        List Y = evu0.Y(substring, new char[]{'.'}, 0, 6);
        if (!(Y instanceof Collection) || !Y.isEmpty()) {
            Iterator it = Y.iterator();
            do {
                if (it.hasNext()) {
                    str2 = (String) it.next();
                    int length2 = str2.length();
                    if (length2 < this.h) {
                        return null;
                    }
                    Character v0 = gvu0.v0(str2);
                    if (v0 != null && v0.charValue() == '\"' && (y0 = gvu0.y0(str2)) != null && y0.charValue() == '\"' && length2 > 2) {
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
            } while (this.j.h(str2));
            return null;
        }
        if (substring2.length() > this.c) {
            return null;
        }
        W = evu0.W(substring2, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        if (W.size() < this.d) {
            return null;
        }
        List K2 = kotlin.collections.a.K(W);
        if (!(K2 instanceof Collection) || !K2.isEmpty()) {
            Iterator it2 = K2.iterator();
            while (it2.hasNext()) {
                if (!b((String) it2.next())) {
                    return null;
                }
            }
        }
        String str3 = (String) kotlin.collections.a.Z(W);
        if (str3.length() < this.g || !b(str3)) {
            return null;
        }
        for (int i3 = 0; i3 < str3.length(); i3++) {
            if (!Character.isDigit(str3.charAt(i3))) {
                String v = cvu0.v(substring2, this.o, this.n, false);
                w610 b = this.k.b(v);
                if (b != null) {
                    u1l u1lVar = (u1l) b.a();
                    String str4 = (String) u1lVar.get(1);
                    String str5 = (String) u1lVar.get(2);
                    if (str5.length() <= 0 ? str4.length() > 0 : this.l.contains(str5)) {
                        v = this.m;
                    }
                }
                if (jl40.l(v, this.m)) {
                    substring = cvu0.v(substring, Extension.DOT_CHAR, "-", false);
                } else if (jl40.l(v, this.n)) {
                    substring = cvu0.v(substring, Extension.DOT_CHAR, "", false);
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
                String f = oyr.f('@', substring, v);
                if (f.length() < this.a || f.length() > this.b) {
                    return null;
                }
                return f;
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.e || str.length() < this.f || !Character.isLetterOrDigit(gvu0.u0(str)) || !Character.isLetterOrDigit(gvu0.x0(str))) {
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
