package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class KR implements InterfaceC1498aq {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public KR(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF7(String str) {
        C1489ah c1489ah;
        AbstractC2025jd abstractC2025jd;
        M3 m32;
        AbstractC2025jd abstractC2025jd2;
        M3 m33;
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        c1489ah = this.A00.A0H;
        YB.A0O(c1489ah, 8);
        abstractC2025jd = this.A00.A0E;
        if (abstractC2025jd.A1l()) {
            m32 = this.A00.A0I;
            if (m32 != null) {
                abstractC2025jd2 = this.A00.A0E;
                String A14 = abstractC2025jd2.A14();
                if (!TextUtils.isEmpty(A14)) {
                    m33 = this.A00.A0I;
                    m33.loadUrl(A14);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AF9(String str) {
        C1489ah c1489ah;
        boolean z6;
        int i;
        this.A00.A0T = true;
        c1489ah = this.A00.A0H;
        YB.A0O(c1489ah, 0);
        this.A00.setUrlToBrowser(str);
        z6 = this.A00.A0R;
        if (!z6) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0R = true;
                this.A00.A0h(A00(0, 19, 108));
            }
        }
        KE.A03(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFY(int i) {
        boolean z6;
        z6 = this.A00.A0T;
        if (z6) {
            this.A00.setBrowserProgressBarValue(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFb(String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1498aq
    public final void AFe() {
        C1577c7 c1577c7;
        c1577c7 = this.A00.A0J;
        c1577c7.A0C().ADJ(14);
    }
}
