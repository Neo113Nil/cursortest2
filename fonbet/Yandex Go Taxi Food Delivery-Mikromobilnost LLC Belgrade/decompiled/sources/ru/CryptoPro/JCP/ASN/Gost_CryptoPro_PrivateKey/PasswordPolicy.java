package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class PasswordPolicy extends AlgorithmIdentifier {
    public PasswordPolicy() {
    }

    public PasswordPolicy(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public PasswordPolicy(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        super(asn1ObjectIdentifier);
    }

    public PasswordPolicy(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }

    public PasswordPolicy(int[] iArr) {
        super(iArr);
    }
}
