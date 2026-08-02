package defpackage;

import ru.yandex.taxi.payment_options.model.PaymentIconType;

/* loaded from: classes8.dex */
public final class qy90 implements bia0 {
    public final tma0 a;

    public qy90(tma0 tma0Var) {
        this.a = tma0Var;
    }

    public static int b(PaymentIconType paymentIconType) {
        switch (py90.a[paymentIconType.ordinal()]) {
            case 1:
                return x2h0.ic_payment_add_card;
            case 2:
                return y2h0.ic_payment_visa;
            case 3:
                return y2h0.ic_payment_troy;
            case 4:
                return y2h0.ic_payment_mastercard;
            case 5:
                return y2h0.ic_payment_maestro;
            case 6:
                return y2h0.ic_payment_mir;
            case 7:
                return y2h0.ic_payment_discover_network;
            case 8:
                return y2h0.ic_payment_amer_exp;
            case 9:
                return y2h0.ic_payment_jcb;
            case 10:
                return y2h0.ic_payment_diners;
            case 11:
                return y2h0.ic_payment_unionpay;
            case 12:
                return y2h0.ic_payment_dinacard;
            case 13:
                return y2h0.ic_payment_humo;
            case 14:
                return y2h0.ic_payment_uzcard;
            case 15:
                return x2h0.ic_payment_undefined;
            case 16:
                return x2h0.ic_payment_undefined;
            case 17:
                return y2h0.ic_payment_cash;
            case 18:
                return y2h0.ic_payment_corp;
            case 19:
                return y2h0.ic_payment_shared_family;
            case 20:
                return y2h0.ic_payment_corp;
            case 21:
                return y2h0.ic_payment_google_pay;
            case 22:
                return x2h0.ic_payment_personal_wallet;
            case 23:
                return y2h0.ic_payment_sbp;
            case 24:
                return y2h0.ic_payment_mbank_account;
            case 25:
                return y2h0.ic_payment_elcart;
            case 26:
                return y2h0.ic_payment_belkart;
            case 27:
                return y2h0.ic_payment_maal;
            case 28:
                return y2h0.ic_payment_transport_card;
            case 29:
                return y2h0.ic_payment_troyka_card;
            case 30:
                return y2h0.ic_payment_tips;
            case 31:
                return y2h0.ic_payment_yape_token;
            case 32:
                return y2h0.ic_payment_nequi_token;
            case 33:
                return y2h0.ic_payment_sbp_token;
            case 34:
                return y2h0.ic_payment_kaspi;
            case 35:
                return y2h0.ic_payment_cash_like;
            case 36:
                return y2h0.ic_payment_cash_like;
            case 37:
                return y2h0.ic_payment_fastshift_account;
            case 38:
                return y2h0.ic_payment_jazzcash_wallet;
            default:
                kbs.f(paymentIconType, "Unknown icon type: ");
                return 0;
        }
    }
}
