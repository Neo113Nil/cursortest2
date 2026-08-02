package ru.CryptoPro.reprov.x509;

import ru.CryptoPro.JCP.tools.CertReader.GeneralCerReader;
import ru.CryptoPro.JCP.tools.CertReader.SplitDirectName;

/* loaded from: classes4.dex */
public class GeneralCerReaderEx extends GeneralCerReader {
    @Override // ru.CryptoPro.JCP.tools.CertReader.GeneralCerReader
    public ru.CryptoPro.JCP.tools.CertReader.Extension getIssuer() {
        return new ru.CryptoPro.JCP.tools.CertReader.Extension(GeneralCerReader.extensionprivateresource.getString("cer.Issuer"), SplitDirectName.getExtensionsOfNames(CertificateNameSplitter.listName(getCertificate().getIssuerX500Principal().getEncoded())));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.GeneralCerReader
    public ru.CryptoPro.JCP.tools.CertReader.Extension getSubject() {
        return new ru.CryptoPro.JCP.tools.CertReader.Extension(GeneralCerReader.extensionprivateresource.getString("cer.Owner"), SplitDirectName.getExtensionsOfNames(CertificateNameSplitter.listName(getCertificate().getSubjectX500Principal().getEncoded())));
    }
}
