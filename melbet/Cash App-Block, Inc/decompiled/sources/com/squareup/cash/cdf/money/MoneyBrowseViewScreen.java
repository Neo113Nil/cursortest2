package com.squareup.cash.cdf.money;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class MoneyBrowseViewScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final BalanceObfuscationState balance_obfuscation_state;
    public final String content_json_representation;
    public final String money_flow_token;
    public final Integer money_version;
    public final LinkedHashMap parameters;
    public final MoneyViewSource source;

    public MoneyBrowseViewScreen(String str, Integer num, String str2, BalanceObfuscationState balanceObfuscationState, MoneyViewSource moneyViewSource) {
        this.money_flow_token = str;
        this.money_version = num;
        this.content_json_representation = str2;
        this.balance_obfuscation_state = balanceObfuscationState;
        this.source = moneyViewSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Money", "cdf_action", "Browse");
        Countries.putSafe(m, "money_flow_token", str);
        Countries.putSafe(m, "money_version", num);
        Countries.putSafe(m, "content_json_representation", str2);
        Countries.putSafe(m, "balance_obfuscation_state", balanceObfuscationState);
        Countries.putSafe(m, "source", moneyViewSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBrowseViewScreen)) {
            return false;
        }
        MoneyBrowseViewScreen moneyBrowseViewScreen = (MoneyBrowseViewScreen) obj;
        return Intrinsics.areEqual(this.money_flow_token, moneyBrowseViewScreen.money_flow_token) && this.money_version.equals(moneyBrowseViewScreen.money_version) && Intrinsics.areEqual(this.content_json_representation, moneyBrowseViewScreen.content_json_representation) && this.balance_obfuscation_state == moneyBrowseViewScreen.balance_obfuscation_state && this.source == moneyBrowseViewScreen.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Money Browse ViewScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.money_flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.money_version);
        String str2 = this.content_json_representation;
        int hashCode = (this.balance_obfuscation_state.hashCode() + ((m + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        MoneyViewSource moneyViewSource = this.source;
        return hashCode + (moneyViewSource != null ? moneyViewSource.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.money_version, "MoneyBrowseViewScreen(money_flow_token=", this.money_flow_token, ", money_version=", ", content_json_representation=");
        m.append(this.content_json_representation);
        m.append(", balance_obfuscation_state=");
        m.append(this.balance_obfuscation_state);
        m.append(", source=");
        m.append(this.source);
        m.append(")");
        return m.toString();
    }
}
