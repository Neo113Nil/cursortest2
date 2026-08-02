package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 121);
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
    public static int A00(C06674v c06674v) {
        int i = 0;
        while (value != 0) {
            int b9 = c06674v.A0I();
            i += b9;
            if (b9 != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void A03(long j6, C06674v c06674v, InterfaceC0967Hd[] interfaceC0967HdArr) {
        while (true) {
            if (c06674v.A07() > 1) {
                int A002 = A00(c06674v);
                int A003 = A00(c06674v);
                int A09 = c06674v.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c06674v.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4 && A003 >= 8) {
                            int userIdentifier = c06674v.A0I();
                            int providerCode = c06674v.A0M();
                            int countryCode = 0;
                            if (providerCode == 49) {
                                countryCode = c06674v.A0C();
                            }
                            int A0I = c06674v.A0I();
                            if (providerCode == 47) {
                                c06674v.A0g(1);
                            }
                            int i = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && A0I == 3) ? 1 : 0;
                            if (providerCode == 49) {
                                int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                                i &= userDataTypeCode;
                            }
                            if (i != 0) {
                                A04(j6, c06674v, interfaceC0967HdArr);
                            }
                        }
                        c06674v.A0f(A09);
                    }
                }
                AbstractC06524g.A07(A01(0, 7, 3), A01(7, 45, 16));
                A09 = c06674v.A0A();
                c06674v.A0f(A09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j6, C06674v c06674v, InterfaceC0967Hd[] interfaceC0967HdArr) {
        int firstByte = c06674v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c06674v.A0g(1);
        int i = (firstByte & 31) * 3;
        int A09 = c06674v.A09();
        for (InterfaceC0967Hd interfaceC0967Hd : interfaceC0967HdArr) {
            c06674v.A0f(A09);
            interfaceC0967Hd.AIr(c06674v, i);
            if (j6 != b.f7168b) {
                interfaceC0967Hd.AIu(j6, 1, i, 0, null);
            }
        }
    }
}
