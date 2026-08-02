package com.squareup.cash.bitcoin.formatter;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* loaded from: classes5.dex */
public abstract class RealBitcoinFormatterKt {
    public static final DecimalFormat SATS_FORMAT_DEFAULT;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###,###,###,###");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        SATS_FORMAT_DEFAULT = decimalFormat;
    }
}
