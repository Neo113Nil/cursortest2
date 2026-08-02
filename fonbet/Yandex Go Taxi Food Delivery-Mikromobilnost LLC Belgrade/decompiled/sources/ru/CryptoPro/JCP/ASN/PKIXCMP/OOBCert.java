package ru.CryptoPro.JCP.ASN.PKIXCMP;

import com.objsys.asn1j.runtime.Asn1BitString;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.TBSCertificate;

/* loaded from: classes4.dex */
public class OOBCert extends Certificate {
    public OOBCert() {
    }

    public OOBCert(TBSCertificate tBSCertificate, AlgorithmIdentifier algorithmIdentifier, Asn1BitString asn1BitString) {
        super(tBSCertificate, algorithmIdentifier, asn1BitString);
    }
}
