package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1352Xf implements ViewpointAction<C1296Uw, V1> {
    public XM A00;

    public C1352Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.instagram.common.viewpoint.core.ViewpointAction
    public final void A6R(C2448rN<C1296Uw, V1> c2448rN, InterfaceC2439rD interfaceC2439rD) {
        switch (interfaceC2439rD.A9U(c2448rN)) {
            case A02:
            case A04:
                this.A00.A02(c2448rN, interfaceC2439rD);
                break;
        }
    }
}
