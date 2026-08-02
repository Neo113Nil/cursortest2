package com.squareup.cash.bitcoin.viewmodels.applet.buttons;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinTradeButtonsWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final List buttons;

    public BitcoinTradeButtonsWidgetViewModel(List list) {
        list.getClass();
        this.buttons = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinTradeButtonsWidgetViewModel) && Intrinsics.areEqual(this.buttons, ((BitcoinTradeButtonsWidgetViewModel) obj).buttons);
    }

    public final int hashCode() {
        return this.buttons.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("BitcoinTradeButtonsWidgetViewModel(buttons=", ")", this.buttons);
    }
}
