package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.AttributeCertificate;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.AttributeCertificateInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ENCRYPTED_HASH;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class CertifiedAttributes extends AttributeCertificate {
    public CertifiedAttributes() {
    }

    public CertifiedAttributes(AttributeCertificateInfo attributeCertificateInfo, AlgorithmIdentifier algorithmIdentifier, ENCRYPTED_HASH encrypted_hash) {
        super(attributeCertificateInfo, algorithmIdentifier, encrypted_hash);
    }
}
