package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class AlignmentPattern extends ResultPoint {
    public final float estimatedModuleSize;

    public AlignmentPattern(float f, float f2, float f3) {
        super(f, f2);
        this.estimatedModuleSize = f3;
    }
}
