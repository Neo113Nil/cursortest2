package com.squareup.cash.investing.viewmodels.categories;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.primitives.CategoryToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FilterCategoriesViewModel {

    public final class ChoiceRowModel {
        public final ColorModel accentColor;
        public final String description;
        public final boolean isChecked;
        public final String label;
        public final CategoryToken token;

        public ChoiceRowModel(CategoryToken categoryToken, boolean z, String str, String str2, ColorModel colorModel) {
            categoryToken.getClass();
            str.getClass();
            colorModel.getClass();
            this.token = categoryToken;
            this.isChecked = z;
            this.label = str;
            this.description = str2;
            this.accentColor = colorModel;
        }

        public static ChoiceRowModel copy$default(ChoiceRowModel choiceRowModel, boolean z) {
            CategoryToken categoryToken = choiceRowModel.token;
            String str = choiceRowModel.label;
            String str2 = choiceRowModel.description;
            ColorModel colorModel = choiceRowModel.accentColor;
            choiceRowModel.getClass();
            categoryToken.getClass();
            str.getClass();
            colorModel.getClass();
            return new ChoiceRowModel(categoryToken, z, str, str2, colorModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChoiceRowModel)) {
                return false;
            }
            ChoiceRowModel choiceRowModel = (ChoiceRowModel) obj;
            return Intrinsics.areEqual(this.token, choiceRowModel.token) && this.isChecked == choiceRowModel.isChecked && Intrinsics.areEqual(this.label, choiceRowModel.label) && Intrinsics.areEqual(this.description, choiceRowModel.description) && Intrinsics.areEqual(this.accentColor, choiceRowModel.accentColor);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.value.hashCode() * 31, 31, this.isChecked), 31, this.label);
            String str = this.description;
            return this.accentColor.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChoiceRowModel(token=");
            sb.append(this.token);
            sb.append(", isChecked=");
            sb.append(this.isChecked);
            sb.append(", label=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.label, ", description=", this.description, ", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
        }
    }

    public final class Content extends FilterCategoriesViewModel {
        public final ColorModel accentColor;
        public final List choiceRows;
        public final String resetLabel;
        public final String submitLabel;
        public final String title;

        public Content(ColorModel colorModel, String str, String str2, String str3, List list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            colorModel.getClass();
            this.title = str;
            this.resetLabel = str2;
            this.submitLabel = str3;
            this.choiceRows = list;
            this.accentColor = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.resetLabel, content.resetLabel) && Intrinsics.areEqual(this.submitLabel, content.submitLabel) && Intrinsics.areEqual(this.choiceRows, content.choiceRows) && Intrinsics.areEqual(this.accentColor, content.accentColor);
        }

        public final int hashCode() {
            return this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.resetLabel), 31, this.submitLabel), 31, this.choiceRows);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", resetLabel=", this.resetLabel, ", submitLabel=");
            NavAction$$ExternalSyntheticOutline0.m(this.submitLabel, ", choiceRows=", ", accentColor=", m, this.choiceRows);
            return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.accentColor, ")");
        }
    }

    public final class Loading extends FilterCategoriesViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -2097806632;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
