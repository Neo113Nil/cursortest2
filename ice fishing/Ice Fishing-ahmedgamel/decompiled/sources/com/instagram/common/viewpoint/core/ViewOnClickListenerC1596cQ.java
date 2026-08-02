package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1596cQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{65, 69, 73, 79, 77};
    }

    public ViewOnClickListenerC1596cQ(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6;
        C1609cd c1609cd;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A0M;
            if (!z6) {
                c1609cd = this.A00.A0K;
                c1609cd.A02(A00(0, 5, 70));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
