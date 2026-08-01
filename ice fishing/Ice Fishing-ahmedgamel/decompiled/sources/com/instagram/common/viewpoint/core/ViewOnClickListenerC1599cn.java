package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1599cn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1003Ji A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, -6, -11, -10, 0};
    }

    public ViewOnClickListenerC1599cn(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1557c7 c1557c7;
        C1557c7 c1557c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0p(A00(0, 5, 93));
            c1557c7 = this.A00.A0b;
            if (c1557c7.A0D() != null) {
                c1557c72 = this.A00.A0b;
                c1557c72.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
