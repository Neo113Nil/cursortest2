package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3137e2 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final int f30659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30660c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30661d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f30662e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f30663f;

    public C3137e2(int i, int i4, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f30659b = i;
        this.f30660c = i4;
        this.f30661d = i6;
        this.f30662e = iArr;
        this.f30663f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3137e2.class == obj.getClass()) {
            C3137e2 c3137e2 = (C3137e2) obj;
            if (this.f30659b == c3137e2.f30659b && this.f30660c == c3137e2.f30660c && this.f30661d == c3137e2.f30661d && Arrays.equals(this.f30662e, c3137e2.f30662e) && Arrays.equals(this.f30663f, c3137e2.f30663f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30663f) + ((Arrays.hashCode(this.f30662e) + ((((((this.f30659b + 527) * 31) + this.f30660c) * 31) + this.f30661d) * 31)) * 31);
    }
}
