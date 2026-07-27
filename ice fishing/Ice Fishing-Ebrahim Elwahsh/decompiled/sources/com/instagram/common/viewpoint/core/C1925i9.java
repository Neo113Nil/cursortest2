package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1925i9 implements InterfaceC1143Ou {
    private C1144Ov A00(InterfaceC1142Ot interfaceC1142Ot) {
        return (C1144Ov) interfaceC1142Ot.A7E();
    }

    public final void A01(InterfaceC1142Ot interfaceC1142Ot) {
        if (!interfaceC1142Ot.A9R()) {
            interfaceC1142Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC1142Ot);
        float A8r = A8r(interfaceC1142Ot);
        float elevation = AbstractC1146Ox.A00(A8S, A8r, interfaceC1142Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1146Ox.A01(A8S, A8r, interfaceC1142Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC1142Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final ColorStateList A71(InterfaceC1142Ot interfaceC1142Ot) {
        return A00(interfaceC1142Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final float A7v(InterfaceC1142Ot interfaceC1142Ot) {
        return interfaceC1142Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final float A8S(InterfaceC1142Ot interfaceC1142Ot) {
        return A00(interfaceC1142Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final float A8X(InterfaceC1142Ot interfaceC1142Ot) {
        return A8r(interfaceC1142Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final float A8Y(InterfaceC1142Ot interfaceC1142Ot) {
        return A8r(interfaceC1142Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final float A8r(InterfaceC1142Ot interfaceC1142Ot) {
        return A00(interfaceC1142Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AAG(InterfaceC1142Ot interfaceC1142Ot, Context context, ColorStateList colorStateList, float f6, float f9, float f10) {
        C1144Ov background = new C1144Ov(colorStateList, f6);
        interfaceC1142Ot.AJK(background);
        View view = interfaceC1142Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f9);
        AJX(interfaceC1142Ot, f10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void ADP(InterfaceC1142Ot interfaceC1142Ot) {
        AJX(interfaceC1142Ot, A8S(interfaceC1142Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AFT(InterfaceC1142Ot interfaceC1142Ot) {
        AJX(interfaceC1142Ot, A8S(interfaceC1142Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AJJ(InterfaceC1142Ot interfaceC1142Ot, ColorStateList colorStateList) {
        A00(interfaceC1142Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AJP(InterfaceC1142Ot interfaceC1142Ot, float f6) {
        interfaceC1142Ot.A7F().setElevation(f6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AJX(InterfaceC1142Ot interfaceC1142Ot, float f6) {
        A00(interfaceC1142Ot).A07(f6, interfaceC1142Ot.A9R(), interfaceC1142Ot.A8q());
        A01(interfaceC1142Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1143Ou
    public final void AJj(InterfaceC1142Ot interfaceC1142Ot, float f6) {
        A00(interfaceC1142Ot).A06(f6);
    }
}
