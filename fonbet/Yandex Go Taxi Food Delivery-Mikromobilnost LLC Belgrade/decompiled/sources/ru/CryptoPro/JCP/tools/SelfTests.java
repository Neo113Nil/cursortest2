package ru.CryptoPro.JCP.tools;

import defpackage.av61;
import defpackage.b64;
import defpackage.d7g0;
import defpackage.gx61;
import defpackage.iq61;
import defpackage.s2u0;
import defpackage.yw61;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import ru.CryptoPro.JCP.Cipher.InGostCipher;
import ru.CryptoPro.JCP.Digest.CheckMemory;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.Key.PublicKeySpec;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Sign.GostSignature;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticPoint;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticConsts;
import ru.CryptoPro.JCP.params.EllipticConsts2012_512;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.spec.SelfTesterSpec;
import ru.CryptoPro.JCP.tools.CPVerify.CPVerifyException;
import ru.CryptoPro.JCP.tools.CPVerify.DigestStoreDefault;
import ru.CryptoPro.JCP.tools.CPVerify.VerifyFactory;

/* loaded from: classes4.dex */
public class SelfTests implements SelfTesterStrings {
    public static final int DAY_IN_MS = 86400000;
    public static final String DEFAULT_TESTS_STRING_Crypto = "ru.CryptoPro.JCP.tools.SelfTests$TestEncryptECB;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCFB;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCBC;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCNT;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptECB;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCFB;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCBC;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCNT;ru.CryptoPro.JCP.tools.SelfTests$TestImita;ru.CryptoPro.JCP.tools.SelfTests$TestImitaStep;ru.CryptoPro.JCP.tools.SelfTests$TestConstKMTS;";
    public static final String DEFAULT_TESTS_STRING_JCP = "ru.CryptoPro.JCP.tools.SelfTests$TestDigest;ru.CryptoPro.JCP.tools.SelfTests$TestDigestStep;ru.CryptoPro.JCP.tools.SelfTests$TestSignatureEl;ru.CryptoPro.JCP.tools.SelfTests$TestVerifyEl;ru.CryptoPro.JCP.tools.SelfTests$TestSignatureEl_2012_256_01Test;ru.CryptoPro.JCP.tools.SelfTests$TestVerifyEl_2012_256_01Test;ru.CryptoPro.JCP.tools.SelfTests$TestSignatureEl_2012_256_Edw;ru.CryptoPro.JCP.tools.SelfTests$TestVerifyEl_2012_256_Edw;ru.CryptoPro.JCP.tools.SelfTests$TestSignatureEl_2012_512_A;ru.CryptoPro.JCP.tools.SelfTests$TestVerifyEl_2012_512_A;ru.CryptoPro.JCP.tools.SelfTests$TestSignatureEl_2012_512_C_Edw;ru.CryptoPro.JCP.tools.SelfTests$TestVerifyEl_2012_512_C_Edw;ru.CryptoPro.JCP.tools.SelfTests$TestPowModEl;ru.CryptoPro.JCP.tools.SelfTests$TestPhi;ru.CryptoPro.JCP.tools.SelfTests$TestDigestStore;ru.CryptoPro.JCP.tools.SelfTests$TestConstElliptic;ru.CryptoPro.JCP.tools.SelfTests$TestLicense;ru.CryptoPro.JCP.tools.SelfTests$TestConstElliptic_2012_512;ru.CryptoPro.JCP.tools.SelfTests$TestDigest_2012_256;ru.CryptoPro.JCP.tools.SelfTests$TestDigest_2012_512;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptECB;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCFB;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCBC;ru.CryptoPro.JCP.tools.SelfTests$TestEncryptCNT;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptECB;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCFB;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCBC;ru.CryptoPro.JCP.tools.SelfTests$TestDecryptCNT;ru.CryptoPro.JCP.tools.SelfTests$TestImita;";
    public static final int[] TRIVIAL_MASK = {1, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] TRIVIAL_MASK_512 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static final class TestConstElliptic extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testConstElliptic();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestConstElliptic_2012_512 extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testConstElliptic_2012_512();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestConstKMTS extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testConstKMTS();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDecryptCBC extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCBCDecrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDecryptCFB extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCFBDecrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDecryptCNT extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCNTDecrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDecryptECB extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testECBsimpleDecrypt();
                SelfTests.testECBfullDecrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDigest extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testDigest50Bytes();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDigestStep extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testDigest32Bytes();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDigestStore extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final long getPeriod() {
            return 86400000L;
        }

        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testDigestStore();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDigest_2012_256 extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testDigest50Bytes_2012_256();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestDigest_2012_512 extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testDigest50Bytes_2012_512();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestEncryptCBC extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCBCEncrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestEncryptCFB extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCFBEncrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestEncryptCNT extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testCNTEncrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestEncryptECB extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testECBsimpleEncrypt();
                SelfTests.testECBfullEncrypt();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestImita extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testImita();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestImitaStep extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testImita();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestLicense extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
        }
    }

    public static final class TestPhi extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testPhi();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestPowModEl extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testModPow128El();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestSignature extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
        }
    }

    public static final class TestSignatureEl extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testSign128El();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestSignatureEl_2012_256_01Test extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testSign2012256El_01Test();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestSignatureEl_2012_256_Edw extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testSign2012256El_Edw();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestSignatureEl_2012_512_A extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testSign2012512El_A();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestSignatureEl_2012_512_C_Edw extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testSign2012512El_C_Edw();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestVerifyEl extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testVerify128El();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestVerifyEl_2012_256_01Test extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testVerify2012256El_01Test();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestVerifyEl_2012_256_Edw extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testVerify2012256El_Edw();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestVerifyEl_2012_512_A extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testVerify2012512El_A();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static final class TestVerifyEl_2012_512_C_Edw extends SelfTested {
        @Override // ru.CryptoPro.JCP.tools.SelfTested
        public final void run() {
            try {
                SelfTests.testVerify2012512El_C_Edw();
            } catch (Exception e) {
                s2u0.o(e);
            }
        }
    }

    public static int[] getBlock(int i, int[] iArr) {
        int i2 = i * 2;
        return new int[]{iArr[i2], iArr[i2 + 1]};
    }

    public static void printMakeSignatureException(byte[] bArr, byte[] bArr2, ParamsInterface paramsInterface) throws SelfTesterException {
        throw new SelfTesterException("Signature is incorrect (make signature):\nexpected: " + Array.toHexString(bArr) + "\nactual: " + Array.toHexString(bArr2) + "\nparams: " + paramsInterface.toString());
    }

    public static void printVerifySignatureException(int i, int[] iArr, ParamsInterface paramsInterface) throws SelfTesterException {
        StringBuilder t = b64.t(i, "Signature is incorrect (verify signature):\nreturnCode: ", "\nsignature: ");
        t.append(Array.toHexString(iArr));
        t.append("\nparams: ");
        t.append(paramsInterface.toString());
        throw new SelfTesterException(t.toString());
    }

    public static void testCBCDecrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CBC_CIPHERTEXT_A, SelfTesterSpec.CBC_CIPHERTEXT_B, SelfTesterSpec.CBC_CIPHERTEXT_C, SelfTesterSpec.CBC_CIPHERTEXT_D, SelfTesterSpec.CBC_CIPHERTEXT_E, SelfTesterSpec.CBC_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, iArr2[5]);
                    InGostCipher.cbc_decrypt(copy, block, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, SelfTesterSpec.PLAINTEXT_B, 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CBC_STRING);
                return;
            }
            int[] iArr6 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] leftPart = Array.leftPart(iArr2[i], 2);
            int[] rightPart = Array.rightPart(iArr2[i], 2);
            int[] iArr7 = SelfTesterSpec.KEY_MASK;
            InGostCipher.cbc_decrypt(copy2, leftPart, iArr6, 0, iArr7, 0, iArr3);
            InGostCipher.cbc_decrypt(copy2, rightPart, iArr6, 0, iArr7, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.PLAINTEXT_A, 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CBC_STRING);
                return;
            }
            i++;
        }
    }

    public static void testCBCEncrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CBC_CIPHERTEXT_A, SelfTesterSpec.CBC_CIPHERTEXT_B, SelfTesterSpec.CBC_CIPHERTEXT_C, SelfTesterSpec.CBC_CIPHERTEXT_D, SelfTesterSpec.CBC_CIPHERTEXT_E, SelfTesterSpec.CBC_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, SelfTesterSpec.PLAINTEXT_B);
                    InGostCipher.cbc_encrypt(copy, block, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, iArr2[5], 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CBC_STRING);
                return;
            }
            int[] iArr6 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] iArr7 = SelfTesterSpec.PLAINTEXT_A;
            int[] leftPart = Array.leftPart(iArr7, 2);
            int[] rightPart = Array.rightPart(iArr7, 2);
            int[] iArr8 = SelfTesterSpec.KEY_MASK;
            InGostCipher.cbc_encrypt(copy2, leftPart, iArr6, 0, iArr8, 0, iArr3);
            InGostCipher.cbc_encrypt(copy2, rightPart, iArr6, 0, iArr8, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), iArr2[i], 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CBC_STRING);
                return;
            }
            i++;
        }
    }

    public static void testCFBDecrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CFB_CIPHERTEXT_A, SelfTesterSpec.CFB_CIPHERTEXT_B, SelfTesterSpec.CFB_CIPHERTEXT_C, SelfTesterSpec.CFB_CIPHERTEXT_D, SelfTesterSpec.CFB_CIPHERTEXT_E, SelfTesterSpec.CFB_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, iArr2[5]);
                    InGostCipher.gamm_decrypt_back_int(copy, block, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, SelfTesterSpec.PLAINTEXT_B, 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CFB_STRING);
                return;
            }
            int[] iArr6 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] leftPart = Array.leftPart(iArr2[i], 2);
            int[] rightPart = Array.rightPart(iArr2[i], 2);
            int[] iArr7 = SelfTesterSpec.KEY_MASK;
            InGostCipher.gamm_decrypt_back_int(copy2, leftPart, iArr6, 0, iArr7, 0, iArr3);
            InGostCipher.gamm_decrypt_back_int(copy2, rightPart, iArr6, 0, iArr7, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.PLAINTEXT_A, 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CFB_STRING);
                return;
            }
            i++;
        }
    }

    public static void testCFBEncrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CFB_CIPHERTEXT_A, SelfTesterSpec.CFB_CIPHERTEXT_B, SelfTesterSpec.CFB_CIPHERTEXT_C, SelfTesterSpec.CFB_CIPHERTEXT_D, SelfTesterSpec.CFB_CIPHERTEXT_E, SelfTesterSpec.CFB_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, SelfTesterSpec.PLAINTEXT_B);
                    InGostCipher.gamm_encrypt_back_int(copy, block, 0, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, iArr2[5], 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CFB_STRING);
                return;
            }
            int[] iArr6 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] iArr7 = SelfTesterSpec.PLAINTEXT_A;
            int[] leftPart = Array.leftPart(iArr7, 2);
            int[] rightPart = Array.rightPart(iArr7, 2);
            int[] iArr8 = SelfTesterSpec.KEY_MASK;
            InGostCipher.gamm_encrypt_back_int(copy2, leftPart, 0, iArr6, 0, iArr8, 0, iArr3);
            InGostCipher.gamm_encrypt_back_int(copy2, rightPart, 0, iArr6, 0, iArr8, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), iArr2[i], 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CFB_STRING);
                return;
            }
            i++;
        }
    }

    public static void testCNTDecrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CNT_CIPHERTEXT_A, SelfTesterSpec.CNT_CIPHERTEXT_B, SelfTesterSpec.CNT_CIPHERTEXT_C, SelfTesterSpec.CNT_CIPHERTEXT_D, SelfTesterSpec.CNT_CIPHERTEXT_E, SelfTesterSpec.CNT_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                InGostCipher.simple_encrypt(copy, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, iArr2[5]);
                    int[] iArr6 = iArr4;
                    InGostCipher.gamm_crypt(copy, block, block, iArr6, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    iArr4 = iArr6;
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, SelfTesterSpec.PLAINTEXT_B, 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CNT_STRING);
                return;
            }
            int[] iArr7 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] iArr8 = SelfTesterSpec.KEY_MASK;
            InGostCipher.simple_encrypt(copy2, iArr7, 0, iArr8, 0, iArr3);
            int[] leftPart = Array.leftPart(iArr2[i], 2);
            int[] rightPart = Array.rightPart(iArr2[i], 2);
            InGostCipher.gamm_crypt(copy2, leftPart, leftPart, iArr7, 0, iArr8, 0, iArr3);
            InGostCipher.gamm_crypt(copy2, rightPart, rightPart, iArr7, 0, iArr8, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.PLAINTEXT_A, 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CNT_STRING);
                return;
            }
            i++;
        }
    }

    public static void testCNTEncrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.CNT_CIPHERTEXT_A, SelfTesterSpec.CNT_CIPHERTEXT_B, SelfTesterSpec.CNT_CIPHERTEXT_C, SelfTesterSpec.CNT_CIPHERTEXT_D, SelfTesterSpec.CNT_CIPHERTEXT_E, SelfTesterSpec.CNT_CIPHERTEXT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] copy = Array.copy(SelfTesterSpec.SYNCHRO_B);
                InGostCipher.simple_encrypt(copy, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                int[] iArr5 = new int[64];
                for (int i2 = 0; i2 < 32; i2++) {
                    int[] block = getBlock(i2, SelfTesterSpec.PLAINTEXT_B);
                    int[] iArr6 = iArr4;
                    InGostCipher.gamm_crypt(copy, block, block, iArr6, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    iArr4 = iArr6;
                    int i3 = i2 * 2;
                    iArr5[i3] = block[0];
                    iArr5[i3 + 1] = block[1];
                }
                if (Array.compare(iArr5, iArr2[5], 64)) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CNT_STRING);
                return;
            }
            int[] iArr7 = iArr[i];
            int[] copy2 = Array.copy(SelfTesterSpec.SYNCHRO_A);
            int[] iArr8 = SelfTesterSpec.KEY_MASK;
            InGostCipher.simple_encrypt(copy2, iArr7, 0, iArr8, 0, iArr3);
            int[] iArr9 = SelfTesterSpec.PLAINTEXT_A;
            int[] leftPart = Array.leftPart(iArr9, 2);
            int[] rightPart = Array.rightPart(iArr9, 2);
            InGostCipher.gamm_crypt(copy2, leftPart, leftPart, iArr7, 0, iArr8, 0, iArr3);
            InGostCipher.gamm_crypt(copy2, rightPart, rightPart, iArr7, 0, iArr8, 0, iArr3);
            if (!Array.compare(Array.merge(leftPart, rightPart), iArr2[i], 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_CNT_STRING);
                return;
            }
            i++;
        }
    }

    public static void testConstElliptic() throws SelfTesterException {
        CheckMemory checkMemory = new CheckMemory();
        checkMemory.update(EllipticConsts.ECCa_CryptoPRO, 0, 8);
        checkMemory.update(EllipticConsts.ECCa_desimal, 0, 8);
        checkMemory.update(EllipticConsts.ECCa_OSCAR, 0, 8);
        checkMemory.update(EllipticConsts.ECCa_PROvar1, 0, 8);
        checkMemory.update(EllipticConsts.ECCb_CryptoPRO, 0, 8);
        checkMemory.update(EllipticConsts.ECCb_desimal, 0, 8);
        checkMemory.update(EllipticConsts.ECCb_OSCAR, 0, 8);
        checkMemory.update(EllipticConsts.ECCb_PROvar1, 0, 8);
        checkMemory.update(EllipticConsts.ECCp_CryptoPRO, 0, 8);
        checkMemory.update(EllipticConsts.ECCp_desimal, 0, 8);
        checkMemory.update(EllipticConsts.ECCp_OSCAR, 0, 8);
        checkMemory.update(EllipticConsts.ECCp_PROvar1, 0, 8);
        checkMemory.update(EllipticConsts.ECCq_CryptoPRO, 0, 8);
        checkMemory.update(EllipticConsts.ECCq_desimal, 0, 8);
        checkMemory.update(EllipticConsts.ECCq_OSCAR, 0, 8);
        checkMemory.update(EllipticConsts.ECCq_PROvar1, 0, 8);
        checkMemory.update(EllipticConsts.ECCx_CryptoPRO, 0, 1);
        checkMemory.update(EllipticConsts.ECCx_desimal, 0, 1);
        checkMemory.update(EllipticConsts.ECCx_OSCAR, 0, 1);
        checkMemory.update(EllipticConsts.ECCx_PROvar1, 0, 1);
        checkMemory.update(EllipticConsts.ECCy_CryptoPRO, 0, 8);
        checkMemory.update(EllipticConsts.ECCy_desimal, 0, 8);
        checkMemory.update(EllipticConsts.ECCy_OSCAR, 0, 8);
        checkMemory.update(EllipticConsts.ECCy_PROvar1, 0, 8);
        if (checkMemory.get() == -243730336) {
            return;
        }
        d7g0.n("Elliptic constants are corrupted");
    }

    public static void testConstElliptic_2012_512() throws SelfTesterException {
        CheckMemory checkMemory = new CheckMemory();
        checkMemory.update(EllipticConsts2012_512.ECCa_tc26_A, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCa_tc26_B, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCb_tc26_A, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCb_tc26_B, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCp_tc26_A, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCp_tc26_B, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCq_tc26_A, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCq_tc26_B, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCx_tc26_A, 0, 1);
        checkMemory.update(EllipticConsts2012_512.ECCx_tc26_B, 0, 1);
        checkMemory.update(EllipticConsts2012_512.ECCy_tc26_A, 0, 16);
        checkMemory.update(EllipticConsts2012_512.ECCy_tc26_B, 0, 16);
        if (checkMemory.get() == -821639857) {
            return;
        }
        d7g0.n("Elliptic (2012, 512) constants are corrupted");
    }

    public static void testConstKMTS() throws SelfTesterException {
        CheckMemory checkMemory = new CheckMemory();
        checkMemory.update(iq61.L4, 0, 1024);
        checkMemory.update(iq61.K4, 0, 1024);
        checkMemory.update(iq61.S4, 0, 1024);
        checkMemory.update(iq61.T4, 0, 1024);
        checkMemory.update(iq61.P4, 0, 1024);
        checkMemory.update(iq61.Q4, 0, 1024);
        checkMemory.update(iq61.R4, 0, 1024);
        checkMemory.update(iq61.O4, 0, 1024);
        checkMemory.update(av61.q5, 0, 1024);
        checkMemory.update(av61.s5, 0, 1024);
        checkMemory.update(av61.t5, 0, 1024);
        checkMemory.update(av61.u5, 0, 1024);
        checkMemory.update(av61.r5, 0, 1024);
        if (checkMemory.get() == -606106582) {
            return;
        }
        d7g0.n("KMTs are corrupted");
    }

    public static void testDigest32Bytes() throws SelfTesterException {
        GostDigest gostDigest = new GostDigest(DigestParamsSpec.OID_HashTest);
        byte[] bArr = SelfTesterSpec.TEST_TEXT_SHORT;
        gostDigest.engineUpdate(bArr, 0, bArr.length);
        byte[] digestValue = gostDigest.digestValue();
        if (Array.compare(digestValue, SelfTesterSpec.TEST_RESULT_SHORT, digestValue.length)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_DIGEST_STRING);
    }

    public static void testDigest50Bytes() throws SelfTesterException {
        GostDigest gostDigest = new GostDigest(DigestParamsSpec.OID_HashTest);
        byte[] bArr = SelfTesterSpec.TEST_TEXT_LONG;
        gostDigest.engineUpdate(bArr, 0, bArr.length);
        byte[] digestValue = gostDigest.digestValue();
        if (Array.compare(digestValue, SelfTesterSpec.TEST_RESULT_LONG, digestValue.length)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_DIGEST_STRING);
    }

    public static void testDigest50Bytes_2012_256() throws SelfTesterException {
        GostDigest2012_256 gostDigest2012_256 = new GostDigest2012_256();
        byte[] bArr = SelfTesterSpec.TEST_TEXT_LONG;
        gostDigest2012_256.engineUpdate(bArr, 0, bArr.length);
        byte[] digestValue = gostDigest2012_256.digestValue();
        if (Array.compare(digestValue, SelfTesterSpec.TEST_RESULT_LONG_2012_256, digestValue.length)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_DIGEST_STRING_2012_256);
    }

    public static void testDigest50Bytes_2012_512() throws SelfTesterException {
        GostDigest2012_512 gostDigest2012_512 = new GostDigest2012_512();
        byte[] bArr = SelfTesterSpec.TEST_TEXT_LONG_2012_512;
        gostDigest2012_512.engineUpdate(bArr, 0, bArr.length);
        byte[] digestValue = gostDigest2012_512.digestValue();
        if (Array.compare(digestValue, SelfTesterSpec.TEST_RESULT_LONG_2012_512, digestValue.length)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_DIGEST_STRING_2012_512);
    }

    public static void testDigestStore() throws SelfTesterException {
        try {
            DigestStoreDefault digestStoreDefault = new DigestStoreDefault();
            if (digestStoreDefault.isExist()) {
                VerifyFactory verifyFactory = new VerifyFactory(digestStoreDefault);
                verifyFactory.getFilesFromStore();
                if (verifyFactory.verifyAll()) {
                } else {
                    throw new SelfTesterException(SelfTesterStrings.EXC_DIGEST_STORE_STRING);
                }
            }
        } catch (CPVerifyException e) {
            d7g0.m(e.getMessage(), e);
        }
    }

    public static void testECBfullDecrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.ECB_CIPHERTEXT_A, SelfTesterSpec.ECB_CIPHERTEXT_B, SelfTesterSpec.ECB_CIPHERTEXT_C, SelfTesterSpec.ECB_CIPHERTEXT_D, SelfTesterSpec.ECB_CIPHERTEXT_E};
        for (int i = 0; i < 5; i++) {
            int[] iArr3 = iArr[i];
            int[] leftPart = Array.leftPart(iArr2[i], 2);
            int[] rightPart = Array.rightPart(iArr2[i], 2);
            int[] iArr4 = SelfTesterSpec.KEY_MASK;
            int[] iArr5 = iq61.L4;
            InGostCipher.simple_decrypt(leftPart, iArr3, 0, iArr4, 0, iArr5);
            InGostCipher.simple_decrypt(rightPart, iArr3, 0, iArr4, 0, iArr5);
            if (!Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.PLAINTEXT_A, 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_ECB_STRING);
                return;
            }
        }
    }

    public static void testECBfullEncrypt() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[][] iArr2 = {SelfTesterSpec.ECB_CIPHERTEXT_A, SelfTesterSpec.ECB_CIPHERTEXT_B, SelfTesterSpec.ECB_CIPHERTEXT_C, SelfTesterSpec.ECB_CIPHERTEXT_D, SelfTesterSpec.ECB_CIPHERTEXT_E};
        for (int i = 0; i < 5; i++) {
            int[] iArr3 = iArr[i];
            int[] iArr4 = SelfTesterSpec.PLAINTEXT_A;
            int[] leftPart = Array.leftPart(iArr4, 2);
            int[] rightPart = Array.rightPart(iArr4, 2);
            int[] iArr5 = SelfTesterSpec.KEY_MASK;
            int[] iArr6 = iq61.L4;
            InGostCipher.simple_encrypt(leftPart, iArr3, 0, iArr5, 0, iArr6);
            InGostCipher.simple_encrypt(rightPart, iArr3, 0, iArr5, 0, iArr6);
            if (!Array.compare(Array.merge(leftPart, rightPart), iArr2[i], 4)) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_ECB_STRING);
                return;
            }
        }
    }

    public static void testECBsimpleDecrypt() throws SelfTesterException {
        int[] iArr = SelfTesterSpec.ECB_CIPHERTEXT_A;
        int[] leftPart = Array.leftPart(iArr, 2);
        int[] rightPart = Array.rightPart(iArr, 2);
        int[] iArr2 = SelfTesterSpec.MASK_KEY_A;
        int[] iArr3 = SelfTesterSpec.KEY_MASK;
        int[] iArr4 = iq61.L4;
        InGostCipher.simple_decrypt(leftPart, iArr2, 0, iArr3, 0, iArr4);
        InGostCipher.simple_decrypt(rightPart, iArr2, 0, iArr3, 0, iArr4);
        if (Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.PLAINTEXT_A, 4)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_CIPHER_ECB_STRING);
    }

    public static void testECBsimpleEncrypt() throws SelfTesterException {
        int[] iArr = SelfTesterSpec.PLAINTEXT_A;
        int[] leftPart = Array.leftPart(iArr, 2);
        int[] rightPart = Array.rightPart(iArr, 2);
        int[] iArr2 = SelfTesterSpec.MASK_KEY_A;
        int[] iArr3 = SelfTesterSpec.KEY_MASK;
        int[] iArr4 = iq61.L4;
        InGostCipher.simple_encrypt(leftPart, iArr2, 0, iArr3, 0, iArr4);
        InGostCipher.simple_encrypt(rightPart, iArr2, 0, iArr3, 0, iArr4);
        if (Array.compare(Array.merge(leftPart, rightPart), SelfTesterSpec.ECB_CIPHERTEXT_A, 4)) {
            return;
        }
        d7g0.n(SelfTesterStrings.EXC_CIPHER_ECB_STRING);
    }

    public static void testImita() throws SelfTesterException {
        int[][] iArr = {SelfTesterSpec.MASK_KEY_A, SelfTesterSpec.MASK_KEY_B, SelfTesterSpec.MASK_KEY_C, SelfTesterSpec.MASK_KEY_D, SelfTesterSpec.MASK_KEY_E};
        int[] iArr2 = {SelfTesterSpec.IMIT_A, SelfTesterSpec.IMIT_B, SelfTesterSpec.IMIT_C, SelfTesterSpec.IMIT_D, SelfTesterSpec.IMIT_E, SelfTesterSpec.IMIT_F};
        int i = 0;
        while (true) {
            int[] iArr3 = iq61.L4;
            if (i >= 5) {
                int[] iArr4 = iArr[4];
                int[] iArr5 = new int[2];
                int i2 = 0;
                while (i2 < 32) {
                    int[] xor = Array.xor(iArr5, getBlock(i2, SelfTesterSpec.PLAINTEXT_B));
                    InGostCipher.imita(xor, iArr4, 0, SelfTesterSpec.KEY_MASK, 0, iArr3);
                    i2++;
                    iArr5 = xor;
                }
                if (iArr5[0] == iArr2[5]) {
                    return;
                }
                d7g0.n(SelfTesterStrings.EXC_CIPHER_IMITA_STRING);
                return;
            }
            int[] iArr6 = iArr[i];
            int[] iArr7 = SelfTesterSpec.PLAINTEXT_A;
            int[] leftPart = Array.leftPart(iArr7, 2);
            int[] rightPart = Array.rightPart(iArr7, 2);
            int[] iArr8 = SelfTesterSpec.KEY_MASK;
            InGostCipher.imita(leftPart, iArr6, 0, iArr8, 0, iArr3);
            int[] xor2 = Array.xor(leftPart, rightPart);
            InGostCipher.imita(xor2, iArr6, 0, iArr8, 0, iArr3);
            if (xor2[0] != iArr2[i]) {
                d7g0.n(SelfTesterStrings.EXC_CIPHER_IMITA_STRING);
                return;
            }
            i++;
        }
    }

    public static void testModPow128El() throws SelfTesterException {
        EllipticParamsSpec ellipticParamsSpec = EllipticParamsSpec.getInstance(EllipticParamsSpec.OID_ECCTest3410);
        ellipticParamsSpec.getCurve();
        if (ellipticParamsSpec.getP().powerTAB(new BigIntr(SelfTesterSpec.TEST_K_EL_SIGN), true).getX().modCSP(ellipticParamsSpec.getQ()).compareTo(new BigIntr(Array.leftPart(SelfTesterSpec.TEST_EL_SIGN, 8))) == 0) {
            return;
        }
        d7g0.n("ModPowEl works incorrectly");
    }

    public static void testPhi() throws SelfTesterException {
        int[] iArr = SelfTesterSpec.S;
        int[] copy = Array.copy(iArr);
        int[] iArr2 = SelfTesterSpec.K;
        CertifiedRandom.phi(copy, iArr2, 4);
        if (!Array.compare(copy, SelfTesterSpec.RES_A, copy.length)) {
            d7g0.n(SelfTesterStrings.TEST_PHI_WORKS_INCORRECTLY);
            return;
        }
        int[] copy2 = Array.copy(iArr);
        CertifiedRandom.phi(copy2, iArr2, 5);
        if (Array.compare(copy2, SelfTesterSpec.RES_B, copy2.length)) {
            return;
        }
        d7g0.n(SelfTesterStrings.TEST_PHI_WORKS_INCORRECTLY);
    }

    public static void testSign128El() throws SelfTesterException {
        AlgIdSpec algIdSpec = new AlgIdSpec(AlgIdSpec.OID_19, EllipticParamsSpec.OID_ECCTest3410, (OID) null, (OID) null);
        try {
            SignValue makeSignature = PrivateKeySpec.makeSignature(SelfTesterSpec.TEST_KEY_EL_SIGN, 0, TRIVIAL_MASK, 0, algIdSpec, new BigIntr(SelfTesterSpec.TEST_K_EL_SIGN), Array.toByteArray(SelfTesterSpec.TEST_HASH_EL_SIGN), null);
            byte[] merge = Array.merge(((GostSignature) makeSignature).r.toByteArray(), ((GostSignature) makeSignature).s.toByteArray());
            byte[] byteArray = Array.toByteArray(SelfTesterSpec.TEST_EL_SIGN);
            if (Array.compare(merge, byteArray, merge.length)) {
                return;
            }
            printMakeSignatureException(byteArray, merge, algIdSpec.getSignParams());
        } catch (InvalidKeyException e) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e);
        } catch (SignatureException e2) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e2);
        }
    }

    public static void testSign2012256El_01Test() throws SelfTesterException {
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_256), new OID(EllipticParamsSpec.OID_ECCTest3410), new OID(DigestParamsSpec.OID_Gost2012_256), (OID) null);
        try {
            SignValue makeSignature = PrivateKeySpec.makeSignature(yw61.a, 0, TRIVIAL_MASK, 0, algIdSpec, new BigIntr(yw61.c), Array.toByteArray(yw61.b), null);
            byte[] merge = Array.merge(((GostSignature) makeSignature).r.toByteArray(), ((GostSignature) makeSignature).s.toByteArray());
            byte[] byteArray = Array.toByteArray(yw61.d);
            if (Array.compare(merge, byteArray, merge.length)) {
                return;
            }
            printMakeSignatureException(byteArray, merge, algIdSpec.getSignParams());
        } catch (InvalidKeyException e) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e);
        } catch (SignatureException e2) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e2);
        }
    }

    public static void testSign2012256El_Edw() throws SelfTesterException {
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_256), new OID(EllipticParamsSpec.OID_ECCSignEdw_TC26_A), new OID(DigestParamsSpec.OID_Gost2012_256), (OID) null);
        try {
            SignValue makeSignature = PrivateKeySpec.makeSignature(yw61.a, 0, TRIVIAL_MASK, 0, algIdSpec, new BigIntr(yw61.c), Array.toByteArray(yw61.b), null);
            byte[] merge = Array.merge(((GostSignature) makeSignature).r.toByteArray(), ((GostSignature) makeSignature).s.toByteArray());
            byte[] byteArray = Array.toByteArray(yw61.f);
            if (Array.compare(merge, byteArray, merge.length)) {
                return;
            }
            printMakeSignatureException(byteArray, merge, algIdSpec.getSignParams());
        } catch (InvalidKeyException e) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e);
        } catch (SignatureException e2) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e2);
        }
    }

    public static void testSign2012512El_A() throws SelfTesterException {
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_512), new OID(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetA), new OID(DigestParamsSpec.OID_Gost2012_512), (OID) null);
        try {
            SignValue makeSignature = PrivateKeySpec.makeSignature(gx61.a, 0, TRIVIAL_MASK_512, 0, algIdSpec, new BigIntr(gx61.c), Array.toByteArray(gx61.b), null);
            byte[] merge = Array.merge(((GostSignature) makeSignature).r.toByteArray(), ((GostSignature) makeSignature).s.toByteArray());
            byte[] byteArray = Array.toByteArray(gx61.d);
            if (Array.compare(merge, byteArray, merge.length)) {
                return;
            }
            printMakeSignatureException(byteArray, merge, algIdSpec.getSignParams());
        } catch (InvalidKeyException e) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e);
        } catch (SignatureException e2) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e2);
        }
    }

    public static void testSign2012512El_C_Edw() throws SelfTesterException {
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_512), new OID(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetC), new OID(DigestParamsSpec.OID_Gost2012_512), (OID) null);
        try {
            SignValue makeSignature = PrivateKeySpec.makeSignature(gx61.a, 0, TRIVIAL_MASK_512, 0, algIdSpec, new BigIntr(gx61.c), Array.toByteArray(gx61.b), null);
            byte[] merge = Array.merge(((GostSignature) makeSignature).r.toByteArray(), ((GostSignature) makeSignature).s.toByteArray());
            byte[] byteArray = Array.toByteArray(gx61.f);
            if (Array.compare(merge, byteArray, merge.length)) {
                return;
            }
            printMakeSignatureException(byteArray, merge, algIdSpec.getSignParams());
        } catch (InvalidKeyException e) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e);
        } catch (SignatureException e2) {
            d7g0.m(SelfTesterStrings.EXC_SIGN_FA_STRING, e2);
        }
    }

    public static void testVerify128El() throws SelfTesterException {
        String str;
        int[] iArr = SelfTesterSpec.TEST_EL_SIGN;
        int[] iArr2 = SelfTesterSpec.TEST_PUBLIC_KEY_EL_SIGN;
        AlgIdSpec algIdSpec = new AlgIdSpec(AlgIdSpec.OID_19, EllipticParamsSpec.OID_ECCTest3410, (OID) null, (OID) null);
        try {
            GostSignature gostSignature = new GostSignature(iArr);
            EllipticPoint instanceOnIntArray = EllipticPoint.getInstanceOnIntArray(((EllipticParamsInterface) algIdSpec.getSignParams()).getCurve(), iArr2);
            int checkSignature = new PublicKeySpec(instanceOnIntArray, algIdSpec, true).checkSignature(gostSignature, Array.toByteArray(SelfTesterSpec.TEST_HASH_EL_SIGN));
            if (checkSignature != 0) {
                printVerifySignatureException(checkSignature, iArr, algIdSpec.getSignParams());
            }
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = SelfTesterStrings.EXC_SIGN_PA_STRING;
            d7g0.m(str, e);
        } catch (SignatureException e2) {
            e = e2;
            str = SelfTesterStrings.EXC_SIGN_FA_STRING;
            d7g0.m(str, e);
        }
    }

    public static void testVerify2012256El_01Test() throws SelfTesterException {
        String str;
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_256), new OID(EllipticParamsSpec.OID_ECCTest3410), new OID(DigestParamsSpec.OID_Gost2012_256), (OID) null);
        try {
            int[] iArr = yw61.d;
            int[] iArr2 = yw61.e;
            GostSignature gostSignature = new GostSignature(iArr);
            EllipticPoint instanceOnIntArray = EllipticPoint.getInstanceOnIntArray(((EllipticParamsInterface) algIdSpec.getSignParams()).getCurve(), iArr2);
            int checkSignature = new PublicKeySpec(instanceOnIntArray, algIdSpec, true).checkSignature(gostSignature, Array.toByteArray(yw61.b));
            if (checkSignature != 0) {
                printVerifySignatureException(checkSignature, iArr, algIdSpec.getSignParams());
            }
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = SelfTesterStrings.EXC_SIGN_PA_STRING;
            d7g0.m(str, e);
        } catch (SignatureException e2) {
            e = e2;
            str = SelfTesterStrings.EXC_SIGN_FA_STRING;
            d7g0.m(str, e);
        }
    }

    public static void testVerify2012256El_Edw() throws SelfTesterException {
        String str;
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_256), new OID(EllipticParamsSpec.OID_ECCSignEdw_TC26_A), new OID(DigestParamsSpec.OID_Gost2012_256), (OID) null);
        try {
            int[] iArr = yw61.f;
            int[] iArr2 = yw61.g;
            GostSignature gostSignature = new GostSignature(iArr);
            EllipticPoint translatePoint = EllipticPoint.translatePoint(iArr2, ((EllipticParamsInterface) algIdSpec.getSignParams()).getCurve());
            int checkSignature = new PublicKeySpec(translatePoint, algIdSpec, true).checkSignature(gostSignature, Array.toByteArray(yw61.b));
            if (checkSignature != 0) {
                printVerifySignatureException(checkSignature, iArr, algIdSpec.getSignParams());
            }
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = SelfTesterStrings.EXC_SIGN_PA_STRING;
            d7g0.m(str, e);
        } catch (SignatureException e2) {
            e = e2;
            str = SelfTesterStrings.EXC_SIGN_FA_STRING;
            d7g0.m(str, e);
        }
    }

    public static void testVerify2012512El_A() throws SelfTesterException {
        String str;
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_512), new OID(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetA), new OID(DigestParamsSpec.OID_Gost2012_512), (OID) null);
        try {
            int[] iArr = gx61.d;
            int[] iArr2 = gx61.e;
            GostSignature gostSignature = new GostSignature(iArr);
            EllipticPoint instanceOnIntArray = EllipticPoint.getInstanceOnIntArray(((EllipticParamsInterface) algIdSpec.getSignParams()).getCurve(), iArr2);
            int checkSignature = new PublicKeySpec(instanceOnIntArray, algIdSpec, true).checkSignature(gostSignature, Array.toByteArray(gx61.b));
            if (checkSignature != 0) {
                printVerifySignatureException(checkSignature, iArr, algIdSpec.getSignParams());
            }
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = SelfTesterStrings.EXC_SIGN_PA_STRING;
            d7g0.m(str, e);
        } catch (SignatureException e2) {
            e = e2;
            str = SelfTesterStrings.EXC_SIGN_FA_STRING;
            d7g0.m(str, e);
        }
    }

    public static void testVerify2012512El_C_Edw() throws SelfTesterException {
        String str;
        AlgIdSpec algIdSpec = new AlgIdSpec(new OID(AlgIdSpec.OID_PARAMS_SIG_2012_512), new OID(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetC), new OID(DigestParamsSpec.OID_Gost2012_512), (OID) null);
        try {
            int[] iArr = gx61.f;
            int[] iArr2 = gx61.g;
            GostSignature gostSignature = new GostSignature(iArr);
            EllipticPoint translatePoint = EllipticPoint.translatePoint(iArr2, ((EllipticParamsInterface) algIdSpec.getSignParams()).getCurve());
            int checkSignature = new PublicKeySpec(translatePoint, algIdSpec, true).checkSignature(gostSignature, Array.toByteArray(gx61.b));
            if (checkSignature != 0) {
                printVerifySignatureException(checkSignature, iArr, algIdSpec.getSignParams());
            }
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = SelfTesterStrings.EXC_SIGN_PA_STRING;
            d7g0.m(str, e);
        } catch (SignatureException e2) {
            e = e2;
            str = SelfTesterStrings.EXC_SIGN_FA_STRING;
            d7g0.m(str, e);
        }
    }
}
