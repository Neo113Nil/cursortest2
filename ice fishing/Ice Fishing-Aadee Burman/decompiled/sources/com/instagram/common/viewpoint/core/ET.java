package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ET extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C4L A00;

    public ET(C4L c4l) {
        this.A00 = c4l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C0877Ek c0877Ek;
        AbstractC0858Dr abstractC0858Dr;
        UN un;
        UN un2;
        UN un3;
        UN un4;
        UN un5;
        UN un6;
        UN un7;
        UN un8;
        E0 e02;
        UN un9;
        C1714eg c1714eg;
        C1714eg c1714eg2;
        c0877Ek = this.A00.A0C;
        UM<UN, UL> eventBus = c0877Ek.getEventBus();
        abstractC0858Dr = this.A00.A0E;
        un = this.A00.A06;
        un2 = this.A00.A08;
        un3 = this.A00.A05;
        un4 = this.A00.A04;
        un5 = this.A00.A03;
        un6 = this.A00.A07;
        un7 = this.A00.A0A;
        un8 = this.A00.A0B;
        e02 = this.A00.A0D;
        un9 = this.A00.A09;
        eventBus.A04(abstractC0858Dr, un, un2, un3, un4, un5, un6, un7, un8, e02, un9);
        c1714eg = this.A00.A01;
        if (c1714eg != null) {
            c1714eg2 = this.A00.A01;
            c1714eg2.A07();
        }
    }
}
