package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class E3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24636a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f24637b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f24638c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f24639d;

    static {
        String str = AbstractC3548lu.f32613a;
        Locale locale = Locale.US;
        f24637b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f24638c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f24639d = Pattern.compile("\\\\an(\\d+)");
    }
}
