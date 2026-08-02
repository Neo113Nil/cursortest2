package com.squareup.cash.cdf.money;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class MoneyViewLoad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Boolean initial_loading_timed_out;
    public final Long load_time_ms;
    public final String money_flow_token;
    public final Integer money_version;
    public final LinkedHashMap parameters;
    public final MoneyViewSource source;

    public MoneyViewLoad(String str, Long l, Integer num, Boolean bool, MoneyViewSource moneyViewSource) {
        this.money_flow_token = str;
        this.load_time_ms = l;
        this.money_version = num;
        this.initial_loading_timed_out = bool;
        this.source = moneyViewSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Money", "cdf_action", "View");
        Countries.putSafe(m, "money_flow_token", str);
        Countries.putSafe(m, "load_time_ms", l);
        Countries.putSafe(m, "money_version", num);
        Countries.putSafe(m, "initial_loading_timed_out", bool);
        Countries.putSafe(m, "source", moneyViewSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyViewLoad)) {
            return false;
        }
        MoneyViewLoad moneyViewLoad = (MoneyViewLoad) obj;
        return Intrinsics.areEqual(this.money_flow_token, moneyViewLoad.money_flow_token) && this.load_time_ms.equals(moneyViewLoad.load_time_ms) && this.money_version.equals(moneyViewLoad.money_version) && Intrinsics.areEqual(this.initial_loading_timed_out, moneyViewLoad.initial_loading_timed_out) && this.source == moneyViewLoad.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Money View Load";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.money_flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.load_time_ms, (str == null ? 0 : str.hashCode()) * 31, 31), 961, this.money_version);
        Boolean bool = this.initial_loading_timed_out;
        int hashCode = (m + (bool == null ? 0 : bool.hashCode())) * 31;
        MoneyViewSource moneyViewSource = this.source;
        return hashCode + (moneyViewSource != null ? moneyViewSource.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.load_time_ms, "MoneyViewLoad(money_flow_token=", this.money_flow_token, ", load_time_ms=", ", money_version=");
        m.append(this.money_version);
        m.append(", updated_loading_experience=null, initial_loading_timed_out=");
        m.append(this.initial_loading_timed_out);
        m.append(", source=");
        m.append(this.source);
        m.append(")");
        return m.toString();
    }
}
