package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f7097a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f7098b;

    /* renamed from: c, reason: collision with root package name */
    public static final ac f7099c;

    /* renamed from: d, reason: collision with root package name */
    public static final ac f7100d;

    /* renamed from: e, reason: collision with root package name */
    public static final ac f7101e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7102f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7103g;

    static {
        ac acVar = new ac(0L, 0L);
        f7097a = acVar;
        f7098b = new ac(Long.MAX_VALUE, Long.MAX_VALUE);
        f7099c = new ac(Long.MAX_VALUE, 0L);
        f7100d = new ac(0L, Long.MAX_VALUE);
        f7101e = acVar;
    }

    public ac(long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j9 >= 0);
        this.f7102f = j6;
        this.f7103g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ac.class == obj.getClass()) {
            ac acVar = (ac) obj;
            if (this.f7102f == acVar.f7102f && this.f7103g == acVar.f7103g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7102f) * 31) + ((int) this.f7103g);
    }
}
