package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2101lE implements LH {
    public static byte[] A0C;
    public static String[] A0D = {"PKE6bUnMb8YRJi5c3EKctidvnGObkWUW", "Sj6HMP0SOTonM2", "QNuElofm8mn1vxmEMVf480D516cE6c1A", "mo3DY2i4ZftrkN8KZEKpxWPbRUkrlx1j", "gCiGT026Vp", "", "zTp2xHG3y1GADYyWqYlevGmnNqTbrtlk", "l459osJydpsPWra20sllrfS"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public AnonymousClass53 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC1042Kv A0B;
    public final C06464u A0A = new C06464u(new byte[10]);
    public int A03 = 0;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-23, 54, 56, 59, 46, -23, 43, 66, 61, 46, 60, 49, 90, 96, 89, 79, 11, 89, 80, 82, 76, 95, 84, 97, 80, 11, 91, 76, 78, 86, 80, 95, 11, 91, 76, 100, 87, 90, 76, 79, 11, 94, 84, 101, 80, 37, 11, 36, 57, 71, 38, 57, 53, 56, 57, 70, -7, 18, 9, 28, 20, 9, 7, 24, 9, 8, -60, 23, 24, 5, 22, 24, -60, 7, 19, 8, 9, -60, 20, 22, 9, 10, 13, 28, -34, -60, 11, 36, 27, 46, 38, 27, 25, 42, 27, 26, -42, 41, 42, 23, 40, 42, -42, 31, 36, 26, 31, 25, 23, 42, 37, 40, -42, 40, 27, 23, 26, 31, 36, 29, -42, 27, 46, 42, 27, 36, 26, 27, 26, -42, 30, 27, 23, 26, 27, 40, 4, 29, 20, 39, 31, 20, 18, 35, 20, 19, -49, 34, 35, 16, 33, 35, -49, 24, 29, 19, 24, 18, 16, 35, 30, 33, -23, -49, 20, 39, 31, 20, 18, 35, 20, 19, -49};
    }

    static {
        A02();
    }

    public C2101lE(InterfaceC1042Kv interfaceC1042Kv) {
        this.A0B = interfaceC1042Kv;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0A.A08(0);
        this.A04 = b.f6382b;
        if (this.A08) {
            this.A0A.A09(4);
            this.A0A.A09(1);
            long pts = this.A0A.A04(15) << 15;
            long A04 = (this.A0A.A04(3) << 30) | pts;
            this.A0A.A09(1);
            long pts2 = this.A0A.A04(15);
            long j6 = A04 | pts2;
            this.A0A.A09(1);
            if (!this.A09 && this.A07) {
                this.A0A.A09(4);
                long pts3 = this.A0A.A04(3);
                this.A0A.A09(1);
                this.A0A.A09(1);
                this.A0A.A09(1);
                this.A05.A06((pts3 << 30) | (this.A0A.A04(15) << 15) | this.A0A.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j6);
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0A.A08(0);
        int A04 = this.A0A.A04(24);
        String A00 = A00(47, 9, 94);
        if (A04 != 1) {
            AbstractC06324g.A07(A00, A00(56, 30, 46) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0A.A09(8);
        int A042 = this.A0A.A04(16);
        this.A0A.A09(5);
        this.A06 = this.A0A.A0H();
        this.A0A.A09(2);
        this.A08 = this.A0A.A0H();
        this.A07 = this.A0A.A0H();
        this.A0A.A09(6);
        int startCodePrefix = this.A0A.A04(8);
        this.A01 = startCodePrefix;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = A042 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder append = new StringBuilder().append(A00(11, 36, 117));
                int startCodePrefix5 = this.A02;
                AbstractC06324g.A07(A00, append.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C06474v c06474v, byte[] bArr, int i) {
        int min = Math.min(c06474v.A07(), i - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c06474v.A0g(min);
        } else {
            int bytesToRead = this.A00;
            c06474v.A0k(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.instagram.common.viewpoint.core.LH
    public final void A5B(C06474v c06474v, int i) throws C3K {
        AbstractC06243y.A02(this.A05);
        if ((i & 1) != 0) {
            int i6 = this.A03;
            String A00 = A00(47, 9, 94);
            switch (i6) {
                case 0:
                case 1:
                    A03(1);
                    break;
                case 2:
                    AbstractC06324g.A07(A00, A00(86, 50, 64));
                    A03(1);
                    break;
                case 3:
                    if (this.A02 != -1) {
                        AbstractC06324g.A07(A00, A00(136, 37, 57) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0B.AGp();
                    A03(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (c06474v.A07() > 0) {
            switch (this.A03) {
                case 0:
                    c06474v.A0g(c06474v.A07());
                case 1:
                    if (A05(c06474v, this.A0A.A00, 9)) {
                        boolean A04 = A04();
                        if (A0D[5].length() == 12) {
                            break;
                        } else {
                            A0D[6] = "QQT4Wvnf7PZI1aBOQkpVRuEJ9a4y7TW0";
                            A03(A04 ? 2 : 0);
                        }
                    } else {
                        continue;
                    }
                case 2:
                    int min = Math.min(10, this.A01);
                    byte[] bArr = this.A0A.A00;
                    if (A0D[1].length() != 20) {
                        A0D[4] = "l8YJPAfB3X";
                        if (A05(c06474v, bArr, min) && A05(c06474v, null, this.A01)) {
                            A01();
                            i |= this.A06 ? 4 : 0;
                            this.A0B.AGq(this.A04, i);
                            A03(3);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    break;
                case 3:
                    int A07 = c06474v.A07();
                    int readLength = this.A02;
                    if (readLength != -1) {
                        int readLength2 = this.A02;
                        r5 = A07 - readLength2;
                    }
                    if (r5 > 0) {
                        A07 -= r5;
                        int A09 = c06474v.A09() + A07;
                        if (A0D[6].charAt(7) == '6') {
                            break;
                        } else {
                            A0D[2] = "lFx9fkjTnk1xSHr5wh3B5PMDNRGZ6lqn";
                            c06474v.A0e(A09);
                        }
                    }
                    this.A0B.A5A(c06474v);
                    int readLength3 = this.A02;
                    if (readLength3 != -1) {
                        int readLength4 = this.A02;
                        this.A02 = readLength4 - A07;
                        int readLength5 = this.A02;
                        if (readLength5 == 0) {
                            this.A0B.AGp();
                            A03(1);
                        }
                    }
                default:
                    throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
    }

    @Override // com.instagram.common.viewpoint.core.LH
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
        this.A05 = anonymousClass53;
        this.A0B.A5c(ha, lg);
    }

    @Override // com.instagram.common.viewpoint.core.LH
    public final void AJ5() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0B.AJ5();
    }
}
