package ru.CryptoPro.JCPxml.dsig.internal.dom;

import java.io.IOException;
import javax.xml.crypto.OctetStreamData;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.signature.XMLSignatureInput;

/* loaded from: classes4.dex */
public class ApacheOctetStreamData extends OctetStreamData implements ApacheData {
    private XMLSignatureInput xi;

    public ApacheOctetStreamData(XMLSignatureInput xMLSignatureInput) throws CanonicalizationException, IOException {
        super(xMLSignatureInput.getOctetStream(), xMLSignatureInput.getSourceURI(), xMLSignatureInput.getMIMEType());
        this.xi = xMLSignatureInput;
    }

    @Override // ru.CryptoPro.JCPxml.dsig.internal.dom.ApacheData
    public XMLSignatureInput getXMLSignatureInput() {
        return this.xi;
    }
}
