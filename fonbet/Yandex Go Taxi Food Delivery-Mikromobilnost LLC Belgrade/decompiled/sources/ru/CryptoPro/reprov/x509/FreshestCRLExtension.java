package ru.CryptoPro.reprov.x509;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class FreshestCRLExtension extends CRLDistributionPointsExtension {
    public static final String NAME = "FreshestCRL";

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FreshestCRLExtension(Boolean bool, Object obj) throws IOException {
        super(r0, bool, obj instanceof List ? (List) obj : obj, NAME);
        ObjectIdentifier objectIdentifier = PKIXExtensions.FreshestCRL_Id;
        bool.booleanValue();
    }

    @Override // ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension, ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        super.encode(outputStream, PKIXExtensions.FreshestCRL_Id, false);
    }

    public FreshestCRLExtension(List list) throws IOException {
        super(PKIXExtensions.FreshestCRL_Id, false, list, NAME);
    }
}
