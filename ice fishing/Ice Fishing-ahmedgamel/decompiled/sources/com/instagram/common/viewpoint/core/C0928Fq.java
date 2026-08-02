package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0928Fq extends RK implements InterfaceC1408Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C1124Ng A00;
    public AbstractC1804fo A01;
    public C1805fp A02;
    public C1805fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1860gi A06;
    public final C6M A07;

    public C0928Fq(C6M c6m, SparseBooleanArray sparseBooleanArray, C1805fp c1805fp, int i, C1860gi c1860gi, C1124Ng c1124Ng) {
        super(c6m);
        this.A06 = c1860gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c1805fp;
        this.A04 = i;
        this.A00 = c1124Ng;
    }

    private void A05(VA va, Y2 y22, String str, C1698e5 c1698e5) {
        if (this.A05.get(c1698e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C0930Fs(this, str, c1698e5, va, c1698e5.A04(), y22);
        this.A03 = new C1805fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C0929Fr(this, c1698e5));
    }

    public final void A0p(C1698e5 c1698e5, VA va, C1266Sx c1266Sx, Y2 y22, String str, int i, int i4, int i6) {
        int A02 = c1698e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c1698e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i6 : i4;
        if (A02 < this.A04 - 1) {
            i6 = i4;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i6, 0);
        String A082 = c1698e5.A03().A0H().A08();
        String A09 = c1698e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c1266Sx.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1698e5.A03().A0J(), c1698e5.A04());
        this.A07.A1W(c1698e5.A04());
        A05(va, y22, str, c1698e5);
    }

    public final void A0q(C1805fp c1805fp) {
        this.A02 = c1805fp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1408Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
