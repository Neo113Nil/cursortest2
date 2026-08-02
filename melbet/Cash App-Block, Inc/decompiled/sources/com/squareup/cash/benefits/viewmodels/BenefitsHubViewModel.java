package com.squareup.cash.benefits.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.app.Prominence;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BenefitsHubViewModel {

    public final class Error extends BenefitsHubViewModel {
        public final String buttonText;
        public final boolean retryable;
        public final String subtitle;
        public final String title;

        public Error(String str, String str2, String str3, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.subtitle = str2;
            this.buttonText = str3;
            this.retryable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.subtitle, error.subtitle) && Intrinsics.areEqual(this.buttonText, error.buttonText) && this.retryable == error.retryable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.retryable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.buttonText);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", subtitle=", this.subtitle, ", buttonText="), this.buttonText, ", retryable=", this.retryable, ")");
        }
    }

    public final class Loaded extends BenefitsHubViewModel {
        public final BenefitsViewModel benefits;
        public final CallToActionViewModel callToAction;
        public final CommonQuestionsViewModel commonQuestions;
        public final DefaultPerksViewModel defaultPerks;
        public final List disclosures;
        public final PageHeaderViewModel header;
        public final List insights;

        public final class BenefitsViewModel {
            public final String openExplanationText;
            public final Color openExplanationTextColor;
            public final List rows;

            public final class BenefitsRow {
                public final RowAction.ID actionId;
                public final String actionText;
                public final String clientRoute;
                public final boolean disabled;
                public final TintedIcon icon;
                public final String subtitle;
                public final String title;

                public BenefitsRow(TintedIcon tintedIcon, String str, String str2, boolean z, RowAction.ID id, String str3, String str4) {
                    tintedIcon.getClass();
                    str.getClass();
                    str2.getClass();
                    this.icon = tintedIcon;
                    this.title = str;
                    this.subtitle = str2;
                    this.disabled = z;
                    this.actionId = id;
                    this.actionText = str3;
                    this.clientRoute = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BenefitsRow)) {
                        return false;
                    }
                    BenefitsRow benefitsRow = (BenefitsRow) obj;
                    return Intrinsics.areEqual(this.icon, benefitsRow.icon) && Intrinsics.areEqual(this.title, benefitsRow.title) && Intrinsics.areEqual(this.subtitle, benefitsRow.subtitle) && this.disabled == benefitsRow.disabled && this.actionId == benefitsRow.actionId && Intrinsics.areEqual(this.actionText, benefitsRow.actionText) && Intrinsics.areEqual(this.clientRoute, benefitsRow.clientRoute);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.disabled);
                    RowAction.ID id = this.actionId;
                    int hashCode = (m + (id == null ? 0 : id.hashCode())) * 31;
                    String str = this.actionText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.clientRoute;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("BenefitsRow(icon=");
                    sb.append(this.icon);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", subtitle=");
                    NavAction$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", disabled=", this.disabled, ", actionId=");
                    sb.append(this.actionId);
                    sb.append(", actionText=");
                    sb.append(this.actionText);
                    sb.append(", clientRoute=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.clientRoute, ")");
                }
            }

            public BenefitsViewModel(List list, String str, Color color) {
                list.getClass();
                this.rows = list;
                this.openExplanationText = str;
                this.openExplanationTextColor = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BenefitsViewModel)) {
                    return false;
                }
                BenefitsViewModel benefitsViewModel = (BenefitsViewModel) obj;
                return Intrinsics.areEqual(this.rows, benefitsViewModel.rows) && Intrinsics.areEqual(this.openExplanationText, benefitsViewModel.openExplanationText) && Intrinsics.areEqual(this.openExplanationTextColor, benefitsViewModel.openExplanationTextColor);
            }

            public final int hashCode() {
                int hashCode = this.rows.hashCode() * 31;
                String str = this.openExplanationText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Color color = this.openExplanationTextColor;
                return hashCode2 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("BenefitsViewModel(rows=", ", openExplanationText=", this.openExplanationText, ", openExplanationTextColor=", this.rows);
                m.append(this.openExplanationTextColor);
                m.append(")");
                return m.toString();
            }
        }

        public final class CallToActionViewModel {
            public final String buttonText;
            public final String clientRoute;
            public final RowAction.ID id;
            public final ButtonRow.Prominence prominence;

            public CallToActionViewModel(RowAction.ID id, String str, ButtonRow.Prominence prominence, String str2) {
                id.getClass();
                str.getClass();
                this.id = id;
                this.buttonText = str;
                this.prominence = prominence;
                this.clientRoute = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CallToActionViewModel)) {
                    return false;
                }
                CallToActionViewModel callToActionViewModel = (CallToActionViewModel) obj;
                return this.id == callToActionViewModel.id && Intrinsics.areEqual(this.buttonText, callToActionViewModel.buttonText) && this.prominence == callToActionViewModel.prominence && this.clientRoute.equals(callToActionViewModel.clientRoute);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.buttonText);
                ButtonRow.Prominence prominence = this.prominence;
                return this.clientRoute.hashCode() + ((m + (prominence == null ? 0 : prominence.hashCode())) * 31);
            }

            public final String toString() {
                return "CallToActionViewModel(id=" + this.id + ", buttonText=" + this.buttonText + ", prominence=" + this.prominence + ", clientRoute=" + this.clientRoute + ")";
            }
        }

        public final class CommonQuestionsViewModel {
            public final List questions;
            public final String title;

            public final class QuestionAndAnswer {
                public final String answer;
                public final String question;

                public QuestionAndAnswer(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.question = str;
                    this.answer = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuestionAndAnswer)) {
                        return false;
                    }
                    QuestionAndAnswer questionAndAnswer = (QuestionAndAnswer) obj;
                    return Intrinsics.areEqual(this.question, questionAndAnswer.question) && Intrinsics.areEqual(this.answer, questionAndAnswer.answer);
                }

                public final int hashCode() {
                    return this.answer.hashCode() + (this.question.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("QuestionAndAnswer(question=", this.question, ", answer=", this.answer, ")");
                }
            }

            public CommonQuestionsViewModel(String str, List list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.questions = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CommonQuestionsViewModel)) {
                    return false;
                }
                CommonQuestionsViewModel commonQuestionsViewModel = (CommonQuestionsViewModel) obj;
                return Intrinsics.areEqual(this.title, commonQuestionsViewModel.title) && Intrinsics.areEqual(this.questions, commonQuestionsViewModel.questions);
            }

            public final int hashCode() {
                return this.questions.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("CommonQuestionsViewModel(title=", this.title, ", questions=", ")", this.questions);
            }
        }

        public final class DefaultPerk {
            public final TintedIcon icon;
            public final String subtitle;
            public final String title;

            public DefaultPerk(TintedIcon tintedIcon, String str, String str2) {
                tintedIcon.getClass();
                str.getClass();
                str2.getClass();
                this.icon = tintedIcon;
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DefaultPerk)) {
                    return false;
                }
                DefaultPerk defaultPerk = (DefaultPerk) obj;
                return Intrinsics.areEqual(this.icon, defaultPerk.icon) && Intrinsics.areEqual(this.title, defaultPerk.title) && Intrinsics.areEqual(this.subtitle, defaultPerk.subtitle);
            }

            public final int hashCode() {
                return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DefaultPerk(icon=");
                sb.append(this.icon);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
            }
        }

        public final class DefaultPerksViewModel {
            public final List perks;
            public final String title;

            public DefaultPerksViewModel(String str, List list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.perks = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DefaultPerksViewModel)) {
                    return false;
                }
                DefaultPerksViewModel defaultPerksViewModel = (DefaultPerksViewModel) obj;
                return Intrinsics.areEqual(this.title, defaultPerksViewModel.title) && Intrinsics.areEqual(this.perks, defaultPerksViewModel.perks);
            }

            public final int hashCode() {
                return this.perks.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("DefaultPerksViewModel(title=", this.title, ", perks=", ")", this.perks);
            }
        }

        public final class Disclosure {
            public final TintedIcon icon;
            public final String markdown;

            public Disclosure(TintedIcon tintedIcon, String str) {
                str.getClass();
                this.icon = tintedIcon;
                this.markdown = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Disclosure)) {
                    return false;
                }
                Disclosure disclosure = (Disclosure) obj;
                return Intrinsics.areEqual(this.icon, disclosure.icon) && Intrinsics.areEqual(this.markdown, disclosure.markdown);
            }

            public final int hashCode() {
                TintedIcon tintedIcon = this.icon;
                return this.markdown.hashCode() + ((tintedIcon == null ? 0 : tintedIcon.hashCode()) * 31);
            }

            public final String toString() {
                return "Disclosure(icon=" + this.icon + ", markdown=" + this.markdown + ")";
            }
        }

        public final class Insight {
            public final BenefitDetailsViewModel details;
            public final String hero;
            public final String label;
            public final Prominence prominence;

            public Insight(String str, String str2, Prominence prominence, BenefitDetailsViewModel benefitDetailsViewModel) {
                str.getClass();
                str2.getClass();
                prominence.getClass();
                this.hero = str;
                this.label = str2;
                this.prominence = prominence;
                this.details = benefitDetailsViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Insight)) {
                    return false;
                }
                Insight insight = (Insight) obj;
                return Intrinsics.areEqual(this.hero, insight.hero) && Intrinsics.areEqual(this.label, insight.label) && this.prominence == insight.prominence && Intrinsics.areEqual(this.details, insight.details);
            }

            public final int hashCode() {
                int hashCode = (this.prominence.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.hero.hashCode() * 31, 31, this.label)) * 31;
                BenefitDetailsViewModel benefitDetailsViewModel = this.details;
                return hashCode + (benefitDetailsViewModel == null ? 0 : benefitDetailsViewModel.hashCode());
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Insight(hero=", this.hero, ", label=", this.label, ", prominence=");
                m.append(this.prominence);
                m.append(", details=");
                m.append(this.details);
                m.append(")");
                return m.toString();
            }
        }

        public final class PageHeaderViewModel {
            public final TintedIcon icon;
            public final String status;
            public final String title;

            public PageHeaderViewModel(TintedIcon tintedIcon, String str, String str2) {
                str.getClass();
                tintedIcon.getClass();
                str2.getClass();
                this.title = str;
                this.icon = tintedIcon;
                this.status = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PageHeaderViewModel)) {
                    return false;
                }
                PageHeaderViewModel pageHeaderViewModel = (PageHeaderViewModel) obj;
                return Intrinsics.areEqual(this.title, pageHeaderViewModel.title) && Intrinsics.areEqual(this.icon, pageHeaderViewModel.icon) && Intrinsics.areEqual(this.status, pageHeaderViewModel.status);
            }

            public final int hashCode() {
                return this.status.hashCode() + ((this.icon.hashCode() + (this.title.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageHeaderViewModel(title=");
                sb.append(this.title);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", status=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.status, ")");
            }
        }

        public Loaded(PageHeaderViewModel pageHeaderViewModel, List list, BenefitsViewModel benefitsViewModel, DefaultPerksViewModel defaultPerksViewModel, CommonQuestionsViewModel commonQuestionsViewModel, CallToActionViewModel callToActionViewModel, List list2) {
            list2.getClass();
            this.header = pageHeaderViewModel;
            this.insights = list;
            this.benefits = benefitsViewModel;
            this.defaultPerks = defaultPerksViewModel;
            this.commonQuestions = commonQuestionsViewModel;
            this.callToAction = callToActionViewModel;
            this.disclosures = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.header.equals(loaded.header) && Intrinsics.areEqual(this.insights, loaded.insights) && this.benefits.equals(loaded.benefits) && this.defaultPerks.equals(loaded.defaultPerks) && this.commonQuestions.equals(loaded.commonQuestions) && Intrinsics.areEqual(this.callToAction, loaded.callToAction) && Intrinsics.areEqual(this.disclosures, loaded.disclosures);
        }

        public final int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            List list = this.insights;
            int hashCode2 = (this.commonQuestions.hashCode() + ((this.defaultPerks.hashCode() + ((this.benefits.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31;
            CallToActionViewModel callToActionViewModel = this.callToAction;
            return this.disclosures.hashCode() + ((hashCode2 + (callToActionViewModel != null ? callToActionViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(header=");
            sb.append(this.header);
            sb.append(", insights=");
            sb.append(this.insights);
            sb.append(", benefits=");
            sb.append(this.benefits);
            sb.append(", defaultPerks=");
            sb.append(this.defaultPerks);
            sb.append(", commonQuestions=");
            sb.append(this.commonQuestions);
            sb.append(", callToAction=");
            sb.append(this.callToAction);
            sb.append(", disclosures=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.disclosures, ")");
        }
    }

    public final class Loading extends BenefitsHubViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1550512456;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
