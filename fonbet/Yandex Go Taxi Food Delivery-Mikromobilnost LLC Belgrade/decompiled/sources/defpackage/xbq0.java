package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.model.data.PersonalInfoVisibility;
import com.yandex.payment.sdk.ui.payment.select.SelectFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class xbq0 {
    public static SelectFragment a(PaymentMethod paymentMethod, PersonalInfoVisibility personalInfoVisibility) {
        SelectFragment selectFragment = new SelectFragment();
        selectFragment.setArguments(wwg.g(new Pair("ARG_PREFERRED_METHOD", paymentMethod), new Pair("ARG_PERSONAL_INFO_STATE", personalInfoVisibility)));
        return selectFragment;
    }
}
