package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3489l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31680a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f31681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31683d;

    public C3489l1(int i, byte[] bArr, int i6, int i9) {
        this.f31680a = i;
        this.f31681b = bArr;
        this.f31682c = i6;
        this.f31683d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3489l1.class == obj.getClass()) {
            C3489l1 c3489l1 = (C3489l1) obj;
            if (this.f31680a == c3489l1.f31680a && this.f31682c == c3489l1.f31682c && this.f31683d == c3489l1.f31683d && Arrays.equals(this.f31681b, c3489l1.f31681b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f31681b) + (this.f31680a * 31)) * 31) + this.f31682c) * 31) + this.f31683d;
    }
}
