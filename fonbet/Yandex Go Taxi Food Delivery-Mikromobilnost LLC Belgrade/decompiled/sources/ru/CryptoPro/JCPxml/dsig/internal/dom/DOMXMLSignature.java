package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.KeySelectorResult;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.Manifest;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignContext;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLValidateContext;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.Init;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.XAdES.XAdESSignature;

/* loaded from: classes4.dex */
public final class DOMXMLSignature extends DOMStructure implements XMLSignature {
    private static Log log = LogFactory.getLog(DOMXMLSignature.class);
    private String id;
    private KeyInfo ki;
    private KeySelectorResult ksr;
    private Element localSigElem;
    private List objects;
    private Document ownerDoc;
    private SignedInfo si;
    private Element sigElem;
    private HashMap signatureIdMap;
    private XMLSignature.SignatureValue sv;
    private boolean validated;
    private boolean validationStatus;

    static {
        Init.init();
    }

    public DOMXMLSignature(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        List unmodifiableList;
        this.ownerDoc = null;
        this.sigElem = null;
        this.validated = false;
        this.localSigElem = element;
        this.ownerDoc = element.getOwnerDocument();
        this.id = DOMUtils.getAttributeValue(this.localSigElem, "Id");
        Element firstChildElement = DOMUtils.getFirstChildElement(this.localSigElem);
        this.si = new DOMSignedInfo(firstChildElement, xMLCryptoContext, provider);
        Element nextSiblingElement = DOMUtils.getNextSiblingElement(firstChildElement);
        this.sv = new DOMSignatureValue(nextSiblingElement, xMLCryptoContext);
        Element nextSiblingElement2 = DOMUtils.getNextSiblingElement(nextSiblingElement);
        if (nextSiblingElement2 != null && nextSiblingElement2.getLocalName().equals("KeyInfo")) {
            this.ki = new DOMKeyInfo(nextSiblingElement2, xMLCryptoContext, provider);
            nextSiblingElement2 = DOMUtils.getNextSiblingElement(nextSiblingElement2);
        }
        if (nextSiblingElement2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            while (nextSiblingElement2 != null) {
                arrayList.add(new DOMXMLObject(nextSiblingElement2, xMLCryptoContext, provider));
                nextSiblingElement2 = DOMUtils.getNextSiblingElement(nextSiblingElement2);
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.objects = unmodifiableList;
    }

    private void digestReference(DOMReference dOMReference, XMLSignContext xMLSignContext) throws XMLSignatureException {
        if (dOMReference.isDigested()) {
            return;
        }
        String uri = dOMReference.getURI();
        if (Utils.sameDocumentURI(uri)) {
            String parseIdFromSameDocumentURI = Utils.parseIdFromSameDocumentURI(uri);
            if (parseIdFromSameDocumentURI != null && this.signatureIdMap.containsKey(parseIdFromSameDocumentURI)) {
                Manifest manifest = (XMLStructure) this.signatureIdMap.get(parseIdFromSameDocumentURI);
                if (manifest instanceof DOMReference) {
                    digestReference((DOMReference) manifest, xMLSignContext);
                } else if (manifest instanceof Manifest) {
                    List references = manifest.getReferences();
                    int size = references.size();
                    for (int i = 0; i < size; i++) {
                        digestReference((DOMReference) references.get(i), xMLSignContext);
                    }
                }
            }
            if (uri.length() == 0) {
                Iterator it = dOMReference.getTransforms().iterator();
                while (it.hasNext()) {
                    String algorithm = ((Transform) it.next()).getAlgorithm();
                    if (algorithm.equals("http://www.w3.org/TR/1999/REC-xpath-19991116") || algorithm.equals("http://www.w3.org/2002/06/xmldsig-filter2")) {
                        return;
                    }
                }
            }
        }
        dOMReference.digest(xMLSignContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XMLSignature)) {
            return false;
        }
        XMLSignature xMLSignature = (XMLSignature) obj;
        String str = this.id;
        boolean equals = str == null ? xMLSignature.getId() == null : str.equals(xMLSignature.getId());
        KeyInfo keyInfo = this.ki;
        return equals && (keyInfo == null ? xMLSignature.getKeyInfo() == null : keyInfo.equals(xMLSignature.getKeyInfo())) && this.sv.equals(xMLSignature.getSignatureValue()) && this.si.equals(xMLSignature.getSignedInfo()) && this.objects.equals(xMLSignature.getObjects());
    }

    public String getId() {
        return this.id;
    }

    public KeyInfo getKeyInfo() {
        return this.ki;
    }

    public KeySelectorResult getKeySelectorResult() {
        return this.ksr;
    }

    public List getObjects() {
        return this.objects;
    }

    public XMLSignature.SignatureValue getSignatureValue() {
        return this.sv;
    }

    public SignedInfo getSignedInfo() {
        return this.si;
    }

    public void marshal(Node node, Node node2, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Element element;
        String str2;
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        this.ownerDoc = ownerDocument;
        this.sigElem = DOMUtils.createElement(ownerDocument, XAdESSignature.ELEMENT_SIGNATURE, "http://www.w3.org/2000/09/xmldsig#", str);
        if (str == null || str.length() == 0) {
            element = this.sigElem;
            str2 = "xmlns";
        } else {
            element = this.sigElem;
            str2 = "xmlns:".concat(str);
        }
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", str2, "http://www.w3.org/2000/09/xmldsig#");
        ((DOMSignedInfo) this.si).marshal(this.sigElem, str, dOMCryptoContext);
        ((DOMSignatureValue) this.sv).marshal(this.sigElem, str, dOMCryptoContext);
        KeyInfo keyInfo = this.ki;
        if (keyInfo != null) {
            ((DOMKeyInfo) keyInfo).marshal(this.sigElem, null, str, dOMCryptoContext);
        }
        int size = this.objects.size();
        for (int i = 0; i < size; i++) {
            ((DOMXMLObject) this.objects.get(i)).marshal(this.sigElem, str, dOMCryptoContext);
        }
        DOMUtils.setAttributeID(this.sigElem, "Id", this.id);
        node.insertBefore(this.sigElem, node2);
    }

    public void sign(XMLSignContext xMLSignContext) throws MarshalException, XMLSignatureException {
        if (xMLSignContext == null) {
            ny61.t("signContext cannot be null");
            return;
        }
        DOMSignContext dOMSignContext = (DOMSignContext) xMLSignContext;
        marshal(dOMSignContext.getParent(), dOMSignContext.getNextSibling(), DOMUtils.getSignaturePrefix(dOMSignContext), dOMSignContext);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        this.signatureIdMap = hashMap;
        hashMap.put(this.id, this);
        this.signatureIdMap.put(this.si.getId(), this.si);
        List<Reference> references = this.si.getReferences();
        for (Reference reference : references) {
            this.signatureIdMap.put(reference.getId(), reference);
        }
        for (XMLObject xMLObject : this.objects) {
            this.signatureIdMap.put(xMLObject.getId(), xMLObject);
            for (Manifest manifest : xMLObject.getContent()) {
                if (manifest instanceof Manifest) {
                    Manifest manifest2 = manifest;
                    this.signatureIdMap.put(manifest2.getId(), manifest2);
                    for (Reference reference2 : manifest2.getReferences()) {
                        arrayList.add(reference2);
                        this.signatureIdMap.put(reference2.getId(), reference2);
                    }
                }
            }
        }
        arrayList.addAll(references);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            digestReference((DOMReference) ((Reference) it.next()), xMLSignContext);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DOMReference dOMReference = (DOMReference) ((Reference) it2.next());
            if (!dOMReference.isDigested()) {
                dOMReference.digest(xMLSignContext);
            }
        }
        try {
            KeySelectorResult select = xMLSignContext.getKeySelector().select(this.ki, KeySelector.Purpose.SIGN, this.si.getSignatureMethod(), xMLSignContext);
            Key key = select.getKey();
            if (key == null) {
                throw new XMLSignatureException("the keySelector did not find a signing key");
            }
            try {
                ((DOMSignatureValue) this.sv).setValue(((AbstractDOMSignatureMethod) this.si.getSignatureMethod()).sign(key, this.si, xMLSignContext));
                this.localSigElem = this.sigElem;
                this.ksr = select;
            } catch (InvalidKeyException e) {
                throw new XMLSignatureException(e);
            }
        } catch (KeySelectorException e2) {
            throw new XMLSignatureException("cannot find signing key", e2);
        }
    }

