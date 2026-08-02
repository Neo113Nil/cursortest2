package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class sw61 implements i87, SignatureOptions, CRLUtility, CertificateUtility, DigestUtility, ProviderUtility {
    public final LinkedList A;
    public m8z0 B;
    public final ArrayList C;
    public Options D;
    public final String a;
    public String b = null;
    public String c = null;
    public xc3 w = null;
    public final LinkedList x;
    public final HashSet y;
    public final HashSet z;

    public sw61(List list, String str) {
        this.a = "http://www.cryptopro.ru:80/tsp/";
        LinkedList linkedList = new LinkedList();
        this.x = linkedList;
        HashSet hashSet = new HashSet();
        this.y = hashSet;
        this.z = new HashSet();
        this.A = new LinkedList();
        this.C = new ArrayList();
        this.D = null;
        JCPLogger.subEnter();
        JCPLogger.finer("Initializing CAdES-T attribute table generator.");
        linkedList.addAll(list);
        hashSet.addAll(list);
        this.a = str;
        JCPLogger.subExit();
    }

    public final vc3 a(byte[] bArr) {
        JCPLogger.fine("Retrieving signature-timestamp (internal)...");
        TSPSignatureDataImpl tSPSignatureDataImpl = new TSPSignatureDataImpl(bArr);
        TSPTimeStampImpl tSPTimeStampImpl = new TSPTimeStampImpl();
        tSPTimeStampImpl.setDigestAlgorithm(this.c);
        tSPTimeStampImpl.setProvider(this.b);
        tSPTimeStampImpl.retrieve(this.a, tSPSignatureDataImpl);
        this.B = tSPTimeStampImpl.get();
        JCPLogger.fine("Validating signature-timestamp (internal)...");
        TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
        InternalTimeStampValidationProcessImpl internalTimeStampValidationProcessImpl = new InternalTimeStampValidationProcessImpl(tSPSignatureDataImpl, this.B, true);
        internalTimeStampValidationProcessImpl.setCertificateValues(this.y);
        internalTimeStampValidationProcessImpl.setCRLs(this.z);
        internalTimeStampValidationProcessImpl.setOptions(this.D);
        tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) internalTimeStampValidationProcessImpl);
        JCPLogger.fine("Creating signature-timestamp (internal)...");
        vc3 createTimeStampAttribute = CAdESUtility.createTimeStampAttribute(b490.J3, this.B);
        JCPLogger.fine("Created unsigned attribute signature-timestamp (internal): " + createTimeStampAttribute.a.a);
        return createTimeStampAttribute;
    }

    @Override // defpackage.i87
    public xc3 b(Map map) {
        vc3 a;
        Integer c = c();
        Integer num = CAdESParameters.CAdES_T;
        if (!c.equals(num) && !c().equals(CAdESParameters.CAdES_X_Long_Type_1) && !c().equals(CAdESParameters.CAdES_A)) {
            JCPLogger.fine("Empty table.");
            return new xc3(new Hashtable());
        }
        JCPLogger.fine("Creating CAdES-T attribute table...");
        try {
            u2 u2Var = b490.J3;
            if (map.containsKey(u2Var)) {
                JCPLogger.fine("Signer already contains valid internal signature-timestamp.");
                a = (vc3) map.get(u2Var);
                this.B = (m8z0) map.get("FreshestValidInternalTimeStamp");
            } else {
                JCPLogger.fine("Processing of signature-timestamp (internal)...");
                a = a((byte[]) map.get("encryptedDigest"));
            }
            if (!this.C.contains(num)) {
                Options options = this.D;
                boolean z = options == null || options.isEnableCertificateValidation() || !c().equals(num);
                JCPLogger.fine("Validating of the signer certificate chain by now...");
                BaseCertificateChainValidatorImpl baseCertificateChainValidatorImpl = new BaseCertificateChainValidatorImpl();
                baseCertificateChainValidatorImpl.setProvider(this.b);
                baseCertificateChainValidatorImpl.setCRLs(this.z);
                JCPLogger.fine("validateCertificateChain = " + z);
                baseCertificateChainValidatorImpl.setEnableCertificateValidation(z);
                baseCertificateChainValidatorImpl.validate(this.x, (List) null);
                JCPLogger.fine("Validating of the signer certificate chain by now completed.");
            }
            Hashtable hashtable = new Hashtable();
            new Hashtable();
            Hashtable b = xc3.b(hashtable);
            c2 c2Var = new c2();
            Enumeration elements = b.elements();
            while (elements.hasMoreElements()) {
                Object nextElement = elements.nextElement();
                if (nextElement instanceof Vector) {
                    Enumeration elements2 = ((Vector) nextElement).elements();
                    while (elements2.hasMoreElements()) {
                        c2Var.a(vc3.m(elements2.nextElement()));
                    }
                } else {
                    c2Var.a(vc3.m(nextElement));
                }
            }
            JCPLogger.fine("Add unsigned attribute signature-timestamp: " + a.a.a);
            c2Var.a(a);
            xc3 xc3Var = this.w;
            if (xc3Var != null && xc3Var.f() > 0) {
                JCPLogger.fineFormat("Add {0} unsigned attributes(s).", Integer.valueOf(this.w.f()));
                c2 g = this.w.g();
                ld3 ld3Var = new ld3(0);
                zvf zvfVar = new zvf(g);
                a2[] a2VarArr = zvfVar.a;
                ld3Var.b = zvfVar;
                int length = a2VarArr.length;
                vc3[] vc3VarArr = new vc3[length];
                for (int i = 0; i != length; i++) {
                    vc3VarArr[i] = vc3.m(a2VarArr[i]);
                }
                for (int i2 = 0; i2 < length; i2++) {
                    c2Var.a(vc3VarArr[i2]);
                }
            }
            return new xc3(c2Var);
        } catch (AdESException e) {
            throw new CAdESCMSAttributeTableGenerationException(e.getMessage(), e, e.getErrorCode());
        }
    }

    public Integer c() {
        return CAdESParameters.CAdES_T;
    }

    public m8z0 d() {
        return this.B;
    }

    @Override // ru.CryptoPro.AdES.tools.CRLUtility
    public final void setCRLs(Collection collection) {
        this.z.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    public final void setCertificateValues(Set set) {
        this.y.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    public final void setDigestAlgorithm(String str) {
        this.c = str;
    }

    @Override // ru.CryptoPro.AdES.SignatureOptions
    public final void setOptions(Options options) {
        this.D = options;
    }

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    public final void setProvider(String str) {
        this.b = str;
    }
}
