package com.squareup.cash.investing.viewmodels.categories;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingCategoryFilterViewEvent {

    public final class SelectDropDownOption implements InvestingCategoryFilterViewEvent {
        public final String sectionToken;
        public final String selectedOption;
        public final String token;

        public SelectDropDownOption(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.sectionToken = str2;
            this.selectedOption = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectDropDownOption)) {
                return false;
            }
            SelectDropDownOption selectDropDownOption = (SelectDropDownOption) obj;
            return Intrinsics.areEqual(this.token, selectDropDownOption.token) && Intrinsics.areEqual(this.sectionToken, selectDropDownOption.sectionToken) && this.selectedOption.equals(selectDropDownOption.selectedOption);
        }

        public final int hashCode() {
            return this.selectedOption.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.sectionToken);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectDropDownOption(token=", this.token, ", sectionToken=", this.sectionToken, ", selectedOption="), this.selectedOption, ")");
        }
    }

    public final class TapApply implements InvestingCategoryFilterViewEvent {
        public static final TapApply INSTANCE = new TapApply();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapApply);
        }

        public final int hashCode() {
            return 944081569;
        }

        public final String toString() {
            return "TapApply";
        }
    }

    public final class TapClose implements InvestingCategoryFilterViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return 945808683;
        }

        public final String toString() {
            return "TapClose";
        }
    }

    public final class TapReset implements InvestingCategoryFilterViewEvent {
        public static final TapReset INSTANCE = new TapReset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapReset);
        }

        public final int hashCode() {
            return 959456386;
        }

        public final String toString() {
            return "TapReset";
        }
    }

    public final class ToggleCheckboxOption implements InvestingCategoryFilterViewEvent {
        public final String sectionToken;
        public final boolean selected;
        public final String token;

        public ToggleCheckboxOption(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.sectionToken = str2;
            this.selected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleCheckboxOption)) {
                return false;
            }
            ToggleCheckboxOption toggleCheckboxOption = (ToggleCheckboxOption) obj;
            return Intrinsics.areEqual(this.token, toggleCheckboxOption.token) && Intrinsics.areEqual(this.sectionToken, toggleCheckboxOption.sectionToken) && this.selected == toggleCheckboxOption.selected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.selected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.sectionToken);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToggleCheckboxOption(token=", this.token, ", sectionToken=", this.sectionToken, ", selected="), this.selected, ")");
        }
    }
}
