package com.squareup.cash.cdf.autoreload;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AutoReloadSettingsSettingViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Source source;

    /* renamed from: type, reason: collision with root package name */
    public final ReloadType f1069type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ReloadType {
        public static final /* synthetic */ ReloadType[] $VALUES;
        public static final ReloadType BALANCED_BASED;
        public static final ReloadType SCHEDULED;

        static {
            ReloadType reloadType = new ReloadType("SCHEDULED", 0);
            SCHEDULED = reloadType;
            ReloadType reloadType2 = new ReloadType("BALANCED_BASED", 1);
            BALANCED_BASED = reloadType2;
            $VALUES = new ReloadType[]{reloadType, reloadType2};
        }

        public static ReloadType valueOf(String str) {
            return (ReloadType) Enum.valueOf(ReloadType.class, str);
        }

        public static ReloadType[] values() {
            return (ReloadType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source PROFILE;
        public static final Source SYNC_VALUE;

        static {
            Source source = new Source("PROFILE", 0);
            PROFILE = source;
            Source source2 = new Source("SYNC_VALUE", 1);
            SYNC_VALUE = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public AutoReloadSettingsSettingViewed(ReloadType reloadType, Source source) {
        this.f1069type = reloadType;
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "AutoReload", "cdf_action", "Settings");
        Countries.putSafe(m, "type", reloadType);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoReloadSettingsSettingViewed)) {
            return false;
        }
        AutoReloadSettingsSettingViewed autoReloadSettingsSettingViewed = (AutoReloadSettingsSettingViewed) obj;
        return this.f1069type == autoReloadSettingsSettingViewed.f1069type && this.source == autoReloadSettingsSettingViewed.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AutoReload Settings SettingViewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.f1069type.hashCode() * 31;
        Source source = this.source;
        return hashCode + (source == null ? 0 : source.hashCode());
    }

    public final String toString() {
        return "AutoReloadSettingsSettingViewed(type=" + this.f1069type + ", source=" + this.source + ")";
    }
}
