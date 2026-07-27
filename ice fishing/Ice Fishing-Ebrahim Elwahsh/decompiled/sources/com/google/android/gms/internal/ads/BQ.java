package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BQ {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24045c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24047e;

    public BQ(Object obj, int i, int i4, long j9, int i9) {
        this.f24043a = obj;
        this.f24044b = i;
        this.f24045c = i4;
        this.f24046d = j9;
        this.f24047e = i9;
    }

    public final BQ a(Object obj) {
        return this.f24043a.equals(obj) ? this : new BQ(obj, this.f24044b, this.f24045c, this.f24046d, this.f24047e);
    }

    public final boolean b() {
        return this.f24044b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BQ)) {
            return false;
        }
        BQ bq = (BQ) obj;
        return this.f24043a.equals(bq.f24043a) && this.f24044b == bq.f24044b && this.f24045c == bq.f24045c && this.f24046d == bq.f24046d && this.f24047e == bq.f24047e;
    }

    public final int hashCode() {
        return ((((((((this.f24043a.hashCode() + 527) * 31) + this.f24044b) * 31) + this.f24045c) * 31) + ((int) this.f24046d)) * 31) + this.f24047e;
    }

    public BQ(long j9, Object obj) {
        this(obj, -1, -1, j9, -1);
    }

    public BQ(Object obj, long j9, int i) {
        this(obj, -1, -1, j9, i);
    }
}
