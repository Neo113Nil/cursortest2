package com.google.android.gms.internal.ads;

import android.util.Range;

/* renamed from: com.google.android.gms.internal.ads.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3488l0 {

    /* renamed from: a, reason: collision with root package name */
    public long f31676a;

    /* renamed from: b, reason: collision with root package name */
    public long f31677b;

    /* renamed from: c, reason: collision with root package name */
    public double f31678c;

    /* renamed from: d, reason: collision with root package name */
    public Range f31679d;

    public C3488l0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f31679d = range;
        this.f31678c = ((Double) range.getUpper()).doubleValue();
        this.f31676a = com.anythink.basead.exoplayer.b.f6382b;
        this.f31677b = com.anythink.basead.exoplayer.b.f6382b;
    }

    public final void a(long j6, long j9) {
        double doubleValue;
        AbstractC2772Sd.i(j6 != com.anythink.basead.exoplayer.b.f6382b);
        AbstractC2772Sd.i(j9 != com.anythink.basead.exoplayer.b.f6382b);
        long j10 = this.f31676a;
        if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
            if (this.f31677b != com.anythink.basead.exoplayer.b.f6382b && j6 != j10) {
                doubleValue = (j9 - r4) / (j6 - j10);
                this.f31678c = (((Double) this.f31679d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f31678c * 0.800000011920929d);
                this.f31676a = j6;
                this.f31677b = j9;
            }
        }
        doubleValue = ((Double) this.f31679d.getUpper()).doubleValue();
        this.f31678c = (((Double) this.f31679d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f31678c * 0.800000011920929d);
        this.f31676a = j6;
        this.f31677b = j9;
    }

    public final void b(float f3) {
        AbstractC2772Sd.i(f3 > 0.0f);
        this.f31679d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f3));
        c();
    }

    public final void c() {
        this.f31678c = ((Double) this.f31679d.getUpper()).doubleValue();
        this.f31676a = com.anythink.basead.exoplayer.b.f6382b;
        this.f31677b = com.anythink.basead.exoplayer.b.f6382b;
    }
}
