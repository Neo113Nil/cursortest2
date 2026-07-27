package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0977Ih implements InterfaceC1496b8 {
    public final /* synthetic */ C06595h A00;

    public C0977Ih(C06595h c06595h) {
        this.A00 = c06595h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1496b8
    public final void AE7(C1495b7 c1495b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1495b7.A00() != null);
        this.A00.A07();
    }
}
