package ru.CryptoPro.JCPRequest;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.CMSVersion;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.CertificateChoices;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.CertificateSet;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ContentInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.DigestAlgorithmIdentifiers;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.EncapsulatedContentInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.SignedData;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.SignerInfos;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.DirList;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class CertChainLoader {
    public static Certificate[] loadChain(byte[] bArr) throws IOException, Asn1Exception, CertificateException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(DirList.intellectDecode(bArr));
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.decode(asn1BerDecodeBuffer);
        Certificate[] certificateArr = new Certificate[((SignedData) contentInfo.content).certificates.elements.length];
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        int i = 0;
        while (true) {
            Asn1Type asn1Type = contentInfo.content;
            if (i >= ((SignedData) asn1Type).certificates.elements.length) {
                return certificateArr;
            }
            ((SignedData) asn1Type).certificates.elements[i].encode(asn1BerEncodeBuffer);
            certificateArr[i] = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(asn1BerEncodeBuffer.getInputStream());
            i++;
        }
    }

    public static byte[] saveChain(Certificate[] certificateArr) throws IOException, Asn1Exception, CertificateEncodingException {
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.contentType = new Asn1ObjectIdentifier(new OID("1.2.840.113549.1.7.2").value);
        SignedData signedData = new SignedData();
        contentInfo.content = signedData;
        signedData.version = new CMSVersion(1L);
        signedData.digestAlgorithms = new DigestAlgorithmIdentifiers(0);
        signedData.encapContentInfo = new EncapsulatedContentInfo(new Asn1ObjectIdentifier(new OID("1.2.840.113549.1.7.1").value));
        int length = certificateArr.length;
        CertificateSet certificateSet = new CertificateSet(length);
        signedData.certificates = certificateSet;
        certificateSet.elements = new CertificateChoices[length];
        for (int i = 0; i < signedData.certificates.elements.length; i++) {
            ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate certificate = new ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate();
            certificate.decode(new Asn1BerDecodeBuffer(certificateArr[i].getEncoded()));
            signedData.certificates.elements[i] = new CertificateChoices();
            signedData.certificates.elements[i].set_certificate(certificate);
        }
        signedData.signerInfos = new SignerInfos(0);
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        contentInfo.encode(asn1BerEncodeBuffer);
        return asn1BerEncodeBuffer.getMsgCopy();
    }

    public static Certificate[] loadChain(String str) throws IOException, Asn1Exception, CertificateException {
        return loadChain(Array.readFile(str));
    }

    public static void saveChain(Certificate[] certificateArr, String str) throws IOException, Asn1Exception, CertificateEncodingException {
        Array.writeFile(str, saveChain(certificateArr));
    }
}
