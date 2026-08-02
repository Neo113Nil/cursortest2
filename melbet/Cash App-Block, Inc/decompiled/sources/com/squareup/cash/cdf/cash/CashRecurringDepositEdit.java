package com.squareup.cash.cdf.cash;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashRecurringDepositEdit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SettingsOption {
        public static final /* synthetic */ SettingsOption[] $VALUES;
        public static final SettingsOption ENABLE;

        static {
            SettingsOption settingsOption = new SettingsOption("ENABLE", 0);
            ENABLE = settingsOption;
            $VALUES = new SettingsOption[]{settingsOption, new SettingsOption("DISABLE", 1), new SettingsOption("EDIT_AMOUNT", 2), new SettingsOption("EDIT_FREQUENCY", 3)};
        }

        public static SettingsOption valueOf(String str) {
            return (SettingsOption) Enum.valueOf(SettingsOption.class, str);
        }

        public static SettingsOption[] values() {
            return (SettingsOption[]) $VALUES.clone();
        }
    }

    public CashRecurringDepositEdit() {
        SettingsOption settingsOption = SettingsOption.ENABLE;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Cash", "cdf_action", "RecurringDeposit");
        Countries.putSafe(m, "option", settingsOption);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashRecurringDepositEdit)) {
            return false;
        }
        SettingsOption settingsOption = SettingsOption.ENABLE;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash RecurringDeposit Edit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return SettingsOption.ENABLE.hashCode();
    }

    public final String toString() {
        return "CashRecurringDepositEdit(option=" + SettingsOption.ENABLE + ")";
    }
}
