package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, -31, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C06464v c06464v) {
        int i = 0;
        while (value != 0) {
            int b9 = c06464v.A0I();
            i += b9;
            if (b9 != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void A03(long j9, C06464v c06464v, InterfaceC0946Hd[] interfaceC0946HdArr) {
        while (true) {
            if (c06464v.A07() > 1) {
                int A002 = A00(c06464v);
                int A003 = A00(c06464v);
                int A09 = c06464v.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c06464v.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4 && A003 >= 8) {
                            int userIdentifier = c06464v.A0I();
                            int providerCode = c06464v.A0M();
                            int countryCode = 0;
                            if (providerCode == 49) {
                                countryCode = c06464v.A0C();
                            }
                            int A0I = c06464v.A0I();
                            if (providerCode == 47) {
                                c06464v.A0g(1);
                            }
                            int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && A0I == 3) ? 1 : 0;
                            if (providerCode == 49) {
                                int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                                i &= userDataTypeCode;
                            }
                            if (i != 0) {
                                A04(j9, c06464v, interfaceC0946HdArr);
                            }
                        }
                        c06464v.A0f(A09);
                    }
                }
                AbstractC06314g.A07(A01(0, 7, 3), A01(7, 45, 16));
                A09 = c06464v.A0A();
                c06464v.A0f(A09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j9, C06464v c06464v, InterfaceC0946Hd[] interfaceC0946HdArr) {
        int firstByte = c06464v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c06464v.A0g(1);
        int i = (firstByte & 31) * 3;
        int A09 = c06464v.A09();
        for (InterfaceC0946Hd interfaceC0946Hd : interfaceC0946HdArr) {
            c06464v.A0f(A09);
            interfaceC0946Hd.AIr(c06464v, i);
            if (j9 != b.f6539b) {
                interfaceC0946Hd.AIu(j9, 1, i, 0, null);
            }
        }
    }
}
