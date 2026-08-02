package com.squareup.cash.cdf.app;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class AppNavigateSelectVersionUpdateOption implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Option option;
    public final LinkedHashMap parameters;
    public final UpdateType update_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Option {
        public static final /* synthetic */ Option[] $VALUES;
        public static final Option DISMISS;
        public static final Option OPEN_WEB_VERSION;
        public static final Option VISIT_APP_STORE;

        static {
            Option option = new Option("VISIT_APP_STORE", 0);
            VISIT_APP_STORE = option;
            Option option2 = new Option("DISMISS", 1);
            DISMISS = option2;
            Option option3 = new Option("OPEN_WEB_VERSION", 2);
            OPEN_WEB_VERSION = option3;
            $VALUES = new Option[]{option, option2, option3};
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class UpdateType {
        public static final /* synthetic */ UpdateType[] $VALUES;
        public static final UpdateType FORCED;
        public static final UpdateType SUGGESTED;

        static {
            UpdateType updateType = new UpdateType("FORCED", 0);
            FORCED = updateType;
            UpdateType updateType2 = new UpdateType("SUGGESTED", 1);
            SUGGESTED = updateType2;
            $VALUES = new UpdateType[]{updateType, updateType2};
        }

        public static UpdateType valueOf(String str) {
            return (UpdateType) Enum.valueOf(UpdateType.class, str);
        }

        public static UpdateType[] values() {
            return (UpdateType[]) $VALUES.clone();
        }
    }

    public AppNavigateSelectVersionUpdateOption(UpdateType updateType, Option option) {
        this.update_type = updateType;
        this.option = option;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "App", "cdf_action", "Navigate");
        Countries.putSafe(m, "update_type", updateType);
        Countries.putSafe(m, "option", option);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNavigateSelectVersionUpdateOption)) {
            return false;
        }
        AppNavigateSelectVersionUpdateOption appNavigateSelectVersionUpdateOption = (AppNavigateSelectVersionUpdateOption) obj;
        return this.update_type == appNavigateSelectVersionUpdateOption.update_type && this.option == appNavigateSelectVersionUpdateOption.option;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "App Navigate SelectVersionUpdateOption";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.option.hashCode() + (this.update_type.hashCode() * 31);
    }

    public final String toString() {
        return "AppNavigateSelectVersionUpdateOption(update_type=" + this.update_type + ", option=" + this.option + ")";
    }
}
