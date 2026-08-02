package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface AtmPickerAmountBlockerViewModel {

    /* loaded from: classes5.dex */
    public final class AtmPicker implements AtmPickerAmountBlockerViewModel {
        public final AnimationDirection animationDirection;
        public final String buttonLabel;
        public final boolean hasRetreatAction;
        public final boolean isLoading;
        public final ArrayList options;
        public final String subtitle;
        public final String title;

        /* loaded from: classes4.dex */
        public final class KeypadOption implements Option {
            public static final KeypadOption INSTANCE = new KeypadOption();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof KeypadOption);
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final String getLabel() {
                return "…";
            }

            public final int hashCode() {
                return -1876116977;
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final boolean isEnabled() {
                return true;
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final boolean isSelected() {
                return false;
            }

            public final String toString() {
                return "KeypadOption";
            }
        }

        public interface Option {
            String getLabel();

            boolean isEnabled();

            boolean isSelected();
        }

        /* loaded from: classes4.dex */
        public final class PresetAmountOption implements Option {
            public final boolean isEnabled;
            public final boolean isSelected;
            public final String label;

            public PresetAmountOption(String str, boolean z, boolean z2) {
                str.getClass();
                this.label = str;
                this.isEnabled = z;
                this.isSelected = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PresetAmountOption)) {
                    return false;
                }
                PresetAmountOption presetAmountOption = (PresetAmountOption) obj;
                return Intrinsics.areEqual(this.label, presetAmountOption.label) && this.isEnabled == presetAmountOption.isEnabled && this.isSelected == presetAmountOption.isSelected;
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final String getLabel() {
                return this.label;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isSelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.isEnabled);
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final boolean isEnabled() {
                return this.isEnabled;
            }

            @Override // com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel.AtmPicker.Option
            public final boolean isSelected() {
                return this.isSelected;
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("PresetAmountOption(label=", this.label, ", isEnabled=", ", isSelected=", this.isEnabled), this.isSelected, ")");
            }
        }

        public AtmPicker(String str, String str2, ArrayList arrayList, String str3, boolean z, boolean z2, AnimationDirection animationDirection) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.options = arrayList;
            this.buttonLabel = str3;
            this.isLoading = z;
            this.hasRetreatAction = z2;
            this.animationDirection = animationDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtmPicker)) {
                return false;
            }
            AtmPicker atmPicker = (AtmPicker) obj;
            return Intrinsics.areEqual(this.title, atmPicker.title) && Intrinsics.areEqual(this.subtitle, atmPicker.subtitle) && this.options.equals(atmPicker.options) && Intrinsics.areEqual(this.buttonLabel, atmPicker.buttonLabel) && this.isLoading == atmPicker.isLoading && this.hasRetreatAction == atmPicker.hasRetreatAction && this.animationDirection == atmPicker.animationDirection;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            return this.animationDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.buttonLabel), 31, this.isLoading), 31, this.hasRetreatAction);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AtmPicker(title=", this.title, ", subtitle=", this.subtitle, ", options=");
            m.append(this.options);
            m.append(", buttonLabel=");
            m.append(this.buttonLabel);
            m.append(", isLoading=");
            re$$ExternalSyntheticOutline0.m(m, this.isLoading, ", hasRetreatAction=", this.hasRetreatAction, ", animationDirection=");
            m.append(this.animationDirection);
            m.append(")");
            return m.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class KeypadPicker implements AtmPickerAmountBlockerViewModel {
        public final AnimationDirection animationDirection;
        public final String buttonLabel;
        public final boolean hasRetreatAction;
        public final boolean isLoading;
        public final Money maxAmount;
        public final Money minAmount;
        public final String subtitle;
        public final String title;

        public KeypadPicker(String str, String str2, String str3, boolean z, Money money, Money money2, boolean z2, AnimationDirection animationDirection) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.isLoading = z;
            this.minAmount = money;
            this.maxAmount = money2;
            this.hasRetreatAction = z2;
            this.animationDirection = animationDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeypadPicker)) {
                return false;
            }
            KeypadPicker keypadPicker = (KeypadPicker) obj;
            return Intrinsics.areEqual(this.title, keypadPicker.title) && Intrinsics.areEqual(this.subtitle, keypadPicker.subtitle) && Intrinsics.areEqual(this.buttonLabel, keypadPicker.buttonLabel) && this.isLoading == keypadPicker.isLoading && Intrinsics.areEqual(this.minAmount, keypadPicker.minAmount) && Intrinsics.areEqual(this.maxAmount, keypadPicker.maxAmount) && this.hasRetreatAction == keypadPicker.hasRetreatAction && this.animationDirection == keypadPicker.animationDirection;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttonLabel), 31, this.isLoading);
            Money money = this.minAmount;
            int hashCode2 = (m + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.maxAmount;
            return this.animationDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 31, 31, this.hasRetreatAction);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeypadPicker(title=", this.title, ", subtitle=", this.subtitle, ", buttonLabel=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.buttonLabel, ", isLoading=", this.isLoading, ", minAmount=");
            m.append(this.minAmount);
            m.append(", maxAmount=");
            m.append(this.maxAmount);
            m.append(", hasRetreatAction=");
            m.append(this.hasRetreatAction);
            m.append(", animationDirection=");
            m.append(this.animationDirection);
            m.append(")");
            return m.toString();
        }
    }
}
