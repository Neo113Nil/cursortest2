package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0964Hu {
    public final InterfaceC0947Hd A00;

    public abstract boolean A0B(C06474v c06474v) throws C3K;

    public abstract boolean A0C(C06474v c06474v, long j6) throws C3K;

    public AbstractC0964Hu(InterfaceC0947Hd interfaceC0947Hd) {
        this.A00 = interfaceC0947Hd;
    }

    public final boolean A00(C06474v c06474v, long j6) throws C3K {
        return A0B(c06474v) && A0C(c06474v, j6);
    }
}
