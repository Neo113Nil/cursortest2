package ru.CryptoPro.JCPxml.dsig.internal.dom;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.xml.tools.DocumentBuilderFactoryHelper;
import ru.xml.tools.XmlFeatureHelper;

/* loaded from: classes4.dex */
public final class DOMRetrievalMethod extends DOMStructure implements DOMURIReference, RetrievalMethod {
    private Attr here;
    private final List transforms;
    private String type;
    private String uri;

    public DOMRetrievalMethod(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        this.uri = DOMUtils.getAttributeValue(element, GlobalRouterActivity.URI);
        this.type = DOMUtils.getAttributeValue(element, "Type");
        this.here = element.getAttributeNodeNS(null, GlobalRouterActivity.URI);
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        int i = 0;
        boolean z = bool != null && bool.booleanValue();
        ArrayList arrayList = new ArrayList();
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        if (firstChildElement != null) {
            Element firstChildElement2 = DOMUtils.getFirstChildElement(firstChildElement);
            while (firstChildElement2 != null) {
                arrayList.add(new DOMTransform(firstChildElement2, xMLCryptoContext, provider));
                firstChildElement2 = DOMUtils.getNextSiblingElement(firstChildElement2);
                i++;
                if (z && i > 5) {
                    throw new MarshalException("A maxiumum of 5 transforms per Reference are allowed with secure validation");
                }
            }
        }
        this.transforms = arrayList.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
    }

    public Data dereference(XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        if (xMLCryptoContext == null) {
            ny61.t("context cannot be null");
            return null;
        }
        URIDereferencer uRIDereferencer = xMLCryptoContext.getURIDereferencer();
        if (uRIDereferencer == null) {
            uRIDereferencer = DOMURIDereferencer.INSTANCE;
        }
        Data dereference = uRIDereferencer.dereference(this, xMLCryptoContext);
        try {
            Iterator it = this.transforms.iterator();
            while (it.hasNext()) {
                dereference = ((DOMTransform) ((Transform) it.next())).transform(dereference, xMLCryptoContext);
            }
            return dereference;
        } catch (Exception e) {
            throw new URIReferenceException(e);
        }
    }

    public XMLStructure dereferenceAsXMLStructure(XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        try {
            ApacheData apacheData = (ApacheData) dereference(xMLCryptoContext);
            DocumentBuilderFactory newInstance = DocumentBuilderFactoryHelper.newInstance();
            newInstance.setNamespaceAware(true);
            if (XmlFeatureHelper.XML_XXE_PROTECTED) {
                newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
                newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            Element documentElement = newInstance.newDocumentBuilder().parse(new ByteArrayInputStream(apacheData.getXMLSignatureInput().getBytes())).getDocumentElement();
            if (documentElement.getLocalName().equals("X509Data")) {
                return new DOMX509Data(documentElement);
            }
            return null;
        } catch (Exception e) {
            throw new URIReferenceException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetrievalMethod)) {
            return false;
        }
        RetrievalMethod retrievalMethod = (RetrievalMethod) obj;
        String str = this.type;
        return this.uri.equals(retrievalMethod.getURI()) && this.transforms.equals(retrievalMethod.getTransforms()) && (str == null ? retrievalMethod.getType() == null : str.equals(retrievalMethod.getType()));
    }

    public Node getHere() {
        return this.here;
    }

    public List getTransforms() {
        return this.transforms;
    }

    public String getType() {
        return this.type;
    }

    public String getURI() {
        return this.uri;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "RetrievalMethod", "http://www.w3.org/2000/09/xmldsig#", str);
        DOMUtils.setAttribute(createElement, GlobalRouterActivity.URI, this.uri);
        DOMUtils.setAttribute(createElement, "Type", this.type);
        if (!this.transforms.isEmpty()) {
            Element createElement2 = DOMUtils.createElement(ownerDocument, "Transforms", "http://www.w3.org/2000/09/xmldsig#", str);
            createElement.appendChild(createElement2);
            Iterator it = this.transforms.iterator();
            while (it.hasNext()) {
                ((DOMTransform) ((Transform) it.next())).marshal(createElement2, str, dOMCryptoContext);
            }
        }
        node.appendChild(createElement);
        this.here = createElement.getAttributeNodeNS(null, GlobalRouterActivity.URI);
    }

    public DOMRetrievalMethod(String str, String str2, List list) {
        if (str == null) {
            ny61.t("uri cannot be null");
            throw null;
        }
        if (list == null || list.isEmpty()) {
            this.transforms = Collections.EMPTY_LIST;
        } else {
            List w = ly3.w(list);
            this.transforms = w;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (!(this.transforms.get(i) instanceof Transform)) {
                    xfo.h(oyr.j(i, "transforms[", "] is not a valid type"));
                    throw null;
                }
            }
        }
        this.uri = str;
        if (!str.equals("")) {
            try {
                new URI(str);
            } catch (URISyntaxException e) {
                ny61.g(e.getMessage());
                throw null;
            }
        }
        this.type = str2;
    }
}
