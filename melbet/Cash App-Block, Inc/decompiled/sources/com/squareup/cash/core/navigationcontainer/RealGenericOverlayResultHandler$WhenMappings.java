package com.squareup.cash.core.navigationcontainer;

import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealGenericOverlayResultHandler$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[HistoryScreens.SelectPaymentInstrument.NextScreen.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            HistoryScreens.SelectPaymentInstrument.NextScreen nextScreen = HistoryScreens.SelectPaymentInstrument.NextScreen.PASSCODE;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            HistoryScreens.SelectPaymentInstrument.NextScreen nextScreen2 = HistoryScreens.SelectPaymentInstrument.NextScreen.PASSCODE;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SelectPaymentInstrumentResult.Status.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            SelectPaymentInstrumentResult.Status status = SelectPaymentInstrumentResult.Status.SUCCESS;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
