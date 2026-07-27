package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3394j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32056a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f32057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32058c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32059d;

    public C3394j1(int i, byte[] bArr, int i4, int i9) {
        this.f32056a = i;
        this.f32057b = bArr;
        this.f32058c = i4;
        this.f32059d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3394j1.class == obj.getClass()) {
            C3394j1 c3394j1 = (C3394j1) obj;
            if (this.f32056a == c3394j1.f32056a && this.f32058c == c3394j1.f32058c && this.f32059d == c3394j1.f32059d && Arrays.equals(this.f32057b, c3394j1.f32057b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f32057b) + (this.f32056a * 31)) * 31) + this.f32058c) * 31) + this.f32059d;
    }
}
