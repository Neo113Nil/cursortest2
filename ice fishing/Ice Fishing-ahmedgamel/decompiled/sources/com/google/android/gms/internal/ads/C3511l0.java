package com.google.android.gms.internal.ads;

import android.util.Range;

/* renamed from: com.google.android.gms.internal.ads.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3511l0 {

    /* renamed from: a, reason: collision with root package name */
    public long f32456a;

    /* renamed from: b, reason: collision with root package name */
    public long f32457b;

    /* renamed from: c, reason: collision with root package name */
    public double f32458c;

    /* renamed from: d, reason: collision with root package name */
    public Range f32459d;

    public C3511l0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f32459d = range;
        this.f32458c = ((Double) range.getUpper()).doubleValue();
        this.f32456a = com.anythink.basead.exoplayer.b.f7168b;
        this.f32457b = com.anythink.basead.exoplayer.b.f7168b;
    }

    public final void a(long j6, long j9) {
        double doubleValue;
        AbstractC2792Sd.i(j6 != com.anythink.basead.exoplayer.b.f7168b);
        AbstractC2792Sd.i(j9 != com.anythink.basead.exoplayer.b.f7168b);
        long j10 = this.f32456a;
        if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
            if (this.f32457b != com.anythink.basead.exoplayer.b.f7168b && j6 != j10) {
                doubleValue = (j9 - r4) / (j6 - j10);
                this.f32458c = (((Double) this.f32459d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f32458c * 0.800000011920929d);
                this.f32456a = j6;
                this.f32457b = j9;
            }
        }
        doubleValue = ((Double) this.f32459d.getUpper()).doubleValue();
        this.f32458c = (((Double) this.f32459d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f32458c * 0.800000011920929d);
        this.f32456a = j6;
        this.f32457b = j9;
    }

    public final void b(float f2) {
        AbstractC2792Sd.i(f2 > 0.0f);
        this.f32459d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f2));
        c();
    }

    public final void c() {
        this.f32458c = ((Double) this.f32459d.getUpper()).doubleValue();
        this.f32456a = com.anythink.basead.exoplayer.b.f7168b;
        this.f32457b = com.anythink.basead.exoplayer.b.f7168b;
    }
}
