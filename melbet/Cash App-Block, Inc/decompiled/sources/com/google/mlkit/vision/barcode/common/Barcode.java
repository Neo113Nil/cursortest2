package com.google.mlkit.vision.barcode.common;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;

/* loaded from: classes4.dex */
public final class Barcode {
    public final BarcodeSource zza;
    public final Rect zzb;
    public final Point[] zzc;

    public Barcode(BarcodeSource barcodeSource) {
        this.zza = barcodeSource;
        this.zzb = barcodeSource.getBoundingBox();
        this.zzc = barcodeSource.getCornerPoints();
    }
}
