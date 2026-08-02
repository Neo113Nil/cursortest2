package com.squareup.cash.charting.components;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/charting/components/InvalidXAxisRange;", "Lcom/squareup/cash/observability/types/ReportedError;", "components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InvalidXAxisRange extends ReportedError {
    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "X-axis min " + RecyclerView.DECELERATION_RATE + " must be less than or equal to X-axis max " + RecyclerView.DECELERATION_RATE;
    }
}
