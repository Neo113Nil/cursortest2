package com.squareup.cash.cdf.borrowapplet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BorrowAppletViewLoanDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String loan_token;
    public final LinkedHashMap parameters;
    public final String variant;

    public BorrowAppletViewLoanDetails(String str, String str2) {
        this.variant = str;
        this.loan_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BorrowApplet", "cdf_action", "View");
        Countries.putSafe(m, "variant", str);
        Countries.putSafe(m, "loan_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowAppletViewLoanDetails)) {
            return false;
        }
        BorrowAppletViewLoanDetails borrowAppletViewLoanDetails = (BorrowAppletViewLoanDetails) obj;
        return Intrinsics.areEqual(this.variant, borrowAppletViewLoanDetails.variant) && Intrinsics.areEqual(this.loan_token, borrowAppletViewLoanDetails.loan_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet View LoanDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.variant;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loan_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BorrowAppletViewLoanDetails(variant=", this.variant, ", loan_token=", this.loan_token, ")");
    }
}
