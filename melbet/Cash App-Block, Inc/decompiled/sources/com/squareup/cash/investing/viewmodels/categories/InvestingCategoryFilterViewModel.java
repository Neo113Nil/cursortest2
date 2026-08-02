package com.squareup.cash.investing.viewmodels.categories;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingCategoryFilterViewModel {

    public final class Content implements InvestingCategoryFilterViewModel {
        public final List filterSections;
        public final boolean isValid;
        public final String primaryButtonText;

        public interface FilterOption {

            public final class Checkbox implements FilterOption {
                public final String description;
                public final boolean selected;
                public final String title;
                public final String token;

                public Checkbox(String str, String str2, String str3, boolean z) {
                    str.getClass();
                    str2.getClass();
                    this.token = str;
                    this.title = str2;
                    this.description = str3;
                    this.selected = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Checkbox)) {
                        return false;
                    }
                    Checkbox checkbox = (Checkbox) obj;
                    return Intrinsics.areEqual(this.token, checkbox.token) && Intrinsics.areEqual(this.title, checkbox.title) && Intrinsics.areEqual(this.description, checkbox.description) && this.selected == checkbox.selected;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
                    String str = this.description;
                    return Boolean.hashCode(this.selected) + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Checkbox(token=", this.token, ", title=", this.title, ", description="), this.description, ", selected=", this.selected, ")");
                }
            }

            public final class Selection implements FilterOption {
                public final String placeholder;
                public final List selectableOptions;
                public final String selectedOption;
                public final String title;
                public final String token;

                public final class OptionRow {
                    public final String title;
                    public final String token;

                    public OptionRow(String str, String str2) {
                        this.token = str;
                        this.title = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof OptionRow)) {
                            return false;
                        }
                        OptionRow optionRow = (OptionRow) obj;
                        return this.token.equals(optionRow.token) && this.title.equals(optionRow.title);
                    }

                    public final int hashCode() {
                        return this.title.hashCode() + (this.token.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("OptionRow(token=", this.token, ", title=", this.title, ")");
                    }
                }

                public Selection(String str, String str2, String str3, String str4, List list) {
                    str.getClass();
                    list.getClass();
                    this.token = str;
                    this.title = str2;
                    this.placeholder = str3;
                    this.selectedOption = str4;
                    this.selectableOptions = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Selection)) {
                        return false;
                    }
                    Selection selection = (Selection) obj;
                    return Intrinsics.areEqual(this.token, selection.token) && this.title.equals(selection.title) && this.placeholder.equals(selection.placeholder) && Intrinsics.areEqual(this.selectedOption, selection.selectedOption) && Intrinsics.areEqual(this.selectableOptions, selection.selectableOptions);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title), 31, this.placeholder);
                    String str = this.selectedOption;
                    return this.selectableOptions.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selection(token=", this.token, ", title=", this.title, ", placeholder=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.placeholder, ", selectedOption=", this.selectedOption, ", selectableOptions=");
                    return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.selectableOptions, ")");
                }
            }
        }

        public final class FilterSection {
            public final List options;
            public final String title;
            public final String token;

            public FilterSection(String str, String str2, List list) {
                Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
                this.token = str;
                this.title = str2;
                this.options = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FilterSection)) {
                    return false;
                }
                FilterSection filterSection = (FilterSection) obj;
                return Intrinsics.areEqual(this.token, filterSection.token) && Intrinsics.areEqual(this.title, filterSection.title) && Intrinsics.areEqual(this.options, filterSection.options);
            }

            public final int hashCode() {
                return this.options.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilterSection(token=", this.token, ", title=", this.title, ", options="), this.options, ")");
            }
        }

        public Content(String str, List list, boolean z) {
            list.getClass();
            str.getClass();
            this.filterSections = list;
            this.primaryButtonText = str;
            this.isValid = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.filterSections, content.filterSections) && Intrinsics.areEqual(this.primaryButtonText, content.primaryButtonText) && this.isValid == content.isValid;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isValid) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.filterSections.hashCode() * 31, 31, this.primaryButtonText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m("Content(filterSections=", ", primaryButtonText=", this.primaryButtonText, ", isValid=", this.filterSections), this.isValid, ")");
        }
    }

    public final class Loading implements InvestingCategoryFilterViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -774207755;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
