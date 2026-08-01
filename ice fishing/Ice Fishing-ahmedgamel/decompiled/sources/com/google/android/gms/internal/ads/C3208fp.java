package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3208fp extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final int f30455n;

    public C3208fp(int i) {
        this.f30455n = i;
    }

    public C3208fp(int i, String str) {
        super(str);
        this.f30455n = i;
    }

    public C3208fp(String str, Throwable th) {
        super(str, th);
        this.f30455n = 1;
    }
}
