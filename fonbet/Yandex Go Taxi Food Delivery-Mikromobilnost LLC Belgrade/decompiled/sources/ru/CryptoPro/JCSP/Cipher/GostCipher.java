package ru.CryptoPro.JCSP.Cipher;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.dy31;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_KeyExport.GostKeyTransportKExp15;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.G3412ParamsSpec;
import ru.CryptoPro.JCP.params.GostCipherSpecImpl;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.spec.WrappedAsSimpleBlobSecretKey;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.GostKExp15BlobStructure;
import ru.CryptoPro.JCSP.CStructReader.SimpleBlobStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.GostAgreeKey;
import ru.CryptoPro.JCSP.Key.GostPrivateKey;
import ru.CryptoPro.JCSP.Key.GostSecretKey;
import ru.CryptoPro.JCSP.Key.JCSPAgreeSecretKeySpec;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpec;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecK;
import ru.CryptoPro.JCSP.Key.JCSPSecretKeySpecM;
import ru.CryptoPro.JCSP.Key.JCSPSpecKey;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.Key.foreign.ForeignSymmetricKey;
import ru.CryptoPro.JCSP.Key.foreign.JCSPForeignSecretKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.Starter;

/* loaded from: classes4.dex */
public abstract class GostCipher extends CipherSpi {
    public static final int ANSI_X923_PADDING = 5;
    public static final String CRYPT_ERR = "CryptErr";
    public static final String INV_KEY = "InvalidKeyType";
    public static final String INV_PAR = "InvPar";
    public static final String INV_TEXT_LEN = "InvTextLen";
    public static final int ISO10126_PADDING = 4;
    public static final int MODE_CBC = 32;
    public static final int MODE_CFB = 128;
    public static final int MODE_CNT = 64;
    public static final int MODE_CRYPT_MASK = 2032;
    public static final int MODE_CTR = 2048;
    public static final int MODE_CTR_ACPKM = 4096;
    public static final int MODE_DECRYPT = 2;
    public static final int MODE_ECB = 16;
    public static final int MODE_ENCRYPT = 1;
    public static final int MODE_GCM = 2097152;
    public static final int MODE_KEXP_2015_K_EXPORT = 262144;
    public static final int MODE_KEXP_2015_M_EXPORT = 131072;
    public static final int MODE_MGM_K_EXPORT = 1048576;
    public static final int MODE_MGM_M_EXPORT = 524288;
    public static final int MODE_NO = 0;
    public static final String MODE_NOT_SUPPORT = "ModeNotSupp";
    public static final int MODE_OMAC_CTR = 8192;
    public static final int MODE_PRO12_EXPORT = 65536;
    public static final int MODE_PRO_EXPORT = 16384;
    public static final int MODE_RANDOM_PADDING = 2;
    public static final int MODE_SIMPLE_EXPORT = 32768;
    public static final int MODE_UNWRAP = 4;
    public static final int MODE_WRAP = 8;
    public static final String NOT_INIT_CRYPT = "NotInitCrypt";
    public static final String NOT_INIT_UNWRAP = "NotInitUnwrap";
    public static final String NOT_INIT_WRAP = "NotInitWrap";
    public static final int NOT_SET = 0;
    public static final String NO_IV_DECRYPT = "NoIVDecrypt";
    public static final String NO_IV_UNWRAP = "NoIVUnwrap";
    public static final String NO_MODE = "NoMode";
    public static final String PADDING_NOT_SUPPORT = "PaddingNotSupp";
    public static final String PADDING_SET = "PaddingSet";
    public static final int PKCS5_PADDING = 1;
    public static final String RSA_INV_TEXT_LEN = "InvRSATextLen";
    public static final String STR_ANSI_X923_PADDING = "ANSIX923PADDING";
    public static final String STR_CBC_MODE = "CBC";
    public static final String STR_CFB_MODE = "CFB";
    public static final String STR_CNT_MODE = "CNT";
    public static final String STR_CTR_ACPKM_MODE = "CTR_ACPKM";
    public static final String STR_CTR_MODE = "CTR";
    public static final String STR_ECB_MODE = "ECB";
    public static final String STR_GCM_MODE = "GCM";
    public static final String STR_ISO10126_PADDING = "ISO10126PADDING";
    public static final String STR_KEXP_2015_K_EXPORT = "KEXP_2015_K_EXPORT";
    public static final String STR_KEXP_2015_M_EXPORT = "KEXP_2015_M_EXPORT";
    public static final String STR_MGM_EXPORT = "MGM_EXPORT";
    public static final String STR_MGM_K_EXPORT = "MGM_K_EXPORT";
    public static final String STR_MGM_M_EXPORT = "MGM_M_EXPORT";
    public static final String STR_NOPADDING = "NoPadding";
    public static final String STR_NO_PADDING = "No_Padding";
    public static final String STR_OFB_MODE = "OFB";
    public static final String STR_OMAC_CTR_MODE = "OMAC_CTR";
    public static final String STR_PKCS5PADDING = "PKCS5Padding";
    public static final String STR_PKCS5_PADDING = "PKCS5_PADDING";
    public static final String STR_PRO12_EXPORT = "PRO12_EXPORT";
    public static final String STR_PRO_EXPORT = "PRO_EXPORT";
    public static final String STR_RANDOM_PADDING = "RANDOM_PADDING";
    public static final String STR_SIMPLE_EXPORT = "SIMPLE_EXPORT";
    public static final String STR_ZEROPADDING = "ZeroPadding";
    public static final String STR_ZERO_PADDING = "ZERO_PADDING";
    public static final String UNWRAP_ERROR = "UnwrapErr";
    public static final int ZERO_NO_PADDING = 8192;
    public static final int ZERO_PADDING = 3;
    private static final String s = "ru.CryptoPro.JCSP.Cipher.resources.cipher";
    private static final int t = 8;
    private static final int y = 8;
    protected byte[] f;
    protected byte[] i;
    protected int q;
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Cipher.resources.cipher", Locale.getDefault());
    protected static int h = 8192;
    protected int a = 0;
    protected int b = 0;
    protected int c = 0;
    protected JCSPSecretKeyInterface d = null;
    private CryptParamsInterface u = null;
    private byte[] v = null;
    private byte[] w = null;
    protected boolean e = false;
    private boolean x = false;
    protected int g = 0;
    protected int[] j = new int[1];
    protected Key k = null;
    protected AlgorithmParameterSpec l = null;
    protected int m = 0;
    protected int n = -1;
    protected boolean o = false;
    protected boolean p = false;
    private byte[] z = null;
    private byte[] A = null;
    private OmacParamsSpec B = null;
    private int C = 0;
    private boolean D = false;
    private int E = 0;
    protected ByteArrayOutputStream r = new ByteArrayOutputStream();
    private int F = 0;

    public GostCipher() {
        Starter.check(GostCipher.class);
        this.q = 8;
        this.f = new byte[8];
        this.i = new byte[h + 8];
    }

