package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2246nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C07639p A01;

    public C2246nm(C07639p c07639p, int i) {
        this.A01 = c07639p;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        C2234na[] c2234naArr;
        c2234naArr = this.A01.A0L;
        return c2234naArr[this.A00].A0S();
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AHP(C07036z c07036z, C2321p0 c2321p0, int i) {
        return this.A01.A0Y(this.A00, c07036z, c2321p0, i);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AK2(long j6) {
        return this.A01.A0X(this.A00, j6);
    }
}
