package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0939Gb implements InterfaceC1516b8 {
    public final /* synthetic */ C06694x A00;

    public C0939Gb(C06694x c06694x) {
        this.A00 = c06694x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1516b8
    public final void AE7(C1515b7 c1515b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c1515b7.A00() != null);
        this.A00.A06();
    }
}
