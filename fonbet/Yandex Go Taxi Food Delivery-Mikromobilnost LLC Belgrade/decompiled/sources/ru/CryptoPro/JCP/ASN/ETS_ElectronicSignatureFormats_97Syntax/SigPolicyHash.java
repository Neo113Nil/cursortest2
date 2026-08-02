package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.OtherHashAlgAndValue;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.OtherHashValue;

/* loaded from: classes4.dex */
public class SigPolicyHash extends OtherHashAlgAndValue {
    public SigPolicyHash() {
    }

    public SigPolicyHash(AlgorithmIdentifier algorithmIdentifier, OtherHashValue otherHashValue) {
        super(algorithmIdentifier, otherHashValue);
    }

    public SigPolicyHash(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        super(algorithmIdentifier, bArr);
    }
}
