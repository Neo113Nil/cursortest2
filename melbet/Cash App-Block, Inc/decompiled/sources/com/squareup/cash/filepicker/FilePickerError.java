package com.squareup.cash.filepicker;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/filepicker/FilePickerError;", "Lcom/squareup/cash/observability/types/ReportedError;", "file-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FilePickerError extends ReportedError {
    public final Set features;
    public final String message;
    public final Map metadata;

    public FilePickerError(FilePickerResult.Failure failure) {
        failure.getClass();
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        this.message = "Unable to load selected system files via system file picker.";
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Selected File", MapsKt__MapsKt.mapOf(new Pair("result code", Integer.valueOf(failure.resultCode)), new Pair("uri", failure.uri)));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
