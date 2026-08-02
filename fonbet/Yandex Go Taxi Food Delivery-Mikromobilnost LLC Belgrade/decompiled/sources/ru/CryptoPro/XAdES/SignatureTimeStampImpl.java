package ru.CryptoPro.XAdES;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.kt61;
import defpackage.m8z0;
import defpackage.ot61;
import defpackage.oyr;
import defpackage.st61;
import defpackage.u87;
import defpackage.xw61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.EnhancedTSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampEnhancementProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampValidationProcessImpl;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.transform.HashDataInfoWrapper;
import ru.CryptoPro.XAdES.util.XAdESUtility;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public class SignatureTimeStampImpl implements SignatureTimeStamp {
    public boolean A;
    public final ArrayList B;
    public final HashSet C;
    public final HashSet D;
    public final String E;
    public Options F;
    public Document a;
    public xw61 b;
    public final Element c;
    public m8z0 w;
    public String x;
    public String y;
    public boolean z;

    public SignatureTimeStampImpl(Node node, String str, String str2, String str3) throws XAdESException {
        this.z = false;
        this.A = false;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        this.C = new HashSet();
        this.D = new HashSet();
        this.E = "http://www.cryptopro.ru:80/tsp/";
        this.F = null;
        xw61 xw61Var = new xw61(node, str, str2, str3);
        this.b = xw61Var;
        this.a = xw61Var.a;
        Element findParentNodeByTagNS = XMLUtils.findParentNodeByTagNS(xw61Var.e(), XAdESSignature.ELEMENT_SIGNATURE, "http://www.w3.org/2000/09/xmldsig#");
        this.c = findParentNodeByTagNS;
        if (findParentNodeByTagNS == null) {
            throw new XAdESException("Node signature not found", IAdESException.ecSignatureMarshallingFailed);
        }
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding timestamp...");
        Node item = findParentNodeByTagNS.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod").item(0);
        if (item == null) {
            throw new XAdESException("Node SignatureMethod not found", IAdESException.ecSignatureMarshallingFailed);
        }
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting HashDataInfo...");
        List<Element> childElementsByTagNameNS = XMLUtils.getChildElementsByTagNameNS(this.b.e(), "HashDataInfo", XAdESParameters.XADES_SIGNATURE_NAMESPACE);
        boolean isEmpty = childElementsByTagNameNS.isEmpty();
        String str4 = SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM;
        if (isEmpty) {
            JCPLogger.fine("HashDataInfo not found, trying to find canonicalization method...");
            Element b = this.b.b("CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#");
            if (b != null && b.hasAttribute("Algorithm")) {
                str4 = b.getAttribute("Algorithm");
            }
            Element element = (Element) findParentNodeByTagNS.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "SignatureValue").item(0);
            if (element == null) {
                throw new XAdESException("Node SignatureValue not found", IAdESException.ecNodeNotFound);
            }
            arrayList.add(new HashDataInfoWrapper(element, Collections.singletonList(str4)));
        } else {
            for (Element element2 : childElementsByTagNameNS) {
                String attribute = element2.getAttribute(GlobalRouterActivity.URI);
                if (attribute == null) {
                    throw new XAdESException(element2.getNodeName() + " has not Id.", IAdESException.ecNodeInvalidContent);
                }
                String trim = attribute.trim();
                if (trim.length() > 0 && trim.charAt(0) == '#') {
                    trim = trim.substring(1);
                }
                if (trim.isEmpty()) {
                    throw new XAdESException(element2.getNodeName() + " has invalid Id.", IAdESException.ecNodeInvalidContent);
                }
                try {
                    JCPLogger.fine("Looking for element with uri " + trim);
                    NodeList nodeList = (NodeList) SignatureTimeStamp.X_PATH_FACTORY.newXPath().compile("//*[@Id='" + trim + "']").evaluate(findParentNodeByTagNS, XPathConstants.NODESET);
                    if (nodeList == null || nodeList.getLength() == 0) {
                        throw new XAdESException("Node with " + trim + " not found", IAdESException.ecNodeNotFound);
                    }
                    Element element3 = (Element) nodeList.item(0);
                    ArrayList arrayList2 = new ArrayList();
                    Element childElementByTagNameNS = XMLUtils.getChildElementByTagNameNS(element2, "Transforms", "http://www.w3.org/2000/09/xmldsig#");
                    if (childElementByTagNameNS != null) {
                        NodeList elementsByTagNameNS = childElementByTagNameNS.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Transform");
                        if (elementsByTagNameNS != null && elementsByTagNameNS.getLength() > 0) {
                            for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
                                Element element4 = (Element) elementsByTagNameNS.item(i);
                                if (element4.hasAttribute("Algorithm")) {
                                    arrayList2.add(element4.getAttribute("Algorithm"));
                                }
                            }
                        }
                    } else {
                        Element b2 = this.b.b("CanonicalizationMethod", "http://www.w3.org/2000/09/xmldsig#");
                        arrayList2.add((b2 == null || !b2.hasAttribute("Algorithm")) ? SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM : b2.getAttribute("Algorithm"));
                    }
                    arrayList.add(new HashDataInfoWrapper(element3, arrayList2));
                } catch (XAdESException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new XAdESException("Finding by URI failed.", e2, IAdESException.ecNodeNotFound);
                }
            }
        }
        JCPLogger.subExit();
        JCPLogger.fine("Decoding timestamp parameters...");
        this.x = XAdESUtility.findDigestOidByDigestName(XAdESUtility.findDigestNameBySignatureUri(XMLUtils.getAttributeByName(item, "Algorithm")));
        JCPLogger.fine("Digest OID decoded: " + this.x);
        Element b3 = this.b.b("EncapsulatedTimeStamp", XAdESParameters.XADES_SIGNATURE_NAMESPACE);
        String textContent = b3 != null ? b3.getTextContent() : null;
        try {
            JCPLogger.fine("Preparing timestamp...");
            this.w = new m8z0(new u87(new Decoder().decodeBuffer(textContent)));
            JCPLogger.subExit();
        } catch (Exception e3) {
            throw new XAdESException(e3, IAdESException.ecTimestampInvalid);
        }
    }

    public static void a(xw61 xw61Var, String str, String str2) {
        JCPLogger.subEnter();
        Element c = xw61Var.c(XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XADES_SIGNATURE_PREFIX, "HashDataInfo");
        c.setAttributeNS(null, GlobalRouterActivity.URI, ShimmerDivHandler.NUMBER_SING.concat(str));
        xw61Var.getNode().appendChild(c);
        if (str2 != null) {
            Element c2 = xw61Var.c("http://www.w3.org/2000/09/xmldsig#", xw61Var.w, "Transforms");
            Element c3 = xw61Var.c("http://www.w3.org/2000/09/xmldsig#", xw61Var.w, "Transform");
            c2.appendChild(c3);
            c3.setAttributeNS(null, "Algorithm", str2);
            c.appendChild(c2);
        }
        JCPLogger.subExit();
    }

    public static void addHashDataInfoElement(xw61 xw61Var, Element element, String str) throws XAdESException {
        JCPLogger.subEnter();
        if (element == null) {
            throw new XAdESException("Node for HashDataInfo not found", IAdESException.ecNodeNotFound);
        }
        String attribute = element.getAttribute("Id");
        if (attribute == null) {
            throw new XAdESException(element.getNodeName() + " has not Id.", IAdESException.ecNodeInvalidContent);
        }
        String trim = attribute.trim();
        if (!trim.isEmpty()) {
            a(xw61Var, trim, str);
            JCPLogger.subExit();
        } else {
            throw new XAdESException(element.getNodeName() + " has invalid Id.", IAdESException.ecNodeInvalidContent);
        }
    }

    public final void b(Set set, Set set2, boolean z) {
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
            JCPLogger.fine("Validating signature-timestamp (internal) imprint...");
            kt61 kt61Var = new kt61(this.B, this.a);
            JCPLogger.fine("Digest OID found: " + this.x);
            kt61Var.w = this.x;
            kt61Var.c = this.y;
            JCPLogger.fine("Validating signature-timestamp (internal)...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            InternalTimeStampValidationProcessImpl internalTimeStampValidationProcessImpl = new InternalTimeStampValidationProcessImpl(kt61Var, this.w, z);
            internalTimeStampValidationProcessImpl.setCertificateValues(hashSet);
            internalTimeStampValidationProcessImpl.setCRLs(hashSet2);
            internalTimeStampValidationProcessImpl.setOptions(this.F);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) internalTimeStampValidationProcessImpl);
            JCPLogger.fine("Validation signature-timestamp completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    public final void c(Document document, String str) {
        JCPLogger.subEnter();
        Node findSignatureElementById = XMLUtils.findSignatureElementById(document.getDocumentElement(), str);
        if (findSignatureElementById == null) {
            throw new XAdESException(oyr.p("Node ", str, " not found"), IAdESException.ecNodeNotFound);
        }
        Element element = (Element) findSignatureElementById;
        Node item = element.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod").item(0);
        if (item == null) {
            throw new XAdESException("Node SignatureMethod not found", IAdESException.ecNodeNotFound);
        }
        this.x = XAdESUtility.findDigestOidByDigestName(XAdESUtility.findDigestNameBySignatureUri(item.getAttributes().getNamedItem("Algorithm").getNodeValue()));
        JCPLogger.fine("Digest OID found: " + this.x);
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() == 0) {
            throw new XAdESException("Node SignatureValue not found", IAdESException.ecNodeNotFound);
        }
        Element element2 = (Element) elementsByTagNameNS.item(0);
        if (element2 == null) {
            throw new XAdESException("Node SignatureValue not found", IAdESException.ecNodeNotFound);
        }
        this.a = element2.getOwnerDocument();
        this.B.add(new HashDataInfoWrapper(element2, Collections.singletonList(SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM)));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public boolean doNotAddNode() {
        return this.z;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public boolean doNotValidateBecauseEnhancement() {
        return this.A;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public ot61 enhance() throws XAdESException {
        JCPLogger.fine("Enhancing internal signature-timestamp...");
        EnhancedTSPTimeStampImpl enhancedTSPTimeStampImpl = new EnhancedTSPTimeStampImpl();
        try {
            InternalTimeStampEnhancementProcessImpl internalTimeStampEnhancementProcessImpl = new InternalTimeStampEnhancementProcessImpl(this.w);
            internalTimeStampEnhancementProcessImpl.setProvider(this.y);
            internalTimeStampEnhancementProcessImpl.setCertificateValues(this.C);
            internalTimeStampEnhancementProcessImpl.setCRLs(this.D);
            this.w = enhancedTSPTimeStampImpl.enhance(internalTimeStampEnhancementProcessImpl);
            JCPLogger.fine("Retrieving enhanced signature-timestamp.");
            return new st61(this);
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public void generateEncapsulatedTimeStamp(Document document, String str) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Creating signature-timestamp (internal)...");
        c(document, str);
        try {
            JCPLogger.fine("Preparing data for internal timestamp...");
            kt61 kt61Var = new kt61(this.B, document);
            JCPLogger.fine("Digest OID found: " + this.x);
            kt61Var.w = this.x;
            kt61Var.c = this.y;
            JCPLogger.fine("Receiving internal timestamp...");
            TSPTimeStampImpl tSPTimeStampImpl = new TSPTimeStampImpl();
            JCPLogger.fine("Digest OID found: " + this.x);
            tSPTimeStampImpl.setDigestAlgorithm(this.x);
            tSPTimeStampImpl.setProvider(this.y);
            tSPTimeStampImpl.retrieve(this.E, kt61Var);
            this.w = tSPTimeStampImpl.get();
            b(null, null, true);
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public Document getDocument() {
        return this.a;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public Element getElement() {
        return this.b.e();
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public List<HashDataInfoWrapper> getHashDataInfo() {
        return Collections.unmodifiableList(this.B);
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public String getId() {
        return this.b.d("Id");
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public m8z0 getTimestampToken() {
        return this.w;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.D.addAll(collection);
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.C.addAll(set);
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.x = str;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public void setDoNotAddNode(boolean z) {
        this.z = z;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public void setDoNotValidateBecauseEnhancement(boolean z) {
        this.A = z;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.F = options;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.y = str;
    }

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException {
        b(set, set2, false);
    }

    public SignatureTimeStampImpl(String str) {
        this.z = false;
        this.A = false;
        this.B = new ArrayList();
        this.C = new HashSet();
        this.D = new HashSet();
        this.F = null;
        this.E = str;
    }
}
