package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class JM {
    public static String[] A00 = {"FTgkNuEfB21sdffM4MB", "AHdMCcfHPrYhHZuJq7ar8kaDD0", "m1AQBHavwMcQPTMSh8yPHqRX8TIuxSKu", "w1PNvsr2QHXMQttzrVJcJFpvqWAZZ2ue", "3yahnNe", "CLySAaMkPHNUkUwJF2Q2hF0h64PJDpTx", "AMIcFao4vlNbyapwbaOz2OEX2RJAnqn2", "UMo3DITmDXTtEPejAH8oJ9deLVPgGECA"};
    public static final int[] A01 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(int i, boolean z3) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        A00[1] = "W7vtI7n9AGcg3kiZwr1R4Wd";
        if (i == 1751476579 && z3) {
            return true;
        }
        int[] iArr = A01;
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[6] = "p6Add4WRgBlZ7U9sigG7YhPBNKEcLx90";
        strArr[7] = "5Tff00eh7q1qfGppTlmWVovL6e7TawLb";
        for (int i6 : iArr) {
            if (i6 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(InterfaceC2191ms interfaceC2191ms) throws IOException {
        return A03(interfaceC2191ms, true, false);
    }

    public static boolean A02(InterfaceC2191ms interfaceC2191ms, boolean z3) throws IOException {
        return A03(interfaceC2191ms, false, z3);
    }

    public static boolean A03(InterfaceC2191ms interfaceC2191ms, boolean z3, boolean z6) throws IOException {
        long A8O = interfaceC2191ms.A8O();
        long inputLength = 4096;
        if (A8O != -1 && A8O <= 4096) {
            inputLength = A8O;
        }
        int i = (int) inputLength;
        C06474v c06474v = new C06474v(64);
        int i6 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (i6 < i) {
            int i9 = 8;
            c06474v.A0d(8);
            if (!interfaceC2191ms.AGu(c06474v.A0l(), 0, 8, true)) {
                break;
            }
            long A0Q = c06474v.A0Q();
            int headerSize = c06474v.A0C();
            if (A0Q == 1) {
                i9 = 16;
                interfaceC2191ms.AGt(c06474v.A0l(), 8, 8);
                c06474v.A0e(16);
                A0Q = c06474v.A0P();
            } else if (A0Q == 0) {
                long A8O2 = interfaceC2191ms.A8O();
                if (A8O2 != -1) {
                    A0Q = (A8O2 - interfaceC2191ms.A8i()) + 8;
                }
            }
            if (A0Q < i9) {
                return false;
            }
            i6 += i9;
            if (headerSize == 1836019574) {
                int i10 = (int) A0Q;
                String[] strArr = A00;
                if (strArr[2].charAt(21) == strArr[5].charAt(21)) {
                    throw new RuntimeException();
                }
                A00[1] = "1NOCBl6uYr6a5zcz7K9cJi9";
                i += i10;
                if (A8O != -1 && i > A8O) {
                    i = (int) A8O;
                }
            } else {
                if (headerSize == 1836019558 || headerSize == 1836475768) {
                    z10 = true;
                    break;
                }
                if ((i6 + A0Q) - i9 >= i) {
                    break;
                }
                int atomDataSize = (int) (A0Q - i9);
                i6 += atomDataSize;
                if (headerSize == 1718909296) {
                    if (atomDataSize >= 8) {
                        c06474v.A0d(atomDataSize);
                        interfaceC2191ms.AGt(c06474v.A0l(), 0, atomDataSize);
                        int atomDataSize2 = atomDataSize / 4;
                        int brandsCount = 0;
                        while (true) {
                            if (brandsCount >= atomDataSize2) {
                                break;
                            }
                            if (brandsCount == 1) {
                                c06474v.A0g(4);
                            } else if (A00(c06474v.A0C(), z6)) {
                                z9 = true;
                                break;
                            }
                            brandsCount++;
                        }
                        if (!z9) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (atomDataSize != 0) {
                    interfaceC2191ms.A47(atomDataSize);
                }
            }
        }
        return z9 && z3 == z10;
    }
}
