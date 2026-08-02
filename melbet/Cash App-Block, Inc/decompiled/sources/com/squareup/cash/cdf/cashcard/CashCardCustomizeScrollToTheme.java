package com.squareup.cash.cdf.cashcard;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashCardCustomizeScrollToTheme implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final Integer index;
    public final LinkedHashMap parameters;
    public final String theme_token;

    public CashCardCustomizeScrollToTheme(Integer num, String str, String str2, String str3) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.index = num;
        this.theme_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "index", num);
        Countries.putSafe(m, "theme_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizeScrollToTheme)) {
            return false;
        }
        CashCardCustomizeScrollToTheme cashCardCustomizeScrollToTheme = (CashCardCustomizeScrollToTheme) obj;
        return this.client_scenario.equals(cashCardCustomizeScrollToTheme.client_scenario) && Intrinsics.areEqual(this.flow_token, cashCardCustomizeScrollToTheme.flow_token) && this.index.equals(cashCardCustomizeScrollToTheme.index) && this.theme_token.equals(cashCardCustomizeScrollToTheme.theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize ScrollToTheme";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.client_scenario.hashCode() * 31;
        String str = this.flow_token;
        return this.theme_token.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.index);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashCardCustomizeScrollToTheme(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", index=");
        m.append(this.index);
        m.append(", theme_token=");
        m.append(this.theme_token);
        m.append(")");
        return m.toString();
    }
}
