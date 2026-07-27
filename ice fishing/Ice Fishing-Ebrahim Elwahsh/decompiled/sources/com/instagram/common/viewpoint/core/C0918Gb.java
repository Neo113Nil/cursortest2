package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0918Gb implements InterfaceC1495b8 {
    public final /* synthetic */ C06484x A00;

    public C0918Gb(C06484x c06484x) {
        this.A00 = c06484x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1495b8
    public final void AE7(C1494b7 c1494b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1494b7.A00() != null);
        this.A00.A06();
    }
}
