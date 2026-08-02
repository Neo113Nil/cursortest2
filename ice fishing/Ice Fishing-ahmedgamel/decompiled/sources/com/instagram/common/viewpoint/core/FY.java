package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network/classes2.dex */
public final class FY extends RK implements InterfaceC1408Yo {
    public C1124Ng A00;
    public AbstractC1804fo A01;
    public C1805fp A02;
    public C1805fp A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1860gi A09;
    public final AnonymousClass67 A0A;

    public FY(AnonymousClass67 anonymousClass67, SparseBooleanArray sparseBooleanArray, C1805fp c1805fp, int i, int i4, int i6, int i9, C1860gi c1860gi, C1124Ng c1124Ng) {
        super(anonymousClass67);
        this.A09 = c1860gi;
        this.A0A = anonymousClass67;
        this.A08 = sparseBooleanArray;
        this.A02 = c1805fp;
        this.A04 = i;
        this.A05 = i4;
        this.A06 = i6;
        this.A07 = i9;
        this.A00 = c1124Ng;
    }

    private void A05(VA va, Y2 y22, String str, C1698e5 c1698e5) {
        if (this.A08.get(c1698e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C0915Fc(this, str, c1698e5, va, c1698e5.A04(), y22);
        this.A03 = new C1805fp(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new FZ(this, c1698e5));
    }

    public final ViewOnClickListenerC1058Kr A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C1698e5 c1698e5, VA va, C1266Sx c1266Sx, Y2 y22, String str) {
        int A02 = c1698e5.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1698e5.A03().A0H().A08();
        String A09 = c1698e5.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A0A.A1V()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c1266Sx.A0T(A09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1698e5.A03().A0I().A0G(), c1698e5.A03().A0I().A04());
        this.A0A.setCTAInfo(c1698e5.A03().A0J(), c1698e5.A04());
        this.A0A.A1Y(c1698e5.A04());
        A05(va, y22, str, c1698e5);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1408Yo
    public final void AJF() {
        this.A0A.A1Q();
    }
}
