package ru.CryptoPro.CAdES;

import defpackage.a2;
import defpackage.a8x;
import defpackage.acs0;
import defpackage.b3;
import defpackage.bg1;
import defpackage.c2;
import defpackage.ccs0;
import defpackage.h2t;
import defpackage.ikh;
import defpackage.j87;
import defpackage.k7h;
import defpackage.r1s;
import defpackage.u2;
import defpackage.vc3;
import defpackage.xc3;
import defpackage.y7x;
import defpackage.yc70;
import defpackage.yci0;
import defpackage.yr61;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.verifier.GostCMSSignatureAlgorithmNameGenerator;
import ru.CryptoPro.CAdES.tools.verifier.GostContentVerifierProvider;
import ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider;
import ru.CryptoPro.CAdES.tools.verifier.GostSignatureAlgorithmIdentifierFinder;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class CAdESSignerRawImpl extends CAdESSigner {

    /* renamed from: ru.CryptoPro.CAdES.CAdESSignerRawImpl$1OverloadSignerInformation, reason: invalid class name */
    class C1OverloadSignerInformation extends acs0 {
        public boolean n;

        public final b3 b(u2 u2Var) {
            c2 d;
            int i;
            xc3 signedAttributes = super.getSignedAttributes();
            if (signedAttributes == null || (i = (d = signedAttributes.d(u2Var)).b) == 0) {
                return null;
            }
            if (i != 1) {
                throw new CMSException("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the signing-time attribute");
            }
            a2[] a2VarArr = ((vc3) d.c(0)).b.a;
            if (a2VarArr.length == 1) {
                return a2VarArr[0].toASN1Primitive();
            }
            throw new CMSException("A signing-time attribute MUST have a single attribute value");
        }

        @Override // defpackage.acs0
        public xc3 getSignedAttributes() {
            xc3 signedAttributes = super.getSignedAttributes();
            if (this.n) {
                try {
                    u2 u2Var = j87.c;
                    if (b(u2Var) != null && signedAttributes != null) {
                        return signedAttributes.e(u2Var);
                    }
                } catch (CMSException e) {
                    yci0.r(e);
                    return null;
                }
            }
            return signedAttributes;
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public abstract /* synthetic */ void addCountersigner(acs0 acs0Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public abstract /* synthetic */ void verify(Set set, Set set2) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public abstract /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws CAdESException;

    public void verifyCryptographicSignature(X509Certificate x509Certificate, String str) throws CAdESException {
        h2t h2tVar;
        X509Certificate x509Certificate2;
        ccs0 ccs0Var;
        JCPLogger.subEnter();
        if (!AdESUtility.ifKeyUsageIsSignatureInCertificate(x509Certificate)) {
            throw new CAdESException(IAdESException.ecWrongKeyUsage);
        }
        String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(str, this.a.getDigestAlgOID());
        try {
            if (AdESUtility.isInternalImplemented(correctProviderByHashAlgorithm)) {
                GostDigestCalculatorProvider gostDigestCalculatorProvider = this.y;
                if (gostDigestCalculatorProvider == null) {
                    gostDigestCalculatorProvider = new GostDigestCalculatorProvider(x509Certificate.getPublicKey(), correctProviderByHashAlgorithm, this.w, false);
                }
                ccs0Var = new ccs0(new GostCMSSignatureAlgorithmNameGenerator(), new GostSignatureAlgorithmIdentifierFinder(), new GostContentVerifierProvider(x509Certificate, correctProviderByHashAlgorithm), gostDigestCalculatorProvider);
                x509Certificate2 = x509Certificate;
            } else {
                if (correctProviderByHashAlgorithm == null) {
                    h2tVar = new h2t(new a8x());
                } else {
                    a8x a8xVar = new a8x();
                    a8xVar.a = new yc70(new bg1(correctProviderByHashAlgorithm, 12));
                    h2tVar = new h2t(a8xVar);
                }
                try {
                    x509Certificate2 = x509Certificate;
                    ccs0Var = new ccs0(new k7h(), new ikh(), new r1s(new y7x(), new JcaX509CertificateHolder(x509Certificate), x509Certificate2, false, 21), h2tVar);
                } catch (CertificateEncodingException e) {
                    throw new OperatorCreationException("cannot process certificate: " + e.getMessage(), e);
                }
            }
            if (AdESUtility.isInternalImplemented(correctProviderByHashAlgorithm)) {
                C1OverloadSignerInformation c1OverloadSignerInformation = new C1OverloadSignerInformation(this.a);
                this.a = c1OverloadSignerInformation;
                c1OverloadSignerInformation.n = true;
            }
            try {
                if (this.a.verify(ccs0Var)) {
                    JCPLogger.fineFormat("Raw signature has been verified by the certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tsignature provider: {3}", x509Certificate2.getSerialNumber().toString(16), x509Certificate2.getSubjectDN(), x509Certificate2.getIssuerDN(), str);
                } else {
                    if (!new yr61(this.a).verify(ccs0Var)) {
                        throw new CAdESException(IAdESException.ecSignatureInvalid);
                    }
                    JCPLogger.fineFormat("Raw signature has been verified (unsorted) by the certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tsignature provider: {3}", x509Certificate2.getSerialNumber().toString(16), x509Certificate2.getSubjectDN(), x509Certificate2.getIssuerDN(), str);
                }
                acs0 acs0Var = this.a;
                if (acs0Var instanceof C1OverloadSignerInformation) {
                    ((C1OverloadSignerInformation) acs0Var).n = false;
                }
                JCPLogger.subExit();
            } finally {
            }
        } catch (CAdESException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CAdESException(e3, IAdESException.ecSignatureInvalid);
        }
    }
}
