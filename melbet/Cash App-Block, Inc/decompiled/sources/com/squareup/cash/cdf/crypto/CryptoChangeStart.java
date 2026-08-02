package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoChangeStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Setting setting;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Setting {
        public static final /* synthetic */ Setting[] $VALUES;
        public static final Setting DISPLAY_CURRENCY;
        public static final Setting LIMITS;
        public static final Setting PRICE_ALERTS;

        static {
            Setting setting = new Setting("DISPLAY_CURRENCY", 0);
            DISPLAY_CURRENCY = setting;
            Setting setting2 = new Setting("PRICE_ALERTS", 1);
            PRICE_ALERTS = setting2;
            Setting setting3 = new Setting("LIMITS", 2);
            LIMITS = setting3;
            $VALUES = new Setting[]{setting, setting2, setting3};
        }

        public static Setting valueOf(String str) {
            return (Setting) Enum.valueOf(Setting.class, str);
        }

        public static Setting[] values() {
            return (Setting[]) $VALUES.clone();
        }
    }

    public CryptoChangeStart(Setting setting) {
        this.setting = setting;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Change");
        Countries.putSafe(m, "setting", setting);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoChangeStart) && this.setting == ((CryptoChangeStart) obj).setting;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Change Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.setting.hashCode();
    }

    public final String toString() {
        return "CryptoChangeStart(setting=" + this.setting + ")";
    }
}
