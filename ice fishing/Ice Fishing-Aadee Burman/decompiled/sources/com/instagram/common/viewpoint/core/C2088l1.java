package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.a.c.k;
import com.anythink.expressad.video.module.a.a;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.l1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2088l1 implements LL {
    public static byte[] A0C;
    public static String[] A0D = {"bYPw9lwZ90LIMnDVrWR9nivpaP", "yFs6hGP2BjxCIYW4vwAvQB", "ThDP9clSa9Dn", "ZJ8KrZKjZ6YsWfu6TvhIHbPrHjBQXt73", "tonD2drFJKLGWlZx83XdaJTA2vW", "BxtbVLMcuUKNP9oDIvLT", "q4ZypHVOEkKJ", "0njOXKHdBu5kWS0YMUnz8"};
    public static final int[] A0E;
    public static final int[] A0F;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final C2400qI A06;
    public final C06474v A07;
    public final HA A08;
    public final InterfaceC0947Hd A09;
    public final LN A0A;
    public final byte[] A0B;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-120, 109, -76, -68, -63, -121, 109, -51, 0, -8, -19, -21, -4, -19, -20, -88, -18, -6, -23, -11, -19, -5, -88, -8, -19, -6, -88, -22, -12, -9, -21, -13, -62, -88, -7, 13, -4, 1, 7, -57, 10, -7, 15};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(byte[] bArr, int i, int i6, byte[] bArr2) {
        int i9 = this.A0A.A02;
        int i10 = this.A0A.A05;
        int i11 = (i6 * 4) + (i * i9);
        int i12 = (i10 * 4) + i11;
        int i13 = (i9 / i10) - 4;
        int i14 = ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
        int min = Math.min(bArr[i11 + 2] & 255, 88);
        int i15 = A0F[min];
        int i16 = ((this.A04 * i * i10) + i6) * 2;
        bArr2[i16] = (byte) (i14 & p.f8473b);
        bArr2[i16 + 1] = (byte) (i14 >> 8);
        for (int i17 = 0; i17 < i13 * 2; i17++) {
            int i18 = bArr[((i17 / 8) * i10 * 4) + i12 + ((i17 / 2) % 4)] & 255;
            int i19 = i17 % 2 == 0 ? i18 & 15 : i18 >> 4;
            int i20 = ((((i19 & 7) * 2) + 1) * i15) >> 3;
            if ((i19 & 8) != 0) {
                i20 = -i20;
            }
            i14 = C5C.A07(i14 + i20, -32768, 32767);
            i16 += i10 * 2;
            bArr2[i16] = (byte) (i14 & p.f8473b);
            bArr2[i16 + 1] = (byte) (i14 >> 8);
            min = C5C.A07(min + A0E[i19], 0, A0F.length - 1);
            i15 = A0F[min];
        }
    }

    static {
        A04();
        A0E = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        A0F = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, a.f21731U, 143, 157, 173, 190, BaseATView.a.f9772H, 230, 253, com.anythink.expressad.foundation.g.a.aX, k.f15070a, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    }

    public C2088l1(HA ha, InterfaceC0947Hd interfaceC0947Hd, LN ln) throws C3K {
        this.A08 = ha;
        this.A09 = interfaceC0947Hd;
        this.A0A = ln;
        this.A05 = Math.max(1, ln.A04 / 10);
        C06474v scratch = new C06474v(ln.A06);
        scratch.A0G();
        this.A04 = scratch.A0G();
        int i = ln.A05;
        int i6 = (((ln.A02 - (i * 4)) * 8) / (ln.A01 * i)) + 1;
        if (this.A04 == i6) {
            int numChannels = C5C.A05(this.A05, this.A04);
            this.A0B = new byte[ln.A02 * numChannels];
            int maxBlocksToDecode = A02(this.A04, i);
            this.A07 = new C06474v(maxBlocksToDecode * numChannels);
            int maxBlocksToDecode2 = ln.A04;
            int constantBitrate = ((maxBlocksToDecode2 * ln.A02) * 8) / this.A04;
            this.A06 = new C05912p().A11(A03(34, 9, 83)).A0a(constantBitrate).A0j(constantBitrate).A0h(A02(this.A05, i)).A0b(ln.A05).A0m(ln.A04).A0i(2).A14();
            return;
        }
        throw C3K.A01(A03(7, 27, 67) + i6 + A03(0, 7, 8) + this.A04, null);
    }

    private int A00(int i) {
        return i / (this.A0A.A05 * 2);
    }

    private int A01(int i) {
        return A02(i, this.A0A.A05);
    }

    public static int A02(int i, int i6) {
        return i * 2 * i6;
    }

    private void A05(int i) {
        long A0U = this.A03 + C5C.A0U(this.A02, 1000000L, this.A0A.A04);
        int A01 = A01(i);
        this.A09.AIu(A0U, 1, A01, this.A01 - A01, null);
        long timeUs = i;
        this.A02 += timeUs;
        this.A01 -= A01;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(byte[] bArr, int i, C06474v c06474v) {
        for (int i6 = 0; i6 < i; i6++) {
            for (int channelIndex = 0; channelIndex < blockIndex; channelIndex++) {
                A06(bArr, i6, channelIndex, c06474v.A0l());
            }
        }
        int blockIndex = this.A04;
        int A01 = A01(blockIndex * i);
        c06474v.A0f(0);
        c06474v.A0e(A01);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AA8(int i, long j6) {
        this.A08.AJ7(new C2085ky(this.A0A, this.A04, i, j6));
        this.A09.A6e(this.A06);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AIk(long j6) {
        this.A00 = 0;
        this.A03 = j6;
        this.A01 = 0;
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final boolean AIt(InterfaceC2191ms interfaceC2191ms, long j6) throws IOException {
        int A00 = this.A05 - A00(this.A01);
        int targetFramesRemaining = this.A04;
        int blocksToDecode = C5C.A05(A00, targetFramesRemaining);
        int i = this.A0A.A02 * blocksToDecode;
        boolean z3 = j6 == 0;
        while (!z3) {
            int targetFramesRemaining2 = this.A00;
            if (targetFramesRemaining2 >= i) {
                break;
            }
            int targetFramesRemaining3 = this.A00;
            int targetReadBytes = (int) Math.min(i - targetFramesRemaining3, j6);
            byte[] bArr = this.A0B;
            int targetFramesRemaining4 = this.A00;
            int blocksToDecode2 = interfaceC2191ms.read(bArr, targetFramesRemaining4, targetReadBytes);
            if (blocksToDecode2 == -1) {
                z3 = true;
            } else {
                int targetFramesRemaining5 = this.A00;
                this.A00 = targetFramesRemaining5 + blocksToDecode2;
            }
        }
        int targetReadBytes2 = this.A00;
        int targetFramesRemaining6 = this.A0A.A02;
        int targetReadBytes3 = targetReadBytes2 / targetFramesRemaining6;
        if (targetReadBytes3 > 0) {
            A07(this.A0B, targetReadBytes3, this.A07);
            int blocksToDecode3 = this.A00;
            int targetFramesRemaining7 = this.A0A.A02;
            this.A00 = blocksToDecode3 - (targetFramesRemaining7 * targetReadBytes3);
            int blocksToDecode4 = A0D[3].charAt(16);
            if (blocksToDecode4 != 84) {
                throw new RuntimeException();
            }
            A0D[0] = "TvVFAtGQ";
            int targetReadBytes4 = this.A07.A0A();
            this.A09.AIr(this.A07, targetReadBytes4);
            int targetFramesRemaining8 = this.A01;
            this.A01 = targetFramesRemaining8 + targetReadBytes4;
            int targetFramesRemaining9 = this.A01;
            int blocksToDecode5 = A00(targetFramesRemaining9);
            int targetFramesRemaining10 = this.A05;
            if (blocksToDecode5 >= targetFramesRemaining10) {
                int targetFramesRemaining11 = this.A05;
                A05(targetFramesRemaining11);
            }
        }
        if (z3) {
            int targetFramesRemaining12 = this.A01;
            int targetFramesRemaining13 = A00(targetFramesRemaining12);
            if (targetFramesRemaining13 > 0) {
                A05(targetFramesRemaining13);
            }
        }
        return z3;
    }
}
