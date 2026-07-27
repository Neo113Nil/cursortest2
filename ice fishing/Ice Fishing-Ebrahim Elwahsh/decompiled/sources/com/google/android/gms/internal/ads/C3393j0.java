package com.google.android.gms.internal.ads;

import android.util.Range;

/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3393j0 {

    /* renamed from: a, reason: collision with root package name */
    public long f32052a;

    /* renamed from: b, reason: collision with root package name */
    public long f32053b;

    /* renamed from: c, reason: collision with root package name */
    public double f32054c;

    /* renamed from: d, reason: collision with root package name */
    public Range f32055d;

    public C3393j0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f32055d = range;
        this.f32054c = ((Double) range.getUpper()).doubleValue();
        this.f32052a = com.anythink.basead.exoplayer.b.f6539b;
        this.f32053b = com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void a(long j9, long j10) {
        double doubleValue;
        PA.n(j9 != com.anythink.basead.exoplayer.b.f6539b);
        PA.n(j10 != com.anythink.basead.exoplayer.b.f6539b);
        long j11 = this.f32052a;
        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
            if (this.f32053b != com.anythink.basead.exoplayer.b.f6539b && j9 != j11) {
                doubleValue = (j10 - r4) / (j9 - j11);
                this.f32054c = (((Double) this.f32055d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f32054c * 0.800000011920929d);
                this.f32052a = j9;
                this.f32053b = j10;
            }
        }
        doubleValue = ((Double) this.f32055d.getUpper()).doubleValue();
        this.f32054c = (((Double) this.f32055d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f32054c * 0.800000011920929d);
        this.f32052a = j9;
        this.f32053b = j10;
    }

    public final void b(float f6) {
        PA.n(f6 > 0.0f);
        this.f32055d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f6));
        c();
    }

    public final void c() {
        this.f32054c = ((Double) this.f32055d.getUpper()).doubleValue();
        this.f32052a = com.anythink.basead.exoplayer.b.f6539b;
        this.f32053b = com.anythink.basead.exoplayer.b.f6539b;
    }
}
