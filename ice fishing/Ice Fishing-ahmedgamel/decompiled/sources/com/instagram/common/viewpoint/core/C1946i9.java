package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1946i9 implements InterfaceC1164Ou {
    private C1165Ov A00(InterfaceC1163Ot interfaceC1163Ot) {
        return (C1165Ov) interfaceC1163Ot.A7E();
    }

    public final void A01(InterfaceC1163Ot interfaceC1163Ot) {
        if (!interfaceC1163Ot.A9R()) {
            interfaceC1163Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC1163Ot);
        float A8r = A8r(interfaceC1163Ot);
        float elevation = AbstractC1167Ox.A00(A8S, A8r, interfaceC1163Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1167Ox.A01(A8S, A8r, interfaceC1163Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC1163Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final ColorStateList A71(InterfaceC1163Ot interfaceC1163Ot) {
        return A00(interfaceC1163Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final float A7v(InterfaceC1163Ot interfaceC1163Ot) {
        return interfaceC1163Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final float A8S(InterfaceC1163Ot interfaceC1163Ot) {
        return A00(interfaceC1163Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final float A8X(InterfaceC1163Ot interfaceC1163Ot) {
        return A8r(interfaceC1163Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final float A8Y(InterfaceC1163Ot interfaceC1163Ot) {
        return A8r(interfaceC1163Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final float A8r(InterfaceC1163Ot interfaceC1163Ot) {
        return A00(interfaceC1163Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AAG(InterfaceC1163Ot interfaceC1163Ot, Context context, ColorStateList colorStateList, float f2, float f9, float f10) {
        C1165Ov background = new C1165Ov(colorStateList, f2);
        interfaceC1163Ot.AJK(background);
        View view = interfaceC1163Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f9);
        AJX(interfaceC1163Ot, f10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void ADP(InterfaceC1163Ot interfaceC1163Ot) {
        AJX(interfaceC1163Ot, A8S(interfaceC1163Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AFT(InterfaceC1163Ot interfaceC1163Ot) {
        AJX(interfaceC1163Ot, A8S(interfaceC1163Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AJJ(InterfaceC1163Ot interfaceC1163Ot, ColorStateList colorStateList) {
        A00(interfaceC1163Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AJP(InterfaceC1163Ot interfaceC1163Ot, float f2) {
        interfaceC1163Ot.A7F().setElevation(f2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AJX(InterfaceC1163Ot interfaceC1163Ot, float f2) {
        A00(interfaceC1163Ot).A07(f2, interfaceC1163Ot.A9R(), interfaceC1163Ot.A8q());
        A01(interfaceC1163Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1164Ou
    public final void AJj(InterfaceC1163Ot interfaceC1163Ot, float f2) {
        A00(interfaceC1163Ot).A06(f2);
    }
}
