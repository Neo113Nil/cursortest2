package ru.CryptoPro.JCP.Key;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.dy31;
import defpackage.w511;
import defpackage.wu61;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.Cipher.InGostCipher;
import ru.CryptoPro.JCP.Cipher.InGostHMAC2012_256;
import ru.CryptoPro.JCP.Cipher.InGostMac;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class SecretKeySpec implements SecretKeyInterface, DiversKeyInterface {
    public static final byte[] C = {68, 69, 78, 69, Alerts.alert_protocol_version, 72, 48, Alerts.alert_decode_error, 56, Alerts.alert_certificate_unknown, 55, 54, 48, Alerts.alert_decode_error, 52, 54, 55, 56, 53, Alerts.alert_certificate_unknown, 73, 85, 69, Alerts.alert_protocol_version, 72, 87, 85, 73, 79, Alerts.alert_certificate_unknown, 69, Alerts.alert_protocol_version};
    public static final int KEY_LEN = 32;
    public static final int KEY_LEN_LONG = 64;
    public static final int KEY_SIZE = 8;
    public static final int KEY_SIZE_LONG = 16;
    public static final int MODE_CBC = 32;
    public static final int MODE_CFB = 128;
    public static final int MODE_CNT = 64;
    public static final int MODE_CTR = 256;
    public static final int MODE_CTR_ACPKM = 512;
    public static final int MODE_DECRYPT = 2;
    public static final int MODE_ECB = 16;
    public static final int MODE_ENCRYPT = 1;
    public static final int MODE_OFB = 64;
    public static final int MODE_OMAC_CTR = 1024;
    public static final int SUPPRESS_4M_MODE = Integer.MIN_VALUE;
    public static final String UNWRAP_ERR = "UnwrapError";
    public static final String WRAP_ERR = "WrapError";
    public SecretKeySpec A;
    public SecretKeySpec B;
    public CryptParamsInterface a;
    public final RandomInterface b;
    public final wu61 c;
    public final wu61 w;
    public int x;
    public int y;
    public SecretKeySpec z;

    public SecretKeySpec(char[] cArr, byte[] bArr, ParamsInterface paramsInterface, AlgIdInterface algIdInterface, int i) {
        int[] iArr;
        this.a = null;
        this.b = null;
        this.z = null;
        this.A = null;
        this.B = null;
        e();
        this.b = new CPRandom();
        this.a = algIdInterface == null ? null : (CryptParamsInterface) algIdInterface.getCryptParams();
        RandomInterface randomInterface = this.b;
        boolean z = paramsInterface.getOID().equals(AlgIdSpec.OID_DIGEST_2012_256) || paramsInterface.getOID().equals(AlgIdSpec.OID_DIGEST_2012_512);
        int i2 = cArr == null ? 1 : 1999;
        int i3 = (z ? 16 : 8) << 2;
        OID oid = paramsInterface.getOID();
        AbstractGostDigest gostDigest2012_256 = z ? new GostDigest2012_256() : new GostDigest(oid);
        gostDigest2012_256.engineUpdate(bArr, 0, bArr.length);
        if (cArr != null) {
            byte[] c = c(cArr);
            gostDigest2012_256.engineUpdate(c, 0, c.length);
        }
        byte[] engineDigest = gostDigest2012_256.engineDigest();
        byte[] bArr2 = new byte[i3];
        System.arraycopy(C, 0, bArr2, 0, 32);
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        int i4 = 0;
        while (true) {
            int i5 = i2 + 1;
            gostDigest2012_256.reset(oid);
            if (i4 >= i5) {
                break;
            }
            for (int i6 = 0; i6 < i3; i6++) {
                bArr3[i6] = (byte) (bArr2[i6] ^ 54);
                bArr4[i6] = (byte) (bArr2[i6] ^ 92);
            }
            Arrays.fill(bArr2, (byte) 0);
            gostDigest2012_256.engineUpdate(bArr3, 0, i3);
            gostDigest2012_256.engineUpdate(engineDigest, 0, engineDigest.length);
            gostDigest2012_256.engineUpdate(bArr4, 0, i3);
            gostDigest2012_256.engineUpdate(engineDigest, 0, engineDigest.length);
            byte[] engineDigest2 = gostDigest2012_256.engineDigest();
            System.arraycopy(engineDigest2, 0, bArr2, 0, engineDigest2.length);
            i4++;
        }
        for (int i7 = 0; i7 < 32; i7++) {
            bArr3[i7] = (byte) (bArr2[i7] ^ 54);
            bArr4[i7] = (byte) (bArr2[i7] ^ 92);
        }
        Arrays.fill(bArr2, (byte) 0);
        gostDigest2012_256.engineUpdate(bArr3, 0, 32);
        gostDigest2012_256.engineUpdate(bArr, 0, bArr.length);
        gostDigest2012_256.engineUpdate(bArr4, 0, 32);
        if (cArr != null) {
            byte[] c2 = c(cArr);
            gostDigest2012_256.engineUpdate(c2, 0, c2.length);
        }
        byte[] engineDigest3 = gostDigest2012_256.engineDigest();
        System.arraycopy(engineDigest3, 0, bArr2, 0, engineDigest3.length);
        gostDigest2012_256.reset(oid);
        gostDigest2012_256.engineUpdate(bArr2, 0, 32);
        try {
            bArr2 = gostDigest2012_256.engineDigest();
            iArr = Array.toIntArray(bArr2);
            try {
                wu61 wu61Var = new wu61(iArr, randomInterface, i);
                if (bArr2 != null) {
                    Array.clear(bArr2);
                }
                Array.clear(iArr);
                this.w = wu61Var;
                try {
                    this.c = wu61Var.a(this.b);
                } catch (InvalidKeyException e) {
                    throw new KeyManagementException(e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                if (bArr2 != null) {
                    Array.clear(bArr2);
                }
                if (iArr != null) {
                    Array.clear(iArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iArr = null;
        }
    }

    public static boolean b(long j, long j2) {
        return j == 0 || ((j - 1) & j2) != (j & j2);
    }

    public static byte[] c(char[] cArr) {
        byte[] bArr = new byte[cArr.length << 2];
        for (int i = 0; i < cArr.length; i++) {
            int i2 = i << 2;
            char c = cArr[i];
            bArr[i2] = (byte) (c & 255);
            bArr[i2 + 1] = (byte) ((c >>> '\b') & 255);
            bArr[i2 + 3] = 0;
            bArr[i2 + 2] = 0;
        }
        return bArr;
    }

    public static byte[] d(SecretKeyInterface secretKeyInterface, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        try {
            byte[] bArr3 = {0};
            byte[] byteArrayI = Array.toByteArrayI(i);
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
            int length3 = i3 + bArr.length;
            Array.copy(bArr3, 0, bArr5, length3, 1);
            int i5 = length3 + 1;
            Array.copy(bArr2, 0, bArr5, i5, bArr2.length);
            Array.copy(bArr4, 0, bArr5, i5 + bArr2.length, length);
            InGostHMAC2012_256 inGostHMAC2012_256 = new InGostHMAC2012_256();
            inGostHMAC2012_256.init(secretKeyInterface, null);
            inGostHMAC2012_256.engineUpdate(bArr5, 0, length2);
            return inGostHMAC2012_256.engineDoFinal();
        } catch (InvalidAlgorithmParameterException e) {
            dy31.s(e);
            return null;
        }
    }

    public static SecretKeySpec expand(SecretKeySpec secretKeySpec) throws InvalidKeyException, KeyManagementException {
        try {
            secretKeySpec.c.C();
            return new SecretKeySpec(new wu61(secretKeySpec.c, secretKeySpec.b, 16), secretKeySpec.a, secretKeySpec.b);
        } finally {
            secretKeySpec.c.A(secretKeySpec.b);
        }
    }

    public final SecretKeySpec a(long j, long j2, String str) {
        return (SecretKeySpec) ((SpecKey) diversKeyByBlob((String) null, new KdfTreeDiversKeySpec(null, str.getBytes(), 1, Array.toByteArrayI(j & j2), 256, 1))).getSpec();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void changeKey(CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(16777216);
            if (cryptParamsInterface == null) {
                cryptParamsInterface = this.a;
            }
            wu61Var.k(cryptParamsInterface, randomInterface);
            wu61Var.A(randomInterface);
        } catch (Throwable th) {
            wu61Var.A(randomInterface);
            throw th;
        }
    }

    public boolean checkContainerImito(byte[] bArr, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        byte[] computeContainerImito = computeContainerImito(bArr, cryptParamsInterface);
        return Array.compare(computeContainerImito, bArr2, computeContainerImito.length);
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        wu61 wu61Var = this.c;
        if (wu61Var != null) {
            wu61Var.w();
        }
        wu61 wu61Var2 = this.w;
        if (wu61Var2 != null) {
            wu61Var2.w();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        try {
            return new SecretKeySpec(this);
        } catch (Exception e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        }
    }

    public byte[] computeContainerImito(byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        int countImitaBig;
        try {
            this.c.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            wu61 wu61Var = this.c;
            int length = bArr.length;
            int[] commutator = cryptParamsInterface.getCommutator();
            synchronized (wu61Var) {
                wu61Var.o.a(length);
                countImitaBig = InGostMac.countImitaBig(bArr, 0, length, wu61Var.a, wu61Var.c, wu61Var.b, wu61Var.d, commutator);
            }
            byte[] bArr2 = {(byte) (countImitaBig & 255), (byte) ((countImitaBig >> 8) & 255), (byte) ((countImitaBig >> 16) & 255), (byte) ((countImitaBig >> 24) & 255)};
            this.c.A(this.b);
            return bArr2;
        } catch (Throwable th) {
            this.c.A(this.b);
            throw th;
        }
    }

    public void contextDecrypt(int[] iArr, int[] iArr2, wu61 wu61Var) throws InvalidKeyException {
        try {
            this.c.C();
            SelfTester_JCP.check(16777216);
            wu61 wu61Var2 = this.c;
            synchronized (wu61Var2) {
                wu61Var2.o.a(iArr.length * 4);
                InGostCipher.simple_decrypt_key(iArr, wu61Var.a, wu61Var.c, wu61Var2.a, wu61Var2.c, wu61Var2.b, wu61Var2.d, iArr2);
            }
        } finally {
            this.c.A(this.b);
        }
    }

    public void contextEncrypt(wu61 wu61Var, int[] iArr, int[] iArr2) throws InvalidKeyException {
        try {
            this.c.C();
            SelfTester_JCP.check(1048576);
            this.c.g(wu61Var, iArr2, iArr);
        } finally {
            this.c.A(this.b);
        }
    }

    public void cryptCNT(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CNT);
            int[] iArr2 = new int[2];
            while (i3 > 0) {
                wu61Var.y(iArr2, iArr, cryptParamsInterface.getCommutator());
                byte b = bArr2[i2];
                int i4 = iArr2[0];
                bArr[i] = (byte) (b ^ (i4 & 255));
                bArr[i + 1] = (byte) (bArr2[i2 + 1] ^ ((i4 >> 8) & 255));
                bArr[i + 2] = (byte) (bArr2[i2 + 2] ^ ((i4 >> 16) & 255));
                bArr[i + 3] = (byte) (((i4 >> 24) & 255) ^ bArr2[i2 + 3]);
                byte b2 = bArr2[i2 + 4];
                int i5 = iArr2[1];
                bArr[i + 4] = (byte) (b2 ^ (i5 & 255));
                bArr[i + 5] = (byte) (bArr2[i2 + 5] ^ ((i5 >> 8) & 255));
                bArr[i + 6] = (byte) (bArr2[i2 + 6] ^ ((i5 >> 16) & 255));
                bArr[i + 7] = (byte) (bArr2[i2 + 7] ^ ((i5 >> 24) & 255));
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        try {
            this.c.C();
            int i5 = i & 2032;
            if (i5 == 16) {
                decryptECB(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 32) {
                decryptCBC(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 64) {
                cryptCNT(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 128) {
                decryptCFB(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            }
        } finally {
            this.c.A(this.b);
        }
    }

    public void decryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            while (i3 > 0) {
                int[] iArr2 = {(bArr2[i2] & 255) | ((bArr2[i2 + 1] << 8) & 65280) | ((bArr2[i2 + 2] << 16) & 16711680) | ((bArr2[i2 + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr2[i2 + 4] & 255) | (65280 & (bArr2[i2 + 5] << 8)) | ((bArr2[i2 + 6] << 16) & 16711680) | ((bArr2[i2 + 7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                wu61Var.v(iArr, iArr2, cryptParamsInterface.getCommutator());
                int i4 = iArr2[0];
                bArr[i] = (byte) (i4 & 255);
                bArr[i + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i + 2] = (byte) ((i4 >> 16) & 255);
                bArr[i + 3] = (byte) ((i4 >> 24) & 255);
                int i5 = iArr2[1];
                bArr[i + 4] = (byte) (i5 & 255);
                bArr[i + 5] = (byte) ((i5 >> 8) & 255);
                bArr[i + 6] = (byte) ((i5 >> 16) & 255);
                bArr[i + 7] = (byte) ((i5 >> 24) & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    public void decryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(SelfTester_JCP.DECRYPT_CFB);
            for (int i4 = 0; i4 < i3; i4++) {
                wu61Var.u(iArr, cryptParamsInterface.getCommutator(), false);
                int[] iArr2 = {iArr[0], iArr[1]};
                iArr[0] = Array.getInt(bArr2, (this.x * i4) + i2);
                iArr[1] = Array.getInt(bArr2, (this.x * i4) + i2 + 4);
                int i5 = this.x * i4;
                Array.toByteArrayXOR(bArr, i5 + i, iArr2, bArr2, i5 + i2);
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    public void decryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(1048576);
            while (i3 > 0) {
                int[] iArr2 = {(bArr2[i2] & 255) | ((bArr2[i2 + 1] << 8) & 65280) | ((bArr2[i2 + 2] << 16) & 16711680) | ((bArr2[i2 + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr2[i2 + 4] & 255) | (65280 & (bArr2[i2 + 5] << 8)) | ((bArr2[i2 + 6] << 16) & 16711680) | ((bArr2[i2 + 7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                wu61Var.t(iArr2, cryptParamsInterface.getCommutator());
                int i4 = iArr2[0];
                bArr[i] = (byte) (i4 & 255);
                bArr[i + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i + 2] = (byte) ((i4 >> 16) & 255);
                bArr[i + 3] = (byte) ((i4 >> 24) & 255);
                int i5 = iArr2[1];
                bArr[i + 4] = (byte) (i5 & 255);
                bArr[i + 5] = (byte) ((i5 >> 8) & 255);
                bArr[i + 6] = (byte) ((i5 >> 16) & 255);
                bArr[i + 7] = (byte) ((i5 >> 24) & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    public void digest(MessageDigest messageDigest) throws InvalidKeyException {
        try {
            this.c.C();
            if (messageDigest instanceof GostDigest) {
                SelfTester_JCP.check(1);
            } else if (messageDigest instanceof GostDigest2012_256) {
                SelfTester_JCP.check(262144);
            } else if (messageDigest instanceof GostDigest2012_512) {
                SelfTester_JCP.check(524288);
            }
            this.c.h(messageDigest);
            this.c.A(this.b);
        } catch (Throwable th) {
            this.c.A(this.b);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey(byte[] bArr) throws InvalidKeyException {
        try {
            this.c.C();
            this.c.l(this.a, this.b, bArr);
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void diversKey2012(byte[] bArr) throws InvalidKeyException {
        try {
            this.c.C();
            this.c.n(bArr, this.b);
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(String str, DiversKeyBase diversKeyBase) throws InvalidKeyException {
        KeySpec kuznechikKeySpec;
        try {
            if (diversKeyBase.getDiversType() != 3) {
                throw new InvalidKeyException("Invalid divers type: " + diversKeyBase.getDiversType());
            }
            KdfTreeDiversKeySpec kdfTreeDiversKeySpec = (KdfTreeDiversKeySpec) diversKeyBase;
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) clone();
            byte[] d = d(secretKeyInterface, kdfTreeDiversKeySpec.getLabel(), kdfTreeDiversKeySpec.getSeed(), kdfTreeDiversKeySpec.getIterationNumber(), kdfTreeDiversKeySpec.getL(), kdfTreeDiversKeySpec.getR());
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("GOST28147");
            if (str == null) {
                kuznechikKeySpec = secretKeyInterface instanceof KuznechikKeySpec ? new KuznechikKeySpec(d, (CryptParamsInterface) null) : secretKeyInterface instanceof MagmaKeySpec ? new MagmaKeySpec(d, (CryptParamsInterface) null) : new SecretKeySpec(d, (CryptParamsInterface) null);
            } else if (str.equals("GOST28147")) {
                kuznechikKeySpec = new SecretKeySpec(d, (CryptParamsInterface) null);
            } else if (str.equals("GOST3412_2015_M")) {
                kuznechikKeySpec = new MagmaKeySpec(d, (CryptParamsInterface) null);
            } else {
                if (!str.equals("GOST3412_2015_K")) {
                    throw new IllegalArgumentException("Invalid key algorithm: ".concat(str));
                }
                kuznechikKeySpec = new KuznechikKeySpec(d, (CryptParamsInterface) null);
            }
            return secretKeyFactory.generateSecret(kuznechikKeySpec);
        } catch (CloneNotSupportedException e) {
            dy31.s(e);
            return null;
        } catch (KeyManagementException e2) {
            dy31.s(e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            dy31.s(e3);
            return null;
        } catch (InvalidKeySpecException e4) {
            dy31.s(e4);
            return null;
        }
    }

    public void e() {
        this.x = 8;
        this.y = 8;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        try {
            this.c.C();
            int i5 = i & 2032;
            if (i5 == 16) {
                encryptECB(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 32) {
                encryptCBC(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 64) {
                cryptCNT(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            } else if (i5 == 128) {
                encryptCFB(bArr, i2, bArr2, i3, i4, iArr, cryptParamsInterface);
            }
        } finally {
            this.c.A(this.b);
        }
    }

    public void encryptCBC(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
            while (i3 > 0) {
                int[] iArr2 = {(bArr2[i2] & 255) | ((bArr2[i2 + 1] << 8) & 65280) | ((bArr2[i2 + 2] << 16) & 16711680) | ((bArr2[i2 + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr2[i2 + 4] & 255) | (65280 & (bArr2[i2 + 5] << 8)) | ((bArr2[i2 + 6] << 16) & 16711680) | ((bArr2[i2 + 7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                wu61Var.p(iArr, iArr2, cryptParamsInterface.getCommutator());
                int i4 = iArr2[0];
                bArr[i] = (byte) (i4 & 255);
                bArr[i + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i + 2] = (byte) ((i4 >> 16) & 255);
                bArr[i + 3] = (byte) ((i4 >> 24) & 255);
                int i5 = iArr2[1];
                bArr[i + 4] = (byte) (i5 & 255);
                bArr[i + 5] = (byte) ((i5 >> 8) & 255);
                bArr[i + 6] = (byte) ((i5 >> 16) & 255);
                bArr[i + 7] = (byte) ((i5 >> 24) & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    public void encryptCFB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(2097152);
            int i4 = i;
            int i5 = i2;
            for (int i6 = i3; i6 > 0; i6--) {
                wu61Var.u(iArr, cryptParamsInterface.getCommutator(), false);
                int i7 = iArr[0] ^ ((((bArr2[i5] & 255) | ((bArr2[i5 + 1] << 8) & 65280)) | ((bArr2[i5 + 2] << 16) & 16711680)) | ((bArr2[i5 + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR));
                iArr[0] = i7;
                int i8 = iArr[1] ^ ((((bArr2[i5 + 4] & 255) | (65280 & (bArr2[i5 + 5] << 8))) | ((bArr2[i5 + 6] << 16) & 16711680)) | ((bArr2[i5 + 7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR));
                iArr[1] = i8;
                bArr[i4] = (byte) (i7 & 255);
                bArr[i4 + 1] = (byte) ((i7 >> 8) & 255);
                bArr[i4 + 2] = (byte) ((i7 >> 16) & 255);
                bArr[i4 + 3] = (byte) ((i7 >> 24) & 255);
                bArr[i4 + 4] = (byte) (i8 & 255);
                bArr[i4 + 5] = (byte) ((i8 >> 8) & 255);
                bArr[i4 + 6] = (byte) ((i8 >> 16) & 255);
                bArr[i4 + 7] = (byte) ((i8 >> 24) & 255);
                int i9 = this.x;
                i4 += i9;
                i5 += i9;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    public void encryptECB(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        try {
            wu61Var.C();
            SelfTester_JCP.check(1048576);
            while (i3 > 0) {
                int[] iArr2 = {(bArr2[i2] & 255) | ((bArr2[i2 + 1] << 8) & 65280) | ((bArr2[i2 + 2] << 16) & 16711680) | ((bArr2[i2 + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR), (bArr2[i2 + 4] & 255) | (65280 & (bArr2[i2 + 5] << 8)) | ((bArr2[i2 + 6] << 16) & 16711680) | ((bArr2[i2 + 7] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR)};
                wu61Var.u(iArr2, cryptParamsInterface.getCommutator(), false);
                int i4 = iArr2[0];
                bArr[i] = (byte) (i4 & 255);
                bArr[i + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i + 2] = (byte) ((i4 >> 16) & 255);
                bArr[i + 3] = (byte) ((i4 >> 24) & 255);
                int i5 = iArr2[1];
                bArr[i + 4] = (byte) (i5 & 255);
                bArr[i + 5] = (byte) ((i5 >> 8) & 255);
                bArr[i + 6] = (byte) ((i5 >> 16) & 255);
                bArr[i + 7] = (byte) ((i5 >> 24) & 255);
                int i6 = this.x;
                i += i6;
                i2 += i6;
                i3--;
            }
        } finally {
            wu61Var.A(randomInterface);
        }
    }

    public long f() {
        return 0L;
    }

    public long g() {
        return 0L;
    }

    public int getBlockLen() {
        return this.x;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] getIV() {
        return this.b.makeRandomBytes(this.y);
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return this.a;
    }

    public void getRandomBytes(byte[] bArr, int i, int i2) {
        if (i + i2 <= bArr.length) {
            this.b.makeRandom(bArr, i, i2);
        } else {
            w511.q();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface getWorkKey() {
        return this.B;
    }

    public long h() {
        return 0L;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        try {
            this.c.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[0] = iArr[0] ^ Array.getInt(bArr, i);
                iArr[1] = iArr[1] ^ Array.getInt(bArr, i + 4);
                wu61 wu61Var = this.c;
                int[] commutator = cryptParamsInterface.getCommutator();
                synchronized (wu61Var) {
                    wu61Var.o(iArr, commutator, true);
                }
                i += this.x;
            }
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void methodGOSTR3411PRF(byte[][] bArr, byte[] bArr2, boolean z) throws InvalidKeyException {
        int length = bArr2.length;
        int length2 = bArr.length + 1;
        byte[][] bArr3 = new byte[length2][];
        wu61 wu61Var = this.c;
        wu61Var.C();
        bArr3[0] = wu61Var.q(bArr, bArr.length, z);
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        int i = 0;
        while (length > 32) {
            System.arraycopy(wu61Var.q(bArr3, length2, z), 0, bArr2, i, 32);
            length -= 32;
            i += 32;
            bArr3[0] = wu61Var.q(bArr3, 1, z);
        }
        System.arraycopy(wu61Var.q(bArr3, length2, z), 0, bArr2, i, length);
        wu61Var.A(this.b);
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, boolean z) throws InvalidKeyException, KeyManagementException {
        byte[] bArr2 = new byte[48];
        methodGOSTR3411PRF(new byte[][]{"extended master secret".getBytes(StandardCharsets.UTF_8), bArr}, bArr2, z);
        MasterKeySpec masterKeySpec = new MasterKeySpec(bArr2, this.a);
        masterKeySpec.isNewDigest_2012_256_Used(z);
        Array.clear(bArr2);
        return masterKeySpec;
    }

    public void resetKey() throws InvalidKeyException {
        try {
            this.w.e(this.c, this.b);
        } catch (KeyManagementException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public void setAllowExtra1K(boolean z) {
        if (z) {
            this.w.o.c = true;
            this.c.o.c = true;
        }
    }

    public void setGammaBlockLen(int i) {
        this.c.o.d = i;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void setIVLen(int i) {
        this.y = i;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        if (!(paramsInterface instanceof CryptParamsInterface)) {
            throw new InvalidParameterException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        this.a = (CryptParamsInterface) paramsInterface;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException, KeyManagementException {
        SecretKeyInterface secretKeyInterface;
        int[] iArr2 = new int[2];
        int[] iArr3 = null;
        try {
            Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
            try {
                gost28147_89_EncryptedKey.decode(new Asn1BerDecodeBuffer(bArr));
                byte[] bArr2 = gost28147_89_EncryptedKey.macKey.value;
                byte[] bArr3 = gost28147_89_EncryptedKey.encryptedKey.value;
                try {
                    secretKeyInterface = (SecretKeyInterface) clone();
                    try {
                        secretKeyInterface.setParams(cryptParamsInterface);
                        if (z) {
                            if (z2) {
                                secretKeyInterface.diversKey2012(Array.toByteArray(iArr));
                            } else {
                                secretKeyInterface.diversKey(Array.toByteArray(iArr));
                            }
                        }
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        int[] intArray = Array.toIntArray(bArr3);
                        for (int i = 0; i < 4; i++) {
                            int i2 = i * 2;
                            try {
                                iArr2[0] = intArray[i2];
                                int i3 = i2 + 1;
                                iArr2[1] = intArray[i3];
                                secretKeyInterface.decrypt(16, iArr2, null, (CryptParamsInterface) secretKeyInterface.getParams());
                                intArray[i2] = iArr2[0];
                                intArray[i3] = iArr2[1];
                            } catch (Throwable th) {
                                th = th;
                                iArr3 = intArray;
                                if (iArr3 != null) {
                                    Arrays.fill(iArr3, 0);
                                }
                                Array.clear(iArr2);
                                if (secretKeyInterface != null) {
                                    secretKeyInterface.clear();
                                }
                                throw th;
                            }
                        }
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        for (int i4 = 0; i4 < 4; i4++) {
                            int i5 = i4 * 2;
                            iArr2[0] = iArr2[0] ^ intArray[i5];
                            iArr2[1] = iArr2[1] ^ intArray[i5 + 1];
                            secretKeyInterface.imita(iArr2, (CryptParamsInterface) secretKeyInterface.getParams());
                        }
                        if (iArr2[0] != Array.getInt(bArr2, 0)) {
                            throw new InvalidKeyException("Wrapped key is invalid");
                        }
                        SecretKeySpec secretKeySpec = new SecretKeySpec(new wu61(intArray, new CPRandom(), 1), (CryptParamsInterface) secretKeyInterface.getParams(), this.b);
                        Arrays.fill(intArray, 0);
                        Array.clear(iArr2);
                        secretKeyInterface.clear();
                        return secretKeySpec;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (CloneNotSupportedException e) {
                    InvalidKeyException invalidKeyException = new InvalidKeyException(UNWRAP_ERR);
                    invalidKeyException.initCause(e);
                    throw invalidKeyException;
                }
            } catch (Asn1Exception e2) {
                InvalidKeyException invalidKeyException2 = new InvalidKeyException(UNWRAP_ERR);
                invalidKeyException2.initCause(e2);
                throw invalidKeyException2;
            } catch (IOException e3) {
                InvalidKeyException invalidKeyException3 = new InvalidKeyException(UNWRAP_ERR);
                invalidKeyException3.initCause(e3);
                throw invalidKeyException3;
            }
        } catch (Throwable th3) {
            th = th3;
            secretKeyInterface = null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        SecretKeySpec secretKeySpec;
        long j2;
        boolean b = b(j, f());
        boolean b2 = b(j, g());
        boolean b3 = b(j, h());
        if (b || this.z == null) {
            SecretKeySpec secretKeySpec2 = this.z;
            if (secretKeySpec2 != null) {
                secretKeySpec2.clear();
            }
            secretKeySpec = this;
            j2 = j;
            secretKeySpec.z = secretKeySpec.a(j, f(), "level1");
        } else {
            secretKeySpec = this;
            j2 = j;
        }
        if (b2 || secretKeySpec.A == null) {
            SecretKeySpec secretKeySpec3 = secretKeySpec.A;
            if (secretKeySpec3 != null) {
                secretKeySpec3.clear();
            }
            secretKeySpec.A = secretKeySpec.z.a(j2, secretKeySpec.g(), "level2");
        }
        if (!b3 && secretKeySpec.B != null) {
            return true;
        }
        SecretKeySpec secretKeySpec4 = secretKeySpec.B;
        if (secretKeySpec4 != null) {
            secretKeySpec4.clear();
        }
        secretKeySpec.B = secretKeySpec.A.a(j2, secretKeySpec.h(), "level3");
        return true;
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z, boolean z2) throws InvalidKeyException {
        SecretKeyInterface secretKeyInterface2;
        RandomInterface randomInterface = this.b;
        wu61 wu61Var = this.c;
        int[] iArr2 = new int[2];
        int[] iArr3 = null;
        try {
            wu61Var.C();
            int[] D = wu61Var.D(randomInterface);
            try {
                try {
                    secretKeyInterface2 = (SecretKeyInterface) secretKeyInterface.clone();
                    try {
                        secretKeyInterface2.setParams(cryptParamsInterface);
                        if (z) {
                            if (z2) {
                                secretKeyInterface2.diversKey2012(Array.toByteArray(iArr));
                            } else {
                                secretKeyInterface2.diversKey(Array.toByteArray(iArr));
                            }
                        }
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        for (int i = 0; i < 4; i++) {
                            int i2 = i * 2;
                            iArr2[0] = iArr2[0] ^ D[i2];
                            iArr2[1] = iArr2[1] ^ D[i2 + 1];
                            secretKeyInterface2.imita(iArr2, (CryptParamsInterface) secretKeyInterface2.getParams());
                        }
                        int i3 = iArr2[0];
                        byte[] bArr = new byte[32];
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        int i4 = 0;
                        for (int i5 = 0; i5 < 4; i5++) {
                            int i6 = i5 * 2;
                            iArr2[0] = D[i6];
                            iArr2[1] = D[i6 + 1];
                            secretKeyInterface2.encrypt(16, iArr2, null, (CryptParamsInterface) secretKeyInterface2.getParams());
                            System.arraycopy(Array.toByteArray(iArr2), 0, bArr, i4, 8);
                            i4 += 8;
                        }
                        Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
                        gost28147_89_EncryptedKey.encryptedKey = new Gost28147_89_Key(bArr);
                        gost28147_89_EncryptedKey.macKey = new Gost28147_89_MAC(Array.toByteArray(i3));
                        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                        try {
                            gost28147_89_EncryptedKey.encode(asn1BerEncodeBuffer);
                            byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
                            wu61Var.A(randomInterface);
                            Arrays.fill(D, 0);
                            Array.clear(iArr2);
                            secretKeyInterface2.clear();
                            return msgCopy;
                        } catch (Asn1Exception e) {
                            InvalidKeyException invalidKeyException = new InvalidKeyException("WrapError");
                            invalidKeyException.initCause(e);
                            throw invalidKeyException;
                        }
                    } catch (Throwable th) {
                        th = th;
                        iArr3 = D;
                        wu61Var.A(randomInterface);
                        if (iArr3 != null) {
                            Arrays.fill(iArr3, 0);
                        }
                        Array.clear(iArr2);
                        if (secretKeyInterface2 != null) {
                            secretKeyInterface2.clear();
                        }
                        throw th;
                    }
                } catch (CloneNotSupportedException e2) {
                    InvalidKeyException invalidKeyException2 = new InvalidKeyException("WrapError");
                    invalidKeyException2.initCause(e2);
                    throw invalidKeyException2;
                }
            } catch (Throwable th2) {
                th = th2;
                secretKeyInterface2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            secretKeyInterface2 = null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public MasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, boolean z) throws InvalidKeyException, KeyManagementException {
        byte[][] bArr3 = {"master secret".getBytes(StandardCharsets.UTF_8), bArr, bArr2};
        byte[] bArr4 = new byte[48];
        methodGOSTR3411PRF(bArr3, bArr4, z);
        MasterKeySpec masterKeySpec = new MasterKeySpec(bArr4, this.a);
        masterKeySpec.isNewDigest_2012_256_Used(z);
        Array.clear(bArr4);
        return masterKeySpec;
    }

    public void digest(MessageDigest messageDigest, byte[] bArr) throws InvalidKeyException {
        try {
            this.c.C();
            if (messageDigest instanceof GostDigest) {
                SelfTester_JCP.check(1);
            } else if (messageDigest instanceof GostDigest2012_256) {
                SelfTester_JCP.check(262144);
            } else if (messageDigest instanceof GostDigest2012_512) {
                SelfTester_JCP.check(524288);
            }
            this.c.i(messageDigest, bArr);
            this.c.A(this.b);
        } catch (Throwable th) {
            this.c.A(this.b);
            throw th;
        }
    }

    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface, boolean z) throws InvalidKeyException {
        try {
            this.c.C();
            SelfTester_JCP.check(SelfTester_JCP.IMITA);
            this.c.o(iArr, cryptParamsInterface.getCommutator(), z);
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void imita(int[] iArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        imita(iArr, cryptParamsInterface, true);
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void decrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        try {
            this.c.C();
            int i2 = i & 2032;
            if (i2 == 16) {
                SelfTester_JCP.check(1048576);
                this.c.t(iArr, cryptParamsInterface.getCommutator());
            } else if (i2 == 32) {
                SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
                this.c.v(iArr2, iArr, cryptParamsInterface.getCommutator());
            }
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public void encrypt(int i, int[] iArr, int[] iArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        try {
            this.c.C();
            int i2 = i & 2032;
            if (i2 == 16) {
                SelfTester_JCP.check(1048576);
                this.c.u(iArr, cryptParamsInterface.getCommutator(), (i & Integer.MIN_VALUE) != 0);
            } else if (i2 == 32) {
                SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CBC);
                this.c.p(iArr2, iArr, cryptParamsInterface.getCommutator());
            } else if (i2 == 64) {
                SelfTester_JCP.check(SelfTester_JCP.ENCRYPT_CNT);
                this.c.y(iArr, iArr2, cryptParamsInterface.getCommutator());
            }
        } finally {
            this.c.A(this.b);
        }
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(int i, DiversKeyBase diversKeyBase) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public byte[] wrap(SecretKeyInterface secretKeyInterface, byte[] bArr, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException {
        throw new UnsupportedOperationException();
    }

    @Override // ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface unwrap(byte[] bArr, String str, byte[] bArr2, CryptParamsInterface cryptParamsInterface) throws InvalidKeyException, KeyManagementException {
        throw new UnsupportedOperationException();
    }

    public SecretKeySpec(SecretKeySpec secretKeySpec) {
        this.a = null;
        this.b = null;
        this.z = null;
        this.A = null;
        this.B = null;
        wu61 a = secretKeySpec.c.a(secretKeySpec.b);
        this.c = a;
        this.x = secretKeySpec.x;
        this.w = a.a(secretKeySpec.b);
        if (secretKeySpec.a != null) {
            this.a = (CryptParamsInterface) secretKeySpec.getParams();
        }
        RandomInterface randomInterface = secretKeySpec.b;
        if (randomInterface != null) {
            this.b = randomInterface;
        }
        try {
            SecretKeySpec secretKeySpec2 = secretKeySpec.B;
            if (secretKeySpec2 != null) {
                this.B = (SecretKeySpec) secretKeySpec2.clone();
            }
            SecretKeySpec secretKeySpec3 = secretKeySpec.z;
            if (secretKeySpec3 != null) {
                this.z = (SecretKeySpec) secretKeySpec3.clone();
            }
            SecretKeySpec secretKeySpec4 = secretKeySpec.A;
            if (secretKeySpec4 != null) {
                this.A = (SecretKeySpec) secretKeySpec4.clone();
            }
        } catch (CloneNotSupportedException e) {
            dy31.s(e);
            throw null;
        }
    }

    public SecretKeySpec(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) throws KeyManagementException {
        this(cryptParamsInterface, randomInterface, 1);
    }

    public SecretKeySpec(CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface, int i) {
        this.a = null;
        this.b = null;
        this.z = null;
        this.A = null;
        this.B = null;
        e();
        this.a = cryptParamsInterface;
        this.b = randomInterface;
        wu61 wu61Var = new wu61(this.a, this.b, i, 8);
        this.w = wu61Var;
        try {
            this.c = wu61Var.a(this.b);
        } catch (InvalidKeyException e) {
            throw new KeyManagementException(e.getMessage());
        }
    }

    public SecretKeySpec(byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        this(bArr, i, i2, cryptParamsInterface, 1);
    }

    public SecretKeySpec(byte[] bArr, int i, int i2, CryptParamsInterface cryptParamsInterface, int i3) {
        this.a = null;
        this.b = null;
        this.z = null;
        this.A = null;
        this.B = null;
        e();
        byte[] bArr2 = new byte[i2];
        try {
            try {
                if (i2 < 32) {
                    throw new KeyManagementException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 32);
                }
                this.b = new CPRandom();
                this.a = cryptParamsInterface;
                System.arraycopy(bArr, i, bArr2, 0, i2);
                int[] intArray = Array.toIntArray(bArr2);
                wu61 wu61Var = new wu61(intArray, this.b, i3);
                this.w = wu61Var;
                this.c = wu61Var.a(this.b);
                Array.clear(bArr2);
                Array.clear(intArray);
            } catch (InvalidKeyException e) {
                throw new KeyManagementException(e.getMessage());
            }
        } catch (Throwable th) {
            Array.clear(bArr2);
            if (0 != 0) {
                Array.clear((int[]) null);
            }
            throw th;
        }
    }

    public SecretKeySpec(byte[] bArr, CryptParamsInterface cryptParamsInterface) throws KeyManagementException {
        this(bArr, 0, bArr.length, cryptParamsInterface, 1);
    }

    public SecretKeySpec(char[] cArr, byte[] bArr, ParamsInterface paramsInterface, AlgIdInterface algIdInterface) throws KeyManagementException {
        this(cArr, bArr, paramsInterface, algIdInterface, 1);
    }

    public SecretKeySpec(wu61 wu61Var, CryptParamsInterface cryptParamsInterface, RandomInterface randomInterface) throws KeyManagementException {
        this.a = null;
        this.b = null;
        this.z = null;
        this.A = null;
        this.B = null;
        e();
        this.a = cryptParamsInterface;
        this.b = randomInterface;
        this.w = wu61Var;
        try {
            this.c = wu61Var.a(randomInterface);
        } catch (InvalidKeyException e) {
            throw new KeyManagementException(e.getMessage());
        }
    }
}
