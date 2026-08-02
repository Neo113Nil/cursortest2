package ru.CryptoPro.AdES.tools.revocation.impl;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy;

/* loaded from: classes4.dex */
public abstract class CollectionRevocationURLStrategy implements RevocationURLStrategy<RevocationURLCollection> {
    @Override // ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy
    public abstract /* synthetic */ RevocationURLCollection get(ValidatingData validatingData) throws AdESException;
}
