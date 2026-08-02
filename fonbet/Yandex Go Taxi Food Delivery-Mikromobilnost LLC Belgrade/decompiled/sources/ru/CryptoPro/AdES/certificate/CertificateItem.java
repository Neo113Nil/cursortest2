package ru.CryptoPro.AdES.certificate;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class CertificateItem {
    private final X509Certificate certificate;
    private final CertificateRole certificateRole;

    public enum CertificateRole {
        Unknown,
        Signer,
        TSPSigner,
        OCSPSigner,
        CRLSigner,
        Other
    }

    public CertificateItem(X509Certificate x509Certificate, CertificateRole certificateRole) {
        this.certificate = x509Certificate;
        this.certificateRole = certificateRole;
    }

    public static List<X509Certificate> getCertificates(List<CertificateItem> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<CertificateItem> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().getCertificate());
        }
        return Collections.unmodifiableList(linkedList);
    }

    public static List<CertificateItem> performChainWithRoles(List<X509Certificate> list, CertificateRole certificateRole) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (X509Certificate x509Certificate : list) {
            if (z) {
                arrayList.add(new CertificateItem(x509Certificate, certificateRole));
                z = false;
            } else {
                arrayList.add(new CertificateItem(x509Certificate, CertificateRole.Other));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public X509Certificate getCertificate() {
        return this.certificate;
    }

    public CertificateRole getCertificateRole() {
        return this.certificateRole;
    }
}
