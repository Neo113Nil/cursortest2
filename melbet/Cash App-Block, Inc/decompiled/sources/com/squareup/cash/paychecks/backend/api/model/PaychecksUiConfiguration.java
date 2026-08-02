package com.squareup.cash.paychecks.backend.api.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaychecksUiConfiguration {
    public final ArrayList destinationUiConfigs;
    public final PaychecksDistributionSummaryUi distributionSummary;
    public final PaychecksHomeUi home;
    public final ArrayList productTintWheelColorLists;

    public final class PaychecksDestinationUi {
        public final AllocationDestination destination;
        public final DestinationUiConfiguration destinationUiConfig;

        public final class DestinationUiConfiguration {
            public final String name;
            public final Color tint;

            public DestinationUiConfiguration(Color color, String str) {
                color.getClass();
                this.tint = color;
                this.name = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DestinationUiConfiguration)) {
                    return false;
                }
                DestinationUiConfiguration destinationUiConfiguration = (DestinationUiConfiguration) obj;
                return Intrinsics.areEqual(this.tint, destinationUiConfiguration.tint) && this.name.equals(destinationUiConfiguration.name);
            }

            public final int hashCode() {
                return this.name.hashCode() + (this.tint.hashCode() * 31);
            }

            public final String toString() {
                return "DestinationUiConfiguration(tint=" + this.tint + ", name=" + this.name + ")";
            }
        }

        public PaychecksDestinationUi(AllocationDestination allocationDestination, DestinationUiConfiguration destinationUiConfiguration) {
            this.destination = allocationDestination;
            this.destinationUiConfig = destinationUiConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksDestinationUi)) {
                return false;
            }
            PaychecksDestinationUi paychecksDestinationUi = (PaychecksDestinationUi) obj;
            return this.destination.equals(paychecksDestinationUi.destination) && this.destinationUiConfig.equals(paychecksDestinationUi.destinationUiConfig);
        }

        public final int hashCode() {
            return this.destinationUiConfig.hashCode() + (this.destination.hashCode() * 31);
        }

        public final String toString() {
            return "PaychecksDestinationUi(destination=" + this.destination + ", destinationUiConfig=" + this.destinationUiConfig + ")";
        }
    }

    public final class PaychecksDistributionSummaryUi {
        public final ArrayList destinationUiConfigs;
        public final String doneButtonTitle;
        public final PaychecksHelpSheetUi helpSheet;
        public final PaychecksAlertUi overallocationAlert;
        public final String title;

        public final class DistributionSummaryDestinationUi {
            public final AllocationDestination destination;
            public final DestinationUiConfiguration destinationUiConfig;

            public final class DestinationUiConfiguration {
                public final String nuxButtonText;

                public DestinationUiConfiguration(String str) {
                    this.nuxButtonText = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof DestinationUiConfiguration) && this.nuxButtonText.equals(((DestinationUiConfiguration) obj).nuxButtonText);
                }

                public final int hashCode() {
                    return this.nuxButtonText.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DestinationUiConfiguration(nuxButtonText=", this.nuxButtonText, ")");
                }
            }

            public DistributionSummaryDestinationUi(AllocationDestination allocationDestination, DestinationUiConfiguration destinationUiConfiguration) {
                this.destination = allocationDestination;
                this.destinationUiConfig = destinationUiConfiguration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DistributionSummaryDestinationUi)) {
                    return false;
                }
                DistributionSummaryDestinationUi distributionSummaryDestinationUi = (DistributionSummaryDestinationUi) obj;
                return this.destination.equals(distributionSummaryDestinationUi.destination) && Intrinsics.areEqual(this.destinationUiConfig, distributionSummaryDestinationUi.destinationUiConfig);
            }

            public final int hashCode() {
                int hashCode = this.destination.hashCode() * 31;
                DestinationUiConfiguration destinationUiConfiguration = this.destinationUiConfig;
                return hashCode + (destinationUiConfiguration == null ? 0 : destinationUiConfiguration.nuxButtonText.hashCode());
            }

            public final String toString() {
                return "DistributionSummaryDestinationUi(destination=" + this.destination + ", destinationUiConfig=" + this.destinationUiConfig + ")";
            }
        }

        public PaychecksDistributionSummaryUi(String str, String str2, ArrayList arrayList, PaychecksHelpSheetUi paychecksHelpSheetUi, PaychecksAlertUi paychecksAlertUi) {
            this.title = str;
            this.doneButtonTitle = str2;
            this.destinationUiConfigs = arrayList;
            this.helpSheet = paychecksHelpSheetUi;
            this.overallocationAlert = paychecksAlertUi;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksDistributionSummaryUi)) {
                return false;
            }
            PaychecksDistributionSummaryUi paychecksDistributionSummaryUi = (PaychecksDistributionSummaryUi) obj;
            return Intrinsics.areEqual(this.title, paychecksDistributionSummaryUi.title) && Intrinsics.areEqual(this.doneButtonTitle, paychecksDistributionSummaryUi.doneButtonTitle) && this.destinationUiConfigs.equals(paychecksDistributionSummaryUi.destinationUiConfigs) && this.helpSheet.equals(paychecksDistributionSummaryUi.helpSheet) && this.overallocationAlert.equals(paychecksDistributionSummaryUi.overallocationAlert);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.doneButtonTitle;
            return this.overallocationAlert.hashCode() + ((this.helpSheet.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.destinationUiConfigs, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaychecksDistributionSummaryUi(title=", this.title, ", doneButtonTitle=", this.doneButtonTitle, ", destinationUiConfigs=");
            m.append(this.destinationUiConfigs);
            m.append(", helpSheet=");
            m.append(this.helpSheet);
            m.append(", overallocationAlert=");
            m.append(this.overallocationAlert);
            m.append(")");
            return m.toString();
        }
    }

    /* loaded from: classes7.dex */
    public final class PaychecksHelpSheetUi {
        public final String dismissButtonText;
        public final String helpButtonClientRoute;
        public final String helpButtonText;
        public final ArrayList numberedItemSubtexts;
        public final ArrayList numberedItemTexts;
        public final String title;

        public PaychecksHelpSheetUi(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2) {
            str3.getClass();
            this.title = str;
            this.helpButtonText = str2;
            this.helpButtonClientRoute = str3;
            this.dismissButtonText = str4;
            this.numberedItemTexts = arrayList;
            this.numberedItemSubtexts = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksHelpSheetUi)) {
                return false;
            }
            PaychecksHelpSheetUi paychecksHelpSheetUi = (PaychecksHelpSheetUi) obj;
            return this.title.equals(paychecksHelpSheetUi.title) && this.helpButtonText.equals(paychecksHelpSheetUi.helpButtonText) && Intrinsics.areEqual(this.helpButtonClientRoute, paychecksHelpSheetUi.helpButtonClientRoute) && this.dismissButtonText.equals(paychecksHelpSheetUi.dismissButtonText) && this.numberedItemTexts.equals(paychecksHelpSheetUi.numberedItemTexts) && this.numberedItemSubtexts.equals(paychecksHelpSheetUi.numberedItemSubtexts);
        }

        public final int hashCode() {
            return this.numberedItemSubtexts.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.numberedItemTexts, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.helpButtonText), 31, this.helpButtonClientRoute), 31, this.dismissButtonText), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaychecksHelpSheetUi(title=", this.title, ", helpButtonText=", this.helpButtonText, ", helpButtonClientRoute=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.helpButtonClientRoute, ", dismissButtonText=", this.dismissButtonText, ", numberedItemTexts=");
            m.append(this.numberedItemTexts);
            m.append(", numberedItemSubtexts=");
            m.append(this.numberedItemSubtexts);
            m.append(")");
            return m.toString();
        }
    }

    public final class PaychecksHomeUi {
        public final String bankingBenefitsBookletClientRoute;
        public final PaychecksHeader header;
        public final ArrayList sections;
        public final List termsOfService;

        public final class PaychecksHeader {
            public final PaychecksNullStateUpsell nullStateUpsell;

            public final class PaychecksNullStateUpsell {
                public final ArrayList detailRows;

                public final class PaychecksDetailsRow {
                    public final String buttonText;
                    public final String clientRoute;
                    public final boolean stepCompleted;
                    public final String subtitle;
                    public final String title;

                    public PaychecksDetailsRow(String str, String str2, String str3, String str4, boolean z) {
                        this.title = str;
                        this.subtitle = str2;
                        this.stepCompleted = z;
                        this.buttonText = str3;
                        this.clientRoute = str4;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PaychecksDetailsRow)) {
                            return false;
                        }
                        PaychecksDetailsRow paychecksDetailsRow = (PaychecksDetailsRow) obj;
                        return this.title.equals(paychecksDetailsRow.title) && Intrinsics.areEqual(this.subtitle, paychecksDetailsRow.subtitle) && this.stepCompleted == paychecksDetailsRow.stepCompleted && Intrinsics.areEqual(this.buttonText, paychecksDetailsRow.buttonText) && Intrinsics.areEqual(this.clientRoute, paychecksDetailsRow.clientRoute);
                    }

                    public final int hashCode() {
                        int hashCode = this.title.hashCode() * 31;
                        String str = this.subtitle;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.stepCompleted);
                        String str2 = this.buttonText;
                        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.clientRoute;
                        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaychecksDetailsRow(title=", this.title, ", subtitle=", this.subtitle, ", stepCompleted=");
                        NavAction$$ExternalSyntheticOutline0.m(m, this.stepCompleted, ", buttonText=", this.buttonText, ", clientRoute=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.clientRoute, ")");
                    }
                }

                public PaychecksNullStateUpsell(ArrayList arrayList) {
                    this.detailRows = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PaychecksNullStateUpsell) && this.detailRows.equals(((PaychecksNullStateUpsell) obj).detailRows);
                }

                public final int hashCode() {
                    return this.detailRows.hashCode();
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m("PaychecksNullStateUpsell(detailRows=", ")", this.detailRows);
                }
            }

            public PaychecksHeader(PaychecksNullStateUpsell paychecksNullStateUpsell) {
                this.nullStateUpsell = paychecksNullStateUpsell;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaychecksHeader) && this.nullStateUpsell.equals(((PaychecksHeader) obj).nullStateUpsell);
            }

            public final int hashCode() {
                return this.nullStateUpsell.detailRows.hashCode();
            }

            public final String toString() {
                return "PaychecksHeader(nullStateUpsell=" + this.nullStateUpsell + ")";
            }
        }

        /* loaded from: classes7.dex */
        public interface PaychecksHomeSection {

            /* loaded from: classes6.dex */
            public final class ActiveDistributionSection implements PaychecksHomeSection {
                public final String editButtonClientRoute;
                public final String editButtonText;
                public final String title;
                public final ArrayList visibilityPredicates;

                public ActiveDistributionSection(String str, String str2, String str3, ArrayList arrayList) {
                    str3.getClass();
                    this.visibilityPredicates = arrayList;
                    this.title = str;
                    this.editButtonText = str2;
                    this.editButtonClientRoute = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActiveDistributionSection)) {
                        return false;
                    }
                    ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
                    return this.visibilityPredicates.equals(activeDistributionSection.visibilityPredicates) && this.title.equals(activeDistributionSection.title) && this.editButtonText.equals(activeDistributionSection.editButtonText) && Intrinsics.areEqual(this.editButtonClientRoute, activeDistributionSection.editButtonClientRoute);
                }

                @Override // com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection
                public final List getVisibilityPredicates() {
                    return this.visibilityPredicates;
                }

                public final int hashCode() {
                    return this.editButtonClientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.visibilityPredicates.hashCode() * 31, 31, this.title), 31, this.editButtonText);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ActiveDistributionSection(visibilityPredicates=");
                    sb.append(this.visibilityPredicates);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", editButtonText=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.editButtonText, ", editButtonClientRoute=", this.editButtonClientRoute, ")");
                }
            }

            /* loaded from: classes6.dex */
            public final class ActivitySection implements PaychecksHomeSection {
                public final String loadFailureSubtitle;
                public final String noActivitySubtitle;
                public final String staleActivityTitle;
                public final String title;
                public final String viewAllButtonTitle;
                public final ArrayList visibilityPredicates;

                public ActivitySection(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
                    this.visibilityPredicates = arrayList;
                    this.title = str;
                    this.staleActivityTitle = str2;
                    this.noActivitySubtitle = str3;
                    this.loadFailureSubtitle = str4;
                    this.viewAllButtonTitle = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActivitySection)) {
                        return false;
                    }
                    ActivitySection activitySection = (ActivitySection) obj;
                    return this.visibilityPredicates.equals(activitySection.visibilityPredicates) && this.title.equals(activitySection.title) && this.staleActivityTitle.equals(activitySection.staleActivityTitle) && Intrinsics.areEqual(this.noActivitySubtitle, activitySection.noActivitySubtitle) && Intrinsics.areEqual(this.loadFailureSubtitle, activitySection.loadFailureSubtitle) && this.viewAllButtonTitle.equals(activitySection.viewAllButtonTitle);
                }

                @Override // com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection
                public final List getVisibilityPredicates() {
                    return this.visibilityPredicates;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.visibilityPredicates.hashCode() * 31, 31, this.title), 31, this.staleActivityTitle);
                    String str = this.noActivitySubtitle;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.loadFailureSubtitle;
                    return this.viewAllButtonTitle.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ActivitySection(visibilityPredicates=");
                    sb.append(this.visibilityPredicates);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", staleActivityTitle=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.staleActivityTitle, ", noActivitySubtitle=", this.noActivitySubtitle, ", loadFailureSubtitle=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.loadFailureSubtitle, ", viewAllButtonTitle=", this.viewAllButtonTitle, ")");
                }
            }

            /* loaded from: classes6.dex */
            public final class AddOrUpdateDirectDepositSection implements PaychecksHomeSection {
                public final String buttonClientRoute;
                public final String buttonText;
                public final String denylistedCustomerClientRoute;
                public final PendingDirectDepositInfo pendingDirectDepositInfo;
                public final ArrayList visibilityPredicates;

                public final class PendingDirectDepositHalfSheet {
                    public final String body;
                    public final String buttonText;
                    public final Icon icon;
                    public final String title;

                    public PendingDirectDepositHalfSheet(Icon icon, String str, String str2, String str3) {
                        icon.getClass();
                        this.icon = icon;
                        this.title = str;
                        this.body = str2;
                        this.buttonText = str3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PendingDirectDepositHalfSheet)) {
                            return false;
                        }
                        PendingDirectDepositHalfSheet pendingDirectDepositHalfSheet = (PendingDirectDepositHalfSheet) obj;
                        return Intrinsics.areEqual(this.icon, pendingDirectDepositHalfSheet.icon) && this.title.equals(pendingDirectDepositHalfSheet.title) && this.body.equals(pendingDirectDepositHalfSheet.body) && this.buttonText.equals(pendingDirectDepositHalfSheet.buttonText);
                    }

                    public final int hashCode() {
                        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.body);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("PendingDirectDepositHalfSheet(icon=");
                        sb.append(this.icon);
                        sb.append(", title=");
                        sb.append(this.title);
                        sb.append(", body=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ", buttonText=", this.buttonText, ")");
                    }
                }

                public final class PendingDirectDepositInfo {
                    public final String buttonText;
                    public final PendingDirectDepositHalfSheet halfSheet;
                    public final String secondaryButtonText;

                    public PendingDirectDepositInfo(String str, String str2, PendingDirectDepositHalfSheet pendingDirectDepositHalfSheet) {
                        this.buttonText = str;
                        this.secondaryButtonText = str2;
                        this.halfSheet = pendingDirectDepositHalfSheet;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PendingDirectDepositInfo)) {
                            return false;
                        }
                        PendingDirectDepositInfo pendingDirectDepositInfo = (PendingDirectDepositInfo) obj;
                        return this.buttonText.equals(pendingDirectDepositInfo.buttonText) && this.secondaryButtonText.equals(pendingDirectDepositInfo.secondaryButtonText) && Intrinsics.areEqual(this.halfSheet, pendingDirectDepositInfo.halfSheet);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.buttonText.hashCode() * 31, 31, this.secondaryButtonText);
                        PendingDirectDepositHalfSheet pendingDirectDepositHalfSheet = this.halfSheet;
                        return m + (pendingDirectDepositHalfSheet == null ? 0 : pendingDirectDepositHalfSheet.hashCode());
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PendingDirectDepositInfo(buttonText=", this.buttonText, ", secondaryButtonText=", this.secondaryButtonText, ", halfSheet=");
                        m.append(this.halfSheet);
                        m.append(")");
                        return m.toString();
                    }
                }

                public AddOrUpdateDirectDepositSection(ArrayList arrayList, String str, String str2, String str3, PendingDirectDepositInfo pendingDirectDepositInfo) {
                    str2.getClass();
                    str3.getClass();
                    this.visibilityPredicates = arrayList;
                    this.buttonText = str;
                    this.buttonClientRoute = str2;
                    this.denylistedCustomerClientRoute = str3;
                    this.pendingDirectDepositInfo = pendingDirectDepositInfo;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AddOrUpdateDirectDepositSection)) {
                        return false;
                    }
                    AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (AddOrUpdateDirectDepositSection) obj;
                    return this.visibilityPredicates.equals(addOrUpdateDirectDepositSection.visibilityPredicates) && this.buttonText.equals(addOrUpdateDirectDepositSection.buttonText) && Intrinsics.areEqual(this.buttonClientRoute, addOrUpdateDirectDepositSection.buttonClientRoute) && Intrinsics.areEqual(this.denylistedCustomerClientRoute, addOrUpdateDirectDepositSection.denylistedCustomerClientRoute) && Intrinsics.areEqual(this.pendingDirectDepositInfo, addOrUpdateDirectDepositSection.pendingDirectDepositInfo);
                }

                @Override // com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection
                public final List getVisibilityPredicates() {
                    return this.visibilityPredicates;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.visibilityPredicates.hashCode() * 31, 31, this.buttonText), 31, this.buttonClientRoute), 31, this.denylistedCustomerClientRoute);
                    PendingDirectDepositInfo pendingDirectDepositInfo = this.pendingDirectDepositInfo;
                    return m + (pendingDirectDepositInfo == null ? 0 : pendingDirectDepositInfo.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AddOrUpdateDirectDepositSection(visibilityPredicates=");
                    sb.append(this.visibilityPredicates);
                    sb.append(", buttonText=");
                    sb.append(this.buttonText);
                    sb.append(", buttonClientRoute=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.buttonClientRoute, ", denylistedCustomerClientRoute=", this.denylistedCustomerClientRoute, ", pendingDirectDepositInfo=");
                    sb.append(this.pendingDirectDepositInfo);
                    sb.append(")");
                    return sb.toString();
                }
            }

            /* loaded from: classes6.dex */
            public final class DistributionNuxSection implements PaychecksHomeSection {
                public final String callToActionClientRoute;
                public final String callToActionText;
                public final Image headerImage;
                public final String subtitle;
                public final String title;
                public final ArrayList visibilityPredicates;

                public DistributionNuxSection(ArrayList arrayList, Image image, String str, String str2, String str3, String str4) {
                    str.getClass();
                    this.visibilityPredicates = arrayList;
                    this.headerImage = image;
                    this.callToActionClientRoute = str;
                    this.title = str2;
                    this.subtitle = str3;
                    this.callToActionText = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DistributionNuxSection)) {
                        return false;
                    }
                    DistributionNuxSection distributionNuxSection = (DistributionNuxSection) obj;
                    return this.visibilityPredicates.equals(distributionNuxSection.visibilityPredicates) && Intrinsics.areEqual(this.headerImage, distributionNuxSection.headerImage) && Intrinsics.areEqual(this.callToActionClientRoute, distributionNuxSection.callToActionClientRoute) && this.title.equals(distributionNuxSection.title) && this.subtitle.equals(distributionNuxSection.subtitle) && this.callToActionText.equals(distributionNuxSection.callToActionText);
                }

                @Override // com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection
                public final List getVisibilityPredicates() {
                    return this.visibilityPredicates;
                }

                public final int hashCode() {
                    int hashCode = this.visibilityPredicates.hashCode() * 31;
                    Image image = this.headerImage;
                    return this.callToActionText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.callToActionClientRoute), 31, this.title), 31, this.subtitle);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DistributionNuxSection(visibilityPredicates=");
                    sb.append(this.visibilityPredicates);
                    sb.append(", headerImage=");
                    sb.append(this.headerImage);
                    sb.append(", callToActionClientRoute=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.callToActionClientRoute, ", title=", this.title, ", subtitle=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", callToActionText=", this.callToActionText, ")");
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes10.dex */
            public final class SectionVisibilityPredicate {
                public static final /* synthetic */ SectionVisibilityPredicate[] $VALUES;
                public static final SectionVisibilityPredicate ALWAYS_VISIBLE;
                public static final SectionVisibilityPredicate CURRENT_DISTRIBUTION_SET;
                public static final SectionVisibilityPredicate CUSTOMER_DDA_IS_NOT_LOCKED;
                public static final SectionVisibilityPredicate CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING;
                public static final SectionVisibilityPredicate CUSTOMER_IS_NOT_DENYLISTED;
                public static final SectionVisibilityPredicate NO_CURRENT_DISTRIBUTION_SET;
                public static final SectionVisibilityPredicate UNKNOWN;

                static {
                    SectionVisibilityPredicate sectionVisibilityPredicate = new SectionVisibilityPredicate("ALWAYS_VISIBLE", 0);
                    ALWAYS_VISIBLE = sectionVisibilityPredicate;
                    SectionVisibilityPredicate sectionVisibilityPredicate2 = new SectionVisibilityPredicate("CURRENT_DISTRIBUTION_SET", 1);
                    CURRENT_DISTRIBUTION_SET = sectionVisibilityPredicate2;
                    SectionVisibilityPredicate sectionVisibilityPredicate3 = new SectionVisibilityPredicate("NO_CURRENT_DISTRIBUTION_SET", 2);
                    NO_CURRENT_DISTRIBUTION_SET = sectionVisibilityPredicate3;
                    SectionVisibilityPredicate sectionVisibilityPredicate4 = new SectionVisibilityPredicate("CUSTOMER_DDA_IS_NOT_LOCKED", 3);
                    CUSTOMER_DDA_IS_NOT_LOCKED = sectionVisibilityPredicate4;
                    SectionVisibilityPredicate sectionVisibilityPredicate5 = new SectionVisibilityPredicate("CUSTOMER_IS_NOT_DENYLISTED", 4);
                    CUSTOMER_IS_NOT_DENYLISTED = sectionVisibilityPredicate5;
                    SectionVisibilityPredicate sectionVisibilityPredicate6 = new SectionVisibilityPredicate("CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING", 5);
                    CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING = sectionVisibilityPredicate6;
                    SectionVisibilityPredicate sectionVisibilityPredicate7 = new SectionVisibilityPredicate("UNKNOWN", 6);
                    UNKNOWN = sectionVisibilityPredicate7;
                    $VALUES = new SectionVisibilityPredicate[]{sectionVisibilityPredicate, sectionVisibilityPredicate2, sectionVisibilityPredicate3, sectionVisibilityPredicate4, sectionVisibilityPredicate5, sectionVisibilityPredicate6, sectionVisibilityPredicate7};
                }

                public static SectionVisibilityPredicate valueOf(String str) {
                    return (SectionVisibilityPredicate) Enum.valueOf(SectionVisibilityPredicate.class, str);
                }

                public static SectionVisibilityPredicate[] values() {
                    return (SectionVisibilityPredicate[]) $VALUES.clone();
                }
            }

            List getVisibilityPredicates();
        }

        public PaychecksHomeUi(PaychecksHeader paychecksHeader, ArrayList arrayList, List list, String str) {
            list.getClass();
            this.header = paychecksHeader;
            this.sections = arrayList;
            this.termsOfService = list;
            this.bankingBenefitsBookletClientRoute = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksHomeUi)) {
                return false;
            }
            PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
            return Intrinsics.areEqual(this.header, paychecksHomeUi.header) && this.sections.equals(paychecksHomeUi.sections) && Intrinsics.areEqual(this.termsOfService, paychecksHomeUi.termsOfService) && Intrinsics.areEqual(this.bankingBenefitsBookletClientRoute, paychecksHomeUi.bankingBenefitsBookletClientRoute);
        }

        public final int hashCode() {
            PaychecksHeader paychecksHeader = this.header;
            int m = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.sections, (paychecksHeader == null ? 0 : paychecksHeader.hashCode()) * 31, 31), 31, this.termsOfService);
            String str = this.bankingBenefitsBookletClientRoute;
            return m + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "PaychecksHomeUi(header=" + this.header + ", sections=" + this.sections + ", termsOfService=" + this.termsOfService + ", bankingBenefitsBookletClientRoute=" + this.bankingBenefitsBookletClientRoute + ")";
        }
    }

    public PaychecksUiConfiguration(PaychecksHomeUi paychecksHomeUi, PaychecksDistributionSummaryUi paychecksDistributionSummaryUi, ArrayList arrayList, ArrayList arrayList2) {
        this.home = paychecksHomeUi;
        this.distributionSummary = paychecksDistributionSummaryUi;
        this.destinationUiConfigs = arrayList;
        this.productTintWheelColorLists = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksUiConfiguration)) {
            return false;
        }
        PaychecksUiConfiguration paychecksUiConfiguration = (PaychecksUiConfiguration) obj;
        return this.home.equals(paychecksUiConfiguration.home) && this.distributionSummary.equals(paychecksUiConfiguration.distributionSummary) && this.destinationUiConfigs.equals(paychecksUiConfiguration.destinationUiConfigs) && this.productTintWheelColorLists.equals(paychecksUiConfiguration.productTintWheelColorLists);
    }

    public final int hashCode() {
        return this.productTintWheelColorLists.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.destinationUiConfigs, (this.distributionSummary.hashCode() + (this.home.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PaychecksUiConfiguration(home=" + this.home + ", distributionSummary=" + this.distributionSummary + ", destinationUiConfigs=" + this.destinationUiConfigs + ", productTintWheelColorLists=" + this.productTintWheelColorLists + ")";
    }
}
