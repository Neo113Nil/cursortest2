package com.google.android.material.shape;

import com.withpersona.sdk2.inquiry.shared.ResToolsKt;

/* loaded from: classes4.dex */
public final class CutCornerTreatment extends ResToolsKt {
    @Override // com.withpersona.sdk2.inquiry.shared.ResToolsKt
    public final void getCornerPath(ShapePath shapePath, float f, float f2) {
        float f3 = f2 * f;
        shapePath.reset(f3, 180.0f, 90.0f);
        double d = f3;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
