package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24911a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f24912b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f24913c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f24914d;

    static {
        String str = AbstractC3159eu.f29993a;
        Locale locale = Locale.US;
        f24912b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f24913c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f24914d = Pattern.compile("\\\\an(\\d+)");
    }
}
