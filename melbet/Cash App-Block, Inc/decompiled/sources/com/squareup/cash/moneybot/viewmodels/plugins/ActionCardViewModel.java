package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.values.ButtonProminence;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActionCardViewModel {
    public final Accessory accessory;
    public final ActionCardViewEvent action;
    public final ButtonGroup buttonGroup;
    public final String description;
    public final Icon icon;
    public final ActionCardViewEvent iconTapAction;
    public final String title;

    public final class Accessory {
        public final String accessibilityText;
        public final com.squareup.protos.cash.ui.Icon icon;

        public Accessory(com.squareup.protos.cash.ui.Icon icon, String str) {
            this.icon = icon;
            this.accessibilityText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Accessory)) {
                return false;
            }
            Accessory accessory = (Accessory) obj;
            return this.icon.equals(accessory.icon) && this.accessibilityText.equals(accessory.accessibilityText);
        }

        public final int hashCode() {
            return this.accessibilityText.hashCode() + (this.icon.hashCode() * 31);
        }

        public final String toString() {
            return "Accessory(icon=" + this.icon + ", accessibilityText=" + this.accessibilityText + ")";
        }
    }

    public final class ButtonGroup {
        public final Button primaryButton;
        public final Button secondaryButton;

        public final class Button {
            public final ActionCardViewEvent action;
            public final ButtonProminence.Id prominence;
            public final String text;

            public Button(String str, ButtonProminence.Id id, ActionCardViewEvent actionCardViewEvent) {
                id.getClass();
                this.text = str;
                this.prominence = id;
                this.action = actionCardViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.text.equals(button.text) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.action, button.action);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31);
                ActionCardViewEvent actionCardViewEvent = this.action;
                return m + (actionCardViewEvent == null ? 0 : actionCardViewEvent.hashCode());
            }

            public final String toString() {
                return "Button(text=" + this.text + ", prominence=" + this.prominence + ", action=" + this.action + ")";
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

        public final class EmojiIcon implements Icon {
            public final String accessibilityText;
            public final String iconId;

            public EmojiIcon(String str, String str2) {
                this.iconId = str;
                this.accessibilityText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmojiIcon)) {
                    return false;
                }
                EmojiIcon emojiIcon = (EmojiIcon) obj;
                return this.iconId.equals(emojiIcon.iconId) && Intrinsics.areEqual(this.accessibilityText, emojiIcon.accessibilityText);
            }

            public final int hashCode() {
                int hashCode = this.iconId.hashCode() * 31;
                String str = this.accessibilityText;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("EmojiIcon(iconId=", this.iconId, ", accessibilityText=", this.accessibilityText, ")");
            }
        }
    }

    public ActionCardViewModel(Icon icon, ActionCardViewEvent.LaunchClientRoute launchClientRoute, String str, String str2, Accessory accessory, ActionCardViewEvent.LaunchClientRoute launchClientRoute2, ButtonGroup buttonGroup) {
        this.icon = icon;
        this.iconTapAction = launchClientRoute;
        this.title = str;
        this.description = str2;
        this.accessory = accessory;
        this.action = launchClientRoute2;
        this.buttonGroup = buttonGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionCardViewModel)) {
            return false;
        }
        ActionCardViewModel actionCardViewModel = (ActionCardViewModel) obj;
        return Intrinsics.areEqual(this.icon, actionCardViewModel.icon) && Intrinsics.areEqual(this.iconTapAction, actionCardViewModel.iconTapAction) && Intrinsics.areEqual(this.title, actionCardViewModel.title) && Intrinsics.areEqual(this.description, actionCardViewModel.description) && Intrinsics.areEqual(this.accessory, actionCardViewModel.accessory) && Intrinsics.areEqual(this.action, actionCardViewModel.action) && Intrinsics.areEqual(this.buttonGroup, actionCardViewModel.buttonGroup);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ActionCardViewEvent actionCardViewEvent = this.iconTapAction;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (actionCardViewEvent == null ? 0 : actionCardViewEvent.hashCode())) * 31, 31, this.title), 31, this.description);
        Accessory accessory = this.accessory;
        int hashCode2 = (m + (accessory == null ? 0 : accessory.hashCode())) * 31;
        ActionCardViewEvent actionCardViewEvent2 = this.action;
        int hashCode3 = (hashCode2 + (actionCardViewEvent2 == null ? 0 : actionCardViewEvent2.hashCode())) * 31;
        ButtonGroup buttonGroup = this.buttonGroup;
        return hashCode3 + (buttonGroup != null ? buttonGroup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionCardViewModel(icon=");
        sb.append(this.icon);
        sb.append(", iconTapAction=");
        sb.append(this.iconTapAction);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", description=", this.description, ", accessory=");
        sb.append(this.accessory);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", buttonGroup=");
        sb.append(this.buttonGroup);
        sb.append(")");
        return sb.toString();
    }
}
