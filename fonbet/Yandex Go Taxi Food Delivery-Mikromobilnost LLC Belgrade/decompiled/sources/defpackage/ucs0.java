package defpackage;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class ucs0 {
    public final Context a;
    public final TelephonyManager b;
    public final SubscriptionManager c;

    public ucs0(Context context, TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        this.a = context;
        this.b = telephonyManager;
        this.c = subscriptionManager;
    }

    public final List a() {
        List<SubscriptionInfo> list;
        int i;
        Boolean bool;
        TelephonyManager telephonyManager = this.b;
        EmptyList emptyList = EmptyList.a;
        try {
            SubscriptionManager subscriptionManager = this.c;
            list = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoList() : null;
        } catch (SecurityException unused) {
            list = emptyList;
        }
        if (list == null) {
            return emptyList;
        }
        try {
            List<SubscriptionInfo> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (SubscriptionInfo subscriptionInfo : list2) {
                Pair pair = new Pair("subscriptionId", Integer.valueOf(subscriptionInfo.getSubscriptionId()));
                CharSequence carrierName = subscriptionInfo.getCarrierName();
                Pair pair2 = new Pair("carrierName", carrierName != null ? carrierName.toString() : null);
                CharSequence displayName = subscriptionInfo.getDisplayName();
                Pair pair3 = new Pair("displayName", displayName != null ? displayName.toString() : null);
                Pair pair4 = new Pair("countryIso", subscriptionInfo.getCountryIso());
                Pair pair5 = new Pair("simSlotIndex", Integer.valueOf(subscriptionInfo.getSimSlotIndex()));
                try {
                    i = telephonyManager.getSimState(subscriptionInfo.getSimSlotIndex());
                } catch (Exception unused2) {
                    i = 0;
                }
                Pair pair6 = new Pair("simState", Integer.valueOf(i));
                if (qke.h(this.a, "android.permission.READ_PHONE_STATE") == 0) {
                    bool = Boolean.valueOf(telephonyManager.createForSubscriptionId(subscriptionInfo.getSubscriptionId()).isDataEnabled());
                    arrayList.add(b.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("isDataEnabled", bool)));
                }
                bool = null;
                arrayList.add(b.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("isDataEnabled", bool)));
            }
            return arrayList;
        } catch (SecurityException unused3) {
            return emptyList;
        }
    }
}
