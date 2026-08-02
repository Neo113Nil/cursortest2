package ru.CryptoPro.AdES.external.signature;

import defpackage.ncc;
import defpackage.vc3;
import java.util.Vector;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface ATSHashIndex extends DigestUtility, ProviderUtility {
    byte[] getDigest() throws AdESException;

    String getDigestAlgorithm();

    void setArchiveSignatureCertificateToBeHashedStore(ncc nccVar);

    void setArchiveSignatureValidationDataToBeHashedStore(ncc nccVar);

    void setAttributes(Vector<vc3> vector);

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    void validateImprint(ATSHashIndex aTSHashIndex) throws AdESException;
}
