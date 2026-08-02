package ru.CryptoPro.CAdES;

import defpackage.a2;
import defpackage.a8x;
import defpackage.a97;
import defpackage.acs0;
import defpackage.amp0;
import defpackage.b64;
import defpackage.b97;
import defpackage.bg1;
import defpackage.c06;
import defpackage.fu61;
import defpackage.g8e;
import defpackage.h2t;
import defpackage.i87;
import defpackage.k7h;
import defpackage.l7h;
import defpackage.l7s0;
import defpackage.mr80;
import defpackage.ncc;
import defpackage.nv61;
import defpackage.nx61;
import defpackage.oqf;
import defpackage.ov61;
import defpackage.oyr;
import defpackage.pv61;
import defpackage.ro60;
import defpackage.ru61;
import defpackage.s3;
import defpackage.sw61;
import defpackage.u2;
import defpackage.w7x;
import defpackage.w87;
import defpackage.wt61;
import defpackage.xbs0;
import defpackage.xc3;
import defpackage.xr1;
import defpackage.yc70;
import defpackage.zbs0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.CAdES.tools.verifier.GostCMSSignatureEncryptionAlgorithmFinder;
import ru.CryptoPro.CAdES.tools.verifier.GostContentSignerProvider;
import ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;

/* loaded from: classes4.dex */
public abstract class AbstractCAdESSignature implements ICAdESSignature {
    public boolean a = false;
    public nv61 b = null;
    public ncc c = null;
    public ncc w = null;
    public ncc x = null;
    public ncc y = null;
    public final ArrayList z = new ArrayList();
    public Integer A = CAdESParameters.CAdES_Unknown;
    public fu61 B = null;
    public w87 C = null;
    public InputStream D = null;
    public GostDigestCalculatorProvider E = null;
    public boolean F = false;
    public Options G = null;

    static {
        JCPLogger.fine("%%% Initializing of the CAdES context... %%%");
        CAdESUtility.initJCPAlgorithms();
        JCPLogger.fine("%%% Initializing of the CAdES context completed. %%%");
    }

    public AbstractCAdESSignature() {
        SelfTester_Auxiliary.checkClass(AbstractCAdESSignature.class);
    }

