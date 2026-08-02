package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07226y implements InterfaceC1290Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C07226y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C1285Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C1286Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C1332Vm c1332Vm) {
        WT.A00(new C1288Tt(this, c1332Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C1284Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1290Tv
    public final void AEq() {
        WT.A00(new C1287Ts(this));
    }
}
