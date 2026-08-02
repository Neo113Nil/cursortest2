package com.squareup.cash.investingcrypto.viewmodels.common.orders;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PeriodSelectionViewModel {

    public final class ContentModel extends PeriodSelectionViewModel {
        public final List periods;
        public final String selectedPeriodToken;
        public final String subTitle;
        public final boolean submitEnabled;
        public final String submitLabel;
        public final String title;

        public ContentModel(String str, String str2, String str3, String str4, List list, boolean z) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.title = str;
            this.subTitle = str2;
            this.submitLabel = str3;
            this.submitEnabled = z;
            this.periods = list;
            this.selectedPeriodToken = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentModel)) {
                return false;
            }
            ContentModel contentModel = (ContentModel) obj;
            return Intrinsics.areEqual(this.title, contentModel.title) && Intrinsics.areEqual(this.subTitle, contentModel.subTitle) && Intrinsics.areEqual(this.submitLabel, contentModel.submitLabel) && this.submitEnabled == contentModel.submitEnabled && Intrinsics.areEqual(this.periods, contentModel.periods) && Intrinsics.areEqual(this.selectedPeriodToken, contentModel.selectedPeriodToken);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subTitle), 31, this.submitLabel), 31, this.submitEnabled), 31, this.periods);
            String str = this.selectedPeriodToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContentModel(title=", this.title, ", subTitle=", this.subTitle, ", submitLabel=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.submitLabel, ", submitEnabled=", this.submitEnabled, ", periods=");
            m.append(this.periods);
            m.append(", selectedPeriodToken=");
            m.append(this.selectedPeriodToken);
            m.append(")");
            return m.toString();
        }
    }

    public final class InFlight extends PeriodSelectionViewModel {
        public static final InFlight INSTANCE = new InFlight();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InFlight);
        }

        public final int hashCode() {
            return -1389260393;
        }

        public final String toString() {
            return "InFlight";
        }
    }
}
