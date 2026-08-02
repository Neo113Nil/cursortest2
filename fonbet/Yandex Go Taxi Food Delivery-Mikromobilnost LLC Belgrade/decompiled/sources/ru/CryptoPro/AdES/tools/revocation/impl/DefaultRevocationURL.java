package ru.CryptoPro.AdES.tools.revocation.impl;

import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLActionOnError;
import ru.CryptoPro.AdES.tools.revocation.connection.ConnectionParameters;

/* loaded from: classes4.dex */
public final class DefaultRevocationURL implements RevocationURL {
    private final String url;

    public DefaultRevocationURL(String str) {
        this.url = str;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.RevocationURL, ru.CryptoPro.AdES.tools.revocation.connection.RevocationURLConnection
    public ConnectionParameters getConnectionParameters() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.RevocationURL, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplateWithError
    public RevocationURLActionOnError onError(Throwable th) {
        return null;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.RevocationURL, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplateWithError, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate
    public String get() {
        return this.url;
    }
}
