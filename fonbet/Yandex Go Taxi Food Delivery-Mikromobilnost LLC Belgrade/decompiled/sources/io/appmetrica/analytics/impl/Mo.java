package io.appmetrica.analytics.impl;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import defpackage.ak00;
import defpackage.tcc;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/Mo;", "", "Landroid/content/Context;", "context", "", "Lio/appmetrica/analytics/impl/Go;", "a", "<init>", "()V", "analytics-yandex_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Mo {
    public static final Mo a = new Mo();

    private Mo() {
    }

    public static final List<Go> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new ak00(11));
        if (list == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a2 = AndroidUtils.isApiAchieved(29) ? No.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b = AndroidUtils.isApiAchieved(29) ? No.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new Go(a2, b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
