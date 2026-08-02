package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2082kZ implements InterfaceC1090Lx {
    public final InterfaceC1087Lu A00;

    public C2082kZ(InterfaceC1087Lu interfaceC1087Lu) {
        this.A00 = interfaceC1087Lu;
    }

    public final InterfaceC1087Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1090Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1090Lx
    public final C2086kd ACM() {
        return new C2086kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1090Lx
    public final C2086kd ACN(String str) {
        return new C2086kd(this, str);
    }
}
