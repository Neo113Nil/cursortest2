package com.squareup.cash.investing.viewmodels.drip;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DividendReinvestmentLearnMoreSheetViewModel {
    public final String dismissButtonLabel;
    public final List infoSections;
    public final String title;

    /* loaded from: classes4.dex */
    public final class InfoSection {
        public final String description;
        public final String title;

        public InfoSection(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoSection)) {
                return false;
            }
            InfoSection infoSection = (InfoSection) obj;
            return Intrinsics.areEqual(this.title, infoSection.title) && Intrinsics.areEqual(this.description, infoSection.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InfoSection(title=", this.title, ", description=", this.description, ")");
        }
    }

    public DividendReinvestmentLearnMoreSheetViewModel(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.title = str;
        this.infoSections = list;
        this.dismissButtonLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividendReinvestmentLearnMoreSheetViewModel)) {
            return false;
        }
        DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel = (DividendReinvestmentLearnMoreSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, dividendReinvestmentLearnMoreSheetViewModel.title) && Intrinsics.areEqual(this.infoSections, dividendReinvestmentLearnMoreSheetViewModel.infoSections) && Intrinsics.areEqual(this.dismissButtonLabel, dividendReinvestmentLearnMoreSheetViewModel.dismissButtonLabel);
    }

    public final int hashCode() {
        return this.dismissButtonLabel.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.infoSections);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("DividendReinvestmentLearnMoreSheetViewModel(title=", this.title, ", infoSections=", ", dismissButtonLabel=", this.infoSections), this.dismissButtonLabel, ")");
    }
}
