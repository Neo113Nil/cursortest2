package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3231fp extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f31218n;

    public C3231fp(int i) {
        this.f31218n = i;
    }

    public C3231fp(int i, String str) {
        super(str);
        this.f31218n = i;
    }

    public C3231fp(String str, Throwable th) {
        super(str, th);
        this.f31218n = 1;
    }
}
