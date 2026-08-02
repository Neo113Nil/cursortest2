package com.squareup.cash.crypto.address;

import com.squareup.cash.multiplatform.bitcoin.parsers.RealLightningInvoiceParser;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class BitcoinMultiplatformParserModule$ProvideLightningInvoiceParserMetroFactory implements Factory {
    public static final BitcoinMultiplatformParserModule$ProvideLightningInvoiceParserMetroFactory INSTANCE = new BitcoinMultiplatformParserModule$ProvideLightningInvoiceParserMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RealLightningInvoiceParser();
    }
}
