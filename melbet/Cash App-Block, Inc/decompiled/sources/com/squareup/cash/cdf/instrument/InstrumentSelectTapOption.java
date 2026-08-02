package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentSelectTapOption implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Action action;
    public final String client_scenario;
    public final String flow_token;
    public final InstrumentType instrument_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Action {
        public static final /* synthetic */ Action[] $VALUES;
        public static final Action DISABLED;
        public static final Action LINK;
        public static final Action REPLACE;
        public static final Action SELECT;
        public static final Action SHOW_DIALOG;
        public static final Action SHOW_SHEET;
        public static final Action SUBMIT;

        static {
            Action action = new Action("DISABLED", 0);
            DISABLED = action;
            Action action2 = new Action("SUBMIT", 1);
            SUBMIT = action2;
            Action action3 = new Action("SELECT", 2);
            SELECT = action3;
            Action action4 = new Action("LINK", 3);
            LINK = action4;
            Action action5 = new Action("REPLACE", 4);
            REPLACE = action5;
            Action action6 = new Action("SHOW_SHEET", 5);
            SHOW_SHEET = action6;
            Action action7 = new Action("SHOW_DIALOG", 6);
            SHOW_DIALOG = action7;
            $VALUES = new Action[]{action, action2, action3, action4, action5, action6, action7};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public InstrumentSelectTapOption(String str, String str2, Action action, InstrumentType instrumentType, int i) {
        instrumentType = (i & 8) != 0 ? null : instrumentType;
        this.client_scenario = str;
        this.flow_token = str2;
        this.action = action;
        this.instrument_type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Instrument", "cdf_action", "Select");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "action", action);
        Countries.putSafe(m, "instrument_type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectTapOption)) {
            return false;
        }
        InstrumentSelectTapOption instrumentSelectTapOption = (InstrumentSelectTapOption) obj;
        return Intrinsics.areEqual(this.client_scenario, instrumentSelectTapOption.client_scenario) && Intrinsics.areEqual(this.flow_token, instrumentSelectTapOption.flow_token) && this.action == instrumentSelectTapOption.action && this.instrument_type == instrumentSelectTapOption.instrument_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Select TapOption";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        int hashCode3 = (hashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        InstrumentType instrumentType = this.instrument_type;
        return ((hashCode3 + (instrumentType == null ? 0 : instrumentType.hashCode())) * 961) + 0;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentSelectTapOption(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", action=");
        m.append(this.action);
        m.append(", instrument_type=");
        m.append(this.instrument_type);
        m.append(", transaction_type=null, digital_wallet_type=");
        m.append((Object) null);
        m.append(")");
        return m.toString();
    }
}
