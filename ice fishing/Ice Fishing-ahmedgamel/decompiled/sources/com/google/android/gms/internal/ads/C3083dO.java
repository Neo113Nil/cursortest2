package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3083dO {

    /* renamed from: a, reason: collision with root package name */
    public final C3676oQ f29760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29761b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29762c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29763d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29764e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29765f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f29766g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29767h;

    public C3083dO(C3676oQ c3676oQ, long j6, long j9, long j10, long j11, boolean z3, boolean z6, boolean z9) {
        AbstractC2772Sd.i(!z9 || z3);
        AbstractC2772Sd.i(!z6 || z3);
        this.f29760a = c3676oQ;
        this.f29761b = j6;
        this.f29762c = j9;
        this.f29763d = j10;
        this.f29764e = j11;
        this.f29765f = z3;
        this.f29766g = z6;
        this.f29767h = z9;
    }

    public final C3083dO a(long j6, long j9) {
        if (j6 == this.f29761b && j9 == this.f29762c) {
            return this;
        }
        return new C3083dO(this.f29760a, j6, j9, this.f29763d, this.f29764e, this.f29765f, this.f29766g, this.f29767h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3083dO.class == obj.getClass()) {
            C3083dO c3083dO = (C3083dO) obj;
            if (this.f29761b == c3083dO.f29761b && this.f29763d == c3083dO.f29763d && this.f29764e == c3083dO.f29764e && this.f29765f == c3083dO.f29765f && this.f29766g == c3083dO.f29766g && this.f29767h == c3083dO.f29767h && Objects.equals(this.f29760a, c3083dO.f29760a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f29760a.hashCode() + 527) * 31) + ((int) this.f29761b)) * 31) + ((int) this.f29763d)) * 31) + ((int) this.f29764e)) * 961) + (this.f29765f ? 1 : 0)) * 31) + (this.f29766g ? 1 : 0)) * 31) + (this.f29767h ? 1 : 0);
    }
}
