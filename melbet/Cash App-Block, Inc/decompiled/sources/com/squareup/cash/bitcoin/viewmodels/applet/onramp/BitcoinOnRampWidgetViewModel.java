package com.squareup.cash.bitcoin.viewmodels.applet.onramp;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinOnRampWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final List options;

    public BitcoinOnRampWidgetViewModel(List list) {
        list.getClass();
        this.options = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinOnRampWidgetViewModel) && Intrinsics.areEqual(this.options, ((BitcoinOnRampWidgetViewModel) obj).options);
    }

    public final int hashCode() {
        return this.options.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("BitcoinOnRampWidgetViewModel(options=", ")", this.options);
    }
}
