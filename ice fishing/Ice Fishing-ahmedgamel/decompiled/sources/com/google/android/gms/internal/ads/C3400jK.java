package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3400jK {

    /* renamed from: d, reason: collision with root package name */
    public static final C3400jK f31226d = new C3400jK("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f31227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31229c;

    static {
        new C3400jK("\n", "  ", true);
    }

    public C3400jK(String str, String str2, boolean z3) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f31227a = str;
        this.f31228b = str2;
        this.f31229c = z3;
    }
}
