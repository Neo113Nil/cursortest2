package com.squareup.cash.afterpayapplet.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletPurchasesEmbeddedViewModel {

    public final class Default implements AfterpayAppletPurchasesEmbeddedViewModel {
        public final EmbeddedActivitySection completedActivitiesSection;
        public final FooterSection footer;
        public final String toolbarTitle;
        public final TotalOwedSection totalOwedSection;
        public final EmbeddedActivitySection upcomingActivitiesSection;

        public Default(String str, TotalOwedSection totalOwedSection, EmbeddedActivitySection embeddedActivitySection, EmbeddedActivitySection embeddedActivitySection2, FooterSection footerSection) {
            str.getClass();
            this.toolbarTitle = str;
            this.totalOwedSection = totalOwedSection;
            this.upcomingActivitiesSection = embeddedActivitySection;
            this.completedActivitiesSection = embeddedActivitySection2;
            this.footer = footerSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r3 = (Default) obj;
            return Intrinsics.areEqual(this.toolbarTitle, r3.toolbarTitle) && Intrinsics.areEqual(this.totalOwedSection, r3.totalOwedSection) && this.upcomingActivitiesSection.equals(r3.upcomingActivitiesSection) && this.completedActivitiesSection.equals(r3.completedActivitiesSection) && Intrinsics.areEqual(this.footer, r3.footer);
        }

        public final int hashCode() {
            int hashCode = this.toolbarTitle.hashCode() * 31;
            TotalOwedSection totalOwedSection = this.totalOwedSection;
            int hashCode2 = (this.completedActivitiesSection.hashCode() + ((this.upcomingActivitiesSection.hashCode() + ((hashCode + (totalOwedSection == null ? 0 : totalOwedSection.hashCode())) * 31)) * 31)) * 31;
            FooterSection footerSection = this.footer;
            return hashCode2 + (footerSection != null ? footerSection.hashCode() : 0);
        }

        public final String toString() {
            return "Default(toolbarTitle=" + this.toolbarTitle + ", totalOwedSection=" + this.totalOwedSection + ", upcomingActivitiesSection=" + this.upcomingActivitiesSection + ", completedActivitiesSection=" + this.completedActivitiesSection + ", footer=" + this.footer + ")";
        }
    }

    public final class EmbeddedActivitySection {
        public final ActivityEmbeddedViewModel activitiesViewModel;
        public final String headerTitle;
        public final String viewMoreTitle;

        public EmbeddedActivitySection(ActivityEmbeddedViewModel activityEmbeddedViewModel, String str, String str2) {
            activityEmbeddedViewModel.getClass();
            str.getClass();
            str2.getClass();
            this.activitiesViewModel = activityEmbeddedViewModel;
            this.headerTitle = str;
            this.viewMoreTitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmbeddedActivitySection)) {
                return false;
            }
            EmbeddedActivitySection embeddedActivitySection = (EmbeddedActivitySection) obj;
            return Intrinsics.areEqual(this.activitiesViewModel, embeddedActivitySection.activitiesViewModel) && Intrinsics.areEqual(this.headerTitle, embeddedActivitySection.headerTitle) && Intrinsics.areEqual(this.viewMoreTitle, embeddedActivitySection.viewMoreTitle);
        }

        public final int hashCode() {
            return this.viewMoreTitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.activitiesViewModel.hashCode() * 31, 31, this.headerTitle);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmbeddedActivitySection(activitiesViewModel=");
            sb.append(this.activitiesViewModel);
            sb.append(", headerTitle=");
            sb.append(this.headerTitle);
            sb.append(", viewMoreTitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.viewMoreTitle, ")");
        }
    }

    public final class Error implements AfterpayAppletPurchasesEmbeddedViewModel {
        public final String buttonText;
        public final String screenTitle;
        public final String subtitleText;
        public final String titleText;

        public Error(String str, String str2, String str3, String str4) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.screenTitle = str;
            this.titleText = str2;
            this.subtitleText = str3;
            this.buttonText = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.screenTitle, error.screenTitle) && Intrinsics.areEqual(this.titleText, error.titleText) && Intrinsics.areEqual(this.subtitleText, error.subtitleText) && Intrinsics.areEqual(this.buttonText, error.buttonText);
        }

        public final int hashCode() {
            return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.screenTitle.hashCode() * 31, 31, this.titleText), 31, this.subtitleText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(screenTitle=", this.screenTitle, ", titleText=", this.titleText, ", subtitleText="), this.subtitleText, ", buttonText=", this.buttonText, ")");
        }
    }

    public final class TotalOwedSection {
        public final String totalOwedTitle;
        public final LoadableText totalOwedValue;

        public TotalOwedSection(LoadableText loadableText, String str) {
            str.getClass();
            this.totalOwedValue = loadableText;
            this.totalOwedTitle = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalOwedSection)) {
                return false;
            }
            TotalOwedSection totalOwedSection = (TotalOwedSection) obj;
            return this.totalOwedValue.equals(totalOwedSection.totalOwedValue) && Intrinsics.areEqual(this.totalOwedTitle, totalOwedSection.totalOwedTitle);
        }

        public final int hashCode() {
            return this.totalOwedTitle.hashCode() + (this.totalOwedValue.hashCode() * 31);
        }

        public final String toString() {
            return "TotalOwedSection(totalOwedValue=" + this.totalOwedValue + ", totalOwedTitle=" + this.totalOwedTitle + ")";
        }
    }
}
