package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0873Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0873Eh<T extends AbstractC0873Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2399qI A02;
    public final C2362pg A03;

    public abstract int A08();

    public abstract boolean A09(T t9);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0873Eh(int i, C2362pg c2362pg, int i4) {
        this.A00 = i;
        this.A03 = c2362pg;
        this.A01 = i4;
        this.A02 = c2362pg.A08(i4);
    }
}
