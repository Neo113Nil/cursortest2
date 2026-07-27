package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.k4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2031k4 implements SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass81 A01;
    public final /* synthetic */ AnonymousClass81 A02;
    public final /* synthetic */ C1271Tx A03;

    public C2031k4(AnonymousClass81 anonymousClass81, int i, C1271Tx c1271Tx, AnonymousClass81 anonymousClass812) {
        this.A01 = anonymousClass81;
        this.A00 = i;
        this.A03 = c1271Tx;
        this.A02 = anonymousClass812;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        N9 n9;
        n9 = this.A01.A00;
        n9.AEN(this.A02, C1311Vm.A00(AdErrorType.NO_FILL));
    }
}
