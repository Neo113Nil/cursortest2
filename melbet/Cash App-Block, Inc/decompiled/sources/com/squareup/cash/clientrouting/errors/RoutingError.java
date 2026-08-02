package com.squareup.cash.clientrouting.errors;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError;", "Lcom/squareup/cash/observability/types/ReportedError;", "DisallowedBTCxRoute", "InvalidDeeplinkCandidate", "ActivityNotFound", "UnsupportedRoute", "CashLiteBlockedRoute", "Lcom/squareup/cash/clientrouting/errors/RoutingError$ActivityNotFound;", "Lcom/squareup/cash/clientrouting/errors/RoutingError$CashLiteBlockedRoute;", "Lcom/squareup/cash/clientrouting/errors/RoutingError$DisallowedBTCxRoute;", "Lcom/squareup/cash/clientrouting/errors/RoutingError$InvalidDeeplinkCandidate;", "Lcom/squareup/cash/clientrouting/errors/RoutingError$UnsupportedRoute;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RoutingError extends ReportedError {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError$ActivityNotFound;", "Lcom/squareup/cash/clientrouting/errors/RoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityNotFound extends RoutingError {
        public final RoutingParams routingParams;
        public final String url;

        public ActivityNotFound(RoutingParams routingParams, String str) {
            str.getClass();
            routingParams.getClass();
            this.url = str;
            this.routingParams = routingParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityNotFound)) {
                return false;
            }
            ActivityNotFound activityNotFound = (ActivityNotFound) obj;
            return Intrinsics.areEqual(this.url, activityNotFound.url) && Intrinsics.areEqual(this.routingParams, activityNotFound.routingParams);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return Recorder$$ExternalSyntheticOutline2.m("Unable to find an activity to handle the URL: ", this.url);
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError
        public final RoutingParams getRoutingParams() {
            return this.routingParams;
        }

        public final int hashCode() {
            return this.routingParams.hashCode() + (this.url.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ActivityNotFound(url=" + this.url + ", routingParams=" + this.routingParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError$CashLiteBlockedRoute;", "Lcom/squareup/cash/clientrouting/errors/RoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CashLiteBlockedRoute extends RoutingError {
        public final ClientRoute route;
        public final RoutingParams routingParams;
        public final Set targets;

        public CashLiteBlockedRoute(ClientRoute clientRoute, RoutingParams routingParams) {
            clientRoute.getClass();
            routingParams.getClass();
            this.route = clientRoute;
            this.routingParams = routingParams;
            this.targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashLiteBlockedRoute)) {
                return false;
            }
            CashLiteBlockedRoute cashLiteBlockedRoute = (CashLiteBlockedRoute) obj;
            return Intrinsics.areEqual(this.route, cashLiteBlockedRoute.route) && Intrinsics.areEqual(this.routingParams, cashLiteBlockedRoute.routingParams);
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final String getGroupingDescriptor() {
            return this.route.getSpec().name;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Cash Lite blocked client route: ".concat(this.route.getSpec().name);
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError
        public final RoutingParams getRoutingParams() {
            return this.routingParams;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return this.targets;
        }

        public final int hashCode() {
            return this.routingParams.hashCode() + (this.route.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "CashLiteBlockedRoute(route=" + this.route + ", routingParams=" + this.routingParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError$DisallowedBTCxRoute;", "Lcom/squareup/cash/clientrouting/errors/RoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisallowedBTCxRoute extends RoutingError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisallowedBTCxRoute);
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError, com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return SetsKt___SetsKt.plus(SetsKt__SetsJVMKt.setOf(ErrorFeature.ClientRouting.INSTANCE), ErrorFeature.Bitcoin.INSTANCE);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError
        public final RoutingParams getRoutingParams() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "DisallowedBTCxRoute(route=null, routingParams=null)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError$InvalidDeeplinkCandidate;", "Lcom/squareup/cash/clientrouting/errors/RoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidDeeplinkCandidate extends RoutingError {
        public final RoutingParams routingParams;
        public final String url;

        public InvalidDeeplinkCandidate(RoutingParams routingParams, String str) {
            str.getClass();
            routingParams.getClass();
            this.url = str;
            this.routingParams = routingParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidDeeplinkCandidate)) {
                return false;
            }
            InvalidDeeplinkCandidate invalidDeeplinkCandidate = (InvalidDeeplinkCandidate) obj;
            return Intrinsics.areEqual(this.url, invalidDeeplinkCandidate.url) && Intrinsics.areEqual(this.routingParams, invalidDeeplinkCandidate.routingParams);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return Recorder$$ExternalSyntheticOutline2.m("Attempted to route URL which resembled a deep link but was in fact not, causing a deep link loop: ", this.url);
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError
        public final RoutingParams getRoutingParams() {
            return this.routingParams;
        }

        public final int hashCode() {
            return this.routingParams.hashCode() + (this.url.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidDeeplinkCandidate(url=" + this.url + ", routingParams=" + this.routingParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientrouting/errors/RoutingError$UnsupportedRoute;", "Lcom/squareup/cash/clientrouting/errors/RoutingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedRoute extends RoutingError {
        public final ClientRoute route;
        public final RoutingParams routingParams;

        public UnsupportedRoute(ClientRoute clientRoute, RoutingParams routingParams) {
            clientRoute.getClass();
            this.route = clientRoute;
            this.routingParams = routingParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsupportedRoute)) {
                return false;
            }
            UnsupportedRoute unsupportedRoute = (UnsupportedRoute) obj;
            return Intrinsics.areEqual(this.route, unsupportedRoute.route) && Intrinsics.areEqual(this.routingParams, unsupportedRoute.routingParams);
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final String getGroupingDescriptor() {
            return this.route.getSpec().name;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Unsupported client route: " + this.route;
        }

        @Override // com.squareup.cash.clientrouting.errors.RoutingError
        public final RoutingParams getRoutingParams() {
            return this.routingParams;
        }

        public final int hashCode() {
            return this.routingParams.hashCode() + (this.route.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnsupportedRoute(route=" + this.route + ", routingParams=" + this.routingParams + ")";
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.ClientRouting.INSTANCE);
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        RoutingParams routingParams = getRoutingParams();
        routingParams.getClass();
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("Routing", MapsKt__MapsKt.mapOf(new Pair("Flags", routingParams.flags), new Pair("Analytics Params", routingParams.analyticsParams), new Pair("Deep Link Metadata", routingParams.deepLinkMetadata), new Pair("Exit Screen", routingParams.exitScreen), new Pair("Origin", routingParams.origin), new Pair("Source", routingParams.source)));
    }

    public abstract RoutingParams getRoutingParams();
}
