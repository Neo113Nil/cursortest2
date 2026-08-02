package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3947t5 {

    /* renamed from: d, reason: collision with root package name */
    public static final C3947t5 f35001d = new C3947t5(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f35002a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35004c;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3947t5(float f2, float f9) {
        AbstractC2792Sd.i(f2 > 0.0f);
        AbstractC2792Sd.i(f9 > 0.0f);
        this.f35002a = f2;
        this.f35003b = f9;
        this.f35004c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3947t5.class == obj.getClass()) {
            C3947t5 c3947t5 = (C3947t5) obj;
            if (this.f35002a == c3947t5.f35002a && this.f35003b == c3947t5.f35003b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f35003b) + ((Float.floatToRawIntBits(this.f35002a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f35002a), Float.valueOf(this.f35003b)};
        String str = AbstractC3182eu.f30782a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
