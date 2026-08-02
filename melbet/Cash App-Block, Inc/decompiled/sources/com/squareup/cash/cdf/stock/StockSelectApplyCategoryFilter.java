package com.squareup.cash.cdf.stock;

import com.knotapi.knot.utilities.BreadcrumbHelper;
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
public final class StockSelectApplyCategoryFilter implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String advanced;
    public final String category_name;
    public final LinkedHashMap parameters;
    public final String performance;
    public final String subcategories;

    public StockSelectApplyCategoryFilter(String str, String str2, String str3, String str4) {
        this.category_name = str;
        this.performance = str2;
        this.advanced = str3;
        this.subcategories = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "category_name", str);
        Countries.putSafe(m, BreadcrumbHelper.Category.PERFORMANCE, str2);
        Countries.putSafe(m, "advanced", str3);
        Countries.putSafe(m, "subcategories", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectApplyCategoryFilter)) {
            return false;
        }
        StockSelectApplyCategoryFilter stockSelectApplyCategoryFilter = (StockSelectApplyCategoryFilter) obj;
        return Intrinsics.areEqual(this.category_name, stockSelectApplyCategoryFilter.category_name) && Intrinsics.areEqual(this.performance, stockSelectApplyCategoryFilter.performance) && Intrinsics.areEqual(this.advanced, stockSelectApplyCategoryFilter.advanced) && Intrinsics.areEqual(this.subcategories, stockSelectApplyCategoryFilter.subcategories);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select ApplyCategoryFilter";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.category_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.performance;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advanced;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subcategories;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StockSelectApplyCategoryFilter(category_name=", this.category_name, ", performance=", this.performance, ", advanced="), this.advanced, ", subcategories=", this.subcategories, ")");
    }
}
