package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;

/* loaded from: classes5.dex */
public final class h {
    public final g a;

    public h(g gVar) {
        gVar.getClass();
        this.a = gVar;
    }

    public final PlusPayMailingAdsAgreement a(com.yandex.plus.pay.repository.api.model.mailingads.c cVar) {
        PlusPayMailingAdsAgreement.Status status;
        PlusPayMailingAdsAgreement.TextLogic textLogic;
        if (cVar == null) {
            return null;
        }
        com.yandex.plus.pay.repository.api.model.mailingads.b bVar = cVar.c;
        z zVar = cVar.a;
        this.a.getClass();
        PlusPayLegalInfo a = g.a(zVar);
        if (a == null) {
            return null;
        }
        com.yandex.plus.pay.repository.api.model.mailingads.a aVar = cVar.b;
        boolean z = (aVar == com.yandex.plus.pay.repository.api.model.mailingads.a.a && bVar == com.yandex.plus.pay.repository.api.model.mailingads.b.a) || (aVar == com.yandex.plus.pay.repository.api.model.mailingads.a.b && bVar == com.yandex.plus.pay.repository.api.model.mailingads.b.b);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            status = PlusPayMailingAdsAgreement.Status.ALLOW;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            status = PlusPayMailingAdsAgreement.Status.REFUSE;
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 == 0) {
            textLogic = PlusPayMailingAdsAgreement.TextLogic.DIRECT;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return null;
            }
            textLogic = PlusPayMailingAdsAgreement.TextLogic.INVERTED;
        }
        return new PlusPayMailingAdsAgreement(a, z, status, textLogic);
    }
}
