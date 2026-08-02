package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.Data;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;

/* loaded from: classes4.dex */
public final class DOMCanonicalXMLC14NMethod extends ApacheCanonicalizer {
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec == null) {
            return;
        }
        kbs.t("no parameters should be specified for Canonical XML C14N algorithm");
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        if ((data instanceof DOMSubTreeData) && ((DOMSubTreeData) data).excludeComments()) {
            try {
                this.apacheCanonicalizer = Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
            } catch (InvalidCanonicalizerException e) {
                throw new TransformException("Couldn't find Canonicalizer for: http://www.w3.org/TR/2001/REC-xml-c14n-20010315: " + e.getMessage(), e);
            }
        }
        return canonicalize(data, xMLCryptoContext);
    }
}
