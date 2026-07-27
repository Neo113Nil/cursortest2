package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0919Gb implements InterfaceC1496b8 {
    public final /* synthetic */ C06494x A00;

    public C0919Gb(C06494x c06494x) {
        this.A00 = c06494x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1496b8
    public final void AE7(C1495b7 c1495b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1495b7.A00() != null);
        this.A00.A06();
    }
}
