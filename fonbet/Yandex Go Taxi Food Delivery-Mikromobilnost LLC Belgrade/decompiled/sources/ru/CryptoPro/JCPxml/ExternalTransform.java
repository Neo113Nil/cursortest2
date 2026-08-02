package ru.CryptoPro.JCPxml;

import java.security.Provider;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.TransformService;
import org.w3c.dom.Element;
import ru.CryptoPro.JCPxml.dsig.internal.dom.DOMTransform;

/* loaded from: classes4.dex */
public class ExternalTransform extends DOMTransform {
    public ExternalTransform(TransformService transformService) {
        super(transformService);
    }

    public ExternalTransform(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        super(element, xMLCryptoContext, provider);
    }
}
