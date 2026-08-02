package ru.CryptoPro.AdES.tools.revocation.impl;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy;

/* loaded from: classes4.dex */
public abstract class SingleRevocationURLStrategy implements RevocationURLStrategy<RevocationURL> {
    @Override // ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy
    public abstract /* synthetic */ RevocationURL get(ValidatingData validatingData) throws AdESException;
}
