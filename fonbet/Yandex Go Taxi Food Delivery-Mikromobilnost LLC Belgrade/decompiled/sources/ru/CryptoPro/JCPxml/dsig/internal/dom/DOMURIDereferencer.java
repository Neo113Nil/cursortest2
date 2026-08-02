package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import defpackage.oyr;
import javax.xml.crypto.Data;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReference;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMURIReference;
import org.apache.xml.security.Init;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class DOMURIDereferencer implements URIDereferencer {
    static final URIDereferencer INSTANCE = new DOMURIDereferencer();

    private DOMURIDereferencer() {
        Init.init();
    }

    public Data dereference(URIReference uRIReference, XMLCryptoContext xMLCryptoContext) throws URIReferenceException {
        if (uRIReference == null) {
            ny61.t("uriRef cannot be null");
            return null;
        }
        if (xMLCryptoContext == null) {
            ny61.t("context cannot be null");
            return null;
        }
        Attr attr = (Attr) ((DOMURIReference) uRIReference).getHere();
        String uri = uRIReference.getURI();
        DOMCryptoContext dOMCryptoContext = (DOMCryptoContext) xMLCryptoContext;
        String baseURI = xMLCryptoContext.getBaseURI();
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        boolean z = bool != null && bool.booleanValue();
        if (uri != null && uri.length() != 0 && uri.charAt(0) == '#') {
            String substring = uri.substring(1);
            if (substring.startsWith("xpointer(id(")) {
                int indexOf = substring.indexOf(39) + 1;
                substring = substring.substring(indexOf, substring.indexOf(39, indexOf));
            }
            Element elementById = dOMCryptoContext.getElementById(substring);
            if (elementById != null) {
                if (z && !XMLUtils.protectAgainstWrappingAttack(elementById.getOwnerDocument().getDocumentElement(), elementById, substring)) {
                    throw new URIReferenceException(oyr.p("Multiple Elements with the same ID ", substring, " were detected"));
                }
                XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(elementById);
                if (!uri.substring(1).startsWith("xpointer(id(")) {
                    xMLSignatureInput.setExcludeComments(true);
                }
                xMLSignatureInput.setMIMEType("text/xml");
                xMLSignatureInput.setSourceURI((baseURI == null || baseURI.length() <= 0) ? attr.getNodeValue() : baseURI.concat(attr.getNodeValue()));
                return new ApacheNodeSetData(xMLSignatureInput);
            }
        }
        try {
            XMLSignatureInput resolve = (Platform.isAndroid ? ResourceResolver.getInstance(attr, baseURI) : ResourceResolver.getInstance(attr, baseURI, z)).resolve(attr, baseURI);
            return resolve.isOctetStream() ? new ApacheOctetStreamData(resolve) : new ApacheNodeSetData(resolve);
        } catch (Exception e) {
            throw new URIReferenceException(e);
        }
    }
}
