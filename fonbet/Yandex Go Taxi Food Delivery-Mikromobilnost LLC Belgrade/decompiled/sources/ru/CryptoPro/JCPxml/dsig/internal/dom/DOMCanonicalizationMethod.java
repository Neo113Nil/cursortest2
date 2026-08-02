package ru.CryptoPro.JCPxml.dsig.internal.dom;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public class DOMCanonicalizationMethod extends DOMTransform implements CanonicalizationMethod {
    public DOMCanonicalizationMethod(TransformService transformService) throws InvalidAlgorithmParameterException {
        super(transformService);
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return transform(data, xMLCryptoContext);
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.DOMTransform
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanonicalizationMethod)) {
            return false;
        }
        CanonicalizationMethod canonicalizationMethod = (CanonicalizationMethod) obj;
        return getAlgorithm().equals(canonicalizationMethod.getAlgorithm()) && DOMUtils.paramsEqual(getParameterSpec(), canonicalizationMethod.getParameterSpec());
    }

    public DOMCanonicalizationMethod(Element element, XMLCryptoContext xMLCryptoContext, Provider provider) throws MarshalException {
        super(element, xMLCryptoContext, provider);
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        return transform(data, xMLCryptoContext, outputStream);
    }
}