    public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
        boolean z;
        int i;
        XMLValidateContext xMLValidateContext2 = xMLValidateContext;
        int i2 = 0;
        if (xMLValidateContext2 == null) {
            ny61.t("validateContext is null");
            return false;
        }
        if (!(xMLValidateContext2 instanceof DOMValidateContext)) {
            xfo.h("validateContext must be of type DOMValidateContext");
            return false;
        }
        if (this.validated) {
            return this.validationStatus;
        }
        if (this.sv.validate(xMLValidateContext2)) {
            List references = this.si.getReferences();
            int size = references.size();
            boolean z2 = true;
            for (int i3 = 0; z2 && i3 < size; i3++) {
                Reference reference = (Reference) references.get(i3);
                boolean validate = reference.validate(xMLValidateContext2);
                if (log.isDebugEnabled()) {
                    log.debug("Reference[" + reference.getURI() + "] is valid: " + validate);
                }
                z2 &= validate;
            }
            if (z2) {
                if (Boolean.TRUE.equals(xMLValidateContext2.getProperty("org.jcp.xml.dsig.validateManifests"))) {
                    int size2 = this.objects.size();
                    int i4 = 0;
                    z = true;
                    while (z && i4 < size2) {
                        List content = ((XMLObject) this.objects.get(i4)).getContent();
                        int size3 = content.size();
                        int i5 = i2;
                        while (z && i5 < size3) {
                            Manifest manifest = (XMLStructure) content.get(i5);
                            if (manifest instanceof Manifest) {
                                if (log.isDebugEnabled()) {
                                    log.debug("validating manifest");
                                }
                                List references2 = manifest.getReferences();
                                int size4 = references2.size();
                                int i6 = i2;
                                while (z && i6 < size4) {
                                    Reference reference2 = (Reference) references2.get(i6);
                                    boolean validate2 = reference2.validate(xMLValidateContext2);
                                    if (log.isDebugEnabled()) {
                                        i = i2;
                                        log.debug("Manifest ref[" + reference2.getURI() + "] is valid: " + validate2);
                                    } else {
                                        i = i2;
                                    }
                                    z &= validate2;
                                    i6++;
                                    xMLValidateContext2 = xMLValidateContext;
                                    i2 = i;
                                }
                            }
                            i5++;
                            xMLValidateContext2 = xMLValidateContext;
                            i2 = i2;
                        }
                        i4++;
                        xMLValidateContext2 = xMLValidateContext;
                        i2 = i2;
                    }
                } else {
                    z = true;
                }
                this.validationStatus = z;
                this.validated = true;
                return z;
            }
            if (log.isDebugEnabled()) {
                log.debug("Couldn't validate the References");
            }
        }
        this.validationStatus = false;
        this.validated = true;
        return false;
    }

    public class DOMSignatureValue extends DOMStructure implements XMLSignature.SignatureValue {
        private String id;
        private Element sigValueElem;
        private boolean validated = false;
        private boolean validationStatus;
        private byte[] value;
        private String valueBase64;

        public DOMSignatureValue(Element element, XMLCryptoContext xMLCryptoContext) throws MarshalException {
            try {
                this.value = Base64.decode(element);
                Attr attributeNodeNS = element.getAttributeNodeNS(null, "Id");
                if (attributeNodeNS != null) {
                    this.id = attributeNodeNS.getValue();
                    element.setIdAttributeNode(attributeNodeNS, true);
                } else {
                    this.id = null;
                }
                this.sigValueElem = element;
            } catch (Base64DecodingException e) {
                throw new MarshalException(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof XMLSignature.SignatureValue)) {
                return false;
            }
            XMLSignature.SignatureValue signatureValue = (XMLSignature.SignatureValue) obj;
            String str = this.id;
            return str == null ? signatureValue.getId() == null : str.equals(signatureValue.getId());
        }

        public String getId() {
            return this.id;
        }

        public byte[] getValue() {
            byte[] bArr = this.value;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }

        @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
        public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
            Element createElement = DOMUtils.createElement(DOMXMLSignature.this.ownerDoc, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#", str);
            this.sigValueElem = createElement;
            if (this.valueBase64 != null) {
                createElement.appendChild(DOMXMLSignature.this.ownerDoc.createTextNode(this.valueBase64));
            }
            DOMUtils.setAttributeID(this.sigValueElem, "Id", this.id);
            node.appendChild(this.sigValueElem);
        }

        public void setValue(byte[] bArr) {
            this.value = bArr;
            this.valueBase64 = Base64.encode(bArr);
            this.sigValueElem.appendChild(DOMXMLSignature.this.ownerDoc.createTextNode(this.valueBase64));
        }

        public boolean validate(XMLValidateContext xMLValidateContext) throws XMLSignatureException {
            if (xMLValidateContext == null) {
                ny61.t("context cannot be null");
                return false;
            }
            if (this.validated) {
                return this.validationStatus;
            }
            SignatureMethod signatureMethod = DOMXMLSignature.this.si.getSignatureMethod();
            try {
                KeySelectorResult select = xMLValidateContext.getKeySelector().select(DOMXMLSignature.this.ki, KeySelector.Purpose.VERIFY, signatureMethod, xMLValidateContext);
                Key key = select.getKey();
                if (key == null) {
                    throw new XMLSignatureException("the keyselector did not find a validation key");
                }
                try {
                    this.validationStatus = ((AbstractDOMSignatureMethod) signatureMethod).verify(key, DOMXMLSignature.this.si, this.value, xMLValidateContext);
                    this.validated = true;
                    DOMXMLSignature.this.ksr = select;
                    return this.validationStatus;
                } catch (Exception e) {
                    throw new XMLSignatureException(e);
                }
            } catch (KeySelectorException e2) {
                throw new XMLSignatureException("cannot find validation key", e2);
            }
        }

        public DOMSignatureValue(String str) {
            this.id = str;
        }
    }

    public DOMXMLSignature(SignedInfo signedInfo, KeyInfo keyInfo, List list, String str, String str2) {
        this.ownerDoc = null;
        this.localSigElem = null;
        this.sigElem = null;
        this.validated = false;
        if (signedInfo == null) {
            ny61.t("signedInfo cannot be null");
            throw null;
        }
        this.si = signedInfo;
        this.id = str;
        this.sv = new DOMSignatureValue(str2);
        if (list == null) {
            this.objects = Collections.EMPTY_LIST;
        } else {
            List w = ly3.w(list);
            this.objects = w;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (!(this.objects.get(i) instanceof XMLObject)) {
                    xfo.h(oyr.j(i, "objs[", "] is not an XMLObject"));
                    throw null;
                }
            }
        }
        this.ki = keyInfo;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        marshal(node, null, str, dOMCryptoContext);
    }
}
