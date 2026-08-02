package com.squareup.cash.investing.viewmodels.holdings;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingEtfHoldingDetailsViewModel {

    public final class Content implements InvestingEtfHoldingDetailsViewModel {
        public final List holdings;
        public final String lastUpdated;
        public final List sectors;
        public final InvestmentType selectedType;
        public final boolean showInvestmentTypeToggle;
        public final String title;

        public Content(String str, InvestmentType investmentType, boolean z, String str2, List list, List list2) {
            str.getClass();
            investmentType.getClass();
            list.getClass();
            list2.getClass();
            this.title = str;
            this.selectedType = investmentType;
            this.showInvestmentTypeToggle = z;
            this.lastUpdated = str2;
            this.sectors = list;
            this.holdings = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.selectedType == content.selectedType && this.showInvestmentTypeToggle == content.showInvestmentTypeToggle && this.lastUpdated.equals(content.lastUpdated) && Intrinsics.areEqual(this.sectors, content.sectors) && Intrinsics.areEqual(this.holdings, content.holdings);
        }

        public final int hashCode() {
            return this.holdings.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.selectedType.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.showInvestmentTypeToggle), 31, this.lastUpdated), 31, this.sectors);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(title=");
            sb.append(this.title);
            sb.append(", selectedType=");
            sb.append(this.selectedType);
            sb.append(", showInvestmentTypeToggle=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.showInvestmentTypeToggle, ", lastUpdated=", this.lastUpdated, ", sectors=");
            sb.append(this.sectors);
            sb.append(", holdings=");
            sb.append(this.holdings);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Loading implements InvestingEtfHoldingDetailsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -611111817;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
