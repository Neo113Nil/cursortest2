package com.squareup.cash.clientrouting.analytics;

import com.datadog.android.rum.model.ViewEvent;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams extends ViewEvent.Companion {
    public final GetProfileDetailsContext currentFlow;
    public final UUID externalId;
    public final String queryToken;
    public final UUID searchToken;

    public RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams(UUID uuid, GetProfileDetailsContext getProfileDetailsContext, UUID uuid2, String str) {
        uuid.getClass();
        getProfileDetailsContext.getClass();
        this.externalId = uuid;
        this.currentFlow = getProfileDetailsContext;
        this.searchToken = uuid2;
        this.queryToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams)) {
            return false;
        }
        RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams routeAnalyticsParams$ViewCustomerProfileAnalyticsParams = (RouteAnalyticsParams$ViewCustomerProfileAnalyticsParams) obj;
        return Intrinsics.areEqual(this.externalId, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.externalId) && this.currentFlow == routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.currentFlow && Intrinsics.areEqual(this.searchToken, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.searchToken) && Intrinsics.areEqual(this.queryToken, routeAnalyticsParams$ViewCustomerProfileAnalyticsParams.queryToken);
    }

    public final int hashCode() {
        int hashCode = (this.currentFlow.hashCode() + (this.externalId.hashCode() * 31)) * (-505558625);
        UUID uuid = this.searchToken;
        int hashCode2 = (hashCode + (uuid == null ? 0 : uuid.hashCode())) * 961;
        String str = this.queryToken;
        return (hashCode2 + (str != null ? str.hashCode() : 0)) * 28629151;
    }

    public final String toString() {
        return "ViewCustomerProfileAnalyticsParams(externalId=" + this.externalId + ", currentFlow=" + this.currentFlow + ", entryPoint=null, suggestionStrategy=null, sectionId=null, section=null, sectionIndex=null, sectionTotal=null, searchTextLength=null, searchType=null, matchedAliasLength=null, remoteSuggestionType=null, absoluteIndex=null, genericCDFEventParameters=null, searchToken=" + this.searchToken + ", matchedFields=null, queryToken=" + this.queryToken + ", contactStatus=null, isC4bBusiness=null, isMultipleAccountHolder=null, isFirstLinkedAccount=null, accountHolderToken=null)";
    }
}
