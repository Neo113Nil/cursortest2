package com.squareup.cash.moneybot.viewmodels.plugins;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SlottedCardViewModel {
    public final String animationKey;
    public final String label;
    public final SlotContentViewModel slotContent;
    public final String subtext;
    public final String text;

    public SlottedCardViewModel(String str, String str2, String str3, SlotContentViewModel slotContentViewModel, String str4) {
        this.animationKey = str;
        this.label = str2;
        this.text = str3;
        this.slotContent = slotContentViewModel;
        this.subtext = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlottedCardViewModel)) {
            return false;
        }
        SlottedCardViewModel slottedCardViewModel = (SlottedCardViewModel) obj;
        return Intrinsics.areEqual(this.animationKey, slottedCardViewModel.animationKey) && Intrinsics.areEqual(this.label, slottedCardViewModel.label) && Intrinsics.areEqual(this.text, slottedCardViewModel.text) && Intrinsics.areEqual(this.slotContent, slottedCardViewModel.slotContent) && Intrinsics.areEqual(this.subtext, slottedCardViewModel.subtext);
    }

    public final int hashCode() {
        String str = this.animationKey;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.label), 31, this.text);
        SlotContentViewModel slotContentViewModel = this.slotContent;
        return this.subtext.hashCode() + ((m + (slotContentViewModel != null ? slotContentViewModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SlottedCardViewModel(animationKey=", this.animationKey, ", label=", this.label, ", text=");
        m.append(this.text);
        m.append(", slotContent=");
        m.append(this.slotContent);
        m.append(", subtext=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.subtext, ")");
    }
}
