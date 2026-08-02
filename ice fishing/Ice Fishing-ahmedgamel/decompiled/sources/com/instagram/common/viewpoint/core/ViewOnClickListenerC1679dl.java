package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1679dl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0942Ge A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public ViewOnClickListenerC1679dl(C0942Ge c0942Ge) {
        this.A00 = c0942Ge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0999Ij abstractC0999Ij;
        AbstractC0999Ij abstractC0999Ij2;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC0999Ij = this.A00.A04;
            if (abstractC0999Ij != null) {
                abstractC0999Ij2 = this.A00.A04;
                abstractC0999Ij2.A1D(A00(0, 6, 84));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
