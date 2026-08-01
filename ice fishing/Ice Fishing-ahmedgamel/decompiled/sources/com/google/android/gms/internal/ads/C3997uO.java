package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3997uO {

    /* renamed from: b, reason: collision with root package name */
    public static final C3997uO f34532b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3997uO f34533c;

    /* renamed from: a, reason: collision with root package name */
    public final long f34534a;

    static {
        C3997uO c3997uO = new C3997uO(0L);
        f34532b = new C3997uO(Long.MAX_VALUE);
        f34533c = c3997uO;
    }

    public C3997uO(long j6) {
        this.f34534a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3997uO.class == obj.getClass() && this.f34534a == ((C3997uO) obj).f34534a;
    }

    public final int hashCode() {
        return ((int) this.f34534a) * 31;
    }
}
