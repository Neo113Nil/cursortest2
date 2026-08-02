package com.squareup.cash.earningstracker.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsTimeframeSelectorSheetViewModel {
    public final List timeframeViewModels;

    public EarningsTimeframeSelectorSheetViewModel(List list) {
        list.getClass();
        this.timeframeViewModels = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsTimeframeSelectorSheetViewModel) && Intrinsics.areEqual(this.timeframeViewModels, ((EarningsTimeframeSelectorSheetViewModel) obj).timeframeViewModels);
    }

    public final int hashCode() {
        return this.timeframeViewModels.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("EarningsTimeframeSelectorSheetViewModel(timeframeViewModels=", ")", this.timeframeViewModels);
    }
}
