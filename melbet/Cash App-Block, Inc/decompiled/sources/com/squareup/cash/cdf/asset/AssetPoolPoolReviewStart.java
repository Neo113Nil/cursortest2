package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AssetPoolPoolReviewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean has_comment;
    public final LinkedHashMap parameters;
    public final String pool_token;

    public AssetPoolPoolReviewStart(String str, String str2, Boolean bool) {
        this.pool_token = str;
        this.flow_token = str2;
        this.has_comment = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "pool_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_comment", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolPoolReviewStart)) {
            return false;
        }
        AssetPoolPoolReviewStart assetPoolPoolReviewStart = (AssetPoolPoolReviewStart) obj;
        return Intrinsics.areEqual(this.pool_token, assetPoolPoolReviewStart.pool_token) && Intrinsics.areEqual(this.flow_token, assetPoolPoolReviewStart.flow_token) && this.has_comment.equals(assetPoolPoolReviewStart.has_comment);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool PoolReviewStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.pool_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.has_comment.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetPoolPoolReviewStart(pool_token=", this.pool_token, ", flow_token=", this.flow_token, ", has_comment="), this.has_comment, ")");
    }
}
