package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2111lP implements LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C2399qI> A01;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 72);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C2399qI> A03(LD ld) {
        String A022;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C06464v c06464v = new C06464v(ld.A03);
        List<C2399qI> list = this.A01;
        while (c06464v.A07() > 0) {
            int A0I = c06464v.A0I();
            int A09 = c06464v.A09() + c06464v.A0I();
            if (A0I == 134) {
                list = new ArrayList<>();
                int A0I2 = c06464v.A0I() & 31;
                for (int i4 = 0; i4 < A0I2; i4++) {
                    String A0W = c06464v.A0W(3);
                    int A0I3 = c06464v.A0I();
                    boolean z8 = (A0I3 & 128) != 0;
                    if (z8) {
                        A022 = A02(19, 19, 47);
                        i = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte A0I4 = (byte) c06464v.A0I();
                    c06464v.A0g(1);
                    List<byte[]> list2 = null;
                    if (z8) {
                        boolean z9 = (A0I4 & c.f16475b) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        list2 = AnonymousClass46.A04(z9);
                    }
                    list.add(new C05902p().A11(A022).A10(A0W).A0Z(i).A12(list2).A14());
                }
            }
            c06464v.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, 12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 33, 25, 15, -39, 15, 33, 13, -39, 12, 20, 31, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C2111lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C2111lP(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new C2399qI[0]));
    }

    public C2111lP(int i, List<C2399qI> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private L9 A00(LD ld) {
        return new L9(A03(ld));
    }

    private LJ A01(LD ld) {
        return new LJ(A03(ld));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final SparseArray<LH> A5Q() {
        return new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final LH A5V(int i, LD ld) {
        switch (i) {
            case 2:
            case 128:
                return new C2100lE(new C2108lM(A01(ld)));
            case 3:
            case 4:
                return new C2100lE(new C2102lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C2100lE(new C2112lQ(false, ld.A01));
            case 16:
                return new C2100lE(new C2107lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C2100lE(new C2103lH(ld.A01));
            case 21:
                return new C2100lE(new C2104lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C2100lE(new C2106lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new C2100lE(new C2105lJ(A00(ld)));
            case 89:
                return new C2100lE(new C2109lN(ld.A02));
            case a.f21888T /* 129 */:
            case 135:
                return new C2100lE(new C2118lW(ld.A01));
            case a.f21889U /* 130 */:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C2095l9(new C2101lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C2100lE(new C2115lT(ld.A01));
            case 257:
                return new C2095l9(new C2101lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C2100lE(new C2110lO(ld.A01));
    }
}
