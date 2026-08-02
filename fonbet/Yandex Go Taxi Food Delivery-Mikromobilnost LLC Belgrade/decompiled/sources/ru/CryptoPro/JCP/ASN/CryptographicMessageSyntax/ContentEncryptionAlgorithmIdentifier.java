package ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class ContentEncryptionAlgorithmIdentifier extends AlgorithmIdentifier {
    public ContentEncryptionAlgorithmIdentifier() {
    }

    public ContentEncryptionAlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1OpenType asn1OpenType) {
        super(asn1ObjectIdentifier, asn1OpenType);
    }

    public ContentEncryptionAlgorithmIdentifier(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        super(asn1ObjectIdentifier);
    }

    public ContentEncryptionAlgorithmIdentifier(int[] iArr, Asn1Type asn1Type) {
        super(iArr, asn1Type);
    }

    public ContentEncryptionAlgorithmIdentifier(int[] iArr) {
        super(iArr);
    }
}
