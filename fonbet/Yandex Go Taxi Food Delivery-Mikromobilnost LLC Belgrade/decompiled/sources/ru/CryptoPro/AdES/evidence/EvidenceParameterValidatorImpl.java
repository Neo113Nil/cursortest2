package ru.CryptoPro.AdES.evidence;

import defpackage.k490;
import defpackage.l490;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.evidence.Evidence;
import ru.CryptoPro.AdES.evidence.crl.CRLEvidenceImpl;
import ru.CryptoPro.AdES.evidence.crl.rfc3280.CRLVerifierEx;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class EvidenceParameterValidatorImpl implements BaseParameterValidator<Evidence<?>> {
    private final X509Certificate rootCert;
    private final Date validationDate;

    /* renamed from: ru.CryptoPro.AdES.evidence.EvidenceParameterValidatorImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType;

        static {
            int[] iArr = new int[Evidence.EvidenceType.values().length];
            $SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType = iArr;
            try {
                iArr[Evidence.EvidenceType.etCRL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public EvidenceParameterValidatorImpl(X509Certificate x509Certificate, Date date) {
        this.rootCert = x509Certificate;
        this.validationDate = date;
    }

    private void checkIfCRLAcceptedForCertificate(X509CRL x509crl, X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fineFormat("Check if CRL is suitable for certificate\n\tsn: {0}\n\tsubject: {1}\n\tissuer: {2}", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
        try {
            PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) Collections.singleton(new TrustAnchor(this.rootCert, null)));
            pKIXParameters.setDate(this.validationDate);
            LinkedList linkedList = new LinkedList();
            linkedList.add(x509Certificate);
            linkedList.add(x509Certificate2);
            linkedList.remove(this.rootCert);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(Collections.singletonList(x509crl));
            pKIXParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
            l490 l490Var = new l490(new k490(pKIXParameters));
            Collections.unmodifiableSet(new HashSet());
            boolean checkCRL = new CRLVerifierEx(x509Certificate, x509Certificate2, l490Var).checkCRL();
            JCPLogger.fine("CRL accepted: " + checkCRL);
            if (checkCRL) {
                JCPLogger.subExit();
                return;
            }
            throw new AdESException("CRL is not appropriate for certificate: sn" + x509Certificate.getSerialNumber().toString(16) + ", subject " + x509Certificate.getSubjectDN() + ", issuer  " + x509Certificate.getIssuerDN(), IAdESException.ecRevocationCRLNotSuitable);
        } catch (Exception e) {
            throw new AdESException(e, IAdESException.ecRevocationCRLNotSuitable);
        }
    }

    @Override // ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(Evidence<?> evidence) throws AdESException {
        JCPLogger.subEnter();
        if (AnonymousClass1.$SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType[evidence.getType().ordinal()] == 1) {
            CRLEvidenceImpl cRLEvidenceImpl = (CRLEvidenceImpl) evidence;
            checkIfCRLAcceptedForCertificate(cRLEvidenceImpl.getEvidence(), cRLEvidenceImpl.getCheckableCertificate(), cRLEvidenceImpl.getIssuerCertificate());
        }
        JCPLogger.subExit();
    }
}
