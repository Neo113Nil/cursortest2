package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.a221;
import defpackage.bwj0;
import defpackage.e79;
import defpackage.ge5;
import defpackage.he5;
import defpackage.i3;
import defpackage.jzz;
import defpackage.qgn0;
import defpackage.so60;
import defpackage.ths0;
import defpackage.vfc;
import defpackage.w2k0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.Evidence;
import ru.CryptoPro.AdES.evidence.ValidatingItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.service.OCSPServiceConnectorImpl;
import ru.CryptoPro.AdES.service.OCSPServiceResponse;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLActionOnError;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection;
import ru.CryptoPro.AdES.tools.revocation.data.RevocationMethod;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.impl.CollectionRevocationURLStrategy;
import ru.CryptoPro.AdES.tools.revocation.impl.DefaultRevocationURLStrategy;
import ru.CryptoPro.AdES.tools.revocation.impl.DefaultValidatingData;
import ru.CryptoPro.AdES.tools.revocation.impl.ResponderRevocationURLStrategy;
import ru.CryptoPro.AdES.tools.revocation.impl.SingleRevocationURLStrategy;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class OCSPEvidenceCollectorImpl extends OCSPEvidenceCollector {
    private static final String OUT_OF_SYNC_FORMAT = "TSP and OCSP services' time is out of sync (max delay: %d ms); TSP time: %s, OCSP time (produced): %s";

    private void checkIfRevoked(ge5 ge5Var, X509Certificate x509Certificate) throws AdESException {
        Object a221Var;
        e79 e79Var = ((ths0) ge5Var.a()[0].b).b;
        int i = e79Var.a;
        if (i == 0) {
            a221Var = null;
        } else if (i == 1) {
            w2k0.m(e79Var.b);
            a221Var = new jzz();
        } else {
            a221Var = new a221();
        }
        if (a221Var != null) {
            if (a221Var instanceof w2k0) {
                StringBuilder sb = new StringBuilder("OCSP status of certificate: sn ");
                vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
                sb.append(" is REVOKED!");
                throw new AdESException(sb.toString(), IAdESException.ecRevocationCertificateStatusIsRevoked);
            }
            StringBuilder sb2 = new StringBuilder("OCSP status of certificate: sn ");
            vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
            sb2.append(" is UNKNOWN.");
            throw new AdESException(sb2.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
        }
    }

    private Evidence<he5> getEvidence(Collection<RevocationURL> collection, ValidatingData validatingData, X509Certificate x509Certificate, Date date) throws AdESException {
        X509Certificate x509Certificate2;
        X509Certificate x509Certificate3 = x509Certificate;
        X509Certificate certificate = validatingData.getCertificate();
        if (this.internalDate == null) {
            throw new AdESException("Timestamp is undefined for validating of OCSP response.", IAdESException.ecTimestampNotFound);
        }
        Date date2 = date;
        for (RevocationURL revocationURL : collection) {
            try {
                try {
                    String str = (String) revocationURL.get();
                    JCPLogger.fine("Try to use following url: " + str);
                    OCSPServiceConnectorImpl oCSPServiceConnectorImpl = new OCSPServiceConnectorImpl(str, revocationURL.getConnectionParameters());
                    oCSPServiceConnectorImpl.setProvider(this.provider);
                    oCSPServiceConnectorImpl.setCheckableCertificate(certificate);
                    oCSPServiceConnectorImpl.setIssuerCertificate(x509Certificate3);
                    OCSPServiceResponse oCSPServiceResponse = (OCSPServiceResponse) oCSPServiceConnectorImpl.getEncoded();
                    byte[] encoded = oCSPServiceResponse.getResponse().a.getEncoded();
                    so60 request = oCSPServiceResponse.getRequest();
                    he5 m = he5.m(encoded);
                    ge5 ge5Var = new ge5(m);
                    qgn0[] a = ge5Var.a();
                    if (a.length == 1) {
                        bwj0 bwj0Var = m.a;
                        i3 i3Var = bwj0Var.x;
                        Date y = bwj0Var.w.y();
                        for (int i = 0; i < i3Var.size(); i++) {
                            if (needRecall(y, ths0.m(i3Var.A(i)), date2)) {
                                if (date2 == null) {
                                    date2 = Calendar.getInstance().getTime();
                                }
                                return getEvidence(Collections.singletonList(revocationURL), validatingData, x509Certificate3, date2);
                            }
                        }
                        i3 i3Var2 = m.w;
                        for (int i2 = 0; i2 < i3Var2.size(); i2++) {
                            try {
                                this.additionalCertificateValues.add((X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(i3Var2.A(i2).toASN1Primitive().getEncoded("DER"))));
                            } catch (Exception e) {
                                JCPLogger.ignoredException(e);
                            }
                        }
                        JCPLogger.fine("Removing certificates from OCSP response...");
                        he5 he5Var = new he5(m.a, m.b, m.c, null);
                        JCPLogger.fine("Validating of OCSP (online)...");
                        OCSPValidatorImpl oCSPValidatorImpl = new OCSPValidatorImpl(request);
                        oCSPValidatorImpl.setValidationDate(Calendar.getInstance().getTime());
                        oCSPValidatorImpl.setInternalDate(this.internalDate);
                        oCSPValidatorImpl.setExternalDate(this.externalDate);
                        oCSPValidatorImpl.setProvider(this.provider);
                        oCSPValidatorImpl.setCertificateValues(this.additionalCertificateValues);
                        oCSPValidatorImpl.setOptions(this.options);
                        try {
                            oCSPValidatorImpl.validate(new ValidatingItem<>(validatingData, he5Var));
                            checkIfRevoked(ge5Var, certificate);
                            JCPLogger.fine("Creating OCSP evidence block...");
                            return new OCSPEvidenceImpl(he5Var, certificate, x509Certificate3, this.certificateChain, oCSPValidatorImpl.getEvidenceChain());
                        } catch (AdESException e2) {
                            x509Certificate2 = certificate;
                            this.thrownException = e2;
                            JCPLogger.thrown(e2);
                            if (revocationURL.onError(e2) == RevocationURLActionOnError.FAIL) {
                                throw this.thrownException;
                            }
                            certificate = x509Certificate2;
                            x509Certificate3 = x509Certificate;
                        }
                    } else {
                        x509Certificate2 = certificate;
                        try {
                            throw new ParseException("OCSP response contains invalid single response count: " + a.length, 0);
                        } catch (IOException | IllegalArgumentException | ParseException e3) {
                            e = e3;
                            this.thrownException = new AdESException("Invalid OCSP response structure.", e, IAdESException.ecRevocationInvalidOCSP);
                            JCPLogger.thrown(e);
                            if (revocationURL.onError(e) == RevocationURLActionOnError.FAIL) {
                                throw this.thrownException;
                            }
                            certificate = x509Certificate2;
                            x509Certificate3 = x509Certificate;
                        } catch (AdESException e4) {
                            e = e4;
                            this.thrownException = e;
                            if (revocationURL.onError(e) == RevocationURLActionOnError.FAIL) {
                                throw this.thrownException;
                            }
                            if (!e.getErrorCode().equals(IAdESException.ecOnlineCallFailed)) {
                                throw this.thrownException;
                            }
                            JCPLogger.thrown(e);
                            certificate = x509Certificate2;
                            x509Certificate3 = x509Certificate;
                        }
                    }
                } catch (IOException | IllegalArgumentException | ParseException e5) {
                    e = e5;
                    x509Certificate2 = certificate;
                }
            } catch (AdESException e6) {
                e = e6;
                x509Certificate2 = certificate;
            }
        }
        X509Certificate x509Certificate4 = certificate;
        if (!this.signerMustHaveOcspEvidence || !collection.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("The signer certificate: sn ");
        vfc.B(x509Certificate4, 16, sb, ", subject ", ", issuer ");
        sb.append(" must have OCSP evidence but it doesn't contain any OCSP reference. OCSP evidence is not created.");
        throw new AdESException(sb.toString(), IAdESException.ecOnlineCallFailed);
    }

    private boolean needRecall(Date date, ths0 ths0Var, Date date2) throws AdESException {
        try {
            JCPLogger.fine("Recalling OCSP service...");
            Date y = ths0Var.c.y();
            if (!y.before(this.internalDate)) {
                return false;
            }
            JCPLogger.fineFormat("OCSP.thisUpdate {0} is before the TSP time {1}. Need to retry.", y, this.internalDate);
            if ((date2 == null ? 0L : Calendar.getInstance().getTime().getTime() - date2.getTime()) > 120000) {
                throw new AdESException("Time of call has been exhausted. You should try to sign or enhance again later.", IAdESException.ecOnlineCallFailed);
            }
            long time = this.internalDate.getTime() - date.getTime();
            if (time < 200) {
                time = 200;
            }
            long serviceDesyncTimeout = AdESConfig.getServiceDesyncTimeout();
            if (time > serviceDesyncTimeout) {
                throw new AdESException(String.format(OUT_OF_SYNC_FORMAT, Long.valueOf(serviceDesyncTimeout), this.internalDate, date), IAdESException.ecOnlineCallFailed);
            }
            JCPLogger.fineFormat("Will try to retrieve an OCSP response again after {0}  ms.", Long.valueOf(time));
            try {
                Thread.sleep(time);
            } catch (InterruptedException unused) {
            }
            return true;
        } catch (ParseException e) {
            JCPLogger.thrown(e);
            return true;
        }
    }

    @Override // ru.CryptoPro.AdES.evidence.ocsp.OCSPEvidenceCollector, ru.CryptoPro.AdES.evidence.AbstractEvidenceSingleCollector, ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public Evidence<he5> make(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException {
        return getEvidence(certificateItem, x509Certificate);
    }

    private Evidence<he5> getEvidence(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException {
        ValidatingData defaultValidatingData = new DefaultValidatingData(certificateItem.getCertificate(), x509Certificate, certificateItem.getCertificateRole(), RevocationMethod.OCSP);
        ArrayList arrayList = new ArrayList();
        if (this.options != null) {
            JCPLogger.fine("Loading optional OCSP url(s)...");
            RevocationURLStrategy<?> revocationURLStrategy = this.options.getRevocationURLStrategy();
            if (revocationURLStrategy != null) {
                if (revocationURLStrategy instanceof CollectionRevocationURLStrategy) {
                    RevocationURLCollection revocationURLCollection = (RevocationURLCollection) ((CollectionRevocationURLStrategy) revocationURLStrategy).get(defaultValidatingData);
                    if (revocationURLCollection != null) {
                        arrayList.addAll(revocationURLCollection.get());
                    }
                } else {
                    if (!(revocationURLStrategy instanceof SingleRevocationURLStrategy)) {
                        throw new AdESException("Unknown strategy: ".concat(revocationURLStrategy.getClass().getName()), IAdESException.ecInternal);
                    }
                    RevocationURL revocationURL = (RevocationURL) ((SingleRevocationURLStrategy) revocationURLStrategy).get(defaultValidatingData);
                    if (revocationURL != null) {
                        arrayList.add(revocationURL);
                    }
                }
            }
        }
        JCPLogger.fine("Resolving default (AIA) OCSP url(s)...");
        arrayList.addAll(new DefaultRevocationURLStrategy().get(defaultValidatingData).get());
        JCPLogger.fine("Resolving static responder OCSP url...");
        RevocationURL revocationURL2 = new ResponderRevocationURLStrategy().get(defaultValidatingData);
        if (revocationURL2 != null) {
            arrayList.add(revocationURL2);
        }
        JCPLogger.fine("Collecting OCSP evidences...");
        return getEvidence(arrayList, defaultValidatingData, x509Certificate, null);
    }
}
