package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class GJ implements InterfaceC4041vE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24964a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24965b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f24966c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24967d;

    public GJ(InterfaceC4041vE interfaceC4041vE, byte[] bArr, byte[] bArr2) {
        this.f24967d = interfaceC4041vE;
        this.f24965b = bArr;
        this.f24966c = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f24964a) {
            case 0:
                byte[] bArr3 = this.f24965b;
                int length = bArr3.length;
                byte[] bArr4 = this.f24966c;
                InterfaceC4041vE interfaceC4041vE = (InterfaceC4041vE) this.f24967d;
                if (length == 0 && bArr4.length == 0) {
                    interfaceC4041vE.a(bArr, bArr2);
                    return;
                } else {
                    if (!DG.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = AbstractC4094wD.d(bArr2, bArr4);
                    }
                    interfaceC4041vE.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                byte[] bArr5 = this.f24966c;
                int length2 = bArr5.length;
                byte[] bArr6 = (byte[]) this.f24967d;
                if (length2 == 0 && bArr6.length == 0) {
                    b(bArr, bArr2);
                    return;
                } else {
                    if (!DG.c(bArr5, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr6.length != 0) {
                        bArr2 = AbstractC4094wD.d(bArr2, bArr6);
                    }
                    b(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (bArr3.length == 64) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i6 = copyOfRange[i] & 255;
                int i9 = MA.f26257I[i] & 255;
                if (i6 == i9) {
                    i--;
                    bArr3 = bArr;
                } else if (i6 < i9) {
                    MessageDigest messageDigest = (MessageDigest) WJ.f28343e.f28346a.b("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    byte[] bArr4 = this.f24965b;
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    long n02 = MA.n0(0, digest) & 2097151;
                    long o02 = MA.o0(2, digest) >> 5;
                    long n03 = MA.n0(5, digest) >> 2;
                    long o03 = MA.o0(7, digest) >> 7;
                    long o04 = MA.o0(10, digest) >> 4;
                    long n04 = MA.n0(13, digest) >> 1;
                    long o05 = MA.o0(15, digest) >> 6;
                    long n05 = MA.n0(18, digest) >> 3;
                    long n06 = MA.n0(21, digest) & 2097151;
                    long o06 = MA.o0(23, digest) >> 5;
                    long n07 = MA.n0(26, digest) >> 2;
                    long o07 = MA.o0(28, digest) >> 7;
                    long o08 = MA.o0(31, digest) >> 4;
                    long n08 = MA.n0(34, digest) >> 1;
                    long o09 = MA.o0(36, digest) >> 6;
                    long n09 = MA.n0(39, digest) >> 3;
                    long n010 = MA.n0(42, digest) & 2097151;
                    long o010 = MA.o0(44, digest) >> 5;
                    long n011 = (MA.n0(47, digest) >> 2) & 2097151;
                    long o011 = (MA.o0(49, digest) >> 7) & 2097151;
                    long o012 = (MA.o0(52, digest) >> 4) & 2097151;
                    long n012 = (MA.n0(55, digest) >> 1) & 2097151;
                    long o013 = (MA.o0(57, digest) >> 6) & 2097151;
                    long o014 = MA.o0(60, digest) >> 3;
                    long j6 = (o012 * 666643) + n06;
                    long j9 = (o011 * 666643) + n05;
                    long j10 = (n011 * 666643) + (o05 & 2097151);
                    long j11 = (j10 + 1048576) >> 21;
                    long j12 = j11 << 21;
                    long j13 = (n011 * 654183) + (o011 * 470296) + j6;
                    long j14 = (j13 + 1048576) >> 21;
                    long j15 = j14 << 21;
                    long j16 = (n011 * 136657) + (((o012 * 654183) + ((n012 * 470296) + ((o013 * 666643) + (n07 & 2097151)))) - (o011 * 997805));
                    long j17 = (j16 + 1048576) >> 21;
                    long j18 = j17 << 21;
                    long j19 = ((o012 * 136657) + (((o013 * 654183) + ((o014 * 470296) + (o08 & 2097151))) - (n012 * 997805))) - (o011 * 683901);
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = ((o013 * 136657) + ((o09 & 2097151) - (o014 * 997805))) - (n012 * 683901);
                    long j22 = (j21 + 1048576) >> 21;
                    long j23 = j22 << 21;
                    long j24 = n010 - (o014 * 683901);
                    long j25 = (j24 + 1048576) >> 21;
                    long j26 = (n011 * 470296) + j9 + j11;
                    long j27 = (j26 + 1048576) >> 21;
                    long j28 = j27 << 21;
                    long j29 = (((o011 * 654183) + ((o012 * 470296) + ((n012 * 666643) + (o06 & 2097151)))) - (n011 * 997805)) + j14;
                    long j30 = (j29 + 1048576) >> 21;
                    long j31 = j30 << 21;
                    long j32 = (((o011 * 136657) + (((n012 * 654183) + ((o013 * 470296) + ((o014 * 666643) + (o07 & 2097151)))) - (o012 * 997805))) - (n011 * 683901)) + j17;
                    long j33 = (j32 + 1048576) >> 21;
                    long j34 = j33 << 21;
                    long j35 = (((n012 * 136657) + (((o014 * 654183) + (n08 & 2097151)) - (o013 * 997805))) - (o012 * 683901)) + j20;
                    long j36 = (j35 + 1048576) >> 21;
                    long j37 = (((o014 * 136657) + n09) - (o013 * 683901)) + j22;
                    long j38 = (j37 + 1048576) >> 21;
                    long j39 = (j19 - (j20 << 21)) + j33;
                    long j40 = (j39 * 666643) + n02;
                    long j41 = (j40 + 1048576) >> 21;
                    long j42 = j41 << 21;
                    long j43 = (j21 - j23) + j36;
                    long j44 = j35 - (j36 << 21);
                    long j45 = (j39 * 654183) + (j44 * 470296) + (j43 * 666643) + (n03 & 2097151);
                    long j46 = (j45 + 1048576) >> 21;
                    long j47 = j46 << 21;
                    long j48 = (j24 - (j25 << 21)) + j38;
                    long j49 = j37 - (j38 << 21);
                    long j50 = (j39 * 136657) + (((j43 * 654183) + ((j49 * 470296) + ((j48 * 666643) + (o04 & 2097151)))) - (j44 * 997805));
                    long j51 = (j50 + 1048576) >> 21;
                    long j52 = j51 << 21;
                    long j53 = (o010 & 2097151) + j25;
                    long j54 = ((j43 * 136657) + (((j48 * 654183) + ((j53 * 470296) + (j10 - j12))) - (j49 * 997805))) - (j44 * 683901);
                    long j55 = (j54 + 1048576) >> 21;
                    long j56 = j55 << 21;
                    long j57 = ((j48 * 136657) + (((j13 - j15) + j27) - (j53 * 997805))) - (j49 * 683901);
                    long j58 = (j57 + 1048576) >> 21;
                    long j59 = j58 << 21;
                    long j60 = ((j16 - j18) + j30) - (j53 * 683901);
                    long j61 = (j60 + 1048576) >> 21;
                    long j62 = j61 << 21;
                    long j63 = (j39 * 470296) + (j44 * 666643) + (o02 & 2097151) + j41;
                    long j64 = (j63 + 1048576) >> 21;
                    long j65 = (((j44 * 654183) + ((j43 * 470296) + ((j49 * 666643) + (o03 & 2097151)))) - (j39 * 997805)) + j46;
                    long j66 = (j65 + 1048576) >> 21;
                    long j67 = (((j44 * 136657) + (((j49 * 654183) + ((j48 * 470296) + ((j53 * 666643) + (n04 & 2097151)))) - (j43 * 997805))) - (j39 * 683901)) + j51;
                    long j68 = (j67 + 1048576) >> 21;
                    long j69 = (((j49 * 136657) + (((j53 * 654183) + (j26 - j28)) - (j48 * 997805))) - (j43 * 683901)) + j55;
                    long j70 = (j69 + 1048576) >> 21;
                    long j71 = (((j53 * 136657) + (j29 - j31)) - (j48 * 683901)) + j58;
                    long j72 = (j71 + 1048576) >> 21;
                    long j73 = (j32 - j34) + j61;
                    long j74 = (j73 + 1048576) >> 21;
                    long j75 = j74 << 21;
                    long j76 = (j74 * 666643) + (j40 - j42);
                    long j77 = j76 >> 21;
                    long j78 = j77 << 21;
                    long j79 = (j74 * 470296) + (j63 - (j64 << 21)) + j77;
                    long j80 = j79 >> 21;
                    long j81 = j80 << 21;
                    long j82 = (j74 * 654183) + (j45 - j47) + j64 + j80;
                    long j83 = j82 >> 21;
                    long j84 = j83 << 21;
                    long j85 = ((j65 - (j66 << 21)) - (j74 * 997805)) + j83;
                    long j86 = j85 >> 21;
                    long j87 = j86 << 21;
                    long j88 = (j74 * 136657) + (j50 - j52) + j66 + j86;
                    long j89 = j88 >> 21;
                    long j90 = j89 << 21;
                    long j91 = ((j67 - (j68 << 21)) - (j74 * 683901)) + j89;
                    long j92 = j91 >> 21;
                    long j93 = j92 << 21;
                    long j94 = (j54 - j56) + j68 + j92;
                    long j95 = j94 >> 21;
                    long j96 = j95 << 21;
                    long j97 = (j69 - (j70 << 21)) + j95;
                    long j98 = j97 >> 21;
                    long j99 = j98 << 21;
                    long j100 = (j57 - j59) + j70 + j98;
                    long j101 = j100 >> 21;
                    long j102 = j101 << 21;
                    long j103 = (j71 - (j72 << 21)) + j101;
                    long j104 = j103 >> 21;
                    long j105 = j104 << 21;
                    long j106 = (j60 - j62) + j72 + j104;
                    long j107 = j106 >> 21;
                    long j108 = j107 << 21;
                    long j109 = (j73 - j75) + j107;
                    long j110 = j109 >> 21;
                    long j111 = j110 << 21;
                    long j112 = (666643 * j110) + (j76 - j78);
                    long j113 = j112 >> 21;
                    long j114 = j113 << 21;
                    long j115 = (470296 * j110) + (j79 - j81) + j113;
                    long j116 = j115 >> 21;
                    long j117 = j116 << 21;
                    long j118 = (654183 * j110) + (j82 - j84) + j116;
                    long j119 = j118 >> 21;
                    long j120 = j119 << 21;
                    long j121 = ((j85 - j87) - (997805 * j110)) + j119;
                    long j122 = j121 >> 21;
                    long j123 = j122 << 21;
                    long j124 = (136657 * j110) + (j88 - j90) + j122;
                    long j125 = j124 >> 21;
                    long j126 = j125 << 21;
                    long j127 = ((j91 - j93) - (j110 * 683901)) + j125;
                    long j128 = j127 >> 21;
                    long j129 = j128 << 21;
                    long j130 = (j94 - j96) + j128;
                    long j131 = j130 >> 21;
                    long j132 = j131 << 21;
                    long j133 = (j97 - j99) + j131;
                    long j134 = j133 >> 21;
                    long j135 = j134 << 21;
                    long j136 = (j100 - j102) + j134;
                    long j137 = j136 >> 21;
                    long j138 = j137 << 21;
                    long j139 = (j103 - j105) + j137;
                    long j140 = j139 >> 21;
                    long j141 = j140 << 21;
                    long j142 = (j106 - j108) + j140;
                    long j143 = j142 >> 21;
                    digest[0] = (byte) (j112 - j114);
                    long j144 = j133 - j135;
                    long j145 = j130 - j132;
                    long j146 = j127 - j129;
                    long j147 = j124 - j126;
                    long j148 = j121 - j123;
                    long j149 = j118 - j120;
                    long j150 = j115 - j117;
                    digest[1] = (byte) (r13 >> 8);
                    digest[2] = (byte) ((r13 >> 16) | (j150 << 5));
                    digest[3] = (byte) (j150 >> 3);
                    digest[4] = (byte) (j150 >> 11);
                    digest[5] = (byte) ((j150 >> 19) | (j149 << 2));
                    digest[6] = (byte) (j149 >> 6);
                    digest[7] = (byte) ((j149 >> 14) | (j148 << 7));
                    digest[8] = (byte) (j148 >> 1);
                    digest[9] = (byte) (j148 >> 9);
                    digest[10] = (byte) ((j148 >> 17) | (j147 << 4));
                    digest[11] = (byte) (j147 >> 4);
                    digest[12] = (byte) (j147 >> 12);
                    digest[13] = (byte) ((j147 >> 20) | (j146 + j146));
                    digest[14] = (byte) (j146 >> 7);
                    digest[15] = (byte) ((j146 >> 15) | (j145 << 6));
                    digest[16] = (byte) (j145 >> 2);
                    digest[17] = (byte) (j145 >> 10);
                    digest[18] = (byte) ((j145 >> 18) | (j144 << 3));
                    long j151 = j142 - (j143 << 21);
                    long j152 = (j109 - j111) + j143;
                    long j153 = j139 - j141;
                    digest[19] = (byte) (j144 >> 5);
                    digest[20] = (byte) (j144 >> 13);
                    digest[21] = (byte) (j136 - j138);
                    digest[22] = (byte) (r9 >> 8);
                    digest[23] = (byte) ((r9 >> 16) | (j153 << 5));
                    digest[24] = (byte) (j153 >> 3);
                    digest[25] = (byte) (j153 >> 11);
                    digest[26] = (byte) ((j153 >> 19) | (j151 << 2));
                    digest[27] = (byte) (j151 >> 6);
                    digest[28] = (byte) ((j151 >> 14) | (j152 << 7));
                    digest[29] = (byte) (j152 >> 1);
                    digest[30] = (byte) (j152 >> 9);
                    digest[31] = (byte) (j152 >> 17);
                    long[] jArr = new long[10];
                    long[] N8 = AbstractC2968bG.N(bArr4);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    AbstractC2968bG.L(jArr4, N8);
                    AbstractC2968bG.I(jArr5, jArr4, KF.f25882a);
                    AbstractC2968bG.u(jArr4, jArr4, jArr2);
                    AbstractC2968bG.l(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    AbstractC2968bG.L(jArr8, jArr5);
                    AbstractC2968bG.I(jArr8, jArr8, jArr5);
                    AbstractC2968bG.L(jArr, jArr8);
                    AbstractC2968bG.I(jArr, jArr, jArr5);
                    AbstractC2968bG.I(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    AbstractC2968bG.L(jArr9, jArr);
                    AbstractC2968bG.L(jArr10, jArr9);
                    AbstractC2968bG.L(jArr10, jArr10);
                    AbstractC2968bG.I(jArr10, jArr, jArr10);
                    AbstractC2968bG.I(jArr9, jArr9, jArr10);
                    AbstractC2968bG.L(jArr9, jArr9);
                    AbstractC2968bG.I(jArr9, jArr10, jArr9);
                    AbstractC2968bG.L(jArr10, jArr9);
                    for (int i10 = 1; i10 < 5; i10++) {
                        AbstractC2968bG.L(jArr10, jArr10);
                    }
                    AbstractC2968bG.I(jArr9, jArr10, jArr9);
                    AbstractC2968bG.L(jArr10, jArr9);
                    for (int i11 = 1; i11 < 10; i11++) {
                        AbstractC2968bG.L(jArr10, jArr10);
                    }
                    AbstractC2968bG.I(jArr10, jArr10, jArr9);
                    AbstractC2968bG.L(jArr11, jArr10);
                    for (int i12 = 1; i12 < 20; i12++) {
                        AbstractC2968bG.L(jArr11, jArr11);
                    }
                    AbstractC2968bG.I(jArr10, jArr11, jArr10);
                    AbstractC2968bG.L(jArr10, jArr10);
                    for (int i13 = 1; i13 < 10; i13++) {
                        AbstractC2968bG.L(jArr10, jArr10);
                    }
                    AbstractC2968bG.I(jArr9, jArr10, jArr9);
                    AbstractC2968bG.L(jArr10, jArr9);
                    for (int i14 = 1; i14 < 50; i14++) {
                        AbstractC2968bG.L(jArr10, jArr10);
                    }
                    AbstractC2968bG.I(jArr10, jArr10, jArr9);
                    AbstractC2968bG.L(jArr11, jArr10);
                    for (int i15 = 1; i15 < 100; i15++) {
                        AbstractC2968bG.L(jArr11, jArr11);
                    }
                    AbstractC2968bG.I(jArr10, jArr11, jArr10);
                    AbstractC2968bG.L(jArr10, jArr10);
                    for (int i16 = 1; i16 < 50; i16++) {
                        AbstractC2968bG.L(jArr10, jArr10);
                    }
                    AbstractC2968bG.I(jArr9, jArr10, jArr9);
                    AbstractC2968bG.L(jArr9, jArr9);
                    AbstractC2968bG.L(jArr9, jArr9);
                    AbstractC2968bG.I(jArr, jArr9, jArr);
                    AbstractC2968bG.I(jArr, jArr, jArr8);
                    AbstractC2968bG.I(jArr, jArr, jArr4);
                    AbstractC2968bG.L(jArr6, jArr);
                    AbstractC2968bG.I(jArr6, jArr6, jArr5);
                    AbstractC2968bG.u(jArr7, jArr6, jArr4);
                    if (MA.O(jArr7)) {
                        AbstractC2968bG.l(jArr7, jArr6, jArr4);
                        if (MA.O(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        AbstractC2968bG.I(jArr, jArr, KF.f25884c);
                    }
                    if (!MA.O(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((AbstractC2968bG.O(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i17 = 0; i17 < 10; i17++) {
                            jArr[i17] = -jArr[i17];
                        }
                    }
                    AbstractC2968bG.I(jArr3, jArr, N8);
                    C3481ku c3481ku = new C3481ku(20, jArr, N8, jArr2);
                    JF[] jfArr = new JF[8];
                    jfArr[0] = new JF(new C2991bm(23, c3481ku, jArr3));
                    S0.s sVar = new S0.s(21, new C3481ku(20), new long[10]);
                    MA.e0(sVar, c3481ku);
                    C2991bm c2991bm = new C2991bm(sVar);
                    for (int i18 = 1; i18 < 8; i18++) {
                        MA.Y(sVar, c2991bm, jfArr[i18 - 1]);
                        jfArr[i18] = new JF(new C2991bm(sVar));
                    }
                    byte[] m0 = MA.m0(digest);
                    byte[] m02 = MA.m0(copyOfRange);
                    S0.s sVar2 = new S0.s(21);
                    C2991bm c2991bm2 = new C2991bm(23);
                    int i19 = 255;
                    while (i19 >= 0 && m0[i19] == 0 && m02[i19] == 0) {
                        i19--;
                    }
                    while (i19 >= 0) {
                        MA.e0(sVar2, new C3481ku(sVar2));
                        byte b9 = m0[i19];
                        if (b9 > 0) {
                            C2991bm.U(c2991bm2, sVar2);
                            MA.Y(sVar2, c2991bm2, jfArr[m0[i19] / 2]);
                        } else if (b9 < 0) {
                            C2991bm.U(c2991bm2, sVar2);
                            MA.b0(sVar2, c2991bm2, jfArr[(-m0[i19]) / 2]);
                        }
                        byte b10 = m02[i19];
                        if (b10 > 0) {
                            C2991bm.U(c2991bm2, sVar2);
                            MA.Y(sVar2, c2991bm2, KF.f25886e[m02[i19] / 2]);
                        } else if (b10 < 0) {
                            C2991bm.U(c2991bm2, sVar2);
                            MA.b0(sVar2, c2991bm2, KF.f25886e[(-m02[i19]) / 2]);
                        }
                        i19--;
                    }
                    byte[] n9 = new C3481ku(sVar2).n();
                    for (int i20 = 0; i20 < 32; i20++) {
                        if (n9[i20] == bArr[i20]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public GJ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!WC.c(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f24965b = (byte[]) bArr.clone();
        this.f24966c = bArr2;
        this.f24967d = bArr3;
        if (KF.f25882a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
