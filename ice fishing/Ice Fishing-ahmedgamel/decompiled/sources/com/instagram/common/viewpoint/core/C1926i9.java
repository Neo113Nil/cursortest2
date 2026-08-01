package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1926i9 implements InterfaceC1144Ou {
    private C1145Ov A00(InterfaceC1143Ot interfaceC1143Ot) {
        return (C1145Ov) interfaceC1143Ot.A7E();
    }

    public final void A01(InterfaceC1143Ot interfaceC1143Ot) {
        if (!interfaceC1143Ot.A9R()) {
            interfaceC1143Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC1143Ot);
        float A8r = A8r(interfaceC1143Ot);
        float elevation = AbstractC1147Ox.A00(A8S, A8r, interfaceC1143Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1147Ox.A01(A8S, A8r, interfaceC1143Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC1143Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final ColorStateList A71(InterfaceC1143Ot interfaceC1143Ot) {
        return A00(interfaceC1143Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final float A7v(InterfaceC1143Ot interfaceC1143Ot) {
        return interfaceC1143Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final float A8S(InterfaceC1143Ot interfaceC1143Ot) {
        return A00(interfaceC1143Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final float A8X(InterfaceC1143Ot interfaceC1143Ot) {
        return A8r(interfaceC1143Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final float A8Y(InterfaceC1143Ot interfaceC1143Ot) {
        return A8r(interfaceC1143Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final float A8r(InterfaceC1143Ot interfaceC1143Ot) {
        return A00(interfaceC1143Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AAG(InterfaceC1143Ot interfaceC1143Ot, Context context, ColorStateList colorStateList, float f3, float f9, float f10) {
        C1145Ov background = new C1145Ov(colorStateList, f3);
        interfaceC1143Ot.AJK(background);
        View view = interfaceC1143Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f9);
        AJX(interfaceC1143Ot, f10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void ADP(InterfaceC1143Ot interfaceC1143Ot) {
        AJX(interfaceC1143Ot, A8S(interfaceC1143Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AFT(InterfaceC1143Ot interfaceC1143Ot) {
        AJX(interfaceC1143Ot, A8S(interfaceC1143Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AJJ(InterfaceC1143Ot interfaceC1143Ot, ColorStateList colorStateList) {
        A00(interfaceC1143Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AJP(InterfaceC1143Ot interfaceC1143Ot, float f3) {
        interfaceC1143Ot.A7F().setElevation(f3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AJX(InterfaceC1143Ot interfaceC1143Ot, float f3) {
        A00(interfaceC1143Ot).A07(f3, interfaceC1143Ot.A9R(), interfaceC1143Ot.A8q());
        A01(interfaceC1143Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1144Ou
    public final void AJj(InterfaceC1143Ot interfaceC1143Ot, float f3) {
        A00(interfaceC1143Ot).A06(f3);
    }
}
