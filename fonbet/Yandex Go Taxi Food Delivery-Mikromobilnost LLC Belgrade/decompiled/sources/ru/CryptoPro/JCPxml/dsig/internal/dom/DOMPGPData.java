package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ly3;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.keyinfo.PGPData;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class DOMPGPData extends DOMStructure implements PGPData {
    private final List externalElements;
    private final byte[] keyId;
    private final byte[] keyPacket;

    public DOMPGPData(byte[] bArr, byte[] bArr2, List list) {
        if (bArr == null) {
            ny61.t("keyId cannot be null");
            throw null;
        }
        if (bArr.length != 8) {
            ny61.g("keyId must be 8 bytes long");
            throw null;
        }
        if (list == null || list.isEmpty()) {
            this.externalElements = Collections.EMPTY_LIST;
        } else {
            List w = ly3.w(list);
            this.externalElements = w;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (!(this.externalElements.get(i) instanceof XMLStructure)) {
                    xfo.h(oyr.j(i, "other[", "] is not a valid PGPData type"));
                    throw null;
                }
            }
        }
        this.keyId = (byte[]) bArr.clone();
        this.keyPacket = bArr2 != null ? (byte[]) bArr2.clone() : null;
        if (bArr2 != null) {
            checkKeyPacket(bArr2);
        }
    }

    private void checkKeyPacket(byte[] bArr) {
        String str;
        if (bArr.length >= 3) {
            byte b = bArr[0];
            if ((b & DerValue.TAG_CONTEXT) != 128) {
                str = "keypacket tag is invalid: bit 7 is not set";
            } else if ((b & DerValue.TAG_APPLICATION) != 64) {
                str = "old keypacket tag format is unsupported";
            } else if ((b & 6) == 6 || (b & PKIBody._CCR) == 14 || (b & 5) == 5 || (b & 7) == 7) {
                return;
            } else {
                str = "keypacket tag is invalid: must be 6, 14, 5, or 7";
            }
        } else {
            str = "keypacket must be at least 3 bytes long";
        }
        ny61.g(str);
    }

    public List getExternalElements() {
        return this.externalElements;
    }

    public byte[] getKeyId() {
        byte[] bArr = this.keyId;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public byte[] getKeyPacket() {
        byte[] bArr = this.keyPacket;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        Document ownerDocument = DOMUtils.getOwnerDocument(node);
        Element createElement = DOMUtils.createElement(ownerDocument, "PGPData", "http://www.w3.org/2000/09/xmldsig#", str);
        if (this.keyId != null) {
            Element createElement2 = DOMUtils.createElement(ownerDocument, "PGPKeyID", "http://www.w3.org/2000/09/xmldsig#", str);
            createElement2.appendChild(ownerDocument.createTextNode(Base64.encode(this.keyId)));
            createElement.appendChild(createElement2);
        }
        if (this.keyPacket != null) {
            Element createElement3 = DOMUtils.createElement(ownerDocument, "PGPKeyPacket", "http://www.w3.org/2000/09/xmldsig#", str);
            createElement3.appendChild(ownerDocument.createTextNode(Base64.encode(this.keyPacket)));
            createElement.appendChild(createElement3);
        }
        Iterator it = this.externalElements.iterator();
        while (it.hasNext()) {
            DOMUtils.appendChild(createElement, ((XMLStructure) it.next()).getNode());
        }
        node.appendChild(createElement);
    }

    public DOMPGPData(byte[] bArr, List list) {
        if (bArr == null) {
            ny61.t("keyPacket cannot be null");
            throw null;
        }
        if (list == null || list.isEmpty()) {
            this.externalElements = Collections.EMPTY_LIST;
        } else {
            List w = ly3.w(list);
            this.externalElements = w;
            int size = w.size();
            for (int i = 0; i < size; i++) {
                if (!(this.externalElements.get(i) instanceof XMLStructure)) {
                    xfo.h(oyr.j(i, "other[", "] is not a valid PGPData type"));
                    throw null;
                }
            }
        }
        this.keyPacket = (byte[]) bArr.clone();
        checkKeyPacket(bArr);
        this.keyId = null;
    }

    public DOMPGPData(Element element) throws MarshalException {
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        ArrayList arrayList = new ArrayList(length);
        byte[] bArr = null;
        byte[] bArr2 = null;
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String localName = element2.getLocalName();
                try {
                    if (localName.equals("PGPKeyID")) {
                        bArr = Base64.decode(element2);
                    } else if (localName.equals("PGPKeyPacket")) {
                        bArr2 = Base64.decode(element2);
                    } else {
                        arrayList.add(new javax.xml.crypto.dom.DOMStructure(element2));
                    }
                } catch (Base64DecodingException e) {
                    throw new MarshalException(e);
                }
            }
        }
        this.keyId = bArr;
        this.keyPacket = bArr2;
        this.externalElements = Collections.unmodifiableList(arrayList);
    }
}
