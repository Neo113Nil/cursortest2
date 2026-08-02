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
public final class BorrowAppletViewLoanAmountPicker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String recommended_amounts;

    public BorrowAppletViewLoanAmountPicker(String str, String str2) {
        this.flow_token = str;
        this.recommended_amounts = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BorrowApplet", "cdf_action", "View");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "recommended_amounts", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowAppletViewLoanAmountPicker)) {
            return false;
        }
        BorrowAppletViewLoanAmountPicker borrowAppletViewLoanAmountPicker = (BorrowAppletViewLoanAmountPicker) obj;
        return Intrinsics.areEqual(this.flow_token, borrowAppletViewLoanAmountPicker.flow_token) && this.recommended_amounts.equals(borrowAppletViewLoanAmountPicker.recommended_amounts);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BorrowApplet View LoanAmountPicker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.recommended_amounts.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BorrowAppletViewLoanAmountPicker(flow_token=", this.flow_token, ", recommended_amounts=", this.recommended_amounts, ")");
    }
}