    private void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidKeyException, ShortBufferException {
        JCSPLogger.subEnter();
        int i4 = this.a;
        if (i4 == 32 || i4 == 16) {
            int i5 = this.g;
            int i6 = i2 + i5;
            int i7 = this.q;
            if (i6 <= i7) {
                System.arraycopy(bArr, i, this.f, i5, i2);
                this.g += i2;
            } else {
                int i8 = (i2 + i5) & (i7 - 1);
                if (i8 != 0) {
                    i7 = i8;
                }
                int i9 = (i2 + i5) - i7;
                while (i9 > 0) {
                    int i10 = h;
                    if (i9 <= i10) {
                        i10 = i9;
                    }
                    int i11 = this.g;
                    if (i11 > 0) {
                        System.arraycopy(this.f, 0, this.i, 0, i11);
                        byte[] bArr3 = this.i;
                        int i12 = this.g;
                        System.arraycopy(bArr, i, bArr3, i12, i10 - i12);
                        int i13 = (i10 - this.g) + i;
                        this.g = 0;
                        i = i13;
                    } else {
                        System.arraycopy(bArr, i, this.i, 0, i10);
                        i += i10;
                    }
                    int[] iArr = this.j;
                    iArr[0] = i10;
                    i9 -= i10;
                    int i14 = this.c;
                    JCSPSecretKeyInterface jCSPSecretKeyInterface = this.d;
                    if (i14 == 1) {
                        jCSPSecretKeyInterface.encrypt(this.i, iArr, false);
                    } else {
                        jCSPSecretKeyInterface.decrypt(this.i, iArr, false);
                    }
                    System.arraycopy(this.i, 0, bArr2, i3, this.j[0]);
                    i3 += this.j[0];
                }
                System.arraycopy(bArr, i, this.f, 0, i7);
                this.g = i7;
            }
        } else if (this.c == 2 && i4 == 2097152) {
            int i15 = this.g;
            int i16 = i2 + i15;
            int i17 = this.E;
            if (i16 <= i17) {
                System.arraycopy(bArr, i, this.f, i15, i2);
            } else {
                int i18 = (i15 + i2) - i17;
                while (i18 > 0) {
                    int i19 = h;
                    if (i18 <= i19) {
                        i19 = i18;
                    }
                    int i20 = this.g;
                    if (i20 > 0) {
                        byte[] bArr4 = this.f;
                        if (i19 < i20) {
                            System.arraycopy(bArr4, 0, this.i, 0, i19);
                            byte[] bArr5 = this.f;
                            System.arraycopy(bArr5, i19, bArr5, 0, this.g - i19);
                            this.g -= i19;
                        } else {
                            System.arraycopy(bArr4, 0, this.i, 0, i20);
                            byte[] bArr6 = this.i;
                            int i21 = this.g;
                            System.arraycopy(bArr, i, bArr6, i21, i19 - i21);
                            int i22 = (i19 - this.g) + i;
                            this.g = 0;
                            i = i22;
                        }
                    } else {
                        System.arraycopy(bArr, i, this.i, 0, i19);
                        i += i19;
                    }
                    int[] iArr2 = this.j;
                    iArr2[0] = i19;
                    i18 -= i19;
                    int i23 = this.c;
                    JCSPSecretKeyInterface jCSPSecretKeyInterface2 = this.d;
                    if (i23 == 1) {
                        jCSPSecretKeyInterface2.encrypt(this.i, iArr2, false);
                    } else {
                        jCSPSecretKeyInterface2.decrypt(this.i, iArr2, false);
                    }
                    System.arraycopy(this.i, 0, bArr2, i3, this.j[0]);
                    i3 += this.j[0];
                }
                i2 -= i;
                if (i2 > 0) {
                    System.arraycopy(bArr, i, this.f, this.g, i2);
                }
            }
            this.g += i2;
        } else {
            while (i2 > 0) {
                int i24 = h;
                if (i2 <= i24) {
                    i24 = i2;
                }
                System.arraycopy(bArr, i, this.i, 0, i24);
                i += i24;
                int[] iArr3 = this.j;
                iArr3[0] = i24;
                i2 -= i24;
                int i25 = this.c;
                JCSPSecretKeyInterface jCSPSecretKeyInterface3 = this.d;
                if (i25 == 1) {
                    jCSPSecretKeyInterface3.encrypt(this.i, iArr3, false);
                } else {
                    jCSPSecretKeyInterface3.decrypt(this.i, iArr3, false);
                }
                System.arraycopy(this.i, 0, bArr2, i3, this.j[0]);
                i3 += this.j[0];
            }
        }
        JCSPLogger.subExit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0242, code lost:
    
        throw new java.security.InvalidAlgorithmParameterException(defpackage.oyr.m(r19.E, " bytes expected.", new java.lang.StringBuilder("MAC too short, ")));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException, IllegalBlockSizeException, AEADBadTagException {
        String str;
        byte[] bArr3;
        byte[] bArr4 = bArr;
        JCSPLogger.subEnter();
        int i4 = i2 + this.g;
        String str2 = "Calculating MAC in GCM mode failed.";
        String str3 = "OMAC_CTR cipher mode requires MAC value.";
        if (i4 == 0) {
            int i5 = this.c;
            if (i5 == 2 && this.a == 2097152) {
                throw new IllegalBlockSizeException(oyr.m(this.E, " bytes of MAC.", new StringBuilder("When GCM input length must contain ")));
            }
            int[] iArr = {0};
            JCSPSecretKeyInterface jCSPSecretKeyInterface = this.d;
            if (i5 == 1) {
                jCSPSecretKeyInterface.encrypt(this.i, iArr, true);
                if (this.b == 8192 && iArr[0] > 0) {
                    throw new IllegalBlockSizeException(oyr.m(this.q, " bytes.", new StringBuilder("Input length not multiple of ")));
                }
            } else {
                jCSPSecretKeyInterface.decrypt(this.i, iArr, true);
            }
            System.arraycopy(this.i, 0, bArr2, i3, iArr[0]);
            int i6 = iArr[0] + i3;
            int i7 = this.c;
            int i8 = this.a;
            if (i7 == 1) {
                if (i8 == 8192) {
                    this.B = new OmacParamsSpec(this.d.getTag());
                } else if (i8 == 2097152) {
                    try {
                        byte[] tag = this.d.getTag();
                        if (tag != null) {
                            int length = tag.length;
                            int i9 = this.E;
                            if (length >= i9) {
                                if (bArr2.length - i6 < i9) {
                                    throw new InvalidAlgorithmParameterException(oyr.m(this.E, " bytes expected.", new StringBuilder("Output too short, ")));
                                }
                                System.arraycopy(tag, 0, bArr2, i6, i9);
                                iArr[0] = iArr[0] + this.E;
                            }
                        }
                        throw new InvalidAlgorithmParameterException(oyr.m(this.E, " bytes expected.", new StringBuilder("MAC too short, ")));
                    } catch (InvalidKeyException unused) {
                        kbs.t("Calculating MAC in GCM mode failed.");
                        return 0;
                    }
                }
            } else if (i8 == 8192) {
                if (this.p) {
                    kbs.t("Cipher has already been reset in this mode and doesn't contain valid MAC. Proper init() is required before decrypting.");
                    return 0;
                }
                OmacParamsSpec omacParamsSpec = this.B;
                if (omacParamsSpec == null) {
                    kbs.t("OMAC_CTR cipher mode requires MAC value.");
                    return 0;
                }
                try {
                    byte[] omacValue = omacParamsSpec.getOmacValue();
                    if (omacValue == null) {
                        kbs.t("OMAC_CTR cipher mode requires MAC value.");
                        return 0;
                    }
                    this.d.setTag(omacValue);
                } catch (IOException e) {
                    throw new InvalidAlgorithmParameterException(e);
                }
            } else if (i8 == 2097152) {
                throw new AEADBadTagException(oyr.m(this.E, " bytes of MAC.", new StringBuilder("In GCM mode input length must contain ")));
            }
            return iArr[0];
        }
        int i10 = i4;
        int i11 = 0;
        int i12 = i3;
        while (true) {
            int i13 = i;
            if (i10 <= 0) {
                JCSPLogger.subExit();
                return i11;
            }
            int i14 = h;
            if (i10 <= i14) {
                i14 = i10;
            }
            int i15 = this.g;
            String str4 = str2;
            if (i15 > 0) {
                str = str3;
                System.arraycopy(this.f, 0, this.i, 0, i15);
                if (bArr4 != null) {
                    byte[] bArr5 = this.i;
                    int i16 = this.g;
                    System.arraycopy(bArr4, i13, bArr5, i16, i14 - i16);
                    i13 += i14 - this.g;
                }
                this.g = 0;
            } else {
                str = str3;
                if (bArr4 != null) {
                    System.arraycopy(bArr4, i13, this.i, 0, i14);
                    i13 += i14;
                }
            }
            this.j[0] = i14;
            i10 -= i14;
            boolean z = i10 == 0;
            if (z && this.c == 2 && this.a == 2097152) {
                int i17 = this.E;
                if (i14 - i17 < 0) {
                    throw new AEADBadTagException(oyr.m(this.E, " bytes expected.", new StringBuilder("Input too short, ")));
                }
                bArr3 = new byte[i17];
                i = i13;
                System.arraycopy(this.i, i14 - i17, bArr3, 0, i17);
                int[] iArr2 = this.j;
                iArr2[0] = iArr2[0] - this.E;
            } else {
                i = i13;
                bArr3 = null;
            }
            int i18 = this.c;
            JCSPSecretKeyInterface jCSPSecretKeyInterface2 = this.d;
            if (i18 == 1) {
                jCSPSecretKeyInterface2.encrypt(this.i, this.j, z);
                if (this.b == 8192 && this.j[0] > i14) {
                    throw new IllegalBlockSizeException(oyr.m(this.q, " bytes.", new StringBuilder("Input length not multiple of ")));
                }
            } else {
                jCSPSecretKeyInterface2.decrypt(this.i, this.j, z);
            }
            System.arraycopy(this.i, 0, bArr2, i12, this.j[0]);
            int i19 = this.j[0];
            i12 += i19;
            i11 += i19;
            if (this.c == 1) {
                if (z) {
                    int i20 = this.a;
                    if (i20 == 8192) {
                        this.B = new OmacParamsSpec(this.d.getTag());
                    } else if (i20 == 2097152) {
                        try {
                            byte[] tag2 = this.d.getTag();
                            if (tag2 == null) {
                                break;
                            }
                            int length2 = tag2.length;
                            int i21 = this.E;
                            if (length2 < i21) {
                                break;
                            }
                            if (bArr2.length - i12 < i21) {
                                throw new InvalidAlgorithmParameterException(oyr.m(this.E, " bytes expected.", new StringBuilder("Output too short, ")));
                            }
                            System.arraycopy(tag2, 0, bArr2, i12, i21);
                            int i22 = this.E;
                            i12 += i22;
                            i11 += i22;
                        } catch (InvalidKeyException unused2) {
                            kbs.t(str4);
                            return 0;
                        }
                    } else {
                        bArr4 = bArr;
                        str2 = str4;
                        str3 = str;
                    }
                }
            } else if (z) {
                int i23 = this.a;
                if (i23 == 8192) {
                    OmacParamsSpec omacParamsSpec2 = this.B;
                    if (omacParamsSpec2 == null) {
                        kbs.t(str);
                        return 0;
                    }
                    try {
                        byte[] omacValue2 = omacParamsSpec2.getOmacValue();
                        if (omacValue2 == null) {
                            kbs.t(str);
                            return 0;
                        }
                        this.d.setTag(omacValue2);
                    } catch (IOException e2) {
                        throw new InvalidAlgorithmParameterException(e2);
                    }
                } else {
                    if (i23 != 2097152) {
                        continue;
                    } else {
                        if (bArr3 == null || bArr3.length < this.E) {
                            break;
                        }
                        try {
                            this.d.setTag(bArr3);
                        } catch (InvalidKeyException unused3) {
                            throw new AEADBadTagException("MAC check in GCM mode failed.");
                        }
                    }
                    bArr4 = bArr;
                    str2 = str4;
                    str3 = str;
                }
            }
            bArr4 = bArr;
            str2 = str4;
            str3 = str;
        }
        throw new AEADBadTagException(oyr.m(this.E, " bytes expected.", new StringBuilder("MAC too short, ")));
    }

    private void g() throws InvalidKeyException {
        JCSPLogger.subEnter();
        KdfTreeDiversKeySpec kdfTreeDiversKeySpec = new KdfTreeDiversKeySpec(null, "kdf tree".getBytes(), 1, this.A, 512, 1);
        this.d.setAlgorithmIdentifierByCryptMode(2032);
        JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) ((GostSecretKey) ((DiversKeyInterface) this.d).diversKeyByBlob(HProv.CALG_SYMMETRIC_512, kdfTreeDiversKeySpec)).getSpec();
        b();
        this.d = jCSPSecretKeyInterface;
        JCSPLogger.subExit();
    }

