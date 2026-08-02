package ru.CryptoPro.JCP.Key;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.dy31;
import defpackage.gu61;
import defpackage.wu61;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Cipher.InGostHMAC2012_256;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class MagmaKeySpec extends SecretKeySpec {
    public static final long C1_magma = -17179869184L;
    public static final long C2_magma = -33554432;
    public static final long C3_magma = -4096;
    public static final int UZE_K1 = 0;
    public static final int UZE_K2 = 1;
    public final byte[] D;
    public wu61 E;
    public wu61 F;
    public wu61 G;

    public MagmaKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface, int i) {
        super(bArr, 0, bArr.length, cryptParamsInterface, i);
        this.F = null;
        this.G = null;
        i();
        o();
        this.D = new byte[this.x];
    }

    public static byte[] l(SecretKeyInterface secretKeyInterface, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        try {
            byte[] bArr3 = {0};
            byte[] byteArrayI = Array.toByteArrayI((i << 1) - 1);
            byte[] byteArrayI2 = Array.toByteArrayI(i2);
            int i4 = 0;
            while (true) {
                if (i4 >= byteArrayI2.length) {
                    i4 = 0;
                    break;
                }
                if (byteArrayI2[i4] != 0) {
                    break;
                }
                i4++;
            }
            int length = byteArrayI2.length - i4;
            byte[] bArr4 = new byte[length];
            Array.copy(byteArrayI2, i4, bArr4, 0, length);
            int length2 = bArr.length + i3 + 1 + bArr2.length + length;
            byte[] bArr5 = new byte[length2];
            Array.copy(byteArrayI, byteArrayI.length - i3, bArr5, 0, i3);
            Array.copy(bArr, 0, bArr5, i3, bArr.length);
            int length3 = bArr.length + i3;
            Array.copy(bArr3, 0, bArr5, length3, 1);
            int i5 = length3 + 1;
            Array.copy(bArr2, 0, bArr5, i5, bArr2.length);
            Array.copy(bArr4, 0, bArr5, i5 + bArr2.length, length);
            InGostHMAC2012_256 inGostHMAC2012_256 = new InGostHMAC2012_256();
            inGostHMAC2012_256.init(secretKeyInterface, null);
            inGostHMAC2012_256.engineUpdate(bArr5, 0, length2);
            byte[] engineDoFinal = inGostHMAC2012_256.engineDoFinal();
            byte[] byteArrayI3 = Array.toByteArrayI(i << 1);
            Array.copy(byteArrayI3, byteArrayI3.length - i3, bArr5, 0, i3);
            inGostHMAC2012_256.engineReset();
            inGostHMAC2012_256.engineUpdate(bArr5, 0, length2);
            byte[] engineDoFinal2 = inGostHMAC2012_256.engineDoFinal();
            byte[] bArr6 = new byte[64];
            Array.copy(engineDoFinal, 0, bArr6, 0, 32);
            Array.copy(engineDoFinal2, 0, bArr6, 32, 32);
            return bArr6;
        } catch (InvalidAlgorithmParameterException e) {
            dy31.s(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            if (cryptParamsInterface == null) {
                cryptParamsInterface = this.a;
            }
            wu61Var.f(this.E, cryptParamsInterface, randomInterface);
            m();
            wu61Var.A(randomInterface);
        } catch (Throwable th) {
            wu61Var.A(randomInterface);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new MagmaKeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    public void decrypt(int i, byte[] bArr, byte[] bArr2, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            int i3 = i & 2032;
            if (i3 == 16) {
                SelfTester_JCP.check(1048576);
                int[] iArr = {(bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                this.E.t(iArr, cryptParamsInterface.getCommutator());
                int i4 = iArr[1];
                bArr[0] = (byte) ((i4 >> 24) & 255);
                bArr[1] = (byte) ((i4 >> 16) & 255);
                bArr[2] = (byte) ((i4 >> 8) & 255);
                bArr[3] = (byte) (i4 & 255);
                int i5 = iArr[0];
                bArr[4] = (byte) ((i5 >> 24) & 255);
                bArr[5] = (byte) ((i5 >> 16) & 255);
                bArr[6] = (byte) ((i5 >> 8) & 255);
                bArr[7] = (byte) (i5 & 255);
            } else if (i3 == 32) {
                SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
                int[] iArr2 = {(bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                int i6 = i2 + 3;
                int i7 = i2 + 2;
                int i8 = i2 + 1;
                int[] iArr3 = {r5 | ((-16777216) & (bArr2[r9] << 24)), (bArr2[i6] & 255) | ((bArr2[i7] << 8) & 65280) | ((bArr2[i8] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                int i9 = i2 + 7;
                int i10 = i2 + 6;
                int i11 = i2 + 5;
                int i12 = (bArr2[i9] & 255) | ((bArr2[i10] << 8) & 65280) | (16711680 & (bArr2[i11] << PKIBody._CKUANN));
                int i13 = i2 + 4;
                this.E.v(iArr3, iArr2, cryptParamsInterface.getCommutator());
                int i14 = iArr2[1];
                bArr[0] = (byte) ((i14 >> 24) & 255);
                bArr[1] = (byte) ((i14 >> 16) & 255);
                bArr[2] = (byte) ((i14 >> 8) & 255);
                bArr[3] = (byte) (i14 & 255);
                int i15 = iArr2[0];
                bArr[4] = (byte) ((i15 >> 24) & 255);
                bArr[5] = (byte) ((i15 >> 16) & 255);
                bArr[6] = (byte) ((i15 >> 8) & 255);
                bArr[7] = (byte) (i15 & 255);
                int i16 = iArr3[1];
                bArr2[i2] = (byte) ((i16 >> 24) & 255);
                bArr2[i8] = (byte) ((i16 >> 16) & 255);
                bArr2[i7] = (byte) ((i16 >> 8) & 255);
                bArr2[i6] = (byte) (i16 & 255);
                int i17 = iArr3[0];
                bArr2[i13] = (byte) ((i17 >> 24) & 255);
                bArr2[i11] = (byte) ((i17 >> 16) & 255);
                bArr2[i10] = (byte) ((i17 >> 8) & 255);
                bArr2[i9] = (byte) (i17 & 255);
            }
        } finally {
            this.E.A(randomInterface);
        }
    }

    public int decryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            int i5 = i;
            int i6 = i2;
            int i7 = i4;
            for (int i8 = i3; i8 > 0; i8--) {
                iArr[1] = (bArr2[i6 + 3] & 255) | ((bArr2[i6 + 2] << 8) & 65280) | ((bArr2[i6 + 1] << PKIBody._CKUANN) & 16711680) | ((bArr2[i6] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = (bArr2[i6 + 7] & 255) | ((bArr2[i6 + 6] << 8) & 65280) | ((bArr2[i6 + 5] << PKIBody._CKUANN) & 16711680) | ((bArr2[i6 + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                int i9 = i7 + 3;
                int i10 = i7 + 2;
                int i11 = i7 + 1;
                iArr2[1] = (bArr3[i9] & 255) | ((bArr3[i10] << 8) & 65280) | ((bArr3[i11] << PKIBody._CKUANN) & 16711680) | ((bArr3[i7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                int i12 = i7 + 7;
                int i13 = i7 + 6;
                int i14 = i7 + 5;
                int i15 = i7 + 4;
                iArr2[0] = (bArr3[i12] & 255) | ((bArr3[i13] << 8) & 65280) | ((bArr3[i14] << PKIBody._CKUANN) & 16711680) | ((bArr3[i15] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.v(iArr2, iArr, cryptParamsInterface.getCommutator());
                int i16 = iArr[1];
                bArr[i5] = (byte) ((i16 >> 24) & 255);
                bArr[i5 + 1] = (byte) ((i16 >> 16) & 255);
                bArr[i5 + 2] = (byte) ((i16 >> 8) & 255);
                bArr[i5 + 3] = (byte) (i16 & 255);
                int i17 = iArr[0];
                bArr[i5 + 4] = (byte) ((i17 >> 24) & 255);
                bArr[i5 + 5] = (byte) ((i17 >> 16) & 255);
                bArr[i5 + 6] = (byte) ((i17 >> 8) & 255);
                bArr[i5 + 7] = (byte) (i17 & 255);
                int i18 = iArr2[1];
                bArr3[i7] = (byte) ((i18 >> 24) & 255);
                bArr3[i11] = (byte) ((i18 >> 16) & 255);
                bArr3[i10] = (byte) ((i18 >> 8) & 255);
                bArr3[i9] = (byte) (i18 & 255);
                int i19 = iArr2[0];
                bArr3[i15] = (byte) ((i19 >> 24) & 255);
                bArr3[i14] = (byte) ((i19 >> 16) & 255);
                bArr3[i13] = (byte) ((i19 >> 8) & 255);
                bArr3[i12] = (byte) (i19 & 255);
                int i20 = this.x;
                i5 += i20;
                i6 += i20;
                i7 += i20;
                if (i7 >= bArr3.length) {
                    i7 -= bArr3.length;
                }
            }
            return i7;
        } finally {
            this.E.A(randomInterface);
        }
    }

    public void decryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            int i7 = i5 != 0 ? i5 : this.x;
            SelfTester_JCP.check(SelfTester_JCP.DECRYPT_CFB);
            char c = 2;
            int[] iArr = new int[2];
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            while (i10 > 0) {
                int length = bArr3.length - i11;
                int i12 = this.x;
                byte[] bArr5 = this.D;
                int i13 = 0;
                if (length < i12) {
                    Array.copy(bArr3, i11, bArr5, 0, bArr3.length - i11);
                    Array.copy(bArr3, 0, bArr5, bArr3.length - i11, this.x - (bArr3.length - i11));
                } else {
                    Array.copy(bArr3, i11, bArr5, 0, i12);
                }
                iArr[1] = (bArr5[3] & 255) | ((bArr5[c] << 8) & 65280) | ((bArr5[1] << PKIBody._CKUANN) & 16711680) | ((bArr5[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                char c2 = c;
                iArr[0] = (bArr5[7] & 255) | ((bArr5[6] << 8) & 65280) | ((bArr5[5] << PKIBody._CKUANN) & 16711680) | ((bArr5[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i14 = iArr[1];
                bArr5[0] = (byte) ((i14 >> 24) & 255);
                bArr5[1] = (byte) ((i14 >> 16) & 255);
                bArr5[c2] = (byte) ((i14 >> 8) & 255);
                bArr5[3] = (byte) (i14 & 255);
                int i15 = iArr[0];
                bArr5[4] = (byte) ((i15 >> 24) & 255);
                bArr5[5] = (byte) ((i15 >> 16) & 255);
                bArr5[6] = (byte) ((i15 >> 8) & 255);
                bArr5[7] = (byte) (i15 & 255);
                int i16 = 0;
                while (i16 < i7 && i10 > 0) {
                    bArr3[i11] = bArr2[i9];
                    bArr[i8] = (byte) (bArr5[i16] ^ bArr2[i9]);
                    i11++;
                    if (i11 >= bArr3.length) {
                        i11 -= bArr3.length;
                    }
                    i16++;
                    i8++;
                    i9++;
                    i10--;
                }
                if (i10 == 0 && (i6 = i3 % i7) != 0) {
                    while (i6 < i7) {
                        bArr4[i13] = bArr5[i6];
                        i6++;
                        i13++;
                    }
                }
                c = c2;
            }
            this.E.A(randomInterface);
        } catch (Throwable th) {
            this.E.A(randomInterface);
            throw th;
        }
    }

    public void decryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(1048576);
            int[] iArr = new int[2];
            while (i3 > 0) {
                iArr[1] = (bArr2[i2 + 3] & 255) | ((bArr2[i2 + 2] << 8) & 65280) | ((bArr2[i2 + 1] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = (bArr2[i2 + 7] & 255) | (65280 & (bArr2[i2 + 6] << 8)) | ((bArr2[i2 + 5] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2 + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.t(iArr, cryptParamsInterface.getCommutator());
                int i4 = iArr[1];
                bArr[i] = (byte) ((i4 >> 24) & 255);
                bArr[i + 1] = (byte) ((i4 >> 16) & 255);
                bArr[i + 2] = (byte) ((i4 >> 8) & 255);
                bArr[i + 3] = (byte) (i4 & 255);
                int i5 = iArr[0];
                bArr[i + 4] = (byte) ((i5 >> 24) & 255);
                bArr[i + 5] = (byte) ((i5 >> 16) & 255);
                bArr[i + 6] = (byte) ((i5 >> 8) & 255);
                bArr[i + 7] = (byte) (i5 & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            this.E.A(randomInterface);
        }
    }

    public void encrypt(int i, byte[] bArr, byte[] bArr2, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            int i3 = i & 2032;
            if (i3 == 16) {
                SelfTester_JCP.check(1048576);
                int[] iArr = {(bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                this.E.u(iArr, cryptParamsInterface.getCommutator(), (i & Integer.MIN_VALUE) != 0);
                int i4 = iArr[1];
                bArr[0] = (byte) ((i4 >> 24) & 255);
                bArr[1] = (byte) ((i4 >> 16) & 255);
                bArr[2] = (byte) ((i4 >> 8) & 255);
                bArr[3] = (byte) (i4 & 255);
                int i5 = iArr[0];
                bArr[4] = (byte) ((i5 >> 24) & 255);
                bArr[5] = (byte) ((i5 >> 16) & 255);
                bArr[6] = (byte) ((i5 >> 8) & 255);
                bArr[7] = (byte) (i5 & 255);
            } else if (i3 == 32) {
                SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
                int[] iArr2 = {(bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                int i6 = i2 + 3;
                int i7 = i2 + 2;
                int i8 = i2 + 1;
                int[] iArr3 = {r6 | ((-16777216) & (bArr2[r10] << 24)), (bArr2[i6] & 255) | ((bArr2[i7] << 8) & 65280) | ((bArr2[i8] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                int i9 = i2 + 7;
                int i10 = i2 + 6;
                int i11 = i2 + 5;
                int i12 = (bArr2[i9] & 255) | ((bArr2[i10] << 8) & 65280) | (16711680 & (bArr2[i11] << PKIBody._CKUANN));
                int i13 = i2 + 4;
                this.E.p(iArr3, iArr2, cryptParamsInterface.getCommutator());
                int i14 = iArr2[1];
                bArr[0] = (byte) ((i14 >> 24) & 255);
                bArr[1] = (byte) ((i14 >> 16) & 255);
                bArr[2] = (byte) ((i14 >> 8) & 255);
                bArr[3] = (byte) (i14 & 255);
                int i15 = iArr2[0];
                bArr[4] = (byte) ((i15 >> 24) & 255);
                bArr[5] = (byte) ((i15 >> 16) & 255);
                bArr[6] = (byte) ((i15 >> 8) & 255);
                bArr[7] = (byte) (i15 & 255);
                int i16 = iArr3[1];
                bArr2[i2] = (byte) ((i16 >> 24) & 255);
                bArr2[i8] = (byte) ((i16 >> 16) & 255);
                bArr2[i7] = (byte) ((i16 >> 8) & 255);
                bArr2[i6] = (byte) (i16 & 255);
                int i17 = iArr3[0];
                bArr2[i13] = (byte) ((i17 >> 24) & 255);
                bArr2[i11] = (byte) ((i17 >> 16) & 255);
                bArr2[i10] = (byte) ((i17 >> 8) & 255);
                bArr2[i9] = (byte) (i17 & 255);
            }
        } finally {
            this.E.A(randomInterface);
        }
    }

    public int encryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            int i5 = i;
            int i6 = i2;
            int i7 = i4;
            for (int i8 = i3; i8 > 0; i8--) {
                iArr[1] = (bArr2[i6 + 3] & 255) | ((bArr2[i6 + 2] << 8) & 65280) | ((bArr2[i6 + 1] << PKIBody._CKUANN) & 16711680) | ((bArr2[i6] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = (bArr2[i6 + 7] & 255) | ((bArr2[i6 + 6] << 8) & 65280) | ((bArr2[i6 + 5] << PKIBody._CKUANN) & 16711680) | ((bArr2[i6 + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                int i9 = i7 + 3;
                int i10 = i7 + 2;
                int i11 = i7 + 1;
                iArr2[1] = (bArr3[i9] & 255) | ((bArr3[i10] << 8) & 65280) | ((bArr3[i11] << PKIBody._CKUANN) & 16711680) | ((bArr3[i7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                int i12 = i7 + 7;
                int i13 = i7 + 6;
                int i14 = i7 + 5;
                int i15 = i7 + 4;
                iArr2[0] = (bArr3[i12] & 255) | ((bArr3[i13] << 8) & 65280) | ((bArr3[i14] << PKIBody._CKUANN) & 16711680) | ((bArr3[i15] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.p(iArr2, iArr, cryptParamsInterface.getCommutator());
                int i16 = iArr[1];
                bArr[i5] = (byte) ((i16 >> 24) & 255);
                bArr[i5 + 1] = (byte) ((i16 >> 16) & 255);
                bArr[i5 + 2] = (byte) ((i16 >> 8) & 255);
                bArr[i5 + 3] = (byte) (i16 & 255);
                int i17 = iArr[0];
                bArr[i5 + 4] = (byte) ((i17 >> 24) & 255);
                bArr[i5 + 5] = (byte) ((i17 >> 16) & 255);
                bArr[i5 + 6] = (byte) ((i17 >> 8) & 255);
                bArr[i5 + 7] = (byte) (i17 & 255);
                int i18 = iArr2[1];
                bArr3[i7] = (byte) ((i18 >> 24) & 255);
                bArr3[i11] = (byte) ((i18 >> 16) & 255);
                bArr3[i10] = (byte) ((i18 >> 8) & 255);
                bArr3[i9] = (byte) (i18 & 255);
                int i19 = iArr2[0];
                bArr3[i15] = (byte) ((i19 >> 24) & 255);
                bArr3[i14] = (byte) ((i19 >> 16) & 255);
                bArr3[i13] = (byte) ((i19 >> 8) & 255);
                bArr3[i12] = (byte) (i19 & 255);
                int i20 = this.x;
                i5 += i20;
                i6 += i20;
                i7 += i20;
                if (i7 >= bArr3.length) {
                    i7 -= bArr3.length;
                }
            }
            return i7;
        } finally {
            this.E.A(randomInterface);
        }
    }

    public void encryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            int i7 = i5 != 0 ? i5 : this.x;
            SelfTester_JCP.check(2097152);
            char c = 2;
            int[] iArr = new int[2];
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            while (i10 > 0) {
                int length = bArr3.length - i11;
                int i12 = this.x;
                byte[] bArr5 = this.D;
                int i13 = 0;
                if (length < i12) {
                    Array.copy(bArr3, i11, bArr5, 0, bArr3.length - i11);
                    Array.copy(bArr3, 0, bArr5, bArr3.length - i11, this.x - (bArr3.length - i11));
                } else {
                    Array.copy(bArr3, i11, bArr5, 0, i12);
                }
                iArr[1] = (bArr5[3] & 255) | ((bArr5[c] << 8) & 65280) | ((bArr5[1] << PKIBody._CKUANN) & 16711680) | ((bArr5[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                char c2 = c;
                iArr[0] = (bArr5[7] & 255) | ((bArr5[6] << 8) & 65280) | ((bArr5[5] << PKIBody._CKUANN) & 16711680) | ((bArr5[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i14 = iArr[1];
                bArr5[0] = (byte) ((i14 >> 24) & 255);
                bArr5[1] = (byte) ((i14 >> 16) & 255);
                bArr5[c2] = (byte) ((i14 >> 8) & 255);
                bArr5[3] = (byte) (i14 & 255);
                int i15 = iArr[0];
                bArr5[4] = (byte) ((i15 >> 24) & 255);
                bArr5[5] = (byte) ((i15 >> 16) & 255);
                bArr5[6] = (byte) ((i15 >> 8) & 255);
                bArr5[7] = (byte) (i15 & 255);
                int i16 = 0;
                while (i16 < i7 && i10 > 0) {
                    byte b = (byte) (bArr5[i16] ^ bArr2[i9]);
                    bArr[i8] = b;
                    bArr3[i11] = b;
                    i11++;
                    if (i11 >= bArr3.length) {
                        i11 -= bArr3.length;
                    }
                    i16++;
                    i8++;
                    i9++;
                    i10--;
                }
                if (i10 == 0 && (i6 = i3 % i7) != 0) {
                    while (i6 < i7) {
                        bArr4[i13] = bArr5[i6];
                        i6++;
                        i13++;
                    }
                }
                c = c2;
            }
            this.E.A(randomInterface);
        } catch (Throwable th) {
            this.E.A(randomInterface);
            throw th;
        }
    }

    public void encryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(1048576);
            int[] iArr = new int[2];
            while (i3 > 0) {
                iArr[1] = (bArr2[i2 + 3] & 255) | ((bArr2[i2 + 2] << 8) & 65280) | ((bArr2[i2 + 1] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = (bArr2[i2 + 7] & 255) | (65280 & (bArr2[i2 + 6] << 8)) | ((bArr2[i2 + 5] << PKIBody._CKUANN) & 16711680) | ((bArr2[i2 + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i4 = iArr[1];
                bArr[i] = (byte) ((i4 >> 24) & 255);
                bArr[i + 1] = (byte) ((i4 >> 16) & 255);
                bArr[i + 2] = (byte) ((i4 >> 8) & 255);
                bArr[i + 3] = (byte) (i4 & 255);
                int i5 = iArr[0];
                bArr[i + 4] = (byte) ((i5 >> 24) & 255);
                bArr[i + 5] = (byte) ((i5 >> 16) & 255);
                bArr[i + 6] = (byte) ((i5 >> 8) & 255);
                bArr[i + 7] = (byte) (i5 & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            this.E.A(randomInterface);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public long f() {
        return C1_magma;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public long g() {
        return C2_magma;
    }

    public void gammaCTR(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, byte[] bArr4, int i4, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i5;
        RandomInterface randomInterface = this.b;
        byte[] bArr5 = this.D;
        try {
            this.E.C();
            int i6 = i4 != 0 ? i4 : this.x;
            SelfTester_JCP.check(2097152);
            char c = 2;
            int[] iArr = new int[2];
            int i7 = i;
            int i8 = i2;
            int i9 = i3;
            while (i9 > 0) {
                int i10 = 0;
                Array.copy(bArr3, 0, bArr5, 0, this.x);
                iArr[1] = (bArr5[3] & 255) | ((bArr5[c] << 8) & 65280) | ((bArr5[1] << PKIBody._CKUANN) & 16711680) | ((bArr5[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                int i11 = ((bArr5[6] << 8) & 65280) | (bArr5[7] & 255) | ((bArr5[5] << PKIBody._CKUANN) & 16711680) | ((bArr5[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = i11;
                int i12 = i11 + 1;
                char c2 = c;
                bArr3[4] = (byte) ((i12 >> 24) & 255);
                bArr3[5] = (byte) ((i12 >> 16) & 255);
                bArr3[6] = (byte) ((i12 >> 8) & 255);
                bArr3[7] = (byte) (i12 & 255);
                this.E.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i13 = iArr[1];
                bArr5[0] = (byte) ((i13 >> 24) & 255);
                bArr5[1] = (byte) ((i13 >> 16) & 255);
                bArr5[c2] = (byte) ((i13 >> 8) & 255);
                bArr5[3] = (byte) (i13 & 255);
                int i14 = iArr[0];
                bArr5[4] = (byte) ((i14 >> 24) & 255);
                bArr5[5] = (byte) ((i14 >> 16) & 255);
                bArr5[6] = (byte) ((i14 >> 8) & 255);
                bArr5[7] = (byte) (i14 & 255);
                int i15 = 0;
                while (i15 < i6 && i9 > 0) {
                    bArr[i7] = (byte) (bArr5[i15] ^ bArr2[i8]);
                    i15++;
                    i7++;
                    i8++;
                    i9--;
                }
                if (i9 == 0 && (i5 = i3 % i6) != 0) {
                    while (i5 < i6) {
                        bArr4[i10] = bArr5[i5];
                        i5++;
                        i10++;
                    }
                }
                c = c2;
            }
            this.E.A(randomInterface);
        } catch (Throwable th) {
            this.E.A(randomInterface);
            throw th;
        }
    }

    public void gammaOFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4, byte[] bArr4, int i5, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int i6;
        RandomInterface randomInterface = this.b;
        byte[] bArr5 = this.D;
        try {
            this.E.C();
            int i7 = i5 != 0 ? i5 : this.x;
            SelfTester_JCP.check(2097152);
            char c = 2;
            int[] iArr = new int[2];
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            while (i10 > 0) {
                int i12 = 0;
                Array.copy(bArr3, i11, bArr5, 0, this.x);
                iArr[1] = (bArr5[3] & 255) | ((bArr5[c] << 8) & 65280) | ((bArr5[1] << PKIBody._CKUANN) & 16711680) | ((bArr5[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                char c2 = c;
                iArr[0] = (bArr5[7] & 255) | ((bArr5[6] << 8) & 65280) | ((bArr5[5] << PKIBody._CKUANN) & 16711680) | ((bArr5[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                this.E.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i13 = iArr[1];
                bArr5[0] = (byte) ((i13 >> 24) & 255);
                bArr5[1] = (byte) ((i13 >> 16) & 255);
                bArr5[c2] = (byte) ((i13 >> 8) & 255);
                bArr5[3] = (byte) (i13 & 255);
                int i14 = iArr[0];
                bArr5[4] = (byte) ((i14 >> 24) & 255);
                bArr5[5] = (byte) ((i14 >> 16) & 255);
                bArr5[6] = (byte) ((i14 >> 8) & 255);
                bArr5[7] = (byte) (i14 & 255);
                Array.copy(bArr5, 0, bArr3, i11, this.x);
                int i15 = 0;
                while (i15 < i7 && i10 > 0) {
                    bArr[i8] = (byte) (bArr5[i15] ^ bArr2[i9]);
                    i15++;
                    i8++;
                    i9++;
                    i10--;
                }
                i11 += this.x;
                if (i11 >= bArr3.length) {
                    i11 -= bArr3.length;
                }
                if (i10 == 0 && (i6 = i3 % i7) != 0) {
                    while (i6 < i7) {
                        bArr4[i12] = bArr5[i6];
                        i6++;
                        i12++;
                    }
                }
                c = c2;
            }
            this.E.A(randomInterface);
        } catch (Throwable th) {
            this.E.A(randomInterface);
            throw th;
        }
    }

    public void getImita(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException {
        byte[] byteArray;
        wu61 wu61Var;
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            if (i2 == 0) {
                byteArray = this.F.z().toByteArray();
                wu61Var = this.F;
            } else {
                byteArray = this.G.z().toByteArray();
                wu61Var = this.G;
            }
            byte[] E = wu61Var.E();
            for (int i3 = 0; i3 < bArr.length; i3++) {
                byte b = (byte) (bArr[i3] ^ byteArray[i3]);
                bArr[i3] = b;
                bArr[i3] = (byte) (b ^ E[i3]);
            }
            int i4 = (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
            int[] iArr = {r13, i4};
            int i5 = (bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
            iArr[0] = ((((bArr2[i + 7] & 255) | ((bArr2[i + 6] << 8) & 65280)) | ((bArr2[i + 5] << PKIBody._CKUANN) & 16711680)) | ((bArr2[i + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)) ^ i5;
            iArr[1] = ((((bArr2[i + 3] & 255) | (65280 & (bArr2[i + 2] << 8))) | ((bArr2[i + 1] << PKIBody._CKUANN) & 16711680)) | ((bArr2[i] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)) ^ i4;
            this.E.u(iArr, this.a.getCommutator(), true);
            int i6 = iArr[1];
            bArr[0] = (byte) ((i6 >> 24) & 255);
            bArr[1] = (byte) ((i6 >> 16) & 255);
            bArr[2] = (byte) ((i6 >> 8) & 255);
            bArr[3] = (byte) (i6 & 255);
            int i7 = iArr[0];
            bArr[4] = (byte) ((i7 >> 24) & 255);
            bArr[5] = (byte) ((i7 >> 16) & 255);
            bArr[6] = (byte) ((i7 >> 8) & 255);
            bArr[7] = (byte) (i7 & 255);
            this.E.A(randomInterface);
        } catch (Throwable th) {
            this.E.A(randomInterface);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public long h() {
        return C3_magma;
    }

    public void i() {
        wu61 a;
        if (this.a == null) {
            this.a = CryptParamsSpec.getInstance(CryptParamsSpec.OID_tc26_cipher_gost_3412_2015_M);
        }
        wu61 wu61Var = this.c;
        RandomInterface randomInterface = this.b;
        synchronized (wu61Var) {
            try {
                a = wu61Var.a(randomInterface);
                gu61 gu61Var = a.o;
                gu61Var.e = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                gu61Var.d = 8;
                a.x(randomInterface);
            } catch (InvalidKeyException e) {
                throw new KeyManagementException(e);
            }
        }
        this.E = a;
    }

    public void imita(byte[] bArr, byte[] bArr2, int i, int i2) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        try {
            this.E.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            char c = 2;
            int[] iArr = new int[2];
            int i3 = i;
            int i4 = 0;
            while (i4 < i2) {
                int i5 = (bArr[3] & 255) | ((bArr[c] << 8) & 65280) | ((bArr[1] << PKIBody._CKUANN) & 16711680) | ((bArr[0] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[1] = i5;
                int i6 = (bArr[7] & 255) | ((bArr[6] << 8) & 65280) | ((bArr[5] << PKIBody._CKUANN) & 16711680) | ((bArr[4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR);
                iArr[0] = i6;
                char c2 = c;
                iArr[0] = ((((bArr2[i3 + 7] & 255) | ((bArr2[i3 + 6] << 8) & 65280)) | ((bArr2[i3 + 5] << PKIBody._CKUANN) & 16711680)) | ((bArr2[i3 + 4] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)) ^ i6;
                iArr[1] = ((((bArr2[i3 + 3] & 255) | (65280 & (bArr2[i3 + 2] << 8))) | ((bArr2[i3 + 1] << PKIBody._CKUANN) & 16711680)) | ((bArr2[i3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)) ^ i5;
                this.E.u(iArr, this.a.getCommutator(), true);
                int i7 = iArr[1];
                bArr[0] = (byte) ((i7 >> 24) & 255);
                bArr[1] = (byte) ((i7 >> 16) & 255);
                bArr[c2] = (byte) ((i7 >> 8) & 255);
                bArr[3] = (byte) (i7 & 255);
                int i8 = iArr[0];
                bArr[4] = (byte) ((i8 >> 24) & 255);
                bArr[5] = (byte) ((i8 >> 16) & 255);
                bArr[6] = (byte) ((i8 >> 8) & 255);
                bArr[7] = (byte) (i8 & 255);
                i3 += this.x;
                i4++;
                c = c2;
            }
        } finally {
            this.E.A(randomInterface);
        }
    }

    public void j(SecretKeySpec secretKeySpec) {
        this.E = ((MagmaKeySpec) secretKeySpec).E.a(secretKeySpec.b);
    }

    public void m() {
        try {
            this.E.C();
            this.c.r(this.E, this.b);
        } finally {
            this.E.A(this.b);
        }
    }

    public final void o() {
        byte b;
        int i;
        int i2;
        if (this.F != null || this.G != null) {
            throw new KeyManagementException("K1 or K2 already exist");
        }
        int i3 = this.x;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr3, (byte) 0);
        try {
            try {
                encrypt(16, bArr, null, 0, this.a);
                int i4 = this.x;
                if (i4 == 8) {
                    b = DerValue.tag_GeneralString;
                } else {
                    if (i4 != 16) {
                        throw new KeyManagementException("Invalid block len");
                    }
                    b = -121;
                }
                Array.copy(bArr, bArr2);
                boolean z = (bArr2[0] & DerValue.TAG_CONTEXT) != 0;
                int i5 = 0;
                while (true) {
                    i = this.x - 1;
                    if (i5 >= i) {
                        break;
                    }
                    int i6 = i5 + 1;
                    bArr2[i5] = (byte) ((bArr2[i5] << 1) | ((bArr2[i6] >> 7) & 1));
                    i5 = i6;
                }
                byte b2 = (byte) (bArr2[i] << 1);
                bArr2[i] = b2;
                if (z) {
                    bArr2[i] = (byte) (b2 ^ b);
                }
                int i7 = 0;
                while (true) {
                    i2 = this.x - 1;
                    if (i7 >= i2) {
                        break;
                    }
                    int i8 = i7 + 1;
                    bArr3[i7] = (byte) ((bArr2[i7] << 1) | ((bArr2[i8] >> 7) & 1));
                    i7 = i8;
                }
                byte b3 = (byte) (bArr2[i2] << 1);
                bArr3[i2] = b3;
                if ((bArr2[0] & DerValue.TAG_CONTEXT) != 0) {
                    bArr3[i2] = (byte) (b ^ b3);
                }
                this.F = new wu61(Array.toIntArray(bArr2), this.b, 4);
                this.G = new wu61(Array.toIntArray(bArr3), this.b, 4);
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(bArr2, (byte) 0);
                Arrays.fill(bArr3, (byte) 0);
            } catch (InvalidKeyException e) {
                throw new KeyManagementException(e);
            }
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(bArr2, (byte) 0);
            Arrays.fill(bArr3, (byte) 0);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void setGammaBlockLen(int i) {
        this.E.o.d = i;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    public MagmaKeySpec(SecretKeySpec secretKeySpec) {
        super(secretKeySpec);
        this.F = null;
        this.G = null;
        j(secretKeySpec);
        o();
        this.D = Array.copy(((MagmaKeySpec) secretKeySpec).D);
    }

    public MagmaKeySpec(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) throws KeyManagementException {
        this(cryptParamsInterface, randomInterface, 1);
    }

    public MagmaKeySpec(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface, int i) {
        super(cryptParamsInterface, randomInterface, i);
        this.F = null;
        this.G = null;
        i();
        o();
        this.D = new byte[this.x];
    }

    public MagmaKeySpec(byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        this(bArr, i, i2, cryptParamsInterface, 1);
    }

    public MagmaKeySpec(byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface, int i3) {
        super(bArr, i, i2, cryptParamsInterface, i3);
        this.F = null;
        this.G = null;
        i();
        o();
        this.D = new byte[this.x];
    }

    public MagmaKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        this(bArr, cryptParamsInterface, 1);
    }

    public MagmaKeySpec(wu61 wu61Var, CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) {
        super(wu61Var, cryptParamsInterface, randomInterface);
        this.F = null;
        this.G = null;
        i();
        o();
        this.D = new byte[this.x];
    }

    public MagmaKeySpec(char[] cArr, byte[] bArr, ParamsInterface paramsInterface, AlgIdInterface algIdInterface) throws KeyManagementException {
        this(cArr, bArr, paramsInterface, algIdInterface, 1);
    }

    public MagmaKeySpec(char[] cArr, byte[] bArr, ParamsInterface paramsInterface, AlgIdInterface algIdInterface, int i) {
        super(cArr, bArr, paramsInterface, algIdInterface, i);
        this.F = null;
        this.G = null;
        i();
        o();
        this.D = new byte[this.x];
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            Array.byteOrder(iArr);
            int[] iArr2 = {iArr[1], iArr[0]};
            this.E.u(iArr2, cryptParamsInterface.getCommutator(), z);
            Array.byteOrder(iArr2);
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeySpec, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }
}
