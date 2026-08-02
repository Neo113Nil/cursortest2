package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0984Hu {
    public final InterfaceC0967Hd A00;

    public abstract boolean A0B(C06674v c06674v) throws C3K;

    public abstract boolean A0C(C06674v c06674v, long j6) throws C3K;

    public AbstractC0984Hu(InterfaceC0967Hd interfaceC0967Hd) {
        this.A00 = interfaceC0967Hd;
    }

    public final boolean A00(C06674v c06674v, long j6) throws C3K {
        return A0B(c06674v) && A0C(c06674v, j6);
    }
}
