package ru.CryptoPro.AdES.tools.revocation.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;

/* loaded from: classes4.dex */
public final class DefaultRevocationURLStrategy extends CollectionRevocationURLStrategy {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.CryptoPro.AdES.tools.revocation.impl.CollectionRevocationURLStrategy, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy
    public RevocationURLCollection get(final ValidatingData validatingData) throws AdESException {
        return new RevocationURLCollection() { // from class: ru.CryptoPro.AdES.tools.revocation.impl.DefaultRevocationURLStrategy.1
            @Override // ru.CryptoPro.AdES.tools.revocation.RevocationURLCollection, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLTemplate
            public Collection<RevocationURL> get() {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = AdESUtility.getOcspUrls(validatingData.getCertificate()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new DefaultRevocationURL(it.next()));
                }
                return arrayList;
            }
        };
    }
}
