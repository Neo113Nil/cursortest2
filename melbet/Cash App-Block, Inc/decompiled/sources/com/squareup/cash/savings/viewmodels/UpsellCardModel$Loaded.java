package com.squareup.cash.savings.viewmodels;

import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes7.dex */
public final class UpsellCardModel$Loaded {
    public final String body;
    public final CardImage image;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Button {
        public final UpsellCardEvent.RouterClicked action;
        public final String text;

        public Button(String str, UpsellCardEvent.RouterClicked routerClicked) {
            str.getClass();
            this.text = str;
            this.action = routerClicked;
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

    public UpsellCardModel$Loaded(String str, String str2, CardImage cardImage, Button button, Button button2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.body = str2;
        this.image = cardImage;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpsellCardModel$Loaded)) {
            return false;
        }
        UpsellCardModel$Loaded upsellCardModel$Loaded = (UpsellCardModel$Loaded) obj;
        return Intrinsics.areEqual(this.title, upsellCardModel$Loaded.title) && Intrinsics.areEqual(this.body, upsellCardModel$Loaded.body) && this.image == upsellCardModel$Loaded.image && this.primaryButton.equals(upsellCardModel$Loaded.primaryButton) && Intrinsics.areEqual(this.secondaryButton, upsellCardModel$Loaded.secondaryButton);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        CardImage cardImage = this.image;
        int hashCode = (this.primaryButton.hashCode() + ((m + (cardImage == null ? 0 : cardImage.hashCode())) * 31)) * 31;
        Button button = this.secondaryButton;
        return hashCode + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", body=", this.body, ", image=");
        m.append(this.image);
        m.append(", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }
}
