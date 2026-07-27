package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC2320oz implements InterfaceC1004Jj {
    public long A00;
    public InterfaceC1004Jj A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2320oz
    public abstract void A0B();

    @Override // com.instagram.common.viewpoint.core.AbstractC06725u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j6, InterfaceC1004Jj interfaceC1004Jj, long j9) {
        super.A01 = j6;
        this.A01 = interfaceC1004Jj;
        if (j9 == Long.MAX_VALUE) {
            j9 = super.A01;
        }
        this.A00 = j9;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final List<C2350pT> A7X(long j6) {
        return ((InterfaceC1004Jj) AbstractC06243y.A01(this.A01)).A7X(j6 - this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final long A83(int i) {
        return ((InterfaceC1004Jj) AbstractC06243y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A84() {
        return ((InterfaceC1004Jj) AbstractC06243y.A01(this.A01)).A84();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A8a(long j6) {
        return ((InterfaceC1004Jj) AbstractC06243y.A01(this.A01)).A8a(j6 - this.A00);
    }
}
