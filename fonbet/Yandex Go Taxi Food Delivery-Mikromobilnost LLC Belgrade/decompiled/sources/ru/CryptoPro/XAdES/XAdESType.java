package ru.CryptoPro.XAdES;

import defpackage.qu61;
import java.util.HashMap;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class XAdESType implements XAdESParameters {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(XAdESParameters.XAdES_Unknown, "Unknown signature type");
        hashMap.put(XAdESParameters.XAdES_BES, "XAdES-BES");
        hashMap.put(XAdESParameters.XAdES_T, "XAdES-T");
        hashMap.put(XAdESParameters.XAdES_X_Long_Type_1, "XAdES-X Long Type 1");
        hashMap.put(XAdESParameters.XML_DSIG, "XML DSig signature");
    }

    public static qu61 a(Element element) {
        JCPLogger.finer("Extracting qualifying properties...");
        if (element == null) {
            return null;
        }
        String attribute = element.getAttribute("Id");
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64.b.b());
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) {
            return null;
        }
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            Element element2 = (Element) elementsByTagNameNS.item(i);
            String attribute2 = element2.getAttribute("Target");
            if (attribute == null || attribute2 == null) {
                return new qu61(element2, attribute);
            }
            if (attribute2.length() > 0 && attribute2.charAt(0) == '#') {
                attribute2 = attribute2.substring(1);
            }
            if (attribute.equals(attribute2)) {
                return new qu61(element2, attribute);
            }
        }
        return null;
    }

    public static Element b(qu61 qu61Var) {
        JCPLogger.finer("Extracting qualifying signed properties...");
        NodeList elementsByTagNameNS = qu61Var.e().getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64.c.b());
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) {
            return null;
        }
        return (Element) elementsByTagNameNS.item(0);
    }

    public static boolean c(Element element, String str, String str2) {
        JCPLogger.finerFormat("Checking existence of {0}...", str);
        NodeList elementsByTagNameNS = element.getElementsByTagNameNS(str2, str);
        return elementsByTagNameNS != null && elementsByTagNameNS.getLength() > 0;
    }

    public static Element d(qu61 qu61Var) {
        JCPLogger.finer("Extracting qualifying unsigned signature properties...");
        NodeList elementsByTagNameNS = qu61Var.e().getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64.x.b());
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) {
            return null;
        }
        return (Element) elementsByTagNameNS.item(0);
    }

    public static String getSignatureTypeName(Integer num) {
        return (String) a.get(num);
    }

    public static Integer getXAdESSignatureType(Element element) {
        qu61 a2 = a(element);
        if (a2 == null) {
            return XAdESParameters.XML_DSIG;
        }
        JCPLogger.finer("Extracting qualifying signed signature properties...");
        NodeList elementsByTagNameNS = a2.e().getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64.d.b());
        if (((elementsByTagNameNS == null || elementsByTagNameNS.getLength() <= 0) ? null : (Element) elementsByTagNameNS.item(0)) == null) {
            return XAdESParameters.XML_DSIG;
        }
        Element d = d(a2);
        if (d != null) {
            boolean c = c(d, cl_63.D, XAdESParameters.XADES_SIGNATURE_NAMESPACE);
            boolean z = c(d, cl_63.O, XAdESParameters.XADES_SIGNATURE_NAMESPACE) || c(d, cl_63.P, XAdESParameters.XADES_SIGNATURE_NAMESPACE) || c(d, cl_63.P, XAdESParameters.XADES141_SIGNATURE_NAMESPACE);
            boolean z2 = c(d, cl_63.E, XAdESParameters.XADES_SIGNATURE_NAMESPACE) || c(d, cl_63.F, XAdESParameters.XADES_SIGNATURE_NAMESPACE) || c(d, cl_63.F, XAdESParameters.XADES141_SIGNATURE_NAMESPACE);
            boolean c2 = c(d, cl_63.G, XAdESParameters.XADES_SIGNATURE_NAMESPACE);
            boolean c3 = c(d, cl_63.K, XAdESParameters.XADES_SIGNATURE_NAMESPACE);
            boolean c4 = c(d, cl_63.L, XAdESParameters.XADES_SIGNATURE_NAMESPACE);
            if (z2 && c2 && c3 && c4 && c && z) {
                return XAdESParameters.XAdES_X_Long_Type_1;
            }
            if (c) {
                return XAdESParameters.XAdES_T;
            }
        }
        return XAdESParameters.XAdES_BES;
    }
}
