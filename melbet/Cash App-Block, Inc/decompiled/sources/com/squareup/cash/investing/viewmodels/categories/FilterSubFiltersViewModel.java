package com.squareup.cash.investing.viewmodels.categories;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FilterSubFiltersViewModel {

    public final class Content extends FilterSubFiltersViewModel {
        public final ColorModel accentColor;
        public final List options;
        public final String resetLabel;
        public final boolean submitEnabled;
        public final String submitLabel;

        public Content(String str, String str2, boolean z, List list, ColorModel colorModel) {
            str.getClass();
            str2.getClass();
            list.getClass();
            colorModel.getClass();
            this.resetLabel = str;
            this.submitLabel = str2;
            this.submitEnabled = z;
            this.options = list;
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
            return Intrinsics.areEqual(this.resetLabel, content.resetLabel) && Intrinsics.areEqual(this.submitLabel, content.submitLabel) && this.submitEnabled == content.submitEnabled && Intrinsics.areEqual(this.options, content.options) && Intrinsics.areEqual(this.accentColor, content.accentColor);
        }

        public final int hashCode() {
            return this.accentColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.resetLabel.hashCode() * 31, 31, this.submitLabel), 31, this.submitEnabled), 31, this.options);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content(resetLabel=", this.resetLabel, ", submitLabel=", this.submitLabel, ", submitEnabled=");
            m.append(this.submitEnabled);
            m.append(", options=");
            m.append(this.options);
            m.append(", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.accentColor, ")");
        }
    }

    public final class Loading extends FilterSubFiltersViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1519345977;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
