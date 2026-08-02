package com.squareup.cash.cdf.cashcard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashCardCustomizeClose implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final CustomizationType f1070type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CustomizationType {
        public static final /* synthetic */ CustomizationType[] $VALUES;
        public static final CustomizationType PERSONALIZATION;
        public static final CustomizationType STYLE;

        static {
            CustomizationType customizationType = new CustomizationType("PERSONALIZATION", 0);
            PERSONALIZATION = customizationType;
            CustomizationType customizationType2 = new CustomizationType("STYLE", 1);
            STYLE = customizationType2;
            $VALUES = new CustomizationType[]{customizationType, customizationType2};
        }

        public static CustomizationType valueOf(String str) {
            return (CustomizationType) Enum.valueOf(CustomizationType.class, str);
        }

        public static CustomizationType[] values() {
            return (CustomizationType[]) $VALUES.clone();
        }
    }

    public CashCardCustomizeClose(CustomizationType customizationType) {
        this.f1070type = customizationType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "type", customizationType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashCardCustomizeClose) && this.f1070type == ((CashCardCustomizeClose) obj).f1070type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize Close";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1070type.hashCode();
    }

    public final String toString() {
        return "CashCardCustomizeClose(type=" + this.f1070type + ")";
    }
}
