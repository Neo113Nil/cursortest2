package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f8758a = new v(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f8759b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8760c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8761d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8762e;

    public v(float f3) {
        this(f3, 1.0f, false);
    }

    public final long a(long j6) {
        return j6 * this.f8762e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f8759b == vVar.f8759b && this.f8760c == vVar.f8760c && this.f8761d == vVar.f8761d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8760c) + ((Float.floatToRawIntBits(this.f8759b) + 527) * 31)) * 31) + (this.f8761d ? 1 : 0);
    }

    public v(float f3, float f9) {
        this(f3, f9, false);
    }

    public v(float f3, float f9, boolean z3) {
        com.anythink.basead.exoplayer.k.a.a(f3 > 0.0f);
        com.anythink.basead.exoplayer.k.a.a(f9 > 0.0f);
        this.f8759b = f3;
        this.f8760c = f9;
        this.f8761d = z3;
        this.f8762e = Math.round(f3 * 1000.0f);
    }
}
