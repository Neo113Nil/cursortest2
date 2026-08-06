package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

@DoNotInline
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647ol {

    /* renamed from: a, reason: collision with root package name */
    public static final C0647ol f6693a = new C0647ol();

    private C0647ol() {
    }

    public static final List<C0491il> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new H0.b(17));
        if (list == null) {
            return i1.r.f3416a;
        }
        ArrayList arrayList = new ArrayList(i1.k.E(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a2 = AndroidUtils.isApiAchieved(29) ? C0673pl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b2 = AndroidUtils.isApiAchieved(29) ? C0673pl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z2 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C0491il(a2, b2, z2, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
