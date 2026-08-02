package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9544a = new v(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f9545b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9546c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9547d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9548e;

    public v(float f2) {
        this(f2, 1.0f, false);
    }

    public final long a(long j6) {
        return j6 * this.f9548e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f9545b == vVar.f9545b && this.f9546c == vVar.f9546c && this.f9547d == vVar.f9547d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f9546c) + ((Float.floatToRawIntBits(this.f9545b) + 527) * 31)) * 31) + (this.f9547d ? 1 : 0);
    }

    public v(float f2, float f9) {
        this(f2, f9, false);
    }

    public v(float f2, float f9, boolean z6) {
        com.anythink.basead.exoplayer.k.a.a(f2 > 0.0f);
        com.anythink.basead.exoplayer.k.a.a(f9 > 0.0f);
        this.f9545b = f2;
        this.f9546c = f9;
        this.f9547d = z6;
        this.f9548e = Math.round(f2 * 1000.0f);
    }
}
