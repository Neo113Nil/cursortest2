package com.squareup.cash.cdf.savingsfolder;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SavingsFolderManageViewActivity implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String payment_id;

    public SavingsFolderManageViewActivity(String str) {
        this.payment_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SavingsFolder", "cdf_action", "Manage");
        Countries.putSafe(m, "payment_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsFolderManageViewActivity) && Intrinsics.areEqual(this.payment_id, ((SavingsFolderManageViewActivity) obj).payment_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SavingsFolder Manage ViewActivity";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.payment_id;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SavingsFolderManageViewActivity(payment_id=", this.payment_id, ", dependent_customer_token=null)");
    }
}
