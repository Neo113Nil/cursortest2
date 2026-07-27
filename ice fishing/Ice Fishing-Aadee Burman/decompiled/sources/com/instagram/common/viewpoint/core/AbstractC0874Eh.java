package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0874Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0874Eh<T extends AbstractC0874Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2400qI A02;
    public final C2363pg A03;

    public abstract int A08();

    public abstract boolean A09(T t6);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0874Eh(int i, C2363pg c2363pg, int i6) {
        this.A00 = i;
        this.A03 = c2363pg;
        this.A01 = i6;
        this.A02 = c2363pg.A08(i6);
    }
}
