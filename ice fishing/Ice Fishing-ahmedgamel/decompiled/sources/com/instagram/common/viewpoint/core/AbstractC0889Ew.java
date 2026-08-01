package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0889Ew {
    public InterfaceC0888Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0890Ex A0b(InterfaceC07197p[] interfaceC07197pArr, C2230nW c2230nW, C2248no c2248no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC06243y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0888Ev interfaceC0888Ev, F6 f62) {
        this.A00 = interfaceC0888Ev;
        this.A01 = f62;
    }
}
