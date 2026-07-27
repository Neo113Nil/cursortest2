package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass77 extends C1885hS {
    public AnonymousClass77(C1201Re c1201Re) {
        super(c1201Re);
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final /* bridge */ /* synthetic */ void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A44(view, i, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final /* bridge */ /* synthetic */ void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A45(view, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final void A4j(String str) {
        super.A4j(str);
        if (this.A00.get() == null) {
            return;
        }
        String A03 = EnumC1732ez.A08.A03();
        String rewardedVideoError = EnumC1732ez.A09.A03();
        if (str.equals(A03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final /* bridge */ /* synthetic */ void A4k(String str, UL ul) {
        super.A4k(str, ul);
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final /* bridge */ /* synthetic */ void AAo(String str, C1109Nm c1109Nm) {
        super.AAo(str, c1109Nm);
    }

    @Override // com.instagram.common.viewpoint.core.C1885hS, com.instagram.common.viewpoint.core.InterfaceC1380Yh
    public final /* bridge */ /* synthetic */ void ADJ(int i) {
        super.ADJ(i);
    }
}
