package com.squareup.cash.benefits.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsHomeViewModel {

    public final class Content implements BenefitsHomeViewModel {
        public final ActivitySection activitySection;
        public final BenefitsComparisonTableViewModel benefitsComparisonTable;
        public final List disclosures;
        public final HeaderViewModel headerViewModel;
        public final StatusPathInfoSection statusPathInfoSection;
        public final StickyCtaViewModel stickyCtaViewModel;

        public final class ActivitySection {
            public final UiCallbackModel embedded;
            public final String title;

            public ActivitySection(UiCallbackModel uiCallbackModel, String str) {
                this.title = str;
                this.embedded = uiCallbackModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActivitySection)) {
                    return false;
                }
                ActivitySection activitySection = (ActivitySection) obj;
                return Intrinsics.areEqual(this.title, activitySection.title) && this.embedded.equals(activitySection.embedded);
            }

            public final int hashCode() {
                String str = this.title;
                return this.embedded.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "ActivitySection(title=" + this.title + ", embedded=" + this.embedded + ")";
            }
        }

        public final class HeaderViewModel {
            public final GreenStatus greenStatus;
            public final String statusDescription;
            public final String statusLabel;
            public final String statusStateLabel;

            public HeaderViewModel(String str, GreenStatus greenStatus, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.statusLabel = str;
                this.greenStatus = greenStatus;
                this.statusStateLabel = str2;
                this.statusDescription = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeaderViewModel)) {
                    return false;
                }
                HeaderViewModel headerViewModel = (HeaderViewModel) obj;
                return Intrinsics.areEqual(this.statusLabel, headerViewModel.statusLabel) && this.greenStatus == headerViewModel.greenStatus && Intrinsics.areEqual(this.statusStateLabel, headerViewModel.statusStateLabel) && Intrinsics.areEqual(this.statusDescription, headerViewModel.statusDescription);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.greenStatus.hashCode() + (this.statusLabel.hashCode() * 31)) * 31, 31, this.statusStateLabel);
                String str = this.statusDescription;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeaderViewModel(statusLabel=");
                sb.append(this.statusLabel);
                sb.append(", greenStatus=");
                sb.append(this.greenStatus);
                sb.append(", statusStateLabel=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.statusStateLabel, ", statusDescription=", this.statusDescription, ")");
            }
        }

        public final class StickyCtaViewModel {
            public final String disclaimer;
            public final String primaryButtonText;

            public StickyCtaViewModel(String str, String str2) {
                str.getClass();
                this.primaryButtonText = str;
                this.disclaimer = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StickyCtaViewModel)) {
                    return false;
                }
                StickyCtaViewModel stickyCtaViewModel = (StickyCtaViewModel) obj;
                return Intrinsics.areEqual(this.primaryButtonText, stickyCtaViewModel.primaryButtonText) && Intrinsics.areEqual(this.disclaimer, stickyCtaViewModel.disclaimer);
            }

            public final int hashCode() {
                int hashCode = this.primaryButtonText.hashCode() * 31;
                String str = this.disclaimer;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("StickyCtaViewModel(primaryButtonText=", this.primaryButtonText, ", disclaimer=", this.disclaimer, ")");
            }
        }

        public Content(HeaderViewModel headerViewModel, StatusPathInfoSection statusPathInfoSection, BenefitsComparisonTableViewModel benefitsComparisonTableViewModel, ActivitySection activitySection, List list, StickyCtaViewModel stickyCtaViewModel) {
            this.headerViewModel = headerViewModel;
            this.statusPathInfoSection = statusPathInfoSection;
            this.benefitsComparisonTable = benefitsComparisonTableViewModel;
            this.activitySection = activitySection;
            this.disclosures = list;
            this.stickyCtaViewModel = stickyCtaViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.headerViewModel.equals(content.headerViewModel) && this.statusPathInfoSection.equals(content.statusPathInfoSection) && this.benefitsComparisonTable.equals(content.benefitsComparisonTable) && Intrinsics.areEqual(this.activitySection, content.activitySection) && Intrinsics.areEqual(this.disclosures, content.disclosures) && Intrinsics.areEqual(this.stickyCtaViewModel, content.stickyCtaViewModel);
        }

        public final int hashCode() {
            int hashCode = (this.benefitsComparisonTable.hashCode() + ((this.statusPathInfoSection.hashCode() + (this.headerViewModel.hashCode() * 31)) * 31)) * 31;
            ActivitySection activitySection = this.activitySection;
            int hashCode2 = (hashCode + (activitySection == null ? 0 : activitySection.hashCode())) * 31;
            List list = this.disclosures;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            StickyCtaViewModel stickyCtaViewModel = this.stickyCtaViewModel;
            return hashCode3 + (stickyCtaViewModel != null ? stickyCtaViewModel.hashCode() : 0);
        }

        public final String toString() {
            return "Content(headerViewModel=" + this.headerViewModel + ", statusPathInfoSection=" + this.statusPathInfoSection + ", benefitsComparisonTable=" + this.benefitsComparisonTable + ", activitySection=" + this.activitySection + ", disclosures=" + this.disclosures + ", stickyCtaViewModel=" + this.stickyCtaViewModel + ")";
        }
    }

    public final class Loading implements BenefitsHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -8191368;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class StatusPathInfoSection {
        public final String otherWaysToQualifyText;
        public final ProgressBarViewModel progressBarViewModel;
        public final String statusRequirementDescription;
        public final String viewTransactionsButtonText;

        public final class ProgressBarViewModel {
            public final boolean animationEnabled;
            public final String currentSpendDescription;
            public final String deadlineDescription;
            public final float progress;

            public ProgressBarViewModel(String str, float f, String str2, boolean z) {
                this.currentSpendDescription = str;
                this.progress = f;
                this.deadlineDescription = str2;
                this.animationEnabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ProgressBarViewModel)) {
                    return false;
                }
                ProgressBarViewModel progressBarViewModel = (ProgressBarViewModel) obj;
                return this.currentSpendDescription.equals(progressBarViewModel.currentSpendDescription) && Float.compare(this.progress, progressBarViewModel.progress) == 0 && Intrinsics.areEqual(this.deadlineDescription, progressBarViewModel.deadlineDescription) && this.animationEnabled == progressBarViewModel.animationEnabled;
            }

            public final int hashCode() {
                int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, this.currentSpendDescription.hashCode() * 31, 31);
                String str = this.deadlineDescription;
                return Boolean.hashCode(this.animationEnabled) + ((m + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ProgressBarViewModel(currentSpendDescription=");
                sb.append(this.currentSpendDescription);
                sb.append(", progress=");
                sb.append(this.progress);
                sb.append(", deadlineDescription=");
                return re$$ExternalSyntheticOutline0.m(sb, this.deadlineDescription, ", animationEnabled=", this.animationEnabled, ")");
            }
        }

        public StatusPathInfoSection(String str, ProgressBarViewModel progressBarViewModel, String str2, String str3) {
            str.getClass();
            this.statusRequirementDescription = str;
            this.progressBarViewModel = progressBarViewModel;
            this.otherWaysToQualifyText = str2;
            this.viewTransactionsButtonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusPathInfoSection)) {
                return false;
            }
            StatusPathInfoSection statusPathInfoSection = (StatusPathInfoSection) obj;
            return Intrinsics.areEqual(this.statusRequirementDescription, statusPathInfoSection.statusRequirementDescription) && Intrinsics.areEqual(this.progressBarViewModel, statusPathInfoSection.progressBarViewModel) && Intrinsics.areEqual(this.otherWaysToQualifyText, statusPathInfoSection.otherWaysToQualifyText) && Intrinsics.areEqual(this.viewTransactionsButtonText, statusPathInfoSection.viewTransactionsButtonText);
        }

        public final int hashCode() {
            int hashCode = this.statusRequirementDescription.hashCode() * 31;
            ProgressBarViewModel progressBarViewModel = this.progressBarViewModel;
            int hashCode2 = (hashCode + (progressBarViewModel == null ? 0 : progressBarViewModel.hashCode())) * 31;
            String str = this.otherWaysToQualifyText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.viewTransactionsButtonText;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusPathInfoSection(statusRequirementDescription=");
            sb.append(this.statusRequirementDescription);
            sb.append(", progressBarViewModel=");
            sb.append(this.progressBarViewModel);
            sb.append(", otherWaysToQualifyText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.otherWaysToQualifyText, ", viewTransactionsButtonText=", this.viewTransactionsButtonText, ")");
        }
    }
}
