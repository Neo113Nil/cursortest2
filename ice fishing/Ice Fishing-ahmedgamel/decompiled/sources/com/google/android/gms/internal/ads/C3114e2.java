package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114e2 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final int f29867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29869d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f29870e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f29871f;

    public C3114e2(int i, int i6, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f29867b = i;
        this.f29868c = i6;
        this.f29869d = i9;
        this.f29870e = iArr;
        this.f29871f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3114e2.class == obj.getClass()) {
            C3114e2 c3114e2 = (C3114e2) obj;
            if (this.f29867b == c3114e2.f29867b && this.f29868c == c3114e2.f29868c && this.f29869d == c3114e2.f29869d && Arrays.equals(this.f29870e, c3114e2.f29870e) && Arrays.equals(this.f29871f, c3114e2.f29871f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29871f) + ((Arrays.hashCode(this.f29870e) + ((((((this.f29867b + 527) * 31) + this.f29868c) * 31) + this.f29869d) * 31)) * 31);
    }
}
