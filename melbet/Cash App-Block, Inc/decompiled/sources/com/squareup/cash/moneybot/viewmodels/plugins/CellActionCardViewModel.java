package com.squareup.cash.moneybot.viewmodels.plugins;

import app.cash.arcade.values.ButtonProminence;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final class CellActionCardViewModel {
    public final ButtonGroup buttonGroup;
    public final CellDefault cell;

    public final class ButtonGroup {
        public final Button primaryButton;
        public final Button secondaryButton;

        public final class Button {
            public final CellActionCardViewEvent action;
            public final ButtonProminence.Id prominence;
            public final String text;

            public Button(String str, ButtonProminence.Id id, CellActionCardViewEvent cellActionCardViewEvent) {
                id.getClass();
                this.text = str;
                this.prominence = id;
                this.action = cellActionCardViewEvent;
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
                CellActionCardViewEvent cellActionCardViewEvent = this.action;
                return m + (cellActionCardViewEvent == null ? 0 : cellActionCardViewEvent.hashCode());
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

    public CellActionCardViewModel(CellDefault cellDefault, ButtonGroup buttonGroup) {
        cellDefault.getClass();
        this.cell = cellDefault;
        this.buttonGroup = buttonGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellActionCardViewModel)) {
            return false;
        }
        CellActionCardViewModel cellActionCardViewModel = (CellActionCardViewModel) obj;
        return Intrinsics.areEqual(this.cell, cellActionCardViewModel.cell) && Intrinsics.areEqual(this.buttonGroup, cellActionCardViewModel.buttonGroup);
    }

    public final int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        ButtonGroup buttonGroup = this.buttonGroup;
        return hashCode + (buttonGroup == null ? 0 : buttonGroup.hashCode());
    }

    public final String toString() {
        return "CellActionCardViewModel(cell=" + this.cell + ", buttonGroup=" + this.buttonGroup + ")";
    }
}
