package com.squareup.cash.retro.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public final class SelectPaymentPlanViewModel {
    public final ButtonState confirmButtonState;
    public final String confirmButtonTitle;
    public final SelectPaymentPlanHalfSheet halfSheet;
    public final HeaderSection headerSection;
    public final PaymentsTimelineSection paymentsTimelineSection;
    public final boolean requiresFullScroll;
    public final SummarySection summarySection;

    public interface ButtonState {

        public final class Loaded implements ButtonState {
            public final boolean enabled;

            public Loaded(boolean z) {
                this.enabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && this.enabled == ((Loaded) obj).enabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Loaded(enabled=", ")", this.enabled);
            }
        }

        public final class Loading implements ButtonState {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1792259277;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public final class HeaderSection {
        public final StackedAvatarViewModel.Avatar avatar;
        public final AvatarBadgeViewModel avatarBadge;
        public final String bodyPrimaryText;
        public final String bodySecondaryText;
        public final String subtitle;
        public final String title;

        public HeaderSection(StackedAvatarViewModel.Avatar avatar, AvatarBadgeViewModel avatarBadgeViewModel, String str, String str2, String str3, String str4) {
            avatar.getClass();
            str.getClass();
            this.avatar = avatar;
            this.avatarBadge = avatarBadgeViewModel;
            this.title = str;
            this.subtitle = str2;
            this.bodyPrimaryText = str3;
            this.bodySecondaryText = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) obj;
            return Intrinsics.areEqual(this.avatar, headerSection.avatar) && Intrinsics.areEqual(this.avatarBadge, headerSection.avatarBadge) && Intrinsics.areEqual(this.title, headerSection.title) && Intrinsics.areEqual(this.subtitle, headerSection.subtitle) && Intrinsics.areEqual(this.bodyPrimaryText, headerSection.bodyPrimaryText) && Intrinsics.areEqual(this.bodySecondaryText, headerSection.bodySecondaryText);
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            AvatarBadgeViewModel avatarBadgeViewModel = this.avatarBadge;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (avatarBadgeViewModel == null ? 0 : avatarBadgeViewModel.hashCode())) * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bodyPrimaryText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bodySecondaryText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderSection(avatar=");
            sb.append(this.avatar);
            sb.append(", avatarBadge=");
            sb.append(this.avatarBadge);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", bodyPrimaryText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.bodyPrimaryText, ", bodySecondaryText=", this.bodySecondaryText, ")");
        }
    }

    public final class PaymentPlanOption {
        public final boolean selected;
        public final String subtitle;
        public final String title;
        public final String token;

        public PaymentPlanOption(String str, String str2, String str3, boolean z) {
            this.token = str;
            this.title = str2;
            this.subtitle = str3;
            this.selected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentPlanOption)) {
                return false;
            }
            PaymentPlanOption paymentPlanOption = (PaymentPlanOption) obj;
            return this.token.equals(paymentPlanOption.token) && this.title.equals(paymentPlanOption.title) && Intrinsics.areEqual(this.subtitle, paymentPlanOption.subtitle) && this.selected == paymentPlanOption.selected;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            return Boolean.hashCode(this.selected) + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentPlanOption(token=", this.token, ", title=", this.title, ", subtitle="), this.subtitle, ", selected=", this.selected, ")");
        }
    }

    public final class PaymentsTimelineSection {
        public final String description;
        public final ListUnordered footerList;
        public final String optionsConfigButtonTitle;
        public final SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet;
        public final ArrayList timelineEvents;
        public final String title;

        public PaymentsTimelineSection(String str, String str2, SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet, ArrayList arrayList, String str3, ListUnordered listUnordered) {
            str.getClass();
            this.title = str;
            this.optionsConfigButtonTitle = str2;
            this.optionsConfigSheet = optionsConfigSheet;
            this.timelineEvents = arrayList;
            this.description = str3;
            this.footerList = listUnordered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentsTimelineSection)) {
                return false;
            }
            PaymentsTimelineSection paymentsTimelineSection = (PaymentsTimelineSection) obj;
            return Intrinsics.areEqual(this.title, paymentsTimelineSection.title) && Intrinsics.areEqual(this.optionsConfigButtonTitle, paymentsTimelineSection.optionsConfigButtonTitle) && Intrinsics.areEqual(this.optionsConfigSheet, paymentsTimelineSection.optionsConfigSheet) && this.timelineEvents.equals(paymentsTimelineSection.timelineEvents) && Intrinsics.areEqual(this.description, paymentsTimelineSection.description) && Intrinsics.areEqual(this.footerList, paymentsTimelineSection.footerList);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.optionsConfigButtonTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet = this.optionsConfigSheet;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.timelineEvents, (hashCode2 + (optionsConfigSheet == null ? 0 : optionsConfigSheet.hashCode())) * 31, 31);
            String str2 = this.description;
            int hashCode3 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            ListUnordered listUnordered = this.footerList;
            return hashCode3 + (listUnordered != null ? listUnordered.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentsTimelineSection(title=", this.title, ", optionsConfigButtonTitle=", this.optionsConfigButtonTitle, ", optionsConfigSheet=");
            m.append(this.optionsConfigSheet);
            m.append(", timelineEvents=");
            m.append(this.timelineEvents);
            m.append(", description=");
            m.append(this.description);
            m.append(", footerList=");
            m.append(this.footerList);
            m.append(")");
            return m.toString();
        }
    }

    public interface SelectPaymentPlanHalfSheet {

        public final class InfoHalfSheet implements SelectPaymentPlanHalfSheet {
            public final String body;
            public final String dismissButtonTitle;
            public final String title;

            public InfoHalfSheet(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.body = str2;
                this.dismissButtonTitle = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoHalfSheet)) {
                    return false;
                }
                InfoHalfSheet infoHalfSheet = (InfoHalfSheet) obj;
                return Intrinsics.areEqual(this.title, infoHalfSheet.title) && Intrinsics.areEqual(this.body, infoHalfSheet.body) && Intrinsics.areEqual(this.dismissButtonTitle, infoHalfSheet.dismissButtonTitle);
            }

            public final int hashCode() {
                return this.dismissButtonTitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InfoHalfSheet(title=", this.title, ", body=", this.body, ", dismissButtonTitle="), this.dismissButtonTitle, ")");
            }
        }

        public final class OptionsConfigSheet implements SelectPaymentPlanHalfSheet {
            public final List options;
            public final String subtitle;
            public final String title;
            public final ButtonState updateButtonState;
            public final String updateButtonTitle;

            public OptionsConfigSheet(String str, String str2, String str3, ButtonState buttonState, List list) {
                str.getClass();
                str3.getClass();
                this.title = str;
                this.subtitle = str2;
                this.updateButtonTitle = str3;
                this.updateButtonState = buttonState;
                this.options = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OptionsConfigSheet)) {
                    return false;
                }
                OptionsConfigSheet optionsConfigSheet = (OptionsConfigSheet) obj;
                return Intrinsics.areEqual(this.title, optionsConfigSheet.title) && Intrinsics.areEqual(this.subtitle, optionsConfigSheet.subtitle) && Intrinsics.areEqual(this.updateButtonTitle, optionsConfigSheet.updateButtonTitle) && this.updateButtonState.equals(optionsConfigSheet.updateButtonState) && this.options.equals(optionsConfigSheet.options);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                return this.options.hashCode() + ((this.updateButtonState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.updateButtonTitle)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OptionsConfigSheet(title=", this.title, ", subtitle=", this.subtitle, ", updateButtonTitle=");
                m.append(this.updateButtonTitle);
                m.append(", updateButtonState=");
                m.append(this.updateButtonState);
                m.append(", options=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.options, ")");
            }
        }
    }

    public final class SummaryRow {
        public final SelectPaymentPlanHalfSheet.InfoHalfSheet infoSheet;
        public final String leftPrimaryMarkdownText;
        public final String rightSecondaryMarkdownText;
        public final String subtitle;

        public SummaryRow(String str, String str2, String str3, SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet) {
            this.leftPrimaryMarkdownText = str;
            this.rightSecondaryMarkdownText = str2;
            this.subtitle = str3;
            this.infoSheet = infoHalfSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryRow)) {
                return false;
            }
            SummaryRow summaryRow = (SummaryRow) obj;
            return this.leftPrimaryMarkdownText.equals(summaryRow.leftPrimaryMarkdownText) && Intrinsics.areEqual(this.rightSecondaryMarkdownText, summaryRow.rightSecondaryMarkdownText) && Intrinsics.areEqual(this.subtitle, summaryRow.subtitle) && Intrinsics.areEqual(this.infoSheet, summaryRow.infoSheet);
        }

        public final int hashCode() {
            int hashCode = this.leftPrimaryMarkdownText.hashCode() * 31;
            String str = this.rightSecondaryMarkdownText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = this.infoSheet;
            return hashCode3 + (infoHalfSheet != null ? infoHalfSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SummaryRow(leftPrimaryMarkdownText=", this.leftPrimaryMarkdownText, ", rightSecondaryMarkdownText=", this.rightSecondaryMarkdownText, ", subtitle=");
            m.append(this.subtitle);
            m.append(", infoSheet=");
            m.append(this.infoSheet);
            m.append(")");
            return m.toString();
        }
    }

    public final class SummarySection {
        public final ArrayList rowItems;

        public SummarySection(ArrayList arrayList) {
            this.rowItems = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SummarySection) && this.rowItems.equals(((SummarySection) obj).rowItems);
        }

        public final int hashCode() {
            return this.rowItems.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("SummarySection(rowItems=", ")", this.rowItems);
        }
    }

    public final class TimelineEvent {
        public final String body;
        public final SelectPaymentPlanHalfSheet.InfoHalfSheet infoSheet;
        public final SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State state;
        public final String title;
        public final String value;

        public TimelineEvent(String str, String str2, SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State state, String str3, SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet) {
            this.title = str;
            this.value = str2;
            this.state = state;
            this.body = str3;
            this.infoSheet = infoHalfSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimelineEvent)) {
                return false;
            }
            TimelineEvent timelineEvent = (TimelineEvent) obj;
            return this.title.equals(timelineEvent.title) && this.value.equals(timelineEvent.value) && this.state == timelineEvent.state && Intrinsics.areEqual(this.body, timelineEvent.body) && Intrinsics.areEqual(this.infoSheet, timelineEvent.infoSheet);
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.value)) * 31;
            String str = this.body;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = this.infoSheet;
            return hashCode2 + (infoHalfSheet != null ? infoHalfSheet.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimelineEvent(title=", this.title, ", value=", this.value, ", state=");
            m.append(this.state);
            m.append(", body=");
            m.append(this.body);
            m.append(", infoSheet=");
            m.append(this.infoSheet);
            m.append(")");
            return m.toString();
        }
    }

    public SelectPaymentPlanViewModel(HeaderSection headerSection, PaymentsTimelineSection paymentsTimelineSection, SummarySection summarySection, String str, ButtonState buttonState, boolean z, SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet) {
        str.getClass();
        buttonState.getClass();
        this.headerSection = headerSection;
        this.paymentsTimelineSection = paymentsTimelineSection;
        this.summarySection = summarySection;
        this.confirmButtonTitle = str;
        this.confirmButtonState = buttonState;
        this.requiresFullScroll = z;
        this.halfSheet = selectPaymentPlanHalfSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectPaymentPlanViewModel)) {
            return false;
        }
        SelectPaymentPlanViewModel selectPaymentPlanViewModel = (SelectPaymentPlanViewModel) obj;
        return this.headerSection.equals(selectPaymentPlanViewModel.headerSection) && this.paymentsTimelineSection.equals(selectPaymentPlanViewModel.paymentsTimelineSection) && this.summarySection.equals(selectPaymentPlanViewModel.summarySection) && Intrinsics.areEqual(this.confirmButtonTitle, selectPaymentPlanViewModel.confirmButtonTitle) && Intrinsics.areEqual(this.confirmButtonState, selectPaymentPlanViewModel.confirmButtonState) && this.requiresFullScroll == selectPaymentPlanViewModel.requiresFullScroll && Intrinsics.areEqual(this.halfSheet, selectPaymentPlanViewModel.halfSheet);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.confirmButtonState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.summarySection.rowItems, (this.paymentsTimelineSection.hashCode() + (this.headerSection.hashCode() * 31)) * 31, 31), 31, this.confirmButtonTitle)) * 31, 31, this.requiresFullScroll);
        SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet = this.halfSheet;
        return m + (selectPaymentPlanHalfSheet == null ? 0 : selectPaymentPlanHalfSheet.hashCode());
    }

    public final String toString() {
        return "SelectPaymentPlanViewModel(headerSection=" + this.headerSection + ", paymentsTimelineSection=" + this.paymentsTimelineSection + ", summarySection=" + this.summarySection + ", confirmButtonTitle=" + this.confirmButtonTitle + ", confirmButtonState=" + this.confirmButtonState + ", requiresFullScroll=" + this.requiresFullScroll + ", halfSheet=" + this.halfSheet + ")";
    }
}
