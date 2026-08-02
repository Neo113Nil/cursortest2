package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TapBehavior;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActionCard {
    public final Accessory accessory;
    public final TapBehavior behavior;
    public final String description;
    public final TapBehavior.TapAction headerTapAction;
    public final Icon icon;
    public final String requestId;
    public final String title;
    public final int version;

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

    public ActionCard(String str, int i, Icon icon, String str2, String str3, Accessory accessory, TapBehavior tapBehavior, TapBehavior.TapAction tapAction) {
        this.requestId = str;
        this.version = i;
        this.icon = icon;
        this.title = str2;
        this.description = str3;
        this.accessory = accessory;
        this.behavior = tapBehavior;
        this.headerTapAction = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionCard)) {
            return false;
        }
        ActionCard actionCard = (ActionCard) obj;
        return Intrinsics.areEqual(this.requestId, actionCard.requestId) && this.version == actionCard.version && Intrinsics.areEqual(this.icon, actionCard.icon) && this.title.equals(actionCard.title) && this.description.equals(actionCard.description) && Intrinsics.areEqual(this.accessory, actionCard.accessory) && Intrinsics.areEqual(this.behavior, actionCard.behavior) && Intrinsics.areEqual(this.headerTapAction, actionCard.headerTapAction);
    }

    public final int hashCode() {
        String str = this.requestId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31);
        Icon icon = this.icon;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.title), 31, this.description);
        Accessory accessory = this.accessory;
        int hashCode = (m2 + (accessory == null ? 0 : accessory.hashCode())) * 31;
        TapBehavior tapBehavior = this.behavior;
        int hashCode2 = (hashCode + (tapBehavior == null ? 0 : tapBehavior.hashCode())) * 31;
        TapBehavior.TapAction tapAction = this.headerTapAction;
        return hashCode2 + (tapAction != null ? tapAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("ActionCard(requestId=", this.version, this.requestId, ", version=", ", icon=");
        m.append(this.icon);
        m.append(", title=");
        m.append(this.title);
        m.append(", description=");
        m.append(this.description);
        m.append(", accessory=");
        m.append(this.accessory);
        m.append(", behavior=");
        m.append(this.behavior);
        m.append(", headerTapAction=");
        m.append(this.headerTapAction);
        m.append(")");
        return m.toString();
    }
}
