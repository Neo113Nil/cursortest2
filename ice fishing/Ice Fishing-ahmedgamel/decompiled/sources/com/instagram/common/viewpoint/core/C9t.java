package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i, int i6, boolean z3) {
        return this.A00.A08(i, i6, z3);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z3) {
        return this.A00.A0B(z3);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z3) {
        return this.A00.A0C(z3);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2367pl A0I(int i, C2367pl c2367pl, boolean z3) {
        return this.A00.A0I(i, c2367pl, z3);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2365pj A0L(int i, C2365pj c2365pj, long j6) {
        return this.A00.A0L(i, c2365pj, j6);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i) {
        return this.A00.A0M(i);
    }
}
