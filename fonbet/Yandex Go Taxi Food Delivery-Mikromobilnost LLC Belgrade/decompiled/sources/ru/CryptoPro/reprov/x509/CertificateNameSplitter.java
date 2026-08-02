package ru.CryptoPro.reprov.x509;

import java.util.Iterator;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CertificateNameSplitter {
    public static String getCN(byte[] bArr) {
        try {
            return new X500Name(bArr).getCommonName();
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return "";
        }
    }

    public static Vector listName(byte[] bArr) {
        Vector vector = new Vector(0);
        try {
            Iterator it = new X500Name(bArr).allAvas().iterator();
            while (it.hasNext()) {
                vector.add(it.next().toString());
            }
            return vector;
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return vector;
        }
    }
}
