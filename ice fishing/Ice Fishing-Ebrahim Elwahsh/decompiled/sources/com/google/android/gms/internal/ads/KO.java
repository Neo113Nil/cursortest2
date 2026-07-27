package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class KO {

    /* renamed from: a, reason: collision with root package name */
    public final long f25959a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3832r8 f25960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25961c;

    /* renamed from: d, reason: collision with root package name */
    public final BQ f25962d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25963e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3832r8 f25964f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25965g;

    /* renamed from: h, reason: collision with root package name */
    public final BQ f25966h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f25967j;

    public KO(long j9, AbstractC3832r8 abstractC3832r8, int i, BQ bq, long j10, AbstractC3832r8 abstractC3832r82, int i4, BQ bq2, long j11, long j12) {
        this.f25959a = j9;
        this.f25960b = abstractC3832r8;
        this.f25961c = i;
        this.f25962d = bq;
        this.f25963e = j10;
        this.f25964f = abstractC3832r82;
        this.f25965g = i4;
        this.f25966h = bq2;
        this.i = j11;
        this.f25967j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && KO.class == obj.getClass()) {
            KO ko = (KO) obj;
            if (this.f25959a == ko.f25959a && this.f25961c == ko.f25961c && this.f25963e == ko.f25963e && this.f25965g == ko.f25965g && this.i == ko.i && this.f25967j == ko.f25967j && Objects.equals(this.f25960b, ko.f25960b) && Objects.equals(this.f25962d, ko.f25962d) && Objects.equals(this.f25964f, ko.f25964f) && Objects.equals(this.f25966h, ko.f25966h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f25959a), this.f25960b, Integer.valueOf(this.f25961c), this.f25962d, Long.valueOf(this.f25963e), this.f25964f, Integer.valueOf(this.f25965g), this.f25966h, Long.valueOf(this.i), Long.valueOf(this.f25967j));
    }
}
