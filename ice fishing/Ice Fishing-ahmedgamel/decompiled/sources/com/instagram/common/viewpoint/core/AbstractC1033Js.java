package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1033Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j6, C06674v c06674v, InterfaceC0967Hd[] interfaceC0967HdArr) {
        int A0I = c06674v.A0I();
        if ((A0I & 64) != 0) {
            c06674v.A0g(1);
            int i = (A0I & 31) * 3;
            int A09 = c06674v.A09();
            for (InterfaceC0967Hd interfaceC0967Hd : interfaceC0967HdArr) {
                c06674v.A0f(A09);
                interfaceC0967Hd.AIr(c06674v, i);
                interfaceC0967Hd.AIu(j6, 1, i, 0, null);
            }
        }
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C06674v c06674v) {
        int i = 0;
        while (value != 0) {
            int A0I = c06674v.A0I();
            i += A0I;
            int b9 = A01[3].length();
            if (b9 == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (A0I != 255) {
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
                AbstractC06524g.A07(A01(0, 7, a.f22543z), A01(7, 45, 69));
                A09 = c06674v.A0A();
                c06674v.A0f(A09);
            } else {
                return;
            }
        }
    }
}
