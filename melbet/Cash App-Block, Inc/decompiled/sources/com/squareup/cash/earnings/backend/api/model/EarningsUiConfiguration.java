package com.squareup.cash.earnings.backend.api.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsUiConfiguration {
    public final List destinationUiConfigs;
    public final EarningsHomeUi home;
    public final List productTintWheelColorLists;

    public final class EarningsHomeUi {
        public final ArrayList sections;

        public interface EarningsHomeSection {

            public final class ActionButtonsSection implements EarningsHomeSection {
                public final ArrayList buttons;

                public final class ActionButtonItem {
                    public final String clientRouteURL;
                    public final String text;

                    public ActionButtonItem(String str, String str2) {
                        this.text = str;
                        this.clientRouteURL = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ActionButtonItem)) {
                            return false;
                        }
                        ActionButtonItem actionButtonItem = (ActionButtonItem) obj;
                        return this.text.equals(actionButtonItem.text) && this.clientRouteURL.equals(actionButtonItem.clientRouteURL);
                    }

                    public final int hashCode() {
                        return this.clientRouteURL.hashCode() + (this.text.hashCode() * 31);
                    }

                    public final String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m("ActionButtonItem(text=", this.text, ", clientRouteURL=", this.clientRouteURL, ")");
                    }
                }

                public ActionButtonsSection(ArrayList arrayList) {
                    this.buttons = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ActionButtonsSection) && this.buttons.equals(((ActionButtonsSection) obj).buttons);
                }

                public final int hashCode() {
                    return this.buttons.hashCode();
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m("ActionButtonsSection(buttons=", ")", this.buttons);
                }
            }

            public final class ActiveDistributionSection implements EarningsHomeSection {
                public final String editButtonClientRoute;
                public final String editButtonText;
                public final List streamAvatars;
                public final String title;

                public ActiveDistributionSection(String str, String str2, String str3, List list) {
                    list.getClass();
                    this.title = str;
                    this.editButtonText = str2;
                    this.editButtonClientRoute = str3;
                    this.streamAvatars = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActiveDistributionSection)) {
                        return false;
                    }
                    ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
                    return this.title.equals(activeDistributionSection.title) && this.editButtonText.equals(activeDistributionSection.editButtonText) && this.editButtonClientRoute.equals(activeDistributionSection.editButtonClientRoute) && Intrinsics.areEqual(this.streamAvatars, activeDistributionSection.streamAvatars);
                }

                public final int hashCode() {
                    return this.streamAvatars.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.editButtonText), 31, this.editButtonClientRoute);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActiveDistributionSection(title=", this.title, ", editButtonText=", this.editButtonText, ", editButtonClientRoute=");
                    m.append(this.editButtonClientRoute);
                    m.append(", streamAvatars=");
                    m.append(this.streamAvatars);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class ActivitySection implements EarningsHomeSection {
                public final String loadFailureSubtitle;
                public final String noActivitySubtitle;
                public final String staleActivityTitle;
                public final String title;
                public final String viewAllButtonTitle;

                public ActivitySection(String str, String str2, String str3, String str4, String str5) {
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
                    return this.title.equals(activitySection.title) && this.staleActivityTitle.equals(activitySection.staleActivityTitle) && Intrinsics.areEqual(this.noActivitySubtitle, activitySection.noActivitySubtitle) && Intrinsics.areEqual(this.loadFailureSubtitle, activitySection.loadFailureSubtitle) && this.viewAllButtonTitle.equals(activitySection.viewAllButtonTitle);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.staleActivityTitle);
                    String str = this.noActivitySubtitle;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.loadFailureSubtitle;
                    return this.viewAllButtonTitle.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivitySection(title=", this.title, ", staleActivityTitle=", this.staleActivityTitle, ", noActivitySubtitle=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.noActivitySubtitle, ", loadFailureSubtitle=", this.loadFailureSubtitle, ", viewAllButtonTitle=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.viewAllButtonTitle, ")");
                }
            }

            public final class DistributionNuxSection implements EarningsHomeSection {
                public final String callToActionClientRoute;
                public final String callToActionText;
                public final Image headerImage;
                public final String subtitle;
                public final String title;

                public DistributionNuxSection(Image image, String str, String str2, String str3, String str4) {
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
                    return Intrinsics.areEqual(this.headerImage, distributionNuxSection.headerImage) && this.callToActionClientRoute.equals(distributionNuxSection.callToActionClientRoute) && this.title.equals(distributionNuxSection.title) && this.subtitle.equals(distributionNuxSection.subtitle) && this.callToActionText.equals(distributionNuxSection.callToActionText);
                }

                public final int hashCode() {
                    Image image = this.headerImage;
                    return this.callToActionText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.callToActionClientRoute), 31, this.title), 31, this.subtitle);
                }

                public final String toString() {
                    StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.headerImage, "DistributionNuxSection(headerImage=", ", callToActionClientRoute=", this.callToActionClientRoute, ", title=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", subtitle=", this.subtitle, ", callToActionText=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.callToActionText, ")");
                }
            }

            public final class EarningToolsSection implements EarningsHomeSection {
                public final String title;
                public final ArrayList tools;

                public interface EarningToolItem {

                    public final class AddPaycheck implements EarningToolItem {
                        public final String clientRoute;
                        public final String subtitle;
                        public final String title;

                        public AddPaycheck(String str, String str2, String str3) {
                            this.title = str;
                            this.subtitle = str2;
                            this.clientRoute = str3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof AddPaycheck)) {
                                return false;
                            }
                            AddPaycheck addPaycheck = (AddPaycheck) obj;
                            return this.title.equals(addPaycheck.title) && Intrinsics.areEqual(this.subtitle, addPaycheck.subtitle) && this.clientRoute.equals(addPaycheck.clientRoute);
                        }

                        public final int hashCode() {
                            int hashCode = this.title.hashCode() * 31;
                            String str = this.subtitle;
                            return this.clientRoute.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddPaycheck(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute="), this.clientRoute, ")");
                        }
                    }

                    public final class EarnerMode implements EarningToolItem {
                        public final String clientRoute;
                        public final Instant earnerModeEndsAt;
                        public final boolean isEnabled;
                        public final EarnerModeSheetData sheetData;
                        public final String subtitle;
                        public final String title;

                        public EarnerMode(String str, String str2, boolean z, Instant instant, String str3, EarnerModeSheetData earnerModeSheetData) {
                            this.title = str;
                            this.subtitle = str2;
                            this.isEnabled = z;
                            this.earnerModeEndsAt = instant;
                            this.clientRoute = str3;
                            this.sheetData = earnerModeSheetData;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof EarnerMode)) {
                                return false;
                            }
                            EarnerMode earnerMode = (EarnerMode) obj;
                            return this.title.equals(earnerMode.title) && Intrinsics.areEqual(this.subtitle, earnerMode.subtitle) && this.isEnabled == earnerMode.isEnabled && Intrinsics.areEqual(this.earnerModeEndsAt, earnerMode.earnerModeEndsAt) && Intrinsics.areEqual(this.clientRoute, earnerMode.clientRoute) && Intrinsics.areEqual(this.sheetData, earnerMode.sheetData);
                        }

                        public final int hashCode() {
                            int hashCode = this.title.hashCode() * 31;
                            String str = this.subtitle;
                            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isEnabled);
                            Instant instant = this.earnerModeEndsAt;
                            int hashCode2 = (m + (instant == null ? 0 : instant.hashCode())) * 31;
                            String str2 = this.clientRoute;
                            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                            EarnerModeSheetData earnerModeSheetData = this.sheetData;
                            return hashCode3 + (earnerModeSheetData != null ? earnerModeSheetData.hashCode() : 0);
                        }

                        public final String toString() {
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarnerMode(title=", this.title, ", subtitle=", this.subtitle, ", isEnabled=");
                            m.append(this.isEnabled);
                            m.append(", earnerModeEndsAt=");
                            m.append(this.earnerModeEndsAt);
                            m.append(", clientRoute=");
                            m.append(this.clientRoute);
                            m.append(", sheetData=");
                            m.append(this.sheetData);
                            m.append(")");
                            return m.toString();
                        }
                    }

                    public final class EarnerModeSheetData {
                        public final String body;
                        public final ArrayList durationOptions;
                        public final String primaryButtonText;
                        public final String title;

                        public final class DurationOption {
                            public final long seconds;

                            public DurationOption(long j) {
                                this.seconds = j;
                            }

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof DurationOption) && this.seconds == ((DurationOption) obj).seconds;
                            }

                            public final int hashCode() {
                                return Long.hashCode(this.seconds);
                            }

                            public final String toString() {
                                return Boxes$$ExternalSyntheticOutline1.m(this.seconds, "DurationOption(seconds=", ")");
                            }
                        }

                        public EarnerModeSheetData(String str, String str2, String str3, ArrayList arrayList) {
                            this.title = str;
                            this.body = str2;
                            this.durationOptions = arrayList;
                            this.primaryButtonText = str3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof EarnerModeSheetData)) {
                                return false;
                            }
                            EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
                            return this.title.equals(earnerModeSheetData.title) && this.body.equals(earnerModeSheetData.body) && this.durationOptions.equals(earnerModeSheetData.durationOptions) && this.primaryButtonText.equals(earnerModeSheetData.primaryButtonText);
                        }

                        public final int hashCode() {
                            return this.primaryButtonText.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.durationOptions, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31);
                        }

                        public final String toString() {
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarnerModeSheetData(title=", this.title, ", body=", this.body, ", durationOptions=");
                            m.append(this.durationOptions);
                            m.append(", primaryButtonText=");
                            m.append(this.primaryButtonText);
                            m.append(")");
                            return m.toString();
                        }
                    }

                    public final class EarnerOnboarding implements EarningToolItem {
                        public final String clientRoute;
                        public final String subtitle;
                        public final String title;

                        public EarnerOnboarding(String str, String str2, String str3) {
                            this.title = str;
                            this.subtitle = str2;
                            this.clientRoute = str3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof EarnerOnboarding)) {
                                return false;
                            }
                            EarnerOnboarding earnerOnboarding = (EarnerOnboarding) obj;
                            return this.title.equals(earnerOnboarding.title) && Intrinsics.areEqual(this.subtitle, earnerOnboarding.subtitle) && this.clientRoute.equals(earnerOnboarding.clientRoute);
                        }

                        public final int hashCode() {
                            int hashCode = this.title.hashCode() * 31;
                            String str = this.subtitle;
                            return this.clientRoute.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarnerOnboarding(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute="), this.clientRoute, ")");
                        }
                    }

                    public final class ManageCustomers implements EarningToolItem {
                        public final String clientRoute;
                        public final String subtitle;
                        public final String title;

                        public ManageCustomers(String str, String str2, String str3) {
                            this.title = str;
                            this.subtitle = str2;
                            this.clientRoute = str3;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof ManageCustomers)) {
                                return false;
                            }
                            ManageCustomers manageCustomers = (ManageCustomers) obj;
                            return this.title.equals(manageCustomers.title) && Intrinsics.areEqual(this.subtitle, manageCustomers.subtitle) && this.clientRoute.equals(manageCustomers.clientRoute);
                        }

                        public final int hashCode() {
                            int hashCode = this.title.hashCode() * 31;
                            String str = this.subtitle;
                            return this.clientRoute.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManageCustomers(title=", this.title, ", subtitle=", this.subtitle, ", clientRoute="), this.clientRoute, ")");
                        }
                    }

                    public final class PaycheckDistribution implements EarningToolItem {
                        public final List avatars;
                        public final String clientRoute;
                        public final String title;

                        public PaycheckDistribution(String str, String str2, List list) {
                            list.getClass();
                            this.title = str;
                            this.avatars = list;
                            this.clientRoute = str2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof PaycheckDistribution)) {
                                return false;
                            }
                            PaycheckDistribution paycheckDistribution = (PaycheckDistribution) obj;
                            return this.title.equals(paycheckDistribution.title) && Intrinsics.areEqual(this.avatars, paycheckDistribution.avatars) && this.clientRoute.equals(paycheckDistribution.clientRoute);
                        }

                        public final int hashCode() {
                            return this.clientRoute.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.avatars);
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("PaycheckDistribution(title=", this.title, ", avatars=", ", clientRoute=", this.avatars), this.clientRoute, ")");
                        }
                    }
                }

                public EarningToolsSection(String str, ArrayList arrayList) {
                    this.title = str;
                    this.tools = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EarningToolsSection)) {
                        return false;
                    }
                    EarningToolsSection earningToolsSection = (EarningToolsSection) obj;
                    return Intrinsics.areEqual(this.title, earningToolsSection.title) && this.tools.equals(earningToolsSection.tools);
                }

                public final int hashCode() {
                    String str = this.title;
                    return this.tools.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    return NavAction$$ExternalSyntheticOutline0.m(this.tools, "EarningToolsSection(title=", this.title, ", tools=", ")");
                }
            }

            public final class FdicFooterSection implements EarningsHomeSection {
                public static final FdicFooterSection INSTANCE = new FdicFooterSection();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof FdicFooterSection);
                }

                public final int hashCode() {
                    return -1457902998;
                }

                public final String toString() {
                    return "FdicFooterSection";
                }
            }

            public final class HeaderSection implements EarningsHomeSection {
                public final String title;

                public HeaderSection(String str) {
                    this.title = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof HeaderSection) && Intrinsics.areEqual(this.title, ((HeaderSection) obj).title);
                }

                public final int hashCode() {
                    String str = this.title;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeaderSection(title=", this.title, ")");
                }
            }
        }

        public EarningsHomeUi(ArrayList arrayList) {
            this.sections = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EarningsHomeUi) && this.sections.equals(((EarningsHomeUi) obj).sections);
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("EarningsHomeUi(sections=", ")", this.sections);
        }
    }

    public EarningsUiConfiguration(EarningsHomeUi earningsHomeUi, EmptyList emptyList, EmptyList emptyList2) {
        emptyList.getClass();
        emptyList2.getClass();
        this.home = earningsHomeUi;
        this.destinationUiConfigs = emptyList;
        this.productTintWheelColorLists = emptyList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsUiConfiguration)) {
            return false;
        }
        EarningsUiConfiguration earningsUiConfiguration = (EarningsUiConfiguration) obj;
        return this.home.equals(earningsUiConfiguration.home) && Intrinsics.areEqual(this.destinationUiConfigs, earningsUiConfiguration.destinationUiConfigs) && Intrinsics.areEqual(this.productTintWheelColorLists, earningsUiConfiguration.productTintWheelColorLists);
    }

    public final int hashCode() {
        return this.productTintWheelColorLists.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.home.sections.hashCode() * 31, 31, this.destinationUiConfigs);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsUiConfiguration(home=");
        sb.append(this.home);
        sb.append(", destinationUiConfigs=");
        sb.append(this.destinationUiConfigs);
        sb.append(", productTintWheelColorLists=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.productTintWheelColorLists, ")");
    }
}
