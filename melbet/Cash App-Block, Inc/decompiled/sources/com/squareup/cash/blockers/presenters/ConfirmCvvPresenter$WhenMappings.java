package com.squareup.cash.blockers.presenters;

import com.squareup.protos.common.instrument.InstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ConfirmCvvPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[InstrumentType.values().length];
        try {
            iArr[InstrumentType.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstrumentType.MASTER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InstrumentType.AMERICAN_EXPRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
