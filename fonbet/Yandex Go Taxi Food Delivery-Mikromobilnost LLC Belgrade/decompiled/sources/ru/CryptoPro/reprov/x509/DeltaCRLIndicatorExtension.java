package ru.CryptoPro.reprov.x509;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class DeltaCRLIndicatorExtension extends CRLNumberExtension {
    private static final String LABEL = "Base CRL Number";
    public static final String NAME = "DeltaCRLIndicator";

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeltaCRLIndicatorExtension(Boolean bool, Object obj) throws IOException {
        super(r1, bool, obj instanceof BigInteger ? (BigInteger) obj : obj, NAME, LABEL);
        ObjectIdentifier objectIdentifier = PKIXExtensions.DeltaCRLIndicator_Id;
        bool.booleanValue();
    }

    @Override // ru.CryptoPro.reprov.x509.CRLNumberExtension, ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        new DerOutputStream();
        super.encode(outputStream, PKIXExtensions.DeltaCRLIndicator_Id, true);
    }

    public DeltaCRLIndicatorExtension(int i) throws IOException {
        super(PKIXExtensions.DeltaCRLIndicator_Id, true, BigInteger.valueOf(i), NAME, LABEL);
    }

    public DeltaCRLIndicatorExtension(BigInteger bigInteger) throws IOException {
        super(PKIXExtensions.DeltaCRLIndicator_Id, true, bigInteger, NAME, LABEL);
    }
}
