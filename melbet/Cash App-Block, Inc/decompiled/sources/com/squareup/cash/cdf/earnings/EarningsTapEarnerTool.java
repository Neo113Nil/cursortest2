package com.squareup.cash.cdf.earnings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class EarningsTapEarnerTool implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final EarnerTool tool;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EarnerTool {
        public static final /* synthetic */ EarnerTool[] $VALUES;
        public static final EarnerTool ADD_PAYCHECK;
        public static final EarnerTool EARNER_MODE;
        public static final EarnerTool MANAGE_CUSTOMERS;
        public static final EarnerTool ONBOARDING;
        public static final EarnerTool PAYCHECK_DISTRIBUTION;

        static {
            EarnerTool earnerTool = new EarnerTool("ONBOARDING", 0);
            ONBOARDING = earnerTool;
            EarnerTool earnerTool2 = new EarnerTool("ADD_PAYCHECK", 1);
            ADD_PAYCHECK = earnerTool2;
            EarnerTool earnerTool3 = new EarnerTool("PAYCHECK_DISTRIBUTION", 2);
            PAYCHECK_DISTRIBUTION = earnerTool3;
            EarnerTool earnerTool4 = new EarnerTool("EARNER_MODE", 3);
            EARNER_MODE = earnerTool4;
            EarnerTool earnerTool5 = new EarnerTool("MANAGE_CUSTOMERS", 4);
            MANAGE_CUSTOMERS = earnerTool5;
            $VALUES = new EarnerTool[]{earnerTool, earnerTool2, earnerTool3, earnerTool4, earnerTool5};
        }

        public static EarnerTool valueOf(String str) {
            return (EarnerTool) Enum.valueOf(EarnerTool.class, str);
        }

        public static EarnerTool[] values() {
            return (EarnerTool[]) $VALUES.clone();
        }
    }

    public EarningsTapEarnerTool(EarnerTool earnerTool) {
        this.tool = earnerTool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Earnings", "cdf_action", "Tap");
        Countries.putSafe(m, "tool", earnerTool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsTapEarnerTool) && this.tool == ((EarningsTapEarnerTool) obj).tool;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings Tap EarnerTool";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.tool.hashCode();
    }

    public final String toString() {
        return "EarningsTapEarnerTool(tool=" + this.tool + ")";
    }
}
