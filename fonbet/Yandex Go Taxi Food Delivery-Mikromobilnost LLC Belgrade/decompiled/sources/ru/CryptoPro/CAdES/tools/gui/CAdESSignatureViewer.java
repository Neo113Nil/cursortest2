package ru.CryptoPro.CAdES.tools.gui;

import defpackage.bu61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Set;
import ru.CryptoPro.CAdES.CAdESSignature;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignatureViewer {
    public static void show(CAdESSignature cAdESSignature, Set<X509Certificate> set, Set<X509CRL> set2) {
        JCPLogger.subEnter();
        MainControlPane.setStyle();
        bu61.b(cAdESSignature, set, set2);
        JCPLogger.subExit();
    }

    public static void show(CAdESSignature cAdESSignature) {
        show(cAdESSignature, null, null);
    }
}
