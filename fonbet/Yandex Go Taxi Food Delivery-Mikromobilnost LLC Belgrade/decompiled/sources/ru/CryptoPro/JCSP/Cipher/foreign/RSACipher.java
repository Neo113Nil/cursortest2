package ru.CryptoPro.JCSP.Cipher.foreign;

import defpackage.dy31;
import defpackage.ny61;
import defpackage.yci0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.spec.SpecialCipherSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.SimpleBlobForeignStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAExchPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPrivateKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPublicKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class RSACipher extends GostCipher {
    public static final int OAEP_SHA1_MGF1_PADDING = 1;
    public static final int RSA_PKCS_PADDING = 80;
    public static final int RSA_RMASK_PADDING = 82;
    public static final int RSA_X_509_PADDING = 81;
    public static final String STR_NO_PADDING = "NOPADDING";
    public static final String STR_OAEPWithSHA1AndMGF1PADDING = "OAEPWithSHA-1AndMGF1Padding";
    public static final String STR_PKCS1PADDING = "PKCS1PADDING";
    public static final String STR_PKCS1_PADDING = "PKCS1Padding";
    public static final String STR_PKCSPADDING = "PKCSPadding";
    public static final String STR_RMASKPADDING = "RMASKPadding";
    public static final String STR_RSA_PKCS_PADDING = "RSA_PKCS_PADDING";
    public static final String STR_RSA_RMASK_PADDING = "RSA_RMASK_PADDING";
    public static final String STR_RSA_X_509_PADDING = "RSA_X_509_PADDING";
    public static final String STR_X509PADDING = "X509Padding";
    private static final boolean s = GetProperty.getBooleanProperty("enable_rsa_inverted_byte_order", false);
    private boolean t = false;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
    
        if (r3 == 4) goto L6;
     */
    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i) {
        JCSPLogger.subEnter();
        if (this.e) {
            ny61.g(GostCipher.resource.getString("NoMode"));
            return;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3 || i == 8) {
                    this.c = 8;
                } else {
                    i2 = 4;
                }
                JCSPLogger.subExit();
            }
        }
        this.c = i2;
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    public void d() {
        JCSPLogger.subEnter();
        this.c = 0;
        a(false);
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    public void e() throws InvalidKeyException {
        JCSPLogger.subEnter();
        this.o = true;
        b();
        this.g = 0;
        this.j[0] = 0;
        Arrays.fill(this.f, (byte) 0);
        this.e = true;
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int i3;
        JCSPLogger.subEnter();
        if (bArr != null) {
            try {
                if (bArr.length < i2 + i) {
                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                    JCSPLogger.thrown(arrayIndexOutOfBoundsException);
                    throw arrayIndexOutOfBoundsException;
                }
            } catch (Error e) {
                c();
                throw e;
            } catch (RuntimeException e2) {
                c();
                throw e2;
            } catch (InvalidAlgorithmParameterException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"), e3);
                c();
                throw illegalArgumentException;
            } catch (InvalidKeyException e4) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"), e4);
                c();
                throw illegalArgumentException2;
            } catch (ShortBufferException e5) {
                c();
                throw new IllegalBlockSizeException(e5.getMessage());
            }
        }
        prepare();
        if (!this.e || ((i3 = this.c) != 1 && i3 != 2)) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"));
            JCSPLogger.warning(illegalArgumentException3);
            throw illegalArgumentException3;
        }
        int i4 = this.g;
        if (i2 + i4 > this.q) {
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException(GostCipher.resource.getString(GostCipher.RSA_INV_TEXT_LEN));
            JCSPLogger.warning(illegalArgumentException4);
            throw illegalArgumentException4;
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f, i4, i2);
            this.g += i2;
        }
        int i5 = this.c;
        int[] iArr = this.j;
        int i6 = 64;
        if (i5 == 1) {
            iArr[0] = this.g;
            JCSPSecretKeyInterface jCSPSecretKeyInterface = this.d;
            byte[] bArr2 = this.f;
            if (this.b != 1) {
                i6 = 0;
            }
            jCSPSecretKeyInterface.encrypt(bArr2, iArr, true, i6);
        } else {
            int i7 = this.q;
            iArr[0] = i7;
            if ((s || this.t) && this.b == 80 && i7 > 0) {
                Array.invByteOrderB(this.f, 0, i7 - 1);
            }
            JCSPSecretKeyInterface jCSPSecretKeyInterface2 = this.d;
            byte[] bArr3 = this.f;
            int[] iArr2 = this.j;
            if (this.b != 1) {
                i6 = 0;
            }
            jCSPSecretKeyInterface2.decrypt(bArr3, iArr2, true, i6);
        }
        int i8 = this.j[0];
        byte[] bArr4 = new byte[i8];
        System.arraycopy(this.f, 0, bArr4, 0, i8);
        if ((s || this.t) && this.c == 1 && this.b == 80) {
            Array.invByteOrder(bArr4);
        }
        e();
        JCSPLogger.subExit();
        return bArr4;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        JCSPLogger.subEnter();
        if (this.e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NoMode"));
            JCSPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        }
        try {
            prepare();
            JCSPLogger.subExit();
            return this.q;
        } catch (Error e) {
            this.c();
            throw e;
        } catch (RuntimeException e2) {
            this.c();
            throw e2;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
            this.c();
            yci0.r(e3);
            return 0;
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        throw new IllegalArgumentException(GostCipher.resource.getString("ModeNotSupp"));
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        try {
            JCSPLogger.subEnter();
            prepare();
            if (!this.e || this.c == 0) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            if (i + this.g <= this.q) {
                JCSPLogger.subExit();
                return this.q;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(GostCipher.resource.getString(GostCipher.RSA_INV_TEXT_LEN));
            JCSPLogger.warning(illegalArgumentException2);
            throw illegalArgumentException2;
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
            c();
            yci0.r(e3);
            return 0;
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof SpecialCipherSpec) {
            this.t = ((SpecialCipherSpec) algorithmParameterSpec).isInvertedByteOrder();
        } else {
            super.engineInit(i, key, algorithmParameterSpec, secureRandom);
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        try {
            JCSPLogger.subEnter();
            if (this.e) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NoMode"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            if (!str.equalsIgnoreCase(STR_RSA_PKCS_PADDING) && !str.equalsIgnoreCase(STR_PKCSPADDING) && !str.equalsIgnoreCase(STR_PKCS1PADDING) && !str.equalsIgnoreCase(STR_PKCS1_PADDING)) {
                if (!str.equalsIgnoreCase(STR_RSA_X_509_PADDING) && !str.equalsIgnoreCase(STR_X509PADDING) && !str.equalsIgnoreCase(STR_NO_PADDING) && !str.equalsIgnoreCase("NoPadding")) {
                    if (!str.equalsIgnoreCase(STR_RSA_RMASK_PADDING) && !str.equalsIgnoreCase(STR_RMASKPADDING)) {
                        String lowerCase = str.toLowerCase(Locale.ENGLISH);
                        if (!lowerCase.startsWith("oaepwith") || !lowerCase.endsWith("andmgf1padding")) {
                            NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException(GostCipher.resource.getString("PaddingNotSupp"));
                            JCSPLogger.warning(noSuchPaddingException);
                            throw noSuchPaddingException;
                        }
                        if (str.equalsIgnoreCase(STR_OAEPWithSHA1AndMGF1PADDING)) {
                            this.b = 1;
                            JCSPLogger.subExit();
                        } else {
                            NoSuchPaddingException noSuchPaddingException2 = new NoSuchPaddingException(GostCipher.resource.getString("PaddingNotSupp"));
                            JCSPLogger.warning(noSuchPaddingException2);
                            throw noSuchPaddingException2;
                        }
                    }
                    this.b = 82;
                    JCSPLogger.subExit();
                }
                this.b = 81;
                JCSPLogger.subExit();
            }
            this.b = 80;
            JCSPLogger.subExit();
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (NoSuchPaddingException e3) {
            c();
            throw e3;
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            JCSPLogger.subEnter();
            prepare();
            if (str != null) {
                if (str.equalsIgnoreCase("TLS")) {
                    if (!s) {
                        if (this.t) {
                        }
                    }
                    bArr = (byte[]) bArr.clone();
                    Array.invByteOrder(bArr);
                }
            }
            if (!this.e || this.c != 4) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NotInitUnwrap"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            if (!(this.k instanceof RSAExchPrivateKey)) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"));
                JCSPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
            try {
                new SimpleBlobForeignStructure().read(new ByteArrayInputStream(bArr));
            } catch (StructException unused) {
                SimpleBlobForeignStructure simpleBlobForeignStructure = new SimpleBlobForeignStructure(HProv.CALG_GENERIC_SECRET, this.d.getAlgorithmIdentifier(), bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    simpleBlobForeignStructure.write(byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (StructException e) {
                    InvalidKeyException invalidKeyException2 = new InvalidKeyException("InvPar");
                    invalidKeyException2.initCause(e);
                    throw invalidKeyException2;
                }
            }
            try {
                JCSPSecretKeyInterface unwrap = this.d.unwrap(bArr, 0, true);
                if (i != 3) {
                    NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(GostCipher.resource.getString("InvalidKeyType"));
                    JCSPLogger.warning(noSuchAlgorithmException);
                    throw noSuchAlgorithmException;
                }
                d();
                ForeignSymmetricKey foreignSymmetricKey = new ForeignSymmetricKey(unwrap);
                if (str == null || !str.equalsIgnoreCase("TLS")) {
                    JCSPLogger.subExit();
                    return foreignSymmetricKey;
                }
                JCSPLogger.subExit();
                return new SecretKeySpec(foreignSymmetricKey.getEncoded(), str);
            } catch (KeyManagementException e2) {
                InvalidKeyException invalidKeyException3 = new InvalidKeyException(GostCipher.resource.getString("UnwrapErr"));
                invalidKeyException3.initCause(e2);
                JCSPLogger.warning(invalidKeyException3);
                throw invalidKeyException3;
            }
        } catch (Error e3) {
            c();
            throw e3;
        } catch (RuntimeException e4) {
            c();
            throw e4;
        } catch (InvalidAlgorithmParameterException e5) {
            c();
            dy31.s(e5);
            return null;
        } catch (InvalidKeyException e6) {
            c();
            throw e6;
        } catch (NoSuchAlgorithmException e7) {
            c();
            throw e7;
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int i3;
        JCSPLogger.subEnter();
        try {
            prepare();
            if (!this.e || ((i3 = this.c) != 2 && i3 != 1)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            try {
                int i4 = this.g;
                if (i2 + i4 <= this.q) {
                    System.arraycopy(bArr, i, this.f, i4, i2);
                    this.g += i2;
                    return null;
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(GostCipher.resource.getString(GostCipher.RSA_INV_TEXT_LEN));
                JCSPLogger.warning(illegalArgumentException2);
                throw illegalArgumentException2;
            } catch (Error e) {
                c();
                throw e;
            } catch (RuntimeException e2) {
                c();
                throw e2;
            }
        } catch (InvalidAlgorithmParameterException e3) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"), e3);
            JCSPLogger.warning(illegalArgumentException3);
            c();
            throw illegalArgumentException3;
        } catch (InvalidKeyException e4) {
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException(GostCipher.resource.getString("NotInitCrypt"), e4);
            JCSPLogger.warning(illegalArgumentException4);
            c();
            throw illegalArgumentException4;
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            try {
                JCSPLogger.subEnter();
                prepare();
                if (!this.e || this.c != 8) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(GostCipher.resource.getString("NotInitWrap"));
                    JCSPLogger.warning(illegalArgumentException);
                    throw illegalArgumentException;
                }
                if (this.m != 3) {
                    throw new UnsupportedOperationException();
                }
                if (!(this.k instanceof PublicKey)) {
                    InvalidKeyException invalidKeyException = new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"));
                    JCSPLogger.warning(invalidKeyException);
                    throw invalidKeyException;
                }
                if (!(key instanceof ForeignSymmetricKey) && !(key instanceof SecretKeySpec)) {
                    InvalidKeyException invalidKeyException2 = new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"));
                    JCSPLogger.warning(invalidKeyException2);
                    throw invalidKeyException2;
                }
                KeyInterface extractSpec = key instanceof SecretKeySpec ? ForeignSymmetricKey.extractSpec(key) : ((SpecKey) key).getSpec();
                if (!(extractSpec instanceof JCSPSecretKeyInterface)) {
                    InvalidKeyException invalidKeyException3 = new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"));
                    JCSPLogger.warning(invalidKeyException3);
                    throw invalidKeyException3;
                }
                byte[] wrap = this.d.wrap((JCSPSecretKeyInterface) extractSpec);
                d();
                if (key instanceof SecretKeySpec) {
                    SimpleBlobForeignStructure simpleBlobForeignStructure = new SimpleBlobForeignStructure();
                    simpleBlobForeignStructure.read(new ByteArrayInputStream(wrap));
                    wrap = simpleBlobForeignStructure.encryptedKey.value;
                    if (s || this.t) {
                        Array.invByteOrder(wrap);
                    }
                }
                JCSPLogger.subExit();
                return wrap;
            } catch (InvalidAlgorithmParameterException | StructException e) {
                c();
                dy31.s(e);
                return null;
            }
        } catch (Error e2) {
            c();
            throw e2;
        } catch (RuntimeException e3) {
            c();
            throw e3;
        } catch (InvalidKeyException e4) {
            c();
            throw e4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        r6.d.setPadding(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0092 A[Catch: CloneNotSupportedException | InvalidKeySpecException -> 0x0030, InvalidKeyException -> 0x0033, RuntimeException -> 0x0036, Error -> 0x0039, TryCatch #3 {CloneNotSupportedException | InvalidKeySpecException -> 0x0030, blocks: (B:5:0x0009, B:7:0x0018, B:9:0x0086, B:11:0x0092, B:12:0x0097, B:20:0x00a7, B:21:0x00ae, B:24:0x00b1, B:26:0x00b6, B:28:0x00bc, B:31:0x003c, B:33:0x0040, B:35:0x0044, B:39:0x0057, B:40:0x005b, B:41:0x0063, B:42:0x005e, B:44:0x006e, B:45:0x00c2, B:45:0x00c2, B:46:0x00cd, B:46:0x00cd), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: CloneNotSupportedException | InvalidKeySpecException -> 0x0030, InvalidKeyException -> 0x0033, RuntimeException -> 0x0036, Error -> 0x0039, TRY_LEAVE, TryCatch #3 {CloneNotSupportedException | InvalidKeySpecException -> 0x0030, blocks: (B:5:0x0009, B:7:0x0018, B:9:0x0086, B:11:0x0092, B:12:0x0097, B:20:0x00a7, B:21:0x00ae, B:24:0x00b1, B:26:0x00b6, B:28:0x00bc, B:31:0x003c, B:33:0x0040, B:35:0x0044, B:39:0x0057, B:40:0x005b, B:41:0x0063, B:42:0x005e, B:44:0x006e, B:45:0x00c2, B:45:0x00c2, B:46:0x00cd, B:46:0x00cd), top: B:4:0x0009 }] */
    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepare() throws InvalidKeyException, InvalidAlgorithmParameterException {
        int keyLength;
        boolean z;
        int i;
        boolean z2;
        if (this.d == null) {
            JCSPLogger.subEnter();
            try {
                try {
                    a(this.o);
                    Key key = this.k;
                    if (key instanceof RSAPrivateKey) {
                        JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) ((JCSPSecretKeyInterface) ((RSAPrivateKey) key).getSpec()).clone();
                        this.d = jCSPSecretKeyInterface;
                        keyLength = ((AbstractKeySpec) jCSPSecretKeyInterface).getKeyLength();
                    } else {
                        if (!(key instanceof PublicKey)) {
                            throw new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"));
                        }
                        if (key instanceof RSAPublicKey) {
                            JCSPSecretKeyInterface jCSPSecretKeyInterface2 = (JCSPSecretKeyInterface) ((RSAPublicKey) key).getSpec();
                            z = jCSPSecretKeyInterface2.getPadding() == 82;
                            this.d = (JCSPSecretKeyInterface) (z ? jCSPSecretKeyInterface2.clone2() : jCSPSecretKeyInterface2.clone());
                            keyLength = ((PublicKeySpec) this.d).getKeyLength();
                            int i2 = keyLength >> 3;
                            this.q = i2;
                            this.f = new byte[i2];
                            if (!this.o) {
                                a(this.m);
                            }
                            i = this.b;
                            if (i != 0 && i != 1) {
                                z2 = i != 82;
                                if (z2 && !z) {
                                    throw new InvalidKeyException("Padding is set to R_MASK but the public key has not R_MASK padding.");
                                }
                            }
                            this.e = true;
                            if (this.o) {
                                this.o = false;
                            }
                            JCSPLogger.subExit();
                        }
                        JCSPSecretKeyInterface jCSPSecretKeyInterface3 = (JCSPSecretKeyInterface) new RSAPublicKey(key.getEncoded(), true).getSpec();
                        this.d = jCSPSecretKeyInterface3;
                        keyLength = ((PublicKeySpec) jCSPSecretKeyInterface3).getKeyLength();
                    }
                    z = false;
                    int i22 = keyLength >> 3;
                    this.q = i22;
                    this.f = new byte[i22];
                    if (!this.o) {
                    }
                    i = this.b;
                    if (i != 0) {
                        if (i != 82) {
                        }
                        if (z2) {
                            throw new InvalidKeyException("Padding is set to R_MASK but the public key has not R_MASK padding.");
                        }
                    }
                    this.e = true;
                    if (this.o) {
                    }
                    JCSPLogger.subExit();
                } catch (CloneNotSupportedException | InvalidKeySpecException e) {
                    c();
                    dy31.s(e);
                }
            } catch (Error e2) {
                c();
                throw e2;
            } catch (RuntimeException e3) {
                c();
                throw e3;
            } catch (InvalidKeyException e4) {
                c();
                throw new InvalidKeyException(GostCipher.resource.getString("InvalidKeyType"), e4);
            }
        }
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        super.engineInit(i, key, secureRandom);
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    public void a(boolean z) {
        JCSPLogger.subEnter();
        this.g = 0;
        this.j[0] = 0;
        Arrays.fill(this.f, (byte) 0);
        if (!z) {
            this.e = false;
            b();
        }
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher
    public boolean a() {
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        engineUpdate(bArr, i, i2);
        return 0;
    }

    @Override // ru.CryptoPro.JCSP.Cipher.GostCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        JCSPLogger.subEnter();
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        try {
            if (bArr2.length - i3 < engineDoFinal.length) {
                ShortBufferException shortBufferException = new ShortBufferException();
                JCSPLogger.thrown(shortBufferException);
                throw shortBufferException;
            }
            System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
            int length = engineDoFinal.length;
            JCSPLogger.subExit();
            return length;
        } catch (ArrayIndexOutOfBoundsException unused) {
            c();
            throw new ShortBufferException();
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (ShortBufferException e3) {
            c();
            throw e3;
        }
    }
}
