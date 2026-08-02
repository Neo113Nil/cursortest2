package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.fr61;
import defpackage.jx61;
import defpackage.m8z0;
import defpackage.mr61;
import defpackage.rx61;
import defpackage.vfc;
import defpackage.ws61;
import defpackage.xx61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.CustomOptions;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.decode.EnhancedArchiveTimeStampCAdESSignerParameters;
import ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters;
import ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.BufferedCAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class InternalTimeStampValidationProcessImpl implements TSPTimeStampValidationProcess {
    public AdESXLongType1AttributeDecoder A;
    public Options B;
    public final boolean C;
    public Date a;
    public final m8z0 b;
    public boolean c;
    public Date w;
    public final TSPData x;
    public final HashSet y;
    public final HashSet z;

    public InternalTimeStampValidationProcessImpl(TSPData tSPData, m8z0 m8z0Var, boolean z) {
        this.a = null;
        this.c = false;
        this.y = new HashSet();
        this.z = new HashSet();
        this.A = null;
        this.B = null;
        this.x = tSPData;
        this.b = m8z0Var;
        this.C = z;
    }

    public static void b(X509Certificate x509Certificate) {
        JCPLogger.subEnter();
        if (x509Certificate == null) {
            throw new AdESException("TSP certificate not found.", IAdESException.ecSignerCertificateIsNull);
        }
        if (AdESUtility.hasExtension(x509Certificate, "1.3.6.1.5.5.7.3.8")) {
            JCPLogger.subExit();
            return;
        }
        StringBuilder sb = new StringBuilder("TSP certificate: sn ");
        vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
        sb.append(" doesn't have id-kp-timeStamping extension");
        throw new AdESException(sb.toString(), IAdESException.ecRevocationWrongCertificateConstraints);
    }

    public Integer a() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    public TSPData getData() {
        return this.x;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    public m8z0 getTimeStampToken() {
        return this.b;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.z.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.y.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    public void setExternalDate(Date date) {
        this.a = date;
    }

    public void setNeedValidateTailChain(boolean z) {
        this.c = z;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.B = options;
    }

    public void setTailBuildingDate(Date date) {
        this.w = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess
    public void validate() throws AdESException {
        Options copyWithEnabledCertificateValidation;
        HashSet hashSet = this.y;
        JCPLogger.subEnter();
        JCPLogger.fine("Validating timestamp...");
        try {
            byte[] encoded = this.b.a.b.getEncoded();
            JCPLogger.fine("Decoding timestamp signature...");
            BufferedCAdESSignature bufferedCAdESSignature = new BufferedCAdESSignature(encoded, null, a());
            if (bufferedCAdESSignature.getCAdESSignerInfos().length > 1) {
                throw new CAdESException("Invalid singer count.", IAdESException.ecTimestampInvalid);
            }
            CAdESSigner cAdESSignerInfo = bufferedCAdESSignature.getCAdESSignerInfo(0);
            cAdESSignerInfo.setProvider(this.x.getProvider());
            if (this.C && a().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE) && (cAdESSignerInfo instanceof mr61)) {
                JCPLogger.fine("Setting special signature options to internal simple timestamp...");
                copyWithEnabledCertificateValidation = this.B;
            } else {
                JCPLogger.fine("Setting special signature options with default validation to timestamp...");
                copyWithEnabledCertificateValidation = CustomOptions.copyWithEnabledCertificateValidation(this.B);
            }
            cAdESSignerInfo.setOptions(copyWithEnabledCertificateValidation);
            if (a().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE) && !(cAdESSignerInfo instanceof mr61)) {
                throw new AdESException("Signer must be simple internal timestamp.", IAdESException.ecTimestampInvalid);
            }
            if (a().equals(AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE) && !(cAdESSignerInfo instanceof fr61)) {
                throw new AdESException("Signer must be external timestamp.", IAdESException.ecTimestampInvalid);
            }
            if (a().equals(AdESParameters.TSA_CAdESC_TIME_STAMP) && !(cAdESSignerInfo instanceof rx61)) {
                throw new AdESException("Signer must be enhanced external timestamp.", IAdESException.ecTimestampInvalid);
            }
            if (a().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP) && !(cAdESSignerInfo instanceof xx61)) {
                throw new AdESException("Signer must be enhanced internal timestamp.", IAdESException.ecTimestampInvalid);
            }
            if (a().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE) && !(cAdESSignerInfo instanceof ws61)) {
                throw new AdESException("Signer must be archive timestamp.", IAdESException.ecTimestampInvalid);
            }
            if (a().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP) && !(cAdESSignerInfo instanceof jx61)) {
                throw new AdESException("Signer must be enhanced archive timestamp.", IAdESException.ecTimestampInvalid);
            }
            ((InternalTimeStampCAdESSignerParameters) cAdESSignerInfo).setExternalDate(this.a);
            if (cAdESSignerInfo instanceof EnhancedInternalTimeStampAdESSignerParameters) {
                JCPLogger.fine("Setting special parameters to enhanced internal timestamp...");
                ((EnhancedInternalTimeStampAdESSignerParameters) cAdESSignerInfo).setParentalDecoder(this.A);
                ((EnhancedInternalTimeStampAdESSignerParameters) cAdESSignerInfo).updateIfNeed();
            }
            if (cAdESSignerInfo instanceof EnhancedArchiveTimeStampCAdESSignerParameters) {
                JCPLogger.fine("Setting special parameters to enhanced archive timestamp...");
                ((EnhancedArchiveTimeStampCAdESSignerParameters) cAdESSignerInfo).setNeedValidateChain(this.c);
                ((EnhancedArchiveTimeStampCAdESSignerParameters) cAdESSignerInfo).setTailBuildingDate(this.w);
            }
            cAdESSignerInfo.verify(hashSet, this.z);
            if (cAdESSignerInfo instanceof xx61) {
                JCPLogger.fine("Reading certificate values from enhanced internal timestamp...");
                hashSet.addAll(((xx61) cAdESSignerInfo).getCertificateValues());
            }
            b(cAdESSignerInfo.getSignerCertificate());
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw e;
        } catch (Exception e2) {
            if (!(e2 instanceof CAdESCMSAttributeTableGenerationException)) {
                throw new AdESException(e2, IAdESException.ecTimestampInvalid);
            }
            throw new AdESException(e2, ((CAdESCMSAttributeTableGenerationException) e2).getErrorCode());
        }
    }

    public InternalTimeStampValidationProcessImpl(TSPData tSPData, m8z0 m8z0Var) {
        this(tSPData, m8z0Var, false);
    }
}
