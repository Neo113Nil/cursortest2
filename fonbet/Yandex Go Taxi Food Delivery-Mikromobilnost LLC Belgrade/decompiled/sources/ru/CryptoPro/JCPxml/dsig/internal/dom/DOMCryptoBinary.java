package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import java.math.BigInteger;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMCryptoContext;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/* loaded from: classes4.dex */
public final class DOMCryptoBinary extends DOMStructure {
    private final BigInteger bigNum;
    private final String value;

    public DOMCryptoBinary(Node node) throws MarshalException {
        this.value = node.getNodeValue();
        try {
            this.bigNum = Base64.decodeBigIntegerFromText((Text) node);
        } catch (Exception e) {
            throw new MarshalException(e);
        }
    }

    public BigInteger getBigNum() {
        return this.bigNum;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMStructure
    public void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException {
        node.appendChild(DOMUtils.getOwnerDocument(node).createTextNode(this.value));
    }

    public DOMCryptoBinary(BigInteger bigInteger) {
        if (bigInteger == null) {
            ny61.t("bigNum is null");
            throw null;
        }
        this.bigNum = bigInteger;
        this.value = Base64.encode(bigInteger);
    }
}
