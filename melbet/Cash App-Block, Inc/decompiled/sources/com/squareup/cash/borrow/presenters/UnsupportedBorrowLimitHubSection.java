package com.squareup.cash.borrow.presenters;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/borrow/presenters/UnsupportedBorrowLimitHubSection;", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UnsupportedBorrowLimitHubSection extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Borrow.INSTANCE);
    public final String message;
    public final BorrowLimitHubData.Section section;

    public UnsupportedBorrowLimitHubSection(BorrowLimitHubData.Section section) {
        this.section = section;
        this.message = "Failed to create section from proto: " + section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnsupportedBorrowLimitHubSection) && Intrinsics.areEqual(this.section, ((UnsupportedBorrowLimitHubSection) obj).section);
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
        return this.section.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "UnsupportedBorrowLimitHubSection(section=" + this.section + ")";
    }
}
