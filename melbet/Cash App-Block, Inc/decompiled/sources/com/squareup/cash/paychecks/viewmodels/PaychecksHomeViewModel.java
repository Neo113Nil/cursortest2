package com.squareup.cash.paychecks.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public interface PaychecksHomeViewModel {

    public final class Content implements PaychecksHomeViewModel {
        public final ArcadeHeader arcadeHeader;
        public final DisclosureFooter disclosureFooter;
        public final ArrayList sections;
        public final List termsOfServiceDisclosures;

        public interface ArcadeHeader {

            public final class BenefitsModuleHeaderViewModel implements ArcadeHeader {
                public final String body;
                public final BenefitsModuleButton button;
                public final ColoredText coloredText;
                public final String title;

                public final class BenefitsModuleButton {
                    public final PaychecksHomeViewEvent action;
                    public final Prominence prominence;
                    public final String text;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public final class Prominence {
                        public static final /* synthetic */ Prominence[] $VALUES;
                        public static final Prominence PROMINENT;
                        public static final Prominence STANDARD;

                        static {
                            Prominence prominence = new Prominence("STANDARD", 0);
                            STANDARD = prominence;
                            Prominence prominence2 = new Prominence("PROMINENT", 1);
                            PROMINENT = prominence2;
                            $VALUES = new Prominence[]{prominence, prominence2};
                        }

                        public static Prominence valueOf(String str) {
                            return (Prominence) Enum.valueOf(Prominence.class, str);
                        }

                        public static Prominence[] values() {
                            return (Prominence[]) $VALUES.clone();
                        }
                    }

                    public BenefitsModuleButton(String str, PaychecksHomeViewEvent paychecksHomeViewEvent, Prominence prominence) {
                        str.getClass();
                        this.text = str;
                        this.action = paychecksHomeViewEvent;
                        this.prominence = prominence;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BenefitsModuleButton)) {
                            return false;
                        }
                        BenefitsModuleButton benefitsModuleButton = (BenefitsModuleButton) obj;
                        return Intrinsics.areEqual(this.text, benefitsModuleButton.text) && this.action.equals(benefitsModuleButton.action) && this.prominence == benefitsModuleButton.prominence;
                    }

                    public final int hashCode() {
                        return this.prominence.hashCode() + ((this.action.hashCode() + (this.text.hashCode() * 31)) * 31);
                    }

                    public final String toString() {
                        return "BenefitsModuleButton(text=" + this.text + ", action=" + this.action + ", prominence=" + this.prominence + ")";
                    }
                }

                public final class ColoredText {
                    public final Color color;
                    public final IntRange textRange;

                    public ColoredText(IntRange intRange, Color color) {
                        intRange.getClass();
                        color.getClass();
                        this.textRange = intRange;
                        this.color = color;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ColoredText)) {
                            return false;
                        }
                        ColoredText coloredText = (ColoredText) obj;
                        return Intrinsics.areEqual(this.textRange, coloredText.textRange) && Intrinsics.areEqual(this.color, coloredText.color);
                    }

                    public final int hashCode() {
                        return this.color.hashCode() + (this.textRange.hashCode() * 31);
                    }

                    public final String toString() {
                        return "ColoredText(textRange=" + this.textRange + ", color=" + this.color + ")";
                    }
                }

                public BenefitsModuleHeaderViewModel(String str, String str2, ColoredText coloredText, BenefitsModuleButton benefitsModuleButton) {
                    str2.getClass();
                    this.title = str;
                    this.body = str2;
                    this.coloredText = coloredText;
                    this.button = benefitsModuleButton;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BenefitsModuleHeaderViewModel)) {
                        return false;
                    }
                    BenefitsModuleHeaderViewModel benefitsModuleHeaderViewModel = (BenefitsModuleHeaderViewModel) obj;
                    return this.title.equals(benefitsModuleHeaderViewModel.title) && Intrinsics.areEqual(this.body, benefitsModuleHeaderViewModel.body) && Intrinsics.areEqual(this.coloredText, benefitsModuleHeaderViewModel.coloredText) && this.button.equals(benefitsModuleHeaderViewModel.button);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
                    ColoredText coloredText = this.coloredText;
                    return this.button.hashCode() + ((m + (coloredText == null ? 0 : coloredText.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BenefitsModuleHeaderViewModel(title=", this.title, ", body=", this.body, ", coloredText=");
                    m.append(this.coloredText);
                    m.append(", button=");
                    m.append(this.button);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class BenefitsModuleNullStateViewModel implements ArcadeHeader {
                public final ArrayList benefitRequirements;
                public final String body;
                public final Button seeAllBenefitsButton;
                public final String title;

                public final class BenefitRequirement {
                    public final String body;
                    public final Button button;
                    public final boolean requirementComplete;
                    public final String title;

                    public BenefitRequirement(String str, String str2, boolean z, Button button) {
                        this.title = str;
                        this.body = str2;
                        this.requirementComplete = z;
                        this.button = button;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BenefitRequirement)) {
                            return false;
                        }
                        BenefitRequirement benefitRequirement = (BenefitRequirement) obj;
                        return this.title.equals(benefitRequirement.title) && Intrinsics.areEqual(this.body, benefitRequirement.body) && this.requirementComplete == benefitRequirement.requirementComplete && Intrinsics.areEqual(this.button, benefitRequirement.button);
                    }

                    public final int hashCode() {
                        int hashCode = this.title.hashCode() * 31;
                        String str = this.body;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.requirementComplete);
                        Button button = this.button;
                        return m + (button != null ? button.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BenefitRequirement(title=", this.title, ", body=", this.body, ", requirementComplete=");
                        m.append(this.requirementComplete);
                        m.append(", button=");
                        m.append(this.button);
                        m.append(")");
                        return m.toString();
                    }
                }

                public BenefitsModuleNullStateViewModel(String str, String str2, Button button, ArrayList arrayList) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.body = str2;
                    this.seeAllBenefitsButton = button;
                    this.benefitRequirements = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BenefitsModuleNullStateViewModel)) {
                        return false;
                    }
                    BenefitsModuleNullStateViewModel benefitsModuleNullStateViewModel = (BenefitsModuleNullStateViewModel) obj;
                    return Intrinsics.areEqual(this.title, benefitsModuleNullStateViewModel.title) && Intrinsics.areEqual(this.body, benefitsModuleNullStateViewModel.body) && Intrinsics.areEqual(this.seeAllBenefitsButton, benefitsModuleNullStateViewModel.seeAllBenefitsButton) && this.benefitRequirements.equals(benefitsModuleNullStateViewModel.benefitRequirements);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
                    Button button = this.seeAllBenefitsButton;
                    return this.benefitRequirements.hashCode() + ((m + (button == null ? 0 : button.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BenefitsModuleNullStateViewModel(title=", this.title, ", body=", this.body, ", seeAllBenefitsButton=");
                    m.append(this.seeAllBenefitsButton);
                    m.append(", benefitRequirements=");
                    m.append(this.benefitRequirements);
                    m.append(")");
                    return m.toString();
                }
            }
        }

        public final class Button {
            public final PaychecksHomeViewEvent action;
            public final String text;

            public Button(String str, PaychecksHomeViewEvent paychecksHomeViewEvent) {
                str.getClass();
                this.text = str;
                this.action = paychecksHomeViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(this.text, button.text) && this.action.equals(button.action);
            }

            public final int hashCode() {
                return this.action.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "Button(text=" + this.text + ", action=" + this.action + ")";
            }
        }

        public final class DisclosureFooter {
            public final Boolean showIcon;
            public final String text;

            public DisclosureFooter(String str, Boolean bool) {
                this.text = str;
                this.showIcon = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisclosureFooter)) {
                    return false;
                }
                DisclosureFooter disclosureFooter = (DisclosureFooter) obj;
                return Intrinsics.areEqual(this.text, disclosureFooter.text) && this.showIcon.equals(disclosureFooter.showIcon);
            }

            public final int hashCode() {
                String str = this.text;
                return this.showIcon.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "DisclosureFooter(text=" + this.text + ", showIcon=" + this.showIcon + ")";
            }
        }

        public interface Section {

            public final class ActiveDistribution implements Section {
                public final ActiveDistributionSectionBodyViewModel body;
                public final Button button;
                public final String title;

                public ActiveDistribution(String str, Button button, ActiveDistributionSectionBodyViewModel activeDistributionSectionBodyViewModel) {
                    this.title = str;
                    this.button = button;
                    this.body = activeDistributionSectionBodyViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActiveDistribution)) {
                        return false;
                    }
                    ActiveDistribution activeDistribution = (ActiveDistribution) obj;
                    return this.title.equals(activeDistribution.title) && this.button.equals(activeDistribution.button) && this.body.equals(activeDistribution.body);
                }

                public final int hashCode() {
                    return this.body.hashCode() + ((this.button.hashCode() + (this.title.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    return "ActiveDistribution(title=" + this.title + ", button=" + this.button + ", body=" + this.body + ")";
                }
            }

            public final class ArcadeActivity implements Section {
                public final UiCallbackModel embedded;
                public final String subtitle;
                public final String title;

                public ArcadeActivity(String str, String str2, UiCallbackModel uiCallbackModel) {
                    this.title = str;
                    this.subtitle = str2;
                    this.embedded = uiCallbackModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ArcadeActivity)) {
                        return false;
                    }
                    ArcadeActivity arcadeActivity = (ArcadeActivity) obj;
                    return this.title.equals(arcadeActivity.title) && Intrinsics.areEqual(this.subtitle, arcadeActivity.subtitle) && this.embedded.equals(arcadeActivity.embedded);
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    return this.embedded.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArcadeActivity(title=", this.title, ", subtitle=", this.subtitle, ", embedded=");
                    m.append(this.embedded);
                    m.append(")");
                    return m.toString();
                }
            }

            public abstract class DirectDeposit implements Section {

                public final class AddOrUpdateDirectDeposit extends DirectDeposit {
                    public final PaychecksHomeViewEvent.SetUpDirectDeposit action;
                    public final String text;

                    public AddOrUpdateDirectDeposit(String str, PaychecksHomeViewEvent.SetUpDirectDeposit setUpDirectDeposit) {
                        this.text = str;
                        this.action = setUpDirectDeposit;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AddOrUpdateDirectDeposit)) {
                            return false;
                        }
                        AddOrUpdateDirectDeposit addOrUpdateDirectDeposit = (AddOrUpdateDirectDeposit) obj;
                        return this.text.equals(addOrUpdateDirectDeposit.text) && this.action.equals(addOrUpdateDirectDeposit.action);
                    }

                    @Override // com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel.Content.Section.DirectDeposit
                    public final PaychecksHomeViewEvent getAction() {
                        return this.action;
                    }

                    @Override // com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel.Content.Section.DirectDeposit
                    public final String getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.action.hashCode() + (this.text.hashCode() * 31);
                    }

                    public final String toString() {
                        return "AddOrUpdateDirectDeposit(text=" + this.text + ", action=" + this.action + ")";
                    }
                }

                public final class PendingDirectDeposit extends DirectDeposit {
                    public final PaychecksHomeViewEvent.SetUpDirectDeposit action;
                    public final PendingDirectDepositSheetContent pendingSheetContent;
                    public final String secondaryText;
                    public final String text;

                    public final class PendingDirectDepositSheetContent {
                        public final String body;
                        public final String buttonText;
                        public final Icon icon;
                        public final String title;

                        public PendingDirectDepositSheetContent(Icon icon, String str, String str2, String str3) {
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
                            if (!(obj instanceof PendingDirectDepositSheetContent)) {
                                return false;
                            }
                            PendingDirectDepositSheetContent pendingDirectDepositSheetContent = (PendingDirectDepositSheetContent) obj;
                            return Intrinsics.areEqual(this.icon, pendingDirectDepositSheetContent.icon) && this.title.equals(pendingDirectDepositSheetContent.title) && this.body.equals(pendingDirectDepositSheetContent.body) && this.buttonText.equals(pendingDirectDepositSheetContent.buttonText);
                        }

                        public final int hashCode() {
                            return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.body);
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("PendingDirectDepositSheetContent(icon=");
                            sb.append(this.icon);
                            sb.append(", title=");
                            sb.append(this.title);
                            sb.append(", body=");
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ", buttonText=", this.buttonText, ")");
                        }
                    }

                    public PendingDirectDeposit(String str, PaychecksHomeViewEvent.SetUpDirectDeposit setUpDirectDeposit, String str2, PendingDirectDepositSheetContent pendingDirectDepositSheetContent) {
                        str.getClass();
                        this.text = str;
                        this.action = setUpDirectDeposit;
                        this.secondaryText = str2;
                        this.pendingSheetContent = pendingDirectDepositSheetContent;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PendingDirectDeposit)) {
                            return false;
                        }
                        PendingDirectDeposit pendingDirectDeposit = (PendingDirectDeposit) obj;
                        return Intrinsics.areEqual(this.text, pendingDirectDeposit.text) && this.action.equals(pendingDirectDeposit.action) && this.secondaryText.equals(pendingDirectDeposit.secondaryText) && this.pendingSheetContent.equals(pendingDirectDeposit.pendingSheetContent);
                    }

                    @Override // com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel.Content.Section.DirectDeposit
                    public final PaychecksHomeViewEvent getAction() {
                        return this.action;
                    }

                    @Override // com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel.Content.Section.DirectDeposit
                    public final String getText() {
                        return this.text;
                    }

                    public final int hashCode() {
                        return this.pendingSheetContent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.action.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.secondaryText);
                    }

                    public final String toString() {
                        return "PendingDirectDeposit(text=" + this.text + ", action=" + this.action + ", secondaryText=" + this.secondaryText + ", pendingSheetContent=" + this.pendingSheetContent + ")";
                    }
                }

                public abstract PaychecksHomeViewEvent getAction();

                public abstract String getText();
            }

            public final class DistributionsNullState implements Section {
                public final PaychecksHomeViewEvent.CallToAction callToActionButtonAction;
                public final String callToActionButtonText;
                public final String subtitle;
                public final String title;

                public DistributionsNullState(String str, String str2, String str3, PaychecksHomeViewEvent.CallToAction callToAction) {
                    re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                    this.title = str;
                    this.subtitle = str2;
                    this.callToActionButtonText = str3;
                    this.callToActionButtonAction = callToAction;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DistributionsNullState)) {
                        return false;
                    }
                    DistributionsNullState distributionsNullState = (DistributionsNullState) obj;
                    return Intrinsics.areEqual(this.title, distributionsNullState.title) && Intrinsics.areEqual(this.subtitle, distributionsNullState.subtitle) && Intrinsics.areEqual(this.callToActionButtonText, distributionsNullState.callToActionButtonText) && this.callToActionButtonAction.equals(distributionsNullState.callToActionButtonAction);
                }

                public final int hashCode() {
                    return this.callToActionButtonAction.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.callToActionButtonText);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DistributionsNullState(image=null, title=", this.title, ", subtitle=", this.subtitle, ", callToActionButtonText=");
                    m.append(this.callToActionButtonText);
                    m.append(", callToActionButtonAction=");
                    m.append(this.callToActionButtonAction);
                    m.append(")");
                    return m.toString();
                }
            }
        }

        public Content(ArrayList arrayList, List list, DisclosureFooter disclosureFooter, ArcadeHeader arcadeHeader) {
            list.getClass();
            this.sections = arrayList;
            this.termsOfServiceDisclosures = list;
            this.disclosureFooter = disclosureFooter;
            this.arcadeHeader = arcadeHeader;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.sections.equals(content.sections) && Intrinsics.areEqual(this.termsOfServiceDisclosures, content.termsOfServiceDisclosures) && Intrinsics.areEqual(this.disclosureFooter, content.disclosureFooter) && Intrinsics.areEqual(this.arcadeHeader, content.arcadeHeader);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.sections.hashCode() * 31, 31, this.termsOfServiceDisclosures);
            DisclosureFooter disclosureFooter = this.disclosureFooter;
            int hashCode = (m + (disclosureFooter == null ? 0 : disclosureFooter.hashCode())) * 31;
            ArcadeHeader arcadeHeader = this.arcadeHeader;
            return hashCode + (arcadeHeader != null ? arcadeHeader.hashCode() : 0);
        }

        public final String toString() {
            return "Content(sections=" + this.sections + ", termsOfServiceDisclosures=" + this.termsOfServiceDisclosures + ", disclosureFooter=" + this.disclosureFooter + ", arcadeHeader=" + this.arcadeHeader + ")";
        }
    }

    public final class Loading implements PaychecksHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -279799790;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
