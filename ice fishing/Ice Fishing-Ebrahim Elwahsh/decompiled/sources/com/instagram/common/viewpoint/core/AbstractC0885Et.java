package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0885Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2354pY A01(C0880Eo c0880Eo, List<? extends InterfaceC0882Eq>[] listArr) {
        C2K c2k = new C2K();
        int i = 0;
        loop0: while (true) {
            boolean z8 = false;
            if (i >= c0880Eo.A02()) {
                C2229nW A06 = c0880Eo.A06();
                for (int i4 = 0; i4 < A06.A01; i4++) {
                    C2362pg A05 = A06.A05(i4);
                    int[] iArr = new int[A05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C2355pZ(A05, false, iArr, new boolean[A05.A01]));
                }
                return new C2354pY(c2k.A05());
            }
            C2229nW A07 = c0880Eo.A07(i);
            List<? extends InterfaceC0882Eq> list = listArr[i];
            int i9 = 0;
            while (i9 < A07.A01) {
                C2362pg A052 = A07.A05(i9);
                int A053 = c0880Eo.A05(i, i9, z8);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z9 = A053 != 0;
                int[] iArr2 = new int[A052.A01];
                boolean[] zArr = new boolean[A052.A01];
                for (int i10 = 0; i10 < A052.A01; i10++) {
                    iArr2[i10] = c0880Eo.A04(i, i9, i10);
                    boolean z10 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i11 = 0;
                    while (true) {
                        if (i11 < list.size()) {
                            InterfaceC0882Eq interfaceC0882Eq = list.get(i11);
                            if (interfaceC0882Eq.A9L().equals(A052) && interfaceC0882Eq.AA6(i10) != -1) {
                                z10 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                    zArr[i10] = z10;
                }
                c2k.A04(new C2355pZ(A052, z9, iArr2, zArr));
                i9++;
                z8 = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C2354pY A00(C0880Eo c0880Eo, InterfaceC0882Eq[] interfaceC0882EqArr) {
        List A01;
        List[] listArr = new List[interfaceC0882EqArr.length];
        for (int i = 0; i < interfaceC0882EqArr.length; i++) {
            InterfaceC0882Eq interfaceC0882Eq = interfaceC0882EqArr[i];
            if (interfaceC0882Eq != null) {
                A01 = BP.A04(interfaceC0882Eq);
            } else {
                A01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = A01;
        }
        return A01(c0880Eo, listArr);
    }
}
