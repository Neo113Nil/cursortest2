package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3795qO {

    /* renamed from: a, reason: collision with root package name */
    public final BQ f33713a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33714b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33715c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33716d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33717e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33718f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33719g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33720h;

    public C3795qO(BQ bq, long j9, long j10, long j11, long j12, boolean z8, boolean z9, boolean z10) {
        PA.n(!z10 || z8);
        PA.n(!z9 || z8);
        this.f33713a = bq;
        this.f33714b = j9;
        this.f33715c = j10;
        this.f33716d = j11;
        this.f33717e = j12;
        this.f33718f = z8;
        this.f33719g = z9;
        this.f33720h = z10;
    }

    public final C3795qO a(long j9, long j10) {
        if (j9 == this.f33714b && j10 == this.f33715c) {
            return this;
        }
        return new C3795qO(this.f33713a, j9, j10, this.f33716d, this.f33717e, this.f33718f, this.f33719g, this.f33720h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3795qO.class == obj.getClass()) {
            C3795qO c3795qO = (C3795qO) obj;
            if (this.f33714b == c3795qO.f33714b && this.f33716d == c3795qO.f33716d && this.f33717e == c3795qO.f33717e && this.f33718f == c3795qO.f33718f && this.f33719g == c3795qO.f33719g && this.f33720h == c3795qO.f33720h && Objects.equals(this.f33713a, c3795qO.f33713a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f33713a.hashCode() + 527) * 31) + ((int) this.f33714b)) * 31) + ((int) this.f33716d)) * 31) + ((int) this.f33717e)) * 961) + (this.f33718f ? 1 : 0)) * 31) + (this.f33719g ? 1 : 0)) * 31) + (this.f33720h ? 1 : 0);
    }
}
