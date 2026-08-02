package ru.CryptoPro.JCP.Key;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.c6a1;
import defpackage.l4f0;
import defpackage.wu61;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.PrivateKeyTimeValidityControlMode;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.Random.RandomRefuseException;
import ru.CryptoPro.JCP.Sign.GostSignature;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.Sign.a;
import ru.CryptoPro.JCP.Util.PublicKeyConvertor;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticPoint;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.PKUPDecoder;
import ru.CryptoPro.JCP.tools.SelfTesterException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes4.dex */
public class PrivateKeySpec implements PrivateKeyInterface {
    public boolean A;
    public wu61 B;
    public final PublicKey C;
    public AlgIdInterface a;
    public final RandomInterface b;
    public boolean c;
    public boolean w;
    public final LinkedList x;
    public final boolean y;
    public boolean z;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (ru.CryptoPro.JCP.tools.PKUPDecoder.decodeExtension(r12, r14) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if (ru.CryptoPro.JCP.tools.PKUPDecoder.decodeExtension(r11, r3) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (ru.CryptoPro.JCP.tools.PKUPDecoder.decodeExtension(r12, r14) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrivateKeySpec(wu61 wu61Var, CPRandom cPRandom, AlgIdInterface algIdInterface, byte[] bArr, boolean z, boolean z2, boolean z3, CPKeyContainer cPKeyContainer, boolean z4) {
        Certificate certificate;
        PrivateKeyTimeValidityControlMode privateKeyTimeValidityControlMode;
        int i;
        PrivateKeyUsagePeriod privateKeyUsagePeriod;
        PrivateKeyUsagePeriod privateKeyUsagePeriod2;
        int compareTo;
        this.a = null;
        this.b = null;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        this.c = true;
        int i2 = 0;
        this.w = false;
        this.x = new LinkedList();
        this.y = true;
        this.z = true;
        this.c = z;
        this.A = z2;
        this.w = z3;
        Extension[] extensions = cPKeyContainer.getExtensions();
        if (extensions != null && extensions.length > 0) {
            for (Extension extension : extensions) {
                addExtension(extension);
            }
        }
        try {
            certificate = z4 ? cPKeyContainer.getExchangeCertificate() : cPKeyContainer.getSignatureCertificate();
        } catch (Exception unused) {
            certificate = null;
        }
        if (InternalGostPrivateKey.isCheckOfPKUPEnabled()) {
            Extension extension2 = getExtension(z4 ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_key_usage_period) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_key_usage_period));
            Extension extension3 = getExtension(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_key_time_validity_control_mode));
            if (extension3 != null) {
                privateKeyTimeValidityControlMode = new PrivateKeyTimeValidityControlMode();
            }
            privateKeyTimeValidityControlMode = null;
            if (privateKeyTimeValidityControlMode != null) {
                if (privateKeyTimeValidityControlMode.value.length == 0 || !(privateKeyTimeValidityControlMode.isSet(1) || privateKeyTimeValidityControlMode.isSet(0))) {
                    i = 0;
                } else if (!privateKeyTimeValidityControlMode.isSet(1)) {
                    i = 15;
                } else if (!privateKeyTimeValidityControlMode.isSet(0)) {
                    i = PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                }
                if (i != 0) {
                    JCPLogger.fine("Private key usage period validation mode: disabled.");
                } else {
                    JCPLogger.fine("Private key usage period validation mode: " + i);
                    if ((i & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) != 0 && extension2 != null) {
                        privateKeyUsagePeriod = new PrivateKeyUsagePeriod();
                    }
                    privateKeyUsagePeriod = null;
                    l4f0 l4f0Var = new l4f0(z5 ? 1 : 0);
                    l4f0Var.c(privateKeyUsagePeriod);
                    if ((15 & i) != 0 && certificate != null && (r12 = PKUPDecoder.getPrivateKeyUsagePeriodFromCertificate(certificate)) != null) {
                        privateKeyUsagePeriod2 = new PrivateKeyUsagePeriod();
                    }
                    privateKeyUsagePeriod2 = null;
                    l4f0 l4f0Var2 = new l4f0(i2);
                    l4f0Var2.c(privateKeyUsagePeriod2);
                    Date date = (Date) l4f0Var.a;
                    Date date2 = (Date) l4f0Var2.a;
                    if (date == null || date2 == null ? date == null : date.compareTo(date2) < 0) {
                        date = date2;
                    }
                    Date date3 = (Date) l4f0Var.b;
                    Date date4 = (Date) l4f0Var2.b;
                    if (date3 == null || date4 == null ? date3 == null : (compareTo = date3.compareTo(date4)) >= 0 && compareTo > 0) {
                        date3 = date4;
                    }
                    if (date3 != null || date != null) {
                        Date time = Calendar.getInstance().getTime();
                        Object[] objArr = date3 == null || !time.after(date3);
                        Object[] objArr2 = date == null || !time.before(date);
                        if (objArr == false || objArr2 == false) {
                            z5 = false;
                        }
                    }
                }
                this.y = z5;
            }
            i = 255;
            if (i != 0) {
            }
            this.y = z5;
        }
        this.b = cPRandom;
        this.a = algIdInterface;
        this.B = wu61Var;
        this.C = certificate != null ? certificate.getPublicKey() : null;
        if (!checkFP(bArr, cPKeyContainer.isNewContVersion() ? bArr.length : 8)) {
            throw new UnrecoverableKeyException("Incorrect fp");
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static void a(ru.CryptoPro.JCP.KeyStore.CPKeyContainer r21, char[] r22, int r23, ru.CryptoPro.JCP.Key.PrivateKeyInterface[] r24) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.CryptoPro.JCP.Key.PrivateKeySpec.a(ru.CryptoPro.JCP.KeyStore.CPKeyContainer, char[], int, ru.CryptoPro.JCP.Key.PrivateKeyInterface[]):void");
    }

    public static void b(CPKeyContainer cPKeyContainer, char[] cArr, PrivateKeyInterface[] privateKeyInterfaceArr, int i) {
        byte[] bArr = new byte[cPKeyContainer.isLongGost2012(null) ? 64 : 32];
        byte[] bArr2 = new byte[12];
        try {
            PrivateKeySpec privateKeySpec = (PrivateKeySpec) privateKeyInterfaceArr[0];
            PrivateKeySpec privateKeySpec2 = (PrivateKeySpec) privateKeyInterfaceArr[1];
            privateKeySpec.c(bArr, bArr2, privateKeySpec2);
            cPKeyContainer.writeSpec(privateKeySpec.B, bArr, bArr2, privateKeyInterfaceArr[1] != null ? privateKeySpec2.B : null, cArr, i);
        } finally {
            Array.clear(bArr);
            Array.clear(bArr2);
        }
    }

    public static SignValue createSignature(int[] iArr, int i, int[] iArr2, int i2, ParamsInterface paramsInterface, BigIntr bigIntr, byte[] bArr, BigIntr bigIntr2) throws SignatureException, InvalidKeyException {
        SignValue makeSignature = makeSignature(iArr, i, iArr2, i2, paramsInterface, bigIntr, bArr, bigIntr2);
        if (!(((AlgIdInterface) paramsInterface).getSignParams() instanceof EllipticParamsInterface)) {
            throw new SignatureException(a.resource.getString("InvParams"));
        }
        SelfTester_JCP.check(1364);
        return makeSignature;
    }

    public static void firstSaveSpec(CPKeyContainer cPKeyContainer, char[] cArr, PrivateKeyInterface[] privateKeyInterfaceArr, int i, boolean z) throws IOException, KeyException, KeyStoreException {
        PrivateKeyInterface privateKeyInterface;
        if (!z && (!privateKeyInterfaceArr[0].isExportable() || (privateKeyInterfaceArr.length > 1 && (privateKeyInterface = privateKeyInterfaceArr[1]) != null && !privateKeyInterface.isExportable()))) {
            throw new KeyIsNotExportableException(InternalGostPrivateKey.resource.getString("KeyIsNotExportable"));
        }
        if (i == 1) {
            b(cPKeyContainer, cArr, privateKeyInterfaceArr, 1);
        }
        b(cPKeyContainer, cArr, privateKeyInterfaceArr, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SignValue makeSignature(int[] iArr, int i, int[] iArr2, int i2, ParamsInterface paramsInterface, BigIntr bigIntr, byte[] bArr, BigIntr bigIntr2) throws SignatureException, InvalidKeyException {
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        BigIntr bigIntr5;
        int intLength = bigIntr.getIntLength();
        GostSignature gostSignature = new GostSignature(intLength << 1);
        if (!gostSignature.r.isZero() || !gostSignature.s.isZero()) {
            throw new SignatureException(a.resource.getString("AlreadySigned"));
        }
        BigIntr bigIntr6 = null;
        if (paramsInterface != null) {
            try {
                if (paramsInterface instanceof AlgIdInterface) {
                    ParamsInterface signParams = ((AlgIdInterface) paramsInterface).getSignParams();
                    if (!(signParams instanceof EllipticParamsInterface)) {
                        throw new SignatureException(a.resource.getString("InvParams"));
                    }
                    if (bigIntr.isZero()) {
                        throw new SignatureException(a.resource.getString("NeedGenK"));
                    }
                    EllipticParamsInterface ellipticParamsInterface = (EllipticParamsInterface) signParams;
                    BigIntr q = ellipticParamsInterface.getQ();
                    BigIntr bigIntr7 = new BigIntr(iArr2, i2, intLength);
                    try {
                        bigIntr4 = bigIntr7.euclidInverse(q);
                    } catch (Throwable th) {
                        th = th;
                        bigIntr3 = null;
                        bigIntr4 = null;
                        bigIntr5 = null;
                    }
                    try {
                        bigIntr7.clear();
                        BigIntr mulCSP = bigIntr.mulCSP(bigIntr4, q);
                        try {
                            EllipticPoint powerTAB = ellipticParamsInterface.getP().powerTAB(mulCSP, true);
                            mulCSP.clear();
                            BigIntr x = powerTAB.getX();
                            BigIntr modCSP = x.modCSP(q);
                            gostSignature.r = modCSP;
                            if (modCSP.isZero()) {
                                throw new SignatureException(a.resource.getString("NeedGenK"));
                            }
                            x.clear();
                            BigIntr bigIntr8 = new BigIntr(bArr);
                            if (bigIntr8.modCSP(q).isZero()) {
                                bigIntr8 = new BigIntr(BigIntr.ONE, intLength);
                            }
                            mulCSP = bigIntr8.mulCSP(bigIntr, q);
                            bigIntr5 = new BigIntr(iArr, i, intLength);
                            try {
                                BigIntr mulCSP2 = gostSignature.r.mulCSP(bigIntr5, q);
                                gostSignature.s = mulCSP.addCSP(mulCSP2, q);
                                mulCSP2.clear();
                                BigIntr bigIntr9 = gostSignature.s;
                                BigIntr mulCSP3 = bigIntr9.mulCSP(bigIntr4, q);
                                gostSignature.s = mulCSP3;
                                if (mulCSP3.isZero()) {
                                    throw new SignatureException(a.resource.getString("NeedGenK"));
                                }
                                if (bigIntr2 != null) {
                                    bigIntr2.setMag(bigIntr4);
                                }
                                mulCSP.clear();
                                bigIntr9.clear();
                                bigIntr5.clear();
                                if (bigIntr4 != null) {
                                    bigIntr4.clear();
                                }
                                return gostSignature;
                            } catch (Throwable th2) {
                                th = th2;
                                bigIntr3 = null;
                                bigIntr6 = mulCSP;
                                if (bigIntr6 != null) {
                                    bigIntr6.clear();
                                }
                                if (bigIntr3 != null) {
                                    bigIntr3.clear();
                                }
                                if (bigIntr5 != null) {
                                    bigIntr5.clear();
                                }
                                if (bigIntr4 != null) {
                                    bigIntr4.clear();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bigIntr3 = null;
                            bigIntr5 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bigIntr3 = null;
                        bigIntr5 = null;
                        bigIntr6 = bigIntr7;
                        if (bigIntr6 != null) {
                        }
                        if (bigIntr3 != null) {
                        }
                        if (bigIntr5 != null) {
                        }
                        if (bigIntr4 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                bigIntr3 = null;
                bigIntr4 = null;
                bigIntr5 = null;
            }
        }
        throw new SignatureException(a.resource.getString("InvParams"));
    }

    public static void read(CPKeyContainer cPKeyContainer, char[] cArr, PrivateKeyInterface[] privateKeyInterfaceArr) throws UnrecoverableKeyException, KeyException {
        UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException();
        UnrecoverableKeyException unrecoverableKeyException2 = null;
        int i = -1;
        for (int i2 = 0; i2 <= 1 && i < 0; i2++) {
            try {
                a(cPKeyContainer, cArr, i2, privateKeyInterfaceArr);
                i = i2;
            } catch (IOException e) {
                if (unrecoverableKeyException2 == null) {
                    unrecoverableKeyException.initCause(e);
                    unrecoverableKeyException2 = unrecoverableKeyException;
                }
            } catch (UnrecoverableKeyException e2) {
                if (unrecoverableKeyException2 == null) {
                    unrecoverableKeyException2 = e2;
                }
            }
        }
        if (i < 0) {
            throw unrecoverableKeyException2;
        }
        if (i == 1) {
            try {
                b(cPKeyContainer, cArr, privateKeyInterfaceArr, 1);
            } catch (IOException e3) {
                UnrecoverableKeyException unrecoverableKeyException3 = new UnrecoverableKeyException();
                unrecoverableKeyException3.initCause(e3);
                throw unrecoverableKeyException3;
            } catch (KeyStoreException e4) {
                UnrecoverableKeyException unrecoverableKeyException4 = new UnrecoverableKeyException();
                unrecoverableKeyException4.initCause(e4);
                throw unrecoverableKeyException4;
            }
        }
        b(cPKeyContainer, cArr, privateKeyInterfaceArr, 0);
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void addExtension(Extension extension) {
        LinkedList linkedList = this.x;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((Extension) it.next()).extnID.equals(extension.extnID)) {
                return;
            }
        }
        linkedList.add(extension);
    }

    public final void c(byte[] bArr, byte[] bArr2, PrivateKeySpec privateKeySpec) {
        int length = bArr.length + 12;
        byte[] bArr3 = new byte[length];
        int length2 = bArr.length >> 2;
        int[] iArr = new int[length2];
        boolean z = false;
        while (!z) {
            this.b.makeRandom(bArr3, 0, length);
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            Array.toIntArray(iArr, bArr);
            if (c6a1.c(0, length2, length2, ((EllipticParamsInterface) this.a.getSignParams()).getQ().getMagWithoutCopy(), iArr) > 0) {
                z = true;
            }
        }
        System.arraycopy(bArr3, bArr.length, bArr2, 0, 12);
        try {
            this.B.m(bArr);
            if (privateKeySpec != null) {
                privateKeySpec.B.m(bArr);
            }
        } finally {
            Array.clear(bArr3);
            Array.clear(iArr);
        }
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean checkFP(byte[] bArr, int i) throws InvalidKeyException {
        byte[] encode = d().encode();
        return (encode == null || bArr == null || !Array.compare(bArr, encode, i)) ? false : true;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        wu61 wu61Var = this.B;
        if (wu61Var != null) {
            wu61Var.w();
        }
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        PrivateKeySpec privateKeySpec = (PrivateKeySpec) super.clone();
        try {
            privateKeySpec.B = this.B.a(this.b);
            return privateKeySpec;
        } catch (InvalidKeyException e) {
            CloneNotSupportedException cloneNotSupportedException = new CloneNotSupportedException(e.getMessage());
            cloneNotSupportedException.initCause(e);
            throw cloneNotSupportedException;
        } catch (KeyManagementException e2) {
            CloneNotSupportedException cloneNotSupportedException2 = new CloneNotSupportedException(e2.getMessage());
            cloneNotSupportedException2.initCause(e2);
            throw cloneNotSupportedException2;
        }
    }

    public final PublicKeySpec d() {
        RandomInterface randomInterface = this.b;
        if (this.a.getSignParams() == null) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!(this.a.getSignParams() instanceof EllipticParamsInterface)) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
        }
        try {
            AlgIdInterface algIdInterface = this.a;
            if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
                algIdInterface = new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_256, this.a.getSignParams(), this.a.getDigestParams(), this.a.getCryptParams());
            } else if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                algIdInterface = new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_512, this.a.getSignParams(), this.a.getDigestParams(), this.a.getCryptParams());
            }
            this.B.C();
            try {
                PublicKeySpec publicKeySpec = new PublicKeySpec(this.B.c(((EllipticParamsInterface) algIdInterface.getSignParams()).getP(), randomInterface), algIdInterface, true);
                this.B.A(randomInterface);
                return publicKeySpec;
            } catch (InvalidAlgorithmParameterException e) {
                InvalidKeyException invalidKeyException = new InvalidKeyException(InternalGostPrivateKey.resource.getString("KeyCreateError"));
                invalidKeyException.initCause(e);
                throw invalidKeyException;
            }
        } catch (Throwable th) {
            this.B.A(randomInterface);
            throw th;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0379  */
    /* JADX WARN: Type inference failed for: r1v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4, types: [byte[]] */
    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SecretKeyInterface doDHPhase(PublicKeyInterface publicKeyInterface, byte[] bArr) throws InvalidKeyException, KeyManagementException {
        BigIntr bigIntr;
        ?? r1;
        ?? r3;
        BigIntr bigIntr2;
        BigIntr bigIntr3;
        BigIntr bigIntr4;
        AgreeKeySpec agreeKeySpec;
        DigestParamsSpec digestParamsSpec;
        OID oid;
        RandomInterface randomInterface = this.b;
        if (this.a.getSignParams() == null) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!(this.a.getSignParams() instanceof EllipticParamsInterface)) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
        }
        OID oid2 = ((AlgIdInterface) publicKeyInterface.getParams()).getSignParams().getOID();
        if (!this.a.getSignParams().getOID().equals(oid2)) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        if (AlgIdSpec.isGost2012OID(this.a.getOID())) {
            if (!EllipticParamsSpec.isShortNewOID(oid2)) {
                if (!this.a.getDigestParams().getOID().equals(((AlgIdInterface) publicKeyInterface.getParams()).getDigestParams().getOID())) {
                    throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
                }
                ParamsInterface cryptParams = this.a.getCryptParams();
                ParamsInterface cryptParams2 = ((AlgIdInterface) publicKeyInterface.getParams()).getCryptParams();
                if (cryptParams != null && cryptParams2 != null && !cryptParams.getOID().equals(cryptParams2.getOID())) {
                    throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
                }
            }
        } else if (!this.a.getDigestParams().getOID().equals(((AlgIdInterface) publicKeyInterface.getParams()).getDigestParams().getOID()) || !this.a.getCryptParams().getOID().equals(((AlgIdInterface) publicKeyInterface.getParams()).getCryptParams().getOID())) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        if (!this.a.getOID().equals(AlgIdSpec.OID_19) && !this.a.getOID().equals(AlgIdSpec.OID_98) && !this.a.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !this.a.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512) && !isDhAllowed()) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("KeyIsNotDhAllowed"));
        }
        if (KeyUsageControlUtility.isStrictModeEnabled() && !this.y) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.INVALID_PKUP));
        }
        if (this.A) {
            new UserProtectedKeyForm().showModal(true);
        }
        BigIntr bigIntr5 = null;
        ?? r2 = null;
        try {
            EllipticParamsInterface ellipticParamsInterface = (EllipticParamsInterface) this.a.getSignParams();
            EllipticPoint q = ((PublicKeySpec) publicKeyInterface).getQ();
            this.B.C();
            BigIntr z = this.B.z();
            try {
                bigIntr = z.mulCSP(new BigIntr(bArr), ellipticParamsInterface.getQ());
                try {
                    z.clear();
                    bigIntr2 = this.B.B();
                    try {
                        bigIntr3 = bigIntr.mulCSP(bigIntr2, ellipticParamsInterface.getQ());
                        try {
                            bigIntr.clear();
                            if (q.getCurveType() == 1) {
                                bigIntr = bigIntr3.mulCSP(BigIntr.FOUR, ellipticParamsInterface.getQ());
                                bigIntr3.clear();
                                bigIntr3 = bigIntr;
                            }
                            EllipticPoint powerHEX = q.powerHEX(bigIntr3, true);
                            int[] merge = Array.merge(powerHEX.getX().getMagWithoutCopy(), powerHEX.getY().getMagWithoutCopy());
                            try {
                                r2 = Array.toByteArray(merge);
                                this.B.j(randomInterface, bigIntr2);
                                try {
                                    SelfTester_JCP.check(4096);
                                    OID oid3 = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
                                    if (AlgIdSpec.isGost2012OID(this.a.getOID())) {
                                        ParamsInterface digestParams = this.a.getDigestParams();
                                        this.a.getCryptParams();
                                        if (EllipticParamsSpec.isShortNewOID(oid2)) {
                                            agreeKeySpec = new AgreeKeySpec(r2, CryptParamsSpec.getInstance(oid3), DigestParamsSpec.getInstance(5), DigestParamsSpec.OID_Gost2012_256);
                                        } else {
                                            if (!EllipticParamsSpec.is256OID_A(oid2) && !AlgIdSpec.isGost512OID(this.a.getOID())) {
                                                if (digestParams != null && !digestParams.getOID().equals(DigestParamsSpec.OID_Gost2012_256)) {
                                                    throw new InvalidKeyException("Invalid digest parameter " + digestParams.getOID() + " for " + this.a.getOID());
                                                }
                                                agreeKeySpec = new AgreeKeySpec(r2, (CryptParamsInterface) this.a.getCryptParams(), DigestParamsSpec.getInstance(5), DigestParamsSpec.OID_Gost2012_256);
                                            }
                                            CryptParamsInterface cryptParamsInterface = (CryptParamsInterface) this.a.getCryptParams();
                                            if (AlgIdSpec.isGost512OID(this.a.getOID())) {
                                                digestParamsSpec = DigestParamsSpec.getInstance(6);
                                                oid = DigestParamsSpec.OID_Gost2012_512;
                                                if (digestParams != null && !digestParams.getOID().equals(oid)) {
                                                    throw new InvalidKeyException("Invalid digest parameter " + digestParams.getOID() + " for " + this.a.getOID());
                                                }
                                            } else {
                                                digestParamsSpec = DigestParamsSpec.getInstance(5);
                                                oid = DigestParamsSpec.OID_Gost2012_256;
                                                if (digestParams != null && !digestParams.getOID().equals(oid)) {
                                                    throw new InvalidKeyException("Invalid digest parameter " + digestParams.getOID() + " for " + this.a.getOID());
                                                }
                                            }
                                            if (cryptParamsInterface == null) {
                                                cryptParamsInterface = CryptParamsSpec.getInstance(oid3);
                                            }
                                            agreeKeySpec = new AgreeKeySpec(r2, cryptParamsInterface, digestParamsSpec, oid);
                                        }
                                    } else {
                                        agreeKeySpec = new AgreeKeySpec(r2, (CryptParamsInterface) this.a.getCryptParams(), this.a.getDigestParams(), this.a.getDigestParams().getOID());
                                    }
                                    this.B.A(randomInterface);
                                    z.clear();
                                    if (bigIntr2 != null) {
                                        bigIntr2.clear();
                                    }
                                    if (bigIntr3 != null) {
                                        bigIntr3.clear();
                                    }
                                    if (bigIntr != null && bigIntr != bigIntr3) {
                                        bigIntr.clear();
                                    }
                                    if (merge != null) {
                                        Array.clear(merge);
                                    }
                                    if (r2 != null) {
                                        Array.clear((byte[]) r2);
                                    }
                                    return agreeKeySpec;
                                } catch (SelfTesterException e) {
                                    KeyManagementException keyManagementException = new KeyManagementException(InternalGostPrivateKey.resource.getString("KeyCreateError"));
                                    keyManagementException.initCause(e);
                                    throw keyManagementException;
                                }
                            } catch (Throwable th) {
                                r1 = merge;
                                th = th;
                                bigIntr4 = r2;
                                bigIntr5 = z;
                                r3 = bigIntr4;
                                this.B.A(randomInterface);
                                if (bigIntr5 != null) {
                                }
                                if (bigIntr2 != null) {
                                }
                                if (bigIntr3 != null) {
                                }
                                if (bigIntr != null) {
                                    bigIntr.clear();
                                }
                                if (r1 != null) {
                                }
                                if (r3 != 0) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = null;
                            bigIntr4 = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = null;
                        bigIntr4 = null;
                        bigIntr3 = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r1 = null;
                    BigIntr bigIntr6 = r1;
                    bigIntr2 = bigIntr6;
                    bigIntr3 = bigIntr2;
                    bigIntr4 = bigIntr6;
                    bigIntr5 = z;
                    r3 = bigIntr4;
                    this.B.A(randomInterface);
                    if (bigIntr5 != null) {
                        bigIntr5.clear();
                    }
                    if (bigIntr2 != null) {
                        bigIntr2.clear();
                    }
                    if (bigIntr3 != null) {
                        bigIntr3.clear();
                    }
                    if (bigIntr != null && bigIntr != bigIntr3) {
                        bigIntr.clear();
                    }
                    if (r1 != null) {
                        Array.clear((int[]) r1);
                    }
                    if (r3 != 0) {
                        Array.clear((byte[]) r3);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bigIntr = null;
                r1 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            bigIntr = null;
            r1 = null;
            r3 = 0;
            bigIntr2 = null;
            bigIntr3 = null;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public PublicKeyInterface generatePublic() throws InvalidKeyException {
        if (this.A) {
            new UserProtectedKeyForm().showModal(true);
        }
        return d();
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public Extension getExtension(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        for (Extension extension : this.x) {
            if (extension.extnID.equals(asn1ObjectIdentifier)) {
                return extension;
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public Extension[] getExtensions() {
        LinkedList linkedList = this.x;
        return (Extension[]) linkedList.toArray(new Extension[linkedList.size()]);
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        return this.a;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return false;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isDhAllowed() {
        return this.w;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isExportable() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isPreExportable() {
        return this.z;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isUserProtected() {
        return this.A;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean match(PublicKey publicKey, String str) throws Exception {
        if (publicKey == null) {
            return false;
        }
        byte[] encode = ((PublicKeyInterface) ((InternalGostPublicKey) PublicKeyConvertor.convert(publicKey, str)).getSpec()).encode();
        PublicKey publicKey2 = this.C;
        byte[] encode2 = (publicKey2 == null ? d() : (PublicKeyInterface) ((InternalGostPublicKey) PublicKeyConvertor.convert(publicKey2, str)).getSpec()).encode();
        return (encode2 == null || encode == null || !Array.compare(encode2, encode)) ? false : true;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setDhAllowed() {
        if (this.w) {
            return;
        }
        this.w = true;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setNotExportable() {
        if (this.c) {
            this.z = false;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setNotWriteAvailable() {
        this.c = false;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        boolean z;
        if (!(paramsInterface instanceof AlgIdInterface)) {
            throw new InvalidParameterException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        ParamsInterface signParams = this.a.getSignParams();
        AlgIdInterface algIdInterface = (AlgIdInterface) paramsInterface;
        ParamsInterface signParams2 = algIdInterface.getSignParams();
        if ((signParams == null && signParams2 != null) || (signParams != null && signParams2 == null)) {
            throw new InvalidParameterException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        if (signParams != null && ((!((z = signParams instanceof EllipticParamsInterface)) && (signParams2 instanceof EllipticParamsInterface)) || (!(signParams2 instanceof EllipticParamsInterface) && z))) {
            throw new InvalidParameterException(InternalGostPrivateKey.resource.getString("MasmatchParam"));
        }
        this.a = algIdInterface;
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setUserProtected() {
        if (this.A) {
            return;
        }
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SignValue signature(byte[] bArr) throws SignatureException, InvalidKeyException {
        int i = this.B.e;
        if (this.a.getSignParams() == null) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NULL_PARAM));
        }
        if (!(this.a.getSignParams() instanceof EllipticParamsInterface)) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.NOT_GOST));
        }
        if (!this.y) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString(InternalGostPrivateKey.INVALID_PKUP));
        }
        BigIntr q = ((EllipticParamsInterface) this.a.getSignParams()).getQ();
        RandomInterface randomInterface = this.b;
        BigIntr bigIntr = new BigIntr(i, randomInterface);
        BigIntr modCSP = bigIntr.modCSP(q);
        BigIntr bigIntr2 = new BigIntr(i);
        try {
            this.B.C();
            if (this.A) {
                new UserProtectedKeyForm().showModal(true);
            }
            while (true) {
                try {
                    SignValue b = this.B.b(this.a, modCSP, bArr, bigIntr2);
                    this.B.j(randomInterface, bigIntr2);
                    if (modCSP != null) {
                        modCSP.clear();
                    }
                    bigIntr.clear();
                    bigIntr2.clear();
                    this.B.A(randomInterface);
                    return b;
                } catch (SignatureException e) {
                    if (!e.getMessage().equals(a.resource.getString("NeedGenK"))) {
                        throw e;
                    }
                    modCSP.clear();
                    bigIntr.clear();
                    BigIntr bigIntr3 = new BigIntr(i, randomInterface);
                    try {
                        modCSP = bigIntr3.modCSP(q);
                        bigIntr = bigIntr3;
                    } catch (Throwable th) {
                        th = th;
                        bigIntr = bigIntr3;
                        this.B.j(randomInterface, bigIntr2);
                        if (modCSP != null) {
                        }
                        bigIntr.clear();
                        bigIntr2.clear();
                        this.B.A(randomInterface);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            this.B.j(randomInterface, bigIntr2);
            if (modCSP != null) {
                modCSP.clear();
            }
            bigIntr.clear();
            bigIntr2.clear();
            this.B.A(randomInterface);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean match(PublicKey publicKey) throws Exception {
        return match(publicKey, null);
    }

    @Override // ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public SignValue signature(byte[] bArr, int i, int i2) throws SignatureException, InvalidKeyException {
        return signature(bArr);
    }

    public PrivateKeySpec(AlgIdInterface algIdInterface, RandomInterface randomInterface) throws KeyManagementException {
        this.a = null;
        this.b = null;
        this.c = true;
        this.w = false;
        this.x = new LinkedList();
        this.y = true;
        this.z = true;
        this.A = false;
        this.a = algIdInterface;
        this.b = randomInterface;
        this.B = new wu61(algIdInterface, randomInterface, 3, 0);
    }

    public PrivateKeySpec(AlgIdInterface algIdInterface, RandomInterface randomInterface, byte[] bArr, byte[] bArr2) throws KeyManagementException, RandomRefuseException {
        this.a = null;
        this.b = null;
        this.c = true;
        this.w = false;
        this.x = new LinkedList();
        this.y = true;
        this.z = true;
        this.A = false;
        this.B = new wu61(algIdInterface, randomInterface, bArr, bArr2);
        this.a = algIdInterface;
        this.b = randomInterface;
    }
}
