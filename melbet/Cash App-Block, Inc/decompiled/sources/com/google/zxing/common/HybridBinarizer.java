package com.google.zxing.common;

import com.google.zxing.LuminanceSource;

/* loaded from: classes4.dex */
public final class HybridBinarizer {
    public static final byte[] EMPTY = new byte[0];
    public BitMatrix matrix;
    public final LuminanceSource source;
    public byte[] luminances = EMPTY;
    public final int[] buckets = new int[32];

    public HybridBinarizer(LuminanceSource luminanceSource) {
        this.source = luminanceSource;
    }
}
