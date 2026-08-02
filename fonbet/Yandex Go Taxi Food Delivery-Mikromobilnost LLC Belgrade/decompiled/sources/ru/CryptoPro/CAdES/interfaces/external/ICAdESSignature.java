package ru.CryptoPro.CAdES.interfaces.external;

import defpackage.ncc;
import defpackage.u2;
import defpackage.xc3;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.interfaces.IAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public interface ICAdESSignature extends IAdESSignature {
    @Deprecated
    void addSigner(String str, String str2, String str3, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str4, boolean z) throws CAdESException;

    @Deprecated
    void addSigner(String str, String str2, String str3, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException;

    void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z) throws CAdESException;

    void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException;

    void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2, Set<X509CRL> set) throws CAdESException;

    void addSigner(String str, String str2, String str3, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str4, boolean z, xc3 xc3Var, xc3 xc3Var2, Set<X509CRL> set, boolean z2) throws CAdESException;

    @Deprecated
    void addSigner(String str, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str2, boolean z) throws CAdESException;

    @Deprecated
    void addSigner(String str, PrivateKey privateKey, Collection<X509Certificate> collection, Integer num, String str2, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException;

    void addSigner(String str, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str2, boolean z) throws CAdESException;

    void addSigner(String str, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str2, boolean z, xc3 xc3Var, xc3 xc3Var2) throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void close() throws AdESException;

    void decode() throws CAdESException;

    CAdESSigner getCAdESSignerInfo(int i) throws ArrayIndexOutOfBoundsException;

    CAdESSigner[] getCAdESSignerInfos();

    ncc getCertificateStore();

    ncc getCrlStore();

    InputStream getSignedContent() throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void open(OutputStream outputStream) throws AdESException;

    void setCRLStore(ncc nccVar) throws CAdESException;

    void setCRLStore(u2 u2Var, ncc nccVar) throws CAdESException;

    void setCertificateStore(ncc nccVar) throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature, ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    void update(byte[] bArr) throws CAdESException;

    void update(byte[] bArr, int i, int i2) throws CAdESException;

    @Deprecated
    void verify(Collection<X509Certificate> collection) throws CAdESException;

    @Deprecated
    void verify(Collection<X509Certificate> collection, Collection<X509CRL> collection2) throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void verify(Set set) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void verify(Set set, Set set2) throws AdESException;
}
