package ru.CryptoPro.CAdES;

import defpackage.a2;
import defpackage.acs0;
import defpackage.b64;
import defpackage.dqf;
import defpackage.i3;
import defpackage.lqf;
import defpackage.m8z0;
import defpackage.nc51;
import defpackage.p0x;
import defpackage.p4x0;
import defpackage.qv10;
import defpackage.rw61;
import defpackage.u2;
import defpackage.ut61;
import defpackage.vc3;
import defpackage.xbs0;
import defpackage.xc3;
import defpackage.xr1;
import defpackage.ybs0;
import defpackage.zq61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.CAdES.exception.ArchiveTimestampValidationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.timestamp.external.ArchiveTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedArchiveTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPArchiveDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TimeStampData;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerAImpl extends CAdESSignerXLT1Impl implements CAdESSignerA {
    public TimeStampData F;
    public TimeStampData G;

    public CAdESSignerAImpl(acs0 acs0Var, boolean z) {
        super(acs0Var, CAdESParameters.CAdES_A, z);
        this.F = null;
        this.G = null;
        i();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getBuildingDate() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerA, ru.CryptoPro.AdES.external.signature.AdESArchSignatureModel
    public List<m8z0> getCAdESArchiveTimestampTokens() {
        return ((ut61) this.z).j();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerA
    public m8z0 getEarliestArchiveTimeStampToken() {
        return this.F.getTimeStampToken();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerA
    public m8z0 getLatestArchiveTimeStampToken() {
        return this.G.getTimeStampToken();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return CAdESParameters.CAdES_A;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getValidationDate() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl
    public final void i() {
        this.z = new ut61(this.a);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public final Map k() {
        JCPLogger.fine("Preparing attribute parameters (A -> A)...");
        JCPLogger.fine("Looking for an earliest and latest archive-timestamps...");
        if (this.G == null || this.F == null) {
            u();
        }
        Map k = super.k();
        Vector<vc3> attributes = CAdESUtility.getAttributes(this.a.getUnsignedAttributes(), CAdESParameters.id_aa_ets_archiveTimestampV3);
        Collections.sort(attributes, rw61.A);
        if (!attributes.isEmpty()) {
            JCPLogger.fine("Adding earliest and latest archive timestamps (A -> A)...");
            HashMap hashMap = (HashMap) k;
            hashMap.put("LatestArchiveTimeStamp", this.G);
            hashMap.put("EarliestArchiveTimeStamp", this.F);
            JCPLogger.fine("Adding all the archive timestamps (A -> A)...");
            hashMap.put("ArchiveTimeStampVector", attributes);
        }
        return k;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl
    public final Date r() {
        return (Date) this.F.getTimeStampToken().c.b;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl
    public final void s() {
        JCPLogger.subEnter();
        long time = ((Date) this.D.getTimeStampToken().c.b).getTime() - ((Date) this.F.getTimeStampToken().c.b).getTime();
        if (time > 0) {
            throw new AdESException(qv10.k(time, "Generation time of earliest archive-timestamp is less than CAdES-C-timestamp on ", " ms"), IAdESException.ecCAdESADateMismatch);
        }
        JCPLogger.subExit();
    }

    public final void u() {
        StringBuilder sb;
        Date date;
        TSPTimeStampValidationProcess tSPTimeStampValidationProcess;
        TSPTimeStampValidationProcess tSPTimeStampValidationProcess2;
        JCPLogger.subEnter();
        List j = ((ut61) this.z).j();
        int size = j.size();
        if (size == 0) {
            throw new ArchiveTimestampValidationException("No previous archive timestamps have been found! It's not a CAdES-A signature!", IAdESException.ecTimestampInvalid);
        }
        JCPLogger.fine("Preparing archive-timestamp attributes...");
        byte[] signature = this.a.getSignature();
        nc51 nc51Var = this.a.getSID().a;
        xbs0 xbs0Var = new xbs0(new p0x(nc51Var.b, nc51Var.c));
        int version = this.a.getVersion();
        xr1 digestAlgorithmID = this.a.getDigestAlgorithmID();
        xr1 xr1Var = this.a.toASN1Structure().x;
        u2 contentType = this.a.getContentType();
        xc3 signerSignedAttributes = getSignerSignedAttributes();
        TSPData[] tSPDataArr = new TSPData[size];
        JCPLogger.fine("Validating archive-timestamps: " + size);
        int i = 0;
        while (i < size) {
            m8z0 m8z0Var = (m8z0) j.get(i);
            xc3 unsignedAttributes = m8z0Var.b.getUnsignedAttributes();
            vc3 c = unsignedAttributes.c(CAdESParameters.id_aa_ets_ATSHashIndex);
            if (c == null) {
                c = unsignedAttributes.c(CAdESParameters.id_aa_ets_ATSHashIndexV3);
            }
            u2 u2Var = c.a;
            u2 u2Var2 = CAdESParameters.id_aa_ets_ATSHashIndexV3;
            boolean q = u2Var.q(u2Var2);
            int i2 = size;
            i3 i3Var = (i3) c.b.a[0];
            int i3 = version;
            u2 u2Var3 = contentType;
            a2 A = i3Var.A(0);
            zq61 zq61Var = new zq61(q);
            zq61Var.b = (A instanceof u2 ? (u2) A : xr1.m(A).a).a;
            zq61Var.y = i3Var;
            Vector vector = zq61Var.z;
            vector.clear();
            vector.addAll(Arrays.asList(((i3) i3Var.A(1)).H()));
            vector.addAll(Arrays.asList(((i3) i3Var.A(2)).H()));
            vector.addAll(Arrays.asList(((i3) i3Var.A(3)).H()));
            zq61Var.a = this.provider;
            JCPLogger.fine("Validating #" + i + " : ats-hash-index digest algorithm...");
            String str = zq61Var.b;
            String str2 = ((p4x0) m8z0Var.c.a).c.a.a.a;
            if (!str.equals(str2)) {
                throw new ArchiveTimestampValidationException(b64.l("Hash algorithm in ats-hash-index: ", str, " doesn't match to algorithm in archive-timestamp: ", str2), IAdESException.ecCAdESANoIdenticDigAlgFailure);
            }
            xc3 xc3Var = signerSignedAttributes;
            StringBuilder sb2 = new StringBuilder("Validating #");
            sb2.append(i);
            xbs0 xbs0Var2 = xbs0Var;
            sb2.append(" : archive-timestamp's ats-hash-index...");
            JCPLogger.fine(sb2.toString());
            Vector<vc3> unsignedAttributes2 = CAdESUtility.getUnsignedAttributes(this.a.getUnsignedAttributes());
            StringBuilder sb3 = new StringBuilder("Validating #");
            sb3.append(i);
            xr1 xr1Var2 = xr1Var;
            sb3.append(" : calculating ats-hash-index digest...");
            JCPLogger.fine(sb3.toString());
            zq61 zq61Var2 = new zq61(c.a.q(u2Var2));
            zq61Var2.setAttributes(unsignedAttributes2);
            zq61Var2.b = str;
            zq61Var2.a = this.provider;
            zq61Var2.setArchiveSignatureCertificateToBeHashedStore(this.archiveSignatureCertificateToBeHashedStore);
            zq61Var2.setArchiveSignatureValidationDataToBeHashedStore(this.archiveSignatureValidationDataToBeHashedStore);
            try {
                zq61Var2.validateImprint(zq61Var);
                TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
                JCPLogger.fine("Validating #" + i + " : archive-timestamp imprint...");
                byte[] bArr = (byte[]) this.E.get(str2);
                if (bArr == null) {
                    throw new ArchiveTimestampValidationException("No data hash found.", IAdESException.ecATSHashIndexCreatingFailure);
                }
                int i4 = i;
                xbs0Var = xbs0Var2;
                TSPData[] tSPDataArr2 = tSPDataArr;
                TSPArchiveDataImpl tSPArchiveDataImpl = new TSPArchiveDataImpl(signature, bArr, xbs0Var, xr1Var2, digestAlgorithmID, i3, u2Var3, xc3Var, c, new ybs0(xbs0Var2, digestAlgorithmID, xc3Var != null ? new lqf(xc3Var.g()) : null, xr1Var2, new dqf(signature), null));
                tSPDataArr2[i4] = tSPArchiveDataImpl;
                tSPArchiveDataImpl.setProvider(this.provider);
                JCPLogger.fine("Searching for valid archive timestamp(s)...");
                if (CAdESType.isTimeStampEnhanced(m8z0Var)) {
                    boolean z = i4 == i2 + (-1);
                    JCPLogger.fine("Validating #" + i4 + ", is last archive timestamp = " + z);
                    if (z) {
                        sb = new StringBuilder("Validating #");
                        sb.append(i4);
                        sb.append(" as simple archive-timestamp...");
                        JCPLogger.fine(sb.toString());
                        ArchiveTimeStampValidationProcessImpl archiveTimeStampValidationProcessImpl = new ArchiveTimeStampValidationProcessImpl(tSPDataArr2[i4], m8z0Var);
                        date = new Date();
                        tSPTimeStampValidationProcess = archiveTimeStampValidationProcessImpl;
                    } else {
                        sb = new StringBuilder("Validating #");
                        sb.append(i4);
                        sb.append(" as enhanced archive-timestamp...");
                        JCPLogger.fine(sb.toString());
                        EnhancedArchiveTimeStampValidationProcessImpl enhancedArchiveTimeStampValidationProcessImpl = new EnhancedArchiveTimeStampValidationProcessImpl(tSPDataArr2[i4], m8z0Var);
                        date = (Date) ((m8z0) j.get(i4 + 1)).c.b;
                        enhancedArchiveTimeStampValidationProcessImpl.setParentalDecoder((ut61) this.z);
                        tSPTimeStampValidationProcess = enhancedArchiveTimeStampValidationProcessImpl;
                    }
                    JCPLogger.fine("Validating #" + i4 + ", archive validation date = " + date);
                    tSPTimeStampValidationProcess.setExternalDate(date);
                    JCPLogger.fine("Validating #" + i4 + ", archive validation date = " + date);
                    tSPTimeStampValidationProcess2 = tSPTimeStampValidationProcess;
                } else {
                    if (i4 != i2 - 1) {
                        throw new ArchiveTimestampValidationException("Simple archive timestamp can be only the last.", IAdESException.ecCAdESAVerifingFailure);
                    }
                    JCPLogger.fine("Validating #" + i4 + " as simple archive-timestamp...");
                    tSPTimeStampValidationProcess2 = new ArchiveTimeStampValidationProcessImpl(tSPDataArr2[i4], m8z0Var);
                }
                tSPTimeStampValidationProcess2.setCertificateValues(this.signatureCertificates);
                tSPTimeStampValidationProcess2.setCRLs(this.signatureCRLs);
                tSPTimeStampValidationProcess2.setOptions(this.options);
                try {
                    tSPTimeStampValidatorImpl.validate(tSPTimeStampValidationProcess2);
                    i = i4 + 1;
                    contentType = u2Var3;
                    signerSignedAttributes = xc3Var;
                    size = i2;
                    version = i3;
                    xr1Var = xr1Var2;
                    tSPDataArr = tSPDataArr2;
                } catch (AdESException e) {
                    throw new ArchiveTimestampValidationException(e, e.getErrorCode());
                }
            } catch (AdESException e2) {
                throw new ArchiveTimestampValidationException(e2, e2.getErrorCode());
            }
        }
        TSPData[] tSPDataArr3 = tSPDataArr;
        JCPLogger.fine("Validating of archive-timestamp(s) completed.");
        int i5 = size - 1;
        this.G = new TimeStampData((m8z0) j.get(i5), tSPDataArr3[i5]);
        this.F = new TimeStampData((m8z0) j.get(0), tSPDataArr3[0]);
        JCPLogger.fine("Archive-timestamps have been found!");
        JCPLogger.exit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException {
        boolean z2;
        Integer num2;
        boolean z3;
        CAdESSignerAImpl cAdESSignerAImpl;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        if (num != null && !num.equals(CAdESParameters.CAdES_A) && !num.equals(CAdESParameters.CAdES_X_Long_Type_1) && !num.equals(CAdESParameters.CAdES_T) && !num.equals(CAdESParameters.CAdES_BES)) {
            JCPLogger.infoFormat("Signature type '{0}' ignored, default signature type used.", CAdESType.getSignatureTypeName(num));
            num = null;
        }
        if (num == null) {
            num = getSignatureType();
        }
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        Set<X509Certificate> set3 = set;
        Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
        this.signatureCertificates.addAll(set3);
        if (set2 == null) {
            set2 = Collections.EMPTY_SET;
        }
        Set<X509CRL> set4 = set2;
        this.signatureCRLs.addAll(set4);
        if (num.equals(CAdESParameters.CAdES_A)) {
            JCPLogger.fine("Validating if archive-timestamps use the same digest algorithms. It allows to ignore calculating of the message-digest...");
            String digestAlgOID = this.a.getDigestAlgOID();
            List j = ((ut61) this.z).j();
            boolean z4 = true;
            for (int i = 0; i < j.size(); i++) {
                z4 &= digestAlgOID.equals(((p4x0) ((m8z0) j.get(i)).c.a).c.a.a.a);
            }
            if (!z4 && this.x == null) {
                throw new CAdESException("Signature can not be verified. Signer digest algorithm and digest algorithms in archive timestamps are not identical. For enhancing with another digest algorithm detached signature only is allowed.", IAdESException.ecCAdESANoIdenticDigAlgFailure);
            }
            if (!z4 && this.w) {
                throw new CAdESException("Signature can not be verified. Signer digest algorithm and digest algorithms in archive timestamps are not identical and raw digest is set as data. For enhancing with another digest algorithm detached signature with content only is allowed.", IAdESException.ecCAdESANoIdenticDigAlgFailure);
            }
            X509Certificate a = a(set3, unmodifiableSet);
            JCPLogger.fine("Verifying binary signature...");
            verifyCryptographicSignature(a, this.provider);
            JCPLogger.fine("Updating digest table...");
            p(null, this.provider, !z4);
            u();
            z2 = true;
            cAdESSignerAImpl = this;
            z3 = z;
            num2 = CAdESParameters.CAdES_X_Long_Type_1;
        } else {
            z2 = false;
            num2 = num;
            z3 = z;
            cAdESSignerAImpl = this;
        }
        cAdESSignerAImpl.q(set3, set4, num2, z3, z2);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws CAdESException {
        JCPLogger.subEnter();
        verify(set, set2, (Integer) null, true);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify() throws CAdESException {
        JCPLogger.subEnter();
        verify(null, null);
        JCPLogger.subExit();
    }
}
