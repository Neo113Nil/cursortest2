package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4020uO {

    /* renamed from: b, reason: collision with root package name */
    public static final C4020uO f35306b;

    /* renamed from: c, reason: collision with root package name */
    public static final C4020uO f35307c;

    /* renamed from: a, reason: collision with root package name */
    public final long f35308a;

    static {
        C4020uO c4020uO = new C4020uO(0L);
        f35306b = new C4020uO(Long.MAX_VALUE);
        f35307c = c4020uO;
    }

    public C4020uO(long j6) {
        this.f35308a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4020uO.class == obj.getClass() && this.f35308a == ((C4020uO) obj).f35308a;
    }

    public final int hashCode() {
        return ((int) this.f35308a) * 31;
    }
}
