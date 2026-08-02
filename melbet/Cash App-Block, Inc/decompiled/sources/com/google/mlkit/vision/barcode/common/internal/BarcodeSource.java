package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.fillr.browsersdk.utilities.Obfuscator;

/* loaded from: classes4.dex */
public interface BarcodeSource {
    Rect getBoundingBox();

    Point[] getCornerPoints();

    int getFormat();

    String getRawValue();

    Obfuscator getUrl();

    int getValueType();
}
