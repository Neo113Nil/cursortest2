package com.squareup.cash.score.backend;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.clients.Version;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RealScoreRepository {
    public final Version appVersion;
    public final ErrorReporter errorReporter;
    public final SyncValueReader syncValueReader;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/score/backend/RealScoreRepository$MultipleScoreEntryPointsError", "Lcom/squareup/cash/observability/types/ReportedError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class MultipleScoreEntryPointsError extends ReportedError {
        public final ArrayList entryPoints;
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.CashCreditScore.INSTANCE);
        public final String message;

        public MultipleScoreEntryPointsError(ArrayList arrayList) {
            this.entryPoints = arrayList;
            this.message = "Multiple matching CashCreditScoreEntryPointData: " + arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleScoreEntryPointsError) && Intrinsics.areEqual(this.entryPoints, ((MultipleScoreEntryPointsError) obj).entryPoints);
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.entryPoints.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("MultipleScoreEntryPointsError(entryPoints=", ")", this.entryPoints);
        }
    }

    public RealScoreRepository(SyncValueReader syncValueReader, ErrorReporter errorReporter, String str) {
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        Version decode = Strings.decode(str);
        decode.getClass();
        this.appVersion = decode;
    }

    public final RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1 cashCreditScoreEntryPointData() {
        return new RealScoreRepository$cashCreditScoreHomeData$$inlined$map$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashCreditScore), this, 1);
    }
}
