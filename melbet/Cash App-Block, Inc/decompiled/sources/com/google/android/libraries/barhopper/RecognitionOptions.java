package com.google.android.libraries.barhopper;

/* loaded from: classes4.dex */
public class RecognitionOptions {
    private int barcodeFormats = 0;
    private boolean outputUnrecognizedBarcodes = false;
    private boolean useQrMobilenetV3 = false;
    private boolean enableQrAlignmentGrid = true;
    private boolean enableUseKeypointAsFinderPattern = true;
    private boolean useHalideAffineCrop = false;
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
    private boolean qrEnableFourthCornerApproximation = false;

    public final void setBarcodeFormats(int i) {
        this.barcodeFormats = i;
    }

    public final void setEnableQrAlignmentGrid() {
        this.enableQrAlignmentGrid = true;
    }

    public final void setEnableUseKeypointAsFinderPattern() {
        this.enableUseKeypointAsFinderPattern = true;
    }

    public final void setMultiScaleDecodingOptions(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public final void setMultiScaleDetectionOptions(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public final void setOutputUnrecognizedBarcodes(boolean z) {
        this.outputUnrecognizedBarcodes = z;
    }

    public final void setQrEnableFourthCornerApproximation(boolean z) {
        this.qrEnableFourthCornerApproximation = z;
    }
}
