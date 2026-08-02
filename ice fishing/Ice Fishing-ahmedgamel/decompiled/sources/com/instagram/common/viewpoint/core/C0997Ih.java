package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0997Ih implements InterfaceC1516b8 {
    public final /* synthetic */ C06795h A00;

    public C0997Ih(C06795h c06795h) {
        this.A00 = c06795h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1516b8
    public final void AE7(C1515b7 c1515b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c1515b7.A00() != null);
        this.A00.A07();
    }
}
