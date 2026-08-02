package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.values.ButtonProminence;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TemplateCardViewModel {
    public final BottomPicker bottomPicker;
    public final String description;
    public final ArrayList displayLines;
    public final EditState editState;
    public final TapBehavior tapBehavior;
    public final String toolRequestErrorMessage;

    public final class BottomPicker {
        public final String accessibilityLabel;
        public final Icon icon;
        public final boolean isPlaceholder;
        public final String label;
        public final String placeholderKey;
        public final String subtitle;

        public BottomPicker(String str, String str2, String str3, String str4, Icon icon, boolean z) {
            str.getClass();
            str2.getClass();
            this.placeholderKey = str;
            this.label = str2;
            this.subtitle = str3;
            this.accessibilityLabel = str4;
            this.icon = icon;
            this.isPlaceholder = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomPicker)) {
                return false;
            }
            BottomPicker bottomPicker = (BottomPicker) obj;
            return Intrinsics.areEqual(this.placeholderKey, bottomPicker.placeholderKey) && Intrinsics.areEqual(this.label, bottomPicker.label) && Intrinsics.areEqual(this.subtitle, bottomPicker.subtitle) && Intrinsics.areEqual(this.accessibilityLabel, bottomPicker.accessibilityLabel) && Intrinsics.areEqual(this.icon, bottomPicker.icon) && this.isPlaceholder == bottomPicker.isPlaceholder;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholderKey.hashCode() * 31, 31, this.label);
            String str = this.subtitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accessibilityLabel;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Icon icon = this.icon;
            return Boolean.hashCode(this.isPlaceholder) + ((hashCode2 + (icon != null ? icon.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BottomPicker(placeholderKey=", this.placeholderKey, ", label=", this.label, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", accessibilityLabel=", this.accessibilityLabel, ", icon=");
            m.append(this.icon);
            m.append(", isPlaceholder=");
            m.append(this.isPlaceholder);
            m.append(")");
            return m.toString();
        }
    }

    public interface DisplayTextSegment {

        public final class Text implements DisplayTextSegment {
            public final boolean isBold;
            public final String text;

            public Text(String str, boolean z) {
                str.getClass();
                this.text = str;
                this.isBold = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return Intrinsics.areEqual(this.text, text.text) && this.isBold == text.isBold;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isBold) + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Text(text=", this.text, ", isBold=", ")", this.isBold);
            }
        }

        public final class Token implements DisplayTextSegment {
            public final Icon inlineContent;
            public final String placeholderKey;
            public final String text;

            public Token(String str, String str2, Icon icon) {
                str.getClass();
                this.placeholderKey = str;
                this.text = str2;
                this.inlineContent = icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Token)) {
                    return false;
                }
                Token token = (Token) obj;
                return Intrinsics.areEqual(this.placeholderKey, token.placeholderKey) && this.text.equals(token.text) && Intrinsics.areEqual(this.inlineContent, token.inlineContent);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.placeholderKey.hashCode() * 31, 31, this.text);
                Icon icon = this.inlineContent;
                return m + (icon == null ? 0 : icon.hashCode());
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Token(placeholderKey=", this.placeholderKey, ", text=", this.text, ", inlineContent=");
                m.append(this.inlineContent);
                m.append(")");
                return m.toString();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class EditState {
        public static final /* synthetic */ EditState[] $VALUES;
        public static final EditState Disabled;
        public static final EditState Editable;
        public static final EditState Processing;

        static {
            EditState editState = new EditState("Editable", 0);
            Editable = editState;
            EditState editState2 = new EditState("Processing", 1);
            Processing = editState2;
            EditState editState3 = new EditState("Disabled", 2);
            Disabled = editState3;
            $VALUES = new EditState[]{editState, editState2, editState3};
        }

        public static EditState valueOf(String str) {
            return (EditState) Enum.valueOf(EditState.class, str);
        }

        public static EditState[] values() {
            return (EditState[]) $VALUES.clone();
        }
    }

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
            public final String iconId;
            public final Float progress;

            public SavingsGoalIcon(Float f, String str) {
                this.iconId = str;
                this.progress = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavingsGoalIcon)) {
                    return false;
                }
                SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) obj;
                return this.iconId.equals(savingsGoalIcon.iconId) && Intrinsics.areEqual((Object) this.progress, (Object) savingsGoalIcon.progress);
            }

            public final int hashCode() {
                int hashCode = this.iconId.hashCode() * 31;
                Float f = this.progress;
                return hashCode + (f == null ? 0 : f.hashCode());
            }

            public final String toString() {
                return "SavingsGoalIcon(iconId=" + this.iconId + ", progress=" + this.progress + ")";
            }
        }

        public final class TransferOptionIcon implements Icon {
            public final TransferOptionPickerDisplayIcon icon;

            public TransferOptionIcon(TransferOptionPickerDisplayIcon transferOptionPickerDisplayIcon) {
                transferOptionPickerDisplayIcon.getClass();
                this.icon = transferOptionPickerDisplayIcon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TransferOptionIcon) && Intrinsics.areEqual(this.icon, ((TransferOptionIcon) obj).icon);
            }

            public final int hashCode() {
                return this.icon.hashCode();
            }

            public final String toString() {
                return "TransferOptionIcon(icon=" + this.icon + ")";
            }
        }
    }

    public interface TapBehavior {

        public final class ButtonGroup implements TapBehavior {
            public final Button primaryButton;
            public final Button secondaryButton;

            public final class Button {
                public final TemplateCardViewEvent action;
                public final boolean isEnabled;
                public final boolean isLoading;
                public final ButtonProminence.Id prominence;
                public final String text;

                public Button(String str, ButtonProminence.Id id, TemplateCardViewEvent templateCardViewEvent, boolean z, boolean z2) {
                    str.getClass();
                    id.getClass();
                    this.text = str;
                    this.prominence = id;
                    this.action = templateCardViewEvent;
                    this.isLoading = z;
                    this.isEnabled = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.action, button.action) && this.isLoading == button.isLoading && this.isEnabled == button.isEnabled;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31);
                    TemplateCardViewEvent templateCardViewEvent = this.action;
                    return Boolean.hashCode(this.isEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (templateCardViewEvent == null ? 0 : templateCardViewEvent.hashCode())) * 31, 31, this.isLoading);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(text=");
                    sb.append(this.text);
                    sb.append(", prominence=");
                    sb.append(this.prominence);
                    sb.append(", action=");
                    sb.append(this.action);
                    sb.append(", isLoading=");
                    sb.append(this.isLoading);
                    sb.append(", isEnabled=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isEnabled, ")");
                }
            }

            public ButtonGroup(Button button, Button button2) {
                this.primaryButton = button;
                this.secondaryButton = button2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonGroup)) {
                    return false;
                }
                ButtonGroup buttonGroup = (ButtonGroup) obj;
                return this.primaryButton.equals(buttonGroup.primaryButton) && Intrinsics.areEqual(this.secondaryButton, buttonGroup.secondaryButton);
            }

            public final int hashCode() {
                int hashCode = this.primaryButton.hashCode() * 31;
                Button button = this.secondaryButton;
                return hashCode + (button == null ? 0 : button.hashCode());
            }

            public final String toString() {
                return "ButtonGroup(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
            }
        }

        public final class TapAction implements TapBehavior {
            public final TemplateCardViewEvent action;

            public TapAction(TemplateCardViewEvent templateCardViewEvent) {
                this.action = templateCardViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TapAction) && Intrinsics.areEqual(this.action, ((TapAction) obj).action);
            }

            public final int hashCode() {
                TemplateCardViewEvent templateCardViewEvent = this.action;
                if (templateCardViewEvent == null) {
                    return 0;
                }
                return templateCardViewEvent.hashCode();
            }

            public final String toString() {
                return "TapAction(action=" + this.action + ")";
            }
        }
    }

    public TemplateCardViewModel(ArrayList arrayList, String str, BottomPicker bottomPicker, EditState editState, TapBehavior tapBehavior, String str2) {
        this.displayLines = arrayList;
        this.description = str;
        this.bottomPicker = bottomPicker;
        this.editState = editState;
        this.tapBehavior = tapBehavior;
        this.toolRequestErrorMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCardViewModel)) {
            return false;
        }
        TemplateCardViewModel templateCardViewModel = (TemplateCardViewModel) obj;
        return this.displayLines.equals(templateCardViewModel.displayLines) && Intrinsics.areEqual(this.description, templateCardViewModel.description) && Intrinsics.areEqual(this.bottomPicker, templateCardViewModel.bottomPicker) && this.editState == templateCardViewModel.editState && Intrinsics.areEqual(this.tapBehavior, templateCardViewModel.tapBehavior) && Intrinsics.areEqual(this.toolRequestErrorMessage, templateCardViewModel.toolRequestErrorMessage);
    }

    public final int hashCode() {
        int hashCode = this.displayLines.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BottomPicker bottomPicker = this.bottomPicker;
        int hashCode3 = (this.editState.hashCode() + ((hashCode2 + (bottomPicker == null ? 0 : bottomPicker.hashCode())) * 31)) * 31;
        TapBehavior tapBehavior = this.tapBehavior;
        int hashCode4 = (hashCode3 + (tapBehavior == null ? 0 : tapBehavior.hashCode())) * 31;
        String str2 = this.toolRequestErrorMessage;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TemplateCardViewModel(displayLines=" + this.displayLines + ", description=" + this.description + ", bottomPicker=" + this.bottomPicker + ", editState=" + this.editState + ", tapBehavior=" + this.tapBehavior + ", toolRequestErrorMessage=" + this.toolRequestErrorMessage + ")";
    }
}
