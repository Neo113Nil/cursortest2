package defpackage;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public final class ux61 extends xw61 implements qx61 {
    public List x;

    public ux61(Document document, mw61 mw61Var, List list, String str, String str2, String str3, String str4) {
        super(document, mw61Var, cl_63.K, str2, str3, str4);
        if (list.isEmpty()) {
            throw new XAdESException("The certificate collection can not be NULL or empty.", IAdESException.ecNodeEncodingFailed);
        }
        if (str != null) {
            a(null, "Id", str.concat("-CertValues"));
        }
        this.x = Collections.unmodifiableList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            try {
                Element g = g("EncapsulatedX509Certificate");
                g.appendChild(this.a.createTextNode(Base64.encode(x509Certificate.getEncoded())));
                getNode().appendChild(g);
            } catch (CertificateEncodingException e) {
                throw new XAdESException(e, IAdESException.ecSignatureMarshallingFailed);
            }
        }
    }

    public final List h() {
        if (this.x == null) {
            this.x = new LinkedList();
            List<Element> childElementsByTagNameNS = XMLUtils.getChildElementsByTagNameNS(e(), "EncapsulatedX509Certificate", this.c);
            if (!childElementsByTagNameNS.isEmpty()) {
                Iterator<Element> it = childElementsByTagNameNS.iterator();
                while (it.hasNext()) {
                    String textContent = it.next().getTextContent();
                    if (textContent != null) {
                        String trim = textContent.trim();
                        if (trim.length() > 0) {
                            try {
                                this.x.add((X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(Base64.decode(trim))));
                            } catch (Exception e) {
                                throw new XAdESException(e, IAdESException.ecNodeInvalidContent);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return Collections.unmodifiableList(this.x);
    }
}
