package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0886Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2355pY A01(C0881Eo c0881Eo, List<? extends InterfaceC0883Eq>[] listArr) {
        C2K c2k = new C2K();
        int i = 0;
        loop0: while (true) {
            boolean z3 = false;
            if (i >= c0881Eo.A02()) {
                C2230nW A06 = c0881Eo.A06();
                for (int i6 = 0; i6 < A06.A01; i6++) {
                    C2363pg A05 = A06.A05(i6);
                    int[] iArr = new int[A05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C2356pZ(A05, false, iArr, new boolean[A05.A01]));
                }
                return new C2355pY(c2k.A05());
            }
            C2230nW A07 = c0881Eo.A07(i);
            List<? extends InterfaceC0883Eq> list = listArr[i];
            int i9 = 0;
            while (i9 < A07.A01) {
                C2363pg A052 = A07.A05(i9);
                int A053 = c0881Eo.A05(i, i9, z3);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z6 = A053 != 0;
                int[] iArr2 = new int[A052.A01];
                boolean[] zArr = new boolean[A052.A01];
                for (int i10 = 0; i10 < A052.A01; i10++) {
                    iArr2[i10] = c0881Eo.A04(i, i9, i10);
                    boolean z9 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i11 = 0;
                    while (true) {
                        if (i11 < list.size()) {
                            InterfaceC0883Eq interfaceC0883Eq = list.get(i11);
                            if (interfaceC0883Eq.A9L().equals(A052) && interfaceC0883Eq.AA6(i10) != -1) {
                                z9 = true;
                                break;
                            }
                            i11++;
                        }
                    }
                    zArr[i10] = z9;
                }
                c2k.A04(new C2356pZ(A052, z6, iArr2, zArr));
                i9++;
                z3 = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C2355pY A00(C0881Eo c0881Eo, InterfaceC0883Eq[] interfaceC0883EqArr) {
        List A01;
        List[] listArr = new List[interfaceC0883EqArr.length];
        for (int i = 0; i < interfaceC0883EqArr.length; i++) {
            InterfaceC0883Eq interfaceC0883Eq = interfaceC0883EqArr[i];
            if (interfaceC0883Eq != null) {
                A01 = BP.A04(interfaceC0883Eq);
            } else {
                A01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = A01;
        }
        return A01(c0881Eo, listArr);
    }
}
