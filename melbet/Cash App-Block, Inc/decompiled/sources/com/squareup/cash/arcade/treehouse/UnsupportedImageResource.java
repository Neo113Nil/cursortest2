package com.squareup.cash.arcade.treehouse;

import app.cash.arcade.values.ImageResource;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/arcade/treehouse/UnsupportedImageResource;", "Lcom/squareup/cash/observability/types/ReportedError;", "treehouse"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class UnsupportedImageResource extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Treehouse.INSTANCE);
    public final String message;

    public UnsupportedImageResource(ImageResource imageResource) {
        this.message = "Cannot render " + imageResource + ". Only ImageResource.Url are supported in RoundedRectBinding.";
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
