package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HB {
    public static String[] A00 = {"", "JBqvX3ouZOOCqox6TCkHsUUnq79xKaTL", "x", "BIUpfUNI3eVa3mY8ect95XlwPu2Ofuw", "eTPSYv4hujFcnfJKGeeHsnhQxUvQ5rkD", "uOymuGwhHDkcqDuJ17", "MFseKYUy643KM5DvrPXxmzbMJL0nMbh3", "ti0zz4"};

    public static int A00(InterfaceC2191ms interfaceC2191ms, byte[] bArr, int i, int i6) throws IOException {
        int i9 = 0;
        while (i9 < i6) {
            int totalBytesPeeked = i6 - i9;
            int AGs = interfaceC2191ms.AGs(bArr, i + i9, totalBytesPeeked);
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
            i9 += AGs;
        }
        return i9;
    }

    @Pure
    public static void A01(boolean z3, String str) throws C3K {
        if (z3) {
        } else {
            throw C3K.A01(str, null);
        }
    }

    public static boolean A02(InterfaceC2191ms interfaceC2191ms, int i) throws IOException {
        try {
            interfaceC2191ms.AK3(i);
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[3] = "SfDhdqvr0QmEID8ZIpBFjoMfbavps9";
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(InterfaceC2191ms interfaceC2191ms, byte[] bArr, int i, int i6) throws IOException {
        try {
            interfaceC2191ms.readFully(bArr, i, i6);
            return true;
        } catch (EOFException unused) {
            if (A00[0].length() != 0) {
                throw new RuntimeException();
            }
            A00[6] = "fFP2kzBTuIshDEJva9vOOxjFjEDNGXev";
            return false;
        }
    }

    public static boolean A04(InterfaceC2191ms interfaceC2191ms, byte[] bArr, int i, int i6, boolean z3) throws IOException {
        try {
            return interfaceC2191ms.AGu(bArr, i, i6, z3);
        } catch (EOFException e9) {
            if (!z3) {
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
