package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BitString;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;

/* loaded from: classes4.dex */
public class ProtocolEncrKey extends SubjectPublicKeyInfo {
    public ProtocolEncrKey() {
    }

    public ProtocolEncrKey(AlgorithmIdentifier algorithmIdentifier, Asn1BitString asn1BitString) {
        super(algorithmIdentifier, asn1BitString);
    }
}
