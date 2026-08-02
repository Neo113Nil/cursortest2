package ru.CryptoPro.JCP.Digest;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.security.DigestException;
import java.security.SignatureException;
import java.util.Arrays;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes4.dex */
public final class GostDigest extends AbstractGostDigest {
    public static final int[] D = {DebugGraphView.DEFAULT_GRAPH_COLOR, DebugGraphView.DEFAULT_GRAPH_COLOR, 16711935, 16711935, 16776960, -16776961, 255, -16711681};
    public static final int DIGEST_LENGTH = 32;
    public final int[] A;
    public long B;
    public int C;
    public final byte[] w;
    public final int[] x;
    public int y;
    public final int[] z;

    public GostDigest(GostDigest gostDigest) {
        super(JCP.GOST_DIGEST_NAME);
        byte[] bArr = new byte[32];
        this.w = bArr;
        int[] iArr = new int[8];
        this.x = iArr;
        this.y = 0;
        int[] iArr2 = new int[8];
        this.z = iArr2;
        int[] iArr3 = new int[8];
        this.A = iArr3;
        this.B = 0L;
        this.C = 0;
        reset(null);
        engineReset();
        byte[] bArr2 = gostDigest.w;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        int[] iArr4 = gostDigest.x;
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
        this.B = gostDigest.B;
        this.y = gostDigest.y;
        Array.copy(gostDigest.z, iArr2);
        this.C = gostDigest.C;
        System.arraycopy(gostDigest.A, 0, iArr3, 0, 8);
    }

    public static byte[] digestData(byte[] bArr) {
        GostDigest gostDigest = new GostDigest();
        gostDigest.engineUpdate(bArr, 0, bArr.length);
        return gostDigest.engineDigest();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new GostDigest(this);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue() {
        int[] iArr = this.z;
        try {
            int[] iArr2 = new int[8];
            int i = this.y;
            if (i != 0) {
                f(i);
            }
            long j = this.B << 3;
            this.B = j;
            iArr2[0] = (int) j;
            iArr2[1] = (int) (j >>> 32);
            g(iArr2, iArr);
            g(this.A, iArr);
            byte[] byteArray = Array.toByteArray(iArr);
            engineReset();
            return byteArray;
        } catch (Error e) {
            reset(null);
            throw e;
        } catch (RuntimeException e2) {
            reset(null);
            throw e2;
        }
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        try {
            if (i2 < 32) {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                JCPLogger.thrown(arrayIndexOutOfBoundsException);
                throw arrayIndexOutOfBoundsException;
            }
            if (bArr.length - i < 32) {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2 = new ArrayIndexOutOfBoundsException();
                JCPLogger.thrown(arrayIndexOutOfBoundsException2);
                throw arrayIndexOutOfBoundsException2;
            }
            byte[] digestValue = digestValue();
            SelfTester_JCP.check(1);
            System.arraycopy(digestValue, 0, bArr, i, 32);
            return 32;
        } catch (Error e) {
            reset(null);
            throw e;
        } catch (RuntimeException e2) {
            reset(null);
            throw e2;
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] engineDigestWithCheck() throws SignatureException {
        return engineDigest();
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineReset() {
        reset(null);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (i + i2 <= bArr.length) {
                    int i3 = this.y;
                    int i4 = i2 + i3;
                    byte[] bArr2 = this.w;
                    if (i4 < 32) {
                        System.arraycopy(bArr, i, bArr2, i3, i2);
                        this.y += i2;
                        return;
                    }
                    System.arraycopy(bArr, i, bArr2, i3, 32 - i3);
                    int i5 = this.y;
                    int i6 = (32 - i5) + i;
                    int i7 = i2 - (32 - i5);
                    f(32);
                    int i8 = i7 >> 5;
                    int i9 = i7 - (i8 << 5);
                    for (int i10 = 0; i10 < i8; i10++) {
                        System.arraycopy(bArr, i6, bArr2, 0, 32);
                        i6 += 32;
                        this.y = 32;
                        f(32);
                    }
                    System.arraycopy(bArr, i6, bArr2, 0, i9);
                    this.y = i9;
                    return;
                }
            } catch (Error e) {
                reset(null);
                throw e;
            } catch (RuntimeException e2) {
                reset(null);
                throw e2;
            }
        }
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        JCPLogger.thrown(arrayIndexOutOfBoundsException);
        throw arrayIndexOutOfBoundsException;
    }

    public final void f(int i) {
        byte[] bArr = this.w;
        Arrays.fill(bArr, i, 32, (byte) 0);
        int[] iArr = this.x;
        Array.toIntArray(iArr, bArr);
        g(iArr, this.z);
        int[] intArray = Array.toIntArray(bArr);
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            long j2 = ((r7[i2] << 32) >>> 32) + ((intArray[i2] << 32) >>> 32) + j;
            j = j2 >>> 32;
            this.A[i2] = (int) j2;
        }
        this.B += (i << 32) >>> 32;
        this.y = 0;
        Array.clear(bArr);
    }

