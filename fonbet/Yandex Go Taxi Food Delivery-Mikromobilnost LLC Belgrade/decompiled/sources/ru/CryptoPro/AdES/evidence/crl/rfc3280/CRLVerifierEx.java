package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import defpackage.ayo;
import defpackage.fxs;
import defpackage.g2k;
import defpackage.gxs;
import defpackage.h2k;
import defpackage.h490;
import defpackage.j2;
import defpackage.j97;
import defpackage.l490;
import defpackage.pm3;
import defpackage.quu0;
import defpackage.w511;
import defpackage.xpf;
import defpackage.yf;
import java.security.PublicKey;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.bouncycastle.jce.provider.AnnotatedException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CRLVerifierEx extends CertPathValidatorUtilities {
    private X509Certificate checkCert;
    private X509Certificate issuerCert;
    private l490 pkixParams;
    private Date validDate;

    public CRLVerifierEx(X509Certificate x509Certificate, X509Certificate x509Certificate2, l490 l490Var) {
        this.validDate = null;
        this.pkixParams = null;
        this.issuerCert = null;
        this.checkCert = null;
        JCPLogger.subEnter();
        this.checkCert = x509Certificate;
        this.issuerCert = x509Certificate2;
        l490Var.getClass();
        this.pkixParams = l490Var;
        this.validDate = CertPathValidatorUtilities.getValidDate(l490Var);
        JCPLogger.subExit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
    
        if (r10 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f3, code lost:
    
        defpackage.w511.s("No valid CRL found.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
    
        throw r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void checkCRL(g2k g2kVar, l490 l490Var, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask) throws Exception {
        X509CRL x509crl;
        X509CRL x509crl2;
        ReasonsMask processCRLD;
        JCPLogger.subEnter();
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(g2kVar, x509Certificate, new Date(System.currentTimeMillis()), l490Var).iterator();
        X509CRL x509crl3 = null;
        boolean z = false;
        AnnotatedException annotatedException = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                x509crl2 = (X509CRL) it.next();
                processCRLD = RFC3280CRLUtility.processCRLD(x509crl2, g2kVar);
            } catch (AnnotatedException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
            if (processCRLD.hasNewReasons(reasonsMask)) {
                try {
                    RFC3280CRLUtility.processCRLG(x509crl2, RFC3280CRLUtility.processCRLF(x509crl2, x509Certificate, x509Certificate2, publicKey, l490Var));
                    l490Var.a();
                    l490Var.a();
                } catch (AnnotatedException e3) {
                    e = e3;
                    x509crl = x509crl3;
                    annotatedException = e;
                    x509crl3 = x509crl;
                } catch (Exception e4) {
                    e = e4;
                    x509crl = x509crl3;
                    JCPLogger.thrown(e);
                    x509crl3 = x509crl;
                }
                if (x509Certificate.getNotAfter().getTime() >= x509crl2.getThisUpdate().getTime()) {
                    try {
                        try {
                            RFC3280CRLUtility.processCRLB1(g2kVar, x509Certificate, x509crl2);
                            RFC3280CRLUtility.processCRLB2(g2kVar, x509Certificate, x509crl2);
                            RFC3280CRLUtility.processCRLC(x509crl3, x509crl2, l490Var);
                            RFC3280CRLUtility.processCRLI(date, x509crl3, x509Certificate, certStatus, l490Var);
                            RFC3280CRLUtility.processCRLJ(date, x509crl2, x509Certificate, certStatus);
                            if (certStatus.getCertStatus() == 8) {
                                certStatus.setCertStatus(11);
                            }
                            reasonsMask.addReasons(processCRLD);
                            Set<String> criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                HashSet hashSet = new HashSet(criticalExtensionOIDs);
                                hashSet.remove(ayo.F.a);
                                hashSet.remove(ayo.E.a);
                                if (!hashSet.isEmpty()) {
                                    throw new AnnotatedException("CRL contains unsupported critical extensions.", null);
                                }
                            }
                            z = true;
                            x509crl3 = null;
                        } catch (Exception e5) {
                            e = e5;
                            x509crl = null;
                        }
                    } catch (AnnotatedException e6) {
                        annotatedException = e6;
                        x509crl = null;
                    }
                } else {
                    try {
                        x509crl = null;
                    } catch (AnnotatedException e7) {
                        e = e7;
                        x509crl = null;
                    }
                    try {
                        throw new AnnotatedException("No valid CRL for current time found.", null);
                    } catch (AnnotatedException e8) {
                        e = e8;
                        annotatedException = e;
                        x509crl3 = x509crl;
                    } catch (Exception e9) {
                        e = e9;
                    }
                }
                JCPLogger.thrown(e);
            } else {
                x509crl = x509crl3;
            }
            x509crl3 = x509crl;
        }
        JCPLogger.subExit();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkCRLs(l490 l490Var, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey) throws Exception {
        AnnotatedException annotatedException;
        boolean z;
        l490 l490Var2 = l490Var;
        JCPLogger.subEnter();
        try {
            X509Certificate x509Certificate3 = x509Certificate;
            j97 n = j97.n(CertPathValidatorUtilities.getExtensionValue(x509Certificate3, RFC3280CRLUtility.CRL_DISTRIBUTION_POINTS));
            new ArrayList();
            new HashMap();
            new ArrayList();
            new HashMap();
            PKIXParameters pKIXParameters = l490Var2.a;
            Map map = l490Var2.y;
            new ArrayList(l490Var2.c);
            new HashMap(l490Var2.w);
            ArrayList arrayList = new ArrayList(l490Var2.x);
            new HashMap(map);
            try {
                Iterator<Object> it = CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(n, map).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    arrayList.add(null);
                }
                CertStatus certStatus = new CertStatus();
                ReasonsMask reasonsMask = new ReasonsMask();
                boolean z2 = true;
                if (n != null) {
                    try {
                        g2k[] m = n.m();
                        annotatedException = null;
                        int i = 0;
                        z = false;
                        while (i < m.length && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
                            try {
                                checkCRL(m[i], l490Var2, x509Certificate3, date, x509Certificate2, publicKey, certStatus, reasonsMask);
                                z = true;
                            } catch (AnnotatedException e) {
                                annotatedException = e;
                            }
                            i++;
                            l490Var2 = l490Var;
                            x509Certificate3 = x509Certificate;
                        }
                    } catch (Exception e2) {
                        h490.b(e2, "Distribution points could not be read.");
                        return;
                    }
                } else {
                    annotatedException = null;
                    z = false;
                }
                if (certStatus.getCertStatus() == 11) {
                    try {
                    } catch (AnnotatedException e3) {
                        annotatedException = e3;
                    }
                    if (!reasonsMask.isAllReasons()) {
                        try {
                            gxs gxsVar = new gxs(new fxs(4, new j2(PrincipalUtils.getEncodedIssuerPrincipal(x509Certificate).getEncoded()).n()));
                            h2k h2kVar = new h2k();
                            h2kVar.b = 0;
                            h2kVar.a = gxsVar;
                            g2k g2kVar = new g2k();
                            g2kVar.a = h2kVar;
                            g2kVar.b = null;
                            g2kVar.c = null;
                            checkCRL(g2kVar, l490Var, x509Certificate, date, x509Certificate2, publicKey, certStatus, reasonsMask);
                            if (z2) {
                                if (annotatedException != null) {
                                    throw annotatedException;
                                }
                                h490.b(annotatedException, "No valid CRL found.");
                                return;
                            }
                            certStatus.getCertStatus();
                            if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == 11) {
                                certStatus.setCertStatus(12);
                            }
                            if (certStatus.getCertStatus() != 12) {
                                JCPLogger.subExit();
                                return;
                            } else {
                                w511.s("Certificate status could not be determined.");
                                return;
                            }
                        } catch (Exception e4) {
                            throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e4);
                        }
                    }
                }
                z2 = z;
                if (z2) {
                }
            } catch (AnnotatedException e5) {
                h490.b(e5, "No additional CRL locations could be decoded from CRL distribution point extension.");
            }
        } catch (Exception e6) {
            h490.b(e6, "CRL distribution point extension could not be read.");
        }
    }

    public Vector getCRLDistUrls(j97 j97Var) {
        Vector vector = new Vector();
        if (j97Var != null) {
            for (g2k g2kVar : j97Var.m()) {
                h2k h2kVar = g2kVar.a;
                if (h2kVar.b == 0) {
                    for (fxs fxsVar : gxs.m(h2kVar.a).n()) {
                        if (fxsVar.b == 6) {
                            vector.add(quu0.a(((xpf) fxsVar.a).a));
                        }
                    }
                }
            }
        }
        return vector;
    }

    public Vector getOCSPUrls(pm3 pm3Var) {
        Vector vector = new Vector();
        if (pm3Var != null) {
            yf[] yfVarArr = pm3Var.a;
            int length = yfVarArr.length;
            yf[] yfVarArr2 = new yf[length];
            System.arraycopy(yfVarArr, 0, yfVarArr2, 0, yfVarArr.length);
            for (int i = 0; i < length; i++) {
                if (yfVarArr2[i].a.q(yf.c)) {
                    fxs fxsVar = yfVarArr2[i].b;
                    if (fxsVar.b == 6) {
                        vector.add(quu0.a(((xpf) fxsVar.a).a));
                    }
                }
            }
        }
        return vector;
    }

    public boolean checkCRL() {
        try {
            l490 l490Var = this.pkixParams;
            X509Certificate x509Certificate = this.checkCert;
            Date date = this.validDate;
            X509Certificate x509Certificate2 = this.issuerCert;
            checkCRLs(l490Var, x509Certificate, date, x509Certificate2, x509Certificate2.getPublicKey());
            return true;
        } catch (Exception e) {
            JCPLogger.thrown(e);
            return false;
        }
    }
}
