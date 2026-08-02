package defpackage;

import com.yandex.plus.core.graphql.type.VOLUNTARY_AGREEMENT_TEXT_LOGIC;
import com.yandex.plus.core.graphql.type.VOLUNTARY_MAILING_AGREEMENT_STATUS;
import com.yandex.plus.pay.repository.api.model.mailingads.MailingAdsAgreement;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class x200 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[MailingAdsAgreement.Status.values().length];
        try {
            iArr[MailingAdsAgreement.Status.ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MailingAdsAgreement.Status.REFUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[VOLUNTARY_MAILING_AGREEMENT_STATUS.values().length];
        try {
            iArr2[VOLUNTARY_MAILING_AGREEMENT_STATUS.ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[VOLUNTARY_MAILING_AGREEMENT_STATUS.REFUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[VOLUNTARY_MAILING_AGREEMENT_STATUS.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[VOLUNTARY_AGREEMENT_TEXT_LOGIC.values().length];
        try {
            iArr3[VOLUNTARY_AGREEMENT_TEXT_LOGIC.INVERTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[VOLUNTARY_AGREEMENT_TEXT_LOGIC.DIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[VOLUNTARY_AGREEMENT_TEXT_LOGIC.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
