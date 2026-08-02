package com.squareup.cash.onboarding.accountpicker.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AccountPickerOptionsMenuViewModel {
    public final List options;

    public final class Option {
        public final String label;
        public final int optionId;

        public Option(int i, String str) {
            str.getClass();
            this.optionId = i;
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return this.optionId == option.optionId && Intrinsics.areEqual(this.label, option.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (Integer.hashCode(this.optionId) * 31);
        }

        public final String toString() {
            return "Option(optionId=" + this.optionId + ", label=" + this.label + ")";
        }
    }

    public AccountPickerOptionsMenuViewModel(List list) {
        list.getClass();
        this.options = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountPickerOptionsMenuViewModel) && Intrinsics.areEqual(this.options, ((AccountPickerOptionsMenuViewModel) obj).options);
    }

    public final int hashCode() {
        return this.options.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AccountPickerOptionsMenuViewModel(options=", ")", this.options);
    }
}
