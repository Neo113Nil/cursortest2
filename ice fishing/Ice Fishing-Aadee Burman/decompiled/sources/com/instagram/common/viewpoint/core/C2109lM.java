package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.lM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2109lM implements InterfaceC1042Kv {
    public static byte[] A0G;
    public static String[] A0H = {"cAtU07tvAHmpQwteCa8pEQH5gF5iUcfh", "Hjeg7grS71Jm6r5NKbmR8o7Al25NvLrB", "8TbkpeEOwiN436cBQhp4NSePMq1Z0ZNp", "wFA3Sleqv", "yws6lvEdJf3TdH9okNAymdfPd8aH69ii", "xvx7jE251jeLUpmQ5JTTtAODp7RTPAZj", "flKrm8KbmQNj7vJDUwRTOfFPMCPuTaKn", "2PQM5lIFNms8BVmrvHkuPmbcHqu7a2gR"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0947Hd A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C06474v A0B;
    public final C1043Kw A0C;
    public final L4 A0D;
    public final LJ A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<C2400qI, Long> A00(C1043Kw c1043Kw, String str) {
        byte[] copyOf = Arrays.copyOf(c1043Kw.A02, c1043Kw.A00);
        int i = copyOf[4] & 255;
        int i6 = copyOf[5] & 255;
        int i9 = (i << 4) | (i6 >> 4);
        int i10 = ((i6 & 15) << 8) | (copyOf[6] & 255);
        float f3 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                float f9 = i10 * 4;
                float f10 = i9 * 3;
                if (A0H[2].charAt(3) == 'k') {
                    A0H[1] = "IKG5315UEoYuWi8w79ZvxkF28jax6fmF";
                    f3 = f9 / f10;
                    break;
                }
                throw new RuntimeException();
            case 3:
                f3 = (i10 * 16) / (i9 * 9);
                break;
            case 4:
                f3 = (i10 * 121) / (i9 * 100);
                break;
        }
        C2400qI A14 = new C05912p().A0y(str).A11(A01(0, 11, 62)).A0r(i9).A0f(i10).A0Y(f3).A12(Collections.singletonList(copyOf)).A14();
        long j6 = 0;
        int i11 = (copyOf[7] & 15) - 1;
        if (i11 >= 0 && i11 < A0I.length) {
            double d2 = A0I[i11];
            int i12 = c1043Kw.A01;
            int i13 = (copyOf[i12 + 9] & 96) >> 5;
            if (i13 != (copyOf[i12 + 9] & 31)) {
                double d9 = i13;
                if (A0H[2].charAt(3) == 'k') {
                    String[] strArr = A0H;
                    strArr[5] = "rAMAKKtXIRKmVhmwxuLKv06bcSnWRDth";
                    strArr[7] = "TlBzrdA8FTcPVEmXq7DzDEHR3QnpW5Am";
                    d2 *= (d9 + 1.0d) / (r6 + 1);
                }
                throw new RuntimeException();
            }
            j6 = (long) (1000000.0d / d2);
        }
        return Pair.create(A14, Long.valueOf(j6));
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {50, 45, 32, 33, 43, 107, 41, 52, 33, 35, 118};
        if (A0H[4].charAt(19) != 'y') {
            throw new RuntimeException();
        }
        A0H[2] = "5b4kHrs0qMccPUXJRINIqLrMs4aEtqXr";
        A0G = bArr;
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C2109lM() {
        this(null);
    }

    public C2109lM(LJ lj) {
        this.A0E = lj;
        this.A0F = new boolean[4];
        this.A0C = new C1043Kw(128);
        if (lj != null) {
            this.A0D = new L4(178, 128);
            this.A0B = new C06474v();
        } else {
            this.A0D = null;
            this.A0B = null;
        }
        this.A01 = b.f6382b;
        this.A03 = b.f6382b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        if (r3 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        if (r23.A03 == com.anythink.basead.exoplayer.b.f6382b) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        r13 = r23.A09;
        r14 = ((int) (r23.A04 - r23.A02)) - r11;
        r2 = r23.A05;
        r0 = r23.A03;
        r4 = com.anythink.basead.exoplayer.b.f6382b;
        r2.AIu(r0, r13 ? 1 : 0, r14, r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ae, code lost:
    
        if (r3 != false) goto L44;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5A(C06474v c06474v) {
        long j6;
        AbstractC06243y.A02(this.A05);
        int A09 = c06474v.A09();
        int A0A = c06474v.A0A();
        byte[] A0l = c06474v.A0l();
        this.A04 += c06474v.A07();
        this.A05.AIr(c06474v, c06474v.A07());
        while (true) {
            int A04 = HS.A04(A0l, A09, A0A, this.A0F);
            if (A04 == A0A) {
                boolean z3 = this.A07;
                String[] strArr = A0H;
                if (strArr[6].length() != strArr[3].length()) {
                    A0H[1] = "ooUhAAd1UFU3ZsdgbXiiZIdc17zvx9JT";
                    if (!z3) {
                        this.A0C.A01(A0l, A09, A0A);
                    }
                    if (this.A0D != null) {
                        this.A0D.A02(A0l, A09, A0A);
                        return;
                    }
                    return;
                }
            } else {
                int i = c06474v.A0l()[A04 + 3] & 255;
                int i6 = A04 - A09;
                if (!this.A07) {
                    if (i6 > 0) {
                        this.A0C.A01(A0l, A09, A04);
                    }
                    if (this.A0C.A02(i, i6 < 0 ? -i6 : 0)) {
                        Pair<C2400qI, Long> A00 = A00(this.A0C, (String) AbstractC06243y.A01(this.A06));
                        this.A05.A6e((C2400qI) A00.first);
                        this.A00 = ((Long) A00.second).longValue();
                        this.A07 = true;
                    }
                }
                if (this.A0D != null) {
                    int i9 = 0;
                    if (i6 > 0) {
                        this.A0D.A02(A0l, A09, A04);
                    } else {
                        i9 = -i6;
                    }
                    if (this.A0D.A04(i9)) {
                        ((C06474v) C5C.A0f(this.A0B)).A0j(this.A0D.A01, HS.A02(this.A0D.A01, this.A0D.A00));
                        ((LJ) C5C.A0f(this.A0E)).A02(this.A03, this.A0B);
                    }
                    if (i == 178 && c06474v.A0l()[A04 + 2] == 1) {
                        this.A0D.A01(i);
                    }
                }
                if (i == 0 || i == 179) {
                    int i10 = A0A - A04;
                    boolean z6 = this.A08;
                    long j9 = b.f6382b;
                    if (z6) {
                        boolean z9 = this.A07;
                        if (A0H[2].charAt(3) == 'k') {
                            A0H[4] = "I3q7BGa2d1yxMNRbgKUy1FZhwbtqEBv0";
                        }
                    }
                    boolean z10 = this.A0A;
                    String[] strArr2 = A0H;
                    if (strArr2[6].length() == strArr2[3].length()) {
                        break;
                    }
                    A0H[1] = "M1cTpkEI0lqbwMedLRZ4APYv7Db9TSYf";
                    if (!z10 || this.A08) {
                        this.A02 = this.A04 - i10;
                        if (this.A01 != j9) {
                            j6 = this.A01;
                        } else if (this.A03 != j9) {
                            long j10 = this.A03;
                            if (A0H[0].charAt(10) != 'm') {
                                j6 = this.A00 + j10;
                            } else {
                                A0H[0] = "FNyxia2DuWmH1fHrZAJ70vL24BcjBrNj";
                                j6 = this.A00 + j10;
                            }
                        } else {
                            j6 = j9;
                        }
                        this.A03 = j6;
                        this.A09 = false;
                        this.A01 = j9;
                        this.A0A = true;
                    }
                    this.A08 = i == 0;
                } else if (i == 184) {
                    this.A09 = true;
                }
                A09 = A04 + 3;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A06 = lg.A04();
        this.A05 = ha.AKS(lg.A03(), 2);
        if (this.A0E != null) {
            this.A0E.A03(ha, lg);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AGq(long j6, int i) {
        this.A01 = j6;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AJ5() {
        HS.A0H(this.A0F);
        this.A0C.A00();
        if (this.A0D != null) {
            L4 l42 = this.A0D;
            if (A0H[1].length() != 32) {
                throw new RuntimeException();
            }
            A0H[0] = "joVCJevLOtmtIagsqVBvfxemqq2mA7LA";
            l42.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = b.f6382b;
        this.A03 = b.f6382b;
    }
}
