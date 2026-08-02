package ru.CryptoPro.XAdES.interfaces.external;

import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.interfaces.IAdESSignature;
import ru.CryptoPro.XAdES.DataObjects;
import ru.CryptoPro.XAdES.XAdESSigner;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public interface IXAdESSignature extends IAdESSignature {
    void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str5) throws XAdESException;

    void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str5) throws XAdESException;

    void addSigner(String str, String str2, String str3, String str4, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str5, Set<X509CRL> set) throws XAdESException;

    void addSigner(String str, String str2, PrivateKey privateKey, List<X509Certificate> list, Integer num, String str3) throws XAdESException;

    void addSigner(String str, String str2, PrivateKey privateKey, List<X509Certificate> list, boolean z, Integer num, String str3) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void close() throws AdESException;

    XAdESSigner getXAdESSignerInfo(int i) throws ArrayIndexOutOfBoundsException;

    XAdESSigner[] getXAdESSignerInfos();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void open(OutputStream outputStream) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature, ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    void update(Element element, DataObjects dataObjects) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void verify(Set set) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSignature
    /* synthetic */ void verify(Set set, Set set2) throws AdESException;
}
