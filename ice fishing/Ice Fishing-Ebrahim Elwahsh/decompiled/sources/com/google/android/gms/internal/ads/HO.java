package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class HO {

    /* renamed from: b, reason: collision with root package name */
    public static final HO f25361b;

    /* renamed from: c, reason: collision with root package name */
    public static final HO f25362c;

    /* renamed from: a, reason: collision with root package name */
    public final long f25363a;

    static {
        HO ho = new HO(0L);
        f25361b = new HO(Long.MAX_VALUE);
        f25362c = ho;
    }

    public HO(long j9) {
        this.f25363a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && HO.class == obj.getClass() && this.f25363a == ((HO) obj).f25363a;
    }

    public final int hashCode() {
        return ((int) this.f25363a) * 31;
    }
}
