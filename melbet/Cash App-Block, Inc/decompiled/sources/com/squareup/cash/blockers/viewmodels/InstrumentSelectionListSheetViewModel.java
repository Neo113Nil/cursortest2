package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.viewmodels.InstrumentOptionViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InstrumentSelectionListSheetViewModel {
    public final String closeButtonText;
    public final ArrayList options;
    public final String title;

    public final class Option {
        public final Integer clickId;
        public final InstrumentOptionViewModel model;

        public Option(Integer num, InstrumentOptionViewModel instrumentOptionViewModel) {
            this.clickId = num;
            this.model = instrumentOptionViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.areEqual(this.clickId, option.clickId) && this.model.equals(option.model);
        }

        public final int hashCode() {
            Integer num = this.clickId;
            return this.model.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "Option(clickId=" + this.clickId + ", model=" + this.model + ")";
        }
    }

    public InstrumentSelectionListSheetViewModel(String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.title = str;
        this.options = arrayList;
        this.closeButtonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionListSheetViewModel)) {
            return false;
        }
        InstrumentSelectionListSheetViewModel instrumentSelectionListSheetViewModel = (InstrumentSelectionListSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, instrumentSelectionListSheetViewModel.title) && this.options.equals(instrumentSelectionListSheetViewModel.options) && Intrinsics.areEqual(this.closeButtonText, instrumentSelectionListSheetViewModel.closeButtonText);
    }

    public final int hashCode() {
        String str = this.title;
        return this.closeButtonText.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.options, "InstrumentSelectionListSheetViewModel(title=", this.title, ", options=", ", closeButtonText="), this.closeButtonText, ")");
    }
}
