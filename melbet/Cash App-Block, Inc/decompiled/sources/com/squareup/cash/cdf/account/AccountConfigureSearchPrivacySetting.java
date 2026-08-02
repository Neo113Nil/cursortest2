package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountConfigureSearchPrivacySetting implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String customer_token;
    public final LinkedHashMap parameters;
    public final SettingType setting_name;
    public final ToggleState value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SettingType {
        public static final /* synthetic */ SettingType[] $VALUES;
        public static final SettingType EMAIL;
        public static final SettingType NAME;
        public static final SettingType PHONE;

        static {
            SettingType settingType = new SettingType("NAME", 0);
            NAME = settingType;
            SettingType settingType2 = new SettingType("PHONE", 1);
            PHONE = settingType2;
            SettingType settingType3 = new SettingType("EMAIL", 2);
            EMAIL = settingType3;
            $VALUES = new SettingType[]{settingType, settingType2, settingType3};
        }

        public static SettingType valueOf(String str) {
            return (SettingType) Enum.valueOf(SettingType.class, str);
        }

        public static SettingType[] values() {
            return (SettingType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ToggleState {
        public static final /* synthetic */ ToggleState[] $VALUES;
        public static final ToggleState OFF;
        public static final ToggleState ON;

        static {
            ToggleState toggleState = new ToggleState("ON", 0);
            ON = toggleState;
            ToggleState toggleState2 = new ToggleState("OFF", 1);
            OFF = toggleState2;
            $VALUES = new ToggleState[]{toggleState, toggleState2};
        }

        public static ToggleState valueOf(String str) {
            return (ToggleState) Enum.valueOf(ToggleState.class, str);
        }

        public static ToggleState[] values() {
            return (ToggleState[]) $VALUES.clone();
        }
    }

    public AccountConfigureSearchPrivacySetting(String str, SettingType settingType, ToggleState toggleState) {
        this.customer_token = str;
        this.setting_name = settingType;
        this.value = toggleState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "Configure");
        Countries.putSafe(m, "customer_token", str);
        Countries.putSafe(m, "setting_name", settingType);
        Countries.putSafe(m, "value", toggleState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountConfigureSearchPrivacySetting)) {
            return false;
        }
        AccountConfigureSearchPrivacySetting accountConfigureSearchPrivacySetting = (AccountConfigureSearchPrivacySetting) obj;
        return this.customer_token.equals(accountConfigureSearchPrivacySetting.customer_token) && this.setting_name == accountConfigureSearchPrivacySetting.setting_name && this.value == accountConfigureSearchPrivacySetting.value;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Configure SearchPrivacySetting";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.value.hashCode() + ((this.setting_name.hashCode() + (this.customer_token.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AccountConfigureSearchPrivacySetting(customer_token=" + this.customer_token + ", setting_name=" + this.setting_name + ", value=" + this.value + ")";
    }
}
