package com.squareup.cash.borrow.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.PayloadWithMetadata;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError;", "Lcom/squareup/cash/observability/types/ReportedError;", "NoTiles", "UnexpectedConfettiDisplayEffect", "MissingEntryPointV2", "UnexpectedLegacyRowEntryPoint", "NoLimitHubSections", "TimelineTileIdentifierError", "Lcom/squareup/cash/borrow/backend/BorrowError$MissingEntryPointV2;", "Lcom/squareup/cash/borrow/backend/BorrowError$NoLimitHubSections;", "Lcom/squareup/cash/borrow/backend/BorrowError$NoTiles;", "Lcom/squareup/cash/borrow/backend/BorrowError$TimelineTileIdentifierError;", "Lcom/squareup/cash/borrow/backend/BorrowError$UnexpectedConfettiDisplayEffect;", "Lcom/squareup/cash/borrow/backend/BorrowError$UnexpectedLegacyRowEntryPoint;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BorrowError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Borrow.INSTANCE);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$MissingEntryPointV2;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingEntryPointV2 extends BorrowError {
        public final String message = "Missing entry_point_v2";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingEntryPointV2) && Intrinsics.areEqual(this.message, ((MissingEntryPointV2) obj).message);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MissingEntryPointV2(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$NoLimitHubSections;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoLimitHubSections extends BorrowError {
        public final boolean hasLimitHubData;
        public final Map metadata;

        public NoLimitHubSections(boolean z) {
            this.hasLimitHubData = z;
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Borrow", MapsKt__MapsJVMKt.mapOf(new Pair("hasLimitHubData", Boolean.valueOf(z))));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoLimitHubSections) && this.hasLimitHubData == ((NoLimitHubSections) obj).hasLimitHubData;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasLimitHubData);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("NoLimitHubSections(hasLimitHubData=", ")", this.hasLimitHubData);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$NoTiles;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoTiles extends BorrowError {
        public final boolean hasBorrowData;
        public final Map metadata;

        public NoTiles(boolean z) {
            this.hasBorrowData = z;
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Borrow", MapsKt__MapsJVMKt.mapOf(new Pair("hasBorrowData", Boolean.valueOf(z))));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoTiles) && this.hasBorrowData == ((NoTiles) obj).hasBorrowData;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasBorrowData);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("NoTiles(hasBorrowData=", ")", this.hasBorrowData);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$TimelineTileIdentifierError;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimelineTileIdentifierError extends BorrowError {
        public final String identifier;
        public final int matchingTiles;
        public final String message;
        public final Map metadata;

        public TimelineTileIdentifierError(String str, int i) {
            str.getClass();
            this.identifier = str;
            this.matchingTiles = i;
            this.message = "Expected to find 1 timeline tile with identifier '" + str + "', but found " + i;
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Borrow", Thread$State$EnumUnboxingLocalUtility.m("identifier", str));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimelineTileIdentifierError)) {
                return false;
            }
            TimelineTileIdentifierError timelineTileIdentifierError = (TimelineTileIdentifierError) obj;
            return Intrinsics.areEqual(this.identifier, timelineTileIdentifierError.identifier) && this.matchingTiles == timelineTileIdentifierError.matchingTiles;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return Integer.hashCode(this.matchingTiles) + (this.identifier.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m("TimelineTileIdentifierError(identifier=", this.matchingTiles, this.identifier, ", matchingTiles=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$UnexpectedConfettiDisplayEffect;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedConfettiDisplayEffect extends BorrowError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnexpectedConfettiDisplayEffect);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedConfettiDisplayEffect(message=null)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/backend/BorrowError$UnexpectedLegacyRowEntryPoint;", "Lcom/squareup/cash/borrow/backend/BorrowError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedLegacyRowEntryPoint extends BorrowError {
        public final PayloadWithMetadata borrowDataPayload;
        public final String message;
        public final Map metadata;

        public UnexpectedLegacyRowEntryPoint(PayloadWithMetadata payloadWithMetadata) {
            payloadWithMetadata.getClass();
            this.borrowDataPayload = payloadWithMetadata;
            this.message = "Unexpected row_entry_point_v2 sent for Borrow Applet";
            Object obj = payloadWithMetadata.value;
            String simpleName = obj instanceof BorrowData ? "personal-borrow-data" : obj instanceof GlobalBorrowData ? "global-borrow-data" : obj.getClass().getSimpleName();
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Borrow", MapsKt__MapsKt.mapOf(new Pair(simpleName.concat("-entity-id"), payloadWithMetadata.entityId), new Pair(simpleName.concat("-version"), payloadWithMetadata.entityVersion)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedLegacyRowEntryPoint) && Intrinsics.areEqual(this.borrowDataPayload, ((UnexpectedLegacyRowEntryPoint) obj).borrowDataPayload);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return this.borrowDataPayload.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedLegacyRowEntryPoint(borrowDataPayload=" + this.borrowDataPayload + ")";
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
