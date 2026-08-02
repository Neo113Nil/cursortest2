package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class zgh {
    public final omm0 a;

    public zgh(omm0 omm0Var) {
        this.a = omm0Var;
    }

    public static void d(qz90 qz90Var) {
        qz90Var.e(zyh0.PlusPay_Error_Google_Common_Title);
        qz90Var.d(zyh0.PlusPay_Error_Google_Common_Subtitle);
        qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
    }

    public final oz90 a(PlusPayCompositeOffers.Offer offer, PlusPaymentFlowErrorReason plusPaymentFlowErrorReason) {
        boolean z = plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Backend;
        omm0 omm0Var = this.a;
        if (!z) {
            int i = 9;
            if (!(plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.GooglePlay)) {
                if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Connection) {
                    return nz90.a(offer, omm0Var, new xgh(i));
                }
                if ((plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.PaymentMethodSelection) || (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unauthorized) || (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unexpected)) {
                    return c(offer);
                }
                w511.b();
                return null;
            }
            switch (ygh.b[((PlusPaymentFlowErrorReason.GooglePlay) plusPaymentFlowErrorReason).getKind().ordinal()]) {
                case 1:
                    return nz90.a(offer, omm0Var, new xgh(i));
                case 2:
                    return nz90.a(offer, omm0Var, new xgh(this, 0));
                case 3:
                    return nz90.a(offer, omm0Var, new xgh(this, 5));
                case 4:
                    return nz90.a(offer, omm0Var, new xgh(this, 6));
                case 5:
                    return nz90.a(offer, omm0Var, new xgh(8));
                case 6:
                    return nz90.a(offer, omm0Var, new xgh(this, 10));
                default:
                    w511.b();
                    return null;
            }
        }
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        switch (ygh.a[((PlusPaymentFlowErrorReason.Backend) plusPaymentFlowErrorReason).getKind().ordinal()]) {
            case 1:
                return nz90.a(offer, omm0Var, new xgh(i4));
            case 2:
                return nz90.a(offer, omm0Var, new xgh(11));
            case 3:
                return nz90.a(offer, omm0Var, new suf(25));
            case 4:
                return nz90.a(offer, omm0Var, new suf(29));
            case 5:
                return nz90.a(offer, omm0Var, new xgh(4));
            case 6:
                return nz90.a(offer, omm0Var, new suf(26));
            case 7:
                return nz90.a(offer, omm0Var, new wgh(this, 3));
            case 8:
                return nz90.a(offer, omm0Var, new suf(27));
            case 9:
                return nz90.a(offer, omm0Var, new suf(24));
            case 10:
                return nz90.a(offer, omm0Var, new xgh(7));
            case 11:
                return nz90.a(offer, omm0Var, new xgh(i2));
            case 12:
                return nz90.a(offer, omm0Var, new xgh(i3));
            case 13:
                return nz90.a(offer, omm0Var, new wgh(this, 2));
            case 14:
                return c(offer);
            case 15:
                return nz90.a(offer, omm0Var, new wgh(this, 1));
            default:
                w511.b();
                return null;
        }
    }

    public final sz90 b(int i, int i2) {
        omm0 omm0Var = this.a;
        return new sz90(omm0Var.a(i), omm0Var.a(i2));
    }

    public final oz90 c(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) a.R(offer.getOptionOffers());
            vendor = option != null ? option.getVendor() : null;
        }
        int i = vendor == null ? -1 : ygh.c[vendor.ordinal()];
        omm0 omm0Var = this.a;
        if (i != -1) {
            if (i == 1) {
                return nz90.a(offer, omm0Var, new wgh(this, 0));
            }
            if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
        }
        return nz90.a(offer, omm0Var, new suf(28));
    }
}
