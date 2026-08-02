package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C06674v c06674v, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c06674v.A0I() + 1;
            case 7:
                int A0M = c06674v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return A0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2211ms interfaceC2211ms, HJ hj) throws IOException {
        interfaceC2211ms.AIl();
        boolean z6 = true;
        interfaceC2211ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC2211ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z6 = false;
        }
        interfaceC2211ms.A47(2);
        int i = z6 ? 7 : 6;
        C06674v c06674v = new C06674v(i);
        c06674v.A0e(HB.A00(interfaceC2211ms, c06674v.A0l(), 0, i));
        interfaceC2211ms.AIl();
        HE he = new HE();
        boolean isBlockSizeVariable = A08(c06674v, hj, z6, he);
        if (isBlockSizeVariable) {
            return he.A00;
        }
        throw C3K.A01(null, null);
    }

    public static boolean A02(int i, HJ hj) {
        if (i == 0) {
            return true;
        }
        int i4 = hj.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i == i4;
    }

    public static boolean A03(int i, HJ hj) {
        if (i <= 7) {
            return i == hj.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i <= 10 && hj.A02 == 2;
    }

    public static boolean A04(C06674v c06674v, int i) {
        int A0I = c06674v.A0I();
        int crc = c06674v.A09();
        return A0I == C5C.A0J(c06674v.A0l(), i, crc + (-1), 0);
    }

    public static boolean A05(C06674v c06674v, HJ hj, int i) {
        int A002 = A00(c06674v, i);
        if (A002 != -1) {
            int blockSizeSamples = hj.A03;
            if (A002 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C06674v c06674v, HJ hj, int i) {
        int sampleRate = hj.A07;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == hj.A08;
        }
        if (i == 12) {
            return c06674v.A0I() * 1000 == sampleRate;
        }
        if (i > 14) {
            return false;
        }
        int expectedSampleRate = c06674v.A0M();
        if (i == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C06674v c06674v, HJ hj, int i, HE he) {
        int A09 = c06674v.A09();
        long A0Q = c06674v.A0Q();
        long frameHeaderBytes = A0Q >>> 16;
        if (frameHeaderBytes != i) {
            return false;
        }
        int blockSizeKey = (int) ((A0Q >> 8) & 15);
        long frameHeaderBytes2 = A0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((A0Q >> 4) & 15), hj) && A02(frameStartPosition, hj) && !(((A0Q & 1) > 1L ? 1 : ((A0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c06674v, hj, (((A0Q >>> 16) & 1) > 1L ? 1 : (((A0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he) && A05(c06674v, hj, (int) ((A0Q >> 12) & 15)) && A06(c06674v, hj, blockSizeKey) && A04(c06674v, A09);
    }

    public static boolean A08(C06674v c06674v, HJ hj, boolean z6, HE he) {
        long utf8Value;
        try {
            long A0S = c06674v.A0S();
            if (z6) {
                utf8Value = A0S;
            } else {
                long utf8Value2 = hj.A03;
                utf8Value = utf8Value2 * A0S;
            }
            he.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2211ms interfaceC2211ms, HJ hj, int i, HE he) throws IOException {
        long A8i = interfaceC2211ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC2211ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC2211ms.AIl();
            interfaceC2211ms.A47((int) (A8i - interfaceC2211ms.A8n()));
            return false;
        }
        C06674v c06674v = new C06674v(16);
        System.arraycopy(bArr, 0, c06674v.A0l(), 0, 2);
        byte[] frameStartBytes = c06674v.A0l();
        c06674v.A0e(HB.A00(interfaceC2211ms, frameStartBytes, 2, 14));
        interfaceC2211ms.AIl();
        interfaceC2211ms.A47((int) (A8i - interfaceC2211ms.A8n()));
        return A07(c06674v, hj, i, he);
    }
}
