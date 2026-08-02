package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.j2;
import defpackage.m8z0;
import defpackage.ncc;
import defpackage.p4x0;
import defpackage.u87;
import defpackage.xc3;
import defpackage.z87;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner;
import ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class CAdESSigner extends AdESSigner implements CAdESParameters, ICAdESSigner {
    public static final int BUFFER_SIZE = 32768;
    public acs0 a;
    public AdESXLongType1AttributeDecoder b = null;
    public final ArrayList c = new ArrayList();
    public boolean w = false;
    public InputStream x = null;
    public GostDigestCalculatorProvider y = null;

    public CAdESSigner(acs0 acs0Var, Integer num) {
        this.a = null;
        JCPLogger.subEnter();
        this.a = acs0Var;
        if (AdESSigner.verifiedSignatureTypes.contains(num)) {
            JCPLogger.subExit();
            return;
        }
        throw new CAdESException("Unsupported signature type " + CAdESType.getSignatureTypeName(num) + " to be verified.", IAdESException.ecSignatureUnsupported);
    }

    public static Date b(byte[] bArr) {
        JCPLogger.fine("Extracting timestamp generation date...");
        try {
            z87 z87Var = new u87(bArr).c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            z87Var.write(byteArrayOutputStream);
            return p4x0.m(new j2(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).n()).x.y();
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecTimestampInvalid);
        }
    }

    public static void replaceUnsignedAttributes(CAdESSigner cAdESSigner, xc3 xc3Var) {
        cAdESSigner.a = acs0.replaceUnsignedAttributes(cAdESSigner.a, xc3Var);
    }

    public final X509Certificate a(Collection collection, Set set) {
        JCPLogger.subEnter();
        X509Certificate signerCertificate = getSignerCertificate();
        if (signerCertificate == null) {
            try {
                findSignerCertificate(set, collection);
                signerCertificate = getSignerCertificate();
                if (signerCertificate == null) {
                    throw new CAdESException("Signer certificate not found.", IAdESException.ecSignerCertificateIsNull);
                }
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
            }
        }
        JCPLogger.subExit();
        return signerCertificate;
    }

    public abstract /* synthetic */ void addCountersigner(acs0 acs0Var) throws CAdESException;

    public final void c(ncc nccVar) {
        JCPLogger.subEnter();
        try {
            this.signatureCertificates.addAll(AdESUtility.convertCertificateStoreToSet(nccVar));
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new CAdESException(e, e.getErrorCode());
        }
    }

    public final void d(ncc nccVar) {
        JCPLogger.subEnter();
        try {
            this.signatureCRLs.addAll(AdESUtility.convertValidationDataToSet(nccVar, true));
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new CAdESException(e, e.getErrorCode());
        }
    }

    public final void e(ncc nccVar) {
        if (this.archiveSignatureCertificateToBeHashedStore != null || nccVar == null) {
            return;
        }
        this.archiveSignatureCertificateToBeHashedStore = nccVar;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num) throws CAdESException;

    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    public abstract /* synthetic */ CAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public void enhance(String str, String str2, Collection<X509Certificate> collection, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        JCPLogger.subEnter();
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        enhance(str, str2, (List) new LinkedList(collection), str3, num, (xc3) null);
        JCPLogger.subExit();
    }

    public final void f(ncc nccVar) {
        if (this.archiveSignatureValidationDataToBeHashedStore != null || nccVar == null) {
            return;
        }
        this.archiveSignatureValidationDataToBeHashedStore = nccVar;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public m8z0 getCAdESCTimestampToken() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public Collection<m8z0> getCAdESCTimestampTokenList() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public CAdESSigner[] getCAdESCountersignerInfos() {
        return new CAdESSigner[0];
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public m8z0 getSignatureTimestampToken() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public Collection<m8z0> getSignatureTimestampTokenList() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return CAdESParameters.PKCS7;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public acs0 getSignerInfo() {
        return this.a;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public xc3 getSignerSignedAttributes() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public xc3 getSignerUnsignedAttributes() {
        return null;
    }

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public void verify(Collection<X509Certificate> collection, Collection<X509CRL> collection2, Integer num, boolean z) throws CAdESException {
        JCPLogger.subEnter();
        if (collection == null) {
            collection = Collections.EMPTY_SET;
        }
        if (collection2 == null) {
            collection2 = Collections.EMPTY_SET;
        }
        verify((Set) new HashSet(collection), (Set) new HashSet(collection2), num, z);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public abstract /* synthetic */ void verify(Set set, Set set2) throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public abstract /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public void enhance(String str, String str2, Collection<X509Certificate> collection, String str3, Integer num) throws CAdESException {
        JCPLogger.subEnter();
        enhance(str, str2, collection, str3, num, (xc3) null);
        JCPLogger.subExit();
    }
}
