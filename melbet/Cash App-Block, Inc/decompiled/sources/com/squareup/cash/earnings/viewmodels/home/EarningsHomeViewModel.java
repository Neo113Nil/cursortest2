package com.squareup.cash.earnings.viewmodels.home;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EarningsHomeViewModel {

    public final class EarnerModeSheet {
        public final String body;
        public final ArrayList durationOptions;
        public final String primaryButtonText;
        public final SubmitState submitState;
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SubmitState {
            public static final /* synthetic */ SubmitState[] $VALUES;
            public static final SubmitState FAILED;
            public static final SubmitState IDLE;
            public static final SubmitState SUBMITTING;

            static {
                SubmitState submitState = new SubmitState("IDLE", 0);
                IDLE = submitState;
                SubmitState submitState2 = new SubmitState("SUBMITTING", 1);
                SUBMITTING = submitState2;
                SubmitState submitState3 = new SubmitState("FAILED", 2);
                FAILED = submitState3;
                $VALUES = new SubmitState[]{submitState, submitState2, submitState3};
            }

            public static SubmitState valueOf(String str) {
                return (SubmitState) Enum.valueOf(SubmitState.class, str);
            }

            public static SubmitState[] values() {
                return (SubmitState[]) $VALUES.clone();
            }
        }

        public EarnerModeSheet(String str, String str2, ArrayList arrayList, String str3, SubmitState submitState) {
            submitState.getClass();
            this.title = str;
            this.body = str2;
            this.durationOptions = arrayList;
            this.primaryButtonText = str3;
            this.submitState = submitState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarnerModeSheet)) {
                return false;
            }
            EarnerModeSheet earnerModeSheet = (EarnerModeSheet) obj;
            return this.title.equals(earnerModeSheet.title) && this.body.equals(earnerModeSheet.body) && this.durationOptions.equals(earnerModeSheet.durationOptions) && this.primaryButtonText.equals(earnerModeSheet.primaryButtonText) && this.submitState == earnerModeSheet.submitState;
        }

        public final int hashCode() {
            return this.submitState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.durationOptions, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31), 31, this.primaryButtonText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarnerModeSheet(title=", this.title, ", body=", this.body, ", durationOptions=");
            m.append(this.durationOptions);
            m.append(", primaryButtonText=");
            m.append(this.primaryButtonText);
            m.append(", submitState=");
            m.append(this.submitState);
            m.append(")");
            return m.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EarningToolType {
        public static final /* synthetic */ EarningToolType[] $VALUES;
        public static final EarningToolType ADD_PAYCHECK;
        public static final EarningToolType EARNER_MODE;
        public static final EarningToolType EARNER_ONBOARDING;
        public static final EarningToolType MANAGE_CUSTOMERS;
        public static final EarningToolType PAYCHECK_DISTRIBUTION;

        static {
            EarningToolType earningToolType = new EarningToolType("EARNER_MODE", 0);
            EARNER_MODE = earningToolType;
            EarningToolType earningToolType2 = new EarningToolType("EARNER_ONBOARDING", 1);
            EARNER_ONBOARDING = earningToolType2;
            EarningToolType earningToolType3 = new EarningToolType("MANAGE_CUSTOMERS", 2);
            MANAGE_CUSTOMERS = earningToolType3;
            EarningToolType earningToolType4 = new EarningToolType("ADD_PAYCHECK", 3);
            ADD_PAYCHECK = earningToolType4;
            EarningToolType earningToolType5 = new EarningToolType("PAYCHECK_DISTRIBUTION", 4);
            PAYCHECK_DISTRIBUTION = earningToolType5;
            $VALUES = new EarningToolType[]{earningToolType, earningToolType2, earningToolType3, earningToolType4, earningToolType5};
        }

        public static EarningToolType valueOf(String str) {
            return (EarningToolType) Enum.valueOf(EarningToolType.class, str);
        }

        public static EarningToolType[] values() {
            return (EarningToolType[]) $VALUES.clone();
        }
    }

    public final class EarningToolsItem {
        public final EarningsHomeViewEvent action;
        public final StackedAvatarViewModel avatars;
        public final EarnerModeSheet earnerModeSheet;
        public final String statusText;
        public final String subtitle;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final EarningToolType f1128type;

        public EarningToolsItem(EarningToolType earningToolType, String str, String str2, String str3, EarningsHomeViewEvent.EarnerToolTapped earnerToolTapped, EarnerModeSheet earnerModeSheet, StackedAvatarViewModel stackedAvatarViewModel, int i) {
            earnerModeSheet = (i & 32) != 0 ? null : earnerModeSheet;
            stackedAvatarViewModel = (i & 64) != 0 ? null : stackedAvatarViewModel;
            this.f1128type = earningToolType;
            this.title = str;
            this.subtitle = str2;
            this.statusText = str3;
            this.action = earnerToolTapped;
            this.earnerModeSheet = earnerModeSheet;
            this.avatars = stackedAvatarViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningToolsItem)) {
                return false;
            }
            EarningToolsItem earningToolsItem = (EarningToolsItem) obj;
            return this.f1128type == earningToolsItem.f1128type && this.title.equals(earningToolsItem.title) && Intrinsics.areEqual(this.subtitle, earningToolsItem.subtitle) && Intrinsics.areEqual(this.statusText, earningToolsItem.statusText) && Intrinsics.areEqual(this.action, earningToolsItem.action) && Intrinsics.areEqual(this.earnerModeSheet, earningToolsItem.earnerModeSheet) && Intrinsics.areEqual(this.avatars, earningToolsItem.avatars);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1128type.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.statusText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            EarningsHomeViewEvent earningsHomeViewEvent = this.action;
            int hashCode3 = (hashCode2 + (earningsHomeViewEvent == null ? 0 : earningsHomeViewEvent.hashCode())) * 31;
            EarnerModeSheet earnerModeSheet = this.earnerModeSheet;
            int hashCode4 = (hashCode3 + (earnerModeSheet == null ? 0 : earnerModeSheet.hashCode())) * 31;
            StackedAvatarViewModel stackedAvatarViewModel = this.avatars;
            return hashCode4 + (stackedAvatarViewModel != null ? stackedAvatarViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EarningToolsItem(type=");
            sb.append(this.f1128type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", statusText=", this.statusText, ", action=");
            sb.append(this.action);
            sb.append(", earnerModeSheet=");
            sb.append(this.earnerModeSheet);
            sb.append(", avatars=");
            sb.append(this.avatars);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class EarningsActivity {
        public final UiCallbackModel embedded;
        public final String title;

        public EarningsActivity(UiCallbackModel uiCallbackModel, String str) {
            str.getClass();
            this.title = str;
            this.embedded = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarningsActivity)) {
                return false;
            }
            EarningsActivity earningsActivity = (EarningsActivity) obj;
            return Intrinsics.areEqual(this.title, earningsActivity.title) && this.embedded.equals(earningsActivity.embedded);
        }

        public final int hashCode() {
            return this.embedded.hashCode() + (this.title.hashCode() * 961);
        }

        public final String toString() {
            return "EarningsActivity(title=" + this.title + ", subtitle=null, embedded=" + this.embedded + ")";
        }
    }

    public final class Loaded implements EarningsHomeViewModel {
        public final ArrayList sections;

        public final class Button {
            public final EarningsHomeViewEvent.CallToAction action;
            public final String text;

            public Button(String str, EarningsHomeViewEvent.CallToAction callToAction) {
                this.text = str;
                this.action = callToAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.text.equals(button.text) && this.action.equals(button.action);
            }

            public final int hashCode() {
                return this.action.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "Button(text=" + this.text + ", action=" + this.action + ")";
            }
        }

        public final class DisclosureFooter {
            public final List disclosures;
            public final boolean showIcon;

            public DisclosureFooter(boolean z, List list) {
                list.getClass();
                this.showIcon = z;
                this.disclosures = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisclosureFooter)) {
                    return false;
                }
                DisclosureFooter disclosureFooter = (DisclosureFooter) obj;
                return this.showIcon == disclosureFooter.showIcon && Intrinsics.areEqual(this.disclosures, disclosureFooter.disclosures);
            }

            public final int hashCode() {
                return this.disclosures.hashCode() + (Boolean.hashCode(this.showIcon) * 31);
            }

            public final String toString() {
                return "DisclosureFooter(showIcon=" + this.showIcon + ", disclosures=" + this.disclosures + ")";
            }
        }

        public Loaded(ArrayList arrayList) {
            this.sections = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.sections.equals(((Loaded) obj).sections);
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Loaded(sections=", ")", this.sections);
        }
    }

    public final class Loading implements EarningsHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 208202983;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public interface SectionContent {

        public final class ActionButtons implements SectionContent {
            public final ArrayList buttons;

            public ActionButtons(ArrayList arrayList) {
                this.buttons = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionButtons) && this.buttons.equals(((ActionButtons) obj).buttons);
            }

            public final int hashCode() {
                return this.buttons.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("ActionButtons(buttons=", ")", this.buttons);
            }
        }

        public final class Activity implements SectionContent {
            public final EarningsActivity state;

            public Activity(EarningsActivity earningsActivity) {
                this.state = earningsActivity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.state.equals(((Activity) obj).state);
            }

            public final int hashCode() {
                return this.state.hashCode();
            }

            public final String toString() {
                return "Activity(state=" + this.state + ")";
            }
        }

        public final class DisclosureFooter implements SectionContent {
            public final Loaded.DisclosureFooter state;

            public DisclosureFooter(Loaded.DisclosureFooter disclosureFooter) {
                this.state = disclosureFooter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisclosureFooter) && this.state.equals(((DisclosureFooter) obj).state);
            }

            public final int hashCode() {
                return this.state.hashCode();
            }

            public final String toString() {
                return "DisclosureFooter(state=" + this.state + ")";
            }
        }

        public final class Distributions implements SectionContent {
            public final EarningsHomeViewModel$DistributionsSection$NullState state;

            public Distributions(EarningsHomeViewModel$DistributionsSection$NullState earningsHomeViewModel$DistributionsSection$NullState) {
                this.state = earningsHomeViewModel$DistributionsSection$NullState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Distributions) && this.state.equals(((Distributions) obj).state);
            }

            public final int hashCode() {
                return this.state.hashCode();
            }

            public final String toString() {
                return "Distributions(state=" + this.state + ")";
            }
        }

        public final class EarningTools implements SectionContent {
            public final ArrayList items;
            public final String sectionTitle;

            public EarningTools(String str, ArrayList arrayList) {
                this.sectionTitle = str;
                this.items = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EarningTools)) {
                    return false;
                }
                EarningTools earningTools = (EarningTools) obj;
                return Intrinsics.areEqual(this.sectionTitle, earningTools.sectionTitle) && this.items.equals(earningTools.items);
            }

            public final int hashCode() {
                String str = this.sectionTitle;
                return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.items, "EarningTools(sectionTitle=", this.sectionTitle, ", items=", ")");
            }
        }

        public final class Header implements SectionContent {
            public final UiCallbackModel state;

            public Header(UiCallbackModel uiCallbackModel) {
                uiCallbackModel.getClass();
                this.state = uiCallbackModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Header) && Intrinsics.areEqual(this.state, ((Header) obj).state);
            }

            public final int hashCode() {
                return this.state.hashCode();
            }

            public final String toString() {
                return "Header(state=" + this.state + ")";
            }
        }

        public final class Unknown implements SectionContent {
            public static final Unknown INSTANCE = new Unknown();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unknown);
            }

            public final int hashCode() {
                return 1021491973;
            }

            public final String toString() {
                return "Unknown";
            }
        }
    }
}
