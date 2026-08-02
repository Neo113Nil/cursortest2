package com.squareup.cash.prepurchasecashcard.backend;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealPrepurchaseCashCardRepository {
    public final Version appVersion;
    public final ErrorReporter errorReporter;
    public final LendingAppService lendingAppService;
    public final SyncValueReader syncValueReader;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/prepurchasecashcard/backend/RealPrepurchaseCashCardRepository$MultipleCardsEntryPointData", "Lcom/squareup/cash/observability/types/ReportedError;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* data */ class MultipleCardsEntryPointData extends ReportedError {
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.PrepurchaseCashCard.INSTANCE);
        public final String message;
        public final ArrayList supportedEntryPoints;

        public MultipleCardsEntryPointData(ArrayList arrayList) {
            this.supportedEntryPoints = arrayList;
            this.message = "Multiple matching PrepurchaseCashCardAppletData: " + arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleCardsEntryPointData) && Intrinsics.areEqual(this.supportedEntryPoints, ((MultipleCardsEntryPointData) obj).supportedEntryPoints);
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
            return this.supportedEntryPoints.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("MultipleCardsEntryPointData(supportedEntryPoints=", ")", this.supportedEntryPoints);
        }
    }

    public RealPrepurchaseCashCardRepository(SyncValueReader syncValueReader, LendingAppService lendingAppService, ErrorReporter errorReporter, String str) {
        this.syncValueReader = syncValueReader;
        this.lendingAppService = lendingAppService;
        this.errorReporter = errorReporter;
        Version decode = Strings.decode(str);
        decode.getClass();
        this.appVersion = decode;
    }
}
