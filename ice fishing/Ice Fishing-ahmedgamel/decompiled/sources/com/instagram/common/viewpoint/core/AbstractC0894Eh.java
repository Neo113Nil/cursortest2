package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0894Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0894Eh<T extends AbstractC0894Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2420qI A02;
    public final C2383pg A03;

    public abstract int A08();

    public abstract boolean A09(T t6);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0894Eh(int i, C2383pg c2383pg, int i4) {
        this.A00 = i;
        this.A03 = c2383pg;
        this.A01 = i4;
        this.A02 = c2383pg.A08(i4);
    }
}
