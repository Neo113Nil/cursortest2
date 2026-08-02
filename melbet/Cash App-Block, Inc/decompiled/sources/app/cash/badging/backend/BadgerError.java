package app.cash.badging.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/cash/badging/backend/BadgerError;", "Lcom/squareup/cash/observability/types/ReportedError;", "NullBadgeCount", "Lapp/cash/badging/backend/BadgerError$NullBadgeCount;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
abstract class BadgerError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Badging.INSTANCE);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/badging/backend/BadgerError$NullBadgeCount;", "Lapp/cash/badging/backend/BadgerError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NullBadgeCount extends BadgerError {
        public static final NullBadgeCount INSTANCE = new NullBadgeCount();
        public static final String message = "Received a badge count response with null badge counts.";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NullBadgeCount);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return message;
        }

        public final int hashCode() {
            return -799138498;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NullBadgeCount";
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
