package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0888Ew {
    public InterfaceC0887Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0889Ex A0b(InterfaceC07187p[] interfaceC07187pArr, C2229nW c2229nW, C2247no c2247no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC06233y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0887Ev interfaceC0887Ev, F6 f6) {
        this.A00 = interfaceC0887Ev;
        this.A01 = f6;
    }
}
