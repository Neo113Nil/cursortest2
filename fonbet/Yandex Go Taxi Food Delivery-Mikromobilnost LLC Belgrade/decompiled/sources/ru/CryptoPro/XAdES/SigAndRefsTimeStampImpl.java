package ru.CryptoPro.XAdES;

import defpackage.cs61;
import defpackage.dr61;
import defpackage.lq61;
import defpackage.ot61;
import defpackage.qu61;
import defpackage.xw61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.CAdES.timestamp.external.ExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.transform.HashDataInfoWrapper;

/* loaded from: classes4.dex */
public class SigAndRefsTimeStampImpl extends SignatureTimeStampImpl implements SigAndRefsTimeStamp, XAdESParameters {
    public final ArrayList G;
    public dr61 H;
    public cs61 I;

    public SigAndRefsTimeStampImpl(String str) {
        super(str);
        this.G = new ArrayList();
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStampImpl, ru.CryptoPro.XAdES.SignatureTimeStamp
    public void generateEncapsulatedTimeStamp(Document document, String str) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Creating sig-and-refs-timestamp (external)...");
        c(document, str);
        try {
            JCPLogger.fine("Preparing data for external timestamp...");
            List singletonList = Collections.singletonList(SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
            Iterator it = this.G.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                ArrayList arrayList = this.B;
                if (!hasNext) {
                    arrayList.add(new HashDataInfoWrapper(((xw61) this.H).e(), singletonList));
                    arrayList.add(new HashDataInfoWrapper(((xw61) this.I).e(), singletonList));
                    lq61 lq61Var = new lq61(arrayList, document);
                    JCPLogger.fine("Digest OID found: " + this.x);
                    lq61Var.w = this.x;
                    lq61Var.c = this.y;
                    JCPLogger.fine("Receiving external timestamp...");
                    TSPTimeStampImpl tSPTimeStampImpl = new TSPTimeStampImpl();
                    JCPLogger.fine("Digest OID found: " + this.x);
                    tSPTimeStampImpl.setDigestAlgorithm(this.x);
                    tSPTimeStampImpl.setProvider(this.y);
                    tSPTimeStampImpl.retrieve(this.E, lq61Var);
                    this.w = tSPTimeStampImpl.get();
                    verify(null, null);
                    JCPLogger.subExit();
                    return;
                }
                arrayList.add(new HashDataInfoWrapper((Element) it.next(), singletonList));
            }
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.SigAndRefsTimeStamp
    public void setAdditionalHashData(List<ot61> list) throws XAdESException {
        ArrayList arrayList;
        JCPLogger.fine("HashDataInfo not found, trying to find canonicalization method and elements...");
        Element b = this.b.b("CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#");
        String attribute = (b == null || !b.hasAttribute("Algorithm")) ? SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM : b.getAttribute("Algorithm");
        qu61 a = XAdESType.a(this.c);
        if (a == null) {
            throw new XAdESException("Node QualifyingProperties not found", IAdESException.ecNodeNotFound);
        }
        Element d = XAdESType.d(a);
        if (d == null) {
            throw new XAdESException("Node UnsignedSignatureProperties not found", IAdESException.ecNodeNotFound);
        }
        Iterator<ot61> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.B;
            if (!hasNext) {
                break;
            } else {
                arrayList.add(new HashDataInfoWrapper(it.next().getElement(), Collections.singletonList(attribute)));
            }
        }
        NodeList elementsByTagNameNS = d.getElementsByTagNameNS(XAdESParameters.XADES141_SIGNATURE_NAMESPACE, cl_63.F);
        if ((elementsByTagNameNS == null || elementsByTagNameNS.getLength() == 0) && (((elementsByTagNameNS = d.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_63.F)) == null || elementsByTagNameNS.getLength() == 0) && ((elementsByTagNameNS = d.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_63.E)) == null || elementsByTagNameNS.getLength() == 0))) {
            throw new XAdESException("Node CompleteCertificateRefs and CompleteCertificateRefs(V2) not found", IAdESException.ecNodeNotFound);
        }
        Element element = (Element) elementsByTagNameNS.item(0);
        if (element == null) {
            throw new XAdESException("Node CertRefs in CompleteCertificateRefs(V2) not found", IAdESException.ecNodeNotFound);
        }
        arrayList.add(new HashDataInfoWrapper(element, Collections.singletonList(attribute)));
        NodeList elementsByTagNameNS2 = d.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_63.G);
        if (elementsByTagNameNS2 == null || elementsByTagNameNS2.getLength() == 0) {
            throw new XAdESException("Node CompleteRevocationRefs not found", IAdESException.ecNodeNotFound);
        }
        Element element2 = (Element) elementsByTagNameNS2.item(0);
        if (element2 == null) {
            throw new XAdESException("Node *Refs in CompleteRevocationRefs(V2) not found", IAdESException.ecNodeNotFound);
        }
        arrayList.add(new HashDataInfoWrapper(element2, Collections.singletonList(attribute)));
    }

    @Override // ru.CryptoPro.XAdES.SigAndRefsTimeStamp
    public void setCompleteCertificateReferences(dr61 dr61Var) {
        this.H = dr61Var;
    }

    @Override // ru.CryptoPro.XAdES.SigAndRefsTimeStamp
    public void setCompleteRevocationReferences(cs61 cs61Var) {
        this.I = cs61Var;
    }

    @Override // ru.CryptoPro.XAdES.SigAndRefsTimeStamp
    public void setSignatureTimestampsDetailsElements(List<Element> list) {
        this.G.addAll(list);
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStampImpl, ru.CryptoPro.XAdES.SignatureTimeStamp
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException {
        JCPLogger.subEnter();
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        HashSet hashSet = this.C;
        hashSet.addAll(set);
        if (set2 == null) {
            set2 = Collections.EMPTY_SET;
        }
        HashSet hashSet2 = this.D;
        hashSet2.addAll(set2);
        try {
            JCPLogger.fine("Validating sig-and-refs-timestamp (external) imprint...");
            lq61 lq61Var = new lq61(this.B, this.a);
            JCPLogger.fine("Digest OID found: " + this.x);
            lq61Var.w = this.x;
            lq61Var.c = this.y;
            JCPLogger.fine("Validating sig-and-refs-timestamp (external)...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            ExternalTimeStampValidationProcessImpl externalTimeStampValidationProcessImpl = new ExternalTimeStampValidationProcessImpl(lq61Var, this.w);
            externalTimeStampValidationProcessImpl.setCertificateValues(hashSet);
            externalTimeStampValidationProcessImpl.setCRLs(hashSet2);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) externalTimeStampValidationProcessImpl);
            JCPLogger.fine("Validation sig-and-ref-timestamp completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    public SigAndRefsTimeStampImpl(Node node, String str) throws XAdESException {
        this(node, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, str);
    }

    public SigAndRefsTimeStampImpl(Node node, String str, String str2, String str3) {
        super(node, str, str2, str3);
        this.G = new ArrayList();
    }
}
