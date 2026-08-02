package com.squareup.cash.cdf.afterpayapplet;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AfterpayAppletPurchasesView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final LinkedHashMap parameters;
    public final Long total_owed;

    public AfterpayAppletPurchasesView(String str, Long l) {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.HOME;
        this.afterpay_applet_flow_token = str;
        this.total_owed = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "AfterpayApplet", "cdf_action", "Purchases");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "total_owed", l);
        Countries.putSafe(m, "from_screen", afterpayAppletScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPurchasesView)) {
            return false;
        }
        AfterpayAppletPurchasesView afterpayAppletPurchasesView = (AfterpayAppletPurchasesView) obj;
        if (!Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletPurchasesView.afterpay_applet_flow_token) || !Intrinsics.areEqual(this.total_owed, afterpayAppletPurchasesView.total_owed)) {
            return false;
        }
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Purchases View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.total_owed;
        return AfterpayAppletScreen.HOME.hashCode() + ((hashCode + (l != null ? l.hashCode() : 0)) * 961);
    }

    public final String toString() {
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.HOME;
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.total_owed, "AfterpayAppletPurchasesView(afterpay_applet_flow_token=", this.afterpay_applet_flow_token, ", total_owed=", ", source_screen=null, from_screen=");
        m.append(afterpayAppletScreen);
        m.append(")");
        return m.toString();
    }
}
