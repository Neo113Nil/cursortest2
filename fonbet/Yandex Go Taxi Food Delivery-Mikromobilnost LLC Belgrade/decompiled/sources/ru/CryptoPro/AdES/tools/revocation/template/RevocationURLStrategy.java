package ru.CryptoPro.AdES.tools.revocation.template;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate;

/* loaded from: classes4.dex */
public interface RevocationURLStrategy<T extends RevocationURLTemplate<?>> {
    T get(ValidatingData validatingData) throws AdESException;
}
