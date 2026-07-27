package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.j.a.b;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2057kV implements C5V {
    public MP A02;
    public long A01 = 5242880;
    public int A00 = b.f8178a;

    public final C2057kV A00(MP mp) {
        this.A02 = mp;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C5V
    public final C2056kU A5H() {
        return new C2056kU((MP) AbstractC06233y.A01(this.A02), this.A01, this.A00);
    }
}
