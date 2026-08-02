package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4182xO {

    /* renamed from: a, reason: collision with root package name */
    public final long f35785a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3627n8 f35786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35787c;

    /* renamed from: d, reason: collision with root package name */
    public final C3860rQ f35788d;

    /* renamed from: e, reason: collision with root package name */
    public final long f35789e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3627n8 f35790f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35791g;

    /* renamed from: h, reason: collision with root package name */
    public final C3860rQ f35792h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f35793j;

    public C4182xO(long j6, AbstractC3627n8 abstractC3627n8, int i, C3860rQ c3860rQ, long j9, AbstractC3627n8 abstractC3627n82, int i4, C3860rQ c3860rQ2, long j10, long j11) {
        this.f35785a = j6;
        this.f35786b = abstractC3627n8;
        this.f35787c = i;
        this.f35788d = c3860rQ;
        this.f35789e = j9;
        this.f35790f = abstractC3627n82;
        this.f35791g = i4;
        this.f35792h = c3860rQ2;
        this.i = j10;
        this.f35793j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4182xO.class == obj.getClass()) {
            C4182xO c4182xO = (C4182xO) obj;
            if (this.f35785a == c4182xO.f35785a && this.f35787c == c4182xO.f35787c && this.f35789e == c4182xO.f35789e && this.f35791g == c4182xO.f35791g && this.i == c4182xO.i && this.f35793j == c4182xO.f35793j && Objects.equals(this.f35786b, c4182xO.f35786b) && Objects.equals(this.f35788d, c4182xO.f35788d) && Objects.equals(this.f35790f, c4182xO.f35790f) && Objects.equals(this.f35792h, c4182xO.f35792h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f35785a), this.f35786b, Integer.valueOf(this.f35787c), this.f35788d, Long.valueOf(this.f35789e), this.f35790f, Integer.valueOf(this.f35791g), this.f35792h, Long.valueOf(this.i), Long.valueOf(this.f35793j));
    }
}
