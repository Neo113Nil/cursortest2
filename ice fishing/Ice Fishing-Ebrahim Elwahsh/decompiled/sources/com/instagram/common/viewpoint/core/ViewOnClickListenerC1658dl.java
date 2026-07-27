package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1658dl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0921Ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public ViewOnClickListenerC1658dl(C0921Ge c0921Ge) {
        this.A00 = c0921Ge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0978Ij abstractC0978Ij;
        AbstractC0978Ij abstractC0978Ij2;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC0978Ij = this.A00.A04;
            if (abstractC0978Ij != null) {
                abstractC0978Ij2 = this.A00.A04;
                abstractC0978Ij2.A1D(A00(0, 6, 84));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
