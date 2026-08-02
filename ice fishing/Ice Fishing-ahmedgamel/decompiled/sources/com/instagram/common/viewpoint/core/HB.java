package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC2211ms interfaceC2211ms, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        while (i6 < i4) {
            int totalBytesPeeked = i4 - i6;
            int AGs = interfaceC2211ms.AGs(bArr, i + i6, totalBytesPeeked);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[4];
            int charAt = str.charAt(19);
            int totalBytesPeeked2 = str2.charAt(19);
            if (charAt != totalBytesPeeked2) {
                throw new RuntimeException();
            }
            A00[6] = "xnIrdLQGczxEK23FHKuSo6llrjoojLCP";
            if (AGs == -1) {
                break;
            }
            i6 += AGs;
        }
        return i6;
    }

    @Pure
    public static void A01(boolean z6, String str) throws C3K {
        if (z6) {
        } else {
            throw C3K.A01(str, null);
        }
    }

    public static boolean A02(InterfaceC2211ms interfaceC2211ms, int i) throws IOException {
        try {
            interfaceC2211ms.AK3(i);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC2211ms interfaceC2211ms, byte[] bArr, int i, int i4) throws IOException {
        try {
            interfaceC2211ms.readFully(bArr, i, i4);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC2211ms interfaceC2211ms, byte[] bArr, int i, int i4, boolean z6) throws IOException {
        try {
            return interfaceC2211ms.AGu(bArr, i, i4, z6);
        } catch (EOFException e9) {
            if (!z6) {
                throw e9;
            }
            if (A00[3].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "24rmiB";
            strArr[5] = "kHyj46IkHv9Sbvkaop";
            return false;
        }
    }
}
