package ru.CryptoPro.AdES.tools.revocation.impl;

import java.util.ArrayList;
import java.util.Collection;
import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection;

/* loaded from: classes4.dex */
public final class DefaultRevocationURLCollection implements RevocationURLCollection {
    private final Collection<RevocationURL> defaultRevocationUrls;

    public DefaultRevocationURLCollection(Collection<RevocationURL> collection) {
        ArrayList arrayList = new ArrayList();
        this.defaultRevocationUrls = arrayList;
        arrayList.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate
    public Collection<RevocationURL> get() {
        return this.defaultRevocationUrls;
    }
}
