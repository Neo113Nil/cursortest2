package com.google.android.libraries.barhopper;

/* loaded from: classes4.dex */
public final class MultiScaleDecodingOptions {
    private float[] extraScales = new float[0];
    private int minimumDetectedDimension = 10;
    private boolean skipProcessingIfBarcodeFound = true;

    public final void setExtraScales(float[] fArr) {
        this.extraScales = fArr;
    }

    public final void setMinimumDetectedDimension(int i) {
        this.minimumDetectedDimension = i;
    }

    public final void setSkipProcessingIfBarcodeFound(boolean z) {
        this.skipProcessingIfBarcodeFound = z;
    }
}
