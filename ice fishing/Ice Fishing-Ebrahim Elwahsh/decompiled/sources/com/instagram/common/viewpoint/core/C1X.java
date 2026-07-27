package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.androidx.media3.common.text.Cue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1X extends C8M {
    public static byte[] A0I;
    public static String[] A0J = {"xyPuKzK0jyL2a", "iL7bHi", "xWOCeVedudZJs", "eDpkr1uq432y6tY7AB6w", "Ypq0mJEh8s3UPXcAK8ds", "IbMgmnX", "KmOfE4b", "2YMQiowZDjtDDRtBYtxBF6amitwY9A2K"};
    public static final int[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public static final int[] A0N;
    public static final int[] A0O;
    public static final int[] A0P;
    public static final int[] A0Q;
    public static final boolean[] A0R;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public long A05;
    public List<C2349pT> A07;
    public List<C2349pT> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final C06464v A0G = new C06464v();
    public final ArrayList<C1006Jm> A0H = new ArrayList<>();
    public C1006Jm A06 = new C1006Jm(0, 4);
    public int A04 = 0;

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0I = new byte[]{10, 44, 40, Byte.MAX_VALUE, 121, 113, 13, 44, 42, 38, 45, 44, 59, 90, 125, 101, 114, Byte.MAX_VALUE, 122, 119, 51, 112, 123, 114, 125, 125, 118, Byte.MAX_VALUE, 61, 51, 87, 118, 117, 114, 102, Byte.MAX_VALUE, 103, 122, 125, 116, 51, 103, 124, 51, 80, 80, 34, 61, 7, 22, 22, 10, 15, 5, 7, 18, 15, 9, 8, 73, 30, 75, 11, 22, 82, 75, 5, 3, 7, 75, 80, 86, 94};
    }

    static {
        A09();
        A0M = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0L = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0Q = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0K = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, a.f21914z, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, BaseATView.a.f9929H, 241, 9632};
        A0N = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0O = new int[]{193, BaseATView.a.f9961z, BaseATView.a.J, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, BaseATView.a.f9923B, 235, BaseATView.a.f9926E, BaseATView.a.f9927F, 239, BaseATView.a.f9931K, 217, 249, 219, 171, 187};
        A0P = new int[]{195, 227, BaseATView.a.f9925D, BaseATView.a.f9924C, 236, BaseATView.a.f9930I, 242, 213, 245, 123, 125, 92, 94, 95, 124, a.f21885Q, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        A0R = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public C1X(String str, int i, long j9) {
        this.A0F = j9 > 0 ? 1000 * j9 : -9223372036854775807L;
        this.A0C = A06(48, 25, 84).equals(str) ? 2 : 3;
        switch (i) {
            case 1:
                this.A0D = 0;
                this.A0E = 0;
                break;
            case 2:
                this.A0D = 1;
                this.A0E = 0;
                break;
            case 3:
                this.A0D = 0;
                this.A0E = 1;
                break;
            case 4:
                this.A0D = 1;
                this.A0E = 1;
                break;
            default:
                AbstractC06314g.A07(A06(0, 13, 123), A06(13, 35, 33));
                this.A0D = 0;
                this.A0E = 0;
                break;
        }
        A0E(0);
        A08();
        this.A0A = true;
        this.A05 = b.f6539b;
    }

    public static char A00(byte b9) {
        int index = A0K[(b9 & Byte.MAX_VALUE) - 32];
        return (char) index;
    }

    public static char A01(byte b9) {
        int index = A0O[b9 & 31];
        return (char) index;
    }

    public static char A02(byte b9) {
        int index = A0P[b9 & 31];
        return (char) index;
    }

    public static char A03(byte b9) {
        int index = A0N[b9 & 15];
        return (char) index;
    }

    public static char A04(byte b9, byte b10) {
        if ((b9 & 1) == 0) {
            return A01(b10);
        }
        return A02(b10);
    }

    public static int A05(byte b9) {
        return (b9 >> 3) & 1;
    }

    private List<C2349pT> A07() {
        int i = 2;
        int size = this.A0H.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C2349pT A08 = this.A0H.get(i4).A08(Integer.MIN_VALUE);
            arrayList.add(A08);
            if (A08 != null) {
                int positionAnchor = A08.A08;
                i = Math.min(i, positionAnchor);
            }
        }
        List<Cue> displayCues = new ArrayList<>(size);
        for (int i9 = 0; i9 < size; i9++) {
            C2349pT c2349pT = (C2349pT) arrayList.get(i9);
            if (c2349pT != null) {
                int cueBuilderCount = c2349pT.A08;
                if (cueBuilderCount != i) {
                    c2349pT = (C2349pT) AbstractC06233y.A01(this.A0H.get(i9).A08(i));
                }
                displayCues.add(c2349pT);
            }
        }
        return displayCues;
    }

    private void A08() {
        this.A06.A0C(this.A02);
        this.A0H.clear();
        this.A0H.add(this.A06);
    }

    private void A0A(byte b9) {
        this.A06.A0B(' ');
        int style = (b9 >> 1) & 7;
        this.A06.A0F(style, (b9 & 1) == 1);
    }

    private void A0B(byte b9) {
        switch (b9) {
            case 32:
                A0E(2);
                return;
            case 33:
            case 34:
            case 35:
            case 36:
            case j.f5965O /* 40 */:
            default:
                if (this.A02 == 0) {
                    return;
                }
                switch (b9) {
                    case 33:
                        this.A06.A09();
                        return;
                    case 36:
                    default:
                        return;
                    case j.f5969S /* 44 */:
                        this.A07 = Collections.emptyList();
                        if (this.A02 != 1) {
                            int i = this.A02;
                            String[] strArr = A0J;
                            if (strArr[3].length() != strArr[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0J;
                            strArr2[6] = "b3deduR";
                            strArr2[5] = "v1SkHRN";
                            if (i != 3) {
                                return;
                            }
                        }
                        A08();
                        return;
                    case j.f5970T /* 45 */:
                        int i4 = this.A02;
                        String[] strArr3 = A0J;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            String[] strArr4 = A0J;
                            strArr4[3] = "HCAfJwwR1nZZ2pYCiapM";
                            strArr4[4] = "hVuFMnq3D5R8fxepiPSv";
                            if (i4 != 1) {
                                return;
                            }
                        } else {
                            String[] strArr5 = A0J;
                            strArr5[6] = "UkNz47z";
                            strArr5[5] = "ECTKBDG";
                            if (i4 != 1) {
                                return;
                            }
                        }
                        if (this.A06.A0G()) {
                            return;
                        }
                        this.A06.A0A();
                        return;
                    case 46:
                        A08();
                        return;
                    case 47:
                        this.A07 = A07();
                        if (A0J[1].length() != 6) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0J;
                        strArr6[0] = "wlzHXutwvMVrg";
                        strArr6[2] = "RfwTYRDUxUGrE";
                        A08();
                        return;
                }
            case 37:
                A0E(1);
                String[] strArr7 = A0J;
                if (strArr7[6].length() != strArr7[5].length()) {
                    A0J[7] = "zMKPmeCrWxL39kxcGHJTHFiYR7RUOgb0";
                    A0F(2);
                    return;
                } else {
                    String[] strArr8 = A0J;
                    strArr8[3] = "sWiniOu4qAad1WdM0urN";
                    strArr8[4] = "Trq384lR27iyv87KhrGz";
                    A0F(2);
                    return;
                }
            case j.f5963M /* 38 */:
                A0E(1);
                A0F(3);
                return;
            case 39:
                A0E(1);
                A0F(4);
                return;
            case 41:
                A0E(3);
                return;
        }
    }

    private void A0C(byte b9, byte b10) {
        int i = A0M[b9 & 7];
        int row = b10 & 32;
        int row2 = row != 0 ? 1 : 0;
        if (row2 != 0) {
            i++;
        }
        int row3 = this.A06.A03;
        if (i != row3) {
            int row4 = this.A02;
            if (row4 != 1) {
                C1006Jm c1006Jm = this.A06;
                String[] strArr = A0J;
                String str = strArr[6];
                String str2 = strArr[5];
                int length = str.length();
                int row5 = str2.length();
                if (length != row5) {
                    throw new RuntimeException();
                }
                A0J[7] = "S2lulK2aovW1jS0uX55S7WO6vUVtsAxG";
                if (!c1006Jm.A0G()) {
                    this.A06 = new C1006Jm(this.A02, this.A03);
                    this.A0H.add(this.A06);
                }
            }
            this.A06.A03 = i;
        }
        int cursorOrStyle = (b10 & 16) == 16 ? 1 : 0;
        int row6 = b10 & 1;
        boolean isCursor = row6 == 1;
        int row7 = b10 >> 1;
        int i4 = row7 & 7;
        C1006Jm c1006Jm2 = this.A06;
        int row8 = cursorOrStyle != 0 ? 8 : i4;
        c1006Jm2.A0F(row8, isCursor);
        if (cursorOrStyle != 0) {
            C1006Jm c1006Jm3 = this.A06;
            int row9 = A0L[i4];
            c1006Jm3.A02 = row9;
        }
    }

    private void A0D(byte b9, byte b10) {
        if (A0L(b9)) {
            this.A0A = false;
        }
        if (!A0K(b9)) {
            return;
        }
        switch (b10) {
            case 32:
            case 37:
            case j.f5963M /* 38 */:
            case 39:
            case 41:
            case 47:
                this.A0A = true;
                break;
            case 42:
            case j.f5968R /* 43 */:
                this.A0A = false;
                break;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0013 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0E(int i) {
        if (this.A02 == i) {
            return;
        }
        int i4 = this.A02;
        this.A02 = i;
        if (i == 3) {
            for (int i9 = 0; i9 < oldCaptionMode; i9++) {
                this.A0H.get(i9).A0D(i);
            }
            return;
        }
        A08();
        if (i4 == 3 || i == 1 || i == 0) {
            this.A07 = Collections.emptyList();
        }
    }

    private void A0F(int i) {
        this.A03 = i;
        this.A06.A0E(i);
    }

    private boolean A0G() {
        return (this.A0F == b.f6539b || this.A05 == b.f6539b || A0V() - this.A05 < this.A0F) ? false : true;
    }

    private boolean A0H(byte b9) {
        if (A0I(b9)) {
            this.A04 = A05(b9);
        }
        return this.A04 == this.A0D;
    }

    public static boolean A0I(byte b9) {
        return (b9 & 224) == 0;
    }

    public static boolean A0J(byte b9) {
        return (b9 & 240) == 16;
    }

    public static boolean A0K(byte b9) {
        return (b9 & 247) == 20;
    }

    public static boolean A0L(byte b9) {
        return 1 <= b9 && b9 <= 15;
    }

    public static boolean A0M(byte b9, byte b10) {
        return (b9 & 246) == 18 && (b10 & 224) == 32;
    }

    public static boolean A0N(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 32;
    }

    public static boolean A0O(byte b9, byte b10) {
        return (b9 & 246) == 20 && (b10 & 240) == 32;
    }

    public static boolean A0P(byte b9, byte b10) {
        return (b9 & 240) == 16 && (b10 & 192) == 64;
    }

    public static boolean A0Q(byte b9, byte b10) {
        return (b9 & 247) == 17 && (b10 & 240) == 48;
    }

    public static boolean A0R(byte b9, byte b10) {
        if ((b9 & 247) == 23) {
            String[] strArr = A0J;
            if (strArr[0].length() == strArr[2].length()) {
                A0J[7] = "7sgcSwZzVixk1cNRVVtuUYOxON5VA7NQ";
                if (b10 >= 33) {
                    if (A0J[7].charAt(24) != '4') {
                        A0J[1] = "zvE6QP";
                        if (b10 <= 35) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A0S(boolean z8, byte b9, byte b10) {
        if (z8 && A0J(b9)) {
            if (this.A0B && this.A00 == b9 && this.A01 == b10) {
                this.A0B = false;
                return true;
            }
            this.A0B = true;
            this.A00 = b9;
            this.A01 = b10;
        } else {
            this.A0B = false;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    /* renamed from: A0W */
    public final /* bridge */ /* synthetic */ C8S A5r() throws C2131lj {
        return super.A5r();
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    /* renamed from: A0X, reason: merged with bridge method [inline-methods] */
    public final C8P A5t() throws C2131lj {
        C8P A0Y;
        C8P outputBuffer = super.A5t();
        if (outputBuffer != null) {
            return outputBuffer;
        }
        if (A0G() && (A0Y = A0Y()) != null) {
            this.A07 = Collections.emptyList();
            this.A05 = b.f6539b;
            A0Y.A0C(A0V(), A0Z(), Long.MAX_VALUE);
            return A0Y;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final C2129lh A0Z() {
        this.A08 = this.A07;
        return new C2129lh((List) AbstractC06233y.A01(this.A07));
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    /* renamed from: A0a */
    public final /* bridge */ /* synthetic */ void AHJ(C8S c8s) throws C2131lj {
        super.AHJ(c8s);
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final void A0b(C8S c8s) {
        ByteBuffer subtitleData = (ByteBuffer) AbstractC06233y.A01(c8s.A02);
        this.A0G.A0j(subtitleData.array(), subtitleData.limit());
        boolean z8 = false;
        while (true) {
            if (this.A0G.A07() >= this.A0C) {
                byte A0I2 = this.A0C == 2 ? (byte) -4 : (byte) this.A0G.A0I();
                int A0I3 = this.A0G.A0I();
                int A0I4 = this.A0G.A0I();
                if ((A0I2 & 2) == 0 && (A0I2 & 1) == this.A0E) {
                    byte b9 = (byte) (A0I3 & a.f21886R);
                    byte ccHeader = (byte) (A0I4 & a.f21886R);
                    if (b9 != 0 || ccHeader != 0) {
                        boolean z9 = this.A09;
                        this.A09 = (A0I2 & 4) == 4 && A0R[A0I3] && A0R[A0I4];
                        if (A0S(this.A09, b9, ccHeader)) {
                            continue;
                        } else if (!this.A09) {
                            if (z9) {
                                A08();
                                String[] strArr = A0J;
                                if (strArr[0].length() != strArr[2].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0J;
                                strArr2[3] = "7LYQsBtV1mB8cg17zlGC";
                                strArr2[4] = "4QeECkpa3Q5V1bGzM4Sw";
                                z8 = true;
                            } else {
                                continue;
                            }
                        } else {
                            A0D(b9, ccHeader);
                            if (this.A0A && A0H(b9)) {
                                if (A0I(b9)) {
                                    if (A0Q(b9, ccHeader)) {
                                        this.A06.A0B(A03(ccHeader));
                                    } else if (A0M(b9, ccHeader)) {
                                        this.A06.A09();
                                        this.A06.A0B(A04(b9, ccHeader));
                                    } else if (A0N(b9, ccHeader)) {
                                        A0A(ccHeader);
                                    } else if (A0P(b9, ccHeader)) {
                                        A0C(b9, ccHeader);
                                    } else if (!A0R(b9, ccHeader)) {
                                        if (A0O(b9, ccHeader)) {
                                            A0B(ccHeader);
                                        }
                                    } else {
                                        this.A06.A04 = ccHeader - 32;
                                    }
                                } else {
                                    this.A06.A0B(A00(b9));
                                    if ((ccHeader & 224) != 0) {
                                        this.A06.A0B(A00(ccHeader));
                                    }
                                }
                                z8 = true;
                            }
                        }
                    }
                }
            } else {
                if (z8) {
                    if (this.A02 == 1 || this.A02 == 3) {
                        this.A07 = A07();
                        this.A05 = A0V();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final boolean A0d() {
        return this.A07 != this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.InterfaceC2138lq
    public final /* bridge */ /* synthetic */ void AJh(long j9) {
        super.AJh(j9);
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    public final void flush() {
        super.flush();
        this.A07 = null;
        this.A08 = null;
        A0E(0);
        A0F(4);
        A08();
        this.A09 = false;
        this.A0B = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
        this.A04 = 0;
        this.A0A = true;
        this.A05 = b.f6539b;
    }
}
