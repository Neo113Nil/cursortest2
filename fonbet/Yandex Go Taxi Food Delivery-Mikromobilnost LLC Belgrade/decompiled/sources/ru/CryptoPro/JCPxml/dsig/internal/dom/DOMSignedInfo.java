package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.xfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.XMLSignatureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class DOMSignedInfo extends DOMStructure implements SignedInfo {
    private static final String ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5 = "http://www.w3.org/2001/04/xmldsig-more#hmac-md5";
    private static final String ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5 = "http://www.w3.org/2001/04/xmldsig-more#rsa-md5";
    public static final int MAXIMUM_REFERENCE_COUNT = 30;
    private static Log log = LogFactory.getLog(DOMSignedInfo.class);
    private InputStream canonData;
    private CanonicalizationMethod canonicalizationMethod;
    private String id;
    private Element localSiElem;
    private Document ownerDoc;
    private List references;
    private SignatureMethod signatureMethod;

    public DOMSignedInfo(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        this.localSiElem = element;
        this.ownerDoc = element.getOwnerDocument();
        this.id = DOMUtils.getAttributeValue(element, "Id");
        Element firstChildElement = DOMUtils.getFirstChildElement(element);
        this.canonicalizationMethod = new DOMCanonicalizationMethod(firstChildElement, xMLCryptoContext, provider);
        Element nextSiblingElement = DOMUtils.getNextSiblingElement(firstChildElement);
        this.signatureMethod = DOMSignatureMethod.unmarshal(nextSiblingElement);
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        int i = 0;
        boolean z = bool != null && bool.booleanValue();
        if (z && (ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5.equals(this.signatureMethod) || ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5.equals(this.signatureMethod))) {
            throw new MarshalException("It is forbidden to use algorithm " + this.signatureMethod + " when secure validation is enabled");
        }
        ArrayList arrayList = new ArrayList(5);
        Element nextSiblingElement2 = DOMUtils.getNextSiblingElement(nextSiblingElement);
        while (nextSiblingElement2 != null) {
            arrayList.add(new DOMReference(nextSiblingElement2, xMLCryptoContext, provider));
            nextSiblingElement2 = DOMUtils.getNextSiblingElement(nextSiblingElement2);
            i++;
            if (z && i > 30) {
                throw new MarshalException("A maxiumum of 30 references per Manifest are allowed with secure validation");
            }
        }
        this.references = Collections.unmodifiableList(arrayList);
    }

    public void canonicalize(XMLCryptoContext xMLCryptoContext, ByteArrayOutputStream byteArrayOutputStream) throws XMLSignatureException {
        if (xMLCryptoContext == null) {
            ny61.t("context cannot be null");
            return;
        }
        try {
            new UnsyncBufferedOutputStream(byteArrayOutputStream).close();
        } catch (IOException e) {
            if (log.isDebugEnabled()) {
                log.debug(e);
            }
        }
        try {
            ((DOMCanonicalizationMethod) this.canonicalizationMethod).canonicalize(new DOMSubTreeData(this.localSiElem, true), xMLCryptoContext, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (log.isDebugEnabled()) {
                log.debug("Canonicalized SignedInfo:");
                StringBuilder sb = new StringBuilder(byteArray.length);
                for (byte b : byteArray) {
                    sb.append((char) b);
                }
                log.debug(sb.toString());
                log.debug("Data to be signed/verified:" + Base64.encode(byteArray));
            }
            this.canonData = new ByteArrayInputStream(byteArray);
        } catch (TransformException e2) {
            throw new XMLSignatureException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignedInfo)) {
            return false;
        }
        SignedInfo signedInfo = (SignedInfo) obj;
        String str = this.id;
        return this.canonicalizationMethod.equals(signedInfo.getCanonicalizationMethod()) && this.signatureMethod.equals(signedInfo.getSignatureMethod()) && this.references.equals(signedInfo.getReferences()) && (str == null ? signedInfo.getId() == null : str.equals(signedInfo.getId()));
    }

    public CanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    public InputStream getCanonicalizedData() {
        return this.canonData;
    }

    public String getId() {
        return this.id;
    }

    public List getReferences() {
        return this.references;
    }

    public SignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        this.ownerDoc = ownerDocument;
        Element createElement = DOMUtils.createElement(ownerDocument, "SignedInfo", "http://www.w3.org/2000/09/xmldsig#", str);
        ((DOMCanonicalizationMethod) this.canonicalizationMethod).marshal(createElement, str, dOMCryptoContext);
        this.signatureMethod.marshal(createElement, str, dOMCryptoContext);
        Iterator it = this.references.iterator();
        while (it.hasNext()) {
            ((DOMReference) ((Reference) it.next())).marshal(createElement, str, dOMCryptoContext);
        }
        DOMUtils.setAttributeID(createElement, "Id", this.id);
        node.appendChild(createElement);
        this.localSiElem = createElement;
    }

    public DOMSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list, String str) {
        this(canonicalizationMethod, signatureMethod, list);
        this.id = str;
    }

    public DOMSignedInfo(CanonicalizationMethod canonicalizationMethod, SignatureMethod signatureMethod, List list) {
        if (canonicalizationMethod == null) {
            throw null;
        }
        if (signatureMethod == null) {
            throw null;
        }
        if (list == null) {
            throw null;
        }
        this.canonicalizationMethod = canonicalizationMethod;
        this.signatureMethod = signatureMethod;
        List w = ly3.w(list);
        this.references = w;
        if (w.isEmpty()) {
            ny61.g("list of references must contain at least one entry");
            throw null;
        }
        int size = this.references.size();
        for (int i = 0; i < size; i++) {
            if (!(this.references.get(i) instanceof Reference)) {
                xfo.h("list of references contains an illegal type");
                throw null;
            }
        }
    }
}
