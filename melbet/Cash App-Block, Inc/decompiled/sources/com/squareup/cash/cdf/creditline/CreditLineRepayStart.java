package com.squareup.cash.cdf.creditline;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CreditLineRepayStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
    public final LinkedHashMap parameters;
    public final String transaction_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoanRepaySource {
        public static final /* synthetic */ LoanRepaySource[] $VALUES;
        public static final LoanRepaySource ACTIVITY;

        /* JADX INFO: Fake field, exist only in values array */
        LoanRepaySource EF0;

        static {
            LoanRepaySource loanRepaySource = new LoanRepaySource("CREDIT_LINE_DETAILS", 0);
            LoanRepaySource loanRepaySource2 = new LoanRepaySource("LOAN_DETAILS", 1);
            LoanRepaySource loanRepaySource3 = new LoanRepaySource("ACTIVITY", 2);
            ACTIVITY = loanRepaySource3;
            $VALUES = new LoanRepaySource[]{loanRepaySource, loanRepaySource2, loanRepaySource3, new LoanRepaySource("BNPL", 3)};
        }

        public static LoanRepaySource valueOf(String str) {
            return (LoanRepaySource) Enum.valueOf(LoanRepaySource.class, str);
        }

        public static LoanRepaySource[] values() {
            return (LoanRepaySource[]) $VALUES.clone();
        }
    }

    public CreditLineRepayStart(String str) {
        LoanRepaySource loanRepaySource = LoanRepaySource.ACTIVITY;
        this.transaction_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CreditLine", "cdf_action", "Repay");
        Countries.putSafe(m, "source", loanRepaySource);
        Countries.putSafe(m, "transaction_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditLineRepayStart)) {
            return false;
        }
        LoanRepaySource loanRepaySource = LoanRepaySource.ACTIVITY;
        return this.transaction_token.equals(((CreditLineRepayStart) obj).transaction_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CreditLine Repay Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.transaction_token.hashCode() + (LoanRepaySource.ACTIVITY.hashCode() * 29791);
    }

    public final String toString() {
        return "CreditLineRepayStart(state=null, source=" + LoanRepaySource.ACTIVITY + ", loan_token=null, credit_line_token=null, transaction_token=" + this.transaction_token + ")";
    }
}
