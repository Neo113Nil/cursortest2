package io.appmetrica.analytics.impl;

import i1.AbstractC0251h;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import w1.C1062c;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815v8 implements InterfaceC0524k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7041a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final int f7042b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f7043c = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f7044d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final int f7045e = 63;

    /* renamed from: f, reason: collision with root package name */
    public final int f7046f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f7047g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f7048h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f7049i = 64;

    /* renamed from: j, reason: collision with root package name */
    public final z1.f f7050j = new z1.f("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* renamed from: k, reason: collision with root package name */
    public final z1.f f7051k = new z1.f("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* renamed from: l, reason: collision with root package name */
    public final List f7052l = AbstractC0253j.B("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* renamed from: m, reason: collision with root package name */
    public final String f7053m = "yandex.ru";

    /* renamed from: n, reason: collision with root package name */
    public final String f7054n = "gmail.com";

    /* renamed from: o, reason: collision with root package name */
    public final String f7055o = "googlemail.com";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0524k2
    public final String a(String str) {
        ?? f0;
        String input = z1.g.k0(str).toString();
        Pattern compile = Pattern.compile("^\\++");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        kotlin.jvm.internal.i.e(input, "input");
        String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        int b02 = z1.g.b0(lowerCase, '@', 0, 6);
        if (b02 == -1) {
            return null;
        }
        String substring = lowerCase.substring(0, b02);
        String substring2 = lowerCase.substring(b02 + 1);
        int length = substring.length();
        if (length >= this.f7048h && length <= this.f7049i) {
            List g02 = z1.g.g0(substring, new char[]{'.'});
            if (!g02.isEmpty()) {
                Iterator it = g02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    int length2 = str2.length();
                    if (length2 < this.f7048h) {
                        break;
                    }
                    Character U2 = z1.g.U(str2);
                    if (U2 != null && U2.charValue() == '\"') {
                        Character valueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                        if (valueOf != null && valueOf.charValue() == '\"' && length2 > 2) {
                            int i2 = 1;
                            while (true) {
                                int i3 = i2 + 2;
                                if (i3 >= str2.length()) {
                                    break;
                                }
                                char charAt = str2.charAt(i2);
                                if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                    break;
                                }
                                if (charAt == '\\') {
                                    if (i3 == str2.length()) {
                                        break;
                                    }
                                    i2++;
                                    if (str2.charAt(i2) < ' ') {
                                        break;
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                    z1.f fVar = this.f7050j;
                    fVar.getClass();
                    if (!fVar.f8637a.matcher(str2).matches()) {
                        break;
                    }
                }
            }
            if (substring2.length() <= this.f7043c) {
                String[] strArr = {"."};
                String str3 = strArr[0];
                if (str3.length() == 0) {
                    z1.g.e0(0);
                    y1.f fVar2 = new y1.f(new z1.c(substring2, 0, 0, new z1.p(AbstractC0251h.L(strArr), false, 1)));
                    f0 = new ArrayList(i1.k.E(fVar2));
                    Iterator it2 = fVar2.iterator();
                    while (true) {
                        z1.b bVar = (z1.b) it2;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        C1062c range = (C1062c) bVar.next();
                        kotlin.jvm.internal.i.e(range, "range");
                        f0.add(substring2.subSequence(range.f8516a, range.f8517b + 1).toString());
                    }
                } else {
                    f0 = z1.g.f0(0, substring2, str3, false);
                }
                if (f0.size() >= this.f7044d) {
                    List G = AbstractC0252i.G(f0);
                    if (!G.isEmpty()) {
                        Iterator it3 = G.iterator();
                        while (it3.hasNext()) {
                            if (!b((String) it3.next())) {
                                break;
                            }
                        }
                    }
                    String str4 = (String) AbstractC0252i.L(f0);
                    if (str4.length() >= this.f7047g && b(str4)) {
                        for (int i4 = 0; i4 < str4.length(); i4++) {
                            if (!Character.isDigit(str4.charAt(i4))) {
                                String P2 = z1.o.P(substring2, this.f7055o, this.f7054n);
                                z1.f fVar3 = this.f7051k;
                                fVar3.getClass();
                                Matcher matcher = fVar3.f8637a.matcher(P2);
                                kotlin.jvm.internal.i.d(matcher, "matcher(...)");
                                o.b bVar2 = !matcher.find(0) ? null : new o.b(matcher, P2);
                                if (bVar2 != null) {
                                    if (((z1.e) bVar2.f8227c) == null) {
                                        bVar2.f8227c = new z1.e(bVar2);
                                    }
                                    z1.e eVar = (z1.e) bVar2.f8227c;
                                    kotlin.jvm.internal.i.b(eVar);
                                    String str5 = (String) eVar.get(1);
                                    String str6 = (String) eVar.get(2);
                                    if (str6.length() <= 0 ? str5.length() > 0 : this.f7052l.contains(str6)) {
                                        P2 = this.f7053m;
                                    }
                                }
                                if (kotlin.jvm.internal.i.a(P2, this.f7053m)) {
                                    substring = z1.o.P(substring, ".", "-");
                                } else if (kotlin.jvm.internal.i.a(P2, this.f7054n)) {
                                    substring = z1.o.P(substring, ".", "");
                                }
                                int length3 = substring.length();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length3) {
                                        break;
                                    }
                                    if (substring.charAt(i5) == '+') {
                                        substring = substring.substring(0, i5);
                                        break;
                                    }
                                    i5++;
                                }
                                String str7 = substring + '@' + P2;
                                if (str7.length() < this.f7041a || str7.length() > this.f7042b) {
                                    return null;
                                }
                                return str7;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.f7045e || str.length() < this.f7046f) {
            return false;
        }
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (Character.isLetterOrDigit(str.charAt(0))) {
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (Character.isLetterOrDigit(str.charAt(z1.g.V(str)))) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '-') {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
