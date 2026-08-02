package ru.CryptoPro.JCPxml.xmldsig;

import ru.CryptoPro.JCPxml.XmlInit;

/* loaded from: classes4.dex */
public class JCPXMLDSigInit {
    private JCPXMLDSigInit() {
    }

    public static synchronized void init() {
        synchronized (JCPXMLDSigInit.class) {
            XmlInit.init();
        }
    }

    public static boolean isInitialized() {
        return XmlInit.isInitialized();
    }
}
