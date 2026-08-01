package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07026y implements InterfaceC1270Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C07026y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C1265Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C1266Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C1312Vm c1312Vm) {
        WT.A00(new C1268Tt(this, c1312Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C1264Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1270Tv
    public final void AEq() {
        WT.A00(new C1267Ts(this));
    }
}
