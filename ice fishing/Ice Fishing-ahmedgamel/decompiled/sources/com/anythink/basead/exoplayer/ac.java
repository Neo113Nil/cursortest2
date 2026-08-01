package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f6311a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f6312b;

    /* renamed from: c, reason: collision with root package name */
    public static final ac f6313c;

    /* renamed from: d, reason: collision with root package name */
    public static final ac f6314d;

    /* renamed from: e, reason: collision with root package name */
    public static final ac f6315e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6316f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6317g;

    static {
        ac acVar = new ac(0L, 0L);
        f6311a = acVar;
        f6312b = new ac(Long.MAX_VALUE, Long.MAX_VALUE);
        f6313c = new ac(Long.MAX_VALUE, 0L);
        f6314d = new ac(0L, Long.MAX_VALUE);
        f6315e = acVar;
    }

    public ac(long j6, long j9) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        com.anythink.basead.exoplayer.k.a.a(j9 >= 0);
        this.f6316f = j6;
        this.f6317g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ac.class == obj.getClass()) {
            ac acVar = (ac) obj;
            if (this.f6316f == acVar.f6316f && this.f6317g == acVar.f6317g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6316f) * 31) + ((int) this.f6317g);
    }
}
