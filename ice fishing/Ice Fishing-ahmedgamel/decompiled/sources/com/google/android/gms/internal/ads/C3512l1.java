package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3512l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32460a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f32461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32463d;

    public C3512l1(int i, byte[] bArr, int i4, int i6) {
        this.f32460a = i;
        this.f32461b = bArr;
        this.f32462c = i4;
        this.f32463d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3512l1.class == obj.getClass()) {
            C3512l1 c3512l1 = (C3512l1) obj;
            if (this.f32460a == c3512l1.f32460a && this.f32462c == c3512l1.f32462c && this.f32463d == c3512l1.f32463d && Arrays.equals(this.f32461b, c3512l1.f32461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f32461b) + (this.f32460a * 31)) * 31) + this.f32462c) * 31) + this.f32463d;
    }
}
