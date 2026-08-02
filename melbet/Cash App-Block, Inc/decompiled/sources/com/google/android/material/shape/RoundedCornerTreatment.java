package com.google.android.material.shape;

import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;

/* loaded from: classes4.dex */
public final class RoundedCornerTreatment extends ResToolsKt {
    @Override // com.withpersona.sdk2.inquiry.shared.ResToolsKt
    public final void getCornerPath(ShapePath shapePath, float f, float f2) {
        float f3 = f2 * f;
        shapePath.reset(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        shapePath.addArc(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f4, f4, 180.0f, 90.0f);
    }
}
