package ru.CryptoPro.JCPxml.utility;

import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class DocumentIdResolver extends ResourceResolverSpi {
    public boolean engineCanResolve(Attr attr, String str) {
        if (attr == null) {
            JCPLogger.finer("Quick fail for null uri");
            return false;
        }
        String nodeValue = attr.getNodeValue();
        if (nodeValue.equals("") || (nodeValue.charAt(0) == '#' && !(nodeValue.charAt(1) == 'x' && nodeValue.startsWith("#xpointer(")))) {
            JCPLogger.finer("State I can resolve reference: ", nodeValue);
            return true;
        }
        JCPLogger.finer("Do not seem to be able to resolve reference: ", nodeValue);
        return false;
    }

    public boolean engineIsThreadSafe() {
        return true;
    }

    public XMLSignatureInput engineResolve(Attr attr, String str) throws ResourceResolverException {
        Node node;
        String nodeValue = attr.getNodeValue();
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        if (nodeValue.equals("")) {
            JCPLogger.finer("ResolverFragment with empty URI (means complete document)");
            node = ownerDocument;
        } else {
            String substring = nodeValue.substring(1);
            Node elementById = XMLIdResolver.getElementById(ownerDocument, substring);
            if (elementById == null) {
                throw new ResourceResolverException("signature.Verification.MissingID", new Object[]{substring}, attr, str);
            }
            if (!Platform.isAndroid && this.secureValidation && !XMLUtils.protectAgainstWrappingAttack(attr.getOwnerDocument().getDocumentElement(), substring)) {
                throw new ResourceResolverException("signature.Verification.MultipleIDs", new Object[]{substring}, attr, str);
            }
            JCPLogger.finerFormat("Try to catch an Element with ID {0} and Element was {1}", substring, elementById);
            node = elementById;
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.setExcludeComments(true);
        xMLSignatureInput.setMIMEType("text/xml");
        xMLSignatureInput.setSourceURI((str == null || str.length() <= 0) ? attr.getNodeValue() : str.concat(attr.getNodeValue()));
        return xMLSignatureInput;
    }
}