    public final void a(nv61 nv61Var, GostDigestCalculatorProvider gostDigestCalculatorProvider, boolean z, InputStream inputStream, Integer num, boolean z2, boolean z3) {
        JCPLogger.subEnter();
        this.b = nv61Var;
        this.F = z2;
        this.a = z;
        this.D = inputStream;
        if (inputStream != null && inputStream.markSupported()) {
            this.D.mark(0);
        }
        this.E = gostDigestCalculatorProvider;
        this.B = new fu61();
        this.A = num;
        if (nv61Var != null) {
            try {
                if (nv61Var instanceof pv61) {
                    if (z3) {
                        JCPLogger.fine("Draining the signature has been omitted but being expected to be done later.");
                    } else {
                        JCPLogger.fine("Draining the signature...");
                        c06 Ug = ((pv61) nv61Var).a.Ug();
                        if (Ug != null) {
                            a97 a97Var = (a97) Ug.b;
                            while (a97Var.read(new byte[4096], 0, 4096) >= 0) {
                            }
                            a97Var.close();
                        }
                    }
                }
                if (z3) {
                    JCPLogger.fine("Decoding of certificates and CRLs has been omitted but being expected to be done later.");
                } else {
                    b();
                }
                if (z3) {
                    JCPLogger.fine("Decoding signers of signature has been omitted but being expected to be done later.");
                } else {
                    JCPLogger.fine("Decoding signers of signature...");
                    decode();
                }
            } catch (Exception e) {
                throw new CAdESException(e, IAdESException.ecInternal);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2, Set<X509CRL> set, boolean z2) throws CAdESException {
        Set<X509CRL> set2;
        i87 i87Var;
        String str5;
        zbs0 F;
        ncc nccVar;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Adding a new signer... %%%");
        if (list == null || list.isEmpty()) {
            throw new CAdESException(IAdESException.ecCertificateChainIsNull);
        }
        if (!AdESSigner.CREATED_SIGNATURE_TYPES().contains(num)) {
            throw new CAdESException("Unsupported signature type " + CAdESType.getSignatureTypeName(num) + " for creating.", IAdESException.ecSignatureUnsupported);
        }
        Integer num2 = CAdESParameters.CAdES_T;
        if ((num.equals(num2) || num.equals(CAdESParameters.CAdES_X_Long_Type_1) || num.equals(CAdESParameters.CAdES_A)) && str4 == null) {
            throw new CAdESException("Expected signature type is CAdES-T or CAdES-X Long Type 1 or CAdES-A, but TSA url not found.", IAdESException.ecInternal);
        }
        String algorithm = privateKey.getAlgorithm();
        JCPLogger.fine("Private key algorithm: " + algorithm);
        String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(null, str, privateKey);
        if (checkAndGetDigestAlgorithm == null) {
            throw new CAdESException(g8e.o("Digest algorithm has not been found or is not supported by provider ", str), IAdESException.ecInternal);
        }
        JCPLogger.fine("Evaluated user digest OID: ".concat(checkAndGetDigestAlgorithm));
        String keyAlgToDigestOid = AlgorithmUtility.keyAlgToDigestOid(algorithm);
        JCPLogger.fine("Digest OID from key: " + keyAlgToDigestOid);
        String keyAlgToKeyAlgorithmOid = AlgorithmUtility.keyAlgToKeyAlgorithmOid(algorithm);
        JCPLogger.fine("Encryption OID from key: " + keyAlgToKeyAlgorithmOid);
        if (set == null) {
            try {
                set2 = Collections.EMPTY_SET;
            } catch (AdESException e) {
                if (!(e instanceof CAdESException)) {
                    throw new CAdESException(e, e.getErrorCode());
                }
                throw ((CAdESException) e);
            } catch (Exception e2) {
                if (!(e2 instanceof CAdESException)) {
                    throw new CAdESException(e2, IAdESException.ecInternal);
                }
                throw ((CAdESException) e2);
            }
        } else {
            set2 = set;
        }
        AdESUtility.checkOidAndKeyAlgorithmCAdESConformity(keyAlgToDigestOid, keyAlgToKeyAlgorithmOid, privateKey);
        X509Certificate findCertMatch = AdESUtility.findCertMatch(privateKey, list, str);
        if (findCertMatch == null) {
            throw new CAdESException(IAdESException.ecKeyMismatch);
        }
        JCPLogger.fineFormat("Adding the signer certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tfrom: {3}\n\ttill: {4}", findCertMatch.getSerialNumber().toString(16), findCertMatch.getSubjectDN(), findCertMatch.getIssuerDN(), findCertMatch.getNotBefore(), findCertMatch.getNotAfter());
        JCPLogger.fine("Building of the signer certificate chain...");
        HashSet hashSet = new HashSet(list);
        CertificateChainBuilderImpl certificateChainBuilderImpl = new CertificateChainBuilderImpl();
        certificateChainBuilderImpl.setProvider(str);
        certificateChainBuilderImpl.setCertificateValues(hashSet);
        certificateChainBuilderImpl.build(findCertMatch);
        JCPLogger.fine("Building of the signer certificate chain completed.");
        List<X509Certificate> certificateChain = certificateChainBuilderImpl.getCertificateChain();
        Integer num3 = CAdESParameters.CAdES_X_Long_Type_1;
        if (!num.equals(num3) && !num.equals(CAdESParameters.CAdES_A)) {
            Options options = this.G;
            boolean z3 = options == null || options.isEnableCertificateValidation() || !(num.equals(CAdESParameters.CAdES_BES) || num.equals(num2));
            JCPLogger.fine("Validating of the signer certificate chain...");
            BaseCertificateChainValidatorImpl baseCertificateChainValidatorImpl = new BaseCertificateChainValidatorImpl();
            baseCertificateChainValidatorImpl.setCRLs(set2);
            baseCertificateChainValidatorImpl.setProvider(str);
            JCPLogger.fine("validateCertificateChain = " + z3);
            baseCertificateChainValidatorImpl.setEnableCertificateValidation(z3);
            baseCertificateChainValidatorImpl.validate(certificateChain, (List) null);
            JCPLogger.fine("Validating of the signer certificate chain completed.");
        }
        if (!num.equals(num3) && !num.equals(CAdESParameters.CAdES_A)) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                Iterator<X509Certificate> it = certificateChain.iterator();
                while (it.hasNext()) {
                    arrayList.add(new X509CertificateHolder(it.next().getEncoded()));
                }
                nccVar = new ncc(arrayList);
            } else if (this.c == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new X509CertificateHolder(certificateChain.get(0).getEncoded()));
                nccVar = new ncc(arrayList2);
            }
            setCertificateStore(nccVar);
        }
        ru61 ru61Var = new ru61(certificateChain, xc3Var);
        ru61Var.b = str;
        ru61Var.x = z;
        if (num.equals(CAdESParameters.CAdES_A)) {
            wt61 wt61Var = new wt61(str4, null, certificateChain);
            wt61Var.C.addAll(Collections.singletonList(CAdESParameters.CAdES_T));
            i87Var = wt61Var;
        } else if (num.equals(CAdESParameters.CAdES_X_Long_Type_1)) {
            nx61 nx61Var = new nx61(certificateChain, str4);
            nx61Var.C.addAll(Collections.singletonList(CAdESParameters.CAdES_T));
            i87Var = nx61Var;
        } else {
            i87Var = num.equals(CAdESParameters.CAdES_T) ? new sw61(certificateChain, str4) : xc3Var2 != null ? new l7s0(xc3Var2) : null;
        }
        if (i87Var instanceof sw61) {
            ((SignatureOptions) i87Var).setOptions(this.G);
        }
        if (AdESUtility.isInternalImplemented(str)) {
            F = new amp0(new GostDigestCalculatorProvider(privateKey, str, this.F, false), new GostCMSSignatureEncryptionAlgorithmFinder(privateKey)).F(new GostContentSignerProvider(privateKey, str, this.G), new X509CertificateHolder(findCertMatch.getEncoded()));
            str5 = keyAlgToKeyAlgorithmOid;
        } else {
            a8x a8xVar = new a8x();
            a8xVar.a = new yc70(new bg1(str, 12));
            h2t h2tVar = new h2t(a8xVar);
            str5 = keyAlgToKeyAlgorithmOid;
            w7x w7xVar = new w7x(new k7h().getSignatureName(new xr1(new u2(keyAlgToDigestOid)), new xr1(new u2(str5))));
            w7xVar.b = new yc70(new bg1(str, 12));
            F = new amp0(h2tVar, new l7h()).F(w7xVar.a(privateKey), new JcaX509CertificateHolder(findCertMatch));
        }
        if (i87Var != null && (i87Var instanceof sw61)) {
            ((sw61) i87Var).c = checkAndGetDigestAlgorithm;
            ((sw61) i87Var).b = str;
            ((sw61) i87Var).w = xc3Var2;
            ((sw61) i87Var).setCertificateValues(hashSet);
            ((sw61) i87Var).setCRLs(set2);
        }
        if (i87Var != null && (i87Var instanceof wt61)) {
            xbs0 xbs0Var = F.a;
            ((wt61) i87Var).H = xbs0Var;
            ((wt61) i87Var).I = xbs0Var.a instanceof s3 ? 3 : 1;
            ((wt61) i87Var).J = new xr1(new u2(str5));
            ((wt61) i87Var).K = ru61Var;
            wt61 wt61Var2 = (wt61) i87Var;
            ncc nccVar2 = this.x;
            if (wt61Var2.S == null && nccVar2 != null) {
                wt61Var2.S = nccVar2;
            }
            wt61 wt61Var3 = (wt61) i87Var;
            ncc nccVar3 = this.y;
            if (wt61Var3.T == null && nccVar3 != null) {
                wt61Var3.T = nccVar3;
            }
        }
        this.B.d.add(new zbs0(F, ru61Var, i87Var));
        JCPLogger.fine("%%% Signer has been added %%%");
        JCPLogger.subExit();
    }

    public final void b() {
        JCPLogger.subEnter();
        if (this.c == null) {
            JCPLogger.fine("Extracting certificates from signature...");
            this.c = this.b.b();
        }
        if (this.w == null) {
            JCPLogger.fine("Extracting CRLs from signature...");
            this.w = this.b.c();
        }
        if (this.x == null) {
            JCPLogger.fine("Extracting certificates from signature (for A)...");
            this.x = this.b.b();
        }
        if (this.y == null) {
            JCPLogger.fine("Extracting CRLs and other revocation information from signature (for A)...");
            ncc c = this.b.c();
            ncc d = this.b.d();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c.a(null));
            arrayList.addAll(d.a(null));
            this.y = new ncc(arrayList);
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void close() throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Closing context... %%%");
        w87 w87Var = this.C;
        if (w87Var == null) {
            throw new CAdESException(IAdESException.ecClosingSignatureFailed);
        }
        try {
            w87Var.close();
            this.C = null;
            JCPLogger.fine("%%% Context closed %%%");
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecClosingOutputContextFailed);
        } catch (CAdESCMSAttributeTableGenerationException e2) {
            throw new CAdESException(e2, e2.getErrorCode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void decode() throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Decoding signature... %%%");
        if (this.b == null) {
            throw new CAdESException(IAdESException.ecSignatureSignedDataIsNull);
        }
        try {
            b();
            ArrayList arrayList = this.z;
            arrayList.clear();
            try {
                ArrayList a = this.b.e().a();
                if (a.isEmpty()) {
                    throw new CAdESException(IAdESException.ecSignatureSignerIsNull);
                }
                JCPLogger.fine("Collecting signers...");
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    CAdESSignerPKCS7Impl a2 = CAdESSignerFactory.a((acs0) it.next(), this.A);
                    if (a2 instanceof InternalTimeStampCAdESSignerParameters) {
                        JCPLogger.fine("Setting decoded content for timestamp...");
                        try {
                            ((InternalTimeStampCAdESSignerParameters) a2).setContent(this.b.f());
                        } catch (Exception e) {
                            throw new CAdESException(e, IAdESException.ecInternal);
                        }
                    }
                    if (this.b instanceof ov61) {
                        JCPLogger.fine("Setting buffered signed content");
                        try {
                            a2.x = this.b.g();
                        } catch (Exception e2) {
                            throw new CAdESException(e2, IAdESException.ecInternal);
                        }
                    }
                    JCPLogger.fine("Setting certificates and validation data for archive-timestamp if need in future...");
                    a2.e(this.x);
                    a2.f(this.y);
                    a2.c(this.c);
                    a2.d(this.w);
                    InputStream inputStream = this.D;
                    if (inputStream != null) {
                        a2.x = inputStream;
                    }
                    a2.w = this.F;
                    a2.y = this.E;
                    a2.setOptions(this.G);
                    try {
                        a2.h();
                        arrayList.add(a2);
                    } catch (AdESException e3) {
                        if (!(e3 instanceof CAdESException)) {
                            throw new CAdESException(e3, e3.getErrorCode());
                        }
                        throw ((CAdESException) e3);
                    }
                }
                JCPLogger.fine("%%% Signature has been decoded %%%");
                JCPLogger.subExit();
            } catch (Exception e4) {
                throw new CAdESException(e4, IAdESException.ecInternal);
            }
        } catch (Exception e5) {
            throw new CAdESException(e5, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public CAdESSigner getCAdESSignerInfo(int i) throws ArrayIndexOutOfBoundsException {
        ArrayList arrayList = this.z;
        CAdESSigner[] cAdESSignerArr = (CAdESSigner[]) arrayList.toArray(new CAdESSigner[arrayList.size()]);
        if (i >= 0 && i < cAdESSignerArr.length) {
            return cAdESSignerArr[i];
        }
        throw new ArrayIndexOutOfBoundsException(oyr.m(cAdESSignerArr.length, Extension.C_BRAKE, b64.t(i, "Index ", " is out of array bounds (array size: ")));
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public CAdESSigner[] getCAdESSignerInfos() {
        ArrayList arrayList = this.z;
        return (CAdESSigner[]) arrayList.toArray(new CAdESSigner[arrayList.size()]);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public ncc getCertificateStore() {
        return this.c;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public ncc getCrlStore() {
        return this.w;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public InputStream getSignedContent() throws CAdESException {
        try {
            nv61 nv61Var = this.b;
            if (nv61Var != null) {
                return nv61Var.g();
            }
            return null;
        } catch (Exception unused) {
            throw new CAdESException("Loading content failed", IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void open(OutputStream outputStream) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Opening context... %%%");
        fu61 fu61Var = this.B;
        if (fu61Var == null) {
            throw new CAdESException(IAdESException.ecSignatureGeneratorUndefined);
        }
        if (outputStream == null) {
            throw new CAdESException(IAdESException.ecSignatureOutputStreamUndefined);
        }
        if (fu61Var.d.size() == 0) {
            throw new CAdESException(IAdESException.ecNoOneSignerFound);
        }
        try {
            this.C = this.B.a(outputStream, !this.a);
            JCPLogger.fine("%%% Context opened %%%");
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecOpeningOutputContextFailed);
        }
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void setCRLStore(u2 u2Var, ncc nccVar) throws CAdESException {
        JCPLogger.subEnter();
        if (nccVar != null) {
            if (u2Var == null) {
                throw new CAdESException("Revocation format id is null.", IAdESException.ecRevocationIsNull);
            }
            u2 u2Var2 = ro60.a;
            if (!u2Var.q(u2Var2)) {
                throw new CAdESException("Revocation format id is unknown: " + u2Var + ", only " + u2Var2 + " is allowed.", IAdESException.ecRevocationCRLNotSuitable);
            }
            JCPLogger.fine("Adding other revocation store.");
            ArrayList arrayList = this.B.b;
            int i = b97.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = nccVar.a(null).iterator();
            while (it.hasNext()) {
                mr80 mr80Var = new mr80(u2Var, (a2) it.next());
                b97.i(mr80Var);
                arrayList2.add(new oqf(2, 128, 1, mr80Var, 0));
            }
            arrayList.addAll(arrayList2);
            ncc nccVar2 = this.w;
            if (nccVar2 == null) {
                this.w = new ncc(nccVar.a(null));
            } else {
                ArrayList a = nccVar2.a(null);
                a.addAll(nccVar.a(null));
                this.w = new ncc(a);
            }
            ncc nccVar3 = this.y;
            if (nccVar3 == null) {
                this.y = new ncc(nccVar.a(null));
            } else {
                ArrayList a2 = nccVar3.a(null);
                a2.addAll(nccVar.a(null));
                this.y = new ncc(a2);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void setCertificateStore(ncc nccVar) throws CAdESException {
        JCPLogger.subEnter();
        if (nccVar != null) {
            try {
                JCPLogger.fine("Adding a certificate store.");
                this.B.a.addAll(b97.f(nccVar));
                ncc nccVar2 = this.c;
                if (nccVar2 == null) {
                    this.c = new ncc(nccVar.a(null));
                } else {
                    ArrayList a = nccVar2.a(null);
                    a.addAll(nccVar.a(null));
                    this.c = new ncc(a);
                }
                ncc nccVar3 = this.x;
                if (nccVar3 == null) {
                    this.x = new ncc(nccVar.a(null));
                } else {
                    ArrayList a2 = nccVar3.a(null);
                    a2.addAll(nccVar.a(null));
                    this.x = new ncc(a2);
                }
            } catch (CMSException e) {
                throw new CAdESException(e, IAdESException.ecInternal);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.G = options;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void update(byte[] bArr) throws CAdESException {
        try {
            this.C.write(bArr, 0, bArr.length);
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signature... %%%");
        StringBuilder sb = new StringBuilder("Verifying signers, total: ");
        ArrayList arrayList = this.z;
        sb.append(arrayList.size());
        sb.append("...");
        JCPLogger.fine(sb.toString());
        if (arrayList.isEmpty()) {
            throw new CAdESException("Signers not found", IAdESException.ecSignatureInvalid);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            CAdESSigner cAdESSigner = (CAdESSigner) it.next();
            cAdESSigner.setOptions(this.G);
            cAdESSigner.verify((Set) set, (Set) set2, this.A, true);
            i++;
        }
        JCPLogger.fineFormat("Verifying completed!\n\ttotal: {0} signature(s)\n\tverified: {1} signature(s)", Integer.valueOf(arrayList.size()), Integer.valueOf(i));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void update(byte[] bArr, int i, int i2) throws CAdESException {
        try {
            this.C.write(bArr, i, i2);
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void verify(Collection<X509Certificate> collection, Collection<X509CRL> collection2) throws CAdESException {
        if (collection == null) {
            collection = Collections.EMPTY_SET;
        }
        if (collection2 == null) {
            collection2 = Collections.EMPTY_SET;
        }
        JCPLogger.subEnter();
        verify((Set<X509Certificate>) new HashSet(collection), (Set<X509CRL>) new HashSet(collection2));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature, ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    public void verify(Set<X509Certificate> set) throws CAdESException {
        JCPLogger.subEnter();
        verify(set, (Set<X509CRL>) null);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void verify(Collection<X509Certificate> collection) throws CAdESException {
        JCPLogger.subEnter();
        verify(collection, (Collection<X509CRL>) null);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void setCRLStore(ncc nccVar) throws CAdESException {
        JCPLogger.subEnter();
        if (nccVar != null) {
            try {
                JCPLogger.fine("Adding CRL store.");
                this.B.b.addAll(b97.e(nccVar));
                ncc nccVar2 = this.w;
                if (nccVar2 == null) {
                    this.w = new ncc(nccVar.a(null));
                } else {
                    ArrayList a = nccVar2.a(null);
                    a.addAll(nccVar.a(null));
                    this.w = new ncc(a);
                }
                ncc nccVar3 = this.y;
                if (nccVar3 == null) {
                    this.y = new ncc(nccVar.a(null));
                } else {
                    ArrayList a2 = nccVar3.a(null);
                    a2.addAll(nccVar.a(null));
                    this.y = new ncc(a2);
                }
            } catch (CMSException e) {
                throw new CAdESException(e, IAdESException.ecInternal);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException {
        JCPLogger.subEnter();
        addSigner(str, str2, str3, privateKey, (List<X509Certificate>) new LinkedList(collection == null ? Collections.EMPTY_LIST : collection), num, str4, z, xc3Var, xc3Var2);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z) throws CAdESException {
        addSigner(str, str2, str3, privateKey, list, num, str4, z, (xc3) null, (xc3) null);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException {
        addSigner(str, str2, str3, privateKey, list, num, str4, z, xc3Var, xc3Var2, null);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2, Set<X509CRL> set) throws CAdESException {
        addSigner(str, str2, str3, privateKey, list, num, str4, z, xc3Var, xc3Var2, set, false);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void addSigner(String str, String str2, String str3, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str4, boolean z) throws CAdESException {
        addSigner(str, str2, str3, privateKey, collection, num, str4, z, (xc3) null, (xc3) null);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void addSigner(String str, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str2, boolean z) throws CAdESException {
        addSigner(str, (String) null, (String) null, privateKey, collection, num, str2, z, (xc3) null, (xc3) null);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    @Deprecated
    public void addSigner(String str, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str2, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException {
        addSigner(str, (String) null, (String) null, privateKey, collection, num, str2, z, xc3Var, xc3Var2);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str2, boolean z) throws CAdESException {
        addSigner(str, (String) null, (String) null, privateKey, list, num, str2, z);
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSignature
    public void addSigner(String str, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str2, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException {
        addSigner(str, (String) null, (String) null, privateKey, list, num, str2, z, xc3Var, xc3Var2);
    }
}
