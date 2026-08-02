package ru.CryptoPro.AdES.tools.revocation.template;

import ru.CryptoPro.AdES.tools.revocation.RevocationURLActionOnError;

/* loaded from: classes4.dex */
public interface RevocationURLTemplateWithError<T> extends RevocationURLTemplate<T> {
    @Override // ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate
    /* synthetic */ Object get();

    RevocationURLActionOnError onError(Throwable th);
}
