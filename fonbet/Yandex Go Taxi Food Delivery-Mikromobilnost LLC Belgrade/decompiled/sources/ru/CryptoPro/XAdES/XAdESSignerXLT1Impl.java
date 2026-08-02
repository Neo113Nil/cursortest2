package ru.CryptoPro.XAdES;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.ax61;
import defpackage.b64;
import defpackage.cr80;
import defpackage.cs61;
import defpackage.dr61;
import defpackage.du61;
import defpackage.er80;
import defpackage.ft61;
import defpackage.hs61;
import defpackage.ht61;
import defpackage.hu61;
import defpackage.kt61;
import defpackage.l2;
import defpackage.lq61;
import defpackage.lr61;
import defpackage.lw61;
import defpackage.m8z0;
import defpackage.mr60;
import defpackage.mw61;
import defpackage.nr60;
import defpackage.nr61;
import defpackage.ot61;
import defpackage.p4x0;
import defpackage.pu61;
import defpackage.qu61;
import defpackage.qx61;
import defpackage.r0x;
import defpackage.rbf;
import defpackage.rr61;
import defpackage.rs61;
import defpackage.rv61;
import defpackage.rza1;
import defpackage.s5z;
import defpackage.sbf;
import defpackage.su61;
import defpackage.tbf;
import defpackage.ubf;
import defpackage.ux61;
import defpackage.v2k0;
import defpackage.v3;
import defpackage.vu61;
import defpackage.xw61;
import defpackage.ys61;
import defpackage.yt61;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import javax.security.auth.x500.X500Principal;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.PKUPParameterValidatorImpl;
import ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilderImpl;
import ru.CryptoPro.AdES.evidence.RevocationValidatorImpl;
import ru.CryptoPro.AdES.evidence.wrapper.BasicOCSPResponseWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.CertificateListWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.CrlOcspRefWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.RevocationValuesWrapper;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedInternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.ExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.exception.XMLTimeStampValidationException;
import ru.CryptoPro.XAdES.util.SystemUtils;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public class XAdESSignerXLT1Impl extends XAdESSignerTImpl implements CRLUtility, CertificateUtility, DigestUtility, XAdESSignerXLT1 {
    public SigAndRefsTimeStamp B;
    public String C;
    public final HashSet D;
    public final HashSet E;
    public CertificateChainEvidenceBuilderImpl F;

    public XAdESSignerXLT1Impl(Element element, Integer num) {
        super(element, num);
        this.B = null;
        this.C = null;
        this.D = new HashSet();
        this.E = new HashSet();
        this.F = null;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public final void e(String str, Options options) {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting external timestamp...");
        cl_64 cl_64Var = cl_64.K;
        TreeMap treeMap = this.z;
        List list = (List) treeMap.get(cl_64Var);
        if (list == null || list.isEmpty()) {
            list = (List) treeMap.get(cl_64.L);
        }
        if (list == null || list.isEmpty()) {
            throw new XAdESException("External timestamp not found", IAdESException.ecTimestampNotFound);
        }
        SigAndRefsTimeStamp sigAndRefsTimeStamp = (SigAndRefsTimeStamp) list.get(0);
        this.B = sigAndRefsTimeStamp;
        Date date = (Date) sigAndRefsTimeStamp.getTimestampToken().c.b;
        lq61 lq61Var = new lq61(this.A.getHashDataInfo(), this.A.getDocument());
        lq61Var.c = str;
        lq61Var.w = this.C;
        try {
            JCPLogger.fine("Validating enhanced internal timestamp...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            EnhancedInternalTimeStampValidationProcessImpl enhancedInternalTimeStampValidationProcessImpl = new EnhancedInternalTimeStampValidationProcessImpl(lq61Var, this.A.getTimestampToken());
            enhancedInternalTimeStampValidationProcessImpl.setCertificateValues(this.D);
            enhancedInternalTimeStampValidationProcessImpl.setExternalDate(date);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) enhancedInternalTimeStampValidationProcessImpl);
            JCPLogger.fine("Enhanced internal timestamp validated.");
            JCPLogger.fine("Validating signer certificate chain on external date...");
            ComplexCertificateChainValidatorImpl complexCertificateChainValidatorImpl = new ComplexCertificateChainValidatorImpl();
            complexCertificateChainValidatorImpl.setValidationDate(date);
            complexCertificateChainValidatorImpl.setProvider(str);
            complexCertificateChainValidatorImpl.setSignerMustHaveOcspEvidence(true);
            complexCertificateChainValidatorImpl.setCertificateRole(CertificateItem.CertificateRole.Signer);
            complexCertificateChainValidatorImpl.setCompleteCertificateReferences(Collections.singletonList(this.F.getSignerCertificateReference()));
            complexCertificateChainValidatorImpl.setCompleteCertificateReferences(this.F.getCompleteCertificateReferences());
            complexCertificateChainValidatorImpl.setCompleteRevocationReferences(this.F.getCompleteRevocationReferences());
            complexCertificateChainValidatorImpl.setRevocationValues(this.F.getRevocationValues());
            complexCertificateChainValidatorImpl.setNeedOfIssuerSerial(false);
            complexCertificateChainValidatorImpl.validate(this.signerCertificateChain, (List) null);
            JCPLogger.fine("Signer certificate chain validated.");
            JCPLogger.fine("Validating revocation evidences on internal and external dates...");
            Date date2 = (Date) this.A.getTimestampToken().c.b;
            RevocationValidatorImpl revocationValidatorImpl = new RevocationValidatorImpl();
            revocationValidatorImpl.setProvider(str);
            revocationValidatorImpl.setValidationDate(date);
            revocationValidatorImpl.setInternalDate(date2);
            revocationValidatorImpl.setExternalDate(date);
            revocationValidatorImpl.setCompleteCertificateReferences(Collections.singletonList(this.F.getSignerCertificateReference()));
            revocationValidatorImpl.setCompleteCertificateReferences(this.F.getCompleteCertificateReferences());
            revocationValidatorImpl.setCompleteRevocationReferences(this.F.getCompleteRevocationReferences());
            revocationValidatorImpl.setCertificateValues(new HashSet(this.F.getCertificateValues()));
            revocationValidatorImpl.setRevocationValues(this.F.getRevocationValues());
            revocationValidatorImpl.validate((Object) null);
            JCPLogger.fine("Validation of signer certificate chain and revocation evidences completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws XAdESException {
        throw new XAdESException("The signature has type XAdES-X Long Type 1 therefore it does not need to be enhanced", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getBuildingDate() {
        return getExternalDate();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<X509Certificate> getCertificateValues() {
        return Collections.unmodifiableList(((lw61) this.y).D);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<cr80> getCompleteCertificateReferences() {
        return Collections.unmodifiableList(((lw61) this.y).B);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<tbf> getCompleteRevocationReferences() {
        return Collections.unmodifiableList(((lw61) this.y).C);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1
    public m8z0 getEarliestValidSigAndRefsTimeStampToken() {
        SigAndRefsTimeStamp sigAndRefsTimeStamp = this.B;
        if (sigAndRefsTimeStamp != null) {
            return sigAndRefsTimeStamp.getTimestampToken();
        }
        return null;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getExternalDate() {
        return (Date) this.B.getTimestampToken().c.b;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public v2k0 getRevocationValues() {
        return ((lw61) this.y).E;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1
    public List<m8z0> getSigAndRefsTimestampTokens() {
        List i = ((lw61) this.y).i();
        if (i == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(((SigAndRefsTimeStamp) it.next()).getTimestampToken());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return XAdESParameters.XAdES_X_Long_Type_1;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getValidationDate() {
        return getExternalDate();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public final void i() {
        this.y = new lw61(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBESImpl
    public final void j(qu61 qu61Var, String str, Element element) {
        TreeMap treeMap;
        cl_64[] cl_64VarArr;
        String str2;
        String str3;
        cl_64[] cl_64VarArr2;
        String str4;
        Iterator it;
        tbf tbfVar;
        ubf[] ubfVarArr;
        int i;
        String str5;
        int i2;
        yt61 yt61Var;
        mw61 mw61Var;
        String str6;
        ft61 ft61Var;
        tbf tbfVar2;
        nr60[] nr60VarArr;
        int i3;
        cl_64[] cl_64VarArr3;
        String str7;
        hs61 hs61Var;
        int i4;
        Element f;
        BasicOCSPResponseWrapper[] basicOCSPResponseWrapperArr;
        Document document;
        xw61 xw61Var;
        su61 su61Var;
        Element f2;
        Element f3;
        XAdESSignerXLT1Impl xAdESSignerXLT1Impl = this;
        JCPLogger.subEnter();
        super.j(qu61Var, str, element);
        JCPLogger.subEnter();
        JCPLogger.fine("Building references, certificates and revocation values...");
        JCPLogger.fine("Extracting enhanced internal timestamp...");
        cl_64 cl_64Var = cl_64.N;
        TreeMap treeMap2 = xAdESSignerXLT1Impl.z;
        ot61 ot61Var = (ot61) treeMap2.get(cl_64Var);
        if (ot61Var == null) {
            throw new XAdESException("Enhanced internal timestamp not found", IAdESException.ecTimestampNotFound);
        }
        xAdESSignerXLT1Impl.A = ot61Var;
        Date date = (Date) ot61Var.getTimestampToken().c.b;
        CertificateChainEvidenceBuilderImpl certificateChainEvidenceBuilderImpl = new CertificateChainEvidenceBuilderImpl();
        xAdESSignerXLT1Impl.F = certificateChainEvidenceBuilderImpl;
        certificateChainEvidenceBuilderImpl.setSignerMustHaveOcspEvidence(true);
        xAdESSignerXLT1Impl.F.setProvider(xAdESSignerXLT1Impl.provider);
        xAdESSignerXLT1Impl.F.setCertificateValues(xAdESSignerXLT1Impl.signatureCertificates);
        xAdESSignerXLT1Impl.F.setCertificateValues(xAdESSignerXLT1Impl.D);
        xAdESSignerXLT1Impl.F.setCRLs(xAdESSignerXLT1Impl.signatureCRLs);
        xAdESSignerXLT1Impl.F.setCRLs(xAdESSignerXLT1Impl.E);
        xAdESSignerXLT1Impl.F.setInternalDate(date);
        xAdESSignerXLT1Impl.F.setCertificateRole(CertificateItem.CertificateRole.Signer);
        try {
            xAdESSignerXLT1Impl.F.build(xAdESSignerXLT1Impl.signerCertificateChain);
            List completeCertificateReferences = xAdESSignerXLT1Impl.F.getCompleteCertificateReferences();
            JCPLogger.subEnter();
            if (completeCertificateReferences == null || completeCertificateReferences.size() <= 0) {
                treeMap2.remove(cl_64.A);
            } else {
                treeMap2.put(cl_64.A, completeCertificateReferences);
            }
            JCPLogger.subExit();
            List completeRevocationReferences = xAdESSignerXLT1Impl.F.getCompleteRevocationReferences();
            JCPLogger.subEnter();
            if (completeRevocationReferences == null || completeRevocationReferences.size() <= 0) {
                treeMap2.remove(cl_64.C);
            } else {
                treeMap2.put(cl_64.C, completeRevocationReferences);
            }
            JCPLogger.subExit();
            List certificateValues = xAdESSignerXLT1Impl.F.getCertificateValues();
            JCPLogger.subEnter();
            if (certificateValues == null || certificateValues.size() <= 0) {
                treeMap2.remove(cl_64.G);
            } else {
                treeMap2.put(cl_64.G, certificateValues);
            }
            JCPLogger.subExit();
            v2k0 revocationValues = xAdESSignerXLT1Impl.F.getRevocationValues();
            JCPLogger.subEnter();
            if (revocationValues != null) {
                treeMap2.put(cl_64.H, revocationValues);
            } else {
                treeMap2.remove(cl_64.H);
            }
            JCPLogger.subExit();
            JCPLogger.fine("Building references, certificates and revocation values completed.");
            JCPLogger.subExit();
            cl_64[] values = cl_64.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                String str8 = "http://www.w3.org/2000/xmlns/";
                String str9 = XAdESParameters.XADES141_SIGNATURE_NAMESPACE;
                if (i5 >= length) {
                    cl_64[] values2 = cl_64.values();
                    int length2 = values2.length;
                    int i6 = 0;
                    while (i6 < length2) {
                        cl_64 cl_64Var2 = values2[i6];
                        Object obj = treeMap2.get(cl_64Var2);
                        if (obj == null || !(cl_64.K.equals(cl_64Var2) || cl_64.L.equals(cl_64Var2))) {
                            treeMap = treeMap2;
                            cl_64VarArr = values2;
                            str2 = str8;
                            str3 = str9;
                        } else {
                            String str10 = str9;
                            mw61 n = XAdESSignerBESImpl.n(qu61Var);
                            n.getClass();
                            Iterator it2 = ((List) obj).iterator();
                            int i7 = 0;
                            while (it2.hasNext()) {
                                String str11 = str10;
                                String str12 = str8;
                                new vu61(n.C, n, (SigAndRefsTimeStamp) it2.next(), i7, n.x, n.y, n.z, str, element, n.w).a(str12, "xmlns:xades141", str11);
                                str8 = str12;
                                str10 = str11;
                                i7++;
                                treeMap2 = treeMap2;
                                values2 = values2;
                            }
                            treeMap = treeMap2;
                            cl_64VarArr = values2;
                            str3 = str10;
                            str2 = str8;
                        }
                        i6++;
                        str8 = str2;
                        str9 = str3;
                        treeMap2 = treeMap;
                        values2 = cl_64VarArr;
                    }
                    JCPLogger.subExit();
                    return;
                }
                cl_64 cl_64Var3 = values[i5];
                Object obj2 = treeMap2.get(cl_64Var3);
                if (obj2 != null) {
                    if (cl_64.A.equals(cl_64Var3) || cl_64.B.equals(cl_64Var3)) {
                        cl_64VarArr2 = values;
                        mw61 n2 = XAdESSignerBESImpl.n(qu61Var);
                        List<cr80> list = (List) obj2;
                        String str13 = xAdESSignerXLT1Impl.provider;
                        if (n2.y == null) {
                            Element b = n2.b(cl_63.F, XAdESParameters.XADES141_SIGNATURE_NAMESPACE);
                            if (b != null) {
                                n2.y = new rr61(b, n2.w);
                            } else {
                                Element f4 = n2.f(cl_63.F);
                                if (f4 != null) {
                                    n2.y = new rr61(f4, n2.b, n2.c, n2.w);
                                } else {
                                    Element f5 = n2.f(cl_63.E);
                                    if (f5 != null) {
                                        n2.y = new lr61(f5, n2.w);
                                    }
                                }
                            }
                        }
                        dr61 dr61Var = n2.y;
                        n2.y = dr61Var;
                        if (dr61Var != null) {
                            throw new XAdESException("The collection of complete certificate references already exists.", IAdESException.ecNodeEncodingFailed);
                        }
                        Document document2 = n2.C;
                        String str14 = n2.w;
                        rr61 rr61Var = new rr61(document2, n2, cl_63.F, XAdESParameters.XADES141_SIGNATURE_PREFIX, XAdESParameters.XADES141_SIGNATURE_NAMESPACE, str14);
                        if (list.isEmpty()) {
                            throw new XAdESException("The certificates reference collection can not be NULL or empty.", IAdESException.ecNodeEncodingFailed);
                        }
                        if (str != null) {
                            rr61Var.a(null, "Id", str.concat("-CertRefs"));
                        }
                        ft61 ft61Var2 = new ft61(document2, rr61Var, "CertRefs", XAdESParameters.XADES141_SIGNATURE_PREFIX, XAdESParameters.XADES141_SIGNATURE_NAMESPACE, str14, 2);
                        if (list.isEmpty()) {
                            throw new XAdESException("The certificate references collection can not be NULL or empty.", IAdESException.ecNodeEncodingFailed);
                        }
                        ft61Var2.y = new ArrayList(list.size());
                        for (cr80 cr80Var : list) {
                            String str15 = str14;
                            Document document3 = document2;
                            rv61 rv61Var = new rv61(document3, ft61Var2, "Cert", XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, str15);
                            try {
                                String str16 = str13;
                                rv61Var.x = new ax61(document3, rv61Var, "CertDigest", XAdESUtility.findDigestUriByDigestOid(cr80Var.m().a.a), cr80Var.n(), rv61Var.b, rv61Var.c, str15, str16);
                                try {
                                    r0x r0xVar = cr80Var.b;
                                    yt61 yt61Var2 = new yt61(document3, rv61Var, "IssuerSerialV2", rv61Var.b, rv61Var.c, str15, 1);
                                    document2 = document3;
                                    str14 = str15;
                                    yt61Var2.y = null;
                                    try {
                                        yt61Var2.e().setTextContent(new Encoder().encode(r0xVar.getEncoded()));
                                        rv61Var.y = yt61Var2;
                                        ft61Var2.y.add(rv61Var);
                                        str13 = str16;
                                    } catch (Exception e) {
                                        throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
                                    }
                                } catch (Exception e2) {
                                    throw new XAdESException(e2, IAdESException.ecNodeEncodingFailed);
                                }
                            } catch (Exception e3) {
                                throw new XAdESException(e3, IAdESException.ecNodeEncodingFailed);
                            }
                        }
                        rr61Var.x = ft61Var2;
                        rr61Var.a("http://www.w3.org/2000/xmlns/", "xmlns:xades141", XAdESParameters.XADES141_SIGNATURE_NAMESPACE);
                        n2.y = rr61Var;
                    } else if (cl_64.C.equals(cl_64Var3) || cl_64.D.equals(cl_64Var3)) {
                        String str17 = str;
                        int i8 = 0;
                        mw61 n3 = XAdESSignerBESImpl.n(qu61Var);
                        List<tbf> list2 = (List) obj2;
                        String str18 = xAdESSignerXLT1Impl.provider;
                        if (n3.z == null && (f = n3.f(cl_63.G)) != null) {
                            n3.z = new hs61(f, n3.b, n3.c, n3.w);
                        }
                        cs61 cs61Var = n3.z;
                        n3.z = cs61Var;
                        if (cs61Var != null) {
                            throw new XAdESException("The collection of complete revocation references already exists.", IAdESException.ecNodeEncodingFailed);
                        }
                        Document document4 = n3.C;
                        String str19 = n3.b;
                        String str20 = n3.c;
                        String str21 = n3.w;
                        String str22 = str19;
                        hs61 hs61Var2 = new hs61(document4, n3, cl_63.G, str22, str20, str21);
                        if (list2.isEmpty()) {
                            throw new XAdESException("The revocation reference collection can not be NULL or empty.", IAdESException.ecNodeEncodingFailed);
                        }
                        if (str17 != null) {
                            hs61Var2.a(null, "Id", str17.concat("-RevRefs"));
                        }
                        hs61 hs61Var3 = hs61Var2;
                        ft61 ft61Var3 = new ft61(document4, hs61Var3, "OCSPRefs", str22, str20, str21, 1);
                        ft61Var3.y = new ArrayList();
                        for (tbf tbfVar3 : list2) {
                            mr60 ocspids = tbfVar3.getOcspids();
                            if (ocspids != null) {
                                nr60[] m = ocspids.m();
                                int length3 = m.length;
                                int i9 = i8;
                                while (i9 < length3) {
                                    nr60 nr60Var = m[i9];
                                    if (nr60Var != null) {
                                        String index = tbfVar3 instanceof CrlOcspRefWrapper ? ((CrlOcspRefWrapper) tbfVar3).getIndex() : null;
                                        ft61 ft61Var4 = ft61Var3;
                                        hu61 hu61Var = new hu61(document4, ft61Var4, "OCSPRef", str22, str20, str21);
                                        ft61Var = ft61Var4;
                                        tbfVar2 = tbfVar3;
                                        String str23 = str18;
                                        cl_64VarArr3 = values;
                                        mw61Var = n3;
                                        hs61Var = hs61Var3;
                                        i3 = length3;
                                        nr60VarArr = m;
                                        String str24 = str17;
                                        String str25 = index;
                                        String str26 = str22;
                                        i4 = i9;
                                        du61 du61Var = new du61(document4, hu61Var, nr60Var.a, str25, str24, str26, str20, str21);
                                        str17 = str24;
                                        str7 = str26;
                                        hu61Var.x = du61Var;
                                        er80 er80Var = nr60Var.b;
                                        rs61 rs61Var = new rs61(document4, hu61Var, "DigestAlgAndValue", XAdESUtility.findDigestUriByDigestOid(er80Var.m().a.a), er80Var.n(), str7, str20, str21, str23);
                                        str6 = str23;
                                        hu61Var.y = rs61Var;
                                        ft61Var.y.add(hu61Var);
                                    } else {
                                        mw61Var = n3;
                                        str6 = str18;
                                        ft61Var = ft61Var3;
                                        tbfVar2 = tbfVar3;
                                        nr60VarArr = m;
                                        i3 = length3;
                                        cl_64VarArr3 = values;
                                        str7 = str22;
                                        hs61Var = hs61Var3;
                                        i4 = i9;
                                    }
                                    i9 = i4 + 1;
                                    str18 = str6;
                                    hs61Var3 = hs61Var;
                                    ft61Var3 = ft61Var;
                                    m = nr60VarArr;
                                    tbfVar3 = tbfVar2;
                                    length3 = i3;
                                    str22 = str7;
                                    n3 = mw61Var;
                                    values = cl_64VarArr3;
                                }
                            }
                            str18 = str18;
                            hs61Var3 = hs61Var3;
                            ft61Var3 = ft61Var3;
                            str22 = str22;
                            n3 = n3;
                            values = values;
                            i8 = 0;
                        }
                        mw61 mw61Var2 = n3;
                        String str27 = str18;
                        cl_64VarArr2 = values;
                        String str28 = str22;
                        hs61 hs61Var4 = hs61Var3;
                        hs61Var4.x = ft61Var3.h();
                        ft61 ft61Var5 = new ft61(document4, hs61Var3, "CRLRefs", str28, str20, str21, 0);
                        String str29 = str28;
                        ft61Var5.y = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            tbf tbfVar4 = (tbf) it3.next();
                            sbf crlids = tbfVar4.getCrlids();
                            if (crlids != null) {
                                ubf[] m2 = crlids.m();
                                int length4 = m2.length;
                                int i10 = 0;
                                while (i10 < length4) {
                                    ubf ubfVar = m2[i10];
                                    if (ubfVar != null) {
                                        String index2 = tbfVar4 instanceof CrlOcspRefWrapper ? ((CrlOcspRefWrapper) tbfVar4).getIndex() : null;
                                        nr61 nr61Var = new nr61(document4, ft61Var5, "CRLRef", str29, str20, str21);
                                        rbf rbfVar = ubfVar.b;
                                        er80 er80Var2 = ubfVar.a;
                                        String str30 = str29;
                                        yt61 yt61Var3 = new yt61(document4, nr61Var, "CRLIdentifier", str30, str20, str21, 2);
                                        it = it3;
                                        tbfVar = tbfVar4;
                                        str4 = str27;
                                        Element e4 = yt61Var3.e();
                                        if (index2 == null || str17 == null) {
                                            ubfVarArr = m2;
                                            i2 = length4;
                                            i = i10;
                                            yt61Var = yt61Var3;
                                        } else {
                                            ubfVarArr = m2;
                                            i2 = length4;
                                            String l = b64.l(ShimmerDivHandler.NUMBER_SING, str17, "-EncapsulatedCRLValue-", index2);
                                            yt61Var = yt61Var3;
                                            yt61Var.y = l;
                                            i = i10;
                                            yt61Var.a(null, GlobalRouterActivity.URI, l);
                                        }
                                        try {
                                            X500Principal x500Principal = new X500Principal(rbfVar.a.getEncoded());
                                            v3 v3Var = rbfVar.b;
                                            l2 l2Var = rbfVar.c;
                                            BigInteger x = l2Var == null ? null : l2Var.x();
                                            Element g = yt61Var.g("Issuer");
                                            g.setPrefix(str30);
                                            e4.appendChild(g);
                                            g.setTextContent(x500Principal.getName());
                                            Element g2 = yt61Var.g("IssueTime");
                                            g2.setPrefix(str30);
                                            e4.appendChild(g2);
                                            try {
                                                v3Var.getClass();
                                                g2.setTextContent(SystemUtils.formatDate(new SimpleDateFormat("yyMMddHHmmssz", s5z.a).parse(v3Var.u())));
                                                if (x != null) {
                                                    Element g3 = yt61Var.g("Number");
                                                    g3.setPrefix(str30);
                                                    e4.appendChild(g3);
                                                    g3.setTextContent(x.toString());
                                                }
                                                nr61Var.y = yt61Var;
                                                str5 = str30;
                                                nr61Var.x = new rs61(document4, nr61Var, "DigestAlgAndValue", XAdESUtility.findDigestUriByDigestOid(er80Var2.m().a.a), er80Var2.n(), str5, str20, str21, str4);
                                                ft61Var5.y.add(nr61Var);
                                            } catch (ParseException e5) {
                                                throw new XAdESException(e5, IAdESException.ecNodeEncodingFailed);
                                            }
                                        } catch (IOException e6) {
                                            throw new XAdESException(e6, IAdESException.ecNodeEncodingFailed);
                                        }
                                    } else {
                                        str4 = str27;
                                        it = it3;
                                        tbfVar = tbfVar4;
                                        ubfVarArr = m2;
                                        i = i10;
                                        str5 = str29;
                                        i2 = length4;
                                    }
                                    i10 = i + 1;
                                    it3 = it;
                                    tbfVar4 = tbfVar;
                                    m2 = ubfVarArr;
                                    length4 = i2;
                                    str29 = str5;
                                    str27 = str4;
                                }
                            }
                            it3 = it3;
                            str29 = str29;
                            str27 = str27;
                        }
                        hs61Var4.y = ft61Var5.h();
                        mw61Var2.z = hs61Var4;
                    } else if (cl_64.G.equals(cl_64Var3)) {
                        mw61 n4 = XAdESSignerBESImpl.n(qu61Var);
                        List list3 = (List) obj2;
                        if (n4.A == null && (f3 = n4.f(cl_63.K)) != null) {
                            n4.A = new ux61(f3, n4.b, n4.c, n4.w);
                        }
                        qx61 qx61Var = n4.A;
                        n4.A = qx61Var;
                        if (qx61Var != null) {
                            throw new XAdESException("The collection of certificates already exists.", IAdESException.ecNodeEncodingFailed);
                        }
                        n4.A = new ux61(n4.C, n4, list3, str, n4.b, n4.c, n4.w);
                    } else {
                        String str31 = str;
                        if (cl_64.H.equals(cl_64Var3)) {
                            mw61 n5 = XAdESSignerBESImpl.n(qu61Var);
                            v2k0 v2k0Var = (v2k0) obj2;
                            if (n5.B == null && (f2 = n5.f(cl_63.L)) != null) {
                                n5.B = new su61(f2, n5.b, n5.c, n5.w);
                            }
                            su61 su61Var2 = n5.B;
                            n5.B = su61Var2;
                            if (su61Var2 != null) {
                                throw new XAdESException("The revocation values already exists.", IAdESException.ecNodeEncodingFailed);
                            }
                            Document document5 = n5.C;
                            String str32 = n5.b;
                            String str33 = n5.c;
                            String str34 = n5.w;
                            Document document6 = document5;
                            xw61 xw61Var2 = new xw61(document6, n5, cl_63.L, str32, str33, str34);
                            if (str31 != null) {
                                xw61Var2.a(null, "Id", str31.concat("-RevValues"));
                            }
                            if (!(v2k0Var instanceof RevocationValuesWrapper)) {
                                throw new XAdESException("RevocationValues has unsupported type.", new Integer[0]);
                            }
                            RevocationValuesWrapper revocationValuesWrapper = (RevocationValuesWrapper) v2k0Var;
                            CertificateListWrapper[] crlValWrappers = revocationValuesWrapper.getCrlValWrappers();
                            BasicOCSPResponseWrapper[] ocspValWrappers = revocationValuesWrapper.getOcspValWrappers();
                            if (crlValWrappers == null || crlValWrappers.length <= 0) {
                                basicOCSPResponseWrapperArr = ocspValWrappers;
                                document = document6;
                                xw61Var = xw61Var2;
                            } else {
                                pu61 pu61Var = new pu61(document6, xw61Var2, "CRLValues", str32, str33, str34);
                                su61 su61Var3 = xw61Var2;
                                pu61Var.x = new HashSet();
                                int length5 = crlValWrappers.length;
                                int i11 = 0;
                                while (i11 < length5) {
                                    BasicOCSPResponseWrapper[] basicOCSPResponseWrapperArr2 = ocspValWrappers;
                                    Document document7 = document6;
                                    pu61Var.x.add(new ys61(document7, pu61Var, crlValWrappers[i11], str31, str32, str33, str34));
                                    i11++;
                                    str31 = str;
                                    crlValWrappers = crlValWrappers;
                                    length5 = length5;
                                    document6 = document7;
                                    ocspValWrappers = basicOCSPResponseWrapperArr2;
                                }
                                basicOCSPResponseWrapperArr = ocspValWrappers;
                                document = document6;
                                su61Var3.x = pu61Var;
                                xw61Var = su61Var3;
                            }
                            if (basicOCSPResponseWrapperArr == null || basicOCSPResponseWrapperArr.length <= 0) {
                                su61Var = xw61Var;
                            } else {
                                Document document8 = document;
                                xw61 xw61Var3 = xw61Var;
                                pu61 pu61Var2 = new pu61(document8, xw61Var3, "OCSPValues", str32, str33, str34);
                                su61 su61Var4 = xw61Var3;
                                pu61Var2.x = new HashSet();
                                int length6 = basicOCSPResponseWrapperArr.length;
                                int i12 = 0;
                                while (i12 < length6) {
                                    BasicOCSPResponseWrapper basicOCSPResponseWrapper = basicOCSPResponseWrapperArr[i12];
                                    int i13 = i12;
                                    Document document9 = document8;
                                    pu61Var2.x.add(new ht61(document9, pu61Var2, basicOCSPResponseWrapper, str, str32, str33, str34));
                                    i12 = i13 + 1;
                                    length6 = length6;
                                    document8 = document9;
                                }
                                su61Var4.y = pu61Var2;
                                su61Var = su61Var4;
                            }
                            n5.B = su61Var;
                        }
                    }
                    i5++;
                    xAdESSignerXLT1Impl = this;
                    values = cl_64VarArr2;
                }
                cl_64VarArr2 = values;
                i5++;
                xAdESSignerXLT1Impl = this;
                values = cl_64VarArr2;
            }
        } catch (AdESException e7) {
            throw new XAdESException(e7, e7.getErrorCode());
        }
    }

    public final void r(List list) {
        JCPLogger.subEnter();
        TreeMap treeMap = this.z;
        if (list == null || list.size() <= 0) {
            treeMap.remove(cl_64.z);
        } else {
            treeMap.put(cl_64.z, list);
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.E.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.D.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.C = str;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerTImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws XAdESException {
        Set<X509Certificate> set3 = set;
        Set<X509CRL> set4 = set2;
        Integer num2 = num;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        if (num2 != null && !num2.equals(XAdESParameters.XAdES_X_Long_Type_1) && !num2.equals(XAdESParameters.XAdES_T) && !num2.equals(XAdESParameters.XAdES_BES)) {
            JCPLogger.infoFormat("Signature type '{0}' ignored, default signature type used.", XAdESType.getSignatureTypeName(num2));
            num2 = null;
        }
        if (num2 == null) {
            num2 = getSignatureType();
        }
        if (num2.equals(XAdESParameters.XAdES_T) || num2.equals(XAdESParameters.XAdES_BES)) {
            try {
                XAdESSignerBinaryImpl e = XAdESSignerFactory.e(this.c, num2);
                e.h();
                e.verify(set3, set4);
            } catch (AdESException e2) {
                throw new XAdESException(e2, e2.getErrorCode());
            }
        } else {
            if (set3 == null) {
                set3 = Collections.EMPTY_SET;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(set3);
            if (set4 == null) {
                set4 = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set4);
            g();
            X509Certificate signerCertificate = getSignerCertificate();
            if (signerCertificate == null) {
                try {
                    findSignerCertificate(unmodifiableSet, set3);
                    signerCertificate = getSignerCertificate();
                    if (signerCertificate == null) {
                        throw new XAdESException("Signer certificate not found", IAdESException.ecSignerCertificateIsNull);
                    }
                } catch (AdESException e3) {
                    throw new XAdESException(e3, e3.getErrorCode());
                }
            }
            JCPLogger.fine("Verifying XML signature...");
            f(signerCertificate);
            if (getSignatureType().equals(XAdESParameters.XAdES_X_Long_Type_1)) {
                JCPLogger.subEnter();
                JCPLogger.fine("Looking for a valid internal timestamp (signature-timestamp) and external timestamp (sig-and-refs-timestamp).");
                XMLTimeStampValidationException xMLTimeStampValidationException = new XMLTimeStampValidationException(IAdESException.ecTimestampInvalid);
                JCPLogger.fine("Preparing timestamps...");
                List<SigAndRefsTimeStamp> i = ((lw61) this.y).i();
                List<ot61> list = (List) ((lw61) this.y).y.get(cl_64.z);
                for (SigAndRefsTimeStamp sigAndRefsTimeStamp : i) {
                    JCPLogger.fine("Select valid internal timestamps...");
                    LinkedList<SignatureTimeStamp> linkedList = new LinkedList();
                    for (ot61 ot61Var : list) {
                        if (!((Date) ot61Var.getTimestampToken().c.b).after((Date) sigAndRefsTimeStamp.getTimestampToken().c.b)) {
                            linkedList.add(ot61Var);
                        }
                    }
                    JCPLogger.fine("Found internal timestamps: ", Integer.valueOf(linkedList.size()));
                    if (!linkedList.isEmpty()) {
                        JCPLogger.fine("Combining attribute set for external timestamp...");
                        Date date = (Date) sigAndRefsTimeStamp.getTimestampToken().c.b;
                        JCPLogger.fine("Validating external timestamp imprint...");
                        String str = sigAndRefsTimeStamp.getTimestampToken().c.p().a;
                        if (sigAndRefsTimeStamp.getHashDataInfo().size() < 4) {
                            sigAndRefsTimeStamp.setAdditionalHashData(linkedList);
                        }
                        lq61 lq61Var = new lq61(sigAndRefsTimeStamp.getHashDataInfo(), sigAndRefsTimeStamp.getDocument());
                        lq61Var.w = str;
                        lq61Var.c = this.provider;
                        try {
                            lq61Var.validateImprint(rza1.b(((p4x0) sigAndRefsTimeStamp.getTimestampToken().c.a).c.b));
                            for (SignatureTimeStamp signatureTimeStamp : linkedList) {
                                JCPLogger.fine("Validating internal timestamp...");
                                String str2 = signatureTimeStamp.getTimestampToken().c.p().a;
                                kt61 kt61Var = new kt61(signatureTimeStamp.getHashDataInfo(), signatureTimeStamp.getDocument());
                                kt61Var.w = str2;
                                kt61Var.c = this.provider;
                                EnhancedInternalTimeStampValidationProcessImpl enhancedInternalTimeStampValidationProcessImpl = new EnhancedInternalTimeStampValidationProcessImpl(kt61Var, signatureTimeStamp.getTimestampToken());
                                enhancedInternalTimeStampValidationProcessImpl.setExternalDate(date);
                                enhancedInternalTimeStampValidationProcessImpl.setParentalDecoder((AdESXLongType1AttributeDecoder) this.y);
                                enhancedInternalTimeStampValidationProcessImpl.setCertificateValues(this.signatureCertificates);
                                enhancedInternalTimeStampValidationProcessImpl.setCRLs(this.signatureCRLs);
                                try {
                                    new TSPTimeStampValidatorImpl().validate((TSPTimeStampValidationProcess) enhancedInternalTimeStampValidationProcessImpl);
                                    Set<X509Certificate> certificateValues = enhancedInternalTimeStampValidationProcessImpl.getCertificateValues();
                                    try {
                                        JCPLogger.fine("Validating external timestamp...");
                                        ExternalTimeStampValidationProcessImpl externalTimeStampValidationProcessImpl = new ExternalTimeStampValidationProcessImpl(lq61Var, sigAndRefsTimeStamp.getTimestampToken());
                                        externalTimeStampValidationProcessImpl.setCertificateValues(this.signatureCertificates);
                                        externalTimeStampValidationProcessImpl.setCertificateValues(certificateValues);
                                        externalTimeStampValidationProcessImpl.setCRLs(this.signatureCRLs);
                                        new TSPTimeStampValidatorImpl().validate((TSPTimeStampValidationProcess) externalTimeStampValidationProcessImpl);
                                        this.A = signatureTimeStamp;
                                        this.B = sigAndRefsTimeStamp;
                                        JCPLogger.fine("External and internal timestamps found!");
                                    } catch (AdESException e4) {
                                        e = e4;
                                        if (i.size() == 1) {
                                            throw new XMLTimeStampValidationException(e, e.getErrorCode());
                                        }
                                        JCPLogger.thrown(e);
                                        xMLTimeStampValidationException.add(e);
                                    }
                                } catch (AdESException e5) {
                                    if (i.size() == 1 && linkedList.size() == 1) {
                                        throw new XMLTimeStampValidationException(e5, e5.getErrorCode());
                                    }
                                    JCPLogger.thrown(e5);
                                    xMLTimeStampValidationException.add(e5);
                                }
                            }
                        } catch (AdESException e6) {
                            e = e6;
                            if (i.size() == 1) {
                                throw new XMLTimeStampValidationException(e, e.getErrorCode());
                            }
                        }
                    }
                }
                if (this.A == null || this.B == null) {
                    JCPLogger.fine("Neither signature-timestamp and nor CAdES-C-timestamp has been found.");
                    throw xMLTimeStampValidationException;
                }
                JCPLogger.subExit();
            }
            try {
                this.signerCertificateChain.clear();
                this.signerCertificateChain.addAll(build(signerCertificate, this.provider, getExternalDate()));
                JCPLogger.fine("Validating signer certificate chain...");
                ComplexCertificateChainValidatorImpl complexCertificateChainValidatorImpl = new ComplexCertificateChainValidatorImpl();
                complexCertificateChainValidatorImpl.setValidationDate(getExternalDate());
                complexCertificateChainValidatorImpl.setProvider(this.provider);
                complexCertificateChainValidatorImpl.setSignerMustHaveOcspEvidence(getSignatureType().equals(XAdESParameters.XAdES_X_Long_Type_1));
                complexCertificateChainValidatorImpl.setCertificateRole(CertificateItem.CertificateRole.Signer);
                complexCertificateChainValidatorImpl.setCompleteCertificateReferences(getCompleteCertificateReferences());
                complexCertificateChainValidatorImpl.setCompleteRevocationReferences(getCompleteRevocationReferences());
                complexCertificateChainValidatorImpl.setRevocationValues(getRevocationValues());
                complexCertificateChainValidatorImpl.setNeedOfIssuerSerial(false);
                HashSet hashSet = new HashSet(this.signerCertificateChain);
                hashSet.remove(this.signerCertificateChain.get(0));
                try {
                    complexCertificateChainValidatorImpl.validate(this.signerCertificateChain, Collections.singletonList(new PKUPParameterValidatorImpl(getInternalDate(), hashSet)));
                    JCPLogger.fine("Validating evidences and its certificate chains...");
                    RevocationValidatorImpl revocationValidatorImpl = new RevocationValidatorImpl();
                    revocationValidatorImpl.setProvider(this.provider);
                    revocationValidatorImpl.setValidationDate(getExternalDate());
                    revocationValidatorImpl.setInternalDate(getInternalDate());
                    revocationValidatorImpl.setExternalDate(getExternalDate());
                    revocationValidatorImpl.setCompleteCertificateReferences(getCompleteCertificateReferences());
                    revocationValidatorImpl.setCompleteRevocationReferences(getCompleteRevocationReferences());
                    revocationValidatorImpl.setCertificateValues(new HashSet(getCertificateValues()));
                    revocationValidatorImpl.setCertificateValues(this.signatureCertificates);
                    revocationValidatorImpl.setRevocationValues(getRevocationValues());
                    try {
                        revocationValidatorImpl.validate((Object) null);
                    } catch (AdESException e7) {
                        throw new XAdESException(e7, e7.getErrorCode());
                    }
                } catch (AdESException e8) {
                    throw new XAdESException(e8, e8.getErrorCode());
                }
            } catch (AdESException e9) {
                throw new XAdESException(e9, e9.getErrorCode());
            }
        }
        JCPLogger.fine("%%% Signer is verified %%%");
        JCPLogger.subExit();
    }

    public XAdESSignerXLT1Impl(Element element) {
        this(element, XAdESParameters.XAdES_X_Long_Type_1);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException {
        JCPLogger.subEnter();
        verify(set, set2, null, false);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerXLT1
    public void verify() throws XAdESException {
        JCPLogger.subEnter();
        verify(null, null);
        JCPLogger.subExit();
    }
}
