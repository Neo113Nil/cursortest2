package com.squareup.cash.shortcut;

import com.google.zxing.BinaryBitmap;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public final class BitcoinShortcutBuilder {
    public final BinaryBitmap deepLinkFormatter;
    public final KClass mainActivityClass;

    public BitcoinShortcutBuilder(BinaryBitmap binaryBitmap, KClass kClass) {
        kClass.getClass();
        this.deepLinkFormatter = binaryBitmap;
        this.mainActivityClass = kClass;
    }
}
