package app.cash.trifle;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes3.dex */
public abstract class TrifleAlgorithmIdentifier extends AlgorithmIdentifier {

    public final class ECDSASha256AlgorithmIdentifier extends TrifleAlgorithmIdentifier {
        public static final ECDSASha256AlgorithmIdentifier INSTANCE = new ECDSASha256AlgorithmIdentifier("1.2.840.10045.4.3.2");
    }

    public final class ECPublicKeyAlgorithmIdentifier extends TrifleAlgorithmIdentifier {
    }

    public final class EdDSAAlgorithmIdentifier extends TrifleAlgorithmIdentifier {
        public static final EdDSAAlgorithmIdentifier INSTANCE = new EdDSAAlgorithmIdentifier("1.3.101.112");
    }

    public final class P256v1AlgorithmIdentifier extends TrifleAlgorithmIdentifier {
        public static final P256v1AlgorithmIdentifier INSTANCE = new P256v1AlgorithmIdentifier("1.2.840.10045.3.1.7");
    }

    public TrifleAlgorithmIdentifier(String str) {
        super(new ASN1ObjectIdentifier(str), null);
    }
}
