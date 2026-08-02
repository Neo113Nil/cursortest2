package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3106dO {

    /* renamed from: a, reason: collision with root package name */
    public final C3860rQ f30532a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30534c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30535d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30536e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30537f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30538g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30539h;

    public C3106dO(C3860rQ c3860rQ, long j6, long j9, long j10, long j11, boolean z6, boolean z9, boolean z10) {
        AbstractC2792Sd.i(!z10 || z6);
        AbstractC2792Sd.i(!z9 || z6);
        this.f30532a = c3860rQ;
        this.f30533b = j6;
        this.f30534c = j9;
        this.f30535d = j10;
        this.f30536e = j11;
        this.f30537f = z6;
        this.f30538g = z9;
        this.f30539h = z10;
    }

    public final C3106dO a(long j6, long j9) {
        if (j6 == this.f30533b && j9 == this.f30534c) {
            return this;
        }
        return new C3106dO(this.f30532a, j6, j9, this.f30535d, this.f30536e, this.f30537f, this.f30538g, this.f30539h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3106dO.class == obj.getClass()) {
            C3106dO c3106dO = (C3106dO) obj;
            if (this.f30533b == c3106dO.f30533b && this.f30535d == c3106dO.f30535d && this.f30536e == c3106dO.f30536e && this.f30537f == c3106dO.f30537f && this.f30538g == c3106dO.f30538g && this.f30539h == c3106dO.f30539h && Objects.equals(this.f30532a, c3106dO.f30532a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f30532a.hashCode() + 527) * 31) + ((int) this.f30533b)) * 31) + ((int) this.f30535d)) * 31) + ((int) this.f30536e)) * 961) + (this.f30537f ? 1 : 0)) * 31) + (this.f30538g ? 1 : 0)) * 31) + (this.f30539h ? 1 : 0);
    }
}
