package defpackage;

import com.yandex.plus.core.graphql.type.VOLUNTARY_MAILING_AGREEMENT_STATUS;
import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;

/* loaded from: classes2.dex */
public final class y200 {
    public static VOLUNTARY_MAILING_AGREEMENT_STATUS a(MailingAdsAgreement.Status status) {
        int i = x200.a[status.ordinal()];
        if (i == 1) {
            return VOLUNTARY_MAILING_AGREEMENT_STATUS.ALLOW;
        }
        if (i == 2) {
            return VOLUNTARY_MAILING_AGREEMENT_STATUS.REFUSE;
        }
        w511.b();
        return null;
    }
}
