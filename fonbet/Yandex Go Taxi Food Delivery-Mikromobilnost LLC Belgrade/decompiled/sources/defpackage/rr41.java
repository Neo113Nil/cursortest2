package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Xml;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.CAdES.envelope.EnvelopedOptions;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Parameters;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost3412_15_Encryption_Parameters;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_12_KEG_Parameters;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.G3412ParamsSpec;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.OmacParamsSpec;
import ru.CryptoPro.JCP.spec.GostCipherSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.CryptoPro.ssl.util.Cache;
import ru.CryptoPro.sspiSSL.SSLSessionContextImpl;
import ru.CryptoPro.sspiSSL.SSLSessionImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.bo2;
import yads.gv;
import yads.hm2;
import yads.jk3;
import yads.p9;
import yads.tp0;
import yads.xz;
import yads.yf2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class rr41 implements l8q0, kyv, lu61, Cache.CacheVisitor, e381, fh81, wf81 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0103, code lost:
    
        if (r8.equals(ru.CryptoPro.JCP.JCP.GOST_DH_2012_512_NAME) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x011c, code lost:
    
        if (r8.equals(ru.CryptoPro.JCP.JCP.GOST_DH_2012_256_NAME) != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f A[Catch: all -> 0x0383, Exception -> 0x038a, TRY_LEAVE, TryCatch #18 {Exception -> 0x038a, all -> 0x0383, blocks: (B:8:0x0024, B:13:0x006e, B:45:0x0177, B:16:0x00b4, B:30:0x012a, B:32:0x012f, B:39:0x0141, B:44:0x016f, B:188:0x0167, B:197:0x011e, B:203:0x0118, B:224:0x005f), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024a A[Catch: all -> 0x033b, Exception -> 0x0343, TryCatch #21 {Exception -> 0x0343, all -> 0x033b, blocks: (B:66:0x024f, B:69:0x027d, B:63:0x0230, B:65:0x024a), top: B:62:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2 A[Catch: all -> 0x029e, Exception -> 0x02a4, TryCatch #20 {Exception -> 0x02a4, all -> 0x029e, blocks: (B:72:0x0289, B:75:0x0291, B:76:0x02ac, B:78:0x02b2, B:79:0x0313, B:91:0x02c1, B:93:0x02c9, B:94:0x02d8, B:96:0x02e0, B:97:0x02ef, B:99:0x02f7, B:100:0x0306, B:101:0x02aa), top: B:71:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c1 A[Catch: all -> 0x029e, Exception -> 0x02a4, TryCatch #20 {Exception -> 0x02a4, all -> 0x029e, blocks: (B:72:0x0289, B:75:0x0291, B:76:0x02ac, B:78:0x02b2, B:79:0x0313, B:91:0x02c1, B:93:0x02c9, B:94:0x02d8, B:96:0x02e0, B:97:0x02ef, B:99:0x02f7, B:100:0x0306, B:101:0x02aa), top: B:71:0x0289 }] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rr41(PrivateKey privateKey, xr1 xr1Var, xr1 xr1Var2, zyu0 zyu0Var, w2 w2Var, byte[] bArr, nr41 nr41Var, EnvelopedOptions envelopedOptions) {
        boolean z;
        SecretKey secretKey;
        SecretKey secretKey2;
        SecretKey secretKey3;
        SecretKey secretKey4;
        SecretKey secretKey5;
        Object obj;
        Object obj2;
        Object obj3;
        SecretKey secretKey6;
        int i;
        IvParameterSpec ivParameterSpec;
        AlgorithmParameterSpec cryptParamsSpec;
        int i2;
        String defaultEncryptionProvider;
        PublicKey generatePublic;
        PublicKey publicKey;
        SecretKey secretKey7;
        SecretKey secretKey8;
        String str;
        Asn1BerDecodeBuffer asn1BerDecodeBuffer;
        String str2;
        boolean equals;
        u2 u2Var;
        u2 u2Var2;
        u2 u2Var3;
        PublicKey publicKey2;
        byte[] bArr2;
        OID oid;
        AlgorithmParameterSpec gostCipherSpec;
        int i3;
        String oid2;
        String algorithm;
        int hashCode;
        ?? r6;
        byte[] bArr3;
        this.a = 8;
        boolean z2 = lu61.p5 || (envelopedOptions != null && envelopedOptions.csp().isCopySecretKeyToLocalContext());
        try {
            String str3 = "GOST28147/SIMPLE_EXPORT/NoPadding";
            String str4 = xr1Var.a.a;
            i3 i3Var = (i3) xr1Var.b.toASN1Primitive();
            byte[] bArr4 = w2Var.a;
            String str5 = "GOST28147";
            u2 u2Var4 = lu61.i5;
            boolean equals2 = str4.equals(u2Var4.a);
            String str6 = "GOST3412_2015_K";
            u2 u2Var5 = lu61.j5;
            if (equals2) {
                str3 = "GOST3412_2015_M/KEXP_2015_M_EXPORT/NoPadding";
                str5 = "GOST3412_2015_M";
                i = 8;
            } else if (str4.equals(u2Var5.a)) {
                str3 = "GOST3412_2015_K/KEXP_2015_K_EXPORT/NoPadding";
                str5 = "GOST3412_2015_K";
                i = 16;
            } else {
                i = 0;
            }
            try {
                if (!str4.equals(u2Var4.a)) {
                    try {
                        if (!str4.equals(u2Var5.a)) {
                            u2 u2Var6 = (u2) i3Var.A(0);
                            OID oid3 = new OID(((u2) ((i3) i3Var.A(1)).A(0)).a);
                            str3 = u2Var6.q(lu61.h5) ? str3 : "GOST28147/PRO_EXPORT/NoPadding";
                            ivParameterSpec = new IvParameterSpec(bArr4);
                            cryptParamsSpec = CryptParamsSpec.getInstance(oid3);
                            i2 = 2;
                            defaultEncryptionProvider = AdESConfig.getDefaultEncryptionProvider();
                            Cipher cipher = Cipher.getInstance(str3, defaultEncryptionProvider);
                            generatePublic = KeyFactory.getInstance(zyu0Var.a.a.a, AdESConfig.getDefaultDigestSignatureProvider()).generatePublic(new X509EncodedKeySpec(zyu0Var.getEncoded()));
                            try {
                                KeyAgreement keyAgreement = KeyAgreement.getInstance(privateKey.getAlgorithm(), defaultEncryptionProvider);
                                keyAgreement.init(privateKey, ivParameterSpec);
                                keyAgreement.doPhase(generatePublic, true);
                                secretKey5 = keyAgreement.generateSecret(str5);
                                try {
                                    str = xr1Var2.a.a;
                                    asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(xr1Var2.b.toASN1Primitive().getEncoded("DER"));
                                    u2 u2Var7 = lu61.e5;
                                    String str7 = u2Var7.a;
                                    try {
                                        str2 = u2Var7.a;
                                        equals = str.equals(str7);
                                        u2Var = lu61.f5;
                                        u2Var2 = lu61.d5;
                                        z = z2;
                                        u2Var3 = lu61.g5;
                                    } catch (Exception e) {
                                        e = e;
                                        z = z2;
                                        publicKey = generatePublic;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = z2;
                                        publicKey = generatePublic;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    z = z2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = z2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                z = z2;
                                secretKey6 = null;
                                obj = generatePublic;
                                secretKey5 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                z = z2;
                                publicKey = generatePublic;
                                secretKey3 = null;
                                secretKey4 = null;
                            }
                            try {
                                try {
                                    if (!equals) {
                                        try {
                                            if (!str.equals(u2Var2.a) && !str.equals(u2Var3.a) && !str.equals(u2Var.a)) {
                                                Gost28147_89_Parameters gost28147_89_Parameters = new Gost28147_89_Parameters();
                                                gost28147_89_Parameters.decode(asn1BerDecodeBuffer);
                                                asn1BerDecodeBuffer.reset();
                                                bArr2 = gost28147_89_Parameters.iv.value;
                                                oid = new OID(gost28147_89_Parameters.encryptionParamSet.value);
                                                publicKey = generatePublic;
                                                if (!str.equals(str2)) {
                                                    try {
                                                        if (!str.equals(u2Var3.a)) {
                                                            if (!str.equals(u2Var2.a)) {
                                                                if (!str.equals(u2Var.a)) {
                                                                    str6 = null;
                                                                }
                                                            }
                                                            str6 = "GOST3412_2015_M";
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        obj = publicKey;
                                                        secretKey6 = null;
                                                        try {
                                                            throw new EnvelopedException("Input cipher initiation failed", e);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            secretKey3 = secretKey6;
                                                            obj3 = obj;
                                                            secretKey4 = secretKey5;
                                                            obj2 = obj3;
                                                            if (secretKey4 != null) {
                                                                ((SpecKey) secretKey4).clear();
                                                            }
                                                            if (obj2 != null) {
                                                                ((SpecKey) obj2).clear();
                                                            }
                                                            if (z && secretKey3 != null) {
                                                                ((SpecKey) secretKey3).clear();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        publicKey2 = publicKey;
                                                        secretKey4 = secretKey5;
                                                        secretKey3 = null;
                                                        obj2 = publicKey2;
                                                        if (secretKey4 != null) {
                                                        }
                                                        if (obj2 != null) {
                                                        }
                                                        if (z) {
                                                            ((SpecKey) secretKey3).clear();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                cipher.init(4, secretKey5, cryptParamsSpec);
                                                secretKey3 = (SecretKey) cipher.unwrap(bArr, str6, 3);
                                                try {
                                                    if (AdESConfig.isJCP() && z) {
                                                        this.c = SecretKeyFactory.getInstance("LOCAL_CONTEXT", defaultEncryptionProvider).translateKey(secretKey3);
                                                    } else {
                                                        this.c = secretKey3;
                                                    }
                                                    if (!str.equals(str2)) {
                                                        this.b = Cipher.getInstance("GOST3412_2015_K/CTR_ACPKM/NoPadding", defaultEncryptionProvider);
                                                        gostCipherSpec = new G3412ParamsSpec(bArr2, true);
                                                    } else if (str.equals(u2Var2.a)) {
                                                        this.b = Cipher.getInstance("GOST3412_2015_M/CTR_ACPKM/NoPadding", defaultEncryptionProvider);
                                                        gostCipherSpec = new G3412ParamsSpec(bArr2, true);
                                                    } else if (str.equals(u2Var3.a)) {
                                                        this.b = Cipher.getInstance("GOST3412_2015_K/OMAC_CTR/NoPadding", defaultEncryptionProvider);
                                                        gostCipherSpec = new OmacParamsSpec(nr41Var, bArr2, true);
                                                    } else if (str.equals(u2Var.a)) {
                                                        this.b = Cipher.getInstance("GOST3412_2015_M/OMAC_CTR/NoPadding", defaultEncryptionProvider);
                                                        gostCipherSpec = new OmacParamsSpec(nr41Var, bArr2, true);
                                                    } else {
                                                        this.b = Cipher.getInstance("GOST28147/CFB/NoPadding", defaultEncryptionProvider);
                                                        gostCipherSpec = new GostCipherSpec(bArr2, oid);
                                                    }
                                                    ((Cipher) this.b).init(i2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                                    if (secretKey5 != null) {
                                                        ((SpecKey) secretKey5).clear();
                                                    }
                                                    if (publicKey != null) {
                                                        ((SpecKey) publicKey).clear();
                                                    }
                                                    if (z || secretKey3 == null) {
                                                        return;
                                                    }
                                                    ((SpecKey) secretKey3).clear();
                                                    return;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    obj = publicKey;
                                                    secretKey6 = secretKey3;
                                                    throw new EnvelopedException("Input cipher initiation failed", e);
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    obj3 = publicKey;
                                                    secretKey4 = secretKey5;
                                                    obj2 = obj3;
                                                    if (secretKey4 != null) {
                                                    }
                                                    if (obj2 != null) {
                                                    }
                                                    if (z) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            obj = generatePublic;
                                            secretKey6 = null;
                                            throw new EnvelopedException("Input cipher initiation failed", e);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            secretKey4 = secretKey5;
                                            publicKey2 = generatePublic;
                                            secretKey3 = null;
                                            obj2 = publicKey2;
                                            if (secretKey4 != null) {
                                            }
                                            if (obj2 != null) {
                                            }
                                            if (z) {
                                            }
                                            throw th;
                                        }
                                    }
                                    Gost3412_15_Encryption_Parameters gost3412_15_Encryption_Parameters = new Gost3412_15_Encryption_Parameters();
                                    gost3412_15_Encryption_Parameters.decode(asn1BerDecodeBuffer);
                                    asn1BerDecodeBuffer.reset();
                                    bArr2 = gost3412_15_Encryption_Parameters.ukm.value;
                                    if (bArr2.length != (i3 >> 1) + 8) {
                                        oid = new OID(str);
                                        if (!str.equals(str2)) {
                                        }
                                        cipher.init(4, secretKey5, cryptParamsSpec);
                                        secretKey3 = (SecretKey) cipher.unwrap(bArr, str6, 3);
                                        if (AdESConfig.isJCP()) {
                                        }
                                        this.c = secretKey3;
                                        if (!str.equals(str2)) {
                                        }
                                        ((Cipher) this.b).init(i2, (SecretKey) this.c, gostCipherSpec, (SecureRandom) null);
                                        if (secretKey5 != null) {
                                        }
                                        if (publicKey != null) {
                                        }
                                        if (z) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    secretKey7 = null;
                                    secretKey8 = null;
                                    try {
                                        throw new EnvelopedException("Invalid UKM length");
                                    } catch (Exception e7) {
                                        e = e7;
                                        obj = publicKey;
                                        secretKey6 = secretKey8;
                                        throw new EnvelopedException("Input cipher initiation failed", e);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        secretKey4 = secretKey5;
                                        secretKey3 = secretKey7;
                                        obj2 = publicKey;
                                        if (secretKey4 != null) {
                                        }
                                        if (obj2 != null) {
                                        }
                                        if (z) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    secretKey8 = null;
                                    obj = publicKey;
                                    secretKey6 = secretKey8;
                                    throw new EnvelopedException("Input cipher initiation failed", e);
                                } catch (Throwable th9) {
                                    th = th9;
                                    secretKey7 = null;
                                    secretKey4 = secretKey5;
                                    secretKey3 = secretKey7;
                                    obj2 = publicKey;
                                    if (secretKey4 != null) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    if (z) {
                                    }
                                    throw th;
                                }
                                i3 = (!str.equals(str2) || str.equals(u2Var3.a)) ? 16 : 8;
                                publicKey = generatePublic;
                            } catch (Exception e9) {
                                e = e9;
                                publicKey = generatePublic;
                                secretKey8 = null;
                                obj = publicKey;
                                secretKey6 = secretKey8;
                                throw new EnvelopedException("Input cipher initiation failed", e);
                            } catch (Throwable th10) {
                                th = th10;
                                publicKey = generatePublic;
                                secretKey7 = null;
                                secretKey4 = secretKey5;
                                secretKey3 = secretKey7;
                                obj2 = publicKey;
                                if (secretKey4 != null) {
                                }
                                if (obj2 != null) {
                                }
                                if (z) {
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z = z2;
                        secretKey5 = null;
                        secretKey6 = null;
                        obj = null;
                        throw new EnvelopedException("Input cipher initiation failed", e);
                    } catch (Throwable th11) {
                        th = th11;
                        z = z2;
                        secretKey3 = null;
                        obj2 = null;
                        secretKey4 = null;
                        if (secretKey4 != null) {
                        }
                        if (obj2 != null) {
                        }
                        if (z) {
                        }
                        throw th;
                    }
                }
                switch (hashCode) {
                    case -1864865883:
                        break;
                    case -1864863128:
                        break;
                    case 752485737:
                        if (algorithm.equals(JCP.GOST_EL_2012_256_NAME)) {
                            if (!oid2.equals(lu61.n5.toString())) {
                                throw new EnvelopedException("Invalid KEG algorithm");
                            }
                            if (bArr4.length == 32) {
                                throw new InvalidKeyException("Invalid UKM length");
                            }
                            byte[] bArr5 = new byte[16];
                            int i4 = 0;
                            for (int i5 = 16; i4 < i5; i5 = 16) {
                                bArr5[i4] = bArr4[15 - i4];
                                i4++;
                            }
                            IvParameterSpec ivParameterSpec2 = new IvParameterSpec(bArr5);
                            byte[] bArr6 = new byte[i / 2];
                            Array.copy(bArr4, 24, bArr6, 0, i / 2);
                            if (algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                                bArr3 = new byte[8];
                                Array.copy(bArr4, 16, bArr3, 0, 8);
                            } else {
                                bArr3 = null;
                            }
                            cryptParamsSpec = new Kexp15ParamsSpec(bArr6, bArr3);
                            ivParameterSpec = ivParameterSpec2;
                            defaultEncryptionProvider = AdESConfig.getDefaultEncryptionProvider();
                            Cipher cipher2 = Cipher.getInstance(str3, defaultEncryptionProvider);
                            generatePublic = KeyFactory.getInstance(zyu0Var.a.a.a, AdESConfig.getDefaultDigestSignatureProvider()).generatePublic(new X509EncodedKeySpec(zyu0Var.getEncoded()));
                            KeyAgreement keyAgreement2 = KeyAgreement.getInstance(privateKey.getAlgorithm(), defaultEncryptionProvider);
                            keyAgreement2.init(privateKey, ivParameterSpec);
                            keyAgreement2.doPhase(generatePublic, true);
                            secretKey5 = keyAgreement2.generateSecret(str5);
                            str = xr1Var2.a.a;
                            asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(xr1Var2.b.toASN1Primitive().getEncoded("DER"));
                            u2 u2Var72 = lu61.e5;
                            String str72 = u2Var72.a;
                            str2 = u2Var72.a;
                            equals = str.equals(str72);
                            u2Var = lu61.f5;
                            u2Var2 = lu61.d5;
                            z = z2;
                            u2Var3 = lu61.g5;
                            if (!equals) {
                            }
                            if (str.equals(str2)) {
                                break;
                            }
                            publicKey = generatePublic;
                            Gost3412_15_Encryption_Parameters gost3412_15_Encryption_Parameters2 = new Gost3412_15_Encryption_Parameters();
                            gost3412_15_Encryption_Parameters2.decode(asn1BerDecodeBuffer);
                            asn1BerDecodeBuffer.reset();
                            bArr2 = gost3412_15_Encryption_Parameters2.ukm.value;
                            if (bArr2.length != (i3 >> 1) + 8) {
                            }
                        }
                        throw new EnvelopedException("Unsupported KEG algorithm");
                    case 752488492:
                        if (algorithm.equals(JCP.GOST_EL_2012_512_NAME)) {
                            if (!oid2.equals(lu61.o5.toString())) {
                                throw new EnvelopedException("Invalid KEG algorithm");
                            }
                            if (bArr4.length == 32) {
                            }
                        }
                        throw new EnvelopedException("Unsupported KEG algorithm");
                    default:
                        throw new EnvelopedException("Unsupported KEG algorithm");
                }
            } catch (Exception e11) {
                e = e11;
                secretKey2 = r6;
                secretKey5 = secretKey2;
                obj = secretKey5;
                secretKey6 = secretKey2;
                throw new EnvelopedException("Input cipher initiation failed", e);
            } catch (Throwable th12) {
                th = th12;
                secretKey = r6;
                secretKey3 = secretKey;
                secretKey4 = secretKey3;
                obj2 = secretKey;
                if (secretKey4 != null) {
                }
                if (obj2 != null) {
                }
                if (z) {
                }
                throw th;
            }
            Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(i3Var.getEncoded());
            GostR3410_12_KEG_Parameters gostR3410_12_KEG_Parameters = new GostR3410_12_KEG_Parameters();
            gostR3410_12_KEG_Parameters.decode(asn1BerDecodeBuffer2);
            asn1BerDecodeBuffer2.reset();
            oid2 = new OID(gostR3410_12_KEG_Parameters.algorithm.value).toString();
            algorithm = privateKey.getAlgorithm();
            hashCode = algorithm.hashCode();
            i2 = 2;
            r6 = JCP.GOST_EL_2012_256_NAME;
        } catch (Exception e12) {
            e = e12;
            z = z2;
            secretKey2 = null;
        } catch (Throwable th13) {
            th = th13;
            z = z2;
            secretKey = null;
        }
    }

    @Override // defpackage.e381, defpackage.jm71
    /* renamed from: a */
    public void mo24a() {
        List<fy71> J0;
        boolean isEmpty;
        switch (this.a) {
            case 11:
                vi71 vi71Var = (vi71) this.b;
                if (vi71Var != null) {
                    synchronized (vi71Var.c) {
                        J0 = a.J0((ArrayList) vi71Var.w);
                        ((ArrayList) vi71Var.w).clear();
                    }
                    for (fy71 fy71Var : J0) {
                        of71 of71Var = (of71) vi71Var.b;
                        synchronized (of71Var.a) {
                            qo61 qo61Var = of71Var.d;
                            synchronized (qo61Var.a) {
                                qo61Var.b.remove(fy71Var);
                            }
                            qo61 qo61Var2 = of71Var.d;
                            synchronized (qo61Var2.a) {
                                isEmpty = qo61Var2.b.isEmpty();
                            }
                            if (isEmpty) {
                                ((ys81) of71Var.c.w).getClass();
                                ys81.a("om_sdk_js_request_tag");
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                gi61 gi61Var = (gi61) this.b;
                rt71 rt71Var = (rt71) this.c;
                gr81 gr81Var = gi61Var.a;
                if (gr81Var != null) {
                    ((Handler) gr81Var.c).post(new v191(gr81Var, rt71Var));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.fh81
    public long b(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        if (i < 0) {
            w511.q();
            return 0L;
        }
        if (i < arrayList.size()) {
            return ((Long) arrayList.get(i)).longValue();
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.l8q0
    public int c(int i) {
        do {
            i = ((yi6) this.c).t(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.fh81
    public List d(long j) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        Long valueOf = Long.valueOf(j);
        int i2 = rf71.a;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) arrayList.get(i3)).compareTo(valueOf) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i = binarySearch;
        }
        return i == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(i);
    }

    @Override // defpackage.l8q0
    public int e(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((yi6) this.c).s(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.l8q0
    public int f(int i) {
        do {
            i = ((yi6) this.c).t(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.l8q0
    public int g(int i) {
        do {
            i = ((yi6) this.c).s(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    public w97 h(String str, zy2 zy2Var) {
        String str2;
        String str3;
        String str4;
        int i;
        bs81 bs81Var;
        Boolean j0;
        Boolean j02;
        XmlPullParser newPullParser = Xml.newPullParser();
        boolean z = false;
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        ((xf81) this.b).getClass();
        int i2 = 2;
        String str5 = null;
        newPullParser.require(2, null, "VAST");
        rr41 rr41Var = (rr41) this.c;
        xf81 xf81Var = (xf81) rr41Var.b;
        xf81Var.getClass();
        String attributeValue = newPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            xf81Var.getClass();
            int i3 = 3;
            if (newPullParser.next() == 3) {
                break;
            }
            if (newPullParser.getEventType() == i2) {
                if ("Ad".equals(newPullParser.getName())) {
                    vmn0 vmn0Var = (vmn0) rr41Var.c;
                    mu71 mu71Var = (mu71) vmn0Var.x;
                    Context context = (Context) vmn0Var.y;
                    xf81 xf81Var2 = (xf81) vmn0Var.a;
                    xf81 xf81Var3 = mu71Var.a;
                    newPullParser.require(i2, str5, "Ad");
                    String attributeValue2 = newPullParser.getAttributeValue(str5, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = str5;
                    }
                    xf81 xf81Var4 = ((w291) vmn0Var.w).a;
                    newPullParser.require(i2, str5, "Ad");
                    Integer b = mga1.b(newPullParser.getAttributeValue(str5, "sequence"));
                    Integer num = b;
                    if (b != null) {
                        int intValue = b.intValue();
                        num = b;
                        if (intValue < 0) {
                            num = str5;
                        }
                    }
                    xf81Var2.getClass();
                    newPullParser.require(i2, str5, "Ad");
                    while (true) {
                        str3 = str5;
                        while (newPullParser.next() != i3) {
                            if (newPullParser.getEventType() == i2) {
                                String name = newPullParser.getName();
                                if ("InLine".equals(name)) {
                                    qo81 qo81Var = new qo81(context, z);
                                    qo81Var.k = attributeValue2;
                                    qo81Var.j = num;
                                    cf71 cf71Var = (cf71) vmn0Var.b;
                                    Object obj = cf71Var.c;
                                    newPullParser.require(i2, str5, "InLine");
                                    while (newPullParser.next() != 3) {
                                        if (newPullParser.getEventType() == i2) {
                                            ((hlx0) cf71Var.b).f(newPullParser, qo81Var, zy2Var);
                                        }
                                    }
                                    bs81Var = qo81Var.a();
                                    if (bs81Var.b.isEmpty()) {
                                        break;
                                    }
                                    z = false;
                                    i3 = 3;
                                    str3 = bs81Var;
                                } else if ("Wrapper".equals(name)) {
                                    qo81 qo81Var2 = new qo81(context, true);
                                    qo81Var2.k = attributeValue2;
                                    qo81Var2.j = num;
                                    vi71 vi71Var = (vi71) vmn0Var.c;
                                    xf81 xf81Var5 = (xf81) vi71Var.b;
                                    xf81Var5.getClass();
                                    newPullParser.require(i2, str5, "Wrapper");
                                    ((it71) vi71Var.w).getClass();
                                    String attributeValue3 = newPullParser.getAttributeValue(str5, "allowMultipleAds");
                                    boolean booleanValue = (attributeValue3 == null || (j02 = evu0.j0(attributeValue3.toLowerCase(Locale.ROOT))) == null) ? false : j02.booleanValue();
                                    String attributeValue4 = newPullParser.getAttributeValue(str5, "followAdditionalWrappers");
                                    str4 = str5;
                                    qo81Var2.c = new zy2(booleanValue, (attributeValue4 == null || (j0 = evu0.j0(attributeValue4.toLowerCase(Locale.ROOT))) == null) ? true : j0.booleanValue());
                                    while (true) {
                                        xf81Var5.getClass();
                                        if (newPullParser.next() == 3) {
                                            break;
                                        }
                                        if (newPullParser.getEventType() == 2) {
                                            if ("VASTAdTagURI".equals(newPullParser.getName())) {
                                                qo81Var2.h = xf81.a(newPullParser);
                                            } else {
                                                ((hlx0) vi71Var.c).f(newPullParser, qo81Var2, zy2Var);
                                            }
                                        }
                                    }
                                    i = 2;
                                    bs81Var = qo81Var2.a();
                                } else {
                                    str4 = str5;
                                    i = i2;
                                    xf81.b(newPullParser);
                                    bs81Var = str3;
                                }
                            } else {
                                str4 = str5;
                                i = i2;
                                bs81Var = str3;
                            }
                            i2 = i;
                            str5 = str4;
                            z = false;
                            i3 = 3;
                            str3 = bs81Var;
                        }
                        z = false;
                        i3 = 3;
                    }
                    str2 = str5;
                    int i4 = i2;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                    i2 = i4;
                } else {
                    str2 = str5;
                    xf81.b(newPullParser);
                }
                str5 = str2;
                z = false;
            }
        }
        return (attributeValue == null || attributeValue.length() == 0) ? str5 : new w97(arrayList);
    }

    public com.monetization.ads.mediation.base.a i(Context context, zp1 zp1Var, Class cls) {
        com.monetization.ads.mediation.base.a aVar = null;
        try {
            String str = zp1Var.b;
            ((t981) this.c).getClass();
            Object c = sia1.c(str, new Object[0]);
            com.monetization.ads.mediation.base.a aVar2 = (com.monetization.ads.mediation.base.a) cls.cast(c);
            if (aVar2 == null) {
                try {
                    m(context, zp1Var, c == null ? String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str}, 1)) : String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{c.getClass().getName(), cls.getName()}, 2)));
                } catch (ClassCastException e) {
                    e = e;
                    aVar = aVar2;
                    o(context, zp1Var, "does_not_conform_to_protocol", e);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    o(context, zp1Var, "could_not_create_adapter", th);
                    return aVar;
                }
            }
            return aVar2;
        } catch (ClassCastException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        z4m0 z4m0Var = (z4m0) this.c;
        String str = (String) this.b;
        lo71 lo71Var = (lo71) ((HashMap) z4m0Var.w).remove(str);
        if (lo71Var != null) {
            lo71Var.c = jk3Var;
            ((HashMap) z4m0Var.x).put(str, lo71Var);
            if (((h3s0) z4m0Var.z) == null) {
                h3s0 h3s0Var = new h3s0(14, z4m0Var);
                z4m0Var.z = h3s0Var;
                ((Handler) z4m0Var.y).postDelayed(h3s0Var, 100L);
            }
        }
    }

    public t681 k(Context context, tg81 tg81Var, v881 v881Var, vi71 vi71Var, ck61 ck61Var, nr41 nr41Var, se71 se71Var) {
        if (se71Var == null) {
            return null;
        }
        lu71 lu71Var = (lu71) this.b;
        bo2 bo2Var = se71Var.a;
        lu71Var.getClass();
        int ordinal = bo2Var.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
            w511.b();
            return null;
        }
        uj61 uj61Var = ck61Var.c;
        cf71 cf71Var = new cf71(se71Var);
        o381 o381Var = new o381();
        yg61 yg61Var = (yg61) vi71Var.b;
        List list = se71Var.i;
        List list2 = tg81Var.a.g;
        yg61Var.getClass();
        ArrayList a = yg61.a(list, list2);
        yg61 yg61Var2 = (yg61) vi71Var.b;
        List list3 = se71Var.h;
        List list4 = tg81Var.a.c;
        yg61Var2.getClass();
        return new t681(context, se71Var, new z4m0(context, se71Var, v881Var, cf71Var), v881Var, ((ph71) this.c).a(context, tg81Var, new hlx0(se71Var.b, a, yg61.a(list3, list4), se71Var.c, se71Var.g, se71Var.j), cf71Var, ck61Var, o381Var, se71Var, p9.b), nr41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Context context, xz xzVar, np61 np61Var, Long l) {
        v981 v981Var = (v981) this.c;
        Map f = b.f();
        if (!ym11.h(f)) {
            f = null;
        }
        if (f == null) {
            f = new LinkedHashMap();
        }
        String str = StringUtils.UNDEFINED;
        if (xzVar == null) {
            f.put("ad_type", StringUtils.UNDEFINED);
        } else {
            f.put("ad_type", xzVar);
        }
        if (l == null) {
            f.put("duration", StringUtils.UNDEFINED);
        } else {
            f.put("duration", l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = np61Var.a;
        ql81 ql81Var = np61Var.d;
        linkedHashMap.put("adapter", str2);
        nm71 nm71Var = np61Var.b;
        if (nm71Var != null) {
            linkedHashMap.put("winner_name", nm71Var.a);
            linkedHashMap.put("winner_ad_unit", nm71Var.b);
        }
        linkedHashMap.put(ACSPConstants.STATUS, ql81Var.a.name().toLowerCase(Locale.ROOT));
        Integer num = ql81Var.c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        if (ql81Var.a == yf2.d) {
            String str3 = ql81Var.b;
            if (str3 != null) {
                if (evu0.J(str3)) {
                    str3 = null;
                }
            }
            str3 = "Unknown error";
            linkedHashMap.put("error_message", str3);
        }
        f.putAll(linkedHashMap);
        String str4 = (String) linkedHashMap.get("adapter");
        yi61 yi61Var = new yi61();
        pf71 pf71Var = new pf71();
        fe81 fe81Var = (fe81) this.b;
        hn71 b = yi61Var.b(fe81Var, null);
        hn71 a = pf71Var.a(fe81Var.e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!ym11.h(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        int i = fe81Var.n;
        if (i == 1) {
            str = "portrait";
        } else if (i == 2) {
            str = "landscape";
        }
        linkedHashMap2.put("orientation", str);
        hn71 a2 = fga1.a(b, a);
        no61 no61Var = (no61) a2.c;
        if (no61Var == null) {
            no61Var = null;
        }
        LinkedHashMap n = b.n((Map) a2.b, linkedHashMap2);
        if (!ym11.h(n)) {
            n = null;
        }
        if (n == null) {
            n = new LinkedHashMap();
        }
        LinkedHashMap n2 = b.n(f, n);
        if (!ym11.h(n2)) {
            n2 = null;
        }
        if (n2 == null) {
            n2 = new LinkedHashMap();
        }
        hm2 hm2Var = hm2.B;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(n2);
        zj71 zj71Var = new zj71("client_bidding_loading_result", linkedHashMap3, no61Var);
        v981Var.getClass();
        wfa1.b(context, new m771(((n291) v981Var).a)).c(zj71Var);
        new mj31(context, 19).t(hm2Var, linkedHashMap3, str4, null);
    }

    public void m(Context context, zp1 zp1Var, String str) {
        Map i = b.i(new Pair(CRLReasonCodeExtension.REASON, "could_not_create_adapter"), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str));
        z581 z581Var = (z581) this.b;
        z581Var.getClass();
        z581Var.a(context, hm2.e, zp1Var, null, i);
    }

    @Override // defpackage.kyv
    public InputStream n(InputStream inputStream) {
        return new js61(this, inputStream, (Cipher) this.b, 0);
    }

    public void o(Context context, zp1 zp1Var, String str, Throwable th) {
        LinkedHashMap l = b.l(new Pair(CRLReasonCodeExtension.REASON, str));
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        l.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, th.getClass().getName() + " " + message);
        ((z581) this.b).a(context, hm2.e, zp1Var, null, l);
    }

    public void p(ArrayList arrayList, hm2 hm2Var) {
        hn71 e = ((hlx0) this.c).e();
        e.r(arrayList, "assets");
        Map map = (Map) e.b;
        ((ge71) this.b).c(new zj71(hm2Var.b, new LinkedHashMap(map), (no61) e.c));
    }

    public Deeplink$WebViewFormat q(Deeplink$WebViewFormat deeplink$WebViewFormat) {
        LinkedList linkedList = (LinkedList) this.c;
        if (deeplink$WebViewFormat == null && (deeplink$WebViewFormat = (Deeplink$WebViewFormat) a.b0(linkedList)) == null) {
            deeplink$WebViewFormat = (Deeplink$WebViewFormat) this.b;
        }
        linkedList.add(deeplink$WebViewFormat);
        return deeplink$WebViewFormat;
    }

    public void s(String str, String str2) {
        ((x22) this.b).reportEvent("yadisk_upload_flow_error", b.i(new Pair("messageId", str), new Pair(CRLReasonCodeExtension.REASON, str2)));
    }

    public void t(boolean z, boolean z2) {
        if (z && ((WifiManager.WifiLock) this.c) == null) {
            WifiManager wifiManager = (WifiManager) ((Context) this.b).getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
            if (wifiManager == null) {
                lk91.j("WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.c = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.c;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache.CacheVisitor
    public void visit(Map map) {
        this.b = new Vector(map.size());
        for (vt61 vt61Var : map.keySet()) {
            SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) map.get(vt61Var);
            if (sSLSessionImpl != null && !sSLSessionImpl.c(((SSLSessionContextImpl) this.c).d)) {
                ((Vector) this.b).addElement((byte[]) vt61Var.a.clone());
            }
        }
    }

    @Override // defpackage.fh81
    public int a(long j) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        Long valueOf = Long.valueOf(j);
        int i2 = rf71.a;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < arrayList.size()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.fh81
    public int a() {
        return ((ArrayList) this.c).size();
    }

    public /* synthetic */ rr41(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public rr41(SSLSessionContextImpl sSLSessionContextImpl) {
        this.a = 9;
        this.c = sSLSessionContextImpl;
        this.b = null;
    }

    public rr41(z4m0 z4m0Var, String str) {
        this.a = 25;
        this.c = z4m0Var;
        this.b = str;
    }

    public rr41(Context context, ge71 ge71Var, int i) {
        this.a = i;
        switch (i) {
            case 19:
                xf81 xf81Var = new xf81();
                rr41 rr41Var = new rr41(context, ge71Var, 15);
                this.b = xf81Var;
                this.c = rr41Var;
                break;
            default:
                xf81 xf81Var2 = new xf81();
                vmn0 vmn0Var = new vmn0(context, ge71Var, 15);
                this.b = xf81Var2;
                this.c = vmn0Var;
                break;
        }
    }

    public rr41(Context context, cf71 cf71Var) {
        this.a = 23;
        this.b = new hn71(cf71Var, (byte) 0);
        this.c = context.getApplicationContext();
    }

    public rr41(Context context, qn71 qn71Var) {
        this.a = 11;
        vi71 vi71Var = qn71Var.a.a(context) ? new vi71(context) : null;
        cl61 cl61Var = new cl61();
        this.b = vi71Var;
        this.c = cl61Var;
    }

    public rr41(Context context, v981 v981Var, ji41 ji41Var, xz xzVar, String str) {
        this.a = 28;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        hlx0 hlx0Var = new hlx0(ji41Var, xzVar, str);
        this.b = b;
        this.c = hlx0Var;
    }

    public rr41(Context context, v981 v981Var, ip71 ip71Var) {
        this.a = 24;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        this.b = ip71Var;
        this.c = b;
    }

    public rr41(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var) {
        ya71 ya71Var;
        this.a = 26;
        this.b = new s421(context.getApplicationContext(), fe81Var, v981Var, d881Var);
        ya71 ya71Var2 = ya71.c;
        if (ya71Var2 == null) {
            synchronized (ya71.b) {
                ya71Var = ya71.c;
                if (ya71Var == null) {
                    ya71Var = new ya71();
                    ya71.c = ya71Var;
                }
            }
            ya71Var2 = ya71Var;
        }
        this.c = new i971(2, ya71Var2);
    }

    public rr41(Context context, fe81 fe81Var, v981 v981Var, tp0 tp0Var) {
        this.a = 5;
        pb81 pb81Var = new pb81(context, fe81Var, v981Var);
        this.b = tp0Var;
        this.c = pb81Var;
    }

    public rr41(File file) {
        this.a = 18;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public rr41(eq71 eq71Var) {
        this.a = 17;
        bc71 bc71Var = new bc71(eq71Var);
        this.b = eq71Var;
        this.c = bc71Var;
    }

    public rr41(z581 z581Var) {
        this.a = 27;
        t981 t981Var = new t981();
        this.b = z581Var;
        this.c = t981Var;
    }

    public rr41(v981 v981Var) {
        this.a = 6;
        lu71 lu71Var = new lu71();
        ph71 ph71Var = new ph71(v981Var);
        this.b = lu71Var;
        this.c = ph71Var;
    }

    public rr41(gv gvVar, gi61 gi61Var) {
        this.a = 16;
        rt71 rt71Var = new rt71(gvVar.b, gvVar.c);
        this.b = gi61Var;
        this.c = rt71Var;
    }

    public rr41(Deeplink$WebViewFormat deeplink$WebViewFormat) {
        this.a = 0;
        this.b = deeplink$WebViewFormat;
        this.c = new LinkedList();
    }

    public rr41(x22 x22Var) {
        this.a = 3;
        this.b = x22Var;
        this.c = new HashMap();
    }

    public rr41(Context context, int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new gg71(context);
                py71 py71Var = a281.b;
                this.c = (py71Var == null ? a281.a : py71Var).a(context);
                break;
            case 13:
                new oq81();
                SharedPreferences a = oq81.a(context, "ViewSizeInfoStorage");
                km61 km61Var = new km61();
                this.b = a;
                this.c = km61Var;
                break;
            default:
                this.b = context;
                break;
        }
    }
}