    public final void g(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        char c = 1;
        int i2 = iArr2[1];
        int i3 = 2;
        int i4 = iArr2[2];
        int i5 = 3;
        int i6 = iArr2[3];
        char c2 = 4;
        int i7 = iArr2[4];
        int i8 = iArr2[5];
        int i9 = iArr2[6];
        int i10 = iArr2[7];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        short[] sArr = new short[16];
        short[] sArr2 = new short[16];
        int[] iArr3 = new int[8];
        int i19 = 0;
        while (i19 <= i5) {
            if (i19 == i3) {
                int[] iArr4 = D;
                i ^= iArr4[0];
                i2 ^= iArr4[c];
                i4 ^= iArr4[i3];
                i6 ^= iArr4[i5];
                i7 ^= iArr4[c2];
                i8 ^= iArr4[5];
                i9 ^= iArr4[6];
                i10 ^= iArr4[7];
            }
            int i20 = i ^ i11;
            int i21 = i2 ^ i12;
            int i22 = i4 ^ i13;
            int i23 = i6 ^ i14;
            int i24 = i;
            int i25 = i7 ^ i15;
            int i26 = i2;
            int i27 = i8 ^ i16;
            int i28 = i4;
            int i29 = i9 ^ i17;
            int i30 = i6;
            int i31 = i10 ^ i18;
            int i32 = i7;
            int[] iArr5 = {((i22 & 255) << 8) | (i20 & 255) | ((i25 & 255) << 16) | ((i29 & 255) << 24), ((i20 & 65280) >>> 8) | (i22 & 65280) | ((i25 & 65280) << 8) | ((i29 & 65280) << 16), ((i20 & 16711680) >>> 16) | ((i22 & 16711680) >>> 8) | (i25 & 16711680) | ((i29 & 16711680) << 8), ((i25 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 8) | ((i20 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 24) | ((i22 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 16) | (i29 & ModalContentViewContainer.BASE_SHADOW_COLOR), (i21 & 255) | ((i23 & 255) << 8) | ((i27 & 255) << 16) | ((i31 & 255) << 24), ((i21 & 65280) >>> 8) | (i23 & 65280) | ((i27 & 65280) << 8) | ((i31 & 65280) << 16), ((i21 & 16711680) >>> 16) | ((i23 & 16711680) >>> 8) | (i27 & 16711680) | ((i31 & 16711680) << 8), ((i23 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 16) | ((i21 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 24) | ((i27 & ModalContentViewContainer.BASE_SHADOW_COLOR) >>> 8) | (i31 & ModalContentViewContainer.BASE_SHADOW_COLOR)};
            int i33 = i19 * 2;
            int i34 = i33 + 1;
            int[] iArr6 = {iArr2[i33], iArr2[i34]};
            int i35 = this.C;
            if (i35 != 0) {
                if (i35 != 1) {
                    if (i35 == 2) {
                        c(iArr6, iArr5);
                    } else if (i35 == 3) {
                        d(iArr6, iArr5);
                    } else if (i35 == 4) {
                        e(iArr6, iArr5);
                    }
                }
                a(iArr6, iArr5);
            } else {
                b(iArr6, iArr5);
            }
            iArr3[i33] = iArr6[0];
            iArr3[i34] = iArr6[1];
            if (i19 < 3) {
                int i36 = i11 ^ i13;
                int i37 = i12 ^ i14;
                int i38 = i13 ^ i15;
                int i39 = i14 ^ i16;
                i6 = i8;
                i7 = i9;
                i8 = i10;
                i11 = i15;
                i12 = i16;
                i13 = i17;
                i14 = i18;
                i9 = i28 ^ i24;
                i10 = i30 ^ i26;
                i15 = i36;
                i16 = i37;
                i17 = i38;
                i18 = i39;
                i = i28;
                i2 = i30;
                i4 = i32;
            } else {
                i = i24;
                i2 = i26;
                i4 = i28;
                i6 = i30;
                i7 = i32;
            }
            i19++;
            c = 1;
            i3 = 2;
            i5 = 3;
            c2 = 4;
        }
        int i40 = 0;
        for (int i41 = 8; i40 < i41; i41 = 8) {
            int i42 = i40 + i40;
            int i43 = iArr3[i40];
            sArr2[i42] = (short) (65535 & i43);
            sArr2[i42 + 1] = (short) (i43 >>> 16);
            i40++;
        }
        short s = sArr2[1];
        short s2 = sArr2[5];
        short s3 = sArr2[6];
        short s4 = sArr2[7];
        short s5 = sArr2[9];
        short s6 = sArr2[10];
        short s7 = sArr2[11];
        short s8 = sArr2[12];
        short s9 = sArr2[13];
        short s10 = sArr2[14];
        short s11 = sArr2[15];
        sArr[0] = (short) ((((((((((s ^ s2) ^ s3) ^ s4) ^ s5) ^ s6) ^ s7) ^ s8) ^ s9) ^ s10) ^ s11);
        short s12 = sArr2[0];
        int i44 = (((s ^ s12) ^ sArr2[3]) ^ s3) ^ s4;
        short s13 = sArr2[8];
        sArr[1] = (short) (((((i44 ^ s13) ^ s6) ^ s7) ^ s9) ^ s10);
        short s14 = sArr2[1];
        sArr[2] = (short) (((((((((s14 ^ sArr2[2]) ^ sArr2[4]) ^ s4) ^ s13) ^ s5) ^ s7) ^ s8) ^ s10) ^ s11);
        sArr[3] = (short) ((((((s12 ^ s14) ^ s2) ^ s13) ^ s5) ^ s6) ^ s9);
        short s15 = sArr2[2];
        sArr[4] = (short) ((((((s14 ^ s15) ^ s3) ^ s5) ^ s6) ^ s7) ^ s10);
        short s16 = sArr2[3];
        sArr[5] = (short) ((((((s15 ^ s16) ^ s4) ^ s6) ^ s7) ^ s8) ^ s11);
        short s17 = sArr2[4];
        sArr[6] = (short) (((((((s12 ^ s14) ^ s15) ^ s17) ^ s13) ^ s7) ^ s9) ^ s11);
        short s18 = sArr2[5];
        sArr[7] = (short) ((((s12 ^ s18) ^ s5) ^ s10) ^ s11);
        short s19 = sArr2[6];
        sArr[8] = (short) (((((s12 ^ s15) ^ s16) ^ s19) ^ s6) ^ s8);
        short s20 = sArr2[7];
        sArr[9] = (short) (((((s14 ^ s16) ^ s17) ^ s20) ^ s7) ^ s9);
        short s21 = sArr2[8];
        sArr[10] = (short) (((((s15 ^ s17) ^ s18) ^ s21) ^ s8) ^ s10);
        short s22 = sArr2[9];
        sArr[11] = (short) (((((s16 ^ s18) ^ s19) ^ s22) ^ s9) ^ s11);
        short s23 = sArr2[10];
        sArr[12] = (short) ((((((((s16 ^ ((s12 ^ s14) ^ s15)) ^ s17) ^ s19) ^ s20) ^ s23) ^ s8) ^ s10) ^ s11);
        int i45 = ((((s12 ^ s17) ^ s18) ^ s20) ^ s21) ^ sArr2[11];
        short s24 = sArr2[12];
        sArr[13] = (short) ((i45 ^ s24) ^ s9);
        short s25 = sArr2[13];
        sArr[14] = (short) (((((((s14 ^ s18) ^ s19) ^ s21) ^ s22) ^ s24) ^ s25) ^ s10);
        sArr[15] = (short) (((((((s15 ^ s19) ^ s20) ^ s22) ^ s23) ^ s25) ^ sArr2[14]) ^ s11);
        for (int i46 = 0; i46 < 8; i46++) {
            int i47 = i46 + i46;
            int i48 = iArr2[i46];
            sArr2[i47] = (short) (i48 & 65535);
            sArr2[i47 + 1] = (short) (i48 >>> 16);
        }
        short s26 = sArr[0];
        short s27 = sArr2[1];
        short s28 = sArr2[3];
        short s29 = sArr2[7];
        short s30 = sArr2[10];
        short s31 = sArr2[11];
        short s32 = sArr2[13];
        short s33 = sArr2[14];
        short s34 = sArr2[15];
        sArr[0] = (short) (s26 ^ (((((((s27 ^ s28) ^ s29) ^ s30) ^ s31) ^ s32) ^ s33) ^ s34));
        short s35 = sArr[1];
        short s36 = sArr2[0];
        int i49 = (s27 ^ s36) ^ s28;
        short s37 = sArr2[4];
        short s38 = sArr2[8];
        sArr[1] = (short) (s35 ^ ((((i49 ^ s37) ^ s38) ^ s31) ^ s33));
        short s39 = sArr[2];
        short s40 = sArr2[1];
        int i50 = (s40 ^ sArr2[2]) ^ s37;
        short s41 = sArr2[5];
        short s42 = sArr2[9];
        short s43 = sArr2[12];
        sArr[2] = (short) (s39 ^ ((((i50 ^ s41) ^ s42) ^ s43) ^ s34));
        short s44 = sArr[3];
        int i51 = (s36 ^ s40) ^ s41;
        short s45 = sArr2[6];
        sArr[3] = (short) (s44 ^ (((((i51 ^ s45) ^ s30) ^ s43) ^ s32) ^ s34));
        short s46 = sArr[4];
        short s47 = sArr2[3];
        sArr[4] = (short) (s46 ^ ((((((((s36 ^ s47) ^ s45) ^ s29) ^ s31) ^ s43) ^ s32) ^ s33) ^ s34));
        short s48 = sArr[5];
        short s49 = sArr2[2];
        short s50 = sArr2[4];
        sArr[5] = (short) (s48 ^ (((((((s36 ^ s49) ^ s47) ^ s50) ^ s29) ^ s38) ^ s32) ^ s33));
        short s51 = sArr[6];
        short s52 = sArr2[5];
        sArr[6] = (short) (s51 ^ (((((((s40 ^ s47) ^ s50) ^ s52) ^ s38) ^ s42) ^ s33) ^ s34));
        short s53 = sArr[7];
        short s54 = sArr2[6];
        sArr[7] = (short) (s53 ^ ((((((((s36 ^ s40) ^ s47) ^ s50) ^ s52) ^ s54) ^ s42) ^ s30) ^ s43));
        short s55 = sArr[8];
        short s56 = sArr2[7];
        sArr[8] = (short) (s55 ^ ((((((((s40 ^ s49) ^ s50) ^ s52) ^ s54) ^ s56) ^ s30) ^ s31) ^ s32));
        short s57 = sArr[9];
        short s58 = sArr2[8];
        sArr[9] = (short) (s57 ^ ((((((((s49 ^ s47) ^ s52) ^ s54) ^ s56) ^ s58) ^ s31) ^ s43) ^ s33));
        short s59 = sArr[10];
        short s60 = sArr2[9];
        sArr[10] = (short) (s59 ^ ((((((((s47 ^ s50) ^ s54) ^ s56) ^ s58) ^ s60) ^ s43) ^ s32) ^ s34));
        short s61 = sArr[11];
        short s62 = sArr2[10];
        sArr[11] = (short) (s61 ^ (((((((((((((s36 ^ s40) ^ s49) ^ s47) ^ s50) ^ s52) ^ s56) ^ s58) ^ s60) ^ s62) ^ s43) ^ s32) ^ s33) ^ s34));
        short s63 = sArr[12];
        short s64 = sArr2[11];
        sArr[12] = (short) (s63 ^ ((((((((((s36 ^ s50) ^ s52) ^ s54) ^ s58) ^ s60) ^ s62) ^ s64) ^ s43) ^ s32) ^ s33));
        short s65 = sArr[13];
        short s66 = sArr2[12];
        sArr[13] = (short) (s65 ^ ((((((((((s40 ^ s52) ^ s54) ^ s56) ^ s60) ^ s62) ^ s64) ^ s66) ^ s32) ^ s33) ^ s34));
        sArr[14] = (short) (sArr[14] ^ ((((((((s47 ^ (s36 ^ s40)) ^ s54) ^ s56) ^ s58) ^ s62) ^ s64) ^ sArr2[13]) ^ s33));
        sArr[15] = (short) (sArr[15] ^ (((((((((s40 ^ s49) ^ s50) ^ s56) ^ s58) ^ s60) ^ s64) ^ s66) ^ sArr2[14]) ^ s34));
        for (int i52 = 0; i52 < 8; i52++) {
            int i53 = i52 + i52;
            int i54 = iArr[i52];
            sArr2[i53] = (short) (i54 & 65535);
            sArr2[i53 + 1] = (short) (i54 >>> 16);
        }
        short s67 = sArr[0];
        short s68 = sArr2[0];
        short s69 = sArr2[1];
        short s70 = sArr2[3];
        short s71 = sArr2[4];
        short s72 = sArr2[8];
        short s73 = sArr2[11];
        short s74 = sArr2[14];
        sArr[0] = (short) (s67 ^ ((((((s68 ^ s69) ^ s70) ^ s71) ^ s72) ^ s73) ^ s74));
        short s75 = sArr[1];
        int i55 = (sArr2[2] ^ s69) ^ s71;
        short s76 = sArr2[5];
        short s77 = sArr2[9];
        short s78 = sArr2[12];
        short s79 = sArr2[15];
        sArr[1] = (short) (s75 ^ ((((i55 ^ s76) ^ s77) ^ s78) ^ s79));
        short s80 = sArr[2];
        short s81 = sArr2[0];
        short s82 = sArr2[1];
        short s83 = sArr2[6];
        short s84 = sArr2[10];
        short s85 = sArr2[13];
        sArr[2] = (short) (s80 ^ (((((((s81 ^ s82) ^ s76) ^ s83) ^ s84) ^ s78) ^ s85) ^ s79));
        short s86 = sArr[3];
        short s87 = sArr2[7];
        sArr[3] = (short) (s86 ^ ((((((((s70 ^ s81) ^ s83) ^ s87) ^ s73) ^ s78) ^ s85) ^ s74) ^ s79));
        short s88 = sArr[4];
        short s89 = sArr2[2];
        short s90 = sArr2[3];
        sArr[4] = (short) (s88 ^ (((((((s81 ^ s89) ^ s90) ^ s71) ^ s87) ^ s72) ^ s85) ^ s74));
        short s91 = sArr[5];
        short s92 = sArr2[4];
        sArr[5] = (short) (s91 ^ (((((s76 ^ ((s82 ^ s90) ^ s92)) ^ s72) ^ s77) ^ s74) ^ s79));
        short s93 = sArr[6];
        short s94 = sArr2[5];
        sArr[6] = (short) (s93 ^ ((((((((s81 ^ s82) ^ s90) ^ s92) ^ s94) ^ s83) ^ s77) ^ s84) ^ s78));
        short s95 = sArr[7];
        short s96 = sArr2[6];
        sArr[7] = (short) (s95 ^ ((((((((s82 ^ s89) ^ s92) ^ s94) ^ s96) ^ s87) ^ s84) ^ s73) ^ s85));
        short s97 = sArr[8];
        short s98 = sArr2[7];
        sArr[8] = (short) (s97 ^ ((((((((s89 ^ s90) ^ s94) ^ s96) ^ s98) ^ s72) ^ s73) ^ s78) ^ s74));
        short s99 = sArr[9];
        short s100 = sArr2[8];
        sArr[9] = (short) (s99 ^ ((((((((s90 ^ s92) ^ s96) ^ s98) ^ s100) ^ s77) ^ s78) ^ s85) ^ s79));
        short s101 = sArr[10];
        short s102 = sArr2[9];
        sArr[10] = (short) (s101 ^ (((((((((((((s81 ^ s82) ^ s89) ^ s90) ^ s92) ^ s94) ^ s98) ^ s100) ^ s102) ^ s84) ^ s78) ^ s85) ^ s74) ^ s79));
        short s103 = sArr[11];
        short s104 = sArr2[10];
        sArr[11] = (short) (s103 ^ ((((((((((s81 ^ s92) ^ s94) ^ s96) ^ s100) ^ s102) ^ s104) ^ s73) ^ s78) ^ s85) ^ s74));
        short s105 = sArr[12];
        short s106 = sArr2[11];
        sArr[12] = (short) (s105 ^ ((((((((((s82 ^ s94) ^ s96) ^ s98) ^ s102) ^ s104) ^ s106) ^ s78) ^ s85) ^ s74) ^ s79));
        sArr[13] = (short) (sArr[13] ^ (((((((((s81 ^ s82) ^ s90) ^ s96) ^ s98) ^ s100) ^ s104) ^ s106) ^ s85) ^ s74));
        sArr[14] = (short) (sArr[14] ^ (((((((((s82 ^ s89) ^ s92) ^ s98) ^ s100) ^ s102) ^ s106) ^ sArr2[12]) ^ s74) ^ s79));
        sArr[15] = (short) (sArr[15] ^ ((((((s81 ^ s82) ^ s94) ^ s100) ^ s102) ^ s104) ^ sArr2[13]));
        for (int i56 = 0; i56 < 8; i56++) {
            int i57 = i56 + i56;
            iArr2[i56] = ((sArr[i57 + 1] << 16) & (-65536)) | (sArr[i57] & 65535);
        }
        Array.clear(sArr2);
        Array.clear(iArr3);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public void reset(OID oid) {
        DigestParamsSpec digestParamsSpec = DigestParamsSpec.getInstance(oid);
        this.C = digestParamsSpec.getCommutatorIndex();
        this.B = 0L;
        this.y = 0;
        Array.clear(this.w);
        Array.clear(this.A);
        int[] startHash = digestParamsSpec.getStartHash();
        int[] iArr = this.z;
        System.arraycopy(startHash, 0, iArr, 0, iArr.length);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public byte[] engineDigest() {
        try {
            SelfTester_JCP.check(1);
            return digestValue();
        } catch (Error e) {
            this.reset(null);
            throw e;
        } catch (RuntimeException e2) {
            this.reset(null);
            throw e2;
        }
    }

    public GostDigest() {
        super(JCP.GOST_DIGEST_NAME);
        this.w = new byte[32];
        this.x = new int[8];
        this.y = 0;
        this.z = new int[8];
        this.A = new int[8];
        this.B = 0L;
        this.C = 0;
        reset(null);
    }

    public GostDigest(OID oid) {
        super(JCP.GOST_DIGEST_NAME);
        this.w = new byte[32];
        this.x = new int[8];
        this.y = 0;
        this.z = new int[8];
        this.A = new int[8];
        this.B = 0L;
        this.C = 0;
        reset(oid);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        try {
            byte[] bArr = this.w;
            int i = this.y;
            int i2 = i + 1;
            this.y = i2;
            bArr[i] = b;
            if (i2 == 32) {
                f(32);
            }
        } catch (Error e) {
            reset(null);
            throw e;
        } catch (RuntimeException e2) {
            reset(null);
            throw e2;
        }
    }
}
