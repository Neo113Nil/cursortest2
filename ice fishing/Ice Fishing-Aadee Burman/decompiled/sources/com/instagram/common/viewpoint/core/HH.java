package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, 15, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, 27, 93, 73, 90, 86, 94, 27, 95, 84, 94, 72, 27, 85, 84, 79, 27, 72, 79, 90, 73, 79, 27, 76, 82, 79, 83, 27, 72, 66, 85, 88, 27, 88, 84, 95, 94, 21};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC2191ms interfaceC2191ms) throws IOException {
        interfaceC2191ms.AIl();
        C06474v c06474v = new C06474v(2);
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 2);
        int syncCode = c06474v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC2191ms.AIl();
            return syncCode;
        }
        interfaceC2191ms.AIl();
        throw C3K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC2191ms interfaceC2191ms, boolean z3) throws IOException {
        IE id3FramePredicate;
        if (z3) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C9U.A03;
        }
        Metadata A002 = new HM().A00(interfaceC2191ms, id3FramePredicate);
        if (A002 == null || A002.A02() == 0) {
            return null;
        }
        return A002;
    }

    public static Metadata A02(InterfaceC2191ms interfaceC2191ms, boolean z3) throws IOException {
        interfaceC2191ms.AIl();
        long A8i = interfaceC2191ms.A8i();
        Metadata A012 = A01(interfaceC2191ms, z3);
        interfaceC2191ms.AK3((int) (interfaceC2191ms.A8i() - A8i));
        return A012;
    }

    public static HI A03(C06474v c06474v) {
        c06474v.A0g(1);
        int A0K = c06474v.A0K();
        int length = c06474v.A09();
        long j6 = length + A0K;
        int i = A0K / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i6 = 0;
        while (true) {
            if (i6 >= i) {
                break;
            }
            long A0P = c06474v.A0P();
            if (A0P == -1) {
                jArr = Arrays.copyOf(jArr, i6);
                jArr2 = Arrays.copyOf(jArr2, i6);
                break;
            }
            jArr[i6] = A0P;
            jArr2[i6] = c06474v.A0P();
            c06474v.A0g(2);
            i6++;
        }
        int length2 = c06474v.A09();
        c06474v.A0g((int) (j6 - length2));
        return new HI(jArr, jArr2);
    }

    public static HI A04(InterfaceC2191ms interfaceC2191ms, int i) throws IOException {
        C06474v c06474v = new C06474v(i);
        interfaceC2191ms.readFully(c06474v.A0l(), 0, i);
        return A03(c06474v);
    }

    public static HJ A05(InterfaceC2191ms interfaceC2191ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC2191ms.readFully(bArr, 0, 38);
        return new HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC2191ms interfaceC2191ms, int i) throws IOException {
        C06474v c06474v = new C06474v(i);
        interfaceC2191ms.readFully(c06474v.A0l(), 0, i);
        c06474v.A0g(4);
        return Arrays.asList(AbstractC0954Hk.A05(c06474v, false, false).A02);
    }

    public static void A09(InterfaceC2191ms interfaceC2191ms) throws IOException {
        C06474v c06474v = new C06474v(4);
        interfaceC2191ms.readFully(c06474v.A0l(), 0, 4);
        if (c06474v.A0Q() == 1716281667) {
        } else {
            throw C3K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC2191ms interfaceC2191ms) throws IOException {
        C06474v c06474v = new C06474v(4);
        interfaceC2191ms.AGt(c06474v.A0l(), 0, 4);
        return c06474v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC2191ms interfaceC2191ms, HG hg) throws IOException {
        interfaceC2191ms.AIl();
        C06464u c06464u = new C06464u(new byte[4]);
        interfaceC2191ms.AGt(c06464u.A00, 0, 4);
        boolean A0H = c06464u.A0H();
        int A04 = c06464u.A04(7);
        int A042 = c06464u.A04(24) + 4;
        if (A04 == 0) {
            HJ A05 = A05(interfaceC2191ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            hg.A00 = A05;
        } else {
            HJ hj = hg.A00;
            if (hj != null) {
                if (A04 != 3) {
                    if (A04 == 4) {
                        hg.A00 = hj.A0B(A07(interfaceC2191ms, A042));
                    } else if (A04 == 6) {
                        C06474v c06474v = new C06474v(A042);
                        interfaceC2191ms.readFully(c06474v.A0l(), 0, A042);
                        c06474v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c06474v);
                        hg.A00 = hj.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC2191ms.AK3(A042);
                    }
                } else {
                    hg.A00 = hj.A09(A04(interfaceC2191ms, A042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return A0H;
    }
}
