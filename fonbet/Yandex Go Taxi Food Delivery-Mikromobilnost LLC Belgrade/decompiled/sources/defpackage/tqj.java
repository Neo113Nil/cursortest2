package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsActionUrl;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class tqj {
    public static DiscountsPromoCodeDetailsActionUrl a(String str) {
        Object obj;
        Iterator<E> it = DiscountsPromoCodeDetailsActionUrl.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((DiscountsPromoCodeDetailsActionUrl) obj).getCode(), str)) {
                break;
            }
        }
        DiscountsPromoCodeDetailsActionUrl discountsPromoCodeDetailsActionUrl = (DiscountsPromoCodeDetailsActionUrl) obj;
        return discountsPromoCodeDetailsActionUrl == null ? DiscountsPromoCodeDetailsActionUrl.UNKNOWN : discountsPromoCodeDetailsActionUrl;
    }
}
