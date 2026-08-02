package com.squareup.cash.arcade.components.timeline;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/arcade/components/timeline/OverlappingCollapseRangesError;", "Lcom/squareup/cash/observability/types/ReportedError;", "components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OverlappingCollapseRangesError extends ReportedError {
    public final ArrayList customLabels;

    public OverlappingCollapseRangesError(ArrayList arrayList) {
        this.customLabels = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverlappingCollapseRangesError) && Intrinsics.areEqual(this.customLabels, ((OverlappingCollapseRangesError) obj).customLabels);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return SetsKt__SetsJVMKt.setOf(ErrorFeature.DesignSystems.INSTANCE);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "CollapseRanges were merged due to overlapping or consecutive ranges. Custom labels were dropped if provided: " + this.customLabels;
    }

    public final int hashCode() {
        return this.customLabels.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("OverlappingCollapseRangesError(customLabels=", ")", this.customLabels);
    }
}
