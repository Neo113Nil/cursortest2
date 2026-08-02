package ru.domesticroots.certificatetransparency.chaincleaner;

import defpackage.jl40;
import defpackage.quz;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002R0\u0010\u0005\u001a$\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\u0012\u0012\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\n0\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/domesticroots/certificatetransparency/chaincleaner/BasicCertificateChainCleaner;", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "(Ljavax/net/ssl/X509TrustManager;)V", "subjectToCaCerts", "", "Ljavax/security/auth/x500/X500Principal;", "kotlin.jvm.PlatformType", "", "Ljava/security/cert/X509Certificate;", "clean", "chain", "hostname", "", "findTrustedCertByIssuerAndSignature", "cert", "isSignedBy", "", "signingCert", "Companion", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicCertificateChainCleaner implements CertificateChainCleaner {
    private static final int MAX_SIGNERS = 9;
    private final Map<X500Principal, List<X509Certificate>> subjectToCaCerts;

    public BasicCertificateChainCleaner(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : acceptedIssuers) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((List) obj).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    private final X509Certificate findTrustedCertByIssuerAndSignature(X509Certificate cert) {
        List<X509Certificate> list = this.subjectToCaCerts.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (isSignedBy(cert, (X509Certificate) next)) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    private final boolean isSignedBy(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!jl40.l(x509Certificate.getIssuerX500Principal(), x509Certificate2.getSubjectX500Principal())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleaner
    public List<X509Certificate> clean(List<? extends X509Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
        Object obj;
        if (chain.isEmpty()) {
            throw new SSLPeerUnverifiedException("Certificate chain is empty");
        }
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) a.Z(arrayList);
            X509Certificate findTrustedCertByIssuerAndSignature = findTrustedCertByIssuerAndSignature(x509Certificate);
            if (findTrustedCertByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !jl40.l(x509Certificate, findTrustedCertByIssuerAndSignature)) {
                    arrayList.add(findTrustedCertByIssuerAndSignature);
                }
                if (isSignedBy(findTrustedCertByIssuerAndSignature, findTrustedCertByIssuerAndSignature)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (isSignedBy(x509Certificate, (X509Certificate) obj)) {
                        break;
                    }
                }
                X509Certificate x509Certificate2 = (X509Certificate) obj;
                if (x509Certificate2 == null) {
                    if (!z) {
                        quz.j(x509Certificate, "Failed to find a trusted cert that signed ");
                        return null;
                    }
                    return arrayList;
                }
                arrayDeque.remove(x509Certificate2);
                arrayList.add(x509Certificate2);
            }
        }
        quz.j(arrayList, "Certificate chain too long: ");
        return null;
    }
}
