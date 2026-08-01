package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1545bv implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"OcC8Yw10ta4EzUHryW8qF9f8Kw9JuvuB", "8f8LYzxOMmLQdsAhKRfNVONBERHkcGt2", "CzyGp", "2PtxVvqYppmcLS4cwbsjetyeZ5i3nCKD", "x35AdtEajADMGuwsONv03k5bW5eRm", "TNmYMyEiRrCRNh2BAihsQXhXdDRTY", "KzXNDxf0CUBsvqnb9B4FND8KZCDQkeqp", "bZ2905qMAeosph8FN3SjH9j5ipegj0aG"};
    public final /* synthetic */ C1023Kc A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 58, 54, 48, 50};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1545bv(C1023Kc c1023Kc) {
        this.A00 = c1023Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 85));
            if (((AbstractC1553c3) this.A00).A07.A0D() != null) {
                ((AbstractC1553c3) this.A00).A07.A0D().ACQ();
            }
        } catch (Throwable th) {
            if (A02[1].charAt(21) != 'O') {
                throw new RuntimeException();
            }
            A02[2] = "i9GBCPULPHC1kq3f4RL3YMSEVPUJV";
            WU.A00(th, this);
        }
    }
}
