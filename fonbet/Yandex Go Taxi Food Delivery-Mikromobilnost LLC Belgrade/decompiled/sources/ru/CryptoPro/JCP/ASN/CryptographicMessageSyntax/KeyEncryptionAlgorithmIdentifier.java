package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class KeyEncryptionAlgorithmIdentifier extends AlgorithmIdentifier {
    public KeyEncryptionAlgorithmIdentifier() {
    }

    public KeyEncryptionAlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public KeyEncryptionAlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        super(asn1ObjectIdentifier);
    }

    public KeyEncryptionAlgorithmIdentifier(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }

    public KeyEncryptionAlgorithmIdentifier(int[] iArr) {
        super(iArr);
    }
}
