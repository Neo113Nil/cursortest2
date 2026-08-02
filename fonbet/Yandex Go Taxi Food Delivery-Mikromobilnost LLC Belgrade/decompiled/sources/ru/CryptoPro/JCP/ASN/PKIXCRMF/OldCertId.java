package ru.CryptoPro.JCP.ASN.PKIXCRMF;

import com.objsys.asn1j.runtime.Asn1BigInteger;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;

/* loaded from: classes4.dex */
public class OldCertId extends CertId {
    public OldCertId() {
    }

    public OldCertId(GeneralName generalName, Asn1BigInteger asn1BigInteger) {
        super(generalName, asn1BigInteger);
    }
}
