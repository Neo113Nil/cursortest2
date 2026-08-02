package com.squareup.cash.cdf.account;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AccountSwitchAccountViewSwitcher implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Entrypoint entry_point;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Boolean shows_add_account;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Entrypoint {
        public static final /* synthetic */ Entrypoint[] $VALUES;
        public static final Entrypoint CLIENT_ROUTE;
        public static final Entrypoint PROFILE_ICON_LONG_PRESS;
        public static final Entrypoint PROFILE_TAB_CASHTAG_DROPDOWN;
        public static final Entrypoint UNSUPPORTED_FAMILY_SETTINGS;
        public static final Entrypoint UNSUPPORTED_NOTIFICATIONS_SETTINGS;
        public static final Entrypoint UNSUPPORTED_PERSONAL_SETTINGS;

        static {
            Entrypoint entrypoint = new Entrypoint("PROFILE_TAB_CASHTAG_DROPDOWN", 0);
            PROFILE_TAB_CASHTAG_DROPDOWN = entrypoint;
            Entrypoint entrypoint2 = new Entrypoint("PROFILE_ICON_LONG_PRESS", 1);
            PROFILE_ICON_LONG_PRESS = entrypoint2;
            Entrypoint entrypoint3 = new Entrypoint("PAYMENT_FLOW_CASHTAG_DROPDOWN", 2);
            Entrypoint entrypoint4 = new Entrypoint("CLIENT_ROUTE", 3);
            CLIENT_ROUTE = entrypoint4;
            Entrypoint entrypoint5 = new Entrypoint("UNSUPPORTED_PERSONAL_SETTINGS", 4);
            UNSUPPORTED_PERSONAL_SETTINGS = entrypoint5;
            Entrypoint entrypoint6 = new Entrypoint("UNSUPPORTED_NOTIFICATIONS_SETTINGS", 5);
            UNSUPPORTED_NOTIFICATIONS_SETTINGS = entrypoint6;
            Entrypoint entrypoint7 = new Entrypoint("UNSUPPORTED_FAMILY_SETTINGS", 6);
            UNSUPPORTED_FAMILY_SETTINGS = entrypoint7;
            $VALUES = new Entrypoint[]{entrypoint, entrypoint2, entrypoint3, entrypoint4, entrypoint5, entrypoint6, entrypoint7};
        }

        public static Entrypoint valueOf(String str) {
            return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
        }

        public static Entrypoint[] values() {
            return (Entrypoint[]) $VALUES.clone();
        }
    }

    public AccountSwitchAccountViewSwitcher(String str, Boolean bool, Entrypoint entrypoint) {
        this.flow_token = str;
        this.shows_add_account = bool;
        this.entry_point = entrypoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "shows_add_account", bool);
        Countries.putSafe(m, "entry_point", entrypoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountViewSwitcher)) {
            return false;
        }
        AccountSwitchAccountViewSwitcher accountSwitchAccountViewSwitcher = (AccountSwitchAccountViewSwitcher) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountViewSwitcher.flow_token) && this.shows_add_account.equals(accountSwitchAccountViewSwitcher.shows_add_account) && this.entry_point == accountSwitchAccountViewSwitcher.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount ViewSwitcher";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.shows_add_account, (str == null ? 0 : str.hashCode()) * 31, 31);
        Entrypoint entrypoint = this.entry_point;
        return m + (entrypoint != null ? entrypoint.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.shows_add_account, "AccountSwitchAccountViewSwitcher(flow_token=", this.flow_token, ", shows_add_account=", ", entry_point=");
        m.append(this.entry_point);
        m.append(")");
        return m.toString();
    }
}
