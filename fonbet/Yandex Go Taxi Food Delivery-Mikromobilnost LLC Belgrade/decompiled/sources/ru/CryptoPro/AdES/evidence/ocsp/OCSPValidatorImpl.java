package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.ayo;
import defpackage.bvj0;
import defpackage.bwj0;
import defpackage.g2;
import defpackage.ge5;
import defpackage.gzo;
import defpackage.he5;
import defpackage.i3;
import defpackage.ro60;
import defpackage.so60;
import defpackage.ths0;
import defpackage.u2;
import defpackage.vfc;
import defpackage.w2;
import defpackage.xie;
import defpackage.xr1;
import defpackage.yie;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl;
import ru.CryptoPro.AdES.evidence.ValidatingItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.impl.AuthorizedOCSPThumbprintPermission;
import ru.CryptoPro.AdES.tools.revocation.impl.DefaultCertificateData;
import ru.CryptoPro.AdES.tools.revocation.impl.ValidatingRevocationPermissionData;
import ru.CryptoPro.AdES.tools.revocation.permission.RevocationPermission;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class OCSPValidatorImpl extends ComplexStatusValidatorImpl<ValidatingItem<he5>> {
    private static final int TIME_DELAY = 5;
    private static final String id_kp_OCSPSigning = "1.3.6.1.5.5.7.3.9";
    private final so60 ocspReq;

    public OCSPValidatorImpl(so60 so60Var) {
        this.ocspReq = so60Var;
    }

    private void checkDateValidity(ths0 ths0Var) throws AdESException {
        JCPLogger.subEnter();
        try {
            g2 g2Var = ths0Var.w;
            g2 g2Var2 = ths0Var.c;
            Date y = g2Var == null ? null : g2Var.y();
            Date y2 = g2Var2.y();
            if (y == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(y2);
                calendar.add(12, 5);
                y = calendar.getTime();
            }
            if (y2.getTime() - y.getTime() > 0) {
                throw new AdESException("OCSP single response thisUpdate is more than nextUpdate.", IAdESException.ecRevocationWrongOcspResponsePeriod);
            }
            if (this.internalDate != null && y2.getTime() - this.internalDate.getTime() < 0) {
                throw new AdESException("OCSP single response thisUpdate " + y2 + " was got earlier than internal timestamp " + this.internalDate, IAdESException.ecRevocationWrongOcspResponsePeriod);
            }
            Date date = this.externalDate;
            if (date != null && !this.ignoreEvidenceTime && date.getTime() - y.getTime() > 0) {
                throw new AdESException("External timestamp attribute " + this.externalDate + " was got later than OCSP response nextUpdate " + y, IAdESException.ecRevocationWrongOcspResponsePeriod);
            }
            JCPLogger.subExit();
        } catch (ParseException e) {
            throw new AdESException(e, IAdESException.ecRevocationInvalidOCSP);
        }
    }

    private void checkNonce(gzo gzoVar) throws AdESException {
        w2 w2Var;
        w2 w2Var2;
        so60 so60Var = this.ocspReq;
        if (so60Var != null) {
            u2 u2Var = ro60.b;
            gzo gzoVar2 = so60Var.b;
            byte[] bArr = null;
            ayo ayoVar = gzoVar2 != null ? (ayo) gzoVar2.a.get(u2Var) : null;
            byte[] bArr2 = (ayoVar == null || (w2Var2 = ayoVar.c) == null) ? null : w2Var2.a;
            ayo ayoVar2 = (ayo) gzoVar.a.get(u2Var);
            if (ayoVar2 != null && (w2Var = ayoVar2.c) != null) {
                bArr = w2Var.a;
            }
            if (((bArr2 != null && bArr2.length > 0) || (bArr != null && bArr.length > 0)) && !Arrays.equals(bArr2, bArr)) {
                throw new AdESException("OCSP response has incorrect nonce.", IAdESException.ecRevocationInvalidOCSP);
            }
        }
    }

    private void checkServicePermissions(X509Certificate x509Certificate, ths0 ths0Var, ValidatingData validatingData) throws AdESException {
        RevocationPermission revocationPermission;
        JCPLogger.subEnter();
        if (!AdESUtility.hasExtension(x509Certificate, "1.3.6.1.5.5.7.3.9")) {
            StringBuilder sb = new StringBuilder("OCSP certificate: sn ");
            vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
            sb.append(" doesn't have id-kp-OCSPSigning extension.");
            throw new AdESException(sb.toString(), IAdESException.ecRevocationWrongCertificateConstraints);
        }
        if (x509Certificate.getExtensionValue(ro60.d.a) == null) {
            StringBuilder sb2 = new StringBuilder("OCSP certificate: sn ");
            vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
            sb2.append(" doesn't have pkix-ocsp-nocheck extension.");
            throw new AdESException(sb2.toString(), IAdESException.ecRevocationWrongCertificateConstraints);
        }
        X509Certificate find = new CertificateFinder(this.certificateValues).find(ths0Var.a);
        if (x509Certificate.getIssuerX500Principal().equals(find.getIssuerX500Principal())) {
            JCPLogger.subExit();
            return;
        }
        ValidatingRevocationPermissionData validatingRevocationPermissionData = new ValidatingRevocationPermissionData(validatingData, new DefaultCertificateData(x509Certificate, null));
        Options options = this.options;
        boolean isAuthorizedIssuer = (options == null || (revocationPermission = options.getRevocationPermission()) == null) ? false : revocationPermission.isAuthorizedIssuer(validatingRevocationPermissionData);
        if (!isAuthorizedIssuer) {
            isAuthorizedIssuer = new AuthorizedOCSPThumbprintPermission().isAuthorizedIssuer(validatingRevocationPermissionData);
        }
        if (!isAuthorizedIssuer) {
            StringBuilder sb3 = new StringBuilder("OCSP certificate: sn ");
            vfc.B(x509Certificate, 16, sb3, ", subject ", ", issuer ");
            sb3.append(" has inappropriate issuer. It must be the same as signer certificate issuer: ");
            sb3.append(find.getIssuerDN());
            throw new AdESException(sb3.toString(), IAdESException.ecRevocationWrongCertificateConstraints);
        }
        StringBuilder sb4 = new StringBuilder("OCSP certificate: sn ");
        vfc.B(x509Certificate, 16, sb4, ", subject ", ", issuer ");
        sb4.append(" has inappropriate issuer for signer  certificate issuer: ");
        sb4.append(find.getIssuerDN());
        sb4.append(" but has been accepted as authorized.");
        JCPLogger.finer(sb4.toString());
        JCPLogger.subExit();
    }

    private void checkUnknownExtensions(u2[] u2VarArr) throws AdESException {
        JCPLogger.subEnter();
        if (u2VarArr == null || u2VarArr.length == 0) {
            return;
        }
        List<u2> asList = Arrays.asList(u2VarArr);
        asList.remove(ro60.b);
        asList.remove(ro60.c);
        asList.remove(ro60.a);
        asList.remove(ro60.e);
        asList.remove(ro60.f);
        if (asList.isEmpty()) {
            JCPLogger.subExit();
        } else {
            throw new AdESException("OCSP response has some unknown critical extensions: " + printUnknownCriticalExtensions(asList), IAdESException.ecRevocationWrongCertificateConstraints);
        }
    }

    private ge5 patch(he5 he5Var) {
        String str;
        ge5 ge5Var = new ge5(he5Var);
        String str2 = he5Var.b.a.a;
        boolean z = true;
        if (str2.equals("1.2.643.2.2.9")) {
            str = "1.2.643.2.2.3";
        } else if (str2.equals("1.2.643.7.1.1.2.2")) {
            str = "1.2.643.7.1.1.3.2";
        } else if (str2.equals("1.2.643.7.1.1.2.3")) {
            str = "1.2.643.7.1.1.3.3";
        } else {
            z = false;
            str = null;
        }
        return z ? new ge5(new he5(he5Var.a, new xr1(new u2(str)), he5Var.c, he5Var.w)) : ge5Var;
    }

    private String printUnknownCriticalExtensions(List<u2> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<u2> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(Extension.SEMICOLON_SPACE);
        }
        return stringBuffer.toString();
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl, ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(ValidatingItem<he5> validatingItem) throws AdESException {
        final X509CertificateHolder x509CertificateHolder;
        JCPLogger.subEnter();
        he5 revocationData = validatingItem.getRevocationData();
        if (validatingItem.getValidatingCertificateData() != null) {
            validatingItem.getValidatingCertificateData().getIssuerCertificate();
        }
        bwj0 bwj0Var = revocationData.a;
        gzo gzoVar = bwj0Var.y;
        if (gzoVar != null) {
            checkUnknownExtensions(gzoVar.m());
            checkNonce(gzoVar);
        }
        bvj0 bvj0Var = bwj0Var.c;
        CertificateFinder certificateFinder = new CertificateFinder(this.certificateValues);
        certificateFinder.setProvider(this.provider);
        Iterator<X509Certificate> it = certificateFinder.find(bvj0Var).iterator();
        X509Certificate x509Certificate = null;
        AdESException e = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final X509Certificate next = it.next();
            CertificateChainBuilderImpl certificateChainBuilderImpl = new CertificateChainBuilderImpl();
            certificateChainBuilderImpl.setProvider(this.provider);
            certificateChainBuilderImpl.setValidationDate(this.validationDate);
            certificateChainBuilderImpl.setCertificateValues(this.certificateValues);
            try {
                certificateChainBuilderImpl.build(next);
                this.evidenceChain = certificateChainBuilderImpl.getCertificateChain();
                try {
                    x509CertificateHolder = new X509CertificateHolder(next.getEncoded());
                    try {
                    } catch (Exception e2) {
                        JCPLogger.thrown(e2);
                        e = new AdESException("OCSP response " + next.getSerialNumber().toString(16) + " has invalid signature (verified by certificate: sn " + next.getSerialNumber().toString(16) + ", subject " + next.getSubjectDN() + ", issuer " + next.getIssuerDN() + ").", IAdESException.ecSignatureInvalid);
                    }
                } catch (Exception e3) {
                    e = new AdESException(e3, IAdESException.ecInternal);
                }
            } catch (AdESException e4) {
                e = e4;
            }
            if (patch(revocationData).b(new yie() { // from class: ru.CryptoPro.AdES.evidence.ocsp.OCSPValidatorImpl.1
                @Override // defpackage.yie
                public xie get(final xr1 xr1Var) throws OperatorCreationException {
                    return new xie() { // from class: ru.CryptoPro.AdES.evidence.ocsp.OCSPValidatorImpl.1.1
                        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

                        public xr1 getAlgorithmIdentifier() {
                            return xr1Var;
                        }

                        @Override // defpackage.xie
                        public OutputStream getOutputStream() {
                            return this.outputStream;
                        }

                        @Override // defpackage.xie
                        public boolean verify(byte[] bArr) {
                            try {
                                String str = xr1Var.a.a;
                                String correctProviderBySignatureOid = AdESUtility.correctProviderBySignatureOid(((ComplexStatusValidatorImpl) OCSPValidatorImpl.this).provider, str);
                                Signature signature = correctProviderBySignatureOid == null ? Signature.getInstance(str) : Signature.getInstance(str, correctProviderBySignatureOid);
                                signature.initVerify(next);
                                signature.update(this.outputStream.toByteArray());
                                return signature.verify(bArr);
                            } catch (Exception e5) {
                                JCPLogger.thrown(e5);
                                return false;
                            }
                        }
                    };
                }

                @Override // defpackage.yie
                public X509CertificateHolder getAssociatedCertificate() {
                    return x509CertificateHolder;
                }

                @Override // defpackage.yie
                public boolean hasAssociatedCertificate() {
                    return true;
                }
            })) {
                x509Certificate = next;
                break;
            }
            e = new AdESException("OCSP response " + next.getSerialNumber().toString(16) + " has invalid signature (verified by certificate: sn " + next.getSerialNumber().toString(16) + ", subject " + next.getSubjectDN() + ", issuer " + next.getIssuerDN() + ").", IAdESException.ecSignatureInvalid);
        }
        if (x509Certificate == null) {
            if (e != null) {
                throw e;
            }
            throw new AdESException("Certificate: responder id " + bvj0Var.getName() + " not found.", IAdESException.ecFinderCertificateIsNull);
        }
        JCPLogger.fine("Validation of OCSP evidence certificate chain...");
        validate(this.evidenceChain);
        i3 i3Var = bwj0Var.x;
        for (int i = 0; i < i3Var.size(); i++) {
            ths0 m = ths0.m(i3Var.A(i));
            gzo gzoVar2 = m.x;
            if (gzoVar2 != null) {
                checkUnknownExtensions(gzoVar2.m());
            }
            checkDateValidity(m);
            checkServicePermissions(x509Certificate, m, validatingItem.getValidatingCertificateData());
        }
        JCPLogger.subExit();
    }

    public OCSPValidatorImpl() {
        this(null);
    }
}
