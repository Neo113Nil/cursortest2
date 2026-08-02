package defpackage;

import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public class rs61 extends xw61 {
    public rs61(Document document, xw61 xw61Var, String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6) {
        super(document, xw61Var, str, str3, str4, str5);
        Element e = e();
        Element c = c("http://www.w3.org/2000/09/xmldsig#", str5, "DigestMethod");
        c.setPrefix(str5);
        e.appendChild(c);
        c.setAttributeNS(null, "Algorithm", str2);
        XAdESUtility.findDigestNameByDigestUri(str2);
        String encode = Base64.encode(bArr);
        Element c2 = c("http://www.w3.org/2000/09/xmldsig#", str5, "DigestValue");
        c2.setPrefix(str5);
        e.appendChild(c2);
        c2.setTextContent(encode);
    }

    public final byte[] h() {
        String textContent;
        Element b = b("DigestValue", "http://www.w3.org/2000/09/xmldsig#");
        if (b != null && (textContent = b.getTextContent()) != null) {
            String trim = textContent.trim();
            if (trim.length() > 0) {
                try {
                    return Base64.decode(trim);
                } catch (Base64DecodingException e) {
                    throw new XAdESException((Exception) e, IAdESException.ecNodeInvalidContent);
                }
            }
        }
        return null;
    }
}
