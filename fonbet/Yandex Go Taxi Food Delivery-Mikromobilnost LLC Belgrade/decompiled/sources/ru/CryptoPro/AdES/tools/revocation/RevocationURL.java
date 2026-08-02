package ru.CryptoPro.AdES.tools.revocation;

import ru.CryptoPro.AdES.tools.revocation.connection.ConnectionParameters;
import ru.CryptoPro.AdES.tools.revocation.connection.RevocationURLConnection;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplateWithError;

/* loaded from: classes4.dex */
public interface RevocationURL extends RevocationURLConnection, RevocationURLTemplateWithError<String> {
    @Override // ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplateWithError, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate
    /* synthetic */ Object get();

    @Override // ru.CryptoPro.AdES.tools.revocation.connection.RevocationURLConnection
    /* synthetic */ ConnectionParameters getConnectionParameters();

    @Override // ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplateWithError
    /* synthetic */ RevocationURLActionOnError onError(Throwable th);
}
