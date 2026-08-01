package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2285oQ implements InterfaceC06103k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC06103k.A00;
    public ByteBuffer A03 = InterfaceC06103k.A00;
    public C06083i A00 = C06083i.A05;
    public C06083i A01 = C06083i.A05;
    public C06083i A05 = C06083i.A05;
    public C06083i A06 = C06083i.A05;

    public abstract C06083i A09(C06083i c06083i) throws C06093j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public final C06083i A57(C06083i c06083i) throws C06093j {
        this.A00 = c06083i;
        this.A01 = A09(c06083i);
        return AAL() ? this.A01 : C06083i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC06103k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public boolean AAL() {
        return this.A01 != C06083i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC06103k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103k
    public final void flush() {
        this.A03 = InterfaceC06103k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
