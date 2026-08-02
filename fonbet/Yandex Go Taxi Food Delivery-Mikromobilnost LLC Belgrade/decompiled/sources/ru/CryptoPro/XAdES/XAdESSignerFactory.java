package ru.CryptoPro.XAdES;

import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public class XAdESSignerFactory extends XAdESType {
    public static XAdESSignerBinaryImpl e(Element element, Integer num) {
        if (num == null) {
            num = XAdESType.getXAdESSignatureType(element);
        }
        JCPLogger.fine("New signer with type: ", XAdESType.getSignatureTypeName(num));
        if (num.equals(XAdESParameters.XML_DSIG)) {
            return new XAdESSignerBinaryImpl(element, num);
        }
        if (num.equals(XAdESParameters.XAdES_T)) {
            return new XAdESSignerTImpl(element, num);
        }
        if (num.equals(XAdESParameters.XAdES_X_Long_Type_1)) {
            return new XAdESSignerXLT1Impl(element, num);
        }
        if (num.equals(XAdESParameters.XAdES_BES)) {
            return new XAdESSignerBESImpl(element, num);
        }
        throw new XAdESException("Unknown signature type", IAdESException.ecSignatureUnsupported);
    }
}
