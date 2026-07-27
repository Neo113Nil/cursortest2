package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class Z0 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ Z2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public Z0(Z2 z22) {
        this.A00 = z22;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1146Ow c1146Ow;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1146Ow = this.A00.A07;
            c1146Ow.getCTAButton().A0E(A00(0, 5, 121));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
