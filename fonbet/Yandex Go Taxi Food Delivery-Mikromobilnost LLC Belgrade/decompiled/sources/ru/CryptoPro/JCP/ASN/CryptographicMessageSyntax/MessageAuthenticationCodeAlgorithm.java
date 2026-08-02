package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class MessageAuthenticationCodeAlgorithm extends AlgorithmIdentifier {
    public MessageAuthenticationCodeAlgorithm() {
    }

    public MessageAuthenticationCodeAlgorithm(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public MessageAuthenticationCodeAlgorithm(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        super(asn1ObjectIdentifier);
    }

    public MessageAuthenticationCodeAlgorithm(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }

    public MessageAuthenticationCodeAlgorithm(int[] iArr) {
        super(iArr);
    }
}
