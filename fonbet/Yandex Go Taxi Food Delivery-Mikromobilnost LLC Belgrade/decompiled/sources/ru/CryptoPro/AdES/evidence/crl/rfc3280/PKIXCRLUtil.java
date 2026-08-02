package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import defpackage.f490;
import defpackage.g490;
import defpackage.h490;
import defpackage.ncc;
import defpackage.nju0;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;

/* loaded from: classes4.dex */
class PKIXCRLUtil {
    public Set findCRLs(g490 g490Var, Date date, List list, List list2) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(g490Var, list2));
            hashSet.addAll(findCRLs(g490Var, list));
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = g490Var.a;
                    X509Certificate certificateChecking = cRLSelector instanceof X509CRLSelector ? ((X509CRLSelector) cRLSelector).getCertificateChecking() : null;
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            h490.b(e, "Exception obtaining complete CRLs.");
            return null;
        }
    }

    private final Collection findCRLs(g490 g490Var, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof nju0) {
                hashSet.addAll(((ncc) ((nju0) obj)).a(g490Var));
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(new f490(g490Var)));
                } catch (CertStoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                }
            }
            z = true;
        }
        if (z || annotatedException == null) {
            return hashSet;
        }
        throw annotatedException;
    }
}
