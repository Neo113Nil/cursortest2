package com.squareup.cash.cdf.afterpayapplet;

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
public final class AfterpayAppletErrorView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final AfterpayAppletScreen applet_screen;
    public final LinkedHashMap parameters;

    public AfterpayAppletErrorView(String str, AfterpayAppletScreen afterpayAppletScreen) {
        this.afterpay_applet_flow_token = str;
        this.applet_screen = afterpayAppletScreen;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AfterpayApplet", "cdf_action", "Error");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "applet_screen", afterpayAppletScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletErrorView)) {
            return false;
        }
        AfterpayAppletErrorView afterpayAppletErrorView = (AfterpayAppletErrorView) obj;
        return Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletErrorView.afterpay_applet_flow_token) && this.applet_screen == afterpayAppletErrorView.applet_screen;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet Error View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        return this.applet_screen.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AfterpayAppletErrorView(afterpay_applet_flow_token=" + this.afterpay_applet_flow_token + ", applet_screen=" + this.applet_screen + ")";
    }
}
