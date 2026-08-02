package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3423jK {

    /* renamed from: d, reason: collision with root package name */
    public static final C3423jK f32013d = new C3423jK("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f32014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32015b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32016c;

    static {
        new C3423jK("\n", "  ", true);
    }

    public C3423jK(String str, String str2, boolean z6) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f32014a = str;
        this.f32015b = str2;
        this.f32016c = z6;
    }
}
