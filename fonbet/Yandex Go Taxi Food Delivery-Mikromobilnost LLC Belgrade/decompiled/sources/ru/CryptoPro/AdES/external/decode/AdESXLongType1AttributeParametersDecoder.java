package ru.CryptoPro.AdES.external.decode;

import defpackage.cr80;
import defpackage.tbf;
import defpackage.v2k0;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes4.dex */
public interface AdESXLongType1AttributeParametersDecoder {
    List<X509Certificate> getCertificateValues();

    List<cr80> getCompleteCertificateReferences();

    List<tbf> getCompleteRevocationReferences();

    v2k0 getRevocationValues();
}
