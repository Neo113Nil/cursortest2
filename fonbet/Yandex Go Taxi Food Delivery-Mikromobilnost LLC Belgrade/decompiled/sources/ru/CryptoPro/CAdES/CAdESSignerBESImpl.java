package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.ar61;
import defpackage.b490;
import defpackage.bcs0;
import defpackage.c2;
import defpackage.cr80;
import defpackage.g8e;
import defpackage.gv61;
import defpackage.i3;
import defpackage.i87;
import defpackage.jqf;
import defpackage.jx61;
import defpackage.m3;
import defpackage.nc51;
import defpackage.ncc;
import defpackage.nx61;
import defpackage.p0x;
import defpackage.r0x;
import defpackage.sw61;
import defpackage.tx61;
import defpackage.vc3;
import defpackage.wt61;
import defpackage.xbs0;
import defpackage.xc3;
import defpackage.xq61;
import defpackage.xx61;
import java.io.InputStream;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.timestamp.external.data.TimeStampData;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerBESImpl extends CAdESSignerPKCS7Impl implements CAdESSignerBES {
    public final boolean B;

    public CAdESSignerBESImpl(acs0 acs0Var) {
        this(acs0Var, CAdESParameters.CAdES_BES, false);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public void addCountersigner(acs0 acs0Var) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Adding a new counter signer... %%%");
        xc3 signedAttributes = acs0Var.getSignedAttributes();
        if (signedAttributes != null && CAdESUtility.getSingleAttribute(signedAttributes, b490.t3) != null) {
            throw new CAdESException("For countersignature signedAttributes field must not contain a content-type attribute", IAdESException.ecSignerWrongCountersignature);
        }
        JCPLogger.fine("Preparing unsigned attribute tables...");
        xc3 unsignedAttributes = this.a.getUnsignedAttributes();
        c2 c2Var = new c2();
        c2 c2Var2 = unsignedAttributes == null ? new c2() : unsignedAttributes.g();
        JCPLogger.fine("Finding counter-signature attributes...");
        vc3 singleAttribute = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.x3);
        m3 m3Var = singleAttribute != null ? (m3) ((i3) singleAttribute.toASN1Primitive()).A(1) : null;
        JCPLogger.fine("Creating counter-signature attribute...");
        vc3 m = vc3.m(new jqf(CAdESUtility.getASN1EncodedCounterSigner(m3Var, acs0Var)));
        boolean z = false;
        for (int i = 0; i < c2Var2.b; i++) {
            vc3 vc3Var = (vc3) c2Var2.c(i);
            if (vc3Var.equals(singleAttribute)) {
                JCPLogger.fine("Replacing existing counter-signature attribute...");
                c2Var.a(m);
                z = true;
            } else {
                c2Var.a(vc3Var);
            }
        }
        if (!z) {
            JCPLogger.fine("Adding first one counter-signature attribute...");
            c2Var.a(m);
        }
        JCPLogger.fine("Replacing attributes...");
        CAdESSigner.replaceUnsignedAttributes(this, new xc3(c2Var));
        JCPLogger.fine("%%% Counter signer has been added %%%");
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        JCPLogger.fine("%%% Enhancing signer (BES)... %%%");
        try {
            checkIfCanEnhance(num);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(list);
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set);
            X509Certificate a = a(list, unmodifiableSet);
            String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(str2, str, a.getPublicKey());
            if (checkAndGetDigestAlgorithm == null) {
                throw new CAdESException(g8e.o("Digest algorithm has not been found or is not supported by provider ", str), IAdESException.ecInternal);
            }
            JCPLogger.fine("Enhancing digest algorithm: ".concat(checkAndGetDigestAlgorithm));
            try {
                List<X509Certificate> build = build(a, str, null);
                if (!num.equals(CAdESParameters.CAdES_X_Long_Type_1) && !num.equals(CAdESParameters.CAdES_A)) {
                    validate(build, str, null);
                }
                JCPLogger.fine("Initiating attribute table (BES -> " + CAdESType.getSignatureTypeName(num) + ")...");
                n(num, checkAndGetDigestAlgorithm);
                sw61 j = j(build, str, checkAndGetDigestAlgorithm, str3, num, xc3Var, null, null, null, null);
                JCPLogger.fine("Generating attributes...");
                xc3 b = j.b(k());
                JCPLogger.fine("Replacing attributes...");
                CAdESSigner.replaceUnsignedAttributes(this, b);
                CAdESSignerTImpl l = l(j);
                JCPLogger.fine("%%% Signer has been enhanced %%%");
                if (l instanceof CAdESSignerAImpl) {
                    ((CAdESSignerAImpl) l).verify();
                }
                return l;
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
            } catch (CAdESCMSAttributeTableGenerationException e2) {
                throw new CAdESException(e2, e2.getErrorCode());
            }
        } catch (AdESException e3) {
            throw new CAdESException(e3, e3.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final void findSignerCertificate(Collection collection, Collection collection2) {
        JCPLogger.subEnter();
        cr80 cr80Var = (cr80) this.z.c;
        CertificateFinder certificateFinder = new CertificateFinder(collection, collection2);
        this.signerCertificateChain.clear();
        r0x r0xVar = cr80Var.b;
        this.signerCertificateChain.add(r0xVar == null ? certificateFinder.find(cr80Var) : certificateFinder.find(r0xVar));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public CAdESSigner[] getCAdESCountersignerInfos() {
        ArrayList arrayList = this.c;
        return (CAdESSigner[]) arrayList.toArray(new CAdESSigner[arrayList.size()]);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getPkupValidationDate() {
        return ((gv61) this.z).x;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return CAdESParameters.CAdES_BES;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public xc3 getSignerSignedAttributes() {
        return this.a.getSignedAttributes();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public xc3 getSignerUnsignedAttributes() {
        return this.a.getUnsignedAttributes();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl
    public final void h() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding CAdES-BES signature...");
        super.h();
        ArrayList arrayList = this.c;
        arrayList.clear();
        bcs0 counterSignatures = this.a.getCounterSignatures();
        if (counterSignatures != null && counterSignatures.a.size() > 0) {
            ArrayList a = counterSignatures.a();
            Iterator it = a.iterator();
            JCPLogger.fine("Found countersignatures: " + a.size());
            while (it.hasNext()) {
                acs0 acs0Var = (acs0) it.next();
                CAdESSignerPKCS7Impl a2 = CAdESSignerFactory.a(acs0Var, null);
                a2.setProvider(this.provider);
                a2.signatureCertificates.addAll(this.signatureCertificates);
                a2.signatureCRLs.addAll(this.signatureCRLs);
                a2.setOptions(this.options);
                if (acs0Var.isCounterSignature()) {
                    a2.h();
                }
                arrayList.add(a2);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl
    public void i() {
        this.z = new gv61(this.a);
    }

    public sw61 j(List list, String str, String str2, String str3, Integer num, xc3 xc3Var, List list2, byte[] bArr, ncc nccVar, ncc nccVar2) {
        sw61 sw61Var;
        JCPLogger.fine("Preparing generator for target type: " + num + "...");
        ArrayList arrayList = new ArrayList();
        arrayList.add(CAdESParameters.CAdES_BES);
        Integer num2 = CAdESParameters.CAdES_T;
        arrayList.add(num2);
        Integer num3 = CAdESParameters.CAdES_X_Long_Type_1;
        arrayList.add(num3);
        Integer num4 = CAdESParameters.CAdES_A;
        arrayList.add(num4);
        arrayList.remove(num);
        if (num.equals(num3)) {
            nx61 nx61Var = new nx61(list, str3);
            sw61Var = nx61Var;
            if (list2 != null) {
                nx61Var.A.addAll(list2);
                sw61Var = nx61Var;
            }
        } else if (num.equals(num4)) {
            wt61 wt61Var = new wt61(str3, bArr, list);
            wt61Var.L = new xc3(xc3.b(getSignerSignedAttributes().a));
            nc51 nc51Var = this.a.getSID().a;
            wt61Var.H = new xbs0(new p0x(nc51Var.b, nc51Var.c));
            wt61Var.I = this.a.getVersion();
            wt61Var.J = this.a.toASN1Structure().x;
            if (wt61Var.S == null && nccVar != null) {
                wt61Var.S = nccVar;
            }
            ncc nccVar3 = wt61Var.T;
            sw61Var = wt61Var;
            sw61Var = wt61Var;
            if (nccVar3 == null && nccVar2 != null) {
                wt61Var.T = nccVar2;
                sw61Var = wt61Var;
            }
        } else {
            sw61Var = num.equals(num2) ? new sw61(list, str3) : num.equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP) ? new ar61(list, null) : num.equals(AdESParameters.TSA_CAdESC_TIME_STAMP) ? new tx61(list, null) : num.equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP) ? new xq61(list, null) : null;
        }
        if (sw61Var == null) {
            throw new CAdESException("Invalid signature type.", IAdESException.ecInternal);
        }
        if (sw61Var instanceof nx61) {
            sw61Var.D = this.options;
        }
        sw61Var.c = str2;
        sw61Var.b = str;
        sw61Var.w = xc3Var;
        sw61Var.setCertificateValues(this.signatureCertificates);
        sw61Var.setCRLs(this.signatureCRLs);
        sw61Var.C.addAll(arrayList);
        return sw61Var;
    }

    public Map k() {
        JCPLogger.fine("Preparing attribute parameters (BES -> T)...");
        HashMap hashMap = new HashMap();
        hashMap.put("encryptedDigest", this.a.getSignature());
        JCPLogger.fine("Adding content-type and digest algorithm id to parameters...");
        hashMap.put("contentType", this.a.getContentType());
        hashMap.put("digestAlgID", this.a.getDigestAlgorithmID());
        return hashMap;
    }

    public final CAdESSignerTImpl l(i87 i87Var) {
        TimeStampData timeStampData;
        TimeStampData timeStampData2;
        JCPLogger.fine("Installing generator parameters to signer...");
        CAdESSignerTImpl jx61Var = i87Var instanceof xq61 ? new jx61(getSignerInfo()) : i87Var instanceof ar61 ? new xx61(getSignerInfo()) : i87Var instanceof wt61 ? new CAdESSignerAImpl(getSignerInfo(), true) : i87Var instanceof nx61 ? new CAdESSignerXLT1Impl(getSignerInfo(), true) : i87Var instanceof sw61 ? new CAdESSignerTImpl(getSignerInfo(), true) : null;
        if (jx61Var == null) {
            throw new CAdESException("Invalid generator type", IAdESException.ecInternal);
        }
        JCPLogger.fine("Setting global options...");
        jx61Var.setProvider(this.provider);
        jx61Var.signatureCertificates.addAll(this.signatureCertificates);
        jx61Var.signatureCRLs.addAll(this.signatureCRLs);
        InputStream inputStream = this.x;
        if (inputStream != null) {
            jx61Var.x = inputStream;
        }
        jx61Var.w = this.w;
        jx61Var.y = this.y;
        jx61Var.setOptions(this.options);
        if (i87Var instanceof wt61) {
            JCPLogger.fine("Setting specific A (archive) options...");
            CAdESSignerAImpl cAdESSignerAImpl = (CAdESSignerAImpl) jx61Var;
            wt61 wt61Var = (wt61) i87Var;
            TimeStampData timeStampData3 = wt61Var.O;
            if (timeStampData3 == null || (timeStampData2 = wt61Var.N) == null || !timeStampData3.equals(timeStampData2)) {
                timeStampData = wt61Var.N;
                if (timeStampData == null) {
                    timeStampData = wt61Var.P;
                }
            } else {
                timeStampData = wt61Var.Q;
            }
            cAdESSignerAImpl.F = timeStampData;
            cAdESSignerAImpl.G = wt61Var.P;
        }
        if (i87Var instanceof nx61) {
            JCPLogger.fine("Setting specific X Long Type 1 options...");
            TimeStampData j = ((nx61) i87Var).j();
            if (j != null) {
                ((CAdESSignerXLT1Impl) jx61Var).D = new TimeStampData(j.getTimeStampToken(), j.getTspData());
            }
        }
        if (i87Var instanceof sw61) {
            JCPLogger.fine("Setting specific T options...");
            jx61Var.C = ((sw61) i87Var).d();
        }
        if (jx61Var instanceof CAdESSignerXLT1) {
            JCPLogger.fine("Setting certificates ands CRL for A (archive) signer...");
            jx61Var.e(this.archiveSignatureCertificateToBeHashedStore);
            jx61Var.f(this.archiveSignatureValidationDataToBeHashedStore);
        }
        jx61Var.h();
        return jx61Var;
    }

    public final void m(Set set, Set set2, boolean z) {
        JCPLogger.subEnter();
        if (z) {
            StringBuilder sb = new StringBuilder("Verifying counter signers, total: ");
            ArrayList arrayList = this.c;
            sb.append(arrayList.size());
            sb.append("...");
            JCPLogger.fine(sb.toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((CAdESSigner) it.next()).verify(set, set2, (Integer) null, true);
            }
            JCPLogger.fine("Counter signers have been verified.");
        }
        JCPLogger.subExit();
    }

    public boolean n(Integer num, String str) {
        boolean equals = this.a.getDigestAlgOID().equals(str);
        if (num.equals(CAdESParameters.CAdES_A)) {
            JCPLogger.fine("Checking if the same digest algorithm is used for message-digest and future archive-timestamp...");
            if (!equals && this.w) {
                throw new CAdESException("Digest cannot be recalculated because the signed data is being required but raw digest has been set.", IAdESException.ecGetMessageDigestFailure);
            }
            if (!equals) {
                throw new CAdESException("Digest cannot be recalculated for this signature type. If the signature type is CAdES-BES use consecutive enhancing detached BES -> 'X Long Type 1' -> A, or if the signature type is CAdES-T use consecutive enhancing detached T -> 'X Long Type 1' -> A, or create detached signature with type 'X Long Type 1' and enhance it to A, or use the signer's digest algorithm and do not use a new digest algorithm for enhancing. Step 'X Long Type 1' -> A requires 'X Long Type 1' to be detached, so if source BES or T is attached than BufferedCAdESSignature can be used.", IAdESException.ecCAdESANoIdenticDigAlgFailure);
            }
        }
        JCPLogger.fine("Same digest algorithm used: " + equals);
        return equals;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        super.verify(set, set2, (Integer) null, true);
        JCPLogger.fine("Validating the signature identifier...");
        AdESUtility.compareSID2SigningCertificate(this.a.getSID(), (cr80) this.z.c);
        if (!getSignatureType().equals(AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE) && !getSignatureType().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE) && !getSignatureType().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE)) {
            m(set, set2, z);
        }
        JCPLogger.fine("%%% Signer has been verified %%%");
        JCPLogger.subExit();
    }

    public CAdESSignerBESImpl(acs0 acs0Var, Integer num, boolean z) {
        super(acs0Var, num);
        this.B = z;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        return enhance(str, str2, list, null, str3, num, null);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws CAdESException {
        return enhance(str, str2, list, str3, num, (xc3) null);
    }
}
