package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes4.dex */
public final class FinderPattern extends ResultPoint {
    public final int count;
    public final float estimatedModuleSize;

    public FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.estimatedModuleSize = f3;
        this.count = i;
    }
}
