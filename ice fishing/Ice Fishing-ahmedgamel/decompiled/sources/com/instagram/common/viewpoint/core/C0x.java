package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0x, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0x extends C1F implements InterfaceC1695e2 {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC1412Ys A04;
    public boolean A05;
    public final C07196v A06;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C0x(C1860gi c1860gi) {
        super(c1860gi);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C07196v(c1860gi, new C1693e0(), new C1692dz());
        A02();
    }

    public C0x(C1860gi c1860gi, AttributeSet attributeSet) {
        super(c1860gi, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C07196v(c1860gi, new C1693e0(), new C1692dz());
        A02();
    }

    public C0x(C1860gi c1860gi, AttributeSet attributeSet, int i) {
        super(c1860gi, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C07196v(c1860gi, new C1693e0(), new C1692dz());
        A02();
    }

    private int A00(int i) {
        int i4 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i6 = (measuredWidth - spacing) - i4;
        int itemSize = getAdapter().A0B();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i4;
            spacing2 = (int) ((i6 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2C(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        YB.A0K(this);
    }

    private void A04(int i, int i4) {
        if (i == this.A03 && i4 == this.A02) {
            return;
        }
        this.A03 = i;
        this.A02 = i4;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1F
    public final void A20(int i, boolean z6) {
        super.A20(i, z6);
        A04(i, 0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1695e2
    public final int A8o(int i) {
        int abs = Math.abs(i);
        int scrollXAbs = ((C1F) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (abs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.C7M, android.view.View
    public final void onMeasure(int i, int i4) {
        int height;
        int itemSize;
        super.onMeasure(i, i4);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i6 = (int) XX.A02;
            int verticalPadding = C1310Up.A0F(getContext());
            height = (i6 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i4);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i4);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i4);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = C1407Yn.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C7M
    public void setAdapter(AbstractC1208Qq abstractC1208Qq) {
        this.A06.A2J(abstractC1208Qq == null ? -1 : abstractC1208Qq.hashCode());
        super.setAdapter(abstractC1208Qq);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i4 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i6 = i4 - pageWidth2;
        C07196v c07196v = this.A06;
        int pageWidth3 = this.A01;
        c07196v.A2K((i6 - pageWidth3) / 2);
        C07196v c07196v2 = this.A06;
        int pageWidth4 = this.A01;
        c07196v2.A2I(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A20(i, false);
    }

    public void setOnPageChangedListener(InterfaceC1412Ys interfaceC1412Ys) {
        this.A04 = interfaceC1412Ys;
    }

    public void setShowTextInCarousel(boolean z6) {
        this.A05 = z6;
    }
}
