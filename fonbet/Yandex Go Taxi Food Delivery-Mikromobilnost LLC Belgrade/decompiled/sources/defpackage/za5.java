package defpackage;

import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public abstract class za5 {
    public final w1d0 a;

    public za5(w1d0 w1d0Var) {
        this.a = w1d0Var;
    }

    public static SubscriptionConfiguration.Subscription.AcquisitionParams a(String str, Map map, List list) {
        Set set;
        if (str == null) {
            str = "";
        }
        if (list != null) {
            List M = a.M(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : M) {
                if (!evu0.J((String) obj)) {
                    arrayList.add(obj);
                }
            }
            set = a.N0(arrayList);
        } else {
            set = EmptySet.a;
        }
        if (map == null) {
            map = b.f();
        }
        return new SubscriptionConfiguration.Subscription.AcquisitionParams(str, set, map);
    }

    public static SubscriptionConfiguration.PayInfo.LegalInfo b(List list) {
        g1e e;
        g1e e2;
        String str = (list == null || (e2 = e("legalText", list)) == null) ? null : e2.b;
        String str2 = (list == null || (e = e("legalUrl", list)) == null) ? null : e.b;
        if (str == null || str2 == null) {
            return null;
        }
        return new SubscriptionConfiguration.PayInfo.LegalInfo(str, str2);
    }

    public static SubscriptionConfiguration.PayInfo.OneClickLegalInfo c(List list, boolean z) {
        g1e e;
        g1e e2;
        g1e e3;
        if (!z) {
            return null;
        }
        String str = (list == null || (e3 = e("legalTemplate", list)) == null) ? null : e3.b;
        String str2 = (list == null || (e2 = e("legalUrlText", list)) == null) ? null : e2.b;
        String str3 = (list == null || (e = e("legalUrl", list)) == null) ? null : e.b;
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        return new SubscriptionConfiguration.PayInfo.OneClickLegalInfo(str, str2, str3);
    }

    public static SubscriptionConfiguration.Subscription d(boolean z, SubscriptionButtonType subscriptionButtonType, SubscriptionPaymentMethod subscriptionPaymentMethod, SubscriptionWidgetType subscriptionWidgetType, String str, List list, SubscriptionConfiguration.Subscription.AcquisitionParams acquisitionParams) {
        int i = subscriptionButtonType == null ? -1 : ya5.a[subscriptionButtonType.ordinal()];
        SubscriptionConfiguration.Subscription.ButtonType buttonType = i != 1 ? i != 2 ? SubscriptionConfiguration.Subscription.ButtonType.UNKNOWN : SubscriptionConfiguration.Subscription.ButtonType.WEB : SubscriptionConfiguration.Subscription.ButtonType.NATIVE;
        int i2 = subscriptionPaymentMethod == null ? -1 : ya5.b[subscriptionPaymentMethod.ordinal()];
        SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod = i2 != 1 ? i2 != 2 ? SubscriptionConfiguration.Subscription.PaymentMethod.UNKNOWN : SubscriptionConfiguration.Subscription.PaymentMethod.IN_APP : SubscriptionConfiguration.Subscription.PaymentMethod.NATIVE;
        int i3 = subscriptionWidgetType != null ? ya5.c[subscriptionWidgetType.ordinal()] : -1;
        return new SubscriptionConfiguration.Subscription(list, z, buttonType, paymentMethod, i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? SubscriptionConfiguration.Subscription.WidgetType.UNKNOWN : SubscriptionConfiguration.Subscription.WidgetType.ACQUISITION_PLATFORM : SubscriptionConfiguration.Subscription.WidgetType.HOST : SubscriptionConfiguration.Subscription.WidgetType.WEB_WIDGET : SubscriptionConfiguration.Subscription.WidgetType.NATIVE_WIDGET, str, acquisitionParams);
    }

    public static g1e e(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            g1e g1eVar = ((f1e) obj).b;
            if (jl40.l(g1eVar != null ? g1eVar.a : null, str)) {
                break;
            }
        }
        f1e f1eVar = (f1e) obj;
        if (f1eVar != null) {
            return f1eVar.b;
        }
        return null;
    }
}
