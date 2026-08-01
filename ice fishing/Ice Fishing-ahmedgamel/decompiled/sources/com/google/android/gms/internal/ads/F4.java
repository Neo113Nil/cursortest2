package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class F4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24744c;

    /* renamed from: d, reason: collision with root package name */
    public int f24745d;

    /* renamed from: e, reason: collision with root package name */
    public String f24746e;

    public F4(int i, int i6, int i9) {
        this.f24742a = i != Integer.MIN_VALUE ? u1.h.e(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
        this.f24743b = i6;
        this.f24744c = i9;
        this.f24745d = Integer.MIN_VALUE;
        this.f24746e = "";
    }

    public final void a() {
        int i = this.f24745d;
        int i6 = i == Integer.MIN_VALUE ? this.f24743b : i + this.f24744c;
        this.f24745d = i6;
        int length = String.valueOf(i6).length();
        String str = this.f24742a;
        this.f24746e = D.y.m(i6, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f24745d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
