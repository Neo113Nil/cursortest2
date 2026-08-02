package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import app.cash.arcade.values.ButtonProminence;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public interface TapBehavior {

    public final class CardButtons implements TapBehavior {
        public final Button primaryButton;
        public final Button secondaryButton;

        public final class Button {
            public final TapBehavior$CardButtons$Button$Action$ClientRouteAction action;
            public final String hiddenTapMessage;
            public final Icon icon;
            public final ButtonProminence.Id prominence;
            public final String text;

            public Button(String str, ButtonProminence.Id id, Icon icon, TapBehavior$CardButtons$Button$Action$ClientRouteAction tapBehavior$CardButtons$Button$Action$ClientRouteAction, String str2) {
                id.getClass();
                this.text = str;
                this.prominence = id;
                this.icon = icon;
                this.action = tapBehavior$CardButtons$Button$Action$ClientRouteAction;
                this.hiddenTapMessage = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return this.text.equals(button.text) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.action, button.action) && Intrinsics.areEqual(this.hiddenTapMessage, button.hiddenTapMessage);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prominence.id, this.text.hashCode() * 31, 31);
                Icon icon = this.icon;
                int hashCode = (m + (icon == null ? 0 : icon.hashCode())) * 31;
                TapBehavior$CardButtons$Button$Action$ClientRouteAction tapBehavior$CardButtons$Button$Action$ClientRouteAction = this.action;
                int hashCode2 = (hashCode + (tapBehavior$CardButtons$Button$Action$ClientRouteAction == null ? 0 : tapBehavior$CardButtons$Button$Action$ClientRouteAction.hashCode())) * 31;
                String str = this.hiddenTapMessage;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(text=");
                sb.append(this.text);
                sb.append(", prominence=");
                sb.append(this.prominence);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", action=");
                sb.append(this.action);
                sb.append(", hiddenTapMessage=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hiddenTapMessage, ")");
            }
        }

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
        public final TapBehavior$TapAction$Action$ClientRouteAction action;
        public final CdfEvent cdfEvent;
        public final String hiddenTapMessage;

        public TapAction(TapBehavior$TapAction$Action$ClientRouteAction tapBehavior$TapAction$Action$ClientRouteAction, String str, CdfEvent cdfEvent) {
            this.action = tapBehavior$TapAction$Action$ClientRouteAction;
            this.hiddenTapMessage = str;
            this.cdfEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapAction)) {
                return false;
            }
            TapAction tapAction = (TapAction) obj;
            return this.action.equals(tapAction.action) && Intrinsics.areEqual(this.hiddenTapMessage, tapAction.hiddenTapMessage) && Intrinsics.areEqual(this.cdfEvent, tapAction.cdfEvent);
        }

        public final int hashCode() {
            int hashCode = this.action.clientRoute.hashCode() * 31;
            String str = this.hiddenTapMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            return hashCode2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        }

        public final String toString() {
            return "TapAction(action=" + this.action + ", hiddenTapMessage=" + this.hiddenTapMessage + ", cdfEvent=" + this.cdfEvent + ")";
        }
    }
}
