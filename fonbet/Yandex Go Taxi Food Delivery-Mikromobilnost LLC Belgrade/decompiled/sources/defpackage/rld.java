package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import kotlin.sequences.b;

/* loaded from: classes2.dex */
public abstract class rld {
    public static final PlusPayCompositeOfferDetails.PaymentMethod a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, String str) {
        Object obj;
        s5r s5rVar = new s5r(b.l(new h73(1, plusPayCompositeOfferDetails.getPaymentMethodsGroups()), new foc(10)));
        while (true) {
            if (!s5rVar.hasNext()) {
                obj = null;
                break;
            }
            obj = s5rVar.next();
            if (jl40.l(((PlusPayCompositeOfferDetails.PaymentMethod) obj).getId(), str)) {
                break;
            }
        }
        return (PlusPayCompositeOfferDetails.PaymentMethod) obj;
    }
}
