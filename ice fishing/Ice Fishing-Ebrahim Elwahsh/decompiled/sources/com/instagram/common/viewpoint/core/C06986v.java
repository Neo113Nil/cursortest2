package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06986v extends C1909hr {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C06996w A03;
    public int[] A04;
    public final C1839gi A05;
    public final C1671dz A06;
    public final C1672e0 A07;

    public C06986v(C1839gi c1839gi, C1672e0 c1672e0, C1671dz c1671dz) {
        super(c1839gi);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1839gi;
        this.A07 = c1672e0;
        this.A06 = c1671dz;
        this.A01 = -1;
        this.A03 = new C06996w(this, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.R2
    public final void A1L(RA ra, RH rh, int i, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A28() == 1) || (mode2 == 1073741824 && A28() == 0)) {
            super.A1L(ra, rh, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (rh.A03() >= 1) {
                int i4 = A0Y() > 0 ? 1 : A0Y();
                for (int heightMode = 0; heightMode < i4; heightMode++) {
                    View A1o = A1o(heightMode);
                    if (A1o == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1o, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A28() == 0) {
                        iArr[0] = iArr[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArr[1] = this.A04[1] + A0i() + A0f();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArr[0] = this.A04[0] + A0g() + A0h();
                        }
                    }
                }
                int i9 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i9 != -1) {
                    this.A06.A00(this.A01, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A15(iArr[0], iArr[1]);
    }

    @Override // com.instagram.common.viewpoint.core.C1909hr, com.instagram.common.viewpoint.core.R2
    public final void A1r(int i) {
        A2D(i, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.C1909hr, com.instagram.common.viewpoint.core.R2
    public final void A1z(C7M c7m, RH rh, int i) {
        this.A03.A0A(i);
        A1N(this.A03);
    }

    public final void A2I(double d2) {
        if (d2 <= 0.0d) {
            d2 = 1.0d;
        }
        this.A00 = (float) (50.0d / d2);
        this.A03 = new C06996w(this, this.A05);
    }

    public final void A2J(int i) {
        this.A01 = i;
    }

    public final void A2K(int i) {
        this.A02 = i;
    }
}
