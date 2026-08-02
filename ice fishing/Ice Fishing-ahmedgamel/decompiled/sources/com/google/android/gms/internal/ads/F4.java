package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class F4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25500c;

    /* renamed from: d, reason: collision with root package name */
    public int f25501d;

    /* renamed from: e, reason: collision with root package name */
    public String f25502e;

    public F4(int i, int i4, int i6) {
        this.f25498a = i != Integer.MIN_VALUE ? AbstractC5128c.e(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
        this.f25499b = i4;
        this.f25500c = i6;
        this.f25501d = Integer.MIN_VALUE;
        this.f25502e = "";
    }

    public final void a() {
        int i = this.f25501d;
        int i4 = i == Integer.MIN_VALUE ? this.f25499b : i + this.f25500c;
        this.f25501d = i4;
        int length = String.valueOf(i4).length();
        String str = this.f25498a;
        this.f25502e = D.x.k(i4, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f25501d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
