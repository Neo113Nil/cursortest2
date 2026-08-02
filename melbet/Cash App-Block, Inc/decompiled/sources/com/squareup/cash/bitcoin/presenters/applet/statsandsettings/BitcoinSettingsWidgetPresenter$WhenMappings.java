package com.squareup.cash.bitcoin.presenters.applet.statsandsettings;

import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BitcoinSettingsWidgetPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BitcoinDisplayUnits.values().length];
        try {
            iArr[BitcoinDisplayUnits.BITCOIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BitcoinDisplayUnits.SATOSHIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BitcoinDisplayUnits.BITCOIN_SYMBOL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
