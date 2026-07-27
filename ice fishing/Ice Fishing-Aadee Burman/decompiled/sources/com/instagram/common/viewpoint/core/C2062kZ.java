package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2062kZ implements InterfaceC1070Lx {
    public final InterfaceC1067Lu A00;

    public C2062kZ(InterfaceC1067Lu interfaceC1067Lu) {
        this.A00 = interfaceC1067Lu;
    }

    public final InterfaceC1067Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1070Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1070Lx
    public final C2066kd ACM() {
        return new C2066kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1070Lx
    public final C2066kd ACN(String str) {
        return new C2066kd(this, str);
    }
}
