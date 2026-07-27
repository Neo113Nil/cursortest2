package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f8915a = new v(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f8916b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8917c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8918d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8919e;

    public v(float f6) {
        this(f6, 1.0f, false);
    }

    public final long a(long j9) {
        return j9 * this.f8919e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f8916b == vVar.f8916b && this.f8917c == vVar.f8917c && this.f8918d == vVar.f8918d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8917c) + ((Float.floatToRawIntBits(this.f8916b) + 527) * 31)) * 31) + (this.f8918d ? 1 : 0);
    }

    public v(float f6, float f9) {
        this(f6, f9, false);
    }

    public v(float f6, float f9, boolean z8) {
        C0544a.a(f6 > 0.0f);
        C0544a.a(f9 > 0.0f);
        this.f8916b = f6;
        this.f8917c = f9;
        this.f8918d = z8;
        this.f8919e = Math.round(f6 * 1000.0f);
    }
}
