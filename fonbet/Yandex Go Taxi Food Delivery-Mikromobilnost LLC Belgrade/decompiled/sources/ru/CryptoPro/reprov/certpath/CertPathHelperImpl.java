package ru.CryptoPro.reprov.certpath;

/* loaded from: classes4.dex */
public class CertPathHelperImpl extends CertPathHelper {
    public static synchronized void initialize() {
        synchronized (CertPathHelperImpl.class) {
            if (CertPathHelper.a == null) {
                CertPathHelper.a = new CertPathHelperImpl();
            }
        }
    }
}
