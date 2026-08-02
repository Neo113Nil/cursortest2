package com.anythink.core.common.n.b;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16537a = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: b, reason: collision with root package name */
    private static final String f16538b = "\"([^\"]*)\"";

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16539c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16540d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: e, reason: collision with root package name */
    private final String f16541e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16542f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16543g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16544h;

    private x(String str, String str2, String str3, String str4) {
        this.f16541e = str;
        this.f16542f = str2;
        this.f16543g = str3;
        this.f16544h = str4;
    }

    public static x a(String str) {
        Matcher matcher = f16539c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(AbstractC5128c.b('\"', "No subtype found for: \"", str));
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f16540d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new x(str, lowerCase, lowerCase2, str2);
    }

    public static x b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private Charset c() {
        return a((Charset) null);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f16541e.equals(this.f16541e);
    }

    public final int hashCode() {
        return this.f16541e.hashCode();
    }

    public final String toString() {
        return this.f16541e;
    }

    private String b() {
        return this.f16543g;
    }

    public final String a() {
        return this.f16542f;
    }

    public final Charset a(Charset charset) {
        try {
            String str = this.f16544h;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
