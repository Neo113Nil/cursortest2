package com.squareup.cash.graphics.views;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/graphics/views/GraphicsError;", "Lcom/squareup/cash/observability/types/ReportedError;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicsError extends ReportedError {
    public final Throwable cause;
    public final Set features;
    public final Set targets;

    public GraphicsError(Throwable th) {
        Set of = SetsKt__SetsJVMKt.setOf(ErrorFeature.Graphics.INSTANCE);
        Set set = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.LOGS, ReportedError.ErrorReportingTarget.BUGSNAG});
        of.getClass();
        set.getClass();
        this.cause = th;
        this.features = of;
        this.targets = set;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }
}
