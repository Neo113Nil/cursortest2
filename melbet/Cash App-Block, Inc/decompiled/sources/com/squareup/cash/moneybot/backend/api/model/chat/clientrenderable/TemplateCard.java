package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.arcade.values.ButtonProminence;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class TemplateCard {
    public final BottomPicker bottomPicker;
    public final String description;
    public final String displayTemplate;
    public final Boolean editable;
    public final ArrayList inlineContent;
    public final String requestId;
    public final String sourcePlaceholderKey;
    public final TapBehavior tapBehavior;
    public final String targetPlaceholderKey;
    public final int version;

    public interface Action {

        public final class ClientRouteAction implements Action {
            public final String clientRouteUrlTemplate;
            public final CdfEvent tapCdfEvent;

            public ClientRouteAction(String str, CdfEvent cdfEvent) {
                str.getClass();
                this.clientRouteUrlTemplate = str;
                this.tapCdfEvent = cdfEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClientRouteAction)) {
                    return false;
                }
                ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
                return Intrinsics.areEqual(this.clientRouteUrlTemplate, clientRouteAction.clientRouteUrlTemplate) && Intrinsics.areEqual(this.tapCdfEvent, clientRouteAction.tapCdfEvent);
            }

            public final int hashCode() {
                int hashCode = this.clientRouteUrlTemplate.hashCode() * 31;
                CdfEvent cdfEvent = this.tapCdfEvent;
                return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
            }

            public final String toString() {
                return "ClientRouteAction(clientRouteUrlTemplate=" + this.clientRouteUrlTemplate + ", tapCdfEvent=" + this.tapCdfEvent + ")";
            }
        }

        public final class ServerToolCall implements Action {
            public final String argumentsTemplate;
            public final String extensionName;
            public final CdfEvent tapCdfEvent;
            public final String toolName;

            public ServerToolCall(String str, String str2, String str3, CdfEvent cdfEvent) {
                this.extensionName = str;
                this.toolName = str2;
                this.argumentsTemplate = str3;
                this.tapCdfEvent = cdfEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServerToolCall)) {
                    return false;
                }
                ServerToolCall serverToolCall = (ServerToolCall) obj;
                return this.extensionName.equals(serverToolCall.extensionName) && this.toolName.equals(serverToolCall.toolName) && Intrinsics.areEqual(this.argumentsTemplate, serverToolCall.argumentsTemplate) && Intrinsics.areEqual(this.tapCdfEvent, serverToolCall.tapCdfEvent);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.extensionName.hashCode() * 31, 31, this.toolName);
                String str = this.argumentsTemplate;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                CdfEvent cdfEvent = this.tapCdfEvent;
                return hashCode + (cdfEvent != null ? cdfEvent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ServerToolCall(extensionName=", this.extensionName, ", toolName=", this.toolName, ", argumentsTemplate=");
                m.append(this.argumentsTemplate);
                m.append(", tapCdfEvent=");
                m.append(this.tapCdfEvent);
                m.append(")");
                return m.toString();
            }
        }
    }

    public final class BottomPicker {
        public final String accessibilityLabel;
        public final Picker picker;
        public final String placeholderKey;

        public BottomPicker(String str, String str2, Picker picker) {
            str.getClass();
            this.placeholderKey = str;
            this.accessibilityLabel = str2;
            this.picker = picker;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomPicker)) {
                return false;
            }
            BottomPicker bottomPicker = (BottomPicker) obj;
            return Intrinsics.areEqual(this.placeholderKey, bottomPicker.placeholderKey) && Intrinsics.areEqual(this.accessibilityLabel, bottomPicker.accessibilityLabel) && this.picker.equals(bottomPicker.picker);
        }

        public final int hashCode() {
            int hashCode = this.placeholderKey.hashCode() * 31;
            String str = this.accessibilityLabel;
            return this.picker.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BottomPicker(placeholderKey=", this.placeholderKey, ", accessibilityLabel=", this.accessibilityLabel, ", picker=");
            m.append(this.picker);
            m.append(")");
            return m.toString();
        }
    }

    public final class Button {
        public final Action action;
        public final ButtonProminence.Id prominence;
        public final String text;

        public Button(String str, ButtonProminence.Id id, Action action) {
            id.getClass();
            this.text = str;
            this.prominence = id;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && Intrinsics.areEqual(this.prominence, button.prominence) && this.action.equals(button.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Button(text=" + this.text + ", prominence=" + this.prominence + ", action=" + this.action + ")";
        }
    }

    public interface EditableField {

        public final class Amount implements EditableField {
            public final String accessibilityLabel;
            public final String cta;
            public final String displayFormat;
            public final Money maxAmount;
            public final Money minAmount;
            public final Money prefilledAmount;

            public Amount(Money money, Money money2, Money money3, String str, String str2, String str3) {
                money.getClass();
                this.displayFormat = str;
                this.accessibilityLabel = str2;
                this.cta = str3;
                this.prefilledAmount = money;
                this.minAmount = money2;
                this.maxAmount = money3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Amount)) {
                    return false;
                }
                Amount amount = (Amount) obj;
                return Intrinsics.areEqual(this.displayFormat, amount.displayFormat) && Intrinsics.areEqual(this.accessibilityLabel, amount.accessibilityLabel) && Intrinsics.areEqual(this.cta, amount.cta) && Intrinsics.areEqual(this.prefilledAmount, amount.prefilledAmount) && Intrinsics.areEqual(this.minAmount, amount.minAmount) && Intrinsics.areEqual(this.maxAmount, amount.maxAmount);
            }

            @Override // com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard.EditableField
            public final String getDisplayFormat() {
                return this.displayFormat;
            }

            public final int hashCode() {
                String str = this.displayFormat;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.accessibilityLabel;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cta;
                int m = NavAction$$ExternalSyntheticOutline0.m(this.prefilledAmount, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
                Money money = this.minAmount;
                int hashCode3 = (m + (money == null ? 0 : money.hashCode())) * 31;
                Money money2 = this.maxAmount;
                return hashCode3 + (money2 != null ? money2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Amount(displayFormat=", this.displayFormat, ", accessibilityLabel=", this.accessibilityLabel, ", cta=");
                m.append(this.cta);
                m.append(", prefilledAmount=");
                m.append(this.prefilledAmount);
                m.append(", minAmount=");
                m.append(this.minAmount);
                m.append(", maxAmount=");
                m.append(this.maxAmount);
                m.append(")");
                return m.toString();
            }
        }

        public final class Picker implements EditableField {
            public final String accessibilityLabel;
            public final String displayFormat;
            public final Picker picker;

            public Picker(String str, String str2, Picker picker) {
                this.displayFormat = str;
                this.accessibilityLabel = str2;
                this.picker = picker;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Picker)) {
                    return false;
                }
                Picker picker = (Picker) obj;
                return Intrinsics.areEqual(this.displayFormat, picker.displayFormat) && Intrinsics.areEqual(this.accessibilityLabel, picker.accessibilityLabel) && Intrinsics.areEqual(this.picker, picker.picker);
            }

            @Override // com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard.EditableField
            public final String getDisplayFormat() {
                return this.displayFormat;
            }

            public final int hashCode() {
                String str = this.displayFormat;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.accessibilityLabel;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Picker picker = this.picker;
                return hashCode2 + (picker != null ? picker.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Picker(displayFormat=", this.displayFormat, ", accessibilityLabel=", this.accessibilityLabel, ", picker=");
                m.append(this.picker);
                m.append(")");
                return m.toString();
            }
        }

        public final class Text implements EditableField {
            public final String accessibilityLabel;
            public final String displayFormat;
            public final String emptyPlaceholderText;
            public final Integer maxLength;
            public final String prefilledText;

            public Text(Integer num, String str, String str2, String str3, String str4) {
                this.displayFormat = str;
                this.accessibilityLabel = str2;
                this.prefilledText = str3;
                this.emptyPlaceholderText = str4;
                this.maxLength = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return Intrinsics.areEqual(this.displayFormat, text.displayFormat) && Intrinsics.areEqual(this.accessibilityLabel, text.accessibilityLabel) && Intrinsics.areEqual(this.prefilledText, text.prefilledText) && Intrinsics.areEqual(this.emptyPlaceholderText, text.emptyPlaceholderText) && Intrinsics.areEqual(this.maxLength, text.maxLength);
            }

            @Override // com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard.EditableField
            public final String getDisplayFormat() {
                return this.displayFormat;
            }

            public final int hashCode() {
                String str = this.displayFormat;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.accessibilityLabel;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.prefilledText;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.emptyPlaceholderText;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.maxLength;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(displayFormat=", this.displayFormat, ", accessibilityLabel=", this.accessibilityLabel, ", prefilledText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.prefilledText, ", emptyPlaceholderText=", this.emptyPlaceholderText, ", maxLength=");
                return NavAction$$ExternalSyntheticOutline0.m(m, this.maxLength, ")");
            }
        }

        String getDisplayFormat();
    }

    public final class InlineContent {
        public final EditableField editableField;
        public final String placeholderKey;

        public InlineContent(String str, EditableField editableField) {
            str.getClass();
            this.placeholderKey = str;
            this.editableField = editableField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineContent)) {
                return false;
            }
            InlineContent inlineContent = (InlineContent) obj;
            return Intrinsics.areEqual(this.placeholderKey, inlineContent.placeholderKey) && this.editableField.equals(inlineContent.editableField);
        }

        public final int hashCode() {
            return this.editableField.hashCode() + (this.placeholderKey.hashCode() * 31);
        }

        public final String toString() {
            return "InlineContent(placeholderKey=" + this.placeholderKey + ", editableField=" + this.editableField + ")";
        }
    }

    public interface Picker {

        public final class SavingsTransferOptionPicker implements Picker {
            public final String amountFieldPlaceholderKey;
            public final String cta;
            public final List linkTransferOptions;
            public final List optionRules;
            public final String prefilledValue;
            public final String titleTemplate;
            public final List transferOptionKinds;

            public SavingsTransferOptionPicker(String str, String str2, List list, List list2, List list3, String str3, String str4) {
                list.getClass();
                list2.getClass();
                list3.getClass();
                this.prefilledValue = str;
                this.amountFieldPlaceholderKey = str2;
                this.transferOptionKinds = list;
                this.linkTransferOptions = list2;
                this.optionRules = list3;
                this.titleTemplate = str3;
                this.cta = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavingsTransferOptionPicker)) {
                    return false;
                }
                SavingsTransferOptionPicker savingsTransferOptionPicker = (SavingsTransferOptionPicker) obj;
                return Intrinsics.areEqual(this.prefilledValue, savingsTransferOptionPicker.prefilledValue) && Intrinsics.areEqual(this.amountFieldPlaceholderKey, savingsTransferOptionPicker.amountFieldPlaceholderKey) && Intrinsics.areEqual(this.transferOptionKinds, savingsTransferOptionPicker.transferOptionKinds) && Intrinsics.areEqual(this.linkTransferOptions, savingsTransferOptionPicker.linkTransferOptions) && Intrinsics.areEqual(this.optionRules, savingsTransferOptionPicker.optionRules) && Intrinsics.areEqual(this.titleTemplate, savingsTransferOptionPicker.titleTemplate) && Intrinsics.areEqual(this.cta, savingsTransferOptionPicker.cta);
            }

            public final int hashCode() {
                String str = this.prefilledValue;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.amountFieldPlaceholderKey;
                int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.transferOptionKinds), 31, this.linkTransferOptions), 31, this.optionRules);
                String str3 = this.titleTemplate;
                int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cta;
                return hashCode2 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SavingsTransferOptionPicker(prefilledValue=", this.prefilledValue, ", amountFieldPlaceholderKey=", this.amountFieldPlaceholderKey, ", transferOptionKinds=");
                Request$Priority$EnumUnboxingLocalUtility.m(m, this.transferOptionKinds, ", linkTransferOptions=", this.linkTransferOptions, ", optionRules=");
                Recorder$$ExternalSyntheticOutline2.m(", titleTemplate=", this.titleTemplate, ", cta=", m, this.optionRules);
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.cta, ")");
            }
        }

        public final class StaticPicker implements Picker {
            public final String amountFieldPlaceholderKey;
            public final String cta;
            public final ArrayList options;
            public final String selectedValue;
            public final String title;

            public interface Icon {

                public final class Avatar implements Icon {
                    public final UiAvatar avatar;

                    public Avatar(UiAvatar uiAvatar) {
                        uiAvatar.getClass();
                        this.avatar = uiAvatar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
                    }

                    public final int hashCode() {
                        return this.avatar.hashCode();
                    }

                    public final String toString() {
                        return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
                    }
                }

                public final class SavingsGoalIcon implements Icon {
                    public final com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon;

                    public SavingsGoalIcon(com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon) {
                        savingsGoalIcon.getClass();
                        this.savingsGoalIcon = savingsGoalIcon;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof SavingsGoalIcon) && Intrinsics.areEqual(this.savingsGoalIcon, ((SavingsGoalIcon) obj).savingsGoalIcon);
                    }

                    public final int hashCode() {
                        return this.savingsGoalIcon.hashCode();
                    }

                    public final String toString() {
                        return "SavingsGoalIcon(savingsGoalIcon=" + this.savingsGoalIcon + ")";
                    }
                }
            }

            public final class Option {
                public final Icon icon;
                public final String label;
                public final Money maxAmount;
                public final String subtitle;
                public final String value;

                public Option(String str, String str2, String str3, Money money, Icon icon) {
                    str.getClass();
                    str2.getClass();
                    this.value = str;
                    this.label = str2;
                    this.subtitle = str3;
                    this.maxAmount = money;
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Option)) {
                        return false;
                    }
                    Option option = (Option) obj;
                    return Intrinsics.areEqual(this.value, option.value) && Intrinsics.areEqual(this.label, option.label) && Intrinsics.areEqual(this.subtitle, option.subtitle) && Intrinsics.areEqual(this.maxAmount, option.maxAmount) && Intrinsics.areEqual(this.icon, option.icon);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.label);
                    String str = this.subtitle;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    Money money = this.maxAmount;
                    int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
                    Icon icon = this.icon;
                    return hashCode2 + (icon != null ? icon.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(value=", this.value, ", label=", this.label, ", subtitle=");
                    m.append(this.subtitle);
                    m.append(", maxAmount=");
                    m.append(this.maxAmount);
                    m.append(", icon=");
                    m.append(this.icon);
                    m.append(")");
                    return m.toString();
                }
            }

            public StaticPicker(ArrayList arrayList, String str, String str2, String str3, String str4) {
                this.selectedValue = str;
                this.options = arrayList;
                this.title = str2;
                this.cta = str3;
                this.amountFieldPlaceholderKey = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StaticPicker)) {
                    return false;
                }
                StaticPicker staticPicker = (StaticPicker) obj;
                return Intrinsics.areEqual(this.selectedValue, staticPicker.selectedValue) && this.options.equals(staticPicker.options) && Intrinsics.areEqual(this.title, staticPicker.title) && Intrinsics.areEqual(this.cta, staticPicker.cta) && Intrinsics.areEqual(this.amountFieldPlaceholderKey, staticPicker.amountFieldPlaceholderKey);
            }

            public final int hashCode() {
                String str = this.selectedValue;
                int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (str == null ? 0 : str.hashCode()) * 31, 31);
                String str2 = this.title;
                int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cta;
                int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.amountFieldPlaceholderKey;
                return hashCode2 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, "StaticPicker(selectedValue=", this.selectedValue, ", options=", ", title=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", cta=", this.cta, ", amountFieldPlaceholderKey=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.amountFieldPlaceholderKey, ")");
            }
        }
    }

    public interface TapBehavior {

        public final class CardButtons implements TapBehavior {
            public final Button primaryButton;
            public final Button secondaryButton;

            public CardButtons(Button button, Button button2) {
                this.primaryButton = button;
                this.secondaryButton = button2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardButtons)) {
                    return false;
                }
                CardButtons cardButtons = (CardButtons) obj;
                return this.primaryButton.equals(cardButtons.primaryButton) && Intrinsics.areEqual(this.secondaryButton, cardButtons.secondaryButton);
            }

            public final int hashCode() {
                int hashCode = this.primaryButton.hashCode() * 31;
                Button button = this.secondaryButton;
                return hashCode + (button == null ? 0 : button.hashCode());
            }

            public final String toString() {
                return "CardButtons(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
            }
        }

        public final class TapAction implements TapBehavior {
            public final Action action;

            public TapAction(Action action) {
                this.action = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapAction) && this.action.equals(((TapAction) obj).action);
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return "TapAction(action=" + this.action + ")";
            }
        }
    }

    public TemplateCard(String str, int i, String str2, ArrayList arrayList, BottomPicker bottomPicker, TapBehavior tapBehavior, String str3, Boolean bool, String str4, String str5) {
        this.requestId = str;
        this.version = i;
        this.displayTemplate = str2;
        this.inlineContent = arrayList;
        this.bottomPicker = bottomPicker;
        this.tapBehavior = tapBehavior;
        this.description = str3;
        this.editable = bool;
        this.sourcePlaceholderKey = str4;
        this.targetPlaceholderKey = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCard)) {
            return false;
        }
        TemplateCard templateCard = (TemplateCard) obj;
        return Intrinsics.areEqual(this.requestId, templateCard.requestId) && this.version == templateCard.version && this.displayTemplate.equals(templateCard.displayTemplate) && this.inlineContent.equals(templateCard.inlineContent) && Intrinsics.areEqual(this.bottomPicker, templateCard.bottomPicker) && Intrinsics.areEqual(this.tapBehavior, templateCard.tapBehavior) && Intrinsics.areEqual(this.description, templateCard.description) && Intrinsics.areEqual(this.editable, templateCard.editable) && Intrinsics.areEqual(this.sourcePlaceholderKey, templateCard.sourcePlaceholderKey) && Intrinsics.areEqual(this.targetPlaceholderKey, templateCard.targetPlaceholderKey);
    }

    public final int hashCode() {
        String str = this.requestId;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.inlineContent, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.displayTemplate), 31);
        BottomPicker bottomPicker = this.bottomPicker;
        int hashCode = (m + (bottomPicker == null ? 0 : bottomPicker.hashCode())) * 31;
        TapBehavior tapBehavior = this.tapBehavior;
        int hashCode2 = (hashCode + (tapBehavior == null ? 0 : tapBehavior.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.editable;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.sourcePlaceholderKey;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetPlaceholderKey;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("TemplateCard(requestId=", this.version, this.requestId, ", version=", ", displayTemplate=");
        m.append(this.displayTemplate);
        m.append(", inlineContent=");
        m.append(this.inlineContent);
        m.append(", bottomPicker=");
        m.append(this.bottomPicker);
        m.append(", tapBehavior=");
        m.append(this.tapBehavior);
        m.append(", description=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.description, ", editable=", this.editable, ", sourcePlaceholderKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sourcePlaceholderKey, ", targetPlaceholderKey=", this.targetPlaceholderKey, ")");
    }
}
