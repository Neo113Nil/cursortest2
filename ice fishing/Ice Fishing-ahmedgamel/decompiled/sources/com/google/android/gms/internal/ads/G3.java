package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f25701a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25702b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f25703c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f25704d;

    static {
        String str = AbstractC3182eu.f30782a;
        Locale locale = Locale.US;
        f25702b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f25703c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f25704d = Pattern.compile("\\\\an(\\d+)");
    }
}
