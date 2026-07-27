package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0825Cj implements InterfaceC1827gV {
    @Override // com.instagram.common.viewpoint.core.InterfaceC1827gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1827gV
    public final void AK4(Object obj, long j6) throws InterruptedException {
        obj.wait(j6);
    }
}
