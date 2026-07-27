package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0963Hu {
    public final InterfaceC0946Hd A00;

    public abstract boolean A0B(C06464v c06464v) throws C3K;

    public abstract boolean A0C(C06464v c06464v, long j9) throws C3K;

    public AbstractC0963Hu(InterfaceC0946Hd interfaceC0946Hd) {
        this.A00 = interfaceC0946Hd;
    }

    public final boolean A00(C06464v c06464v, long j9) throws C3K {
        return A0B(c06464v) && A0C(c06464v, j9);
    }
}
