package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1484aw extends RelativeLayout {
    public static InterfaceC1381Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1888hU A00;
    public C1840gi A01;
    public C0w A02;
    public M1 A03;
    public C1533bj A04;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (XX.A02 * 15.0f);
        A05 = new C1068Lv();
    }

    public C1484aw(C1840gi c1840gi) {
        super(c1840gi);
        this.A01 = c1840gi;
        this.A02 = new C0w(c1840gi);
        YB.A0K(this.A02);
        this.A00 = new C7N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1678e5> A01(AbstractC2005jd abstractC2005jd) {
        if (abstractC2005jd == null) {
            return new ArrayList<>();
        }
        List<NR> A2G = abstractC2005jd.A2G();
        ArrayList<C1678e5> arrayList = new ArrayList<>(A2G.size());
        for (int i = 0; i < A2G.size(); i++) {
            arrayList.add(new C1678e5(i, A2G.size(), A2G.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(UK uk, int i) {
        ArrayList<C1678e5> A01 = A01(uk.A13());
        this.A02.setCardsInfo(A01);
        this.A03 = new M1(this.A01, A01, uk.A13(), this.A01.A02().A0A(), uk, A05, uk.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = XX.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(uk, A01);
    }

    public final void A06(C1785fp c1785fp) {
        if (this.A03 != null) {
            this.A03.A0P(c1785fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC1252Td.A1v, new C1253Te(A00(0, 51, 125)));
        }
        this.A02.A20(c1785fp);
    }

    public static InterfaceC1381Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        if (z3 && this.A03 != null) {
            this.A03.A0O((i9 - i) - A07, 16, 0);
        }
        super.onLayout(z3, i, i6, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(UK uk, ArrayList<C1678e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1065Ls(this));
        this.A04 = new C1533bj(this.A01, uk.A13().A28().A01(), arrayList.size());
        YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