    private void h() {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a != 2097152 || (byteArrayOutputStream = this.r) == null) {
            return;
        }
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = this.r.toByteArray();
            this.F = byteArray.length;
            try {
                this.d.setAAD(byteArray);
            } catch (InvalidKeyException e) {
                ny61.h("Cannot process AAD.", e);
                return;
            }
        }
        this.r = null;
    }

    public void c() {
        int i = 0;
        while (true) {
            byte[] bArr = this.i;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        if (this.v != null) {
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.v;
                if (i3 >= bArr3.length) {
                    break;
                }
                bArr3[i3] = 0;
                i3++;
            }
        }
        b();
        d();
    }

    public void d() {
        JCSPLogger.subEnter();
        if (this.a != 2097152) {
            this.a = 0;
            this.c = 0;
            this.b = 0;
        }
        a(false);
        JCSPLogger.subExit();
    }

    public void e() throws InvalidKeyException {
        JCSPLogger.subEnter();
        this.g = 0;
        this.j[0] = 0;
        Arrays.fill(this.f, (byte) 0);
        Arrays.fill(this.i, (byte) 0);
        this.o = true;
        this.p = true;
        this.e = true;
        b();
        ByteArrayOutputStream byteArrayOutputStream = this.r;
        if (byteArrayOutputStream == null) {
            this.r = new ByteArrayOutputStream();
        } else {
            byteArrayOutputStream.reset();
        }
        this.F = 0;
        JCSPLogger.subExit();
    }

    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        ShortBufferException shortBufferException;
        GostCipher gostCipher;
        InvalidKeyException invalidKeyException;
        GostCipher gostCipher2;
        InvalidAlgorithmParameterException invalidAlgorithmParameterException;
        GostCipher gostCipher3;
        RuntimeException runtimeException;
        GostCipher gostCipher4;
        Error error;
        GostCipher gostCipher5;
        ?? r2;
        int i3;
        int i4;
        JCSPLogger.subEnter();
        if (bArr != null) {
            try {
                r2 = i2 + i;
                if (bArr.length < r2) {
                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                    JCSPLogger.thrown(arrayIndexOutOfBoundsException);
                    throw arrayIndexOutOfBoundsException;
                }
            } catch (Error e) {
                error = e;
                gostCipher5 = this;
                gostCipher5.c();
                throw error;
            } catch (RuntimeException e2) {
                runtimeException = e2;
                gostCipher4 = this;
                gostCipher4.c();
                throw runtimeException;
            } catch (InvalidAlgorithmParameterException e3) {
                invalidAlgorithmParameterException = e3;
                gostCipher3 = this;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"), invalidAlgorithmParameterException);
                gostCipher3.c();
                throw illegalArgumentException;
            } catch (InvalidKeyException e4) {
                invalidKeyException = e4;
                gostCipher2 = this;
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NotInitCrypt"), invalidKeyException);
                gostCipher2.c();
                throw illegalArgumentException2;
            } catch (ShortBufferException e5) {
                shortBufferException = e5;
                gostCipher = this;
                gostCipher.c();
                throw new IllegalBlockSizeException(shortBufferException.getMessage());
            }
        }
        try {
            f();
            prepare();
        } catch (Error e6) {
            e = e6;
            r2 = this;
        } catch (RuntimeException e7) {
            e = e7;
            r2 = this;
        } catch (InvalidAlgorithmParameterException e8) {
            e = e8;
            r2 = this;
        } catch (InvalidKeyException e9) {
            e = e9;
            r2 = this;
        } catch (ShortBufferException e10) {
            e = e10;
            r2 = this;
        }
        try {
            if (!this.e || ((i3 = this.c) != 1 && i3 != 2)) {
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException3);
                throw illegalArgumentException3;
            }
            h();
            int i5 = this.a;
            if (i5 == 16 || i5 == 32) {
                int i6 = this.g;
                int i7 = this.q;
                i4 = ((i2 + i6) - ((i6 + i2) & (i7 - 1))) + i7;
            } else if (i5 == 2097152) {
                int i8 = this.g + i2;
                int i9 = this.c;
                int i10 = this.E;
                if (i9 == 1) {
                    i4 = i8 + i10;
                } else {
                    if (i8 < i10) {
                        throw new AEADBadTagException("Input data too short.");
                    }
                    i4 = i8 - i10;
                }
            } else {
                i4 = i2;
            }
            byte[] bArr2 = new byte[i4];
            int b = b(bArr, i, i2, bArr2, 0);
            if (b != i4) {
                byte[] bArr3 = new byte[b];
                System.arraycopy(bArr2, 0, bArr3, 0, b);
                Arrays.fill(bArr2, (byte) 0);
                bArr2 = bArr3;
            }
            e();
            JCSPLogger.subExit();
            return bArr2;
        } catch (Error e11) {
            e = e11;
            error = e;
            gostCipher5 = r2;
            gostCipher5.c();
            throw error;
        } catch (RuntimeException e12) {
            e = e12;
            runtimeException = e;
            gostCipher4 = r2;
            gostCipher4.c();
            throw runtimeException;
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            invalidAlgorithmParameterException = e;
            gostCipher3 = r2;
            IllegalArgumentException illegalArgumentException4 = new IllegalArgumentException(resource.getString("NotInitCrypt"), invalidAlgorithmParameterException);
            gostCipher3.c();
            throw illegalArgumentException4;
        } catch (InvalidKeyException e14) {
            e = e14;
            invalidKeyException = e;
            gostCipher2 = r2;
            IllegalArgumentException illegalArgumentException22 = new IllegalArgumentException(resource.getString("NotInitCrypt"), invalidKeyException);
            gostCipher2.c();
            throw illegalArgumentException22;
        } catch (ShortBufferException e15) {
            e = e15;
            shortBufferException = e;
            gostCipher = r2;
            gostCipher.c();
            throw new IllegalBlockSizeException(shortBufferException.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.q;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        JCSPLogger.subEnter();
        try {
            prepare();
            if (this.e) {
                byte[] copy = this.x ? Array.copy(this.v) : null;
                JCSPLogger.subExit();
                return copy;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"));
            JCSPLogger.warning(illegalArgumentException);
            throw illegalArgumentException;
        } catch (InvalidAlgorithmParameterException e) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e);
            JCSPLogger.warning(illegalArgumentException2);
            throw illegalArgumentException2;
        } catch (InvalidKeyException e2) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e2);
            JCSPLogger.warning(illegalArgumentException3);
            throw illegalArgumentException3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        try {
            JCSPLogger.subEnter();
            if ((key instanceof JCSPSpecKey) && (key instanceof GostSecretKey)) {
                JCSPLogger.subExit();
                return ((JCSPSpecKey) key).getKeySize();
            }
            if (key instanceof AbstractKeySpec) {
                JCSPLogger.subExit();
                return ((AbstractKeySpec) key).getKeyLength();
            }
            if (key instanceof PublicKeySpec) {
                return ((PublicKeySpec) key).getKeyLength();
            }
            InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvalidKeyType"));
            JCSPLogger.warning(invalidKeyException);
            throw invalidKeyException;
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2;
        try {
            try {
                JCSPLogger.subEnter();
                prepare();
                if (!this.e || (i2 = this.c) == 0) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"));
                    JCSPLogger.warning(illegalArgumentException);
                    throw illegalArgumentException;
                }
                int i3 = this.a;
                if (i3 != 16 && i3 != 32) {
                    if (i3 == 2097152) {
                        int i4 = i + this.g;
                        int i5 = this.E;
                        if (i2 == 1) {
                            i = i4 + i5;
                        } else {
                            if (i4 < i5) {
                                return 0;
                            }
                            i = i4 - i5;
                        }
                    }
                    JCSPLogger.subExit();
                    return i;
                }
                int i6 = this.g;
                int i7 = i + i6;
                int i8 = i + i6;
                int i9 = this.q;
                i = (i7 - (i8 & (i9 - 1))) + i9;
                JCSPLogger.subExit();
                return i;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                c();
                yci0.r(e);
                return 0;
            }
        } catch (Error e2) {
            c();
            throw e2;
        } catch (RuntimeException e3) {
            c();
            throw e3;
        }
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        JCSPLogger.subEnter();
        if (!this.o) {
            JCSPLogger.subExit();
            return null;
        }
        try {
            if (this.B != null) {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(JCP.GOST_OMAC_NAME, "JCSP");
                algorithmParameters.init(this.B.getOmacValue());
                JCSPLogger.subExit();
                return algorithmParameters;
            }
        } catch (Exception e) {
            JCSPLogger.thrown(e);
        }
        JCSPLogger.subExit();
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        JCSPLogger.subEnter();
        this.m = i;
        this.k = key;
        this.n = 1;
        this.o = false;
        this.p = false;
        JCSPLogger.subExit();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            JCSPLogger.subEnter();
            d();
            if (str.toUpperCase().equals("ECB")) {
                this.a = 16;
            } else if (str.toUpperCase().equals("CBC")) {
                this.a = 32;
            } else {
                if (!str.toUpperCase().equals("CNT") && !str.toUpperCase().equals("OFB")) {
                    if (str.toUpperCase().equals("CFB")) {
                        this.a = 128;
                    } else if (str.toUpperCase().equals("CTR")) {
                        this.a = 2048;
                    } else if (str.toUpperCase().equals("CTR_ACPKM")) {
                        this.a = 4096;
                    } else if (str.toUpperCase().equals("OMAC_CTR")) {
                        this.a = 8192;
                    } else if (str.toUpperCase().equals(STR_GCM_MODE)) {
                        this.a = 2097152;
                    } else {
                        if (!str.toUpperCase().equals("PRO_EXPORT") && !str.toUpperCase().equals(STR_MGM_EXPORT)) {
                            if (str.toUpperCase().equals("KEXP_2015_M_EXPORT")) {
                                this.a = 131072;
                            } else if (str.toUpperCase().equals("KEXP_2015_K_EXPORT")) {
                                this.a = 262144;
                            } else if (str.toUpperCase().equals(STR_MGM_M_EXPORT)) {
                                this.a = 524288;
                            } else if (str.toUpperCase().equals(STR_MGM_K_EXPORT)) {
                                this.a = 1048576;
                            } else if (str.toUpperCase().equals("SIMPLE_EXPORT")) {
                                this.a = 32768;
                            } else {
                                if (!str.toUpperCase().equals("PRO12_EXPORT")) {
                                    NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(resource.getString("ModeNotSupp"));
                                    JCSPLogger.warning(noSuchAlgorithmException);
                                    throw noSuchAlgorithmException;
                                }
                                this.a = 65536;
                            }
                        }
                        this.a = 16384;
                    }
                }
                this.a = 64;
            }
            JCSPLogger.subExit();
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (NoSuchAlgorithmException e3) {
            c();
            throw e3;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        int i;
        int i2;
        try {
            JCSPLogger.subEnter();
            int i3 = this.a;
            if (i3 == 0 || this.e) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NoMode"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            if (i3 == 2097152 && !str.equalsIgnoreCase("No_Padding") && !str.equalsIgnoreCase("NoPadding")) {
                NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException("Only NoPadding can be used with GCM mode.");
                JCSPLogger.warning(noSuchPaddingException);
                throw noSuchPaddingException;
            }
            if (!str.equalsIgnoreCase("PKCS5_PADDING") && !str.equalsIgnoreCase("PKCS5Padding")) {
                if (str.toUpperCase().equals(STR_ISO10126_PADDING)) {
                    this.b = 4;
                } else if (str.toUpperCase().equals(STR_ANSI_X923_PADDING)) {
                    this.b = 5;
                } else {
                    if (!str.equalsIgnoreCase("ZERO_PADDING") && !str.equalsIgnoreCase(STR_ZEROPADDING)) {
                        if (str.toUpperCase().equals("RANDOM_PADDING")) {
                            this.b = 2;
                        } else {
                            if (((!str.equalsIgnoreCase("No_Padding") && !str.equalsIgnoreCase("NoPadding")) || (((i = this.a) != 32 && i != 16) || !a())) && ((!str.equalsIgnoreCase("No_Padding") && !str.equalsIgnoreCase("NoPadding")) || this.a != 2097152)) {
                                if ((!str.equalsIgnoreCase("No_Padding") && !str.equalsIgnoreCase("NoPadding")) || ((i2 = this.a) != 64 && i2 != 128 && i2 != 32768 && i2 != 16384 && i2 != 65536 && i2 != 2048 && i2 != 4096 && i2 != 8192 && i2 != 524288 && i2 != 1048576 && i2 != 131072 && i2 != 262144)) {
                                    NoSuchPaddingException noSuchPaddingException2 = new NoSuchPaddingException(resource.getString("PaddingNotSupp"));
                                    JCSPLogger.warning(noSuchPaddingException2);
                                    throw noSuchPaddingException2;
                                }
                                this.b = 0;
                            }
                            this.b = 8192;
                        }
                    }
                    this.b = 3;
                }
                JCSPLogger.subExit();
            }
            this.b = 1;
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

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        JCSPSecretKeyInterface unwrap;
        try {
            JCSPLogger.subEnter();
            prepare();
            if (!this.e || this.c != 4) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitUnwrap"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            int i2 = 0;
            try {
                int i3 = this.a;
                if (i3 == 262144) {
                    i2 = 26161;
                } else if (i3 == 131072) {
                    i2 = 26160;
                }
                if (str != null) {
                    if (str.equalsIgnoreCase("GOST3412_2015_K")) {
                        i2 = 26161;
                    } else if (str.equalsIgnoreCase("GOST3412_2015_M")) {
                        i2 = 26160;
                    }
                }
                unwrap = this.d.unwrap(a() ? bArr : a(bArr, str), i2, a());
            } catch (IllegalArgumentException e) {
                if (this.a != 65536) {
                    throw e;
                }
                try {
                    this.d.setAlgorithmIdentifierByCryptMode(16384);
                    unwrap = this.d.unwrap(a(bArr, str), i2, a());
                } catch (KeyManagementException e2) {
                    InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("UnwrapErr"));
                    invalidKeyException.initCause(e2);
                    JCSPLogger.warning(invalidKeyException);
                    throw invalidKeyException;
                }
            } catch (KeyManagementException e3) {
                InvalidKeyException invalidKeyException2 = new InvalidKeyException(resource.getString("UnwrapErr"));
                invalidKeyException2.initCause(e3);
                JCSPLogger.warning(invalidKeyException2);
                throw invalidKeyException2;
            }
            if (i == 3) {
                d();
                JCSPLogger.subExit();
                return a() ? new ForeignSymmetricKey(unwrap) : new GostSecretKey(unwrap);
            }
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException(resource.getString("InvalidKeyType"));
            JCSPLogger.warning(noSuchAlgorithmException);
            throw noSuchAlgorithmException;
        } catch (Error e4) {
            c();
            throw e4;
        } catch (RuntimeException e5) {
            c();
            throw e5;
        } catch (InvalidAlgorithmParameterException e6) {
            c();
            dy31.s(e6);
            return null;
        } catch (InvalidKeyException e7) {
            c();
            throw e7;
        } catch (NoSuchAlgorithmException e8) {
            c();
            throw e8;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int i3;
        GostCipher gostCipher;
        Throwable th;
        ResourceBundle resourceBundle;
        String str;
        RuntimeException runtimeException;
        Error error;
        int i4;
        byte[] bArr2;
        JCSPLogger.subEnter();
        f();
        try {
            prepare();
            if (!this.e || ((i3 = this.c) != 2 && i3 != 1)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            h();
            try {
                int i5 = this.a;
                i4 = 0;
                if (i5 == 16 || i5 == 32) {
                    int i6 = this.g;
                    int i7 = this.q;
                    if (((i2 + i6) & (i7 - 1)) != 0) {
                        i4 = (i2 + i6) & (i7 - 1);
                    } else if (i2 + i6 != 0) {
                        i4 = i7;
                    }
                    i4 = (i6 + i2) - i4;
                } else {
                    try {
                        if (this.c == 2 && i5 == 2097152) {
                            int i8 = this.g + i2;
                            int i9 = this.E;
                            if (i8 >= i9) {
                                i4 = i8 - i9;
                            }
                        } else {
                            i4 = i2;
                        }
                    } catch (Error e) {
                        error = e;
                        gostCipher = this;
                        gostCipher.c();
                        throw error;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        gostCipher = this;
                        gostCipher.c();
                        throw runtimeException;
                    } catch (InvalidKeyException e3) {
                        th = e3;
                        gostCipher = this;
                        gostCipher.c();
                        resourceBundle = resource;
                        str = "InvalidKeyType";
                        yci0.p(resourceBundle.getString(str), th);
                        return null;
                    } catch (ShortBufferException e4) {
                        th = e4;
                        gostCipher = this;
                        gostCipher.c();
                        resourceBundle = resource;
                        str = "InvTextLen";
                        yci0.p(resourceBundle.getString(str), th);
                        return null;
                    }
                }
                bArr2 = new byte[i4];
                gostCipher = this;
            } catch (Error e5) {
                e = e5;
                gostCipher = this;
            } catch (RuntimeException e6) {
                e = e6;
                gostCipher = this;
            } catch (InvalidKeyException e7) {
                e = e7;
                gostCipher = this;
            } catch (ShortBufferException e8) {
                e = e8;
                gostCipher = this;
            }
            try {
                gostCipher.a(bArr, i, i2, bArr2, 0);
                JCSPLogger.subExit();
                if (i4 == 0) {
                    return null;
                }
                return bArr2;
            } catch (Error e9) {
                e = e9;
                error = e;
                gostCipher.c();
                throw error;
            } catch (RuntimeException e10) {
                e = e10;
                runtimeException = e;
                gostCipher.c();
                throw runtimeException;
            } catch (InvalidKeyException e11) {
                e = e11;
                th = e;
                gostCipher.c();
                resourceBundle = resource;
                str = "InvalidKeyType";
                yci0.p(resourceBundle.getString(str), th);
                return null;
            } catch (ShortBufferException e12) {
                e = e12;
                th = e;
                gostCipher.c();
                resourceBundle = resource;
                str = "InvTextLen";
                yci0.p(resourceBundle.getString(str), th);
                return null;
            }
        } catch (InvalidAlgorithmParameterException e13) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e13);
            JCSPLogger.warning(illegalArgumentException2);
            c();
            throw illegalArgumentException2;
        } catch (InvalidKeyException e14) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e14);
            JCSPLogger.warning(illegalArgumentException3);
            c();
            throw illegalArgumentException3;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        boolean z;
        int i;
        byte[] bArr;
        int i2;
        try {
            JCSPLogger.subEnter();
            prepare();
            if (!this.e || this.c != 8) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitWrap"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            if (!(key instanceof GostSecretKey) && !(key instanceof WrappedAsSimpleBlobSecretKey) && !(key instanceof GostPrivateKey)) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvalidKeyType"));
                JCSPLogger.warning(invalidKeyException);
                throw invalidKeyException;
            }
            boolean z2 = true;
            if (key instanceof WrappedAsSimpleBlobSecretKey) {
                key = ((WrappedAsSimpleBlobSecretKey) key).getSecretKey();
                z = true;
            } else {
                z = false;
            }
            if (key instanceof ForeignSymmetricKey) {
                z = true;
            }
            if ((key instanceof ForeignSymmetricKey) && !(this.k instanceof ForeignSymmetricKey)) {
                InvalidKeyException invalidKeyException2 = new InvalidKeyException(resource.getString("InvalidKeyType"));
                JCSPLogger.warning(invalidKeyException2);
                throw invalidKeyException2;
            }
            JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) ((JCSPSpecKey) key).getSpec();
            JCSPSecretKeyInterface jCSPSecretKeyInterface2 = this.d;
            if ((!(jCSPSecretKeyInterface2 instanceof JCSPSecretKeySpecK) || this.a != 16384) && (i = this.a) != 524288 && i != 1048576) {
                z2 = z;
            }
            byte[] wrap = jCSPSecretKeyInterface.wrap(jCSPSecretKeyInterface2);
            if (!z2 && !(key instanceof GostPrivateKey)) {
                SimpleBlobStructure simpleBlobStructure = new SimpleBlobStructure();
                try {
                    i2 = this.a;
                } catch (Asn1Exception e) {
                    e = e;
                    JCSPLogger.ignoredException(e);
                    bArr = wrap;
                    d();
                    JCSPLogger.subExit();
                    return bArr;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (StructException e3) {
                    e = e3;
                    JCSPLogger.ignoredException(e);
                    bArr = wrap;
                    d();
                    JCSPLogger.subExit();
                    return bArr;
                }
                if (i2 != 131072 && i2 != 262144) {
                    simpleBlobStructure.read(new ByteArrayInputStream(wrap));
                    Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
                    gost28147_89_EncryptedKey.encryptedKey = new Gost28147_89_Key(simpleBlobStructure.ifInit() ? simpleBlobStructure.bEncryptedKey.value : null);
                    gost28147_89_EncryptedKey.macKey = new Gost28147_89_MAC(simpleBlobStructure.ifInit() ? simpleBlobStructure.bMacKey.value : null);
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                    gost28147_89_EncryptedKey.encode(asn1BerEncodeBuffer);
                    bArr = asn1BerEncodeBuffer.getMsgCopy();
                    d();
                    JCSPLogger.subExit();
                    return bArr;
                }
                int length = wrap.length - 16;
                byte[] bArr2 = new byte[length];
                Array.copy(wrap, 16, bArr2, 0, length);
                Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr2);
                GostKeyTransportKExp15 gostKeyTransportKExp15 = new GostKeyTransportKExp15();
                gostKeyTransportKExp15.decode(asn1BerDecodeBuffer);
                byte[] bArr3 = gostKeyTransportKExp15.encryptedKeyData.value;
                byte[] bArr4 = gostKeyTransportKExp15.encryptedMac.value;
                wrap = new byte[bArr3.length + bArr4.length];
                Array.copy(bArr3, 0, wrap, 0, bArr3.length);
                Array.copy(bArr4, 0, wrap, bArr3.length, bArr4.length);
                bArr = wrap;
                d();
                JCSPLogger.subExit();
                return bArr;
            }
            d();
            JCSPLogger.subExit();
            return wrap;
        } catch (Error e4) {
            c();
            throw e4;
        } catch (RuntimeException e5) {
            c();
            throw e5;
        } catch (InvalidAlgorithmParameterException e6) {
            c();
            dy31.s(e6);
            return null;
        } catch (InvalidKeyException e7) {
            c();
            throw e7;
        }
    }

    public void f() {
        if (this.c == 1 && this.a == 2097152 && this.o) {
            ny61.r("Cipher in GCM mode cannot be reused for encryption.");
        }
    }

    public void finalize() throws Throwable {
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9 A[Catch: CloneNotSupportedException -> 0x0059, InvalidKeyException -> 0x005c, RuntimeException -> 0x005f, Error -> 0x0062, TRY_LEAVE, TryCatch #2 {CloneNotSupportedException -> 0x0059, Error -> 0x0062, RuntimeException -> 0x005f, InvalidKeyException -> 0x005c, blocks: (B:10:0x002a, B:15:0x0043, B:17:0x0047, B:19:0x0053, B:20:0x0091, B:22:0x0095, B:24:0x0099, B:26:0x009d, B:28:0x00a1, B:30:0x00a5, B:32:0x00a9, B:34:0x00ad, B:37:0x00b2, B:38:0x00c2, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d0, B:46:0x00d3, B:48:0x00d7, B:49:0x00f8, B:51:0x00fe, B:52:0x0110, B:54:0x0116, B:55:0x0128, B:57:0x012e, B:58:0x014b, B:60:0x0151, B:61:0x0169, B:65:0x0175, B:68:0x017a, B:69:0x0181, B:70:0x0182, B:72:0x0186, B:74:0x018a, B:75:0x0192, B:79:0x01a1, B:80:0x020f, B:82:0x0213, B:85:0x0219, B:86:0x0222, B:87:0x0225, B:89:0x0229, B:90:0x022e, B:92:0x0232, B:93:0x0238, B:95:0x023c, B:97:0x0240, B:98:0x02e3, B:99:0x01a7, B:101:0x01ab, B:104:0x01b7, B:107:0x01bd, B:108:0x01de, B:109:0x01df, B:111:0x01e7, B:113:0x01eb, B:116:0x01f6, B:118:0x01fa, B:119:0x01fd, B:121:0x0208, B:122:0x016f, B:124:0x0245, B:125:0x024a, B:126:0x0065, B:128:0x0069, B:130:0x006f, B:131:0x0077, B:135:0x0087, B:136:0x008a, B:138:0x024b, B:139:0x0256, B:140:0x02e5, B:142:0x02e9, B:145:0x0257, B:147:0x025b, B:149:0x0267, B:150:0x026c, B:152:0x0270, B:153:0x027a, B:155:0x0287, B:156:0x02c7, B:158:0x02cb, B:160:0x02cf, B:162:0x02d3, B:163:0x02d6, B:165:0x02da, B:167:0x02de, B:168:0x02f0, B:169:0x02f7, B:170:0x028d, B:172:0x0291, B:177:0x0299, B:178:0x02a0, B:179:0x02a1, B:182:0x02a7, B:184:0x02ad, B:185:0x02b3, B:187:0x02bd, B:188:0x02c0, B:189:0x02f8, B:190:0x02fd, B:191:0x02fe, B:192:0x0309), top: B:9:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepare() throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        byte[] bArr2;
        if (this.d == null) {
            JCSPLogger.subEnter();
            a(this.o);
            Key key = this.k;
            JCSPSecretKeyInterface extractSpec = key instanceof SecretKeySpec ? ForeignSymmetricKey.extractSpec(key) : (JCSPSecretKeyInterface) ((GostSecretKey) key).getSpec();
            if (!this.o) {
                a(this.m);
            }
            try {
                int i = this.n;
                IvParameterSpec ivParameterSpec = null;
                if (i != 1) {
                    if (i == 2) {
                        if (extractSpec instanceof JCSPSecretKeySpec) {
                            JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) extractSpec.clone();
                            this.d = jCSPSecretKeyInterface;
                            if (!(extractSpec instanceof JCSPForeignSecretKeySpec)) {
                                jCSPSecretKeyInterface.setAlgorithmIdentifierByCryptMode(this.a);
                            }
                        } else {
                            if (!(extractSpec instanceof JCSPAgreeSecretKeySpec)) {
                                throw new InvalidKeyException(resource.getString("InvalidKeyType"));
                            }
                            Key key2 = this.k;
                            byte[] a = key2 instanceof GostAgreeKey ? ((GostAgreeKey) key2).a() : null;
                            this.d = (JCSPSecretKeyInterface) extractSpec.clone();
                            int i2 = this.a;
                            if (i2 != 131072 && i2 != 262144) {
                                if (a != null) {
                                    a(a);
                                }
                                this.d.setAlgorithmIdentifierByCryptMode(this.a);
                            }
                        }
                        AlgorithmParameterSpec algorithmParameterSpec = this.l;
                        if (algorithmParameterSpec != null) {
                            if (!(algorithmParameterSpec instanceof CryptParamsInterface) && !(algorithmParameterSpec instanceof IvParameterSpec) && !(algorithmParameterSpec instanceof GostCipherSpecImpl) && !(algorithmParameterSpec instanceof Kexp15ParamsSpec) && !(algorithmParameterSpec instanceof OmacParamsSpec) && !(algorithmParameterSpec instanceof G3412ParamsSpec) && !(algorithmParameterSpec instanceof GCMParameterSpec)) {
                                InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("InvPar"));
                                JCSPLogger.warning(invalidAlgorithmParameterException);
                                throw invalidAlgorithmParameterException;
                            }
                            if (algorithmParameterSpec instanceof CryptParamsInterface) {
                                this.u = (CryptParamsInterface) algorithmParameterSpec;
                            }
                            ivParameterSpec = algorithmParameterSpec instanceof IvParameterSpec ? (IvParameterSpec) algorithmParameterSpec : null;
                            if (algorithmParameterSpec instanceof G3412ParamsSpec) {
                                ivParameterSpec = new IvParameterSpec(((G3412ParamsSpec) this.l).getIV());
                                this.C = ((G3412ParamsSpec) this.l).getGammaLen();
                                this.D = ((G3412ParamsSpec) this.l).isCms();
                            }
                            AlgorithmParameterSpec algorithmParameterSpec2 = this.l;
                            if (algorithmParameterSpec2 instanceof GostCipherSpecImpl) {
                                this.u = (CryptParamsInterface) ((GostCipherSpecImpl) algorithmParameterSpec2).getCryptParameters();
                                ivParameterSpec = ((GostCipherSpecImpl) this.l).getIvParameters();
                            }
                            AlgorithmParameterSpec algorithmParameterSpec3 = this.l;
                            if (algorithmParameterSpec3 instanceof Kexp15ParamsSpec) {
                                this.z = ((Kexp15ParamsSpec) algorithmParameterSpec3).getBaseUkm();
                                this.A = ((Kexp15ParamsSpec) this.l).getExtendKeyUkm();
                            }
                            if (this.l instanceof OmacParamsSpec) {
                                IvParameterSpec ivParameterSpec2 = new IvParameterSpec(((OmacParamsSpec) this.l).getIvValue());
                                AlgorithmParameterSpec algorithmParameterSpec4 = this.l;
                                this.B = (OmacParamsSpec) algorithmParameterSpec4;
                                this.D = ((OmacParamsSpec) algorithmParameterSpec4).isCms();
                                ivParameterSpec = ivParameterSpec2;
                            }
                            if (this.l instanceof GCMParameterSpec) {
                                ivParameterSpec = new IvParameterSpec(((GCMParameterSpec) this.l).getIV());
                                this.E = ((GCMParameterSpec) this.l).getTLen() / 8;
                            }
                        }
                        int i3 = this.a;
                        if ((i3 == 131072 || i3 == 262144) && this.z == null) {
                            throw new InvalidKeyException("Kexp15 should take UKM params");
                        }
                        if (i3 == 2097152 && this.l == null) {
                            throw new InvalidKeyException("Cipher in GCM mode requires parameters.");
                        }
                        if (!this.o && this.v == null) {
                            this.v = this.d.getIV_byte();
                        }
                        this.d.setEncryptMode(this.a, this.D);
                        int i4 = this.a;
                        if (ivParameterSpec != null) {
                            if (i4 == 16) {
                                JCSPLogger.warning("ECB mode cannot use IV");
                            } else if (!this.o) {
                                byte[] iv = ivParameterSpec.getIV();
                                int i5 = this.a;
                                if (i5 != 4096 && i5 != 2097152 && iv.length < this.q) {
                                    throw new InvalidAlgorithmParameterException("Invalid length of IV = " + iv.length + ". It should be at least " + this.q + " bytes.");
                                }
                                this.w = iv;
                                a(iv);
                            }
                        } else if (i4 != 16 && !this.o) {
                            a(this.k);
                            int i6 = this.a;
                            if (i6 == 131072 || i6 == 262144) {
                                if (this.A != null) {
                                    g();
                                }
                                this.d.setAlgorithmIdentifierByCryptMode(this.a);
                                if (this.c == 8) {
                                    this.d.setIV_byte(this.z);
                                }
                            }
                        }
                        if (!this.o) {
                            CryptParamsInterface cryptParamsInterface = this.u;
                            JCSPSecretKeyInterface jCSPSecretKeyInterface2 = this.d;
                            if (cryptParamsInterface == null) {
                                this.u = (CryptParamsInterface) jCSPSecretKeyInterface2.getParams();
                            } else {
                                jCSPSecretKeyInterface2.setParams(cryptParamsInterface);
                            }
                        }
                        int i7 = this.b;
                        if (i7 != 0) {
                            this.d.setPadding(i7);
                        }
                        int i8 = this.C;
                        if (i8 != 0) {
                            this.d.setModeBits(i8 * 8);
                        }
                        if (this.o && (bArr2 = this.w) != null) {
                            a(bArr2);
                        }
                    }
                    if (this.o) {
                        this.o = false;
                    }
                    JCSPLogger.subExit();
                }
                if (extractSpec instanceof JCSPSecretKeySpec) {
                    JCSPSecretKeyInterface jCSPSecretKeyInterface3 = (JCSPSecretKeyInterface) extractSpec.clone();
                    this.d = jCSPSecretKeyInterface3;
                    if (!(extractSpec instanceof JCSPForeignSecretKeySpec)) {
                        jCSPSecretKeyInterface3.setAlgorithmIdentifierByCryptMode(this.a);
                    }
                    if (!this.o) {
                        this.u = (CryptParamsInterface) this.d.getParams();
                    }
                    this.d.setEncryptMode(this.a, this.D);
                    int i9 = this.b;
                    if (i9 != 0) {
                        this.d.setPadding(i9);
                    }
                } else {
                    if (!(extractSpec instanceof JCSPAgreeSecretKeySpec)) {
                        throw new InvalidKeyException(resource.getString("InvalidKeyType"));
                    }
                    int i10 = this.c;
                    if (i10 != 8 && i10 != 4) {
                        throw new InvalidKeyException("Can't clone agree key");
                    }
                    int i11 = this.a;
                    if (i11 == 131072 || i11 == 262144) {
                        throw new InvalidKeyException("Kexp15 should take UKM params");
                    }
                    Key key3 = this.k;
                    byte[] a2 = key3 instanceof GostAgreeKey ? ((GostAgreeKey) key3).a() : null;
                    this.d = (JCSPSecretKeyInterface) extractSpec.clone();
                    if (a2 != null) {
                        a(a2);
                    }
                    this.d.setAlgorithmIdentifierByCryptMode(this.a);
                }
                if (this.a == 2097152) {
                    throw new InvalidAlgorithmParameterException("GCM parameters must be set.");
                }
                if (this.o && (bArr = this.w) != null) {
                    a(bArr);
                }
                if (this.a != 16 && !this.o) {
                    a(this.k);
                }
                this.e = true;
                if (this.o) {
                }
                JCSPLogger.subExit();
            } catch (CloneNotSupportedException e) {
                c();
                dy31.s(e);
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
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        JCSPLogger.thrown(unsupportedOperationException);
        throw unsupportedOperationException;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCSPLogger.subEnter();
        engineInit(i, key, secureRandom);
        this.l = algorithmParameterSpec;
        this.n = 2;
        JCSPLogger.subExit();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: InvalidKeyException -> 0x0039, ShortBufferException -> 0x003c, RuntimeException -> 0x003f, Error -> 0x0042, ArrayIndexOutOfBoundsException -> 0x0090, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x0090, Error -> 0x0042, RuntimeException -> 0x003f, InvalidKeyException -> 0x0039, ShortBufferException -> 0x003c, blocks: (B:12:0x001b, B:17:0x0026, B:21:0x002e, B:24:0x005f, B:26:0x0063, B:29:0x006a, B:30:0x0074, B:31:0x0037, B:33:0x0047, B:35:0x0052, B:38:0x005d, B:39:0x0058), top: B:11:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: InvalidKeyException -> 0x0039, ShortBufferException -> 0x003c, RuntimeException -> 0x003f, Error -> 0x0042, ArrayIndexOutOfBoundsException -> 0x0090, TryCatch #3 {ArrayIndexOutOfBoundsException -> 0x0090, Error -> 0x0042, RuntimeException -> 0x003f, InvalidKeyException -> 0x0039, ShortBufferException -> 0x003c, blocks: (B:12:0x001b, B:17:0x0026, B:21:0x002e, B:24:0x005f, B:26:0x0063, B:29:0x006a, B:30:0x0074, B:31:0x0037, B:33:0x0047, B:35:0x0052, B:38:0x005d, B:39:0x0058), top: B:11:0x001b }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        int i4;
        int i5;
        JCSPLogger.subEnter();
        f();
        try {
            prepare();
            if (!this.e || ((i4 = this.c) != 2 && i4 != 1)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            h();
            try {
                int i6 = this.a;
                if (i6 != 16 && i6 != 32) {
                    if (this.c == 2 && i6 == 2097152) {
                        int i7 = this.g + i2;
                        int i8 = this.E;
                        i5 = i7 < i8 ? 0 : i7 - i8;
                    } else {
                        i5 = i2;
                    }
                    if (bArr2.length - i3 < i5) {
                        a(bArr, i, i2, bArr2, i3);
                        JCSPLogger.subExit();
                        return i5;
                    }
                    ShortBufferException shortBufferException = new ShortBufferException("Output buffer too short");
                    JCSPLogger.thrown(shortBufferException);
                    throw shortBufferException;
                }
                int i9 = this.g;
                int i10 = this.q;
                if (((i2 + i9) & (i10 - 1)) != 0) {
                    i10 = (i10 - 1) & (i2 + i9);
                } else if (i2 + i9 == 0) {
                    i10 = 0;
                }
                i5 = (i9 + i2) - i10;
                if (bArr2.length - i3 < i5) {
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                c();
                throw new ShortBufferException();
            } catch (Error e) {
                c();
                throw e;
            } catch (RuntimeException e2) {
                c();
                throw e2;
            } catch (InvalidKeyException e3) {
                c();
                yci0.p(resource.getString("InvalidKeyType"), e3);
                return 0;
            } catch (ShortBufferException e4) {
                c();
                throw e4;
            }
        } catch (InvalidAlgorithmParameterException e5) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e5);
            JCSPLogger.warning(illegalArgumentException2);
            c();
            throw illegalArgumentException2;
        } catch (InvalidKeyException e6) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString("NotInitCrypt"), e6);
            JCSPLogger.warning(illegalArgumentException3);
            c();
            throw illegalArgumentException3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: InvalidAlgorithmParameterException -> 0x0040, InvalidKeyException -> 0x0043, ShortBufferException -> 0x0046, RuntimeException -> 0x0049, Error -> 0x004c, ArrayIndexOutOfBoundsException -> 0x00b3, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x00b3, Error -> 0x004c, RuntimeException -> 0x0049, InvalidAlgorithmParameterException -> 0x0040, InvalidKeyException -> 0x0043, ShortBufferException -> 0x0046, blocks: (B:3:0x0005, B:5:0x000f, B:9:0x0017, B:16:0x0029, B:20:0x005e, B:22:0x0062, B:25:0x006d, B:26:0x0077, B:29:0x0038, B:30:0x003f, B:32:0x0051, B:33:0x0078, B:34:0x0088), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: InvalidAlgorithmParameterException -> 0x0040, InvalidKeyException -> 0x0043, ShortBufferException -> 0x0046, RuntimeException -> 0x0049, Error -> 0x004c, ArrayIndexOutOfBoundsException -> 0x00b3, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x00b3, Error -> 0x004c, RuntimeException -> 0x0049, InvalidAlgorithmParameterException -> 0x0040, InvalidKeyException -> 0x0043, ShortBufferException -> 0x0046, blocks: (B:3:0x0005, B:5:0x000f, B:9:0x0017, B:16:0x0029, B:20:0x005e, B:22:0x0062, B:25:0x006d, B:26:0x0077, B:29:0x0038, B:30:0x003f, B:32:0x0051, B:33:0x0078, B:34:0x0088), top: B:2:0x0005 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        int i4;
        int i5;
        JCSPLogger.subEnter();
        try {
            f();
            prepare();
            if (!this.e || ((i4 = this.c) != 1 && i4 != 2)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NotInitCrypt"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
            h();
            int i6 = this.a;
            if (i6 != 16 && i6 != 32) {
                if (i6 == 2097152) {
                    int i7 = this.g + i2;
                    int i8 = this.c;
                    int i9 = this.E;
                    if (i8 == 1) {
                        i5 = i7 + i9;
                    } else {
                        if (i7 < i9) {
                            throw new AEADBadTagException("Input data too short.");
                        }
                        i5 = i7 - i9;
                    }
                } else {
                    i5 = i2;
                }
                if (bArr2.length - i3 >= i5) {
                    ShortBufferException shortBufferException = new ShortBufferException("Output buffer too short");
                    JCSPLogger.thrown(shortBufferException);
                    throw shortBufferException;
                }
                int b = b(bArr, i, i2, bArr2, i3);
                e();
                JCSPLogger.subExit();
                return b;
            }
            int i10 = this.g;
            int i11 = this.q;
            i5 = ((i2 + i10) - ((i10 + i2) & (i11 - 1))) + i11;
            if (bArr2.length - i3 >= i5) {
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            c();
            throw new ShortBufferException();
        } catch (Error e) {
            c();
            throw e;
        } catch (RuntimeException e2) {
            c();
            throw e2;
        } catch (InvalidAlgorithmParameterException e3) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("CryptErr"), e3);
            c();
            throw illegalArgumentException2;
        } catch (InvalidKeyException e4) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(resource.getString("CryptErr"), e4);
            c();
            throw illegalArgumentException3;
        } catch (ShortBufferException e5) {
            c();
            throw e5;
        }
    }

    private void a(Key key) throws InvalidKeyException {
        JCSPLogger.subEnter();
        this.w = null;
        boolean z = key instanceof GostAgreeKey;
        if (z || (key instanceof ForeignSymmetricKey)) {
            int i = this.c;
            if (i == 8 || i == 4) {
                byte[] a = z ? ((GostAgreeKey) key).a() : this.d.getIV_byte();
                a(a);
                this.w = a;
            }
        } else {
            int i2 = this.c;
            if (i2 == 8) {
                a(this.d.getIV_byte());
            } else if (i2 == 4 && !(this.d instanceof JCSPSecretKeySpecK)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(resource.getString("NoIVUnwrap"));
                JCSPLogger.warning(illegalArgumentException);
                throw illegalArgumentException;
            }
        }
        if (this.c == 1) {
            a(this.d.getIV_byte());
        }
        if (this.c != 2) {
            JCSPLogger.subExit();
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(resource.getString("NoIVDecrypt"));
            JCSPLogger.warning(illegalArgumentException2);
            throw illegalArgumentException2;
        }
    }

    public void a(boolean z) {
        JCSPLogger.subEnter();
        this.g = 0;
        this.j[0] = 0;
        Arrays.fill(this.f, (byte) 0);
        Arrays.fill(this.i, (byte) 0);
        if (!z) {
            this.z = null;
            this.A = null;
            this.B = null;
            this.v = null;
            this.u = null;
            this.x = false;
            this.e = false;
            b();
            this.E = 0;
            ByteArrayOutputStream byteArrayOutputStream = this.r;
            if (byteArrayOutputStream == null) {
                this.r = new ByteArrayOutputStream();
            } else {
                byteArrayOutputStream.reset();
            }
            this.F = 0;
        }
        JCSPLogger.subExit();
    }

    private void a(byte[] bArr) {
        int i;
        JCSPLogger.subEnter();
        if (bArr == null) {
            JCSPLogger.fine("IV is null, IV has not been set, continue.");
        } else {
            try {
                JCSPSecretKeyInterface jCSPSecretKeyInterface = this.d;
                if (!(jCSPSecretKeyInterface instanceof JCSPSecretKeySpecM) && !(jCSPSecretKeyInterface instanceof JCSPSecretKeySpecK) && (i = this.a) != 131072 && i != 262144 && i != 524288 && i != 1048576 && i != 2097152) {
                    jCSPSecretKeyInterface.setIV_byte(bArr);
                    this.v = bArr;
                    this.x = true;
                }
                jCSPSecretKeyInterface.setIV_blob(bArr);
                this.v = bArr;
                this.x = true;
            } catch (InvalidKeyException e) {
                d();
                InvalidParameterException invalidParameterException = new InvalidParameterException(resource.getString("CryptErr"));
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            }
        }
        JCSPLogger.subExit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001a, code lost:
    
        if (r9.a == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r9.a == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r9.a = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r9.c = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i) {
        JCSPLogger.subEnter();
        if (this.e) {
            ny61.g(resource.getString("NoMode"));
            return;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3 || i == 8) {
                    int i3 = this.a;
                    if (i3 != 32768 && i3 != 131072 && i3 != 262144 && i3 != 524288 && i3 != 1048576 && i3 != 65536) {
                        this.a = 16384;
                    }
                    this.c = 8;
                } else if (i == 4) {
                    int i4 = this.a;
                    if (i4 != 32768 && i4 != 131072 && i4 != 262144 && i4 != 524288 && i4 != 1048576 && i4 != 65536) {
                        this.a = 16384;
                    }
                    this.c = 4;
                }
            }
        }
        JCSPLogger.subExit();
    }

    public boolean a() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r20.equalsIgnoreCase(ru.CryptoPro.JCP.JCP.GOST_MASTER_KEY_NAME) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (r20.equalsIgnoreCase(ru.CryptoPro.JCP.JCP.GOST_MASTER_KEY_NAME) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] a(byte[] bArr, String str) throws InvalidKeyException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray;
        int i;
        JCSPLogger.subEnter();
        int i2 = this.a;
        int i3 = HProv.CALG_TLS1_MASTER;
        if (i2 == 131072 || i2 == 262144) {
            int i4 = i2 == 131072 ? 26160 : 26161;
            try {
                try {
                    if (str != null) {
                        if (str.equalsIgnoreCase("GOST3412_2015_K")) {
                            i3 = 26161;
                        } else if (str.equalsIgnoreCase("GOST3412_2015_M")) {
                            i3 = 26160;
                        }
                        int i5 = this.a;
                        int i6 = i5 != 131072 ? HProv.CALG_KEXP_2015_M : HProv.CALG_KEXP_2015_K;
                        int i7 = i5 != 131072 ? 8 : 16;
                        byte[] bArr2 = new byte[32];
                        Array.copy(bArr, 0, bArr2, 0, 32);
                        byte[] bArr3 = new byte[i7];
                        Array.copy(bArr, 32, bArr3, 0, i7);
                        GostKeyTransportKExp15 gostKeyTransportKExp15 = new GostKeyTransportKExp15(this.z, bArr2, bArr3);
                        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                        gostKeyTransportKExp15.encode(asn1BerEncodeBuffer);
                        GostKExp15BlobStructure gostKExp15BlobStructure = new GostKExp15BlobStructure(i3, i6, asn1BerEncodeBuffer.getMsgCopy());
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        gostKExp15BlobStructure.write(byteArrayOutputStream);
                    }
                    gostKExp15BlobStructure.write(byteArrayOutputStream);
                } catch (StructException e) {
                    InvalidKeyException invalidKeyException = new InvalidKeyException("InvPar");
                    invalidKeyException.initCause(e);
                    throw invalidKeyException;
                }
                gostKeyTransportKExp15.encode(asn1BerEncodeBuffer);
                GostKExp15BlobStructure gostKExp15BlobStructure2 = new GostKExp15BlobStructure(i3, i6, asn1BerEncodeBuffer.getMsgCopy());
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Asn1Exception e2) {
                throw new InvalidKeyException("ASN.1 invalid params structure", e2);
            }
            i3 = i4;
            int i52 = this.a;
            if (i52 != 131072) {
            }
            if (i52 != 131072) {
            }
            byte[] bArr22 = new byte[32];
            Array.copy(bArr, 0, bArr22, 0, 32);
            byte[] bArr32 = new byte[i7];
            Array.copy(bArr, 32, bArr32, 0, i7);
            GostKeyTransportKExp15 gostKeyTransportKExp152 = new GostKeyTransportKExp15(this.z, bArr22, bArr32);
            Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
        } else {
            try {
                new SimpleBlobStructure().read(new ByteArrayInputStream(bArr));
                byteArray = bArr;
            } catch (StructException unused) {
                Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
                try {
                    gost28147_89_EncryptedKey.decode(new Asn1BerDecodeBuffer(bArr));
                    byte[] bArr4 = gost28147_89_EncryptedKey.macKey.value;
                    byte[] bArr5 = gost28147_89_EncryptedKey.encryptedKey.value;
                    int algorithmIdentifier = this.d.getAlgorithmIdentifier();
                    try {
                        if (str != null) {
                            if (str.equalsIgnoreCase("GOST3412_2015_K")) {
                                i = 26161;
                            } else if (str.equalsIgnoreCase("GOST3412_2015_M")) {
                                i = 26160;
                            }
                            if (this.v == null) {
                                this.v = this.d.getIV_byte();
                            }
                            if (this.u == null) {
                                this.u = (CryptParamsInterface) this.d.getParams();
                            }
                            SimpleBlobStructure simpleBlobStructure = new SimpleBlobStructure(i, algorithmIdentifier, this.v, bArr5, bArr4, new Asn1ObjectIdentifier(this.u.getOID().value));
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            simpleBlobStructure.write(byteArrayOutputStream);
                        }
                        simpleBlobStructure.write(byteArrayOutputStream);
                    } catch (StructException e3) {
                        InvalidKeyException invalidKeyException2 = new InvalidKeyException("InvPar");
                        invalidKeyException2.initCause(e3);
                        throw invalidKeyException2;
                    }
                    i3 = 26142;
                    i = i3;
                    if (this.v == null) {
                    }
                    if (this.u == null) {
                    }
                    SimpleBlobStructure simpleBlobStructure2 = new SimpleBlobStructure(i, algorithmIdentifier, this.v, bArr5, bArr4, new Asn1ObjectIdentifier(this.u.getOID().value));
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Asn1Exception e4) {
                    InvalidKeyException invalidKeyException3 = new InvalidKeyException("InvPar");
                    invalidKeyException3.initCause(e4);
                    throw invalidKeyException3;
                } catch (IOException e5) {
                    InvalidKeyException invalidKeyException4 = new InvalidKeyException("InvPar");
                    invalidKeyException4.initCause(e5);
                    throw invalidKeyException4;
                }
            }
            JCSPLogger.subExit();
            return byteArray;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        JCSPLogger.subExit();
        return byteArray;
    }

    public void b() {
        JCSPSecretKeyInterface jCSPSecretKeyInterface = this.d;
        if (jCSPSecretKeyInterface != null) {
            jCSPSecretKeyInterface.clear();
            this.d = null;
        }
    }
}
