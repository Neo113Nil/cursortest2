package com.squareup.cash.cdf.borrowapplet;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BorrowAppletViewBenefitLeaflet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BenefitType benefit_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BenefitType {
        public static final /* synthetic */ BenefitType[] $VALUES;
        public static final BenefitType INCREASED_BORROW_LIMIT;
        public static final BenefitType UNSPECIFIED;

        static {
            BenefitType benefitType = new BenefitType("UNSPECIFIED", 0);
            UNSPECIFIED = benefitType;
            BenefitType benefitType2 = new BenefitType("INCREASED_BORROW_LIMIT", 1);
            INCREASED_BORROW_LIMIT = benefitType2;
            $VALUES = new BenefitType[]{benefitType, benefitType2};
        }

        public static BenefitType valueOf(String str) {
            return (BenefitType) Enum.valueOf(BenefitType.class, str);
        }

        public static BenefitType[] values() {
            return (BenefitType[]) $VALUES.clone();
        }
    }

    public BorrowAppletViewBenefitLeaflet(BenefitType benefitType) {
        this.benefit_type = benefitType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BorrowApplet", "cdf_action", "View");
        Countries.putSafe(m, "benefit_type", benefitType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowAppletViewBenefitLeaflet) && this.benefit_type == ((BorrowAppletViewBenefitLeaflet) obj).benefit_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet View BenefitLeaflet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.benefit_type.hashCode();
    }

    public final String toString() {
        return "BorrowAppletViewBenefitLeaflet(benefit_type=" + this.benefit_type + ")";
    }
}
