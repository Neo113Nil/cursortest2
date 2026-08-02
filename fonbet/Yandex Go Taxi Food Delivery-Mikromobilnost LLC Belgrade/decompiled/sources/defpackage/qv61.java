package defpackage;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;

/* loaded from: classes4.dex */
public class qv61 implements BaseParameterValidator {
    @Override // ru.CryptoPro.AdES.BaseParameterValidator
    public final void validate(Object obj) {
        Element b;
        String attribute;
        NodeList elementsByTagNameNS;
        Element element = (Element) obj;
        JCPLogger.subEnter();
        qu61 a = XAdESType.a(element);
        if (a != null && (b = XAdESType.b(a)) != null && (attribute = b.getAttribute("Id")) != null && (elementsByTagNameNS = element.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Reference")) != null && elementsByTagNameNS.getLength() > 0) {
            for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
                Element element2 = (Element) elementsByTagNameNS.item(i);
                String attribute2 = element2.getAttribute(GlobalRouterActivity.URI);
                if (attribute2 != null && attribute2.length() > 0) {
                    if (attribute2.charAt(0) == '#') {
                        attribute2 = attribute2.substring(1);
                    }
                    if (attribute.equals(attribute2)) {
                        String attribute3 = element2.getAttribute("Type");
                        if (attribute3 == null || !attribute3.equals(XAdESParameters.URI_SIGNED_PROPERTIES)) {
                            throw new AdESException("Reference type to signed properties is invalid", new Integer[0]);
                        }
                        JCPLogger.subExit();
                        return;
                    }
                }
            }
        }
        throw new AdESException("Reference type to signed properties not found", IAdESException.ecNodeInvalidContent);
    }
}
