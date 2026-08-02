package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.bcs0;
import defpackage.m8z0;
import defpackage.ncc;
import defpackage.u87;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.CustomOptions;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess;
import ru.CryptoPro.CAdES.BufferedCAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class InternalTimeStampEnhancementProcessImpl implements TSPTimeStampEnhancementProcess {
    public final m8z0 a;
    public String b;
    public final HashSet c = new HashSet();
    public final HashSet w = new HashSet();
    public Options x = null;

    public InternalTimeStampEnhancementProcessImpl(m8z0 m8z0Var) {
        this.a = m8z0Var;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess
    public m8z0 enhance() throws AdESException {
        JCPLogger.fine("Enhancing internal timestamp...");
        try {
            u87 u87Var = this.a.a;
            BufferedCAdESSignature bufferedCAdESSignature = new BufferedCAdESSignature(u87Var.b.getEncoded(), null, getTimeStampType());
            CAdESSigner[] cAdESSignerInfos = bufferedCAdESSignature.getCAdESSignerInfos();
            ArrayList arrayList = new ArrayList();
            for (CAdESSigner cAdESSigner : cAdESSignerInfos) {
                arrayList.add(cAdESSigner.getSignerInfo());
            }
            if (arrayList.size() > 1) {
                throw new AdESException("Invalid signer count: " + arrayList.size(), IAdESException.ecTimestampInvalid);
            }
            CAdESSigner cAdESSignerInfo = bufferedCAdESSignature.getCAdESSignerInfo(0);
            cAdESSignerInfo.setProvider(this.b);
            Options copyWithEnabledCertificateValidation = CustomOptions.copyWithEnabledCertificateValidation(this.x);
            this.x = copyWithEnabledCertificateValidation;
            cAdESSignerInfo.setOptions(copyWithEnabledCertificateValidation);
            arrayList.remove(cAdESSignerInfo.getSignerInfo());
            arrayList.add(cAdESSignerInfo.enhance(this.b, null, new LinkedList(this.c), new HashSet(this.w), null, getTimeStampEnhanceType(), null).getSignerInfo());
            bcs0 bcs0Var = new bcs0(arrayList);
            ncc nccVar = new ncc(Collections.EMPTY_LIST);
            return new m8z0(BufferedCAdESSignature.replaceSigners(u87.c(u87Var, nccVar, nccVar, nccVar), bcs0Var));
        } catch (AdESException e) {
            throw e;
        } catch (Exception e2) {
            if (e2 instanceof CAdESCMSAttributeTableGenerationException) {
                throw new AdESException(e2, ((CAdESCMSAttributeTableGenerationException) e2).getErrorCode());
            }
            throw new AdESException(e2, IAdESException.ecTimestampInvalid);
        }
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess
    public Integer getTimeStampEnhanceType() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess
    public Integer getTimeStampType() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.w.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.c.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.x = options;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.b = str;
    }
}
