package ru.CryptoPro.JCPxml.dsig.internal.dom;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCPxml.dsig.internal.DigesterOutputStream;

/* loaded from: classes4.dex */
public final class DOMReference extends DOMStructure implements DOMURIReference, Reference {
    public static final int MAXIMUM_TRANSFORM_COUNT = 5;
    private List allTransforms;
    private final Data appliedTransformData;
    private byte[] calcDigestValue;
    private Data derefData;
    private final DigestMethod digestMethod;
    private byte[] digestValue;
    private boolean digested;
    private InputStream dis;
    private Attr here;
    private final String id;
    private MessageDigest md;
    private Provider provider;
    private Element refElem;
    private final List transforms;
    private final String type;
    private final String uri;
    private boolean validated;
    private boolean validationStatus;
    private static boolean useC14N11 = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCPxml.dsig.internal.dom.DOMReference.1
        @Override // java.security.PrivilegedAction
        public Boolean run() {
            return Boolean.valueOf(Boolean.getBoolean("com.sun.org.apache.xml.internal.security.useC14N11"));
        }
    })).booleanValue();
    private static Log log = LogFactory.getLog(DOMReference.class);

    public DOMReference(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        int i = 0;
        this.digested = false;
        this.validated = false;
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        boolean z = bool != null && bool.booleanValue();
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        ArrayList arrayList = new ArrayList(5);
        if (firstChildElement.getLocalName().equals("Transforms")) {
            Element firstChildElement2 = DOMUtils.getFirstChildElement(firstChildElement);
            while (firstChildElement2 != null) {
                arrayList.add(new DOMTransform(firstChildElement2, xMLCryptoContext, provider));
                firstChildElement2 = DOMUtils.getNextSiblingElement(firstChildElement2);
                i++;
                if (z && i > 5) {
                    throw new MarshalException("A maximum of 5 transforms per Reference are allowed with secure validation");
                }
            }
            firstChildElement = DOMUtils.getNextSiblingElement(firstChildElement);
        }
        DigestMethod unmarshal = DOMDigestMethod.unmarshal(firstChildElement);
        this.digestMethod = unmarshal;
        if (z && "http://www.w3.org/2001/04/xmldsig-more#md5".equals(unmarshal)) {
            throw new MarshalException("It is forbidden to use algorithm " + unmarshal + " when secure validation is enabled");
        }
        try {
            this.digestValue = Base64.decode(DOMUtils.getNextSiblingElement(firstChildElement));
            this.uri = DOMUtils.getAttributeValue(element, GlobalRouterActivity.URI);
            Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
            if (attributeNodeNS != null) {
                this.id = attributeNodeNS.getValue();
                element.setIdAttributeNode(attributeNodeNS, true);
            } else {
                this.id = null;
            }
            this.type = DOMUtils.getAttributeValue(element, "Type");
            this.here = element.getAttributeNodeNS(null, GlobalRouterActivity.URI);
            this.refElem = element;
            this.transforms = arrayList;
            this.allTransforms = arrayList;
            this.appliedTransformData = null;
            this.provider = provider;
        } catch (Base64DecodingException e) {
            throw new MarshalException(e);
        }
    }

    private static Data copyDerefData(Data data) {
        Log log2;
        StringBuilder sb;
        if (data instanceof ApacheData) {
            XMLSignatureInput xMLSignatureInput = ((ApacheData) data).getXMLSignatureInput();
            if (xMLSignatureInput.isNodeSet()) {
                try {
                    final Set nodeSet = xMLSignatureInput.getNodeSet();
                    return new NodeSetData() { // from class: ru.CryptoPro.JCPxml.dsig.internal.dom.DOMReference.2
                        public Iterator iterator() {
                            return nodeSet.iterator();
                        }
                    };
                } catch (Exception e) {
                    e = e;
                    log2 = log;
                    sb = new StringBuilder("cannot cache dereferenced data: ");
                }
            } else {
                if (xMLSignatureInput.isElement()) {
                    return new DOMSubTreeData(xMLSignatureInput.getSubNode(), xMLSignatureInput.isExcludeComments());
                }
                if (xMLSignatureInput.isOctetStream() || xMLSignatureInput.isByteArray()) {
                    try {
                        return new OctetStreamData(xMLSignatureInput.getOctetStream(), xMLSignatureInput.getSourceURI(), xMLSignatureInput.getMIMEType());
                    } catch (IOException e2) {
                        e = e2;
                        log2 = log;
                        sb = new StringBuilder("cannot cache dereferenced data: ");
                    }
                }
            }
            sb.append(e);
            log2.warn(sb.toString());
            return null;
        }
        return data;
    }

    private Data dereference(XMLCryptoContext xMLCryptoContext) throws XMLSignatureException {
        URIDereferencer uRIDereferencer = xMLCryptoContext.getURIDereferencer();
        if (uRIDereferencer == null) {
            uRIDereferencer = DOMURIDereferencer.INSTANCE;
        }
        try {
            Data dereference = uRIDereferencer.dereference(this, xMLCryptoContext);
            if (log.isDebugEnabled()) {
                log.debug("URIDereferencer class name: ".concat(uRIDereferencer.getClass().getName()));
                log.debug("Data class name: ".concat(dereference.getClass().getName()));
            }
            return dereference;
        } catch (URIReferenceException e) {
            throw new XMLSignatureException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x016b A[Catch: CanonicalizationException -> 0x01b6, IOException -> 0x01bd, MarshalException -> 0x01c4, TransformException -> 0x01cb, NoSuchAlgorithmException -> 0x01d2, TRY_ENTER, TryCatch #1 {NoSuchAlgorithmException -> 0x01d2, blocks: (B:36:0x00d7, B:40:0x00e3, B:42:0x00ed, B:49:0x00fa, B:52:0x0100, B:53:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:63:0x0158, B:66:0x016b, B:67:0x0185, B:68:0x0181, B:73:0x0193, B:74:0x0107, B:76:0x010b, B:78:0x0118, B:80:0x011c, B:82:0x0120, B:83:0x0129, B:88:0x0197, B:89:0x019f, B:28:0x01a0, B:30:0x01a5, B:32:0x01ab, B:33:0x01b1), top: B:35:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181 A[Catch: CanonicalizationException -> 0x01b6, IOException -> 0x01bd, MarshalException -> 0x01c4, TransformException -> 0x01cb, NoSuchAlgorithmException -> 0x01d2, TryCatch #1 {NoSuchAlgorithmException -> 0x01d2, blocks: (B:36:0x00d7, B:40:0x00e3, B:42:0x00ed, B:49:0x00fa, B:52:0x0100, B:53:0x0139, B:56:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:63:0x0158, B:66:0x016b, B:67:0x0185, B:68:0x0181, B:73:0x0193, B:74:0x0107, B:76:0x010b, B:78:0x0118, B:80:0x011c, B:82:0x0120, B:83:0x0129, B:88:0x0197, B:89:0x019f, B:28:0x01a0, B:30:0x01a5, B:32:0x01ab, B:33:0x01b1), top: B:35:0x00d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] transform(Data data, XMLCryptoContext xMLCryptoContext) throws XMLSignatureException {
        DigesterOutputStream digesterOutputStream;
        String str;
        TransformService transformService;
        XMLSignatureInput xMLSignatureInput;
        XMLSignatureInput xMLSignatureInput2;
        TransformService transformService2;
        boolean isEmpty;
        Element firstChildElement;
        if (this.md == null) {
            try {
                String str2 = (String) xMLCryptoContext.getProperty("org.jcp.xml.dsig.internal.dom.SignatureProvider");
                try {
                    Utils.checkProvider(str2);
                    if (log.isDebugEnabled()) {
                        log.debug("Provider for Digest: " + str2);
                    }
                    DigestMethod digestMethod = this.digestMethod;
                    this.md = str2 == null ? MessageDigest.getInstance(((DOMDigestMethod) digestMethod).getMessageDigestAlgorithm()) : MessageDigest.getInstance(((DOMDigestMethod) digestMethod).getMessageDigestAlgorithm(), str2);
                } catch (Exception e) {
                    throw new XMLSignatureException(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new XMLSignatureException(e2);
            } catch (NoSuchProviderException e3) {
                throw new XMLSignatureException(e3);
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("Resolved Provider for Digest: " + this.md.getProvider());
        }
        this.md.reset();
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("javax.xml.crypto.dsig.cacheReference");
        if (bool == null || !bool.booleanValue()) {
            digesterOutputStream = new DigesterOutputStream(this.md);
        } else {
            this.derefData = copyDerefData(data);
            digesterOutputStream = new DigesterOutputStream(this.md, true);
        }
        OutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(digesterOutputStream);
        int size = this.transforms.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            DOMTransform dOMTransform = (DOMTransform) this.transforms.get(i);
            if (i < size - 1) {
                try {
                    data = dOMTransform.transform(data, xMLCryptoContext);
                } catch (TransformException e4) {
                    throw new XMLSignatureException(e4);
                }
            } else {
                data = dOMTransform.transform(data, xMLCryptoContext, unsyncBufferedOutputStream);
            }
        }
        if (data != null) {
            try {
                try {
                    boolean z2 = useC14N11;
                    str = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
                    if (xMLCryptoContext instanceof XMLSignContext) {
                        if (z2) {
                            str = DOMCanonicalXMLC14N11Method.C14N_11;
                        } else {
                            Boolean bool2 = (Boolean) xMLCryptoContext.getProperty("org.apache.xml.security.useC14N11");
                            if (bool2 != null && bool2.booleanValue()) {
                                z = true;
                            }
                            str = z ? DOMCanonicalXMLC14N11Method.C14N_11 : "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
                            z2 = z;
                        }
                    }
                    if (data instanceof ApacheData) {
                        xMLSignatureInput2 = ((ApacheData) data).getXMLSignatureInput();
                    } else {
                        if (data instanceof OctetStreamData) {
                            xMLSignatureInput = new XMLSignatureInput(((OctetStreamData) data).getOctetStream());
                        } else {
                            if (!(data instanceof NodeSetData)) {
                                throw new XMLSignatureException("unrecognized Data type");
                            }
                            Provider provider = this.provider;
                            if (provider != null) {
                                try {
                                    transformService = TransformService.getInstance(str, "DOM", provider);
                                } catch (NoSuchAlgorithmException unused) {
                                }
                                xMLSignatureInput = new XMLSignatureInput(transformService.transform(data, xMLCryptoContext).getOctetStream());
                            }
                            transformService = TransformService.getInstance(str, "DOM");
                            xMLSignatureInput = new XMLSignatureInput(transformService.transform(data, xMLCryptoContext).getOctetStream());
                        }
                        xMLSignatureInput2 = xMLSignatureInput;
                    }
                    if (!(xMLCryptoContext instanceof XMLSignContext) || !z2 || xMLSignatureInput2.isOctetStream() || xMLSignatureInput2.isOutputStreamSet()) {
                        xMLSignatureInput2.updateOutputStream(unsyncBufferedOutputStream);
                    } else {
                        Provider provider2 = this.provider;
                        if (provider2 != null) {
                            try {
                                transformService2 = TransformService.getInstance(str, "DOM", provider2);
                            } catch (NoSuchAlgorithmException unused2) {
                            }
                            DOMTransform dOMTransform2 = new DOMTransform(transformService2);
                            String signaturePrefix = DOMUtils.getSignaturePrefix(xMLCryptoContext);
                            isEmpty = this.allTransforms.isEmpty();
                            Element element = this.refElem;
                            if (isEmpty) {
                                firstChildElement = DOMUtils.getFirstChildElement(element);
                            } else {
                                firstChildElement = DOMUtils.createElement(element.getOwnerDocument(), "Transforms", "http://www.w3.org/2000/09/xmldsig#", signaturePrefix);
                                Element element2 = this.refElem;
                                element2.insertBefore(firstChildElement, DOMUtils.getFirstChildElement(element2));
                            }
                            dOMTransform2.marshal(firstChildElement, signaturePrefix, (DOMCryptoContext) xMLCryptoContext);
                            this.allTransforms.add(dOMTransform2);
                            xMLSignatureInput2.updateOutputStream(unsyncBufferedOutputStream, true);
                        }
                        transformService2 = TransformService.getInstance(str, "DOM");
                        DOMTransform dOMTransform22 = new DOMTransform(transformService2);
                        String signaturePrefix2 = DOMUtils.getSignaturePrefix(xMLCryptoContext);
                        isEmpty = this.allTransforms.isEmpty();
                        Element element3 = this.refElem;
                        if (isEmpty) {
                        }
                        dOMTransform22.marshal(firstChildElement, signaturePrefix2, (DOMCryptoContext) xMLCryptoContext);
                        this.allTransforms.add(dOMTransform22);
                        xMLSignatureInput2.updateOutputStream(unsyncBufferedOutputStream, true);
                    }
                } catch (NoSuchAlgorithmException e5) {
                    throw new XMLSignatureException(e5);
                }
            } catch (MarshalException e6) {
                throw new XMLSignatureException(e6);
            } catch (TransformException e7) {
                throw new XMLSignatureException(e7);
            } catch (IOException e8) {
                throw new XMLSignatureException(e8);
            } catch (CanonicalizationException e9) {
                throw new XMLSignatureException(e9);
            }
        }
        unsyncBufferedOutputStream.flush();
        if (bool != null && bool.booleanValue()) {
            this.dis = digesterOutputStream.getInputStream();
        }
        return digesterOutputStream.getDigestValue();
    }

    public void digest(XMLSignContext xMLSignContext) throws XMLSignatureException {
        Data data = this.appliedTransformData;
        if (data == null) {
            data = dereference(xMLSignContext);
        }
        byte[] transform = transform(data, xMLSignContext);
        this.digestValue = transform;
        String encode = Base64.encode(transform);
        if (log.isDebugEnabled()) {
            log.debug("Reference object uri = " + this.uri);
        }
        Element lastChildElement = DOMUtils.getLastChildElement(this.refElem);
        if (lastChildElement == null) {
            throw new XMLSignatureException("DigestValue element expected");
        }
        DOMUtils.removeAllChildren(lastChildElement);
        lastChildElement.appendChild(this.refElem.getOwnerDocument().createTextNode(encode));
        this.digested = true;
        if (log.isDebugEnabled()) {
            log.debug("Reference digesting completed");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reference)) {
            return false;
        }
        Reference reference = (Reference) obj;
        String str = this.id;
        boolean equals = str == null ? reference.getId() == null : str.equals(reference.getId());
        String str2 = this.uri;
        boolean equals2 = str2 == null ? reference.getURI() == null : str2.equals(reference.getURI());
        String str3 = this.type;
        return this.digestMethod.equals(reference.getDigestMethod()) && equals && equals2 && (str3 == null ? reference.getType() == null : str3.equals(reference.getType())) && this.allTransforms.equals(reference.getTransforms()) && Arrays.equals(this.digestValue, reference.getDigestValue());
    }

    public byte[] getCalculatedDigestValue() {
        byte[] bArr = this.calcDigestValue;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Data getDereferencedData() {
        return this.derefData;
    }

    public InputStream getDigestInputStream() {
        return this.dis;
    }

    public DigestMethod getDigestMethod() {
        return this.digestMethod;
    }

    public byte[] getDigestValue() {
        byte[] bArr = this.digestValue;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Node getHere() {
        return this.here;
    }

    public String getId() {
        return this.id;
    }

    public List getTransforms() {
        return Collections.unmodifiableList(this.allTransforms);
    }

    public String getType() {
        return this.type;
    }

    public String getURI() {
        return this.uri;
    }

    public boolean isDigested() {
        return this.digested;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        if (log.isDebugEnabled()) {
            log.debug("Marshalling Reference");
        }
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "Reference", "http://www.w3.org/2000/09/xmldsig#", str);
        this.refElem = createElement;
        DOMUtils.setAttributeID(createElement, "Id", this.id);
        DOMUtils.setAttribute(this.refElem, GlobalRouterActivity.URI, this.uri);
        DOMUtils.setAttribute(this.refElem, "Type", this.type);
        if (!this.allTransforms.isEmpty()) {
            Element createElement2 = DOMUtils.createElement(ownerDocument, "Transforms", "http://www.w3.org/2000/09/xmldsig#", str);
            this.refElem.appendChild(createElement2);
            Iterator it = this.allTransforms.iterator();
            while (it.hasNext()) {
                ((Transform) it.next()).marshal(createElement2, str, dOMCryptoContext);
            }
        }
        ((DOMDigestMethod) this.digestMethod).marshal(this.refElem, str, dOMCryptoContext);
        if (log.isDebugEnabled()) {
            log.debug("Adding digestValueElem");
        }
        Element createElement3 = DOMUtils.createElement(ownerDocument, "DigestValue", "http://www.w3.org/2000/09/xmldsig#", str);
        byte[] bArr = this.digestValue;
        if (bArr != null) {
            createElement3.appendChild(ownerDocument.createTextNode(Base64.encode(bArr)));
        }
        this.refElem.appendChild(createElement3);
        node.appendChild(this.refElem);
        this.here = this.refElem.getAttributeNodeNS(null, GlobalRouterActivity.URI);
    }

    public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
        if (xMLValidateContext == null) {
            ny61.t("validateContext cannot be null");
            return false;
        }
        if (this.validated) {
            return this.validationStatus;
        }
        this.calcDigestValue = transform(dereference(xMLValidateContext), xMLValidateContext);
        if (log.isDebugEnabled()) {
            log.debug("Expected digest: " + Base64.encode(this.digestValue));
            log.debug("Actual digest: " + Base64.encode(this.calcDigestValue));
        }
        boolean equals = Arrays.equals(this.digestValue, this.calcDigestValue);
        this.validationStatus = equals;
        this.validated = true;
        return equals;
    }

    public DOMReference(String str, String str2, DigestMethod digestMethod, List list, Data data, List list2, String str3, Provider provider) {
        this(str, str2, digestMethod, list, data, list2, str3, null, provider);
    }

    public DOMReference(String str, String str2, DigestMethod digestMethod, List list, Data data, List list2, String str3, byte[] bArr, Provider provider) {
        this.digested = false;
        this.validated = false;
        if (digestMethod == null) {
            ny61.t("DigestMethod must be non-null");
            throw null;
        }
        if (list == null) {
            this.allTransforms = new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList(list);
            this.allTransforms = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!(this.allTransforms.get(i) instanceof Transform)) {
                    xfo.h(oyr.j(i, "appliedTransforms[", "] is not a valid type"));
                    throw null;
                }
            }
        }
        if (list2 == null) {
            this.transforms = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(list2);
            this.transforms = arrayList2;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!(this.transforms.get(i2) instanceof Transform)) {
                    xfo.h(oyr.j(i2, "transforms[", "] is not a valid type"));
                    throw null;
                }
            }
            this.allTransforms.addAll(this.transforms);
        }
        this.digestMethod = digestMethod;
        this.uri = str;
        if (str != null && !str.equals("")) {
            try {
                new URI(str);
            } catch (URISyntaxException e) {
                ny61.g(e.getMessage());
                throw null;
            }
        }
        this.type = str2;
        this.id = str3;
        if (bArr != null) {
            this.digestValue = (byte[]) bArr.clone();
            this.digested = true;
        }
        this.appliedTransformData = data;
        this.provider = provider;
    }

    public DOMReference(String str, String str2, DigestMethod digestMethod, List list, String str3, Provider provider) {
        this(str, str2, digestMethod, null, null, list, str3, null, provider);
    }
}
