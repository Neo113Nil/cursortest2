package com.squareup.cash.cdf.bankingbenefitshome;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BankingBenefitsHomeTapPrimaryCta implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PrimaryCtaType {
        public static final /* synthetic */ PrimaryCtaType[] $VALUES;
        public static final PrimaryCtaType Overdraft;

        static {
            PrimaryCtaType primaryCtaType = new PrimaryCtaType("Overdraft", 0);
            Overdraft = primaryCtaType;
            $VALUES = new PrimaryCtaType[]{primaryCtaType, new PrimaryCtaType("AddMoney", 1)};
        }

        public static PrimaryCtaType valueOf(String str) {
            return (PrimaryCtaType) Enum.valueOf(PrimaryCtaType.class, str);
        }

        public static PrimaryCtaType[] values() {
            return (PrimaryCtaType[]) $VALUES.clone();
        }
    }

    public BankingBenefitsHomeTapPrimaryCta() {
        PrimaryCtaType primaryCtaType = PrimaryCtaType.Overdraft;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BankingBenefitsHome", "cdf_action", "Tap");
        Countries.putSafe(m, "type", primaryCtaType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingBenefitsHomeTapPrimaryCta)) {
            return false;
        }
        PrimaryCtaType primaryCtaType = PrimaryCtaType.Overdraft;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BankingBenefitsHome Tap PrimaryCta";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return PrimaryCtaType.Overdraft.hashCode();
    }

    public final String toString() {
        return "BankingBenefitsHomeTapPrimaryCta(type=" + PrimaryCtaType.Overdraft + ")";
    }
}
