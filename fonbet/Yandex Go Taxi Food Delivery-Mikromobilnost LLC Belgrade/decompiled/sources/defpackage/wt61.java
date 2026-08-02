package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.EnhancedTSPTimeStampImpl;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.CAdESType;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.timestamp.external.ArchiveTimeStampEnhancementProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.ArchiveTimeStampImpl;
import ru.CryptoPro.CAdES.timestamp.external.ArchiveTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedArchiveTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.ExternalTimeStampEnhancementProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPArchiveDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TimeStampData;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class wt61 extends nx61 {
    public xbs0 H;
    public int I;
    public xr1 J;
    public ru61 K;
    public xc3 L;
    public byte[] M;
    public TimeStampData N;
    public TimeStampData O;
    public TimeStampData P;
    public TimeStampData Q;
    public TimeStampData R;
    public ncc S;
    public ncc T;

    public wt61(String str, byte[] bArr, List list) {
        super(list, str);
        this.H = null;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.M = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        JCPLogger.finer("Initializing CAdES-A attribute table generator.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r4 = r13.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r4.y.isEmpty() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r4 = r4.b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r13.L = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        r4 = new defpackage.xc3(r4.y);
     */
    @Override // defpackage.nx61, defpackage.hv61, defpackage.sw61, defpackage.i87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xc3 b(Map map) {
        JCPLogger.fine("Creating CAdES-A attribute table...");
        Integer num = CAdESParameters.CAdES_A;
        if (num.equals(num) && map.containsKey("EarliestArchiveTimeStamp")) {
            this.N = (TimeStampData) map.get("EarliestArchiveTimeStamp");
        }
        xc3 b = super.b(map);
        c2 g = b.g();
        try {
            if (num.equals(num)) {
                JCPLogger.fine("Prepare CAdES-A attributes...");
                xc3 xc3Var = this.L;
                if (xc3Var == null && this.K == null) {
                    throw new CAdESException("No signer attribute generator, nor signed attributes", IAdESException.ecCAdESACreatingFailure);
                }
                if (!map.containsKey("LatestArchiveTimeStamp")) {
                    o();
                    JCPLogger.fine("Creating enhanced cAdES-C-timestamp (external)...");
                    u2 u2Var = b490.P3;
                    vc3 createTimeStampAttribute = CAdESUtility.createTimeStampAttribute(u2Var, this.R.getTimeStampToken());
                    JCPLogger.fine("Created enhanced unsigned attribute CAdES-C-timestamp: " + createTimeStampAttribute.a.a);
                    JCPLogger.fine("Removing old cAdES-C-timestamp: " + u2Var);
                    c2 g2 = b.e(u2Var).g();
                    JCPLogger.fine("Adding enhanced attribute cAdES-C-timestamp: " + u2Var);
                    g2.a(createTimeStampAttribute);
                    g = g2;
                }
                if (map.containsKey("LatestArchiveTimeStamp")) {
                    JCPLogger.fine("Copying all archive timestamps except the latest.");
                    Vector vector = (Vector) map.get("ArchiveTimeStampVector");
                    for (int i = 0; i < vector.size() - 1; i++) {
                        g.a((vc3) vector.get(i));
                    }
                    this.O = (TimeStampData) map.get("LatestArchiveTimeStamp");
                    p();
                    JCPLogger.fine("Creating last archive-timestamp attribute...");
                    u2 u2Var2 = CAdESParameters.id_aa_ets_archiveTimestampV3;
                    vc3 createTimeStampAttribute2 = CAdESUtility.createTimeStampAttribute(u2Var2, this.Q.getTimeStampToken());
                    JCPLogger.fine("Add enhanced last attribute archive-timestamp: " + u2Var2);
                    g.a(createTimeStampAttribute2);
                }
                if (this.M == null) {
                    vc3 singleAttribute = CAdESUtility.getSingleAttribute(this.L, b490.u3);
                    if (singleAttribute == null) {
                        throw new AdESException("message-digest attribute not found", IAdESException.ecCAdESACreatingFailure);
                    }
                    this.M = Array.copy(((dqf) singleAttribute.b.a[0]).a);
                }
                JCPLogger.fine("Calculating ats-hash-index-V3.");
                vc3 m = m(CAdESUtility.getUnsignedAttributes(new xc3(g)));
                u2 u2Var3 = (u2) map.get("contentType");
                byte[] bArr = (byte[]) map.get("encryptedDigest");
                xr1 xr1Var = (xr1) map.get("digestAlgID");
                JCPLogger.fine("Creating archive-timestamp-V3 attribute.");
                g.a(n(bArr, xr1Var, u2Var3, this.L, m));
            }
            return new xc3(g);
        } catch (AdESException e) {
            throw new CAdESCMSAttributeTableGenerationException(e.getMessage(), e, e.getErrorCode());
        }
    }

    @Override // defpackage.nx61, defpackage.hv61, defpackage.sw61
    public final Integer c() {
        return CAdESParameters.CAdES_A;
    }

    @Override // defpackage.nx61
    public final Date i() {
        TimeStampData timeStampData = this.N;
        if (timeStampData != null) {
            return (Date) timeStampData.getTimeStampToken().c.b;
        }
        return null;
    }

    @Override // defpackage.nx61
    public final TimeStampData j() {
        return this.R;
    }

    public final vc3 m(Vector vector) {
        JCPLogger.fine("Creating ats-hash-index attribute...");
        zq61 zq61Var = new zq61(true);
        zq61Var.setAttributes(vector);
        zq61Var.b = this.c;
        zq61Var.a = this.b;
        zq61Var.setArchiveSignatureCertificateToBeHashedStore(this.S);
        zq61Var.setArchiveSignatureValidationDataToBeHashedStore(this.T);
        try {
            byte[] digest = zq61Var.getDigest();
            return new vc3(CAdESParameters.id_aa_ets_ATSHashIndexV3, new lqf((i3) ((j3) new o3(digest.length, new ByteArrayInputStream(digest)).G()).a()));
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecATSHashIndexCreatingFailure);
        } catch (AdESException e2) {
            throw new CAdESException(e2, e2.getErrorCode());
        }
    }

    public final vc3 n(byte[] bArr, xr1 xr1Var, u2 u2Var, xc3 xc3Var, vc3 vc3Var) {
        JCPLogger.fine("Creating archive-timestamp attribute...");
        TSPArchiveDataImpl tSPArchiveDataImpl = new TSPArchiveDataImpl(bArr, this.M, this.H, this.J, xr1Var, this.I, u2Var, xc3Var, vc3Var, new ybs0(this.H, xr1Var, xc3Var != null ? new lqf(xc3Var.g()) : null, this.J, new dqf(bArr), null));
        ArchiveTimeStampImpl archiveTimeStampImpl = new ArchiveTimeStampImpl(vc3Var);
        archiveTimeStampImpl.setDigestAlgorithm(this.c);
        archiveTimeStampImpl.setProvider(this.b);
        archiveTimeStampImpl.retrieve(this.a, tSPArchiveDataImpl);
        this.P = new TimeStampData(archiveTimeStampImpl.get(), tSPArchiveDataImpl);
        JCPLogger.fine("Validating archive-timestamp...");
        TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
        ArchiveTimeStampValidationProcessImpl archiveTimeStampValidationProcessImpl = new ArchiveTimeStampValidationProcessImpl(this.P.getTspData(), this.P.getTimeStampToken());
        archiveTimeStampValidationProcessImpl.setCertificateValues(this.y);
        archiveTimeStampValidationProcessImpl.setCRLs(this.z);
        tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) archiveTimeStampValidationProcessImpl);
        JCPLogger.fine("Archive-timestamp validated.");
        JCPLogger.fine("Validating archive-timestamp date...");
        Date date = (Date) this.P.getTimeStampToken().c.b;
        TimeStampData timeStampData = this.O;
        if (timeStampData != null) {
            long time = ((Date) timeStampData.getTimeStampToken().c.b).getTime() - date.getTime();
            if (time > 0) {
                throw new AdESException(qv10.k(time, "Generation time of new archive-timestamp is less than the latest one on ", " ms"), IAdESException.ecCAdESADateMismatch);
            }
        } else {
            long time2 = ((Date) this.G.getTimeStampToken().c.b).getTime() - date.getTime();
            if (time2 > 0) {
                throw new AdESException(qv10.k(time2, "Generation of new archive-timestamp is less than CAdES-C-timestamp on ", " ms"), IAdESException.ecCAdESADateMismatch);
            }
        }
        JCPLogger.fine("Creating archive-timestamp attribute...");
        vc3 createTimeStampAttribute = CAdESUtility.createTimeStampAttribute(CAdESParameters.id_aa_ets_archiveTimestampV3, this.P.getTimeStampToken());
        JCPLogger.fine("Created unsigned attribute archive-timestamp: " + createTimeStampAttribute.a.a);
        return createTimeStampAttribute;
    }

    public final void o() {
        HashSet hashSet = this.z;
        HashSet hashSet2 = this.y;
        JCPLogger.fine("Enhancement of the external timestamp...");
        if (CAdESType.isTimeStampEnhanced(this.G.getTimeStampToken())) {
            this.R = this.G;
            return;
        }
        JCPLogger.fine("Enhancing the external timestamp...");
        EnhancedTSPTimeStampImpl enhancedTSPTimeStampImpl = new EnhancedTSPTimeStampImpl();
        try {
            ExternalTimeStampEnhancementProcessImpl externalTimeStampEnhancementProcessImpl = new ExternalTimeStampEnhancementProcessImpl(this.G.getTimeStampToken());
            externalTimeStampEnhancementProcessImpl.setProvider(this.b);
            externalTimeStampEnhancementProcessImpl.setCertificateValues(hashSet2);
            externalTimeStampEnhancementProcessImpl.setCRLs(hashSet);
            externalTimeStampEnhancementProcessImpl.setOptions(this.D);
            this.R = new TimeStampData(enhancedTSPTimeStampImpl.enhance(externalTimeStampEnhancementProcessImpl), this.G.getTspData());
            JCPLogger.fine("Validating enhanced external-timestamp after enhancement...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            Date date = new Date();
            EnhancedArchiveTimeStampValidationProcessImpl enhancedArchiveTimeStampValidationProcessImpl = new EnhancedArchiveTimeStampValidationProcessImpl(this.R.getTspData(), this.R.getTimeStampToken());
            enhancedArchiveTimeStampValidationProcessImpl.setCertificateValues(hashSet2);
            enhancedArchiveTimeStampValidationProcessImpl.setCRLs(hashSet);
            enhancedArchiveTimeStampValidationProcessImpl.setExternalDate(date);
            enhancedArchiveTimeStampValidationProcessImpl.setOptions(this.D);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) enhancedArchiveTimeStampValidationProcessImpl);
            JCPLogger.fine("Enhanced external-timestamp validated.");
        } catch (AdESException e) {
            throw new CAdESException(e, e.getErrorCode());
        }
    }

    public final void p() {
        m79[] crlVals;
        HashSet hashSet = this.z;
        HashSet hashSet2 = this.y;
        JCPLogger.fine("Enhancement of the latest archive-timestamp...");
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        if (CAdESType.isTimeStampEnhanced(this.O.getTimeStampToken())) {
            JCPLogger.fine("Preparing for deleting unsigned attributes...");
            u87 u87Var = this.O.getTimeStampToken().a;
            Iterator it = u87Var.b().iterator();
            ArrayList arrayList = new ArrayList();
            JCPLogger.fine("Deleting unsigned attributes from signer...");
            while (it.hasNext()) {
                acs0 acs0Var = (acs0) it.next();
                xc3 unsignedAttributes = acs0Var.getUnsignedAttributes();
                JCPLogger.fine("Extracting certificates from certificate-values...");
                i3 i3Var = (i3) CAdESUtility.getSingleAttributeValue(unsignedAttributes, b490.M3);
                int i = 0;
                if (i3Var != null) {
                    for (int i2 = 0; i2 < i3Var.size(); i2++) {
                        try {
                            hashSet3.add((X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(((i3) i3Var.A(i2)).getEncoded())));
                        } catch (Exception e) {
                            throw new CAdESException(e, IAdESException.ecInternal);
                        }
                    }
                }
                JCPLogger.fine("Extracting crl from revocation-values...");
                a2 singleAttributeValue = CAdESUtility.getSingleAttributeValue(unsignedAttributes, b490.O3);
                if (singleAttributeValue != null && (crlVals = v2k0.getInstance(singleAttributeValue).getCrlVals()) != null) {
                    int length = crlVals.length;
                    while (i < length) {
                        try {
                            Iterator it2 = it;
                            hashSet4.add((X509CRL) AdESUtility.CERT_FACTORY.generateCRL(new ByteArrayInputStream(crlVals[i].getEncoded("DER"))));
                            i++;
                            it = it2;
                        } catch (Exception e2) {
                            throw new CAdESException(e2, IAdESException.ecInternal);
                        }
                    }
                }
                arrayList.add(acs0.replaceUnsignedAttributes(acs0Var, unsignedAttributes.e(b490.K3).e(b490.L3).e(b490.M3).e(b490.O3)));
                it = it;
            }
            JCPLogger.fine("Creating new signer information...");
            try {
                this.O = new TimeStampData(new m8z0(u87.d(u87Var, new bcs0(arrayList))), this.O.getTspData());
            } catch (Exception e3) {
                throw new CAdESException(e3, IAdESException.ecTimestampInvalid);
            }
        }
        JCPLogger.fine("Enhancing the latest archive-timestamp...");
        EnhancedTSPTimeStampImpl enhancedTSPTimeStampImpl = new EnhancedTSPTimeStampImpl();
        try {
            ArchiveTimeStampEnhancementProcessImpl archiveTimeStampEnhancementProcessImpl = new ArchiveTimeStampEnhancementProcessImpl(this.O.getTimeStampToken());
            archiveTimeStampEnhancementProcessImpl.setProvider(this.b);
            archiveTimeStampEnhancementProcessImpl.setCertificateValues(hashSet2);
            archiveTimeStampEnhancementProcessImpl.setCertificateValues(hashSet3);
            archiveTimeStampEnhancementProcessImpl.setCRLs(hashSet);
            archiveTimeStampEnhancementProcessImpl.setCRLs(hashSet4);
            archiveTimeStampEnhancementProcessImpl.setOptions(this.D);
            this.Q = new TimeStampData(enhancedTSPTimeStampImpl.enhance(archiveTimeStampEnhancementProcessImpl), this.O.getTspData());
            JCPLogger.fine("Validating enhanced archive-timestamp...");
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            Date date = new Date();
            EnhancedArchiveTimeStampValidationProcessImpl enhancedArchiveTimeStampValidationProcessImpl = new EnhancedArchiveTimeStampValidationProcessImpl(this.Q.getTspData(), this.Q.getTimeStampToken());
            enhancedArchiveTimeStampValidationProcessImpl.setCertificateValues(hashSet2);
            enhancedArchiveTimeStampValidationProcessImpl.setCRLs(hashSet);
            enhancedArchiveTimeStampValidationProcessImpl.setExternalDate(date);
            enhancedArchiveTimeStampValidationProcessImpl.setOptions(this.D);
            tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) enhancedArchiveTimeStampValidationProcessImpl);
            JCPLogger.fine("Enhanced archive-timestamp validated.");
        } catch (AdESException e4) {
            throw new CAdESException(e4, e4.getErrorCode());
        }
    }
}
