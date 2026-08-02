package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import defpackage.b6e;

/* loaded from: classes5.dex */
public final class p {
    public static com.yandex.plus.pay.repository.api.model.contacts.b a(PlusPayWebCollectContactsParams plusPayWebCollectContactsParams) {
        com.yandex.plus.pay.repository.api.model.contacts.a aVar;
        plusPayWebCollectContactsParams.getClass();
        int i = o.a[plusPayWebCollectContactsParams.getPageTheme().ordinal()];
        if (i == 1) {
            aVar = com.yandex.plus.pay.repository.api.model.contacts.a.LIGHT;
        } else {
            if (i != 2) {
                b6e.s();
                return null;
            }
            aVar = com.yandex.plus.pay.repository.api.model.contacts.a.DARK;
        }
        return new com.yandex.plus.pay.repository.api.model.contacts.b(aVar);
    }
}
