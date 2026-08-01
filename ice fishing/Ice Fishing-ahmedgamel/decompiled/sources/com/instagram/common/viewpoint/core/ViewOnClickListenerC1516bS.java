package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1516bS implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"vbhQ772KrwwyBQLqSF0Uu1FphjZjOARV", "IBW1fWQIdJqQUPoAbqLmLzYGzWB3AFkH", "HmN3zdDh8QwXEewFzD7cRbgjZyFP74AB", "Oi9kNPYT1HPYswCV1WaLs9ucCNZpJU", "sMEUezQpAx8L6vs1CqhHVpU4S2CWDUzq", "l1dCE", "7cDzGVZ60", "I6JIiCAB6gfHFMUig9c3ijD4Ynx17v"};
    public final /* synthetic */ C1517bT A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -71, -74, -66, -70, -84, -71, -90, -73, -84, -84, -78};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1516bS(C1517bT c1517bT) {
        this.A00 = c1517bT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC1038Kr = this.A00.A0D;
            viewOnClickListenerC1038Kr.A0E(A00(0, 12, 17));
            this.A00.A0B();
        } catch (Throwable th) {
            if (A02[6].length() != 9) {
                throw new RuntimeException();
            }
            A02[6] = "D5vzh5bnP";
            WU.A00(th, this);
        }
    }
}
