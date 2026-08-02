package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

/* loaded from: classes4.dex */
public class Countersignature extends SignerInfo {
    public Countersignature() {
    }

    public Countersignature(CMSVersion cMSVersion, SignerIdentifier signerIdentifier, DigestAlgorithmIdentifier digestAlgorithmIdentifier, SignedAttributes signedAttributes, SignatureAlgorithmIdentifier signatureAlgorithmIdentifier, SignatureValue signatureValue, UnsignedAttributes unsignedAttributes) {
        super(cMSVersion, signerIdentifier, digestAlgorithmIdentifier, signedAttributes, signatureAlgorithmIdentifier, signatureValue, unsignedAttributes);
    }

    public Countersignature(CMSVersion cMSVersion, SignerIdentifier signerIdentifier, DigestAlgorithmIdentifier digestAlgorithmIdentifier, SignatureAlgorithmIdentifier signatureAlgorithmIdentifier, SignatureValue signatureValue) {
        super(cMSVersion, signerIdentifier, digestAlgorithmIdentifier, signatureAlgorithmIdentifier, signatureValue);
    }

    public Countersignature(long j, SignerIdentifier signerIdentifier, DigestAlgorithmIdentifier digestAlgorithmIdentifier, SignedAttributes signedAttributes, SignatureAlgorithmIdentifier signatureAlgorithmIdentifier, byte[] bArr, UnsignedAttributes unsignedAttributes) {
        super(j, signerIdentifier, digestAlgorithmIdentifier, signedAttributes, signatureAlgorithmIdentifier, bArr, unsignedAttributes);
    }

    public Countersignature(long j, SignerIdentifier signerIdentifier, DigestAlgorithmIdentifier digestAlgorithmIdentifier, SignatureAlgorithmIdentifier signatureAlgorithmIdentifier, byte[] bArr) {
        super(j, signerIdentifier, digestAlgorithmIdentifier, signatureAlgorithmIdentifier, bArr);
    }
}
