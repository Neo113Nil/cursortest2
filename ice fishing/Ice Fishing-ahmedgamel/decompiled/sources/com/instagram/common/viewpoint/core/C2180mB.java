package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;

/* renamed from: com.facebook.ads.redexgen.X.mB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2180mB implements InterfaceC1012Ix {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C06674v A04;

    public C2180mB(C2182mD c2182mD) {
        this.A04 = c2182mD.A00;
        this.A04.A0f(12);
        this.A02 = this.A04.A0L() & p.f9259b;
        this.A03 = this.A04.A0L();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1012Ix
    public final int A8A() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1012Ix
    public final int A8v() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1012Ix
    public final int AHS() {
        if (this.A02 == 8) {
            return this.A04.A0I();
        }
        if (this.A02 == 16) {
            return this.A04.A0M();
        }
        int i = this.A01;
        this.A01 = i + 1;
        if (i % 2 == 0) {
            this.A00 = this.A04.A0I();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
