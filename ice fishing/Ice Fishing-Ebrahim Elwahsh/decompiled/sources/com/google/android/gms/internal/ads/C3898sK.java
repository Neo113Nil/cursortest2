package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3898sK {

    /* renamed from: d, reason: collision with root package name */
    public static final C3898sK f34228d = new C3898sK("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f34229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34230b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34231c;

    static {
        new C3898sK("\n", "  ", true);
    }

    public C3898sK(String str, String str2, boolean z8) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f34229a = str;
        this.f34230b = str2;
        this.f34231c = z8;
    }
}
