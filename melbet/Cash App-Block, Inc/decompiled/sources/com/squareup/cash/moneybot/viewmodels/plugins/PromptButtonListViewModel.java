package com.squareup.cash.moneybot.viewmodels.plugins;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromptButtonListViewModel {
    public final ArrayList buttons;

    public final class Button {
        public final String id;
        public final PromptButtonListViewEvent renderedEvent;
        public final PromptButtonListViewEvent.PromptTapped tapEvent;
        public final String text;

        public Button(String str, String str2, PromptButtonListViewEvent.PromptTapped promptTapped, PromptButtonListViewEvent.PromptRendered promptRendered) {
            this.id = str;
            this.text = str2;
            this.tapEvent = promptTapped;
            this.renderedEvent = promptRendered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.id.equals(button.id) && this.text.equals(button.text) && this.tapEvent.equals(button.tapEvent) && Intrinsics.areEqual(this.renderedEvent, button.renderedEvent);
        }

        public final int hashCode() {
            int hashCode = (this.tapEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text)) * 31;
            PromptButtonListViewEvent promptButtonListViewEvent = this.renderedEvent;
            return hashCode + (promptButtonListViewEvent == null ? 0 : promptButtonListViewEvent.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(id=", this.id, ", text=", this.text, ", tapEvent=");
            m.append(this.tapEvent);
            m.append(", renderedEvent=");
            m.append(this.renderedEvent);
            m.append(")");
            return m.toString();
        }
    }

    public PromptButtonListViewModel(ArrayList arrayList) {
        this.buttons = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromptButtonListViewModel) && this.buttons.equals(((PromptButtonListViewModel) obj).buttons);
    }

    public final int hashCode() {
        return this.buttons.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("PromptButtonListViewModel(buttons=", ")", this.buttons);
    }
}
