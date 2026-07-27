package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f6468a;

    /* renamed from: b, reason: collision with root package name */
    public static final ac f6469b;

    /* renamed from: c, reason: collision with root package name */
    public static final ac f6470c;

    /* renamed from: d, reason: collision with root package name */
    public static final ac f6471d;

    /* renamed from: e, reason: collision with root package name */
    public static final ac f6472e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6473f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6474g;

    static {
        ac acVar = new ac(0L, 0L);
        f6468a = acVar;
        f6469b = new ac(Long.MAX_VALUE, Long.MAX_VALUE);
        f6470c = new ac(Long.MAX_VALUE, 0L);
        f6471d = new ac(0L, Long.MAX_VALUE);
        f6472e = acVar;
    }

    public ac(long j9, long j10) {
        C0544a.a(j9 >= 0);
        C0544a.a(j10 >= 0);
        this.f6473f = j9;
        this.f6474g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ac.class == obj.getClass()) {
            ac acVar = (ac) obj;
            if (this.f6473f == acVar.f6473f && this.f6474g == acVar.f6474g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6473f) * 31) + ((int) this.f6474g);
    }
}
