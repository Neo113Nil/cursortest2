package com.squareup.cash.clientrouting.analytics;

import com.datadog.android.rum.model.ViewEvent;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.protos.franklin.app.AppCreationActivity;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RouteAnalyticsParams$ViewPayCashtagAnalyticsParams extends ViewEvent.Companion {
    public final AppCreationActivity appCreationActivity;
    public final UUID externalId;

    public RouteAnalyticsParams$ViewPayCashtagAnalyticsParams(AppCreationActivity appCreationActivity, UUID uuid) {
        Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
        appCreationActivity.getClass();
        uuid.getClass();
        this.appCreationActivity = appCreationActivity;
        this.externalId = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAnalyticsParams$ViewPayCashtagAnalyticsParams)) {
            return false;
        }
        RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams = (RouteAnalyticsParams$ViewPayCashtagAnalyticsParams) obj;
        if (this.appCreationActivity != routeAnalyticsParams$ViewPayCashtagAnalyticsParams.appCreationActivity || !Intrinsics.areEqual(this.externalId, routeAnalyticsParams$ViewPayCashtagAnalyticsParams.externalId)) {
            return false;
        }
        Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
        return true;
    }

    public final int hashCode() {
        return (Origin.PROFILE_DIRECTORY.hashCode() + ((this.externalId.hashCode() + (this.appCreationActivity.hashCode() * 31)) * 31)) * (-1796951359);
    }

    public final String toString() {
        return "ViewPayCashtagAnalyticsParams(appCreationActivity=" + this.appCreationActivity + ", externalId=" + this.externalId + ", origin=" + Origin.PROFILE_DIRECTORY + ", suggestionStrategy=null, sectionId=null, section=null, sectionIndex=null, sectionTotal=null, searchTextLength=null, searchType=null, matchedAliasLength=null, remoteSuggestionType=null, absoluteIndex=null)";
    }
}
