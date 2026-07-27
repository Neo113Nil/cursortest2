package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0957Hn extends AbstractRunnableC1327Wc {
    public static byte[] A01;
    public static String[] A02 = {"MrnT4Eks85vPuqQr37JMtu4NfaYgfi6f", "zfkVjNlCcNBydFIcz2mD", "Bee43nRREoDmuohWbk", "LYOPzNoZy5N5VpEZxT", "78Vp0AX9Eb5UezJBTqKvLg5S66jER", "qnB2IM", "Ag3pKfa1yi0C6RoVnqVP", "pygY9b2"};
    public final /* synthetic */ AnonymousClass55 A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            if (A02[4].length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "zTo8qTO106BkbxhANT";
            strArr[3] = "z1bPe1QyN1GViRGZCE";
            copyOfRange[i10] = (byte) ((b9 - i9) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-111, -92, -97, -96, -86, 91, -78, -100, -82, 91, -87, -96, -79, -96, -83, 91, -85, -83, -96, -85, -100, -83, -96, -97};
    }

    static {
        A01();
    }

    public C0957Hn(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        boolean z3;
        z3 = this.A00.A0M;
        if (!z3) {
            AnonymousClass55 anonymousClass55 = this.A00;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[1] = "EIUkH3ntVfUyNEjhHXbRpTHh";
            anonymousClass55.A0s(A00(0, 24, 44));
        }
    }
}
